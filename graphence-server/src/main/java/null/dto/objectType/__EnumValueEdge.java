package null.dto.objectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class __EnumValueEdge {
  private __EnumValue node;

  @Id
  private String cursor;

  public __EnumValue getNode() {
    return this.node;
  }

  public void setNode(__EnumValue node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}