package io.graphence.core.error;

import io.graphoenix.spi.error.GraphQLErrors;

public class AuthenticationException extends GraphQLErrors {

    public AuthenticationException(AuthenticationErrorType authenticationErrorType) {
        super(authenticationErrorType.getCode(), authenticationErrorType.toString());
    }
}
