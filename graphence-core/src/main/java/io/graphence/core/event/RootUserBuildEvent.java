package io.graphence.core.event;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dao.UserDao;
import io.graphence.core.dto.objectType.User;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.Base64;
import java.util.Map;

import static io.graphoenix.core.event.DocumentInitializedEvent.DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(RootUserBuildEvent.ROOT_USER_BUILD_SCOPE_EVENT_PRIORITY)
public class RootUserBuildEvent implements ScopeEvent {

    public static final int ROOT_USER_BUILD_SCOPE_EVENT_PRIORITY = DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY + 110;
    private final SecurityConfig securityConfig;
    private final UserDao userDao;

    @Inject
    public RootUserBuildEvent(SecurityConfig securityConfig, UserDao userDao) {
        this.securityConfig = securityConfig;
        this.userDao = userDao;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (securityConfig.getRootUser() == null || securityConfig.getRootPassword() == null) {
            return Mono.empty();
        }
        Hash hash = Password.hash(securityConfig.getRootPassword()).withBcrypt();
        return userDao.getUserIdByLogin(securityConfig.getRootUser())
                .map(user -> {
                            user.setName(securityConfig.getRootUser());
                            user.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
                            user.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
                            return user;
                        }
                )
                .switchIfEmpty(
                        Mono.defer(() -> {
                                    User user = new User();
                                    user.setLogin(securityConfig.getRootUser());
                                    user.setName(securityConfig.getRootUser());
                                    user.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
                                    user.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
                                    return Mono.just(user);
                                }
                        )
                )
                .flatMap(userDao::updateUser)
                .then();
    }
}
