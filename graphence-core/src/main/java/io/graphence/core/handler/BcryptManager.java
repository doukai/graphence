package io.graphence.core.handler;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.dto.objectType.User;

import java.util.Base64;

public class BcryptManager implements PasswordManager {

  @Override
  public boolean check(String password, User user) {
    return Password.check(password, new String(Base64.getDecoder().decode(user.getHash())))
        .addSalt(Base64.getDecoder().decode(user.getSalt()))
        .withBcrypt();
  }

  @Override
  public UserInput hash(String password, UserInput userInput) {
    Hash hash = Password.hash(password).withBcrypt();
    userInput.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
    userInput.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
    return userInput;
  }
}
