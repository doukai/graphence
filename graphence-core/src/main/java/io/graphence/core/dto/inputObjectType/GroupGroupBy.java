package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for 组
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for 组")
public class GroupGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 上级
   */
  @Description("上级")
  private GroupGroupBy parent;

  /**
   * 下级
   */
  @Description("下级")
  private GroupGroupBy subGroups;

  /**
   * 用户
   */
  @Description("用户")
  private UserGroupBy users;

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
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private GroupUserRelationGroupBy groupUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private GroupRoleRelationGroupBy groupRoleRelation;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<GroupGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public GroupGroupBy getParent() {
    return this.parent;
  }

  public void setParent(GroupGroupBy parent) {
    this.parent = parent;
  }

  public GroupGroupBy getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(GroupGroupBy subGroups) {
    this.subGroups = subGroups;
  }

  public UserGroupBy getUsers() {
    return this.users;
  }

  public void setUsers(UserGroupBy users) {
    this.users = users;
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

  public GroupUserRelationGroupBy getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelationGroupBy groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public GroupRoleRelationGroupBy getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(GroupRoleRelationGroupBy groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public Collection<GroupGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<GroupGroupBy> gbs) {
    this.gbs = gbs;
  }
}
