package io.graphence.security.event;

import com.google.auto.service.AutoService;
import io.graphoenix.core.context.BeanContext;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.jwt.GraphenceJsonWebToken;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;

import java.util.Map;

import static io.graphence.core.constant.Constant.AUTHORIZATION_HEADER;
import static io.graphence.core.constant.Constant.AUTHORIZATION_SCHEME_BEARER;
import static io.graphence.core.error.AuthenticationErrorType.UN_AUTHENTICATION;

@Initialized(RequestScoped.class)
@Priority(0)
@AutoService(ScopeEvent.class)
public class JWTFilter extends BaseRequestFilter implements ScopeEvent {

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
        if (isPermitAll(context)) {
            return Mono.empty();
        }

        String authorization = request.requestHeaders().get(AUTHORIZATION_HEADER);
        if (authorization != null && authorization.startsWith(AUTHORIZATION_SCHEME_BEARER)) {
            String jws = authorization.substring(7);
            try {
                GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
                CurrentUser currentUser = new CurrentUser()
                        .setLogin(jsonWebToken.getSubject())
                        .setName(jsonWebToken.getClaim(Claims.full_name))
                        .setLastName(jsonWebToken.getClaim(Claims.family_name))
                        .setRealmId(jsonWebToken.getClaim(Claims.upn))
                        .setGroups(jsonWebToken.getClaim(Claims.groups));

                setCurrentUser(context, currentUser);
                setSessionId(context, jws);

                return Mono.empty();

            } catch (Exception e) {
                throw new AuthenticationException(UN_AUTHENTICATION);
            }
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
