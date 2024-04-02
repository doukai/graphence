package io.graphence.security.event;

import io.graphence.core.casbin.adapter.RBACAdapter;
import io.graphence.core.dao.RBACPolicyDao;
import io.nozdormu.spi.event.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import org.casbin.jcasbin.main.Enforcer;
import reactor.core.publisher.Mono;

import java.util.Map;

@ApplicationScoped
@Initialized(ApplicationScoped.class)
@Priority(310)
public class EnforcerInitializedEvent implements ScopeEvent {

    private final RBACPolicyDao rbacPolicyDao;
    private final RBACAdapter rbacAdapter;
    private final Enforcer enforcer;

    public EnforcerInitializedEvent(RBACPolicyDao rbacPolicyDao, io.graphence.core.casbin.adapter.RBACAdapter rbacAdapter, Enforcer enforcer) {
        this.rbacPolicyDao = rbacPolicyDao;
        this.rbacAdapter = rbacAdapter;
        this.enforcer = enforcer;
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        return rbacPolicyDao.queryRoleList()
                .map(rbacAdapter::setRoles)
                .doOnSuccess(enforcer::setAdapter)
                .doOnSuccess(adapter -> enforcer.loadPolicy())
                .then();
    }
}
