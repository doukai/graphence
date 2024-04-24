package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.casbin.adapter.Policy;
import io.graphence.core.dto.CurrentUser;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Query {
  private User user;

  private Collection<User> userList;

  private UserConnection userConnection;

  private Role role;

  private Collection<Role> roleList;

  private RoleConnection roleConnection;

  private Group group;

  private Collection<Group> groupList;

  private GroupConnection groupConnection;

  private Realm realm;

  private Collection<Realm> realmList;

  private RealmConnection realmConnection;

  private Permission permission;

  private Collection<Permission> permissionList;

  private PermissionConnection permissionConnection;

  private UserPhonesRelation userPhonesRelation;

  private Collection<UserPhonesRelation> userPhonesRelationList;

  private UserPhonesRelationConnection userPhonesRelationConnection;

  private GroupUserRelation groupUserRelation;

  private Collection<GroupUserRelation> groupUserRelationList;

  private GroupUserRelationConnection groupUserRelationConnection;

  private RoleUserRelation roleUserRelation;

  private Collection<RoleUserRelation> roleUserRelationList;

  private RoleUserRelationConnection roleUserRelationConnection;

  private GroupRoleRelation groupRoleRelation;

  private Collection<GroupRoleRelation> groupRoleRelationList;

  private GroupRoleRelationConnection groupRoleRelationConnection;

  private RoleCompositeRelation roleCompositeRelation;

  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  private RoleCompositeRelationConnection roleCompositeRelationConnection;

  private PermissionRoleRelation permissionRoleRelation;

  private Collection<PermissionRoleRelation> permissionRoleRelationList;

  private PermissionRoleRelationConnection permissionRoleRelationConnection;

  private Collection<Policy> policyList;

  private CurrentUser current;

  private Collection<String> currentPermissionTypeList;

  private Collection<String> currentPermissionNameListByTypes;

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

  public Collection<Policy> getPolicyList() {
    return this.policyList;
  }

  public void setPolicyList(Collection<Policy> policyList) {
    this.policyList = policyList;
  }

  public CurrentUser getCurrent() {
    return this.current;
  }

  public void setCurrent(CurrentUser current) {
    this.current = current;
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
}
