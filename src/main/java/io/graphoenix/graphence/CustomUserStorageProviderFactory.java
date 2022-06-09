package io.graphoenix.graphence;

import com.google.auto.service.AutoService;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

@AutoService(UserStorageProviderFactory.class)
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