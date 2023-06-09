package io.graphence.core.error;

public class AuthorizationException extends RuntimeException {

    public AuthorizationException(AuthorizationErrorType authorizationErrorType) {
        super(authorizationErrorType.toString());
    }
}
