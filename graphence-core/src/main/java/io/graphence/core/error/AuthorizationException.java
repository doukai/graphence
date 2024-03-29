package io.graphence.core.error;

import io.graphoenix.spi.error.GraphQLErrors;

public class AuthorizationException extends GraphQLErrors {

    public AuthorizationException(AuthorizationErrorType authorizationErrorType) {
        super(authorizationErrorType.getCode(), authorizationErrorType.toString());
    }
}
