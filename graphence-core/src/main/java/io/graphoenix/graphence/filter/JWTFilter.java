package io.graphoenix.graphence.filter;

import com.google.auto.service.AutoService;
import graphql.parser.antlr.GraphqlParser;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.error.AuthenticationException;
import io.graphoenix.graphence.utils.JWTUtil;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.dto.GraphQLRequest;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import org.eclipse.microprofile.jwt.Claims;

import java.util.List;
import java.util.stream.Collectors;

import static io.graphoenix.core.context.SessionInstanceFactory.SESSION_ID;
import static io.graphoenix.core.error.GraphQLErrorType.UNSUPPORTED_OPERATION_TYPE;
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.graphence.error.AuthenticationErrorType.UN_AUTHENTICATION;
import static io.graphoenix.spi.constant.Hammurabi.CURRENT_USER_KEY;
import static io.graphoenix.spi.constant.Hammurabi.GRAPHQL_REQUEST_KEY;

@AutoService(ContainerRequestFilter.class)
public class JWTFilter implements ContainerRequestFilter {

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private final JWTUtil jwtUtil;
    private final IGraphQLDocumentManager manager;

    public JWTFilter() {
        jwtUtil = BeanContext.get(JWTUtil.class);
        manager = BeanContext.get(IGraphQLDocumentManager.class);
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {
        GraphQLRequest graphQLRequest = (GraphQLRequest) requestContext.getProperty(GRAPHQL_REQUEST_KEY);
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

            boolean permitAll = selectionFieldList.stream()
                    .allMatch(fieldDefinitionContext ->
                            fieldDefinitionContext.directives() != null &&
                                    fieldDefinitionContext.directives().directive().stream()
                                            .anyMatch(directiveContext -> directiveContext.name().getText().equals("permitAll"))
                    );
            if (permitAll) {
                return;
            }
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

            boolean permitAll = selectionFieldList.stream()
                    .allMatch(fieldDefinitionContext ->
                            fieldDefinitionContext.directives() != null &&
                                    fieldDefinitionContext.directives().directive().stream()
                                            .anyMatch(directiveContext -> directiveContext.name().getText().equals("permitAll"))
                    );
            if (permitAll) {
                return;
            }
        } else {
            throw new GraphQLErrors(UNSUPPORTED_OPERATION_TYPE);
        }

        String authorization = requestContext.getHeaderString(AUTHORIZATION_HEADER);
        if (authorization != null && authorization.startsWith("Bearer")) {
            String jws = authorization.substring(7);
            GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
            CurrentUser currentUser = new CurrentUser()
                    .setLogin(jsonWebToken.getSubject())
                    .setName(jsonWebToken.getClaim(Claims.full_name))
                    .setLastName(jsonWebToken.getClaim(Claims.family_name))
                    .setRealmId(jsonWebToken.getClaim(Claims.upn))
                    .setGroups(jsonWebToken.getGroups());

            requestContext.setProperty(SESSION_ID, jws);
            requestContext.setProperty(CURRENT_USER_KEY, currentUser);
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
