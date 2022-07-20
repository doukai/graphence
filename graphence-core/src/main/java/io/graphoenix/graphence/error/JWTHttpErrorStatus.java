package io.graphoenix.graphence.error;

import com.google.auto.service.AutoService;
import io.graphoenix.spi.error.BaseHttpErrorStatus;
import io.graphoenix.spi.error.HttpErrorStatus;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.security.SignatureException;
import org.casbin.jcasbin.exception.*;

@AutoService(HttpErrorStatus.class)
public class JWTHttpErrorStatus extends BaseHttpErrorStatus {

    @Override
    public void register() {
        put(JwtException.class, 401);
        put(SignatureException.class, 401);
        put(AuthenticationException.class, 401);
        put(CasbinAdapterException.class, 403);
        put(CasbinConfigException.class, 403);
        put(CasbinEffectorException.class, 403);
        put(CasbinMatcherException.class, 403);
        put(CasbinNameNotExistException.class, 403);
        put(CasbinPolicyFileNotFoundException.class, 403);
        put(AuthorizationException.class, 403);
    }
}
