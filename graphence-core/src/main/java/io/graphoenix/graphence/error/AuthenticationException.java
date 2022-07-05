package io.graphoenix.graphence.error;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(AuthenticationErrorType authenticationErrorType) {
        super(authenticationErrorType.toString());
    }
}
