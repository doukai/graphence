package io.graphoenix.graphence;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class CustomUserStorageProviderFactory implements UserStorageProviderFactory<CustomUserStorageProvider> {

    @Override
    public CustomUserStorageProvider create(KeycloakSession session, ComponentModel model) {
        return null;
    }

    @Override
    public String getId() {
        return "graphoenix";
    }
}