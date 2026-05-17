package io.graphence.core.utils;

import io.graphence.core.config.ApiAuthConfig;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ApiSecretCipherTest {

  @Test
  void encryptsAndDecryptsApiSecret() {
    ApiAuthConfig config = configWithKey();
    ApiSecretCipher cipher = new ApiSecretCipher(config);

    String encrypted = cipher.encrypt("plain-secret");

    assertNotEquals("plain-secret", encrypted);
    assertEquals("plain-secret", cipher.decrypt(encrypted));
  }

  @Test
  void requiresEncryptionKeyWhenApiAuthEnabled() {
    ApiAuthConfig config = new ApiAuthConfig();
    config.setEnabled(true);
    ApiSecretCipher cipher = new ApiSecretCipher(config);

    assertThrows(IllegalStateException.class, () -> cipher.encrypt("plain-secret"));
  }

  private ApiAuthConfig configWithKey() {
    ApiAuthConfig config = new ApiAuthConfig();
    config.setEnabled(true);
    config.setSecretEncryptionKey(
        Base64.getEncoder().encodeToString("0123456789abcdef0123456789abcdef".getBytes(StandardCharsets.UTF_8)));
    return config;
  }
}
