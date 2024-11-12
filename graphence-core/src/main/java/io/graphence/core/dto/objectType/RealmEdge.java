package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 租户 边缘
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("租户 边缘")
public class RealmEdge {
  /**
   * 节点
   */
  @Description("节点")
  private Realm node;

  /**
   * 游标
   */
  @Description("游标")
  private String cursor;

  public Realm getNode() {
    return this.node;
  }

  public void setNode(Realm node) {
    this.node = node;
  }

  public String getCursor() {
    return this.cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }
}
