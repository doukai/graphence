package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for Relationship Object between 用户 and 角色
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for Relationship Object between 用户 and 角色")
public class RoleUserRelationGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 用户
   */
  @Description("用户")
  private UserGroupBy user;

  /**
   * 角色
   */
  @Description("角色")
  private RoleGroupBy role;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<RoleUserRelationGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public UserGroupBy getUser() {
    return this.user;
  }

  public void setUser(UserGroupBy user) {
    this.user = user;
  }

  public RoleGroupBy getRole() {
    return this.role;
  }

  public void setRole(RoleGroupBy role) {
    this.role = role;
  }

  public Collection<RoleUserRelationGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<RoleUserRelationGroupBy> gbs) {
    this.gbs = gbs;
  }
}
