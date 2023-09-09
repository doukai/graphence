package io.graphence.core.error;

import com.google.auto.service.AutoService;
import io.graphoenix.spi.error.BaseErrorInfo;
import io.graphoenix.spi.error.ErrorInfo;
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

@AutoService(ErrorInfo.class)
public class GraphenceErrorInfo extends BaseErrorInfo {

    @Override
    public void register() {
        put(JwtException.class, AUTHENTICATION_FAILED.getCode(), AUTHENTICATION_FAILED.toString());
        put(SignatureException.class, AUTHENTICATION_FAILED.getCode(), AUTHENTICATION_FAILED.toString());
        put(CasbinAdapterException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        put(CasbinConfigException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        put(CasbinEffectorException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        put(CasbinMatcherException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        put(CasbinNameNotExistException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
        put(CasbinPolicyFileNotFoundException.class, AUTHORIZATION_FAILED.getCode(), AUTHORIZATION_FAILED.toString());
    }
}
