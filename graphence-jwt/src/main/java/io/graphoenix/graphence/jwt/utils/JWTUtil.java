package io.graphoenix.graphence.jwt.utils;

import io.graphoenix.graphence.dto.objectType.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Instant;
import java.util.Date;

public enum JWTUtil {
    JWT_UTIL;

    public String build(User user) {
        return Jwts.builder()
                .setIssuer("https://graphence.graphoenix.io")
                .setSubject(user.getLogin())
                .claim("name", user.getName())
                .claim("lastName", user.getLastName())
                .claim("upn", user.getEmail())
                .setIssuedAt(Date.from(Instant.ofEpochSecond(1466796822L)))
                .setExpiration(Date.from(Instant.ofEpochSecond(4622470422L)))
                .signWith(SignatureAlgorithm.HS256, "Yn2kjibddFAWtnPJ2AFlL8WXmohJMCvigQggaEypa5E=")
                .compact();
    }
}
