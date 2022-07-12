package io.graphoenix.graphence.server.api;

import io.graphoenix.core.context.SessionScopeInstanceFactory;
import io.graphoenix.graphence.CurrentUser;
import io.graphoenix.graphence.error.AuthenticationException;
import io.graphoenix.graphence.utils.JWTUtil;
import io.graphoenix.graphence.server.spi.LoginDao;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.tinylog.Logger;
import reactor.core.publisher.Mono;

import static io.graphoenix.graphence.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphoenix.graphence.error.AuthenticationErrorType.AUTHENTICATION_SERVER_ERROR;


@GraphQLApi
@ApplicationScoped
public class LoginApi {

    private final LoginDao loginDao;
    private final JWTUtil jwtUtil;

    @Inject
    public LoginApi(LoginDao loginDao, JWTUtil jwtUtil) {
        this.loginDao = loginDao;
        this.jwtUtil = jwtUtil;
    }

    @Query
    @PermitAll
    public Mono<String> login(String login, String password) {
        try {
            return loginDao.getUserByLogin(login)
                    .map(user -> {
                                if (user.getPassword().equals(password)) {
                                    return user;
                                } else {
                                    throw new AuthenticationException(AUTHENTICATION_FAILED);
                                }
                            }
                    )
                    .doOnSuccess(user -> SessionScopeInstanceFactory.putIfAbsent(CurrentUser.class, CurrentUser.of(user)))
                    .map(jwtUtil::build)
                    .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)));
        } catch (Exception e) {
            Logger.error(e);
        }
        throw new AuthenticationException(AUTHENTICATION_SERVER_ERROR);
    }
}
