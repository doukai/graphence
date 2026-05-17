package io.graphence.core.config;

import com.typesafe.config.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "apiAuth")
public class ApiAuthConfig {

  @Optional private Boolean enabled = true;

  @Optional private Integer timestampSkewSeconds = 300;

  @Optional private Integer nonceTtlSeconds = 300;

  @Optional private String region = "default";

  @Optional private String service = "graphence";

  @Optional private String secretEncryptionKey;

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Integer getTimestampSkewSeconds() {
    return timestampSkewSeconds;
  }

  public void setTimestampSkewSeconds(Integer timestampSkewSeconds) {
    this.timestampSkewSeconds = timestampSkewSeconds;
  }

  public Integer getNonceTtlSeconds() {
    return nonceTtlSeconds;
  }

  public void setNonceTtlSeconds(Integer nonceTtlSeconds) {
    this.nonceTtlSeconds = nonceTtlSeconds;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getSecretEncryptionKey() {
    return secretEncryptionKey;
  }

  public void setSecretEncryptionKey(String secretEncryptionKey) {
    this.secretEncryptionKey = secretEncryptionKey;
  }
}
