package io.graphence.core.event;

import com.google.auto.service.AutoService;
import io.graphoenix.core.context.BeanContext;
import io.graphence.core.casbin.RBACEnforcer;
import io.graphence.core.casbin.adapter.CasbinRBACAdapter;
import io.graphence.spi.dao.RBACPolicyDao;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import reactor.core.publisher.Mono;

import java.util.Map;

@Initialized(ApplicationScoped.class)
@Priority(3)
@AutoService(ScopeEvent.class)
public class EnforcerInitializedEvent implements ScopeEvent {

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        RBACPolicyDao rbacPolicyDao = BeanContext.get(RBACPolicyDao.class);
        CasbinRBACAdapter casbinRBACAdapter = BeanContext.get(CasbinRBACAdapter.class);
        RBACEnforcer rbacEnforcer = BeanContext.get(RBACEnforcer.class);
        try {
            return rbacPolicyDao.queryRoleList()
                    .map(casbinRBACAdapter::setRoles)
                    .flatMap(adapter -> Mono.fromRunnable(() -> rbacEnforcer.setAdapter(adapter)))
                    .then();
        } catch (Exception e) {
            return Mono.error(e).then();
        }
    }
}
