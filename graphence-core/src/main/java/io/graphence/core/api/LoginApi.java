package io.graphence.core.api;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.inputObjectType.UserInputBase;
import io.graphence.core.repository.LoginRepository;
import io.graphence.core.repository.RBACPolicyRepository;
import io.graphence.core.dto.inputObjectType.UserMutationArguments;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.http.server.context.RequestScopeInstanceFactory;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.nozdormu.spi.async.Asyncable;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerResponse;

import java.util.Base64;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import static io.graphence.core.constant.Constant.AUTHORIZATION_HEADER;
import static io.graphence.core.constant.Constant.AUTHORIZATION_SCHEME_BEARER;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_DISABLE;
import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;


@GraphQLApi
@ApplicationScoped
public class LoginApi implements Asyncable {

    private final SecurityConfig config;
    private final LoginRepository loginRepository;
    private final JWTUtil jwtUtil;
    private final RBACPolicyRepository rbacPolicyRepository;
    private final RequestScopeInstanceFactory requestScopeInstanceFactory;

    @Inject
    public LoginApi(SecurityConfig config, LoginRepository loginRepository, JWTUtil jwtUtil, RequestScopeInstanceFactory requestScopeInstanceFactory, RBACPolicyRepository rbacPolicyRepository) {
        this.config = config;
        this.loginRepository = loginRepository;
        this.jwtUtil = jwtUtil;
        this.rbacPolicyRepository = rbacPolicyRepository;
        this.requestScopeInstanceFactory = requestScopeInstanceFactory;
    }

    @Mutation
    @PermitAll
    public Mono<String> login(@NonNull String login, @NonNull String password) {
        return loginRepository.getUserByLogin(login)
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
                .flatMap(user -> {
                            Set<String> roleIdSet = jwtUtil.getRoles(user).map(Role::getId).collect(Collectors.toSet());
                            return rbacPolicyRepository.queryPermissionTypeList(roleIdSet)
                                    .map(permissions -> jwtUtil.build(user, roleIdSet, permissions.stream().map(Permission::getType).collect(Collectors.toSet())))
                                    .switchIfEmpty(Mono.defer(() -> Mono.just(jwtUtil.build(user, roleIdSet, Collections.emptySet()))));
                        }
                )
                .flatMap(token ->
                        requestScopeInstanceFactory.get(HttpServerResponse.class)
                                .map(response -> response.addHeader(HttpHeaderNames.SET_COOKIE, AUTHORIZATION_HEADER + "=" + AUTHORIZATION_SCHEME_BEARER + " " + token))
                                .thenReturn(token)
                );
    }

    public UserInputBase hashPassword(@Source UserInputBase userinputBase) {
        if (config.getInitialPassword() != null &&
                userinputBase.getId() == null &&
                userinputBase.getWhere() == null &&
                userinputBase.getSalt() == null &&
                userinputBase.getHash() == null
        ) {
            Hash hash = Password.hash(config.getInitialPassword()).withBcrypt();
            userinputBase.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
            userinputBase.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
        }
        return userinputBase;
    }
}
