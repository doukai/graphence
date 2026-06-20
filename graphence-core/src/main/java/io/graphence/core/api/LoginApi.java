package io.graphence.core.api;

import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.TokenPair;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.handler.BcryptManager;
import io.graphence.core.handler.PasswordManager;
import io.graphence.core.repository.LoginRepository;
import io.graphence.core.repository.RBACPolicyRepository;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.service.RefreshTokenService;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.http.server.context.RequestBeanScoped;
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

import java.util.Collections;
import java.util.Optional;
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
  private final RequestBeanScoped requestBeanScoped;
  private final PasswordManager passwordManager;
  private final RefreshTokenService refreshTokenService;

  @Inject
  public LoginApi(
      SecurityConfig config,
      LoginRepository loginRepository,
      JWTUtil jwtUtil,
      RBACPolicyRepository rbacPolicyRepository,
      RequestBeanScoped requestBeanScoped,
      PasswordManager passwordManager,
      RefreshTokenService refreshTokenService) {
    this.config = config;
    this.loginRepository = loginRepository;
    this.jwtUtil = jwtUtil;
    this.rbacPolicyRepository = rbacPolicyRepository;
    this.requestBeanScoped = requestBeanScoped;
    this.passwordManager = Optional.ofNullable(passwordManager).orElse(new BcryptManager());
    this.refreshTokenService = refreshTokenService;
  }

  @Mutation
  @PermitAll
  public Mono<String> login(@NonNull String login, @NonNull String password) {
    return authenticate(login, password)
        .flatMap(this::buildAccessToken)
        .flatMap(this::setAuthorizationCookie);
  }

  @Mutation
  @PermitAll
  public Mono<TokenPair> loginWithTokens(@NonNull String login, @NonNull String password) {
    return authenticate(login, password)
        .flatMap(this::buildTokenPair)
        .flatMap(
            tokenPair ->
                setAuthorizationCookie(tokenPair.getAccessToken()).thenReturn(tokenPair));
  }

  @Mutation
  @PermitAll
  public Mono<TokenPair> refreshToken(@NonNull String refreshToken) {
    return Mono.defer(() -> Mono.just(refreshTokenService.getUserId(refreshToken)))
        .flatMap(loginRepository::getUserById)
        .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
        .flatMap(this::validateUser)
        .flatMap(user -> buildTokenPair(refreshToken, user))
        .flatMap(
            tokenPair ->
                setAuthorizationCookie(tokenPair.getAccessToken()).thenReturn(tokenPair));
  }

  @Mutation
  @PermitAll
  public Mono<Boolean> logout(@NonNull String refreshToken) {
    return Mono.defer(() -> Mono.just(refreshTokenService.revoke(refreshToken)));
  }

  private Mono<User> authenticate(String login, String password) {
    return loginRepository
        .getUserByLogin(login)
        .flatMap(this::validateUser)
        .flatMap(
            user -> {
              if (passwordManager.check(password, user)) {
                return Mono.justOrEmpty(user);
              } else {
                return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
              }
            })
        .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)));
  }

  private Mono<User> validateUser(User user) {
    if (Boolean.TRUE.equals(user.getDisable())) {
      return Mono.error(new AuthenticationException(AUTHENTICATION_DISABLE));
    }
    return Mono.just(user);
  }

  private Mono<String> buildAccessToken(User user) {
    Set<String> roleIdSet = jwtUtil.getRoles(user).map(Role::getId).collect(Collectors.toSet());
    return queryPermissionTypes(roleIdSet)
        .map(permissionTypes -> jwtUtil.build(user, roleIdSet, permissionTypes));
  }

  private Mono<TokenPair> buildTokenPair(User user) {
    Set<String> roleIdSet = jwtUtil.getRoles(user).map(Role::getId).collect(Collectors.toSet());
    return queryPermissionTypes(roleIdSet)
        .map(permissionTypes -> refreshTokenService.create(user, roleIdSet, permissionTypes));
  }

  private Mono<TokenPair> buildTokenPair(String refreshToken, User user) {
    Set<String> roleIdSet = jwtUtil.getRoles(user).map(Role::getId).collect(Collectors.toSet());
    return queryPermissionTypes(roleIdSet)
        .map(
            permissionTypes ->
                refreshTokenService.rotate(refreshToken, user, roleIdSet, permissionTypes));
  }

  private Mono<Set<String>> queryPermissionTypes(Set<String> roleIdSet) {
    return rbacPolicyRepository
        .queryPermissionTypeList(roleIdSet)
        .map(
            permissions ->
                permissions.stream().map(Permission::getType).collect(Collectors.toSet()))
        .switchIfEmpty(Mono.defer(() -> Mono.just(Collections.emptySet())));
  }

  private Mono<String> setAuthorizationCookie(String token) {
    return requestBeanScoped
        .get(HttpServerResponse.class)
        .map(
            response ->
                response.addHeader(
                    HttpHeaderNames.SET_COOKIE,
                    AUTHORIZATION_HEADER + "=" + AUTHORIZATION_SCHEME_BEARER + " " + token))
        .thenReturn(token);
  }

  public UserInput hashPassword(@Source UserInput userInput) {
    if (config.getInitialPassword() != null
        && userInput.getId() == null
        && userInput.getWhere() == null
        && userInput.getSalt() == null
        && userInput.getHash() == null) {
      return passwordManager.hash(config.getInitialPassword(), userInput);
    }
    return userInput;
  }
}
