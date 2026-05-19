package io.graphence.core.config;

import com.typesafe.config.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "file")
public class FileSignedUrlConfig {

  @Optional private String signedUrlBaseUrl;

  @Optional private Integer signedUrlDefaultTtlSeconds = 300;

  @Optional private Integer signedUrlMaxTtlSeconds = 300;

  @Optional private String signedUrlSecret;

  public String getSignedUrlBaseUrl() {
    return signedUrlBaseUrl;
  }

  public void setSignedUrlBaseUrl(String signedUrlBaseUrl) {
    this.signedUrlBaseUrl = signedUrlBaseUrl;
  }

  public Integer getSignedUrlDefaultTtlSeconds() {
    return signedUrlDefaultTtlSeconds;
  }

  public void setSignedUrlDefaultTtlSeconds(Integer signedUrlDefaultTtlSeconds) {
    this.signedUrlDefaultTtlSeconds = signedUrlDefaultTtlSeconds;
  }

  public Integer getSignedUrlMaxTtlSeconds() {
    return signedUrlMaxTtlSeconds;
  }

  public void setSignedUrlMaxTtlSeconds(Integer signedUrlMaxTtlSeconds) {
    this.signedUrlMaxTtlSeconds = signedUrlMaxTtlSeconds;
  }

  public String getSignedUrlSecret() {
    return signedUrlSecret;
  }

  public void setSignedUrlSecret(String signedUrlSecret) {
    this.signedUrlSecret = signedUrlSecret;
  }
}
