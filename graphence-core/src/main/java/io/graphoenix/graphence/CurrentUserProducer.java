package io.graphoenix.graphence;

import io.graphoenix.core.context.RequestPublisherBuilderFactory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.reactive.streams.operators.PublisherBuilder;

@ApplicationScoped
public class CurrentUserProducer {

    @Produces
    @RequestScoped
    public PublisherBuilder<CurrentUser> requestCurrentUser() {
        CurrentUser something = new CurrentUser();
        something.setLogin(Math.random() + "");
        return RequestPublisherBuilderFactory.getPublisherBuilder(something);
    }
}
