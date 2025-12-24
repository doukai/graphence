package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 角色 and 权限
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 角色 and 权限")
public class RolePermissionRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private RolePermissionRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public RolePermissionRelation getNode() {
    return this.node;
  }

  public void setNode(RolePermissionRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
