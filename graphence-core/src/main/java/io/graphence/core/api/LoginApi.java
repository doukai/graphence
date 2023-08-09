package io.graphence.core.api;

import io.graphence.core.dto.CurrentUser;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.JWTUtil;
import io.graphence.core.dao.LoginDao;
import io.graphoenix.core.context.SessionScopeInstanceFactory;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.tinylog.Logger;
import reactor.core.publisher.Mono;

import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_SERVER_ERROR;


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

    @Mutation
    @PermitAll
    public Mono<String> login(String login, String password) {
        try {
            return loginDao.getUserByLogin(login)
                    .flatMap(user -> {
                                if (user.getPassword().equals(password)) {
                                    return Mono.justOrEmpty(user);
                                } else {
                                    return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                                }
                            }
                    )
                    .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
                    .doOnSuccess(user -> SessionScopeInstanceFactory.putIfAbsent(CurrentUser.class, CurrentUser.of(user)))
                    .map(jwtUtil::build);
        } catch (Exception e) {
            Logger.error(e);
        }
        throw new AuthenticationException(AUTHENTICATION_SERVER_ERROR);
    }
}
