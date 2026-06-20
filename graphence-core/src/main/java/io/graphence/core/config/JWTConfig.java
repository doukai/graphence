package io.graphence.core.config;

import com.typesafe.config.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "jwt")
public class JWTConfig {

  @Optional private String issuer = "http://graphoenix.org";

  @Optional private String algorithm = "HS256";

  @Optional private Integer validityPeriod = 60 * 10;

  @Optional private Integer refreshValidityPeriod = 60 * 30;

  @Optional private Integer refreshAbsoluteValidityPeriod = 60 * 60 * 8;

  @Optional private Integer refreshThreshold = 60 * 2;

  @Optional private String secret;

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public Integer getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(Integer validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  public Integer getRefreshValidityPeriod() {
    return refreshValidityPeriod;
  }

  public void setRefreshValidityPeriod(Integer refreshValidityPeriod) {
    this.refreshValidityPeriod = refreshValidityPeriod;
  }

  public Integer getRefreshAbsoluteValidityPeriod() {
    return refreshAbsoluteValidityPeriod;
  }

  public void setRefreshAbsoluteValidityPeriod(Integer refreshAbsoluteValidityPeriod) {
    this.refreshAbsoluteValidityPeriod = refreshAbsoluteValidityPeriod;
  }

  public Integer getRefreshThreshold() {
    return refreshThreshold;
  }

  public void setRefreshThreshold(Integer refreshThreshold) {
    this.refreshThreshold = refreshThreshold;
  }

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }
}
