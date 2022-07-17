package io.graphoenix.graphence.event;

import com.google.auto.service.AutoService;
import graphql.parser.antlr.GraphqlParser;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.dto.GraphQLRequest;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.casbin.RBACEnforcer;
import io.graphoenix.graphence.dto.enumType.PermissionLevel;
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
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.graphence.casbin.adapter.CasbinRBACAdapter.SPACER;
import static io.graphoenix.graphence.casbin.adapter.CasbinRBACAdapter.USER_PREFIX;
import static io.graphoenix.spi.constant.Hammurabi.CURRENT_USER_KEY;
import static io.graphoenix.spi.constant.Hammurabi.GRAPHQL_REQUEST_KEY;

@Initialized(RequestScoped.class)
@Priority(1)
@AutoService(ScopeEvent.class)
public class RBACFilter extends PermitFilter implements ScopeEvent {

    private final IGraphQLDocumentManager manager;
    private final RBACEnforcer rbacEnforcer;

    public RBACFilter() {
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
        this.rbacEnforcer = BeanContext.get(RBACEnforcer.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        GraphQLRequest graphQLRequest = (GraphQLRequest) context.get(GRAPHQL_REQUEST_KEY);
        boolean permit = permit(graphQLRequest, manager);
        if (permit) {
            return Mono.empty();
        }
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = DOCUMENT_UTIL.graphqlToOperation(graphQLRequest.getQuery());
        CurrentUser currentUser = (CurrentUser) context.get(CURRENT_USER_KEY);
        GraphqlParser.OperationTypeContext operationTypeContext = operationDefinitionContext.operationType();
        if (operationTypeContext == null || operationTypeContext.QUERY() != null) {
            String typeName = manager.getQueryOperationTypeName().orElseThrow(() -> new GraphQLErrors(QUERY_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet(), PermissionLevel.READ);
                }
            }
        } else if (operationTypeContext.MUTATION() != null) {
            String typeName = manager.getMutationOperationTypeName().orElseThrow(() -> new GraphQLErrors(MUTATION_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet(), PermissionLevel.WRITE);
                }
            }
        } else {
            throw new GraphQLErrors(UNSUPPORTED_OPERATION_TYPE);
        }
        return Mono.empty();
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.SelectionSetContext selectionSetContext, PermissionLevel permissionLevel) {
        for (GraphqlParser.SelectionContext selectionContext : selectionSetContext.selection()) {
            if (selectionContext.field().selectionSet() != null) {
                GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                        .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet(), permissionLevel);
            } else {
                if (!rbacEnforcer.getEnforcer().enforce(
                        USER_PREFIX.concat(currentUser.getLogin()),
                        currentUser.getRealmId(),
                        typeName.concat(SPACER).concat(selectionContext.field().name().getText()),
                        permissionLevel.name()
                )
                ) {
                    throw new RuntimeException();
                }
            }
        }
    }
}
