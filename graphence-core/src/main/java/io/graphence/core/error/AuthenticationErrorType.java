package io.graphence.core.error;

public enum AuthenticationErrorType {

    UN_AUTHENTICATION(-40100, "unauthorized"),
    AUTHENTICATION_FAILED(-40101, "authentication failed"),
    AUTHENTICATION_DISABLE(-40102, "account disable"),
    AUTHENTICATION_SERVER_ERROR(-40103, "authentication error"),

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
