package io.graphence.core.error;

import com.google.auto.service.AutoService;
import io.graphoenix.http.server.error.HttpErrorStatus;
import io.graphoenix.http.server.error.HttpErrorStatusLoader;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.security.SignatureException;
import org.casbin.jcasbin.exception.*;

@AutoService(HttpErrorStatusLoader.class)
public class GraphenceHttpErrorStatusLoader implements HttpErrorStatusLoader {

    @Override
    public void load() {
        HttpErrorStatus.put(JwtException.class, 401);
        HttpErrorStatus.put(SignatureException.class, 401);
        HttpErrorStatus.put(AuthenticationException.class, 401);
        HttpErrorStatus.put(CasbinAdapterException.class, 403);
        HttpErrorStatus.put(CasbinConfigException.class, 403);
        HttpErrorStatus.put(CasbinEffectorException.class, 403);
        HttpErrorStatus.put(CasbinMatcherException.class, 403);
        HttpErrorStatus.put(CasbinNameNotExistException.class, 403);
        HttpErrorStatus.put(CasbinPolicyFileNotFoundException.class, 403);
        HttpErrorStatus.put(AuthorizationException.class, 403);
    }
}
