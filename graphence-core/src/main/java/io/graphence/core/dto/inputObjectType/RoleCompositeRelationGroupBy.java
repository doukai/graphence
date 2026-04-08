package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for Relationship Object between 角色 and 角色
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for Relationship Object between 角色 and 角色")
public class RoleCompositeRelationGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 角色
   */
  @Description("角色")
  private RoleGroupBy role;

  /**
   * 角色
   */
  @Description("角色")
  private RoleGroupBy composite;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<RoleCompositeRelationGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public RoleGroupBy getRole() {
    return this.role;
  }

  public void setRole(RoleGroupBy role) {
    this.role = role;
  }

  public RoleGroupBy getComposite() {
    return this.composite;
  }

  public void setComposite(RoleGroupBy composite) {
    this.composite = composite;
  }

  public Collection<RoleCompositeRelationGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<RoleCompositeRelationGroupBy> gbs) {
    this.gbs = gbs;
  }
}
