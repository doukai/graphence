package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 变更
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("变更")
public class Mutation {
  /**
   * 用户 变更接口
   */
  @Description("用户 变更接口")
  private User user;

  /**
   * 用户列表 变更接口
   */
  @Description("用户列表 变更接口")
  private Collection<User> userList;

  /**
   * 角色 变更接口
   */
  @Description("角色 变更接口")
  private Role role;

  /**
   * 角色列表 变更接口
   */
  @Description("角色列表 变更接口")
  private Collection<Role> roleList;

  /**
   * 组 变更接口
   */
  @Description("组 变更接口")
  private Group group;

  /**
   * 组列表 变更接口
   */
  @Description("组列表 变更接口")
  private Collection<Group> groupList;

  /**
   * 租户 变更接口
   */
  @Description("租户 变更接口")
  private Realm realm;

  /**
   * 租户列表 变更接口
   */
  @Description("租户列表 变更接口")
  private Collection<Realm> realmList;

  /**
   * 权限 变更接口
   */
  @Description("权限 变更接口")
  private Permission permission;

  /**
   * 权限列表 变更接口
   */
  @Description("权限列表 变更接口")
  private Collection<Permission> permissionList;

  /**
   * 用户 手机号 关系 变更接口
   */
  @Description("用户 手机号 关系 变更接口")
  private UserPhonesRelation userPhonesRelation;

  /**
   * 用户 手机号 关系列表 变更接口
   */
  @Description("用户 手机号 关系列表 变更接口")
  private Collection<UserPhonesRelation> userPhonesRelationList;

  /**
   * 用户 组 关系 变更接口
   */
  @Description("用户 组 关系 变更接口")
  private GroupUserRelation groupUserRelation;

  /**
   * 用户 组 关系列表 变更接口
   */
  @Description("用户 组 关系列表 变更接口")
  private Collection<GroupUserRelation> groupUserRelationList;

  /**
   * 用户 角色 关系 变更接口
   */
  @Description("用户 角色 关系 变更接口")
  private RoleUserRelation roleUserRelation;

  /**
   * 用户 角色 关系列表 变更接口
   */
  @Description("用户 角色 关系列表 变更接口")
  private Collection<RoleUserRelation> roleUserRelationList;

  /**
   * 角色 组 关系 变更接口
   */
  @Description("角色 组 关系 变更接口")
  private GroupRoleRelation groupRoleRelation;

  /**
   * 角色 组 关系列表 变更接口
   */
  @Description("角色 组 关系列表 变更接口")
  private Collection<GroupRoleRelation> groupRoleRelationList;

  /**
   * 角色 角色 关系 变更接口
   */
  @Description("角色 角色 关系 变更接口")
  private RoleCompositeRelation roleCompositeRelation;

  /**
   * 角色 角色 关系列表 变更接口
   */
  @Description("角色 角色 关系列表 变更接口")
  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  /**
   * 角色 权限 关系 变更接口
   */
  @Description("角色 权限 关系 变更接口")
  private RolePermissionRelation rolePermissionRelation;

  /**
   * 角色 权限 关系列表 变更接口
   */
  @Description("角色 权限 关系列表 变更接口")
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
