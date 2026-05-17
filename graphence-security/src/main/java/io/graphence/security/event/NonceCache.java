package io.graphence.security.event;

import io.graphence.core.config.ApiAuthConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ApplicationScoped
public class NonceCache {

  private final ApiAuthConfig config;
  private final Map<String, Long> nonceExpiresAtMap = new ConcurrentHashMap<>();

  @Inject
  public NonceCache(ApiAuthConfig config) {
    this.config = config;
  }

  public boolean putIfAbsent(String key) {
    long now = Instant.now().getEpochSecond();
    nonceExpiresAtMap.entrySet().removeIf(entry -> entry.getValue() <= now);
    long expiresAt = now + config.getNonceTtlSeconds();
    return nonceExpiresAtMap.putIfAbsent(key, expiresAt) == null;
  }
}
