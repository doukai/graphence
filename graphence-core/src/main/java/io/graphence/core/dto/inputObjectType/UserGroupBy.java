package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for 用户")
public class UserGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 组
   */
  @Description("组")
  private GroupGroupBy groups;

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
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  private UserPhonesRelationGroupBy userPhonesRelation;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private GroupUserRelationGroupBy groupUserRelation;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private RoleUserRelationGroupBy roleUserRelation;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<UserGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public GroupGroupBy getGroups() {
    return this.groups;
  }

  public void setGroups(GroupGroupBy groups) {
    this.groups = groups;
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

  public UserPhonesRelationGroupBy getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  public void setUserPhonesRelation(UserPhonesRelationGroupBy userPhonesRelation) {
    this.userPhonesRelation = userPhonesRelation;
  }

  public GroupUserRelationGroupBy getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelationGroupBy groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public RoleUserRelationGroupBy getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(RoleUserRelationGroupBy roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public Collection<UserGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<UserGroupBy> gbs) {
    this.gbs = gbs;
  }
}
