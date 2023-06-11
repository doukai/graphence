package io.graphence.core.casbin;

import io.graphence.core.config.CasbinConfig;
import io.graphence.core.casbin.adapter.RBACAdapter;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.casbin.jcasbin.main.SyncedEnforcer;
import org.casbin.jcasbin.model.Model;

import java.util.Objects;

@ApplicationScoped
public class RBACEnforcer {

    private final Enforcer enforcer;

    @Inject
    public RBACEnforcer(CasbinConfig config) {
        Model model = new Model();
        model.loadModel(Objects.requireNonNull(this.getClass().getClassLoader().getResource(config.getModel())).getFile());

        if (config.getSynced()) {
            enforcer = new SyncedEnforcer(model);
        } else {
            enforcer = new Enforcer(model);
        }
    }

    public Enforcer getEnforcer() {
        return enforcer;
    }

    public void setAdapter(RBACAdapter adapter) {
        this.enforcer.setAdapter(adapter);
        this.enforcer.loadPolicy();
    }
}
