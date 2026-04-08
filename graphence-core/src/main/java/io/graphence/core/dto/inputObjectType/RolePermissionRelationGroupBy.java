package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for Relationship Object between 角色 and 权限
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for Relationship Object between 角色 and 权限")
public class RolePermissionRelationGroupBy {
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
   * 权限
   */
  @Description("权限")
  private PermissionGroupBy permission;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<RolePermissionRelationGroupBy> gbs;

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

  public PermissionGroupBy getPermission() {
    return this.permission;
  }

  public void setPermission(PermissionGroupBy permission) {
    this.permission = permission;
  }

  public Collection<RolePermissionRelationGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<RolePermissionRelationGroupBy> gbs) {
    this.gbs = gbs;
  }
}
