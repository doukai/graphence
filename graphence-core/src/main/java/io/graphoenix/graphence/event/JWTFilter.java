package io.graphoenix.graphence.event;

import com.google.auto.service.AutoService;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.context.RequestScopeInstanceFactory;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.error.AuthenticationException;
import io.graphoenix.graphence.jwt.GraphenceJsonWebToken;
import io.graphoenix.graphence.utils.JWTUtil;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.dto.GraphQLRequest;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

import java.util.Map;

import static io.graphoenix.core.context.SessionScopeInstanceFactory.SESSION_ID;
import static io.graphoenix.graphence.error.AuthenticationErrorType.UN_AUTHENTICATION;
import static io.graphoenix.spi.constant.Hammurabi.CURRENT_USER_KEY;
import static io.graphoenix.spi.constant.Hammurabi.GRAPHQL_REQUEST_KEY;
import static io.graphoenix.spi.constant.Hammurabi.REQUEST_KEY;
import static io.graphoenix.spi.constant.Hammurabi.RESPONSE_KEY;

@Initialized(RequestScoped.class)
@Priority(0)
@AutoService(ScopeEvent.class)
public class JWTFilter extends PermitFilter implements ScopeEvent {

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private final JWTUtil jwtUtil;
    private final IGraphQLDocumentManager manager;

    public JWTFilter() {
        this.jwtUtil = BeanContext.get(JWTUtil.class);
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        HttpServerRequest request = (HttpServerRequest) context.get(REQUEST_KEY);
        HttpServerResponse response = (HttpServerResponse) context.get(RESPONSE_KEY);
        GraphQLRequest graphQLRequest = (GraphQLRequest) context.get(GRAPHQL_REQUEST_KEY);
        boolean permit = permit(graphQLRequest, manager);
        if (permit) {
            return RequestScopeInstanceFactory.putIfAbsent(HttpServerRequest.class, request)
                    .then(RequestScopeInstanceFactory.putIfAbsent(HttpServerResponse.class, response))
                    .then();
        }

        String authorization = request.requestHeaders().get(AUTHORIZATION_HEADER);
        if (authorization != null && authorization.startsWith("Bearer")) {
            String jws = authorization.substring(7);
            GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
            CurrentUser currentUser = new CurrentUser()
                    .setLogin(jsonWebToken.getSubject())
                    .setName(jsonWebToken.getClaim(Claims.full_name))
                    .setLastName(jsonWebToken.getClaim(Claims.family_name))
                    .setRealmId(jsonWebToken.getClaim(Claims.upn))
                    .setGroups(jsonWebToken.getClaim(Claims.groups));

            context.put(SESSION_ID, jws);
            context.put(CURRENT_USER_KEY, currentUser);

            return RequestScopeInstanceFactory.putIfAbsent(HttpServerRequest.class, request)
                    .then(RequestScopeInstanceFactory.putIfAbsent(HttpServerResponse.class, response))
                    .then();
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
