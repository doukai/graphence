package io.graphoenix.graphence.jwt.error;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(AuthenticationErrorType authenticationErrorType) {
        super(authenticationErrorType.toString());
    }
}
