package io.graphoenix.graphence.server.api;

import io.graphoenix.graphence.CurrentUser;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.reactive.streams.operators.PublisherBuilder;

@GraphQLApi
@ApplicationScoped
public class CurrentApi {

    private final PublisherBuilder<CurrentUser> currentUser;

    @Inject
    public CurrentApi(PublisherBuilder<CurrentUser> currentUser) {
        this.currentUser = currentUser;
    }

    @Query
    @PermitAll
    public PublisherBuilder<CurrentUser> current() {
        return currentUser;
    }
}
