package io.graphence.core.handler;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.dto.inputObjectType.UserInputBase;
import io.graphence.core.dto.objectType.User;

import java.util.Base64;

public class BcryptManager implements PasswordManager {

    @Override
    public boolean check(String password, User user) {
        return Password.check(password, new String(Base64.getDecoder().decode(user.getHash()))).addSalt(Base64.getDecoder().decode(user.getSalt())).withBcrypt();
    }

    @Override
    public UserInputBase hash(String password, UserInputBase userinputBase) {
        Hash hash = Password.hash(password).withBcrypt();
        userinputBase.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
        userinputBase.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
        return userinputBase;
    }
}
