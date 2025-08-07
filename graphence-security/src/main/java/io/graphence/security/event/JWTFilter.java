package io.graphence.security.event;

import io.graphence.core.handler.PasswordManager;
import io.graphence.core.handler.BcryptManager;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.repository.LoginRepository;
import io.graphence.core.dto.Current;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.jwt.GraphenceJsonWebToken;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.core.handler.DocumentManager;
import io.graphoenix.http.server.context.RequestScopeInstanceFactory;
import io.graphoenix.spi.graphql.operation.Operation;
import io.graphoenix.spi.graphql.type.ObjectType;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;

import java.util.Base64;
import java.util.Map;
import java.util.Optional;

import static io.graphence.core.constant.Constant.*;
import static io.graphence.core.error.AuthenticationErrorType.*;

@ApplicationScoped
@Initialized(RequestScoped.class)
@Priority(JWTFilter.JWT_FILTER_SCOPE_EVENT_PRIORITY)
public class JWTFilter extends BaseRequestFilter implements ScopeEvent {

    public static final int JWT_FILTER_SCOPE_EVENT_PRIORITY = 0;

    private final DocumentManager documentManager;
    private final LoginRepository loginRepository;
    private final SecurityConfig securityConfig;
    private final JWTUtil jwtUtil;
    private final RequestScopeInstanceFactory requestScopeInstanceFactory;
    private final PasswordManager passwordManager;

    @Inject
    public JWTFilter(DocumentManager documentManager,
                     LoginRepository loginRepository,
                     SecurityConfig securityConfig,
                     JWTUtil jwtUtil,
                     RequestScopeInstanceFactory requestScopeInstanceFactory,
                     Provider<PasswordManager> passwordCheckerProvider) {
        this.documentManager = documentManager;
        this.loginRepository = loginRepository;
        this.securityConfig = securityConfig;
        this.jwtUtil = jwtUtil;
        this.requestScopeInstanceFactory = requestScopeInstanceFactory;
        this.passwordManager = Optional.ofNullable(passwordCheckerProvider.get()).orElse(new BcryptManager());
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        HttpServerRequest request = getRequest(context);
        String authorization = null;
        if (request.requestHeaders().contains(AUTHORIZATION_HEADER)) {
            authorization = request.requestHeaders().get(AUTHORIZATION_HEADER);
        } else {
            QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
            if (decoder.parameters().containsKey(AUTHORIZATION_HEADER)) {
                authorization = decoder.parameters().get(AUTHORIZATION_HEADER).get(0);
            }
        }

        if (authorization != null && authorization.startsWith(AUTHORIZATION_SCHEME_BEARER)) {
            String jws = authorization.substring(7);
            try {
                GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
                Current current = new Current()
                        .setId(jsonWebToken.getSubject())
                        .setName(jsonWebToken.getClaim(Claims.full_name))
                        .setLastName(jsonWebToken.getClaim(Claims.family_name))
                        .setRealmId(jsonWebToken.getClaim(Claims.upn))
                        .setGroups(jsonWebToken.getClaim(Claims.groups))
                        .setRoles(jsonWebToken.getClaim("roles"));

                setCurrentUser(context, current);
                setSessionId(context, jws);
                return requestScopeInstanceFactory.compute(Current.class, current).then();
            } catch (Exception e) {
                Operation operation = getOperation(context);
                if (operation != null) {
                    ObjectType operationType = documentManager.getOperationTypeOrError(operation);
                    if (operation.getFields().stream().anyMatch(field -> operationType.getField(field.getName()).isPermitAll())) {
                        return Mono.empty();
                    }
                }
                throw new AuthenticationException(UN_AUTHENTICATION);
            }
        } else if (authorization != null && securityConfig.getBasicAuthentication() && authorization.startsWith(AUTHORIZATION_SCHEME_BASIC)) {
            String token = authorization.substring(6);
            String[] tokenDecode = new String(Base64.getDecoder().decode(token)).split(":");
            String login = tokenDecode[0];
            String password = tokenDecode[1];
            return loginRepository.getUserByLogin(login)
                    .flatMap(user -> {
                                if (user.getDisable()) {
                                    return Mono.error(new AuthenticationException(AUTHENTICATION_DISABLE));
                                } else if (passwordManager.check(password, user)) {
                                    return Mono.justOrEmpty(user);
                                } else {
                                    return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                                }
                            }
                    )
                    .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
                    .map(Current::of)
                    .doOnSuccess(currentUser -> {
                                setCurrentUser(context, currentUser);
                                setSessionId(context, token);
                            }
                    )
                    .flatMap(currentUser -> requestScopeInstanceFactory.compute(Current.class, currentUser))
                    .then();
        }
        Operation operation = getOperation(context);
        if (operation != null) {
            ObjectType operationType = documentManager.getOperationTypeOrError(operation);
            if (operation.getFields().stream().anyMatch(field -> operationType.getField(field.getName()).isPermitAll())) {
                return Mono.empty();
            }
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
