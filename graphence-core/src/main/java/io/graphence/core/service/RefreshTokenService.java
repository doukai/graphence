package io.graphence.core.service;

import io.graphence.core.dto.TokenPair;
import io.graphence.core.dto.objectType.User;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.jwt.JsonWebToken;
import io.graphence.core.utils.JWTUtil;
import io.jsonwebtoken.JwtException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.Claims;

import java.time.Instant;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphence.core.utils.JWTUtil.SESSION_ID_CLAIM;

@ApplicationScoped
public class RefreshTokenService {

  private final JWTUtil jwtUtil;

  @Inject
  public RefreshTokenService(JWTUtil jwtUtil) {
    this.jwtUtil = jwtUtil;
  }

  public TokenPair create(User user, Set<String> roles, Set<String> permissionTypes) {
    String sessionId = UUID.randomUUID().toString();
    Date issuedAt = Date.from(now());
    Date sessionExpiresAt =
        Date.from(issuedAt.toInstant().plusSeconds(jwtUtil.getRefreshAbsoluteTokenExpiresIn()));
    String refreshToken =
        jwtUtil.buildRefreshToken(
            user, sessionId, UUID.randomUUID().toString(), issuedAt, issuedAt, sessionExpiresAt);
    return tokenPair(jwtUtil.buildAccessToken(user, roles, permissionTypes), refreshToken);
  }

  public TokenPair rotate(
      String refreshToken, User user, Set<String> roles, Set<String> permissionTypes) {
    JsonWebToken jsonWebToken = verifyToken(refreshToken);
    if (!jsonWebToken.getSubject().equals(user.getId())) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    Date issuedAt = Date.from(now());
    String newRefreshToken =
        jwtUtil.buildRefreshToken(
            user,
            jsonWebToken.getClaim(SESSION_ID_CLAIM),
            UUID.randomUUID().toString(),
            issuedAt,
            jwtUtil.getSessionStartedAt(jsonWebToken),
            jwtUtil.getSessionExpiresAt(jsonWebToken));
    return tokenPair(jwtUtil.buildAccessToken(user, roles, permissionTypes), newRefreshToken);
  }

  public boolean revoke(String refreshToken) {
    verifyToken(refreshToken);
    return true;
  }

  public String getUserId(String refreshToken) {
    return verifyToken(refreshToken).getSubject();
  }

  private JsonWebToken verifyToken(String refreshToken) {
    try {
      JsonWebToken jsonWebToken = jwtUtil.parseRefreshToken(refreshToken);
      String sessionId = jsonWebToken.getClaim(SESSION_ID_CLAIM);
      String jwtId = jsonWebToken.getClaim(Claims.jti.name());
      if (jsonWebToken.getSubject() == null
          || sessionId == null
          || jwtId == null
          || !jwtUtil.getSessionExpiresAt(jsonWebToken).after(Date.from(now()))) {
        throw new AuthenticationException(AUTHENTICATION_FAILED);
      }
      return jsonWebToken;
    } catch (JwtException e) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
  }

  private TokenPair tokenPair(String accessToken, String refreshToken) {
    JsonWebToken refreshJsonWebToken = jwtUtil.parseRefreshToken(refreshToken);
    return new TokenPair()
        .setAccessToken(accessToken)
        .setRefreshToken(refreshToken)
        .setAccessTokenExpiresIn(jwtUtil.getAccessTokenExpiresIn())
        .setRefreshTokenExpiresIn(jwtUtil.getRefreshTokenExpiresIn(refreshJsonWebToken));
  }

  protected Instant now() {
    return Instant.now();
  }
}
