package io.graphence.security.event;

import io.graphence.core.handler.PasswordManager;
import io.graphence.core.handler.BcryptManager;
import io.graphence.core.config.ApiAuthConfig;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.repository.ApiKeyRepository;
import io.graphence.core.repository.LoginRepository;
import io.graphence.core.dto.Current;
import io.graphence.core.dto.objectType.ApiKey;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.jwt.GraphenceJsonWebToken;
import io.graphence.core.utils.JWTUtil;
import io.graphoenix.core.handler.DocumentManager;
import io.graphoenix.http.server.context.RequestBeanScoped;
import io.graphoenix.spi.graphql.operation.Operation;
import io.graphoenix.spi.graphql.type.ObjectType;
import io.netty.handler.codec.http.QueryStringDecoder;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.Claims;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServerRequest;

import java.util.Base64;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

import static io.graphence.core.constant.Constant.*;
import static io.graphence.core.error.AuthenticationErrorType.*;

@ApplicationScoped
@Initialized(RequestScoped.class)
@Priority(JWTFilter.JWT_FILTER_SCOPE_EVENT_PRIORITY)
public class JWTFilter extends BaseRequestFilter {

  public static final int JWT_FILTER_SCOPE_EVENT_PRIORITY = 0;

  private final DocumentManager documentManager;
  private final LoginRepository loginRepository;
  private final SecurityConfig securityConfig;
  private final ApiAuthConfig apiAuthConfig;
  private final JWTUtil jwtUtil;
  private final ApiKeyRepository apiKeyRepository;
  private final RequestBeanScoped requestScopeInstanceFactory;
  private final PasswordManager passwordManager;
  private final SigV4Verifier sigV4Verifier;
  private final NonceCache nonceCache;

  @Inject
  public JWTFilter(
      DocumentManager documentManager,
      LoginRepository loginRepository,
      SecurityConfig securityConfig,
      ApiAuthConfig apiAuthConfig,
      JWTUtil jwtUtil,
      ApiKeyRepository apiKeyRepository,
      RequestBeanScoped requestScopeInstanceFactory,
      PasswordManager passwordManager,
      SigV4Verifier sigV4Verifier,
      NonceCache nonceCache) {
    this.documentManager = documentManager;
    this.loginRepository = loginRepository;
    this.securityConfig = securityConfig;
    this.apiAuthConfig = apiAuthConfig;
    this.jwtUtil = jwtUtil;
    this.apiKeyRepository = apiKeyRepository;
    this.requestScopeInstanceFactory = requestScopeInstanceFactory;
    this.passwordManager = Optional.ofNullable(passwordManager).orElse(new BcryptManager());
    this.sigV4Verifier = sigV4Verifier;
    this.nonceCache = nonceCache;
  }

  @SuppressWarnings("unchecked")
  public Mono<Void> buildRootUser(
      @Observes
          @Initialized(RequestScoped.class)
          @Priority(JWTFilter.JWT_FILTER_SCOPE_EVENT_PRIORITY)
          Object event) {
    Map<String, Object> context = (Map<String, Object>) event;
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

    if (authorization != null
        && Boolean.TRUE.equals(apiAuthConfig.getEnabled())
        && authorization.startsWith(SigV4Verifier.ALGORITHM)) {
      String accessKey = extractSigV4AccessKey(authorization);
      return apiKeyRepository
          .getApiKeyByAccessKey(accessKey)
          .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
          .flatMap(
              apiKey -> {
                SigV4Authentication authentication = sigV4Verifier.verify(request, apiKey.getSecret());
                if (!nonceCache.putIfAbsent(authentication.getAccessKey() + ":" + authentication.getNonce())) {
                  return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                }
                if (Boolean.TRUE.equals(apiKey.getDisable())
                    || apiKey.getUser() == null
                    || Boolean.TRUE.equals(apiKey.getUser().getDisable())
                    || (apiKey.getExpiresAt() != null
                        && apiKey.getExpiresAt().isBefore(LocalDateTime.now()))) {
                  return Mono.error(new AuthenticationException(AUTHENTICATION_DISABLE));
                }
                Current current = Current.of(apiKey.getUser());
                setCurrentUser(context, current);
                return apiKeyRepository
                    .updateLastUsedAt(apiKey.getAccessKey(), LocalDateTime.now())
                    .onErrorReturn(new ApiKey())
                    .then(requestScopeInstanceFactory.put(Current.class, current));
              })
          .then();
    } else if (authorization != null && authorization.startsWith(AUTHORIZATION_SCHEME_BEARER)) {
      String jws = authorization.substring(7);
      try {
        GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
        Current current =
            new Current()
                .setId(jsonWebToken.getSubject())
                .setName(jsonWebToken.getClaim(Claims.full_name))
                .setLastName(jsonWebToken.getClaim(Claims.family_name))
                .setRealmId(jsonWebToken.getClaim(Claims.upn))
                .setGroups(jsonWebToken.getClaim(Claims.groups))
                .setRoles(jsonWebToken.getClaim("roles"));

        setCurrentUser(context, current);
        return requestScopeInstanceFactory.put(Current.class, current).then();
      } catch (Exception e) {
        Operation operation = getOperation(context);
        if (operation != null) {
          ObjectType operationType = documentManager.getOperationTypeOrError(operation);
          if (operation.getFields().stream()
              .anyMatch(field -> operationType.getField(field.getName()).isPermitAll())) {
            return Mono.empty();
          }
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
      }
    } else if (authorization != null
        && securityConfig.getBasicAuthentication()
        && authorization.startsWith(AUTHORIZATION_SCHEME_BASIC)) {
      String token = authorization.substring(6);
      String[] tokenDecode = new String(Base64.getDecoder().decode(token)).split(":");
      String login = tokenDecode[0];
      String password = tokenDecode[1];
      return loginRepository
          .getUserByLogin(login)
          .flatMap(
              user -> {
                if (user.getDisable()) {
                  return Mono.error(new AuthenticationException(AUTHENTICATION_DISABLE));
                } else if (passwordManager.check(password, user)) {
                  return Mono.justOrEmpty(user);
                } else {
                  return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                }
              })
          .switchIfEmpty(Mono.error(new AuthenticationException(AUTHENTICATION_FAILED)))
          .map(Current::of)
          .doOnSuccess(currentUser -> setCurrentUser(context, currentUser))
          .flatMap(currentUser -> requestScopeInstanceFactory.put(Current.class, currentUser))
          .then();
    }
    Operation operation = getOperation(context);
    if (operation != null) {
      ObjectType operationType = documentManager.getOperationTypeOrError(operation);
      if (operation.getFields().stream()
          .anyMatch(field -> operationType.getField(field.getName()).isPermitAll())) {
        return Mono.empty();
      }
    }
    throw new AuthenticationException(UN_AUTHENTICATION);
  }

  private String extractSigV4AccessKey(String authorization) {
    return java.util.Arrays.stream(authorization.substring(SigV4Verifier.ALGORITHM.length() + 1).split(","))
        .map(String::trim)
        .filter(part -> part.startsWith("Credential="))
        .map(part -> part.substring("Credential=".length()))
        .map(credential -> credential.split("/")[0])
        .findFirst()
        .orElseThrow(() -> new AuthenticationException(AUTHENTICATION_FAILED));
  }
}
