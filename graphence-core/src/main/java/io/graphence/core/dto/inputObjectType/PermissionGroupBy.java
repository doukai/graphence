package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for 权限
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for 权限")
public class PermissionGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 角色
   */
  @Description("角色")
  private RoleGroupBy roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmGroupBy realm;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  private RolePermissionRelationGroupBy rolePermissionRelation;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<PermissionGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public RoleGroupBy getRoles() {
    return this.roles;
  }

  public void setRoles(RoleGroupBy roles) {
    this.roles = roles;
  }

  public RealmGroupBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmGroupBy realm) {
    this.realm = realm;
  }

  public RolePermissionRelationGroupBy getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(RolePermissionRelationGroupBy rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
  }

  public Collection<PermissionGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<PermissionGroupBy> gbs) {
    this.gbs = gbs;
  }
}
