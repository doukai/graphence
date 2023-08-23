package io.graphence.core.api;

import io.graphence.core.dao.LoginDao;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.JWTUtil;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.NonNull;
import org.tinylog.Logger;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerResponse;

import static io.graphence.core.constant.Constant.AUTHORIZATION_HEADER;
import static io.graphence.core.constant.Constant.AUTHORIZATION_SCHEME_BEARER;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_SERVER_ERROR;


@GraphQLApi
@ApplicationScoped
public class LoginApi {

    private final LoginDao loginDao;
    private final JWTUtil jwtUtil;
    private final Provider<Mono<HttpServerResponse>> responseProvider;

    @Inject
    public LoginApi(LoginDao loginDao, JWTUtil jwtUtil, Provider<Mono<HttpServerResponse>> responseProvider) {
        this.loginDao = loginDao;
        this.jwtUtil = jwtUtil;
        this.responseProvider = responseProvider;
    }

    @Mutation
    @PermitAll
    public Mono<String> login(@NonNull String login, @NonNull String password) {
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
//                    .flatMap(user -> SessionScopeInstanceFactory.computeIfAbsent(CurrentUser.class, CurrentUser.of(user)).thenReturn(user))
                    .map(jwtUtil::build)
                    .flatMap(token ->
                            responseProvider.get()
                                    .map(response -> response.addHeader("Set-Cookie", AUTHORIZATION_HEADER + "=" + AUTHORIZATION_SCHEME_BEARER + " " + token))
                                    .thenReturn(token)
                    );
        } catch (Exception e) {
            Logger.error(e);
        }
        throw new AuthenticationException(AUTHENTICATION_SERVER_ERROR);
    }
}
