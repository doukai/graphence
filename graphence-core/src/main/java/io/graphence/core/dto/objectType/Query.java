package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.casbin.adapter.Policy;
import io.graphence.core.dto.Current;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Query
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query")
public class Query {
  /**
   * Query Field for 用户
   */
  @Description("Query Field for 用户")
  private User user;

  /**
   * Query Field for 用户 List
   */
  @Description("Query Field for 用户 List")
  private Collection<User> userList;

  /**
   * Query Field for 用户 Connection
   */
  @Description("Query Field for 用户 Connection")
  private UserConnection userConnection;

  /**
   * Query Field for 角色
   */
  @Description("Query Field for 角色")
  private Role role;

  /**
   * Query Field for 角色 List
   */
  @Description("Query Field for 角色 List")
  private Collection<Role> roleList;

  /**
   * Query Field for 角色 Connection
   */
  @Description("Query Field for 角色 Connection")
  private RoleConnection roleConnection;

  /**
   * Query Field for 组
   */
  @Description("Query Field for 组")
  private Group group;

  /**
   * Query Field for 组 List
   */
  @Description("Query Field for 组 List")
  private Collection<Group> groupList;

  /**
   * Query Field for 组 Connection
   */
  @Description("Query Field for 组 Connection")
  private GroupConnection groupConnection;

  /**
   * Query Field for 租户
   */
  @Description("Query Field for 租户")
  private Realm realm;

  /**
   * Query Field for 租户 List
   */
  @Description("Query Field for 租户 List")
  private Collection<Realm> realmList;

  /**
   * Query Field for 租户 Connection
   */
  @Description("Query Field for 租户 Connection")
  private RealmConnection realmConnection;

  /**
   * Query Field for 权限
   */
  @Description("Query Field for 权限")
  private Permission permission;

  /**
   * Query Field for 权限 List
   */
  @Description("Query Field for 权限 List")
  private Collection<Permission> permissionList;

  /**
   * Query Field for 权限 Connection
   */
  @Description("Query Field for 权限 Connection")
  private PermissionConnection permissionConnection;

  /**
   * Query Field for Relationship Object between 用户 and 手机号
   */
  @Description("Query Field for Relationship Object between 用户 and 手机号")
  private UserPhonesRelation userPhonesRelation;

  /**
   * Query Field for Relationship Object between 用户 and 手机号 List
   */
  @Description("Query Field for Relationship Object between 用户 and 手机号 List")
  private Collection<UserPhonesRelation> userPhonesRelationList;

  /**
   * Query Field for Relationship Object between 用户 and 手机号 Connection
   */
  @Description("Query Field for Relationship Object between 用户 and 手机号 Connection")
  private UserPhonesRelationConnection userPhonesRelationConnection;

  /**
   * Query Field for Relationship Object between 用户 and 组
   */
  @Description("Query Field for Relationship Object between 用户 and 组")
  private GroupUserRelation groupUserRelation;

  /**
   * Query Field for Relationship Object between 用户 and 组 List
   */
  @Description("Query Field for Relationship Object between 用户 and 组 List")
  private Collection<GroupUserRelation> groupUserRelationList;

  /**
   * Query Field for Relationship Object between 用户 and 组 Connection
   */
  @Description("Query Field for Relationship Object between 用户 and 组 Connection")
  private GroupUserRelationConnection groupUserRelationConnection;

  /**
   * Query Field for Relationship Object between 用户 and 角色
   */
  @Description("Query Field for Relationship Object between 用户 and 角色")
  private RoleUserRelation roleUserRelation;

  /**
   * Query Field for Relationship Object between 用户 and 角色 List
   */
  @Description("Query Field for Relationship Object between 用户 and 角色 List")
  private Collection<RoleUserRelation> roleUserRelationList;

  /**
   * Query Field for Relationship Object between 用户 and 角色 Connection
   */
  @Description("Query Field for Relationship Object between 用户 and 角色 Connection")
  private RoleUserRelationConnection roleUserRelationConnection;

  /**
   * Query Field for Relationship Object between 角色 and 组
   */
  @Description("Query Field for Relationship Object between 角色 and 组")
  private GroupRoleRelation groupRoleRelation;

  /**
   * Query Field for Relationship Object between 角色 and 组 List
   */
  @Description("Query Field for Relationship Object between 角色 and 组 List")
  private Collection<GroupRoleRelation> groupRoleRelationList;

  /**
   * Query Field for Relationship Object between 角色 and 组 Connection
   */
  @Description("Query Field for Relationship Object between 角色 and 组 Connection")
  private GroupRoleRelationConnection groupRoleRelationConnection;

  /**
   * Query Field for Relationship Object between 角色 and 角色
   */
  @Description("Query Field for Relationship Object between 角色 and 角色")
  private RoleCompositeRelation roleCompositeRelation;

  /**
   * Query Field for Relationship Object between 角色 and 角色 List
   */
  @Description("Query Field for Relationship Object between 角色 and 角色 List")
  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  /**
   * Query Field for Relationship Object between 角色 and 角色 Connection
   */
  @Description("Query Field for Relationship Object between 角色 and 角色 Connection")
  private RoleCompositeRelationConnection roleCompositeRelationConnection;

  /**
   * Query Field for Relationship Object between 角色 and 权限
   */
  @Description("Query Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelation rolePermissionRelation;

  /**
   * Query Field for Relationship Object between 角色 and 权限 List
   */
  @Description("Query Field for Relationship Object between 角色 and 权限 List")
  private Collection<RolePermissionRelation> rolePermissionRelationList;

  /**
   * Query Field for Relationship Object between 角色 and 权限 Connection
   */
  @Description("Query Field for Relationship Object between 角色 and 权限 Connection")
  private RolePermissionRelationConnection rolePermissionRelationConnection;

  private Current current;

  private User currentUser;

  private Collection<String> currentPermissionTypeList;

  private Collection<String> currentPermissionNameListByTypes;

  private Collection<Policy> policyList;

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

  public Current getCurrent() {
    return this.current;
  }

  public void setCurrent(Current current) {
    this.current = current;
  }

  public User getCurrentUser() {
    return this.currentUser;
  }

  public void setCurrentUser(User currentUser) {
    this.currentUser = currentUser;
  }

  public Collection<String> getCurrentPermissionTypeList() {
    return this.currentPermissionTypeList;
  }

  public void setCurrentPermissionTypeList(Collection<String> currentPermissionTypeList) {
    this.currentPermissionTypeList = currentPermissionTypeList;
  }

  public Collection<String> getCurrentPermissionNameListByTypes() {
    return this.currentPermissionNameListByTypes;
  }

  public void setCurrentPermissionNameListByTypes(
      Collection<String> currentPermissionNameListByTypes) {
    this.currentPermissionNameListByTypes = currentPermissionNameListByTypes;
  }

  public Collection<Policy> getPolicyList() {
    return this.policyList;
  }

  public void setPolicyList(Collection<Policy> policyList) {
    this.policyList = policyList;
  }
}
