package io.graphoenix.graphence;

import io.graphoenix.core.context.SessionScopeInstanceFactory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.enterprise.inject.Produces;
import reactor.core.publisher.Mono;

@ApplicationScoped
public class CurrentUserProducer {

    @Produces
    @SessionScoped
    public Mono<CurrentUser> currentUser() {
        return SessionScopeInstanceFactory.get(CurrentUser.class);
    }
}
