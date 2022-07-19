package io.graphoenix.graphence.event;

import graphql.parser.antlr.GraphqlParser;
import io.graphoenix.core.dto.GraphQLRequest;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.error.AuthenticationException;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.graphoenix.core.context.RequestScopeInstanceFactory.REQUEST_ID;
import static io.graphoenix.core.context.SessionScopeInstanceFactory.SESSION_ID;
import static io.graphoenix.core.error.GraphQLErrorType.UNSUPPORTED_OPERATION_TYPE;
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.graphence.error.AuthenticationErrorType.UN_AUTHENTICATION;
import static io.graphoenix.spi.constant.Hammurabi.*;

public abstract class BaseRequestFilter {

    void init(IGraphQLDocumentManager manager, Map<String, Object> context) {
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = DOCUMENT_UTIL.graphqlToOperation(getGraphQLRequest(context).getQuery());
        context.put(OPERATION_DEFINITION, operationDefinitionContext);
        context.put(PERMIT_ALL, permit(manager, context));
    }

    public HttpServerRequest getRequest(Map<String, Object> context) {
        return (HttpServerRequest) context.get(REQUEST);
    }

    public HttpServerResponse getResponse(Map<String, Object> context) {
        return (HttpServerResponse) context.get(RESPONSE);
    }

    public GraphQLRequest getGraphQLRequest(Map<String, Object> context) {
        return (GraphQLRequest) context.get(GRAPHQL_REQUEST);
    }

    public GraphqlParser.OperationDefinitionContext getOperationDefinitionContext(Map<String, Object> context) {
        return (GraphqlParser.OperationDefinitionContext) context.get(OPERATION_DEFINITION);
    }

    public boolean isPermitAll(Map<String, Object> context) {
        return (boolean) context.get(PERMIT_ALL);
    }

    public CurrentUser getCurrentUser(Map<String, Object> context) {
        return (CurrentUser) context.get(CURRENT_USER);
    }

    public void setCurrentUser(Map<String, Object> context, CurrentUser currentUser) {
        context.put(CURRENT_USER, currentUser);
    }

    public String getRequestId(Map<String, Object> context) {
        return (String) context.get(REQUEST_ID);
    }

    public String getSessionId(Map<String, Object> context) {
        return (String) context.get(SESSION_ID);
    }

    public void setSessionId(Map<String, Object> context, String sessionId) {
        context.put(SESSION_ID, sessionId);
    }

    boolean permit(IGraphQLDocumentManager manager, Map<String, Object> context) {
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = getOperationDefinitionContext(context);
        GraphqlParser.OperationTypeContext operationTypeContext = operationDefinitionContext.operationType();
        if (operationTypeContext == null || operationTypeContext.QUERY() != null) {
            List<GraphqlParser.FieldDefinitionContext> selectionFieldList = operationDefinitionContext.selectionSet().selection().stream()
                    .flatMap(selectionContext ->
                            manager.getQueryOperationTypeName()
                                    .flatMap(manager::getObject)
                                    .flatMap(objectTypeDefinitionContext ->
                                            manager.getField(objectTypeDefinitionContext.name().getText(), selectionContext.field().name().getText())
                                    )
                                    .stream()
                    )
                    .collect(Collectors.toList());

            boolean denyAll = selectionFieldList.stream()
                    .anyMatch(fieldDefinitionContext ->
                            fieldDefinitionContext.directives() != null &&
                                    fieldDefinitionContext.directives().directive().stream()
                                            .anyMatch(directiveContext -> directiveContext.name().getText().equals("denyAll"))
                    );
            if (denyAll) {
                throw new AuthenticationException(UN_AUTHENTICATION);
            }

            return selectionFieldList.stream()
                    .allMatch(fieldDefinitionContext ->
                            fieldDefinitionContext.directives() != null &&
                                    fieldDefinitionContext.directives().directive().stream()
                                            .anyMatch(directiveContext -> directiveContext.name().getText().equals("permitAll"))
                    );
        } else if (operationTypeContext.MUTATION() != null) {
            List<GraphqlParser.FieldDefinitionContext> selectionFieldList = operationDefinitionContext.selectionSet().selection().stream()
                    .flatMap(selectionContext ->
                            manager.getMutationOperationTypeName()
                                    .flatMap(manager::getObject)
                                    .flatMap(objectTypeDefinitionContext ->
                                            manager.getField(objectTypeDefinitionContext.name().getText(), selectionContext.field().name().getText())
                                    )
                                    .stream()
                    )
                    .collect(Collectors.toList());

            boolean denyAll = selectionFieldList.stream()
                    .anyMatch(fieldDefinitionContext ->
                            fieldDefinitionContext.directives() != null &&
                                    fieldDefinitionContext.directives().directive().stream()
                                            .anyMatch(directiveContext -> directiveContext.name().getText().equals("denyAll"))
                    );
            if (denyAll) {
                throw new AuthenticationException(UN_AUTHENTICATION);
            }

            return selectionFieldList.stream()
                    .allMatch(fieldDefinitionContext ->
                            fieldDefinitionContext.directives() != null &&
                                    fieldDefinitionContext.directives().directive().stream()
                                            .anyMatch(directiveContext -> directiveContext.name().getText().equals("permitAll"))
                    );
        } else {
            throw new GraphQLErrors(UNSUPPORTED_OPERATION_TYPE);
        }
    }
}
