package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 订阅
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("订阅")
public class Subscription {
  /**
   * 用户 订阅接口
   */
  @Description("用户 订阅接口")
  private User user;

  /**
   * 用户列表 订阅接口
   */
  @Description("用户列表 订阅接口")
  private Collection<User> userList;

  /**
   * 用户连接 订阅接口
   */
  @Description("用户连接 订阅接口")
  private UserConnection userConnection;

  /**
   * 角色 订阅接口
   */
  @Description("角色 订阅接口")
  private Role role;

  /**
   * 角色列表 订阅接口
   */
  @Description("角色列表 订阅接口")
  private Collection<Role> roleList;

  /**
   * 角色连接 订阅接口
   */
  @Description("角色连接 订阅接口")
  private RoleConnection roleConnection;

  /**
   * 组 订阅接口
   */
  @Description("组 订阅接口")
  private Group group;

  /**
   * 组列表 订阅接口
   */
  @Description("组列表 订阅接口")
  private Collection<Group> groupList;

  /**
   * 组连接 订阅接口
   */
  @Description("组连接 订阅接口")
  private GroupConnection groupConnection;

  /**
   * 租户 订阅接口
   */
  @Description("租户 订阅接口")
  private Realm realm;

  /**
   * 租户列表 订阅接口
   */
  @Description("租户列表 订阅接口")
  private Collection<Realm> realmList;

  /**
   * 租户连接 订阅接口
   */
  @Description("租户连接 订阅接口")
  private RealmConnection realmConnection;

  /**
   * 权限 订阅接口
   */
  @Description("权限 订阅接口")
  private Permission permission;

  /**
   * 权限列表 订阅接口
   */
  @Description("权限列表 订阅接口")
  private Collection<Permission> permissionList;

  /**
   * 权限连接 订阅接口
   */
  @Description("权限连接 订阅接口")
  private PermissionConnection permissionConnection;

  /**
   * 用户 手机号 关系 订阅接口
   */
  @Description("用户 手机号 关系 订阅接口")
  private UserPhonesRelation userPhonesRelation;

  /**
   * 用户 手机号 关系列表 订阅接口
   */
  @Description("用户 手机号 关系列表 订阅接口")
  private Collection<UserPhonesRelation> userPhonesRelationList;

  /**
   * 用户 手机号 关系连接 订阅接口
   */
  @Description("用户 手机号 关系连接 订阅接口")
  private UserPhonesRelationConnection userPhonesRelationConnection;

  /**
   * 用户 组 关系 订阅接口
   */
  @Description("用户 组 关系 订阅接口")
  private GroupUserRelation groupUserRelation;

  /**
   * 用户 组 关系列表 订阅接口
   */
  @Description("用户 组 关系列表 订阅接口")
  private Collection<GroupUserRelation> groupUserRelationList;

  /**
   * 用户 组 关系连接 订阅接口
   */
  @Description("用户 组 关系连接 订阅接口")
  private GroupUserRelationConnection groupUserRelationConnection;

  /**
   * 用户 角色 关系 订阅接口
   */
  @Description("用户 角色 关系 订阅接口")
  private RoleUserRelation roleUserRelation;

  /**
   * 用户 角色 关系列表 订阅接口
   */
  @Description("用户 角色 关系列表 订阅接口")
  private Collection<RoleUserRelation> roleUserRelationList;

  /**
   * 用户 角色 关系连接 订阅接口
   */
  @Description("用户 角色 关系连接 订阅接口")
  private RoleUserRelationConnection roleUserRelationConnection;

  /**
   * 角色 组 关系 订阅接口
   */
  @Description("角色 组 关系 订阅接口")
  private GroupRoleRelation groupRoleRelation;

  /**
   * 角色 组 关系列表 订阅接口
   */
  @Description("角色 组 关系列表 订阅接口")
  private Collection<GroupRoleRelation> groupRoleRelationList;

  /**
   * 角色 组 关系连接 订阅接口
   */
  @Description("角色 组 关系连接 订阅接口")
  private GroupRoleRelationConnection groupRoleRelationConnection;

  /**
   * 角色 角色 关系 订阅接口
   */
  @Description("角色 角色 关系 订阅接口")
  private RoleCompositeRelation roleCompositeRelation;

  /**
   * 角色 角色 关系列表 订阅接口
   */
  @Description("角色 角色 关系列表 订阅接口")
  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  /**
   * 角色 角色 关系连接 订阅接口
   */
  @Description("角色 角色 关系连接 订阅接口")
  private RoleCompositeRelationConnection roleCompositeRelationConnection;

  /**
   * 角色 权限 关系 订阅接口
   */
  @Description("角色 权限 关系 订阅接口")
  private PermissionRoleRelation permissionRoleRelation;

  /**
   * 角色 权限 关系列表 订阅接口
   */
  @Description("角色 权限 关系列表 订阅接口")
  private Collection<PermissionRoleRelation> permissionRoleRelationList;

  /**
   * 角色 权限 关系连接 订阅接口
   */
  @Description("角色 权限 关系连接 订阅接口")
  private PermissionRoleRelationConnection permissionRoleRelationConnection;

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

  public PermissionRoleRelation getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  public void setPermissionRoleRelation(PermissionRoleRelation permissionRoleRelation) {
    this.permissionRoleRelation = permissionRoleRelation;
  }

  public Collection<PermissionRoleRelation> getPermissionRoleRelationList() {
    return this.permissionRoleRelationList;
  }

  public void setPermissionRoleRelationList(
      Collection<PermissionRoleRelation> permissionRoleRelationList) {
    this.permissionRoleRelationList = permissionRoleRelationList;
  }

  public PermissionRoleRelationConnection getPermissionRoleRelationConnection() {
    return this.permissionRoleRelationConnection;
  }

  public void setPermissionRoleRelationConnection(
      PermissionRoleRelationConnection permissionRoleRelationConnection) {
    this.permissionRoleRelationConnection = permissionRoleRelationConnection;
  }
}
