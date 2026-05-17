package io.graphence.core.utils;

import io.graphence.core.config.ApiAuthConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

@ApplicationScoped
public class ApiSecretCipher {

  private static final String AES = "AES";
  private static final String AES_GCM = "AES/GCM/NoPadding";
  private static final int GCM_TAG_LENGTH = 128;
  private static final int IV_LENGTH = 12;

  private final ApiAuthConfig config;
  private final SecureRandom secureRandom = new SecureRandom();

  @Inject
  public ApiSecretCipher(ApiAuthConfig config) {
    this.config = config;
  }

  public String encrypt(String plainText) {
    try {
      byte[] iv = new byte[IV_LENGTH];
      secureRandom.nextBytes(iv);
      Cipher cipher = Cipher.getInstance(AES_GCM);
      cipher.init(Cipher.ENCRYPT_MODE, key(), new GCMParameterSpec(GCM_TAG_LENGTH, iv));
      byte[] encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
      return Base64.getEncoder()
          .encodeToString(ByteBuffer.allocate(iv.length + encrypted.length).put(iv).put(encrypted).array());
    } catch (Exception e) {
      throw new IllegalStateException("failed to encrypt api secret", e);
    }
  }

  public String decrypt(String encryptedText) {
    try {
      byte[] bytes = Base64.getDecoder().decode(encryptedText);
      ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
      byte[] iv = new byte[IV_LENGTH];
      byteBuffer.get(iv);
      byte[] encrypted = new byte[byteBuffer.remaining()];
      byteBuffer.get(encrypted);
      Cipher cipher = Cipher.getInstance(AES_GCM);
      cipher.init(Cipher.DECRYPT_MODE, key(), new GCMParameterSpec(GCM_TAG_LENGTH, iv));
      return new String(cipher.doFinal(encrypted), StandardCharsets.UTF_8);
    } catch (Exception e) {
      throw new IllegalStateException("failed to decrypt api secret", e);
    }
  }

  private SecretKeySpec key() {
    String key = config.getSecretEncryptionKey();
    if (Boolean.TRUE.equals(config.getEnabled()) && (key == null || key.isBlank())) {
      throw new IllegalStateException("apiAuth.secretEncryptionKey is required when apiAuth is enabled");
    }
    byte[] bytes = Base64.getDecoder().decode(key);
    if (bytes.length != 16 && bytes.length != 24 && bytes.length != 32) {
      throw new IllegalStateException("apiAuth.secretEncryptionKey must decode to 16, 24, or 32 bytes");
    }
    return new SecretKeySpec(bytes, AES);
  }
}
