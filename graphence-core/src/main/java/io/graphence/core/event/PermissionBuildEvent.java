package io.graphence.core.event;

import com.google.auto.service.AutoService;
import io.graphence.core.config.SecurityConfig;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.operation.Field;
import io.graphoenix.core.operation.Operation;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.OperationHandler;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.HashMap;
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
                                .addArgument(LIST_INPUT_NAME, buildPermissionStream().collect(Collectors.toList()))
                                .addField(new Field("name"))
                );
        return operationHandler.mutation(DOCUMENT_UTIL.graphqlToOperation(operation.toString())).then();
    }

    private Stream<Map<String, Object>> buildPermissionStream() {
        return manager.getObjects()
                .flatMap(objectTypeDefinitionContext ->
                        objectTypeDefinitionContext.fieldsDefinition().fieldDefinition().stream()
                                .flatMap(fieldDefinitionContext -> {
                                            if (manager.isOperationType(objectTypeDefinitionContext)) {
                                                if (manager.isInvokeField(fieldDefinitionContext)) {
                                                    Map<String, Object> permission = new HashMap<>() {{
                                                        put("type", objectTypeDefinitionContext.name().getText());
                                                        put("field", fieldDefinitionContext.name().getText());
                                                        put("createTime", LocalDateTime.now());
                                                    }};
                                                    if (manager.isMutationOperationType(objectTypeDefinitionContext.name().getText())) {
                                                        permission.put("name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + WRITE.name());
                                                        permission.put("permissionType", WRITE);
                                                    } else {
                                                        permission.put("name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                        permission.put("permissionType", READ);
                                                    }
                                                    if (fieldDefinitionContext.description() != null) {
                                                        permission.put("description", fieldDefinitionContext.description().getText());
                                                    }
                                                    return Stream.of(permission);
                                                } else {
                                                    return Stream.empty();
                                                }
                                            } else {
                                                if (manager.isNotContainerType(objectTypeDefinitionContext) &&
                                                        manager.isNotFunctionField(fieldDefinitionContext) &&
                                                        !fieldDefinitionContext.name().getText().endsWith(AGGREGATE_SUFFIX) &&
                                                        !fieldDefinitionContext.name().getText().endsWith(CONNECTION_SUFFIX)
                                                ) {
                                                    Map<String, Object> writePermission = new HashMap<>() {{
                                                        put("name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + WRITE.name());
                                                        put("type", objectTypeDefinitionContext.name().getText());
                                                        put("field", fieldDefinitionContext.name().getText());
                                                        put("permissionType", WRITE);
                                                        put("createTime", LocalDateTime.now());
                                                    }};

                                                    Map<String, Object> readPermission = new HashMap<>() {{
                                                        put("name", objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                        put("type", objectTypeDefinitionContext.name().getText());
                                                        put("field", fieldDefinitionContext.name().getText());
                                                        put("permissionType", READ);
                                                        put("createTime", LocalDateTime.now());
                                                    }};

                                                    if (fieldDefinitionContext.description() != null) {
                                                        writePermission.put("description", fieldDefinitionContext.description().getText() + " " + WRITE);
                                                        readPermission.put("description", fieldDefinitionContext.description().getText() + " " + READ);
                                                    }
                                                    return Stream.of(readPermission, writePermission);
                                                } else {
                                                    return Stream.empty();
                                                }
                                            }
                                        }
                                )
                );
    }
}
