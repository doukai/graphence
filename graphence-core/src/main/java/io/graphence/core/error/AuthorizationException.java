package io.graphence.core.error;

import io.graphoenix.core.error.GraphQLErrors;

public class AuthorizationException extends GraphQLErrors {

    public AuthorizationException(AuthorizationErrorType authorizationErrorType) {
        super(authorizationErrorType.getCode(), authorizationErrorType.toString());
    }
}
