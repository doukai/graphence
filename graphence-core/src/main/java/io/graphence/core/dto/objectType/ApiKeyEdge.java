package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for API Key
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Edge Object for API Key")
public class ApiKeyEdge {
  /**
   * Node
   */
  @Description("Node")
  private ApiKey node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public ApiKey getNode() {
    return this.node;
  }

  public void setNode(ApiKey node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
