package io.graphoenix.graphence.event;

import com.google.auto.service.AutoService;
import graphql.parser.antlr.GraphqlParser;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.casbin.RBACEnforcer;
import io.graphoenix.graphence.error.AuthorizationException;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import reactor.core.publisher.Mono;

import java.util.Map;

import static io.graphoenix.core.error.GraphQLErrorType.FIELD_NOT_EXIST;
import static io.graphoenix.core.error.GraphQLErrorType.MUTATION_TYPE_NOT_EXIST;
import static io.graphoenix.core.error.GraphQLErrorType.QUERY_TYPE_NOT_EXIST;
import static io.graphoenix.core.error.GraphQLErrorType.UNSUPPORTED_OPERATION_TYPE;
import static io.graphoenix.graphence.casbin.adapter.CasbinRBACAdapter.SPACER;
import static io.graphoenix.graphence.casbin.adapter.CasbinRBACAdapter.USER_PREFIX;
import static io.graphoenix.graphence.dto.enumType.PermissionLevel.READ;
import static io.graphoenix.graphence.dto.enumType.PermissionLevel.WRITE;
import static io.graphoenix.graphence.error.AuthorizationErrorType.UN_AUTHORIZATION_READ;
import static io.graphoenix.graphence.error.AuthorizationErrorType.UN_AUTHORIZATION_WRITE;

@Initialized(RequestScoped.class)
@Priority(1)
@AutoService(ScopeEvent.class)
public class RBACFilter extends BaseRequestFilter implements ScopeEvent {

    private final IGraphQLDocumentManager manager;
    private final RBACEnforcer rbacEnforcer;

    public RBACFilter() {
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
        this.rbacEnforcer = BeanContext.get(RBACEnforcer.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (isPermitAll(context)) {
            return Mono.empty();
        }
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = getOperationDefinitionContext(context);
        CurrentUser currentUser = getCurrentUser(context);
        GraphqlParser.OperationTypeContext operationTypeContext = operationDefinitionContext.operationType();
        if (operationTypeContext == null || operationTypeContext.QUERY() != null) {
            String typeName = manager.getQueryOperationTypeName().orElseThrow(() -> new GraphQLErrors(QUERY_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                }
            }
        } else if (operationTypeContext.MUTATION() != null) {
            String typeName = manager.getMutationOperationTypeName().orElseThrow(() -> new GraphQLErrors(MUTATION_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                }
            }
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().arguments());
                }
            }
        } else {
            throw new GraphQLErrors(UNSUPPORTED_OPERATION_TYPE);
        }
        return Mono.empty();
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.SelectionSetContext selectionSetContext) {
        for (GraphqlParser.SelectionContext selectionContext : selectionSetContext.selection()) {
            if (selectionContext.field().selectionSet() != null) {
                GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                        .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
            } else {
                if (!rbacEnforcer.getEnforcer().enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName.concat(SPACER).concat(selectionContext.field().name().getText()),
                        READ.name()
                )
                ) {
                    throw new AuthorizationException(UN_AUTHORIZATION_READ.bind(typeName, selectionContext.field().name().getText()));
                }
            }
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.ArgumentsContext argumentsContext) {
        for (GraphqlParser.ArgumentContext argumentContext : argumentsContext.argument()) {
            if (argumentContext.valueWithVariable().objectValueWithVariable() != null) {
                GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, argumentContext.name().getText())
                        .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, argumentContext.name().getText())));
                enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), argumentContext.valueWithVariable().objectValueWithVariable());
            } else {
                if (!rbacEnforcer.getEnforcer().enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName.concat(SPACER).concat(argumentContext.name().getText()),
                        WRITE.name()
                )
                ) {
                    throw new AuthorizationException(UN_AUTHORIZATION_WRITE.bind(typeName, argumentContext.name().getText()));
                }
            }
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.ObjectValueWithVariableContext objectValueWithVariableContext) {
        for (GraphqlParser.ObjectFieldWithVariableContext objectFieldWithVariableContext : objectValueWithVariableContext.objectFieldWithVariable()) {
            if (objectFieldWithVariableContext.valueWithVariable().objectValueWithVariable() != null) {
                GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, objectFieldWithVariableContext.name().getText())
                        .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, objectFieldWithVariableContext.name().getText())));
                enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), objectFieldWithVariableContext.valueWithVariable().objectValueWithVariable());
            } else {
                if (!rbacEnforcer.getEnforcer().enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName.concat(SPACER).concat(objectFieldWithVariableContext.name().getText()),
                        WRITE.name()
                )
                ) {
                    throw new AuthorizationException(UN_AUTHORIZATION_WRITE.bind(typeName, objectFieldWithVariableContext.name().getText()));
                }
            }
        }
    }
}
