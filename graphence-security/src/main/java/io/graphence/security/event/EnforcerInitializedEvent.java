package io.graphence.security.event;

import io.graphence.core.casbin.adapter.RBACAdapter;
import io.graphence.core.config.CasbinConfig;
import io.graphence.core.repository.RBACPolicyRepository;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.casbin.jcasbin.persist.file_adapter.FileAdapter;
import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

import static io.graphence.core.event.PermissionBuildEvent.PERMISSION_BUILD_SCOPE_EVENT_PRIORITY;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(EnforcerInitializedEvent.ENFORCER_INITIALIZED_SCOPE_EVENT_PRIORITY)
public class EnforcerInitializedEvent implements ScopeEvent {

    public static final int ENFORCER_INITIALIZED_SCOPE_EVENT_PRIORITY = PERMISSION_BUILD_SCOPE_EVENT_PRIORITY + 10;

    private final RBACPolicyRepository rbacPolicyRepository;
    private final RBACAdapter rbacAdapter;
    private final Enforcer enforcer;
    private final CasbinConfig config;

    @Inject
    public EnforcerInitializedEvent(RBACPolicyRepository rbacPolicyRepository, io.graphence.core.casbin.adapter.RBACAdapter rbacAdapter, Enforcer enforcer, CasbinConfig config) {
        this.rbacPolicyRepository = rbacPolicyRepository;
        this.rbacAdapter = rbacAdapter;
        this.enforcer = enforcer;
        this.config = config;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (config.getPolicy() != null) {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(config.getPolicy());
            enforcer.setAdapter(new FileAdapter(Objects.requireNonNull(inputStream)));
            return Mono.empty();
        }
        return rbacPolicyRepository.queryRoleList()
                .flatMap(roles ->
                        rbacPolicyRepository.queryGroupList()
                                .map(groups ->
                                        rbacAdapter.setRoles(roles, groups)
                                )
                )
                .doOnSuccess(enforcer::setAdapter)
                .doOnSuccess(adapter -> enforcer.loadPolicy())
                .then();
    }
}
