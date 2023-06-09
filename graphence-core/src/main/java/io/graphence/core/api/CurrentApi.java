package io.graphence.core.api;

import io.graphence.core.dto.CurrentUser;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.reactive.streams.operators.PublisherBuilder;

@GraphQLApi
@ApplicationScoped
public class CurrentApi {

    private final Provider<PublisherBuilder<CurrentUser>> currentUser;

    @Inject
    public CurrentApi(Provider<PublisherBuilder<CurrentUser>> currentUser) {
        this.currentUser = currentUser;
    }

    @Query
    @PermitAll
    public PublisherBuilder<CurrentUser> current() {
        return currentUser.get();
    }
}
