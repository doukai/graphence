package io.graphence.core.produces;

import io.graphence.core.config.CasbinConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.casbin.jcasbin.main.SyncedEnforcer;
import org.casbin.jcasbin.model.Model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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
    try (InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream(config.getModel())) {
      if (inputStream == null) {
        throw new IllegalStateException("casbin model not found: " + config.getModel());
      }
      Model model = new Model();
      String modelText = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
      model.loadModelFromText(modelText);
      return model;
    } catch (IOException e) {
      throw new IllegalStateException("failed to load casbin model: " + config.getModel(), e);
    }
  }
}
