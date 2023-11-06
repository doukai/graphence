package io.graphence.core.produces;

import io.graphence.core.config.CasbinConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.casbin.jcasbin.main.SyncedEnforcer;
import org.casbin.jcasbin.model.Model;

@ApplicationScoped
public class CasbinProducer {

    private final CasbinConfig config;

    @Inject
    public CasbinProducer(CasbinConfig config) {
        this.config = config;
    }

    @Produces
    @ApplicationScoped
    public Enforcer enforcer(Model model) {
        return new SyncedEnforcer(model);
    }

    @Produces
    @ApplicationScoped
    public Model model() {
        Model model = new Model();
        model.loadModel(config.getModel());
        return model;
    }
}
