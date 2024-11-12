package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 角色 权限 关系 边缘
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 权限 关系 边缘")
public class PermissionRoleRelationEdge {
  /**
   * 节点
   */
  @Description("节点")
  private PermissionRoleRelation node;

  /**
   * 游标
   */
  @Description("游标")
  private String cursor;

  public PermissionRoleRelation getNode() {
    return this.node;
  }

  public void setNode(PermissionRoleRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
