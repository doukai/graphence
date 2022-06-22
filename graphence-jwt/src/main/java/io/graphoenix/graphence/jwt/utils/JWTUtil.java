package io.graphoenix.graphence.jwt.utils;

import io.graphoenix.graphence.dto.objectType.Group;
import io.graphoenix.graphence.dto.objectType.Role;
import io.graphoenix.graphence.dto.objectType.User;
import io.graphoenix.graphence.jwt.GraphenceJsonWebToken;
import io.graphoenix.graphence.jwt.config.JWTConfig;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.Claims;

import java.security.Key;
import java.util.Calendar;
import java.util.Date;

@ApplicationScoped
public class JWTUtil {

    private final JWTConfig jwtConfig;

    private final Key key;

    @Inject
    public JWTUtil(JWTConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
        this.key = Keys.secretKeyFor(SignatureAlgorithm.forName(jwtConfig.getAlgorithm()));
    }

    public String build(User user) {
        Date issuedAt = getIssuedAt();
        return Jwts.builder()
                .setIssuer(jwtConfig.getIssuer())
                .setSubject(user.getLogin())
                .claim(Claims.full_name.name(), user.getName())
                .claim(Claims.upn.name(), user.getEmail())
                .claim(Claims.groups.name(), getGroups(user))
                .claim("roles", getRoles(user))
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
        if (user.getGroups() == null) {
            return null;
        }
        return user.getGroups().stream().map(Group::getName).toArray(String[]::new);
    }

    protected String[] getRoles(User user) {
        if (user.getRoles() == null) {
            return null;
        }
        return user.getRoles().stream().map(Role::getName).toArray(String[]::new);
    }

    public GraphenceJsonWebToken parser(String compactJws) throws JwtException {
        Jws<io.jsonwebtoken.Claims> claimsJws = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(compactJws);
        return new GraphenceJsonWebToken(claimsJws);
    }
}
