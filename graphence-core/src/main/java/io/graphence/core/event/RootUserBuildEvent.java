package io.graphence.core.event;

import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.handler.PasswordChecker;
import io.graphence.core.handler.BcryptChecker;
import io.graphence.core.repository.UserRepository;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

import static io.graphoenix.core.event.DocumentInitializedEvent.DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(RootUserBuildEvent.ROOT_USER_BUILD_SCOPE_EVENT_PRIORITY)
public class RootUserBuildEvent implements ScopeEvent {

    public static final int ROOT_USER_BUILD_SCOPE_EVENT_PRIORITY = DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY + 110;
    private final SecurityConfig securityConfig;
    private final UserRepository userRepository;
    private final PasswordChecker passwordChecker;

    @Inject
    public RootUserBuildEvent(SecurityConfig securityConfig,
                              UserRepository userRepository,
                              Provider<PasswordChecker> passwordCheckerProvider) {
        this.securityConfig = securityConfig;
        this.userRepository = userRepository;
        this.passwordChecker = Optional.ofNullable(passwordCheckerProvider.get()).orElse(new BcryptChecker());
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (securityConfig.getRootUser() == null || securityConfig.getRootPassword() == null) {
            return Mono.empty();
        }
        UserInput userInput = new UserInput();
        userInput.setLogin(securityConfig.getRootUser());
        userInput.setName(securityConfig.getRootUser());
        passwordChecker.hash(securityConfig.getRootPassword(), userInput);
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
