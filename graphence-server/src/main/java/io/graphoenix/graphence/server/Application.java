package io.graphoenix.graphence.server;

import io.graphoenix.core.bootstrap.GraphoenixStarter;
import io.graphoenix.http.server.GraphQLHttpGraphoenixServer;
import io.graphoenix.spi.annotation.GraphoenixApplication;

@GraphoenixApplication
public class Application {

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        GraphoenixStarter.with(GraphQLHttpGraphoenixServer.class).run();
    }
}
