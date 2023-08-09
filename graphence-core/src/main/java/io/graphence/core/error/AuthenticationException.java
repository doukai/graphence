package io.graphence.core.error;

import io.graphoenix.core.error.GraphQLErrors;

public class AuthenticationException extends GraphQLErrors {

    public AuthenticationException(AuthenticationErrorType authenticationErrorType) {
        super(authenticationErrorType.getCode(), authenticationErrorType.getDescription());
    }
}
