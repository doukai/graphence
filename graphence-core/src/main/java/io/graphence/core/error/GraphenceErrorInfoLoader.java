package io.graphence.core.error;

import com.google.auto.service.AutoService;
import io.graphoenix.spi.error.ErrorInfo;
import io.graphoenix.spi.error.ErrorInfoLoader;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.security.SignatureException;
import org.casbin.jcasbin.exception.CasbinAdapterException;
import org.casbin.jcasbin.exception.CasbinConfigException;
import org.casbin.jcasbin.exception.CasbinEffectorException;
import org.casbin.jcasbin.exception.CasbinMatcherException;
import org.casbin.jcasbin.exception.CasbinNameNotExistException;
import org.casbin.jcasbin.exception.CasbinPolicyFileNotFoundException;

import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.graphence.core.error.AuthorizationErrorType.AUTHORIZATION_FAILED;

@AutoService(ErrorInfoLoader.class)
public class GraphenceErrorInfoLoader implements ErrorInfoLoader {

    @Override
    public void load() {
        ErrorInfo.put(JwtException.class, AUTHENTICATION_FAILED.getCode(), AUTHENTICATION_FAILED.toString());
        ErrorInfo.put(SignatureException.class, AUTHENTICATION_FAILED.getCode(), AUTHENTICATION_FAILED.toString());
        ErrorInfo.put(CasbinAdapterException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        ErrorInfo.put(CasbinConfigException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        ErrorInfo.put(CasbinEffectorException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        ErrorInfo.put(CasbinMatcherException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        ErrorInfo.put(CasbinNameNotExistException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        ErrorInfo.put(CasbinPolicyFileNotFoundException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
    }
}
