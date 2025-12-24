package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Mutation
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation")
public class Mutation {
  /**
   * Mutation Field for 用户
   */
  @Description("Mutation Field for 用户")
  private User user;

  /**
   * Mutation Field for 用户 List
   */
  @Description("Mutation Field for 用户 List")
  private Collection<User> userList;

  /**
   * Mutation Field for 角色
   */
  @Description("Mutation Field for 角色")
  private Role role;

  /**
   * Mutation Field for 角色 List
   */
  @Description("Mutation Field for 角色 List")
  private Collection<Role> roleList;

  /**
   * Mutation Field for 组
   */
  @Description("Mutation Field for 组")
  private Group group;

  /**
   * Mutation Field for 组 List
   */
  @Description("Mutation Field for 组 List")
  private Collection<Group> groupList;

  /**
   * Mutation Field for 租户
   */
  @Description("Mutation Field for 租户")
  private Realm realm;

  /**
   * Mutation Field for 租户 List
   */
  @Description("Mutation Field for 租户 List")
  private Collection<Realm> realmList;

  /**
   * Mutation Field for 权限
   */
  @Description("Mutation Field for 权限")
  private Permission permission;

  /**
   * Mutation Field for 权限 List
   */
  @Description("Mutation Field for 权限 List")
  private Collection<Permission> permissionList;

  /**
   * Mutation Field for Relationship Object between 用户 and 手机号
   */
  @Description("Mutation Field for Relationship Object between 用户 and 手机号")
  private UserPhonesRelation userPhonesRelation;

  /**
   * Mutation Field for Relationship Object between 用户 and 手机号 List
   */
  @Description("Mutation Field for Relationship Object between 用户 and 手机号 List")
  private Collection<UserPhonesRelation> userPhonesRelationList;

  /**
   * Mutation Field for Relationship Object between 用户 and 组
   */
  @Description("Mutation Field for Relationship Object between 用户 and 组")
  private GroupUserRelation groupUserRelation;

  /**
   * Mutation Field for Relationship Object between 用户 and 组 List
   */
  @Description("Mutation Field for Relationship Object between 用户 and 组 List")
  private Collection<GroupUserRelation> groupUserRelationList;

  /**
   * Mutation Field for Relationship Object between 用户 and 角色
   */
  @Description("Mutation Field for Relationship Object between 用户 and 角色")
  private RoleUserRelation roleUserRelation;

  /**
   * Mutation Field for Relationship Object between 用户 and 角色 List
   */
  @Description("Mutation Field for Relationship Object between 用户 and 角色 List")
  private Collection<RoleUserRelation> roleUserRelationList;

  /**
   * Mutation Field for Relationship Object between 角色 and 组
   */
  @Description("Mutation Field for Relationship Object between 角色 and 组")
  private GroupRoleRelation groupRoleRelation;

  /**
   * Mutation Field for Relationship Object between 角色 and 组 List
   */
  @Description("Mutation Field for Relationship Object between 角色 and 组 List")
  private Collection<GroupRoleRelation> groupRoleRelationList;

  /**
   * Mutation Field for Relationship Object between 角色 and 角色
   */
  @Description("Mutation Field for Relationship Object between 角色 and 角色")
  private RoleCompositeRelation roleCompositeRelation;

  /**
   * Mutation Field for Relationship Object between 角色 and 角色 List
   */
  @Description("Mutation Field for Relationship Object between 角色 and 角色 List")
  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  /**
   * Mutation Field for Relationship Object between 角色 and 权限
   */
  @Description("Mutation Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelation rolePermissionRelation;

  /**
   * Mutation Field for Relationship Object between 角色 and 权限 List
   */
  @Description("Mutation Field for Relationship Object between 角色 and 权限 List")
  private Collection<RolePermissionRelation> rolePermissionRelationList;

  private String login;

  private User currentUserUpdate;

  private User currentUserResetPassword;

  private Boolean syncModelPolicy;

  private Boolean syncPermissionRoleRelationPolicy;

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Collection<User> getUserList() {
    return this.userList;
  }

  public void setUserList(Collection<User> userList) {
    this.userList = userList;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Collection<Role> getRoleList() {
    return this.roleList;
  }

  public void setRoleList(Collection<Role> roleList) {
    this.roleList = roleList;
  }

  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Collection<Group> getGroupList() {
    return this.groupList;
  }

  public void setGroupList(Collection<Group> groupList) {
    this.groupList = groupList;
  }

  public Realm getRealm() {
    return this.realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
  }

  public Collection<Realm> getRealmList() {
    return this.realmList;
  }

  public void setRealmList(Collection<Realm> realmList) {
    this.realmList = realmList;
  }

  public Permission getPermission() {
    return this.permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
  }

  public Collection<Permission> getPermissionList() {
    return this.permissionList;
  }

  public void setPermissionList(Collection<Permission> permissionList) {
    this.permissionList = permissionList;
  }

  public UserPhonesRelation getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  public void setUserPhonesRelation(UserPhonesRelation userPhonesRelation) {
    this.userPhonesRelation = userPhonesRelation;
  }

  public Collection<UserPhonesRelation> getUserPhonesRelationList() {
    return this.userPhonesRelationList;
  }

  public void setUserPhonesRelationList(Collection<UserPhonesRelation> userPhonesRelationList) {
    this.userPhonesRelationList = userPhonesRelationList;
  }

  public GroupUserRelation getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelation groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public Collection<GroupUserRelation> getGroupUserRelationList() {
    return this.groupUserRelationList;
  }

  public void setGroupUserRelationList(Collection<GroupUserRelation> groupUserRelationList) {
    this.groupUserRelationList = groupUserRelationList;
  }

  public RoleUserRelation getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(RoleUserRelation roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public Collection<RoleUserRelation> getRoleUserRelationList() {
    return this.roleUserRelationList;
  }

  public void setRoleUserRelationList(Collection<RoleUserRelation> roleUserRelationList) {
    this.roleUserRelationList = roleUserRelationList;
  }

  public GroupRoleRelation getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(GroupRoleRelation groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public Collection<GroupRoleRelation> getGroupRoleRelationList() {
    return this.groupRoleRelationList;
  }

  public void setGroupRoleRelationList(Collection<GroupRoleRelation> groupRoleRelationList) {
    this.groupRoleRelationList = groupRoleRelationList;
  }

  public RoleCompositeRelation getRoleCompositeRelation() {
    return this.roleCompositeRelation;
  }

  public void setRoleCompositeRelation(RoleCompositeRelation roleCompositeRelation) {
    this.roleCompositeRelation = roleCompositeRelation;
  }

  public Collection<RoleCompositeRelation> getRoleCompositeRelationList() {
    return this.roleCompositeRelationList;
  }

  public void setRoleCompositeRelationList(
      Collection<RoleCompositeRelation> roleCompositeRelationList) {
    this.roleCompositeRelationList = roleCompositeRelationList;
  }

  public RolePermissionRelation getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(RolePermissionRelation rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
  }

  public Collection<RolePermissionRelation> getRolePermissionRelationList() {
    return this.rolePermissionRelationList;
  }

  public void setRolePermissionRelationList(
      Collection<RolePermissionRelation> rolePermissionRelationList) {
    this.rolePermissionRelationList = rolePermissionRelationList;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User getCurrentUserUpdate() {
    return this.currentUserUpdate;
  }

  public void setCurrentUserUpdate(User currentUserUpdate) {
    this.currentUserUpdate = currentUserUpdate;
  }

  public User getCurrentUserResetPassword() {
    return this.currentUserResetPassword;
  }

  public void setCurrentUserResetPassword(User currentUserResetPassword) {
    this.currentUserResetPassword = currentUserResetPassword;
  }

  public Boolean getSyncModelPolicy() {
    return this.syncModelPolicy;
  }

  public void setSyncModelPolicy(Boolean syncModelPolicy) {
    this.syncModelPolicy = syncModelPolicy;
  }

  public Boolean getSyncPermissionRoleRelationPolicy() {
    return this.syncPermissionRoleRelationPolicy;
  }

  public void setSyncPermissionRoleRelationPolicy(Boolean syncPermissionRoleRelationPolicy) {
    this.syncPermissionRoleRelationPolicy = syncPermissionRoleRelationPolicy;
  }
}
