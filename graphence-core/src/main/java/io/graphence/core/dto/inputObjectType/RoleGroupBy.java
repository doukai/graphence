package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for 角色
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for 角色")
public class RoleGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 用户
   */
  @Description("用户")
  private UserGroupBy users;

  /**
   * 组
   */
  @Description("组")
  private GroupGroupBy groups;

  /**
   * 组合
   */
  @Description("组合")
  private RoleGroupBy composites;

  /**
   * 权限
   */
  @Description("权限")
  private PermissionGroupBy permissions;

  /**
   * 租户
   */
  @Description("租户")
  private RealmGroupBy realm;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private RoleUserRelationGroupBy roleUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private GroupRoleRelationGroupBy groupRoleRelation;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  private RoleCompositeRelationGroupBy roleCompositeRelation;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  private RolePermissionRelationGroupBy rolePermissionRelation;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<RoleGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public UserGroupBy getUsers() {
    return this.users;
  }

  public void setUsers(UserGroupBy users) {
    this.users = users;
  }

  public GroupGroupBy getGroups() {
    return this.groups;
  }

  public void setGroups(GroupGroupBy groups) {
    this.groups = groups;
  }

  public RoleGroupBy getComposites() {
    return this.composites;
  }

  public void setComposites(RoleGroupBy composites) {
    this.composites = composites;
  }

  public PermissionGroupBy getPermissions() {
    return this.permissions;
  }

  public void setPermissions(PermissionGroupBy permissions) {
    this.permissions = permissions;
  }

  public RealmGroupBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmGroupBy realm) {
    this.realm = realm;
  }

  public RoleUserRelationGroupBy getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(RoleUserRelationGroupBy roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public GroupRoleRelationGroupBy getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(GroupRoleRelationGroupBy groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public RoleCompositeRelationGroupBy getRoleCompositeRelation() {
    return this.roleCompositeRelation;
  }

  public void setRoleCompositeRelation(RoleCompositeRelationGroupBy roleCompositeRelation) {
    this.roleCompositeRelation = roleCompositeRelation;
  }

  public RolePermissionRelationGroupBy getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(RolePermissionRelationGroupBy rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
  }

  public Collection<RoleGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<RoleGroupBy> gbs) {
    this.gbs = gbs;
  }
}
