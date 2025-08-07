package io.graphence.core.event;

import io.graphence.core.config.SecurityConfig;
import io.graphoenix.spi.handler.TypeEmptyHandler;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import org.tinylog.Logger;
import reactor.core.publisher.Mono;

import java.util.Map;

import static io.graphence.core.event.PermissionBuildEvent.PERMISSION_BUILD_SCOPE_EVENT_PRIORITY;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(PermissionCleanEvent.PERMISSION_CLEAN_SCOPE_EVENT_PRIORITY)
public class PermissionCleanEvent implements ScopeEvent {

    public static final int PERMISSION_CLEAN_SCOPE_EVENT_PRIORITY = PERMISSION_BUILD_SCOPE_EVENT_PRIORITY - 1;

    private final SecurityConfig securityConfig;
    private final TypeEmptyHandler typeEmptyHandler;

    @Inject
    public PermissionCleanEvent(SecurityConfig securityConfig, TypeEmptyHandler typeEmptyHandler) {
        this.securityConfig = securityConfig;
        this.typeEmptyHandler = typeEmptyHandler;
    }


    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (!securityConfig.getBuildPermission()) {
            return Mono.empty();
        }
        Logger.info("permissions clean started");
        return typeEmptyHandler
                .empty("Permission")
                .doOnSuccess((v) -> Logger.info("permissions clean success"));
    }
}
