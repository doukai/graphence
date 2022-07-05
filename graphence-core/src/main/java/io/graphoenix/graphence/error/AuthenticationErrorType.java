package io.graphoenix.graphence.error;

public enum AuthenticationErrorType {

    UN_AUTHENTICATION(-40100, "Unauthorized"),
    AUTHENTICATION_FAILED(-40101, "authentication failed"),
    AUTHENTICATION_SERVER_ERROR(-40102, "authentication error"),

    UNKNOWN(-40199, "unknown authentication error");

    private final int code;
    private final String description;
    private Object[] variables;

    AuthenticationErrorType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public AuthenticationErrorType bind(Object... variables) {
        this.variables = variables;
        return this;
    }

    @Override
    public String toString() {
        return code + ": " + String.format(description, variables);
    }
}
