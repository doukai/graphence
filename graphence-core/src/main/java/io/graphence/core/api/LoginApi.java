package io.graphence.core.api;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dao.LoginDao;
import io.graphence.core.dao.RBACPolicyDao;
import io.graphence.core.dto.inputObjectType.UserMutationArguments;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
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
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerResponse;

import java.util.Base64;
import java.util.Set;
import java.util.stream.Collectors;

import static io.graphence.core.constant.Constant.AUTHORIZATION_HEADER;
import static io.graphence.core.constant.Constant.AUTHORIZATION_SCHEME_BEARER;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_DISABLE;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;


@GraphQLApi
@ApplicationScoped
public class LoginApi {

    private final SecurityConfig config;
    private final LoginDao loginDao;
    private final JWTUtil jwtUtil;
    private final Provider<Mono<HttpServerResponse>> responseProvider;
    private final RBACPolicyDao rbacPolicyDao;

    @Inject
    public LoginApi(SecurityConfig config, LoginDao loginDao, JWTUtil jwtUtil, Provider<Mono<HttpServerResponse>> responseProvider, RBACPolicyDao rbacPolicyDao) {
        this.config = config;
        this.loginDao = loginDao;
        this.jwtUtil = jwtUtil;
        this.responseProvider = responseProvider;
        this.rbacPolicyDao = rbacPolicyDao;
    }

    @Mutation
    @PermitAll
    public Mono<String> login(@NonNull String login, @NonNull String password) {
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
//                    .flatMap(user -> SessionScopeInstanceFactory.computeIfAbsent(CurrentUser.class, CurrentUser.of(user)).thenReturn(user))
                .flatMap(user -> {
                            Set<String> roleIdSet = jwtUtil.getRoles(user).map(Role::getId).collect(Collectors.toSet());
                            return rbacPolicyDao.queryPermissionTypeList(roleIdSet)
                                    .map(permissions -> jwtUtil.build(user, roleIdSet, permissions.stream().map(Permission::getType).collect(Collectors.toSet())));
                        }
                )
                .flatMap(token ->
                        responseProvider.get()
                                .map(response -> response.addHeader(HttpHeaderNames.SET_COOKIE, AUTHORIZATION_HEADER + "=" + AUTHORIZATION_SCHEME_BEARER + " " + token))
                                .thenReturn(token)
                );
    }

    public UserMutationArguments hashPassword(@Source UserMutationArguments userMutationArguments) {
        if (config.getInitialPassword() != null && userMutationArguments.getId() == null && userMutationArguments.getWhere() == null) {
            Hash hash = Password.hash(config.getInitialPassword()).withBcrypt();
            userMutationArguments.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
            userMutationArguments.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
        }
        return userMutationArguments;
    }
}
