package io.graphence.core.event;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dao.LoginDao;
import io.graphoenix.spi.graphql.common.Arguments;
import io.graphoenix.spi.graphql.operation.Field;
import io.graphoenix.spi.graphql.operation.Operation;
import io.graphoenix.spi.handler.MutationHandler;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Map;

import static io.graphoenix.core.event.DocumentInitializedEvent.DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY;
import static io.graphoenix.spi.constant.Hammurabi.OPERATION_MUTATION_NAME;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(RootUserBuildEvent.ROOT_USER_BUILD_SCOPE_EVENT_PRIORITY)
public class RootUserBuildEvent implements ScopeEvent {

    public static final int ROOT_USER_BUILD_SCOPE_EVENT_PRIORITY = DOCUMENT_INITIALIZED_SCOPE_EVENT_PRIORITY + 110;

    private final MutationHandler mutationHandler;
    private final SecurityConfig securityConfig;
    private final LoginDao loginDao;

    @Inject
    public RootUserBuildEvent(MutationHandler mutationHandler, SecurityConfig securityConfig, LoginDao loginDao) {
        this.mutationHandler = mutationHandler;
        this.securityConfig = securityConfig;
        this.loginDao = loginDao;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (securityConfig.getRootUser() == null || securityConfig.getRootPassword() == null) {
            return Mono.empty();
        }
        Hash hash = Password.hash(securityConfig.getRootPassword()).withBcrypt();
        Arguments userArguments = Arguments.of(
                "login", securityConfig.getRootUser(),
                "name", securityConfig.getRootUser(),
                "salt", Base64.getEncoder().encodeToString(hash.getSaltBytes()),
                "hash", Base64.getEncoder().encodeToString(hash.getResultAsBytes()),
                "createTime", LocalDateTime.now()
        );
        return loginDao.getUserIdByLogin(securityConfig.getRootUser())
                .map(user -> {
                            userArguments.put("id", user.getId());
                            return userArguments;
                        }
                )
                .defaultIfEmpty(userArguments)
                .map(arguments ->
                        new Operation()
                                .setOperationType(OPERATION_MUTATION_NAME)
                                .addSelection(
                                        new Field("user")
                                                .setArguments(arguments)
                                                .addSelection(new Field("id"))
                                )
                )
                .flatMap(mutationHandler::mutation)
                .then();
    }
}
