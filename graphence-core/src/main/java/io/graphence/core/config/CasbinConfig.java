package io.graphence.core.config;

import com.typesafe.config.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "casbin")
public class CasbinConfig {

    @Optional
    private String model = "model.conf";

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
