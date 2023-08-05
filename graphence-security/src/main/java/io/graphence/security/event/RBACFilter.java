package io.graphence.security.event;

import com.google.auto.service.AutoService;
import graphql.parser.antlr.GraphqlParser;
import io.graphence.core.dto.enumType.ApiType;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.casbin.RBACEnforcer;
import io.graphence.core.error.AuthorizationException;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Map;

import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.casbin.adapter.RBACAdapter.USER_PREFIX;
import static io.graphence.core.dto.enumType.ApiType.*;
import static io.graphence.core.dto.enumType.PermissionType.READ;
import static io.graphence.core.dto.enumType.PermissionType.WRITE;
import static io.graphence.core.error.AuthorizationErrorType.UN_AUTHORIZATION_READ;
import static io.graphence.core.error.AuthorizationErrorType.UN_AUTHORIZATION_WRITE;
import static io.graphoenix.core.error.GraphQLErrorType.*;
import static io.graphoenix.spi.constant.Hammurabi.EXCLUDE_INPUT;

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
                    if (manager.isInvokeField(fieldDefinitionContext)) {
                        enforceApi(currentUser, QUERY, READ, selectionContext);
                    } else {
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                    }
                }
            }
        } else if (operationTypeContext.SUBSCRIPTION() != null) {
            String typeName = manager.getSubscriptionOperationTypeName().orElseThrow(() -> new GraphQLErrors(SUBSCRIBE_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    if (manager.isInvokeField(fieldDefinitionContext)) {
                        enforceApi(currentUser, SUBSCRIPTION, READ, selectionContext);
                    } else {
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                    }
                }
            }
        } else if (operationTypeContext.MUTATION() != null) {
            String typeName = manager.getMutationOperationTypeName().orElseThrow(() -> new GraphQLErrors(MUTATION_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    if (manager.isInvokeField(fieldDefinitionContext)) {
                        enforceApi(currentUser, MUTATION, WRITE, selectionContext);
                    } else {
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().arguments());
                    }
                }
            }
        } else {
            throw new GraphQLErrors(UNSUPPORTED_OPERATION_TYPE);
        }
        return Mono.empty();
    }

    protected void enforceApi(CurrentUser currentUser, ApiType apiType, PermissionType permissionType, GraphqlParser.SelectionContext selectionContext) {
        if (!rbacEnforcer.getEnforcer()
                .enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        apiType.name() + SPACER + selectionContext.field().name().getText(),
                        permissionType.name()
                )
        ) {
            throw new AuthorizationException(UN_AUTHORIZATION_READ.bind(selectionContext.field().name().getText()));
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.SelectionSetContext selectionSetContext) {
        if (!rbacEnforcer.getEnforcer()
                .enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName,
                        READ.name()
                )
        ) {
            throw new AuthorizationException(UN_AUTHORIZATION_READ.bind(typeName));
        }

        if (selectionSetContext != null) {
            for (GraphqlParser.SelectionContext selectionContext : selectionSetContext.selection()) {
                GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                        .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
            }
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.ArgumentsContext argumentsContext) {
        if (!rbacEnforcer.getEnforcer()
                .enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName,
                        READ.name()
                )
        ) {
            throw new AuthorizationException(UN_AUTHORIZATION_WRITE.bind(typeName));
        }

        if (argumentsContext != null) {
            for (GraphqlParser.ArgumentContext argumentContext : argumentsContext.argument()) {
                if (Arrays.stream(EXCLUDE_INPUT).noneMatch(name -> argumentContext.name().getText().equals(name))) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, argumentContext.name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, argumentContext.name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), argumentContext.valueWithVariable().objectValueWithVariable());
                }
            }
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.ObjectValueWithVariableContext objectValueWithVariableContext) {
        if (!rbacEnforcer.getEnforcer()
                .enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName,
                        READ.name()
                )
        ) {
            throw new AuthorizationException(UN_AUTHORIZATION_WRITE.bind(typeName));
        }

        if (objectValueWithVariableContext != null) {
            for (GraphqlParser.ObjectFieldWithVariableContext objectFieldWithVariableContext : objectValueWithVariableContext.objectFieldWithVariable()) {
                if (Arrays.stream(EXCLUDE_INPUT).noneMatch(name -> objectFieldWithVariableContext.name().getText().equals(name))) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, objectFieldWithVariableContext.name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, objectFieldWithVariableContext.name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), objectFieldWithVariableContext.valueWithVariable().objectValueWithVariable());
                }
            }
        }
    }
}
