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

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApplicationScoped
public class JWTUtil {

  private final JWTConfig jwtConfig;
  private final SecurityConfig securityConfig;

  private final Key key;

  @Inject
  public JWTUtil(JWTConfig jwtConfig, SecurityConfig securityConfig) {
    this.jwtConfig = jwtConfig;
    this.securityConfig = securityConfig;
    this.key = Keys.secretKeyFor(SignatureAlgorithm.forName(jwtConfig.getAlgorithm()));
  }

  public String build(User user, Set<String> roles, Set<String> permissionTypes) {
    Date issuedAt = getIssuedAt();
    return Jwts.builder()
        .setIssuer(jwtConfig.getIssuer())
        .setSubject(user.getId())
        .claim(Claims.full_name.name(), user.getName())
        .claim(Claims.family_name.name(), user.getLastName())
        .claim(Claims.upn.name(), user.getRealmId())
        .claim(Claims.groups.name(), getGroups(user))
        .claim("group", user.getGroupId())
        .claim("roles", roles.toArray(String[]::new))
        .claim("permission_types", permissionTypes.toArray(String[]::new))
        .claim(
            "permission_level",
            Objects.requireNonNullElse(
                    user.getDataPermissionLevel(), DataPermissionLevel.SAME_LEVEL)
                .ordinal())
        .claim(
            "is_root",
            securityConfig.getRootUser() != null
                && user.getLogin().equals(securityConfig.getRootUser()))
        .setIssuedAt(issuedAt)
        .setExpiration(getExpiration(issuedAt))
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

  protected String[] getGroups(User user) {
    Stream<Group> groups = Stream.empty();
    if (user.getGroup() != null && user.getDataPermissionLevel() != null) {
      if (user.getDataPermissionLevel().equals(DataPermissionLevel.SAME_LEVEL)) {
        groups = Stream.of(user.getGroup());
      } else if (user.getDataPermissionLevel().equals(DataPermissionLevel.LOWER_ONLY)) {
        groups = getGroups(user.getGroup().getSubGroups());
      } else {
        groups = getGroups(user.getGroup());
      }
    }

    return Stream.concat(
            groups.map(Group::getId),
            Stream.ofNullable(user.getGroups()).flatMap(Collection::stream).map(Group::getId))
        .collect(Collectors.toSet())
        .toArray(String[]::new);
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
}
