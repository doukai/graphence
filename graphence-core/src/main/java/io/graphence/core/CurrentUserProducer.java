package io.graphence.core;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.context.RequestScopeInstanceFactory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.enterprise.inject.Produces;
import reactor.core.publisher.Mono;

@ApplicationScoped
public class CurrentUserProducer {

    @Produces
    @SessionScoped
    public Mono<CurrentUser> currentUser() {
        return RequestScopeInstanceFactory.get(CurrentUser.class);
    }
}
