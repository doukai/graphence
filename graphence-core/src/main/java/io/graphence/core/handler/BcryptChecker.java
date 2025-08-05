package io.graphence.core.handler;

import com.password4j.Password;
import io.graphence.core.dto.objectType.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

import java.util.Base64;

@ApplicationScoped
@Default
public class BcryptChecker implements PasswordChecker {

    @Override
    public boolean check(String password, User user) {
        return Password.check(password, new String(Base64.getDecoder().decode(user.getHash()))).addSalt(Base64.getDecoder().decode(user.getSalt())).withBcrypt();
    }
}
