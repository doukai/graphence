package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Edge Object for 租户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Edge Object for 租户")
public class RealmEdge {
  /**
   * Node
   */
  @Description("Node")
  private Realm node;

  /**
   * Cursor
   */
  @Description("Cursor")
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
