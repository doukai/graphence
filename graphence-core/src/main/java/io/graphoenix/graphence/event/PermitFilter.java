package io.graphoenix.graphence.event;

import graphql.parser.antlr.GraphqlParser;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.graphence.error.AuthenticationException;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.dto.GraphQLRequest;

import java.util.List;
import java.util.stream.Collectors;

import static io.graphoenix.core.error.GraphQLErrorType.UNSUPPORTED_OPERATION_TYPE;
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.graphence.error.AuthenticationErrorType.UN_AUTHENTICATION;

public abstract class PermitFilter {

    boolean permit(GraphQLRequest graphQLRequest, IGraphQLDocumentManager manager) {
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = DOCUMENT_UTIL.graphqlToOperation(graphQLRequest.getQuery());
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
