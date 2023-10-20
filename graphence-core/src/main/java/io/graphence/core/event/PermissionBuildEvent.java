package io.graphence.core.event;

import com.google.auto.service.AutoService;
import io.graphence.core.config.SecurityConfig;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.operation.Field;
import io.graphoenix.core.operation.ObjectValueWithVariable;
import io.graphoenix.core.operation.Operation;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.OperationHandler;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.dto.enumType.PermissionType.READ;
import static io.graphence.core.dto.enumType.PermissionType.WRITE;
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.spi.constant.Hammurabi.*;

@Initialized(ApplicationScoped.class)
@Priority(3)
@AutoService(ScopeEvent.class)
public class PermissionBuildEvent implements ScopeEvent {

    private final IGraphQLDocumentManager manager;
    private final OperationHandler operationHandler;
    private final SecurityConfig securityConfig;

    public PermissionBuildEvent() {
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
        this.operationHandler = BeanContext.get(OperationHandler.class);
        this.securityConfig = BeanContext.get(SecurityConfig.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (!securityConfig.getBuildPermission()) {
            return Mono.empty();
        }
        Operation operation = new Operation()
                .setOperationType("mutation")
                .addField(
                        new Field("permissionList")
                                .addArgument(LIST_INPUT_NAME, buildPermissionList())
                                .addField(new Field("name"))
                );
        return operationHandler.mutation(DOCUMENT_UTIL.graphqlToOperation(operation.toString())).then();
    }

    private List<ObjectValueWithVariable> buildPermissionList() {
        return manager.getObjects()
                .flatMap(objectTypeDefinitionContext ->
                        objectTypeDefinitionContext.fieldsDefinition().fieldDefinition().stream()
                                .flatMap(fieldDefinitionContext -> {
                                            if (manager.isOperationType(objectTypeDefinitionContext)) {
                                                if (manager.isInvokeField(fieldDefinitionContext)) {
                                                    if (fieldDefinitionContext.description() != null) {
                                                        return Stream.of(
                                                                ObjectValueWithVariable.of(
                                                                        "name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + (manager.isMutationOperationType(objectTypeDefinitionContext.name().getText()) ? WRITE.name() : READ.name()),
                                                                        "type", objectTypeDefinitionContext.name().getText(),
                                                                        "field", fieldDefinitionContext.name().getText(),
                                                                        "permissionType", manager.isMutationOperationType(objectTypeDefinitionContext.name().getText()) ? WRITE : READ,
                                                                        "description", fieldDefinitionContext.description().getText(),
                                                                        "createTime", LocalDateTime.now()
                                                                )
                                                        );
                                                    } else {
                                                        return Stream.of(
                                                                ObjectValueWithVariable.of(
                                                                        "name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + (manager.isMutationOperationType(objectTypeDefinitionContext.name().getText()) ? WRITE.name() : READ.name()),
                                                                        "type", objectTypeDefinitionContext.name().getText(),
                                                                        "field", fieldDefinitionContext.name().getText(),
                                                                        "permissionType", manager.isMutationOperationType(objectTypeDefinitionContext.name().getText()) ? WRITE : READ,
                                                                        "createTime", LocalDateTime.now()
                                                                )
                                                        );
                                                    }
                                                } else {
                                                    return Stream.empty();
                                                }
                                            } else {
                                                if (manager.isNotContainerType(objectTypeDefinitionContext) &&
                                                        manager.isNotFunctionField(fieldDefinitionContext) &&
                                                        !fieldDefinitionContext.name().getText().endsWith(AGGREGATE_SUFFIX) &&
                                                        !fieldDefinitionContext.name().getText().endsWith(CONNECTION_SUFFIX)
                                                ) {
                                                    if (fieldDefinitionContext.description() != null) {
                                                        return Stream.of(
                                                                ObjectValueWithVariable.of(
                                                                        "name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + WRITE.name(),
                                                                        "type", objectTypeDefinitionContext.name().getText(),
                                                                        "field", fieldDefinitionContext.name().getText(),
                                                                        "permissionType", WRITE,
                                                                        "description", fieldDefinitionContext.description().getText() + " " + WRITE,
                                                                        "createTime", LocalDateTime.now()
                                                                ),
                                                                ObjectValueWithVariable.of(
                                                                        "name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name(),
                                                                        "type", objectTypeDefinitionContext.name().getText(),
                                                                        "field", fieldDefinitionContext.name().getText(),
                                                                        "permissionType", READ,
                                                                        "description", fieldDefinitionContext.description().getText() + " " + READ,
                                                                        "createTime", LocalDateTime.now()
                                                                )
                                                        );
                                                    } else {
                                                        return Stream.of(
                                                                ObjectValueWithVariable.of(
                                                                        "name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + WRITE.name(),
                                                                        "type", objectTypeDefinitionContext.name().getText(),
                                                                        "field", fieldDefinitionContext.name().getText(),
                                                                        "permissionType", WRITE,
                                                                        "createTime", LocalDateTime.now()
                                                                ),
                                                                ObjectValueWithVariable.of(
                                                                        "name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name(),
                                                                        "type", objectTypeDefinitionContext.name().getText(),
                                                                        "field", fieldDefinitionContext.name().getText(),
                                                                        "permissionType", READ,
                                                                        "createTime", LocalDateTime.now()
                                                                )
                                                        );
                                                    }
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
