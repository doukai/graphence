package io.graphoenix.graphence.server.api;

import io.graphoenix.graphence.CurrentUser;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import reactor.core.publisher.Flux;


@GraphQLApi
@ApplicationScoped
public class CurrentApi {

    private final Instance<CurrentUser> currentUser;

    @Inject
    public CurrentApi(Instance<CurrentUser> currentUser) {
        this.currentUser = currentUser;
    }

    @Query
    @PermitAll
    public Flux<CurrentUser> current() {
        return Flux.fromStream(currentUser.stream());
    }
}
