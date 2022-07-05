package io.graphoenix.graphence.filter;

import com.google.auto.service.AutoService;
import graphql.parser.antlr.GraphqlParser;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.graphence.dto.objectType.CurrentUser;
import io.graphoenix.graphence.dto.enumType.PermissionLevel;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.dto.GraphQLRequest;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;

import static io.graphoenix.core.error.GraphQLErrorType.FIELD_NOT_EXIST;
import static io.graphoenix.core.error.GraphQLErrorType.MUTATION_TYPE_NOT_EXIST;
import static io.graphoenix.core.error.GraphQLErrorType.QUERY_TYPE_NOT_EXIST;
import static io.graphoenix.core.error.GraphQLErrorType.UNSUPPORTED_OPERATION_TYPE;
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.graphence.adapter.CasbinRBACAdapter.SPACER;
import static io.graphoenix.graphence.adapter.CasbinRBACAdapter.USER_PREFIX;
import static io.graphoenix.spi.constant.Hammurabi.CURRENT_USER_KEY;
import static io.graphoenix.spi.constant.Hammurabi.GRAPHQL_REQUEST_KEY;

@AutoService(ContainerRequestFilter.class)
public class RBACFilter implements ContainerRequestFilter {

    private final IGraphQLDocumentManager manager;
    private final RBACEnforcer rbacEnforcer;

    public RBACFilter() {
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
        this.rbacEnforcer = BeanContext.get(RBACEnforcer.class);
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {
        CurrentUser currentUser = (CurrentUser) requestContext.getProperty(CURRENT_USER_KEY);
        GraphQLRequest graphQLRequest = (GraphQLRequest) requestContext.getProperty(GRAPHQL_REQUEST_KEY);
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = DOCUMENT_UTIL.graphqlToOperation(graphQLRequest.getQuery());
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
