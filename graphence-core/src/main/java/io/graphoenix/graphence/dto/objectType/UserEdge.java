package io.graphoenix.graphence.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class UserEdge {
  private User node;

  @Id
  private String cursor;

  public User getNode() {
    return this.node;
  }

  public void setNode(User node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
