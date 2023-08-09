package io.graphence.core.error;

public enum AuthorizationErrorType {

    UN_AUTHORIZATION_READ(-40300, "read authorization failed: %s"),
    UN_AUTHORIZATION_WRITE(-40301, "write authorization failed: %s"),
    AUTHORIZATION_FAILED(-40302, "authorization failed"),

    UNKNOWN(-40399, "unknown authentication error");

    private final int code;
    private final String description;
    private Object[] variables;

    AuthorizationErrorType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public AuthorizationErrorType bind(Object... variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public String toString() {
        return code + ": " + String.format(description, variables);
    }
}
