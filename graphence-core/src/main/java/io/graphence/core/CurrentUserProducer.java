package io.graphence.core;

import io.graphence.core.dto.CurrentUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class CurrentUserProducer {

    @Produces
    @RequestScoped
    public CurrentUser currentUser() {
        return new CurrentUser();
    }
}
