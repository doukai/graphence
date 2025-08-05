package io.graphence.core.handler;

import io.graphence.core.dto.objectType.User;

public interface PasswordChecker {
    boolean check(String password, User user);
}
