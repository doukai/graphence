package io.graphoenix.graphence.dto.inputObjectType;

import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class InvokeParameter {
  private String name;

  private String className;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getClassName() {
    return this.className;
  }

  public void setClassName(String className) {
    this.className = className;
  }
}
