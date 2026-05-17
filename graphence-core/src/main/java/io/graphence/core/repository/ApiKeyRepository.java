package io.graphence.core.repository;

import io.graphence.core.dto.inputObjectType.ApiKeyInput;
import io.graphence.core.dto.objectType.ApiKey;
import io.graphence.core.dto.annotation.ApiKeyExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;

@GraphQLOperation
public interface ApiKeyRepository {

  @io.graphence.core.dto.annotation.Query(
      apiKey = @ApiKeyExpression(accessKey = @StringExpression($val = "accessKey")))
  @SelectionSet(
      "{ id name description accessKey secret disable expiresAt lastUsedAt userId realmId user { id login name lastName disable roles { id name composites { id name composites { id name } } } groups { id name path deep roles { id name composites { id name composites { id name } } } } realmId } }")
  Mono<ApiKey> getApiKeyByAccessKey(String accessKey);

  @io.graphence.core.dto.annotation.Query(
      apiKeyList = @ApiKeyExpression(userId = @StringExpression($val = "userId")))
  @SelectionSet("{ id name description accessKey disable expiresAt lastUsedAt userId realmId }")
  Mono<List<ApiKey>> getApiKeyListByUserId(String userId);

  @io.graphence.core.dto.annotation.Query(
      apiKey =
          @ApiKeyExpression(
              id = @StringExpression($val = "id"),
              userId = @StringExpression($val = "userId")))
  @SelectionSet("{ id name description accessKey secret disable expiresAt lastUsedAt userId realmId }")
  Mono<ApiKey> getApiKeyByIdAndUserId(String id, String userId);

  @io.graphence.core.dto.annotation.Mutation(
      apiKey = @io.graphence.core.dto.annotation.ApiKeyInput($input = "apiKeyInput"))
  @SelectionSet("{ id name description accessKey disable expiresAt lastUsedAt userId realmId }")
  Mono<ApiKey> updateApiKey(ApiKeyInput apiKeyInput);

  @io.graphence.core.dto.annotation.Mutation(
      apiKey =
          @io.graphence.core.dto.annotation.ApiKeyInput(
              $disable = "disable",
              where =
                  @io.graphence.core.dto.annotation.ApiKeyExpression1(
                      id = @StringExpression($val = "id"),
                      userId = @StringExpression($val = "userId"))))
  @SelectionSet("{ id name description accessKey disable expiresAt lastUsedAt userId realmId }")
  Mono<ApiKey> setApiKeyDisable(String id, String userId, Boolean disable);

  @io.graphence.core.dto.annotation.Mutation(
      apiKey =
          @io.graphence.core.dto.annotation.ApiKeyInput(
              $secret = "secret",
              where =
                  @io.graphence.core.dto.annotation.ApiKeyExpression1(
                      id = @StringExpression($val = "id"),
                      userId = @StringExpression($val = "userId"))))
  @SelectionSet("{ id name description accessKey disable expiresAt lastUsedAt userId realmId }")
  Mono<ApiKey> updateApiKeySecret(String id, String userId, String secret);

  @io.graphence.core.dto.annotation.Mutation(
      apiKey =
          @io.graphence.core.dto.annotation.ApiKeyInput(
              $lastUsedAt = "lastUsedAt",
              where = @io.graphence.core.dto.annotation.ApiKeyExpression1(accessKey = @StringExpression($val = "accessKey"))))
  @SelectionSet("{ id }")
  Mono<ApiKey> updateLastUsedAt(String accessKey, LocalDateTime lastUsedAt);
}
