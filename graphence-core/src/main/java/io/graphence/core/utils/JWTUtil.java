package io.graphence.core.utils;

import com.google.gson.GsonBuilder;
import io.graphence.core.config.JWTConfig;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphence.core.jwt.GraphenceJsonWebToken;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.gson.io.GsonDeserializer;
import io.jsonwebtoken.gson.io.GsonSerializer;
import io.jsonwebtoken.security.Keys;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.Claims;

import java.security.Key;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.stream.Stream;

@ApplicationScoped
public class JWTUtil {

    private final JWTConfig jwtConfig;
    private final GsonBuilder gsonBuilder;

    private final Key key;

    @Inject
    public JWTUtil(JWTConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
        this.gsonBuilder = new GsonBuilder().disableHtmlEscaping();
        this.key = Keys.secretKeyFor(SignatureAlgorithm.forName(jwtConfig.getAlgorithm()));
    }

    public String build(User user, Set<String> permissions) {
        Date issuedAt = getIssuedAt();
        return Jwts.builder()
                .serializeToJsonWith(new GsonSerializer<>(gsonBuilder.create()))
                .setIssuer(jwtConfig.getIssuer())
                .setSubject(user.getId())
                .claim(Claims.full_name.name(), user.getName())
                .claim(Claims.family_name.name(), user.getLastName())
                .claim(Claims.upn.name(), user.getRealmId())
                .claim(Claims.groups.name(), getGroups(user))
                .claim("roles", getRoles(user))
                .claim("permissions", permissions.toArray(String[]::new))
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
        return Stream.ofNullable(user.getGroups()).flatMap(Collection::stream).map(Group::getName).toArray(String[]::new);
    }

    protected String[] getRoles(User user) {
        return Stream.ofNullable(user.getRoles()).flatMap(Collection::stream).map(Role::getName).toArray(String[]::new);
    }

    public GraphenceJsonWebToken parser(String compactJws) throws JwtException {
        Jws<io.jsonwebtoken.Claims> claimsJws = Jwts.parserBuilder().deserializeJsonWith(new GsonDeserializer<>(gsonBuilder.create())).setSigningKey(key).build().parseClaimsJws(compactJws);
        return new GraphenceJsonWebToken(claimsJws);
    }
}
