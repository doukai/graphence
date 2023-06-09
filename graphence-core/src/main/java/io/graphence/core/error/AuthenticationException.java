package io.graphence.core.error;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(AuthenticationErrorType authenticationErrorType) {
        super(authenticationErrorType.toString());
    }
}
