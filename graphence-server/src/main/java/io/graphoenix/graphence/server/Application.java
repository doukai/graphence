package io.graphoenix.graphence.server;

import io.graphoenix.core.context.BeanContext;
import io.graphoenix.http.server.GraphQLHttpServer;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.graphql.GraphQLApi;

@GraphQLApi
@ApplicationScoped
public class Application {

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        GraphQLHttpServer graphqlHttpServer = BeanContext.get(GraphQLHttpServer.class);
        graphqlHttpServer.run();
    }
}
