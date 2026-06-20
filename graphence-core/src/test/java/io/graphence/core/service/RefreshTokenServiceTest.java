package io.graphence.core.service;

import io.graphence.core.config.JWTConfig;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.TokenPair;
import io.graphence.core.dto.enumType.DataPermissionLevel;
import io.graphence.core.dto.objectType.User;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.JWTUtil;
import io.jsonwebtoken.JwtException;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RefreshTokenServiceTest {

  @Test
  void shouldCreateAndRotateRefreshToken() {
    JWTUtil jwtUtil = jwtUtil();
    RefreshTokenService refreshTokenService = new RefreshTokenService(jwtUtil);
    User user = user();

    TokenPair tokenPair = refreshTokenService.create(user, Set.of("r1"), Set.of("User"));

    assertEquals("u1", jwtUtil.parseAccessToken(tokenPair.getAccessToken()).getSubject());
    assertEquals("u1", refreshTokenService.getUserId(tokenPair.getRefreshToken()));
    assertThrows(JwtException.class, () -> jwtUtil.parseAccessToken(tokenPair.getRefreshToken()));

    TokenPair rotated =
        refreshTokenService.rotate(tokenPair.getRefreshToken(), user, Set.of("r1"), Set.of("User"));

    assertEquals("u1", refreshTokenService.getUserId(tokenPair.getRefreshToken()));
    assertEquals("u1", refreshTokenService.getUserId(rotated.getRefreshToken()));
  }

  @Test
  void shouldKeepLogoutStateless() {
    JWTUtil jwtUtil = jwtUtil();
    RefreshTokenService refreshTokenService = new RefreshTokenService(jwtUtil);
    TokenPair tokenPair = refreshTokenService.create(user(), Set.of("r1"), Set.of("User"));

    assertTrue(refreshTokenService.revoke(tokenPair.getRefreshToken()));
    assertEquals("u1", refreshTokenService.getUserId(tokenPair.getRefreshToken()));
  }

  @Test
  void shouldRejectRefreshTokenSubjectMismatch() {
    JWTUtil jwtUtil = jwtUtil();
    RefreshTokenService refreshTokenService = new RefreshTokenService(jwtUtil);
    TokenPair tokenPair = refreshTokenService.create(user(), Set.of("r1"), Set.of("User"));
    User anotherUser = user();
    anotherUser.setId("u2");

    assertThrows(
        AuthenticationException.class,
        () ->
            refreshTokenService.rotate(
                tokenPair.getRefreshToken(), anotherUser, Set.of("r1"), Set.of("User")));
  }

  @Test
  void shouldKeepRefreshTokenInsideAbsoluteExpiration() {
    JWTConfig jwtConfig = jwtConfig();
    jwtConfig.setRefreshValidityPeriod(600);
    jwtConfig.setRefreshAbsoluteValidityPeriod(60);
    JWTUtil jwtUtil = new JWTUtil(jwtConfig, new SecurityConfig());
    RefreshTokenService refreshTokenService = new RefreshTokenService(jwtUtil);

    TokenPair tokenPair = refreshTokenService.create(user(), Set.of("r1"), Set.of("User"));
    Date expiration =
        jwtUtil.getSessionExpiresAt(jwtUtil.parseRefreshToken(tokenPair.getRefreshToken()));

    assertTrue(tokenPair.getRefreshTokenExpiresIn() <= 60);
    assertTrue(expiration.after(new Date()));
  }

  private JWTUtil jwtUtil() {
    return new JWTUtil(jwtConfig(), new SecurityConfig());
  }

  private JWTConfig jwtConfig() {
    JWTConfig jwtConfig = new JWTConfig();
    jwtConfig.setSecret("refresh-token-service-test-secret");
    jwtConfig.setValidityPeriod(60);
    jwtConfig.setRefreshValidityPeriod(600);
    jwtConfig.setRefreshAbsoluteValidityPeriod(3600);
    return jwtConfig;
  }

  private User user() {
    User user = new User();
    user.setId("u1");
    user.setLogin("login1");
    user.setRealmId(1);
    user.setDataPermissionLevel(DataPermissionLevel.SAME_LEVEL);
    return user;
  }
}
