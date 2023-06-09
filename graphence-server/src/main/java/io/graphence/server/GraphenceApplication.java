package io.graphence.server;

import io.graphoenix.core.bootstrap.GraphoenixStarter;
import io.graphoenix.gossip.cluster.GossipPackageCluster;
import io.graphoenix.grpc.server.GraphQLGrpcGraphoenixServer;
import io.graphoenix.http.server.GraphQLHttpGraphoenixServer;
import io.graphoenix.spi.annotation.Application;

@Application
public class GraphenceApplication {

    public static void main(String[] args) {
        new GraphenceApplication().run();
    }

    private void run() {
        GraphoenixStarter.with(GraphQLHttpGraphoenixServer.class, GraphQLGrpcGraphoenixServer.class, GossipPackageCluster.class).run();
    }
}
