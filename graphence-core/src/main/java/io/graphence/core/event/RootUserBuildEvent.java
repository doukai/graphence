package io.graphence.core.event;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.repository.UserRepository;
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
    private final UserRepository userRepository;

    @Inject
    public RootUserBuildEvent(SecurityConfig securityConfig, UserRepository userRepository) {
        this.securityConfig = securityConfig;
        this.userRepository = userRepository;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (securityConfig.getRootUser() == null || securityConfig.getRootPassword() == null) {
            return Mono.empty();
        }
        Hash hash = Password.hash(securityConfig.getRootPassword()).withBcrypt();
        UserInput userInput = new UserInput();
        userInput.setLogin(securityConfig.getRootUser());
        userInput.setName(securityConfig.getRootUser());
        userInput.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
        userInput.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
        return userRepository.getUserIdByLogin(securityConfig.getRootUser())
                .map(user -> {
                            userInput.setId(user.getId());
                            return userInput;
                        }
                )
                .defaultIfEmpty(userInput)
                .flatMap(userRepository::updateUser)
                .then();
    }
}
