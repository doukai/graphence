package io.graphence.core.api;

import io.graphence.core.config.JWTConfig;
import io.graphence.core.dao.LoginDao;
import io.graphence.core.dto.inputObjectType.UserMutationTypeArguments;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.JWTUtil;
import io.netty.handler.codec.http.HttpHeaderNames;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Source;
import org.tinylog.Logger;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerResponse;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import static io.graphence.core.constant.Constant.AUTHORIZATION_HEADER;
import static io.graphence.core.constant.Constant.AUTHORIZATION_SCHEME_BEARER;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_SERVER_ERROR;


@GraphQLApi
@ApplicationScoped
public class LoginApi {

    private final JWTConfig config;
    private final LoginDao loginDao;
    private final JWTUtil jwtUtil;
    private final Provider<Mono<HttpServerResponse>> responseProvider;

    @Inject
    public LoginApi(JWTConfig config, LoginDao loginDao, JWTUtil jwtUtil, Provider<Mono<HttpServerResponse>> responseProvider) {
        this.config = config;
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
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                                    messageDigest.update(password.getBytes(StandardCharsets.UTF_8));
                                    messageDigest.update(user.getSalt().getBytes(StandardCharsets.UTF_8));
                                    if (MessageDigest.isEqual(messageDigest.digest(), user.getHash().getBytes(StandardCharsets.UTF_8))) {
                                        return Mono.justOrEmpty(user);
                                    } else {
                                        return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                                    }
                                } catch (NoSuchAlgorithmException e) {
                                    Logger.error(e);
                                    return Mono.error(new AuthenticationException(AUTHENTICATION_SERVER_ERROR));
                                }
                            }
                    )
                    .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
//                    .flatMap(user -> SessionScopeInstanceFactory.computeIfAbsent(CurrentUser.class, CurrentUser.of(user)).thenReturn(user))
                    .map(jwtUtil::build)
                    .flatMap(token ->
                            responseProvider.get()
                                    .map(response -> response.addHeader(HttpHeaderNames.SET_COOKIE, AUTHORIZATION_HEADER + "=" + AUTHORIZATION_SCHEME_BEARER + " " + token))
                                    .thenReturn(token)
                    );
        } catch (Exception e) {
            Logger.error(e);
        }
        throw new AuthenticationException(AUTHENTICATION_SERVER_ERROR);
    }

    public UserMutationTypeArguments hashPassword(@Source UserMutationTypeArguments userMutationTypeArguments) {
        if (config.getInitialPassword() != null && userMutationTypeArguments.getId() == null && userMutationTypeArguments.getWhere() == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                SecureRandom random = new SecureRandom();
                byte[] salt = new byte[64];
                random.nextBytes(salt);
                messageDigest.update(config.getInitialPassword().getBytes(StandardCharsets.UTF_8));
                messageDigest.update(salt);
                byte[] hash = messageDigest.digest();
                userMutationTypeArguments.setSalt(new String(salt));
                userMutationTypeArguments.setHash(new String(hash));
            } catch (NoSuchAlgorithmException e) {
                Logger.error(e);
                throw new AuthenticationException(AUTHENTICATION_SERVER_ERROR);
            }
        }
        return userMutationTypeArguments;
    }
}
