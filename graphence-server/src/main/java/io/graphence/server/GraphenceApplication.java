package io.graphence.server;

import io.graphoenix.spi.annotation.Application;

import static io.graphoenix.core.bootstrap.App.APP;

@Application
public class GraphenceApplication {

    public static void main(String[] args) {
        APP.run(args);
    }
}
