package io.graphence.core.event;

import io.graphence.core.config.SecurityConfig;
import io.graphoenix.core.handler.DocumentManager;
import io.graphoenix.spi.graphql.common.ObjectValueWithVariable;
import io.graphoenix.spi.graphql.operation.Field;
import io.graphoenix.spi.graphql.operation.Operation;
import io.graphoenix.spi.graphql.type.EnumType;
import io.graphoenix.spi.graphql.type.EnumValueDefinition;
import io.graphoenix.spi.handler.MutationHandler;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.dto.enumType.PermissionType.READ;
import static io.graphence.core.dto.enumType.PermissionType.WRITE;
import static io.graphoenix.core.event.DocumentInitializedEvent.DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY;
import static io.graphoenix.spi.constant.Hammurabi.INPUT_VALUE_LIST_NAME;
import static io.graphoenix.spi.constant.Hammurabi.OPERATION_MUTATION_NAME;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(PermissionBuildEvent.PERMISSION_BUILD_SCOPE_EVENT_PRIORITY)
public class PermissionBuildEvent implements ScopeEvent {

    public static final int PERMISSION_BUILD_SCOPE_EVENT_PRIORITY = DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY + 120;

    private final DocumentManager documentManager;
    private final MutationHandler mutationHandler;
    private final SecurityConfig securityConfig;

    @Inject
    public PermissionBuildEvent(DocumentManager documentManager, MutationHandler mutationHandler, SecurityConfig securityConfig) {
        this.documentManager = documentManager;
        this.mutationHandler = mutationHandler;
        this.securityConfig = securityConfig;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (!securityConfig.getBuildPermission()) {
            return Mono.empty();
        }
        Operation operation = new Operation()
                .setOperationType(OPERATION_MUTATION_NAME)
                .addSelection(
                        new Field("permissionList")
                                .addArgument(INPUT_VALUE_LIST_NAME, buildPermissionList())
                                .addSelection(new Field("name"))
                );
        return mutationHandler.mutation(operation).then();
    }

    private List<ObjectValueWithVariable> buildPermissionList() {
        EnumType permissionType = documentManager.getDocument().getEnumTypeOrError("PermissionType");
        EnumValueDefinition read = permissionType.getEnumValue("READ");
        EnumValueDefinition write = permissionType.getEnumValue("WRITE");

        return documentManager.getDocument().getObjectTypes()
                .flatMap(objectType ->
                        objectType.getFields().stream()
                                .flatMap(fieldDefinition -> {
                                            if (documentManager.isOperationType(objectType)) {
                                                if (fieldDefinition.isInvokeField() && !fieldDefinition.isPermitAll() && !fieldDefinition.isDenyAll()) {
                                                    return Stream.of(
                                                            ObjectValueWithVariable.of(
                                                                    "name", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + (documentManager.isMutationOperationType(objectType) ? WRITE.name() : READ.name()),
                                                                    "type", objectType.getName(),
                                                                    "field", fieldDefinition.getName(),
                                                                    "permissionType", documentManager.isMutationOperationType(objectType) ? WRITE : READ,
                                                                    "description",
                                                                    Optional.ofNullable(fieldDefinition.getDescription()).orElseGet(fieldDefinition::getName) +
                                                                            (documentManager.isMutationOperationType(objectType) ?
                                                                                    Optional.ofNullable(read.getDescription()).orElseGet(read::getName) :
                                                                                    Optional.ofNullable(write.getDescription()).orElseGet(write::getName)),
                                                                    "createTime", LocalDateTime.now()
                                                            )
                                                    );
                                                } else {
                                                    return Stream.empty();
                                                }
                                            } else {
                                                if (!objectType.isContainer() &&
                                                        !objectType.isPermitAll() &&
                                                        !objectType.isDenyAll() &&
                                                        !fieldDefinition.isFunctionField() &&
                                                        !fieldDefinition.isAggregateField() &&
                                                        !fieldDefinition.isConnectionField()
                                                ) {
                                                    return Stream.of(
                                                            ObjectValueWithVariable.of(
                                                                    "name", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + WRITE.name(),
                                                                    "type", objectType.getName(),
                                                                    "field", fieldDefinition.getName(),
                                                                    "permissionType", WRITE,
                                                                    "description",
                                                                    Optional.ofNullable(fieldDefinition.getDescription()).orElseGet(fieldDefinition::getName) +
                                                                            Optional.ofNullable(write.getDescription()).orElseGet(write::getName),
                                                                    "createTime", LocalDateTime.now()
                                                            ),
                                                            ObjectValueWithVariable.of(
                                                                    "name", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + READ.name(),
                                                                    "type", objectType.getName(),
                                                                    "field", fieldDefinition.getName(),
                                                                    "permissionType", READ,
                                                                    "description",
                                                                    Optional.ofNullable(fieldDefinition.getDescription()).orElseGet(fieldDefinition::getName) +
                                                                            Optional.ofNullable(read.getDescription()).orElseGet(read::getName),
                                                                    "createTime", LocalDateTime.now()
                                                            )
                                                    );
                                                } else {
                                                    return Stream.empty();
                                                }
                                            }
                                        }
                                )
                )
                .collect(Collectors.toList());
    }
}
