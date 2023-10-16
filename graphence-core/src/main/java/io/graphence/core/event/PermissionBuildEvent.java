package io.graphence.core.event;

import com.google.auto.service.AutoService;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.inputObjectType.PermissionInput;
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

    private Stream<PermissionInput> buildPermissionStream() {
        return manager.getObjects()
                .flatMap(objectTypeDefinitionContext ->
                        objectTypeDefinitionContext.fieldsDefinition().fieldDefinition().stream()
                                .flatMap(fieldDefinitionContext -> {
                                            LocalDateTime now = LocalDateTime.now();
                                            if (manager.isOperationType(objectTypeDefinitionContext)) {
                                                if (manager.isInvokeField(fieldDefinitionContext)) {
                                                    if (manager.isMutationOperationType(objectTypeDefinitionContext.name().getText())) {
                                                        PermissionInput writePermission = new PermissionInput();
                                                        writePermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + WRITE.name());
                                                        writePermission.setType(objectTypeDefinitionContext.name().getText());
                                                        writePermission.setField(fieldDefinitionContext.name().getText());
                                                        if (fieldDefinitionContext.description() != null) {
                                                            writePermission.setDescription(fieldDefinitionContext.description().getText());
                                                        }
                                                        writePermission.setPermissionType(WRITE);
                                                        writePermission.setCreateTime(now);
                                                        return Stream.of(writePermission);
                                                    } else {
                                                        PermissionInput readPermission = new PermissionInput();
                                                        readPermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                        readPermission.setType(objectTypeDefinitionContext.name().getText());
                                                        readPermission.setField(fieldDefinitionContext.name().getText());
                                                        if (fieldDefinitionContext.description() != null) {
                                                            readPermission.setDescription(fieldDefinitionContext.description().getText());
                                                        }
                                                        readPermission.setPermissionType(READ);
                                                        readPermission.setCreateTime(now);
                                                        return Stream.of(readPermission);
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
                                                    PermissionInput readPermission = new PermissionInput();
                                                    readPermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                    readPermission.setType(objectTypeDefinitionContext.name().getText());
                                                    readPermission.setField(fieldDefinitionContext.name().getText());
                                                    if (fieldDefinitionContext.description() != null) {
                                                        readPermission.setDescription(fieldDefinitionContext.description().getText());
                                                    }
                                                    readPermission.setPermissionType(READ);
                                                    readPermission.setCreateTime(now);

                                                    PermissionInput writePermission = new PermissionInput();
                                                    writePermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + WRITE.name());
                                                    writePermission.setType(objectTypeDefinitionContext.name().getText());
                                                    writePermission.setField(fieldDefinitionContext.name().getText());
                                                    if (fieldDefinitionContext.description() != null) {
                                                        writePermission.setDescription(fieldDefinitionContext.description().getText());
                                                    }
                                                    writePermission.setPermissionType(WRITE);
                                                    writePermission.setCreateTime(now);
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
