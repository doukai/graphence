package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for Relationship Object between 用户 and 角色
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for Relationship Object between 用户 and 角色")
public class RoleUserRelationEdge {
  /**
   * Node
   */
  @Description("Node")
  private RoleUserRelation node;

  /**
   * Cursor
   */
  @Description("Cursor")
  private String cursor;

  public RoleUserRelation getNode() {
    return this.node;
  }

  public void setNode(RoleUserRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
