package io.graphence.security.event;

import com.password4j.Password;
import io.graphence.core.dao.LoginDao;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.jwt.GraphenceJsonWebToken;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.http.server.context.RequestScopeInstanceFactory;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;

import java.util.Base64;
import java.util.Map;

import static io.graphence.core.constant.Constant.*;
import static io.graphence.core.error.AuthenticationErrorType.*;

@ApplicationScoped
@Initialized(RequestScoped.class)
@Priority(0)
public class JWTFilter extends BaseRequestFilter implements ScopeEvent {

    private final LoginDao loginDao;
    private final JWTUtil jwtUtil;
    private final RequestScopeInstanceFactory requestScopeInstanceFactory;

    public JWTFilter(LoginDao loginDao, JWTUtil jwtUtil, RequestScopeInstanceFactory requestScopeInstanceFactory) {
        this.loginDao = loginDao;
        this.jwtUtil = jwtUtil;
        this.requestScopeInstanceFactory = requestScopeInstanceFactory;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        HttpServerRequest request = getRequest(context);
        String authorization = request.requestHeaders().get(AUTHORIZATION_HEADER);

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
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
