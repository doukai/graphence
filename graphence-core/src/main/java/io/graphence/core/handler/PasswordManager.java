package io.graphence.core.handler;

import io.graphence.core.dto.inputObjectType.UserInputBase;
import io.graphence.core.dto.objectType.User;

public interface PasswordManager {
    boolean check(String password, User user);

    UserInputBase hash(String password, UserInputBase userinputBase);
}
