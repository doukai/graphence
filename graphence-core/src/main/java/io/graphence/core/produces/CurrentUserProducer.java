package io.graphence.core.produces;

import io.graphence.core.dto.Current;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class CurrentUserProducer {

    @Produces
    @RequestScoped
    public Current currentUser() {
        return new Current();
    }
}
