package io.graphence.core.config;

import com.typesafe.config.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "apiAuth")
public class ApiAuthConfig {

  @Optional private String secretEncryptionKey;

  public String getSecretEncryptionKey() {
    return secretEncryptionKey;
  }

  public void setSecretEncryptionKey(String secretEncryptionKey) {
    this.secretEncryptionKey = secretEncryptionKey;
  }
}
