package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for Relationship Object between 角色 and 组
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for Relationship Object between 角色 and 组")
public class GroupRoleRelationGroupBy {
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
   * 组
   */
  @Description("组")
  private GroupGroupBy group;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<GroupRoleRelationGroupBy> gbs;

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

  public GroupGroupBy getGroup() {
    return this.group;
  }

  public void setGroup(GroupGroupBy group) {
    this.group = group;
  }

  public Collection<GroupRoleRelationGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<GroupRoleRelationGroupBy> gbs) {
    this.gbs = gbs;
  }
}
