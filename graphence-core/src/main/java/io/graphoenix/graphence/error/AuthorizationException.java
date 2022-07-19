package io.graphoenix.graphence.error;

public class AuthorizationException extends RuntimeException {

    public AuthorizationException(AuthorizationErrorType authorizationErrorType) {
        super(authorizationErrorType.toString());
    }
}
