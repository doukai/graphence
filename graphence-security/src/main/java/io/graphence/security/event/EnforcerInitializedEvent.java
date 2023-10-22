package io.graphence.security.event;

import com.google.auto.service.AutoService;
import io.graphoenix.core.context.BeanContext;
import io.graphence.core.casbin.adapter.RBACAdapter;
import io.graphence.core.dao.RBACPolicyDao;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import org.casbin.jcasbin.main.Enforcer;
import reactor.core.publisher.Mono;

import java.util.Map;

@Initialized(ApplicationScoped.class)
@Priority(3)
@AutoService(ScopeEvent.class)
public class EnforcerInitializedEvent implements ScopeEvent {

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        RBACPolicyDao rbacPolicyDao = BeanContext.get(RBACPolicyDao.class);
        RBACAdapter RBACAdapter = BeanContext.get(RBACAdapter.class);
        Enforcer enforcer = BeanContext.get(Enforcer.class);
        return rbacPolicyDao.queryRoleList()
                .map(RBACAdapter::setRoles)
                .doOnSuccess(enforcer::setAdapter)
                .doOnSuccess(adapter -> enforcer.loadPolicy())
                .then();
    }
}
