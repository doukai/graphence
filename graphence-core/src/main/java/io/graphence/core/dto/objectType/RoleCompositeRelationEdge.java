package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class RoleCompositeRelationEdge {
  private RoleCompositeRelation node;

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
