package io.graphence.core.event;

import com.google.auto.service.AutoService;
import io.graphence.core.dto.objectType.Permission;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;

import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.dto.enumType.PermissionType.READ;
import static io.graphence.core.dto.enumType.PermissionType.WRITE;

@Initialized(ApplicationScoped.class)
@Priority(1)
@AutoService(ScopeEvent.class)
public class PermissionBuildEvent implements ScopeEvent {

    private final IGraphQLDocumentManager manager;

    public PermissionBuildEvent() {
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
    }

    private Stream<Permission> buildPermissionStream() {
        return manager.getObjects()
                .flatMap(objectTypeDefinitionContext ->
                        objectTypeDefinitionContext.fieldsDefinition().fieldDefinition().stream()
                                .flatMap(fieldDefinitionContext -> {
                                            if (manager.isOperationType(objectTypeDefinitionContext)) {
                                                if (manager.isInvokeField(fieldDefinitionContext)) {
                                                    if (manager.isMutationOperationType(objectTypeDefinitionContext.name().getText())) {
                                                        Permission writePermission = new Permission();
                                                        writePermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                        writePermission.setTypeName(objectTypeDefinitionContext.name().getText());
                                                        writePermission.setFieldName(fieldDefinitionContext.name().getText());
                                                        if (fieldDefinitionContext.description() != null) {
                                                            writePermission.setDescription(fieldDefinitionContext.description().getText());
                                                        }
                                                        writePermission.setType(WRITE);
                                                        return Stream.of(writePermission);
                                                    } else {
                                                        Permission readPermission = new Permission();
                                                        readPermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                        readPermission.setTypeName(objectTypeDefinitionContext.name().getText());
                                                        readPermission.setFieldName(fieldDefinitionContext.name().getText());
                                                        if (fieldDefinitionContext.description() != null) {
                                                            readPermission.setDescription(fieldDefinitionContext.description().getText());
                                                        }
                                                        readPermission.setType(READ);
                                                        return Stream.of(readPermission);
                                                    }
                                                } else {
                                                    return Stream.empty();
                                                }
                                            } else {
                                                Permission readPermission = new Permission();
                                                readPermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                readPermission.setTypeName(objectTypeDefinitionContext.name().getText());
                                                readPermission.setFieldName(fieldDefinitionContext.name().getText());
                                                if (fieldDefinitionContext.description() != null) {
                                                    readPermission.setDescription(fieldDefinitionContext.description().getText());
                                                }
                                                readPermission.setType(READ);

                                                Permission writePermission = new Permission();
                                                writePermission.setName(objectTypeDefinitionContext.name().getText() + SPACER + fieldDefinitionContext.name().getText() + SPACER + READ.name());
                                                writePermission.setTypeName(objectTypeDefinitionContext.name().getText());
                                                writePermission.setFieldName(fieldDefinitionContext.name().getText());
                                                if (fieldDefinitionContext.description() != null) {
                                                    writePermission.setDescription(fieldDefinitionContext.description().getText());
                                                }
                                                writePermission.setType(WRITE);
                                                return Stream.of(readPermission, writePermission);
                                            }
                                        }
                                )
                );
    }
}
