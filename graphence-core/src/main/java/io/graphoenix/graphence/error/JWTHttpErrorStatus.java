package io.graphoenix.graphence.error;

import com.google.auto.service.AutoService;
import io.graphoenix.spi.error.BaseHttpErrorStatus;
import io.graphoenix.spi.error.HttpErrorStatus;
import io.jsonwebtoken.JwtException;

@AutoService(HttpErrorStatus.class)
public class JWTHttpErrorStatus extends BaseHttpErrorStatus {

    @Override
    public void register() {
        put(JwtException.class, 401);
        put(AuthenticationException.class, 403);
    }
}
