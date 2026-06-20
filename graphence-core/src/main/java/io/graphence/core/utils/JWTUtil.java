package io.graphence.core.utils;

import io.graphence.core.config.JWTConfig;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.enumType.DataPermissionLevel;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphence.core.jwt.JsonWebToken;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.Claims;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApplicationScoped
public class JWTUtil {

  public static final String TOKEN_TYPE_CLAIM = "token_type";

  public static final String ACCESS_TOKEN_TYPE = "access";

  public static final String REFRESH_TOKEN_TYPE = "refresh";

  public static final String SESSION_ID_CLAIM = "session_id";

  public static final String SESSION_STARTED_AT_CLAIM = "session_started_at";

  public static final String SESSION_EXPIRES_AT_CLAIM = "session_expires_at";

  private final JWTConfig jwtConfig;
  private final SecurityConfig securityConfig;

  private final Key key;

  @Inject
  public JWTUtil(JWTConfig jwtConfig, SecurityConfig securityConfig) {
    this.jwtConfig = jwtConfig;
    this.securityConfig = securityConfig;
    this.key = buildKey(jwtConfig);
  }

  public String build(User user, Set<String> roles, Set<String> permissionTypes) {
    return buildAccessToken(user, roles, permissionTypes);
  }

  public String buildAccessToken(User user, Set<String> roles, Set<String> permissionTypes) {
    Date issuedAt = getIssuedAt();
    return Jwts.builder()
        .setIssuer(jwtConfig.getIssuer())
        .setSubject(user.getId())
        .claim(TOKEN_TYPE_CLAIM, ACCESS_TOKEN_TYPE)
        .claim(Claims.full_name.name(), user.getName())
        .claim(Claims.family_name.name(), user.getLastName())
        .claim(Claims.upn.name(), user.getRealmId())
        .claim(Claims.groups.name(), getGroups(user))
        .claim(
            "group",
            Optional.ofNullable(user.getGroupId())
                .or(
                    () ->
                        Stream.ofNullable(user.getGroups())
                            .flatMap(Collection::stream)
                            .findFirst()
                            .map(Group::getId))
                .orElse(null))
        .claim("roles", roles.toArray(String[]::new))
        .claim("permission_types", permissionTypes.toArray(String[]::new))
        .claim(
            "permission_level",
            Optional.ofNullable(user.getDataPermissionLevel()).map(Enum::ordinal).orElse(null))
        .claim(
            "is_root",
            securityConfig.getRootUser() != null
                && user.getLogin().equals(securityConfig.getRootUser()))
        .setIssuedAt(issuedAt)
        .setExpiration(getExpiration(issuedAt))
        .signWith(key)
        .compact();
  }

  public String buildRefreshToken(User user, String sessionId, String jwtId) {
    Date issuedAt = getIssuedAt();
    return buildRefreshToken(
        user, sessionId, jwtId, issuedAt, issuedAt, getRefreshAbsoluteExpiration(issuedAt));
  }

  public String buildRefreshToken(
      User user, String sessionId, String jwtId, Date sessionExpiresAt) {
    Date issuedAt = getIssuedAt();
    return buildRefreshToken(user, sessionId, jwtId, issuedAt, issuedAt, sessionExpiresAt);
  }

  public String buildRefreshToken(
      User user, String sessionId, String jwtId, Date issuedAt, Date sessionExpiresAt) {
    return buildRefreshToken(user, sessionId, jwtId, issuedAt, issuedAt, sessionExpiresAt);
  }

  public String buildRefreshToken(
      User user,
      String sessionId,
      String jwtId,
      Date issuedAt,
      Date sessionStartedAt,
      Date sessionExpiresAt) {
    return Jwts.builder()
        .setIssuer(jwtConfig.getIssuer())
        .setSubject(user.getId())
        .setId(jwtId)
        .claim(TOKEN_TYPE_CLAIM, REFRESH_TOKEN_TYPE)
        .claim(SESSION_ID_CLAIM, sessionId)
        .claim(SESSION_STARTED_AT_CLAIM, sessionStartedAt.getTime() / 1000)
        .claim(SESSION_EXPIRES_AT_CLAIM, sessionExpiresAt.getTime() / 1000)
        .claim(Claims.upn.name(), user.getRealmId())
        .setIssuedAt(issuedAt)
        .setExpiration(getRefreshExpiration(issuedAt, sessionExpiresAt))
        .signWith(key)
        .compact();
  }

  protected Date getIssuedAt() {
    return new Date();
  }

  protected Date getExpiration(Date issuedAt) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(issuedAt);
    calendar.add(Calendar.SECOND, jwtConfig.getValidityPeriod());
    return calendar.getTime();
  }

  protected Date getRefreshExpiration(Date issuedAt) {
    return getRefreshExpiration(issuedAt, getRefreshAbsoluteExpiration(issuedAt));
  }

  protected Date getRefreshExpiration(Date issuedAt, Date sessionExpiresAt) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(issuedAt);
    calendar.add(Calendar.SECOND, jwtConfig.getRefreshValidityPeriod());
    Date idleExpiration = calendar.getTime();
    return idleExpiration.before(sessionExpiresAt) ? idleExpiration : sessionExpiresAt;
  }

  protected Date getRefreshAbsoluteExpiration(Date issuedAt) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(issuedAt);
    calendar.add(Calendar.SECOND, jwtConfig.getRefreshAbsoluteValidityPeriod());
    return calendar.getTime();
  }

  protected String[] getGroups(User user) {
    if (user.getDataPermissionLevel() != null) {
      if (user.getDataPermissionLevel().equals(DataPermissionLevel.SAME_AND_LOWER)) {
        return Stream.ofNullable(user.getGroups())
            .flatMap(Collection::stream)
            .flatMap(this::getGroups)
            .map(Group::getId)
            .collect(Collectors.toSet())
            .toArray(String[]::new);
      } else if (user.getDataPermissionLevel().equals(DataPermissionLevel.SAME_LEVEL)) {
        return Stream.ofNullable(user.getGroups())
            .flatMap(Collection::stream)
            .map(Group::getId)
            .collect(Collectors.toSet())
            .toArray(String[]::new);
      } else if (user.getDataPermissionLevel().equals(DataPermissionLevel.LOWER_ONLY)) {
        return Stream.ofNullable(user.getGroups())
            .flatMap(Collection::stream)
            .flatMap(group -> getGroups(group.getSubGroups()))
            .map(Group::getId)
            .collect(Collectors.toSet())
            .toArray(String[]::new);
      }
    }
    return null;
  }

  public Stream<Role> getRoles(User user) {
    return Stream.concat(
        getRoles(user.getRoles()),
        Stream.ofNullable(user.getGroups())
            .flatMap(Collection::stream)
            .flatMap(group -> getRoles(group.getRoles())));
  }

  public Stream<Role> getRoles(Collection<Role> roles) {
    return Stream.ofNullable(roles)
        .flatMap(Collection::stream)
        .flatMap(role -> Stream.concat(Stream.of(role), getRoles(role.getComposites())));
  }

  public Stream<Group> getGroups(Group group) {
    return Stream.concat(Stream.of(group), getGroups(group.getSubGroups()));
  }

  public Stream<Group> getGroups(Collection<Group> groups) {
    return Stream.ofNullable(groups).flatMap(Collection::stream).flatMap(this::getGroups);
  }

  public JsonWebToken parser(String compactJws) throws JwtException {
    Jws<io.jsonwebtoken.Claims> claimsJws =
        Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(compactJws);
    return new JsonWebToken(claimsJws);
  }

  public JsonWebToken parseAccessToken(String compactJws) throws JwtException {
    JsonWebToken jsonWebToken = parser(compactJws);
    String tokenType = jsonWebToken.getClaim(TOKEN_TYPE_CLAIM);
    if (tokenType == null || ACCESS_TOKEN_TYPE.equals(tokenType)) {
      return jsonWebToken;
    }
    throw new JwtException("invalid access token type");
  }

  public JsonWebToken parseRefreshToken(String compactJws) throws JwtException {
    JsonWebToken jsonWebToken = parser(compactJws);
    if (REFRESH_TOKEN_TYPE.equals(jsonWebToken.getClaim(TOKEN_TYPE_CLAIM))) {
      return jsonWebToken;
    }
    throw new JwtException("invalid refresh token type");
  }

  public Integer getAccessTokenExpiresIn() {
    return jwtConfig.getValidityPeriod();
  }

  public Integer getRefreshTokenExpiresIn() {
    return jwtConfig.getRefreshValidityPeriod();
  }

  public Integer getRefreshAbsoluteTokenExpiresIn() {
    return jwtConfig.getRefreshAbsoluteValidityPeriod();
  }

  public Integer getRefreshTokenExpiresIn(JsonWebToken jsonWebToken) {
    return Math.toIntExact(getExpiresIn(jsonWebToken));
  }

  public Long getExpiresIn(JsonWebToken jsonWebToken) {
    return getExpiresIn(jsonWebToken, getIssuedAt());
  }

  public Long getExpiresIn(JsonWebToken jsonWebToken, Date now) {
    Date expiration = getDateClaim(jsonWebToken, Claims.exp.name());
    return Math.max(Duration.between(now.toInstant(), expiration.toInstant()).getSeconds(), 0);
  }

  public Integer getRefreshThreshold() {
    return jwtConfig.getRefreshThreshold();
  }

  public Date getSessionExpiresAt(JsonWebToken jsonWebToken) {
    return getDateClaim(jsonWebToken, SESSION_EXPIRES_AT_CLAIM);
  }

  public Date getSessionStartedAt(JsonWebToken jsonWebToken) {
    return getDateClaim(jsonWebToken, SESSION_STARTED_AT_CLAIM);
  }

  private Date getDateClaim(JsonWebToken jsonWebToken, String claimName) {
    Object value = jsonWebToken.getClaim(claimName);
    if (value instanceof Date) {
      return (Date) value;
    }
    if (value instanceof Number) {
      Number number = (Number) value;
      return new Date(number.longValue() * 1000);
    }
    throw new JwtException("invalid jwt date claim: " + claimName);
  }

  private Key buildKey(JWTConfig jwtConfig) {
    SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.forName(jwtConfig.getAlgorithm());
    String secret = jwtConfig.getSecret();
    if (secret == null || secret.isBlank()) {
      return Keys.secretKeyFor(signatureAlgorithm);
    }
    return Keys.hmacShaKeyFor(normalizeSecret(secret, signatureAlgorithm));
  }

  private byte[] normalizeSecret(String secret, SignatureAlgorithm signatureAlgorithm) {
    byte[] secretBytes;
    try {
      secretBytes = Base64.getDecoder().decode(secret);
    } catch (IllegalArgumentException e) {
      secretBytes = secret.getBytes(StandardCharsets.UTF_8);
    }
    int minimumLength = minimumKeyLength(signatureAlgorithm);
    if (secretBytes.length >= minimumLength) {
      return secretBytes;
    }
    return Arrays.copyOf(sha256(secretBytes), minimumLength);
  }

  private byte[] sha256(byte[] value) {
    try {
      return MessageDigest.getInstance("SHA-256").digest(value);
    } catch (Exception e) {
      throw new JwtException("failed to build jwt secret", e);
    }
  }

  private int minimumKeyLength(SignatureAlgorithm signatureAlgorithm) {
    if (signatureAlgorithm == SignatureAlgorithm.HS512) {
      return 64;
    }
    if (signatureAlgorithm == SignatureAlgorithm.HS384) {
      return 48;
    }
    return 32;
  }
}
