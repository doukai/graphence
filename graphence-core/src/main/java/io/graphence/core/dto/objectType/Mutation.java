package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation {
  private User user;

  private Collection<User> userList;

  private Role role;

  private Collection<Role> roleList;

  private Group group;

  private Collection<Group> groupList;

  private Realm realm;

  private Collection<Realm> realmList;

  private Permission permission;

  private Collection<Permission> permissionList;

  private UserPhonesRelation userPhonesRelation;

  private Collection<UserPhonesRelation> userPhonesRelationList;

  private GroupUserRelation groupUserRelation;

  private Collection<GroupUserRelation> groupUserRelationList;

  private RoleUserRelation roleUserRelation;

  private Collection<RoleUserRelation> roleUserRelationList;

  private GroupRoleRelation groupRoleRelation;

  private Collection<GroupRoleRelation> groupRoleRelationList;

  private RoleCompositeRelation roleCompositeRelation;

  private Collection<RoleCompositeRelation> roleCompositeRelationList;

  private PermissionRoleRelation permissionRoleRelation;

  private Collection<PermissionRoleRelation> permissionRoleRelationList;

  private Boolean syncPermissionRoleRelationPolicy;

  private String login;

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

  public Boolean getSyncPermissionRoleRelationPolicy() {
    return this.syncPermissionRoleRelationPolicy;
  }

  public void setSyncPermissionRoleRelationPolicy(Boolean syncPermissionRoleRelationPolicy) {
    this.syncPermissionRoleRelationPolicy = syncPermissionRoleRelationPolicy;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }
}
