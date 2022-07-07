package io.graphoenix.graphence;

import io.graphoenix.core.context.RequestInstanceFactory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class CurrentUserProducer {

    @Produces
    @RequestScoped
    public Instance<CurrentUser> requestCurrentUser() {
        CurrentUser something = new CurrentUser();
        something.setLogin(Math.random() + "");
        return RequestInstanceFactory.getInstance(something);
    }
}
