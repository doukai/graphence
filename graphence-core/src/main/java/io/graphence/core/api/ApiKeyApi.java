package io.graphence.core.api;

import io.graphence.core.dto.ApiKeySecret;
import io.graphence.core.dto.Current;
import io.graphence.core.dto.inputObjectType.ApiKeyInput;
import io.graphence.core.dto.objectType.ApiKey;
import io.graphence.core.repository.ApiKeyRepository;
import io.graphence.core.utils.ApiSecretCipher;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Query;
import reactor.core.publisher.Mono;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;

@GraphQLApi
@ApplicationScoped
public class ApiKeyApi {

  private static final String ACCESS_KEY_PREFIX = "GEAK";

  private final Provider<Mono<Current>> currentUserMonoProvider;
  private final ApiKeyRepository apiKeyRepository;
  private final ApiSecretCipher apiSecretCipher;
  private final SecureRandom secureRandom = new SecureRandom();

  @Inject
  public ApiKeyApi(
      Provider<Mono<Current>> currentUserMonoProvider,
      ApiKeyRepository apiKeyRepository,
      ApiSecretCipher apiSecretCipher) {
    this.currentUserMonoProvider = currentUserMonoProvider;
    this.apiKeyRepository = apiKeyRepository;
    this.apiSecretCipher = apiSecretCipher;
  }

  @Query
  public Mono<List<ApiKey>> currentApiKeyList() {
    return currentUserMonoProvider
        .get()
        .flatMap(current -> apiKeyRepository.getApiKeyListByUserId(current.getId()));
  }

  @Mutation
  public Mono<ApiKeySecret> createCurrentApiKey(
      @NonNull String name, String description, LocalDateTime expiresAt) {
    return currentUserMonoProvider
        .get()
        .flatMap(
            current -> {
              String secret = newSecret();
              ApiKeyInput input = new ApiKeyInput();
              input.setName(name);
              input.setDescription(description);
              input.setAccessKey(newAccessKey());
              input.setSecret(apiSecretCipher.encrypt(secret));
              input.setDisable(false);
              input.setExpiresAt(expiresAt);
              input.setUserId(current.getId());
              input.setRealmId(current.getRealmId());
              return apiKeyRepository
                  .updateApiKey(input)
                  .map(apiKey -> secret(apiKey, input.getAccessKey(), secret));
            });
  }

  @Mutation
  public Mono<ApiKey> disableCurrentApiKey(@NonNull String id) {
    return currentUserMonoProvider
        .get()
        .flatMap(current -> apiKeyRepository.setApiKeyDisable(id, current.getId(), true));
  }

  @Mutation
  public Mono<ApiKeySecret> rotateCurrentApiKeySecret(@NonNull String id) {
    return currentUserMonoProvider
        .get()
        .flatMap(
            current -> {
              String secret = newSecret();
              return apiKeyRepository
                  .updateApiKeySecret(id, current.getId(), apiSecretCipher.encrypt(secret))
                  .map(apiKey -> secret(apiKey, apiKey.getAccessKey(), secret));
            });
  }

  private ApiKeySecret secret(ApiKey apiKey, String accessKey, String secret) {
    return new ApiKeySecret().setApiKey(apiKey).setAccessKey(accessKey).setSecret(secret);
  }

  private String newAccessKey() {
    return ACCESS_KEY_PREFIX + token(24);
  }

  private String newSecret() {
    return token(48);
  }

  private String token(int byteLength) {
    byte[] bytes = new byte[byteLength];
    secureRandom.nextBytes(bytes);
    return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
  }
}
