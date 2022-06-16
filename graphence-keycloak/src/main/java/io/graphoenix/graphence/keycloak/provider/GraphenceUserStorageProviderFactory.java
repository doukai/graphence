package io.graphoenix.graphence.keycloak.provider;

import com.google.auto.service.AutoService;
import org.keycloak.Config;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;
import org.tinylog.Logger;

@AutoService(UserStorageProviderFactory.class)
public class GraphenceUserStorageProviderFactory implements UserStorageProviderFactory<GraphenceUserStorageProvider> {

    @Override
    public GraphenceUserStorageProvider create(KeycloakSession session, ComponentModel model) {
        return new GraphenceUserStorageProvider(session, model);
    }

    @Override
    public String getId() {
        return "graphence";
    }

    @Override
    public void init(Config.Scope config) {
        Logger.info(config);
        UserStorageProviderFactory.super.init(config);
    }
}