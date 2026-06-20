package io.graphence.core.dto;

import com.dslplatform.json.CompiledJson;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Description("TokenPair")
public class TokenPair {

  @Description("Access Token")
  private String accessToken;

  @Description("Refresh Token")
  private String refreshToken;

  @Description("Token Type")
  private String tokenType = "Bearer";

  @Description("Access Token Expires In")
  private Integer accessTokenExpiresIn;

  @Description("Refresh Token Expires In")
  private Integer refreshTokenExpiresIn;

  public String getAccessToken() {
    return accessToken;
  }

  public TokenPair setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public TokenPair setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  public String getTokenType() {
    return tokenType;
  }

  public TokenPair setTokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  public Integer getAccessTokenExpiresIn() {
    return accessTokenExpiresIn;
  }

  public TokenPair setAccessTokenExpiresIn(Integer accessTokenExpiresIn) {
    this.accessTokenExpiresIn = accessTokenExpiresIn;
    return this;
  }

  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public TokenPair setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }
}
