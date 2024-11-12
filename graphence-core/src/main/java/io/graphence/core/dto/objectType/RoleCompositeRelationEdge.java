package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 角色 角色 关系 边缘
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 角色 关系 边缘")
public class RoleCompositeRelationEdge {
  /**
   * 节点
   */
  @Description("节点")
  private RoleCompositeRelation node;

  /**
   * 游标
   */
  @Description("游标")
  private String cursor;

  public RoleCompositeRelation getNode() {
    return this.node;
  }

  public void setNode(RoleCompositeRelation node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
