package io.graphence.core.handler;

import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.dto.objectType.User;

public interface PasswordManager {
  boolean check(String password, User user);

  UserInput hash(String password, UserInput userInput);
}
