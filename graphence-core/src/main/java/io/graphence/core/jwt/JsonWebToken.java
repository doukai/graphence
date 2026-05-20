package io.graphence.core.jwt;

import io.jsonwebtoken.Jws;
import org.eclipse.microprofile.jwt.Claims;

import java.util.HashSet;
import java.util.Set;

public class JsonWebToken implements org.eclipse.microprofile.jwt.JsonWebToken {

  private final Jws<io.jsonwebtoken.Claims> claimsJws;

  public JsonWebToken(Jws<io.jsonwebtoken.Claims> claimsJws) {
    this.claimsJws = claimsJws;
  }

  @Override
  public String getName() {
    return claimsJws.getBody().containsKey(Claims.upn.name())
        ? claimsJws.getBody().get(Claims.upn.name(), String.class)
        : claimsJws.getBody().getSubject();
  }

  @Override
  public Set<String> getClaimNames() {
    return new HashSet<>(claimsJws.getBody().keySet());
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T getClaim(String claimName) {
    return (T) claimsJws.getBody().get(claimName);
  }
}
