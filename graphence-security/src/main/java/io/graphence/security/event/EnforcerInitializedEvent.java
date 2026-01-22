package io.graphence.security.event;

import io.graphence.core.casbin.adapter.RBACAdapter;
import io.graphence.core.repository.RBACPolicyRepository;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import reactor.core.publisher.Mono;

import static io.graphence.core.event.PermissionBuilder.PERMISSION_BUILD_SCOPE_EVENT_PRIORITY;

@ApplicationScoped
public class EnforcerInitializedEvent {

    public static final int ENFORCER_INITIALIZED_SCOPE_EVENT_PRIORITY = PERMISSION_BUILD_SCOPE_EVENT_PRIORITY + 10;

    private final RBACPolicyRepository rbacPolicyRepository;
    private final RBACAdapter rbacAdapter;
    private final Enforcer enforcer;

    @Inject
    public EnforcerInitializedEvent(RBACPolicyRepository rbacPolicyRepository, RBACAdapter rbacAdapter, Enforcer enforcer) {
        this.rbacPolicyRepository = rbacPolicyRepository;
        this.rbacAdapter = rbacAdapter;
        this.enforcer = enforcer;
    }

    public Mono<Void> buildRootUser(@Observes @Initialized(ApplicationScoped.class) @Priority(EnforcerInitializedEvent.ENFORCER_INITIALIZED_SCOPE_EVENT_PRIORITY) Object event) {
        return rbacPolicyRepository.queryRoleList()
                .flatMap(roles ->
                        rbacPolicyRepository.queryGroupList()
                                .map(groups ->
                                        rbacAdapter.init(roles, groups)
                                )
                )
                .doOnSuccess(enforcer::setAdapter)
                .doOnSuccess(adapter -> enforcer.loadPolicy())
                .then();
    }
}
