package io.graphoenix.graphence.server.api;

import io.graphoenix.graphence.dto.objectType.User;
import io.graphoenix.graphence.jwt.error.AuthenticationException;
import io.graphoenix.graphence.jwt.utils.JWTUtil;
import io.graphoenix.graphence.server.spi.LoginDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.tinylog.Logger;
import reactor.core.publisher.Mono;

import static io.graphoenix.graphence.jwt.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphoenix.graphence.jwt.error.AuthenticationErrorType.AUTHENTICATION_SERVER_ERROR;


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
    public Mono<String> login(String login, String password) {
        try {
            return loginDao.getUserByLogin(login)
                    .map(user -> {
                                if (user.getPassword().equals(password)) {
                                    return jwtUtil.build(user);
                                } else {
                                    throw new AuthenticationException(AUTHENTICATION_FAILED);
                                }
                            }
                    );
        } catch (Exception e) {
            Logger.error(e);
        }
        throw new AuthenticationException(AUTHENTICATION_SERVER_ERROR);
    }
}