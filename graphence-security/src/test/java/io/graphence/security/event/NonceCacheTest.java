package io.graphence.security.event;

import io.graphence.core.config.ApiAuthConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NonceCacheTest {

  @Test
  void rejectsReplayWithinTtl() {
    ApiAuthConfig config = new ApiAuthConfig();
    config.setNonceTtlSeconds(300);
    NonceCache cache = new NonceCache(config);

    assertTrue(cache.putIfAbsent("ak:nonce"));
    assertFalse(cache.putIfAbsent("ak:nonce"));
  }

  @Test
  void removesExpiredNonceBeforeInsert() {
    ApiAuthConfig config = new ApiAuthConfig();
    config.setNonceTtlSeconds(-1);
    NonceCache cache = new NonceCache(config);

    assertTrue(cache.putIfAbsent("ak:expired"));
    assertTrue(cache.putIfAbsent("ak:expired"));
  }
}
