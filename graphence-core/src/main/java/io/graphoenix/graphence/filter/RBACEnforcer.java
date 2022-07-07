package io.graphoenix.graphence.filter;

import io.graphoenix.graphence.adapter.CasbinRBACAdapter;
import io.graphoenix.graphence.config.CasbinConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.casbin.jcasbin.main.SyncedEnforcer;
import org.casbin.jcasbin.model.Model;

import java.util.Objects;

@ApplicationScoped
public class RBACEnforcer {

    private final Enforcer enforcer;
    private final CasbinRBACAdapter adapter;

    @Inject
    public RBACEnforcer(CasbinRBACAdapter adapter, CasbinConfig config) {
        this.adapter = adapter;
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

    void loadPolicy() {
        this.enforcer.setAdapter(adapter);
        this.enforcer.loadPolicy();
    }
}
