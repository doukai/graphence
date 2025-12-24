package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Subscription
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Subscription")
public class Subscription {
  /**
   * Subscription Field for 用户
   */
  @Description("Subscription Field for 用户")
  private User user;

  /**
   * Subscription Field for 用户 List
   */
  @Description("Subscription Field for 用户 List")
  private Collection<User> userList;

  /**
   * Subscription Field for 用户 Connection
   */
  @Description("Subscription Field for 用户 Connection")
  private UserConnection userConnection;

  /**
   * Subscription Field for 角色
   */
  @Description("Subscription Field for 角色")
  private Role role;

  /**
   * Subscription Field for 角色 List
   */
  @Description("Subscription Field for 角色 List")
  private Collection<Role> roleList;

  /**
   * Subscription Field for 角色 Connection
   */
  @Description("Subscription Field for 角色 Connection")
  private RoleConnection roleConnection;

  /**
   * Subscription Field for 组
   */
  @Description("Subscription Field for 组")
  private Group group;

  /**
   * Subscription Field for 组 List
   */
  @Description("Subscription Field for 组 List")
  private Collection<Group> groupList;

  /**
   * Subscription Field for 组 Connection
   */
  @Description("Subscription Field for 组 Connection")
  private GroupConnection groupConnection;

  /**
   * Subscription Field for 租户
   */
  @Description("Subscription Field for 租户")
  private Realm realm;

  /**
   * Subscription Field for 租户 List
   */
  @Description("Subscription Field for 租户 List")
  private Collection<Realm> realmList;

  /**
   * Subscription Field for 租户 Connection
   */
  @Description("Subscription Field for 租户 Connection")
  private RealmConnection realmConnection;

  /**
   * Subscription Field for 权限
   */
  @Description("Subscription Field for 权限")
  private Permission permission;

  /**
   * Subscription Field for 权限 List
   */
  @Description("Subscription Field for 权限 List")
  private Collection<Permission> permissionList;

  /**
   * Subscription Field for 权限 Connection
   */
  @Description("Subscription Field for 权限 Connection")
  private PermissionConnection permissionConnection;

  /**
   * Subscription Field for Relationship Object between 用户 and 手机号
   */
  @Description("Subscription Field for Relationship Object between 用户 and 手机号")
  private UserPhonesRelation userPhonesRelation;

  /**
   * Subscription Field for Relationship Object between 用户 and 手机号 List
   */
  @Description("Subscription Field for Relationship Object between 用户 and 手机号 List")
  private Collection<UserPhonesRelation> userPhonesRelationList;

  /**
   * Subscription Field for Relationship Object between 用户 and 手机号 Connection
   */
  @Description("Subscription Field for Relationship Object between 用户 and 手机号 Connection")
  private UserPhonesRelationConnection userPhonesRelationConnection;

  /**
   * Subscription Field for Relationship Object between 用户 and 组
   */
  @Description("Subscription Field for Relationship Object between 用户 and 组")
  private GroupUserRelation groupUserRelation;

  /**
   * Subscription Field for Relationship Object between 用户 and 组 List
   */
  @Description("Subscription Field for Relationship Object between 用户 and 组 List")
  private Collection<GroupUserRelation> groupUserRelationList;

  /**
   * Subscription Field for Relationship Object between 用户 and 组 Connection
   */
  @Description("Subscription Field for Relationship Object between 用户 and 组 Connection")
  private GroupUserRelationConnection groupUserRelationConnection;

  /**
   * Subscription Field for Relationship Object between 用户 and 角色
   */
  @Description("Subscription Field for Relationship Object between 用户 and 角色")
  private RoleUserRelation roleUserRelation;

  /**
   * Subscription Field for Relationship Object between 用户 and 角色 List
   */
  @Description("Subscription Field for Relationship Object between 用户 and 角色 List")
  private Collection<RoleUserRelation> roleUserRelationList;

  /**
   * Subscription Field for Relationship Object between 用户 and 角色 Connection
   */
  @Description("Subscription Field for Relationship Object between 用户 and 角色 Connection")
  private RoleUserRelationConnection roleUserRelationConnection;

  /**
   * Subscription Field for Relationship Object between 角色 and 组
   */
  @Description("Subscription Field for Relationship Object between 角色 and 组")
  private GroupRoleRelation groupRoleRelation;

  /**
   * Subscription Field for Relationship Object between 角色 and 组 List
   */
  @Description("Subscription Field for Relationship Object between 角色 and 组 List")
  private Collection<GroupRoleRelation> groupRoleRelationList;

  /**
   * Subscription Field for Relationship Object between 角色 and 组 Connection
   */
  @Description("Subscription Field for Relationship Object between 角色 and 组 Connection")
  private GroupRoleRelationConnection groupRoleRelationConnection;

  /**
   * Subscription Field for Relationship Object between 角色 and 角色
   */
  @Description("Subscription Field for Relationship Object between 角色 and 角色")
  private RoleCompositeRelation roleCompositeRelation;

  /**
   * Subscription Field for Relationship Object between 角色 and 角色 List
   */
  @Description("Subscription Field for Relationship Object between 角色 and 角色 List")
  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  /**
   * Subscription Field for Relationship Object between 角色 and 角色 Connection
   */
  @Description("Subscription Field for Relationship Object between 角色 and 角色 Connection")
  private RoleCompositeRelationConnection roleCompositeRelationConnection;

  /**
   * Subscription Field for Relationship Object between 角色 and 权限
   */
  @Description("Subscription Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelation rolePermissionRelation;

  /**
   * Subscription Field for Relationship Object between 角色 and 权限 List
   */
  @Description("Subscription Field for Relationship Object between 角色 and 权限 List")
  private Collection<RolePermissionRelation> rolePermissionRelationList;

  /**
   * Subscription Field for Relationship Object between 角色 and 权限 Connection
   */
  @Description("Subscription Field for Relationship Object between 角色 and 权限 Connection")
  private RolePermissionRelationConnection rolePermissionRelationConnection;

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

  public UserConnection getUserConnection() {
    return this.userConnection;
  }

  public void setUserConnection(UserConnection userConnection) {
    this.userConnection = userConnection;
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

  public RoleConnection getRoleConnection() {
    return this.roleConnection;
  }

  public void setRoleConnection(RoleConnection roleConnection) {
    this.roleConnection = roleConnection;
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

  public GroupConnection getGroupConnection() {
    return this.groupConnection;
  }

  public void setGroupConnection(GroupConnection groupConnection) {
    this.groupConnection = groupConnection;
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

  public RealmConnection getRealmConnection() {
    return this.realmConnection;
  }

  public void setRealmConnection(RealmConnection realmConnection) {
    this.realmConnection = realmConnection;
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

  public PermissionConnection getPermissionConnection() {
    return this.permissionConnection;
  }

  public void setPermissionConnection(PermissionConnection permissionConnection) {
    this.permissionConnection = permissionConnection;
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

  public UserPhonesRelationConnection getUserPhonesRelationConnection() {
    return this.userPhonesRelationConnection;
  }

  public void setUserPhonesRelationConnection(
      UserPhonesRelationConnection userPhonesRelationConnection) {
    this.userPhonesRelationConnection = userPhonesRelationConnection;
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

  public GroupUserRelationConnection getGroupUserRelationConnection() {
    return this.groupUserRelationConnection;
  }

  public void setGroupUserRelationConnection(
      GroupUserRelationConnection groupUserRelationConnection) {
    this.groupUserRelationConnection = groupUserRelationConnection;
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

  public RoleUserRelationConnection getRoleUserRelationConnection() {
    return this.roleUserRelationConnection;
  }

  public void setRoleUserRelationConnection(RoleUserRelationConnection roleUserRelationConnection) {
    this.roleUserRelationConnection = roleUserRelationConnection;
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

  public GroupRoleRelationConnection getGroupRoleRelationConnection() {
    return this.groupRoleRelationConnection;
  }

  public void setGroupRoleRelationConnection(
      GroupRoleRelationConnection groupRoleRelationConnection) {
    this.groupRoleRelationConnection = groupRoleRelationConnection;
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

  public RoleCompositeRelationConnection getRoleCompositeRelationConnection() {
    return this.roleCompositeRelationConnection;
  }

  public void setRoleCompositeRelationConnection(
      RoleCompositeRelationConnection roleCompositeRelationConnection) {
    this.roleCompositeRelationConnection = roleCompositeRelationConnection;
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

  public RolePermissionRelationConnection getRolePermissionRelationConnection() {
    return this.rolePermissionRelationConnection;
  }

  public void setRolePermissionRelationConnection(
      RolePermissionRelationConnection rolePermissionRelationConnection) {
    this.rolePermissionRelationConnection = rolePermissionRelationConnection;
  }
}
