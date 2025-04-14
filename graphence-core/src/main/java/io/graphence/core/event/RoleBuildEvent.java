package io.graphence.core.event;

import io.graphence.core.config.SecurityConfig;
import io.graphoenix.core.handler.DocumentManager;
import io.graphoenix.core.handler.before.UniqueMergeHandler;
import io.graphoenix.spi.graphql.common.Directive;
import io.graphoenix.spi.graphql.common.ObjectValueWithVariable;
import io.graphoenix.spi.graphql.operation.Field;
import io.graphoenix.spi.graphql.operation.Operation;
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
@Priority(RoleBuildEvent.ROLE_BUILD_SCOPE_EVENT_PRIORITY)
public class RoleBuildEvent implements ScopeEvent {

    public static final int ROLE_BUILD_SCOPE_EVENT_PRIORITY = DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY + 130;

    private final DocumentManager documentManager;
    private final MutationHandler mutationHandler;
    private final UniqueMergeHandler uniqueMergeHandler;
    private final SecurityConfig securityConfig;

    @Inject
    public RoleBuildEvent(DocumentManager documentManager, MutationHandler mutationHandler, UniqueMergeHandler uniqueMergeHandler, SecurityConfig securityConfig) {
        this.documentManager = documentManager;
        this.mutationHandler = mutationHandler;
        this.uniqueMergeHandler = uniqueMergeHandler;
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
                        new Field("roleList")
                                .addArgument(INPUT_VALUE_LIST_NAME, buildRoleList())
                                .addSelection(new Field("id"))
                                .addDirective(new Directive("uniqueMerge"))
                );

        return uniqueMergeHandler.handle(operation, null)
                .flatMap(mutationHandler::mutation)
                .then();

    }

    private List<ObjectValueWithVariable> buildRoleList() {
        return Stream
                .concat(
                        documentManager.getDocument().getObjectTypes()
                                .filter(objectType -> !documentManager.isOperationType(objectType))
                                .filter(objectType -> !objectType.isContainer())
                                .flatMap(objectType ->
                                        Stream
                                                .of(
                                                        ObjectValueWithVariable.of(
                                                                "name", objectType.getName() + SPACER + "*" + SPACER + READ.name(),
                                                                "permissions", objectType.getFields().stream()
                                                                        .map(fieldDefinition ->
                                                                                ObjectValueWithVariable.of(
                                                                                        "where", ObjectValueWithVariable.of(
                                                                                                "name", ObjectValueWithVariable.of(
                                                                                                        "val", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + READ.name())
                                                                                        )
                                                                                )
                                                                        )
                                                                        .collect(Collectors.toList()),
                                                                "createTime", LocalDateTime.now()
                                                        ),
                                                        ObjectValueWithVariable.of(
                                                                "name", objectType.getName() + SPACER + "*" + SPACER + WRITE.name(),
                                                                "permissions", objectType.getFields().stream()
                                                                        .map(fieldDefinition ->
                                                                                ObjectValueWithVariable.of(
                                                                                        "where", ObjectValueWithVariable.of(
                                                                                                "name", ObjectValueWithVariable.of(
                                                                                                        "val", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + WRITE.name())
                                                                                        )
                                                                                )
                                                                        )
                                                                        .collect(Collectors.toList()),
                                                                "createTime", LocalDateTime.now()
                                                        ),
                                                        ObjectValueWithVariable.of(
                                                                "name", objectType.getName() + SPACER + "*" + SPACER + "*",
                                                                "composites", Stream
                                                                        .of(
                                                                                ObjectValueWithVariable.of(
                                                                                        "where", ObjectValueWithVariable.of(
                                                                                                "name", ObjectValueWithVariable.of(
                                                                                                        "val", objectType.getName() + SPACER + "*" + SPACER + READ.name())
                                                                                        )
                                                                                ),
                                                                                ObjectValueWithVariable.of(
                                                                                        "where", ObjectValueWithVariable.of(
                                                                                                "name", ObjectValueWithVariable.of(
                                                                                                        "val", objectType.getName() + SPACER + "*" + SPACER + WRITE.name())
                                                                                        )
                                                                                )
                                                                        )
                                                                        .collect(Collectors.toList()),
                                                                "createTime", LocalDateTime.now()
                                                        )
                                                )
                                ),
                        Stream
                                .concat(
                                        documentManager.getDocument().getQueryOperationType().stream()
                                                .map(objectType ->
                                                        ObjectValueWithVariable.of(
                                                                "name", objectType.getName() + SPACER + "*" + SPACER + READ.name(),
                                                                "permissions", objectType.getFields().stream()
                                                                        .map(fieldDefinition ->
                                                                                ObjectValueWithVariable.of(
                                                                                        "where", ObjectValueWithVariable.of(
                                                                                                "name", ObjectValueWithVariable.of(
                                                                                                        "val", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + READ.name())
                                                                                        )
                                                                                )
                                                                        )
                                                                        .collect(Collectors.toList()),
                                                                "createTime", LocalDateTime.now()
                                                        )
                                                ),
                                        documentManager.getDocument().getMutationOperationType().stream()
                                                .map(objectType ->
                                                        ObjectValueWithVariable.of(
                                                                "name", objectType.getName() + SPACER + "*" + SPACER + WRITE.name(),
                                                                "permissions", objectType.getFields().stream()
                                                                        .map(fieldDefinition ->
                                                                                ObjectValueWithVariable.of(
                                                                                        "where", ObjectValueWithVariable.of(
                                                                                                "name", ObjectValueWithVariable.of(
                                                                                                        "val", objectType.getName() + SPACER + fieldDefinition.getName() + SPACER + WRITE.name())
                                                                                        )
                                                                                )
                                                                        )
                                                                        .collect(Collectors.toList()),
                                                                "createTime", LocalDateTime.now()
                                                        )
                                                )
                                )
                )
                .collect(Collectors.toList());
    }
}
