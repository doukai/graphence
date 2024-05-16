package io.graphence.security.event;

import com.password4j.Password;
import io.graphence.core.dao.LoginDao;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.jwt.GraphenceJsonWebToken;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.core.handler.DocumentManager;
import io.graphoenix.http.server.context.RequestScopeInstanceFactory;
import io.graphoenix.spi.graphql.operation.Operation;
import io.graphoenix.spi.graphql.type.ObjectType;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;

import java.util.Base64;
import java.util.Map;

import static io.graphence.core.constant.Constant.*;
import static io.graphence.core.error.AuthenticationErrorType.*;

@ApplicationScoped
@Initialized(RequestScoped.class)
@Priority(JWTFilter.JWT_FILTER_SCOPE_EVENT_PRIORITY)
public class JWTFilter extends BaseRequestFilter implements ScopeEvent {

    public static final int JWT_FILTER_SCOPE_EVENT_PRIORITY = 0;

    private final DocumentManager documentManager;
    private final LoginDao loginDao;
    private final JWTUtil jwtUtil;
    private final RequestScopeInstanceFactory requestScopeInstanceFactory;

    @Inject
    public JWTFilter(DocumentManager documentManager, LoginDao loginDao, JWTUtil jwtUtil, RequestScopeInstanceFactory requestScopeInstanceFactory) {
        this.documentManager = documentManager;
        this.loginDao = loginDao;
        this.jwtUtil = jwtUtil;
        this.requestScopeInstanceFactory = requestScopeInstanceFactory;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        HttpServerRequest request = getRequest(context);
        String authorization = request.requestHeaders().get(AUTHORIZATION_HEADER);
        Operation operation = getOperation(context);
        ObjectType operationType = documentManager.getOperationTypeOrError(operation);

        if (authorization != null && authorization.startsWith(AUTHORIZATION_SCHEME_BEARER)) {
            String jws = authorization.substring(7);
            try {
                GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
                CurrentUser currentUser = new CurrentUser()
                        .setId(jsonWebToken.getSubject())
                        .setName(jsonWebToken.getClaim(Claims.full_name))
                        .setLastName(jsonWebToken.getClaim(Claims.family_name))
                        .setRealmId(jsonWebToken.getClaim(Claims.upn))
                        .setGroups(jsonWebToken.getClaim(Claims.groups))
                        .setRoles(jsonWebToken.getClaim("roles"));

                setCurrentUser(context, currentUser);
                setSessionId(context, jws);
                return requestScopeInstanceFactory.compute(CurrentUser.class, currentUser).then();
            } catch (Exception e) {
                if (operation.getFields().stream().anyMatch(field -> operationType.getField(field.getName()).isPermitAll())) {
                    return Mono.empty();
                }
                throw new AuthenticationException(UN_AUTHENTICATION);
            }
        } else if (authorization != null && authorization.startsWith(AUTHORIZATION_SCHEME_BASIC)) {
            String token = authorization.substring(6);
            String[] tokenDecode = new String(Base64.getDecoder().decode(token)).split(":");
            String login = tokenDecode[0];
            String password = tokenDecode[1];
            return loginDao.getUserByLogin(login)
                    .flatMap(user -> {
                                if (user.getDisable()) {
                                    return Mono.error(new AuthenticationException(AUTHENTICATION_DISABLE));
                                } else if (Password.check(password, new String(Base64.getDecoder().decode(user.getHash()))).addSalt(Base64.getDecoder().decode(user.getSalt())).withBcrypt()) {
                                    return Mono.justOrEmpty(user);
                                } else {
                                    return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                                }
                            }
                    )
                    .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
                    .map(CurrentUser::of)
                    .doOnSuccess(currentUser -> {
                                setCurrentUser(context, currentUser);
                                setSessionId(context, token);
                            }
                    )
                    .flatMap(currentUser -> requestScopeInstanceFactory.compute(CurrentUser.class, currentUser))
                    .then();
        }
        if (operation.getFields().stream().anyMatch(field -> operationType.getField(field.getName()).isPermitAll())) {
            return Mono.empty();
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
