package io.graphence.core;

import io.graphoenix.core.Graphoenix;
import io.graphoenix.spi.annotation.Application;

@Application
public class GraphenceApplication {

  public static void main(String[] args) {
    Graphoenix.run(args);
  }
}
