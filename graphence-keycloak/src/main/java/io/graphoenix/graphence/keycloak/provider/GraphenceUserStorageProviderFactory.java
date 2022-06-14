package io.graphoenix.graphence.keycloak.provider;

import com.google.auto.service.AutoService;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

@AutoService(UserStorageProviderFactory.class)
public class GraphenceUserStorageProviderFactory implements UserStorageProviderFactory<GraphenceUserStorageProvider> {

    @Override
    public GraphenceUserStorageProvider create(KeycloakSession session, ComponentModel model) {
        return null;
    }

    @Override
    public String getId() {
        return "graphoenix";
    }
}