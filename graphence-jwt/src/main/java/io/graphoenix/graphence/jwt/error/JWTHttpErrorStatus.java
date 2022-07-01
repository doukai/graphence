package io.graphoenix.graphence.jwt.error;

import com.google.auto.service.AutoService;
import io.graphoenix.spi.error.BaseHttpErrorStatus;
import io.graphoenix.spi.error.HttpErrorStatus;
import io.jsonwebtoken.JwtException;
import jakarta.ws.rs.core.Response;

@AutoService(HttpErrorStatus.class)
public class JWTHttpErrorStatus extends BaseHttpErrorStatus {

    @Override
    public void register() {
        put(JwtException.class, Response.Status.UNAUTHORIZED);
        put(AuthenticationException.class, Response.Status.UNAUTHORIZED);
    }
}
