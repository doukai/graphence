package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for 权限
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for 权限")
public class PermissionEdge {
  /**
   * Node
   */
  @Description("Node")
  private Permission node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public Permission getNode() {
    return this.node;
  }

  public void setNode(Permission node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
