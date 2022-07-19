package io.graphoenix.graphence.event;

import com.google.auto.service.AutoService;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.context.RequestScopeInstanceFactory;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.error.AuthenticationException;
import io.graphoenix.graphence.jwt.GraphenceJsonWebToken;
import io.graphoenix.graphence.utils.JWTUtil;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

import java.util.Map;

import static io.graphoenix.graphence.error.AuthenticationErrorType.UN_AUTHENTICATION;

@Initialized(RequestScoped.class)
@Priority(0)
@AutoService(ScopeEvent.class)
public class JWTFilter extends BaseRequestFilter implements ScopeEvent {

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private final JWTUtil jwtUtil;
    private final IGraphQLDocumentManager manager;

    public JWTFilter() {
        this.jwtUtil = BeanContext.get(JWTUtil.class);
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        init(manager, context);
        HttpServerRequest request = getRequest(context);
        HttpServerResponse response = getResponse(context);
        if (isPermitAll(context)) {
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

            setCurrentUser(context, currentUser);
            setSessionId(context, jws);

            return RequestScopeInstanceFactory.putIfAbsent(HttpServerRequest.class, request)
                    .then(RequestScopeInstanceFactory.putIfAbsent(HttpServerResponse.class, response))
                    .then();
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
