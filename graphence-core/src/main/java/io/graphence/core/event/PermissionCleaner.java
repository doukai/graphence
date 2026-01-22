package io.graphence.core.event;

import io.graphence.core.config.SecurityConfig;
import io.graphoenix.spi.handler.TypeEmptyHandler;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import static io.graphence.core.event.PermissionBuilder.PERMISSION_BUILD_SCOPE_EVENT_PRIORITY;

@ApplicationScoped
public class PermissionCleaner {

    private static final Logger logger = LoggerFactory.getLogger(PermissionCleaner.class);

    public static final int PERMISSION_CLEAN_SCOPE_EVENT_PRIORITY = PERMISSION_BUILD_SCOPE_EVENT_PRIORITY - 1;

    private final SecurityConfig securityConfig;
    private final TypeEmptyHandler typeEmptyHandler;

    @Inject
    public PermissionCleaner(SecurityConfig securityConfig, TypeEmptyHandler typeEmptyHandler) {
        this.securityConfig = securityConfig;
        this.typeEmptyHandler = typeEmptyHandler;
    }

    public Mono<Void> cleanPermission(@Observes @Initialized(ApplicationScoped.class) @Priority(PermissionCleaner.PERMISSION_CLEAN_SCOPE_EVENT_PRIORITY) Object event) {
        if (!securityConfig.getBuildPermission()) {
            return Mono.empty();
        }
        logger.info("permissions clean started");
        return typeEmptyHandler
                .empty("Permission")
                .doOnSuccess((v) -> logger.info("permissions clean success"));
    }
}
