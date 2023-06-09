package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class QueryType implements Meta {
  private CurrentUser current;

  private String login;

  private Boolean isDeprecated;

  private Integer version;

  private String realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

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

  private UserGroup userGroup;

  private Collection<UserGroup> userGroupList;

  private UserGroupConnection userGroupConnection;

  private UserRole userRole;

  private Collection<UserRole> userRoleList;

  private UserRoleConnection userRoleConnection;

  private RoleComposite roleComposite;

  private Collection<RoleComposite> roleCompositeList;

  private RoleCompositeConnection roleCompositeConnection;

  private GroupRole groupRole;

  private Collection<GroupRole> groupRoleList;

  private GroupRoleConnection groupRoleConnection;

  public CurrentUser getCurrent() {
    return this.current;
  }

  public void setCurrent(CurrentUser current) {
    this.current = current;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

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

  public UserGroup getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(UserGroup userGroup) {
    this.userGroup = userGroup;
  }

  public Collection<UserGroup> getUserGroupList() {
    return this.userGroupList;
  }

  public void setUserGroupList(Collection<UserGroup> userGroupList) {
    this.userGroupList = userGroupList;
  }

  public UserGroupConnection getUserGroupConnection() {
    return this.userGroupConnection;
  }

  public void setUserGroupConnection(UserGroupConnection userGroupConnection) {
    this.userGroupConnection = userGroupConnection;
  }

  public UserRole getUserRole() {
    return this.userRole;
  }

  public void setUserRole(UserRole userRole) {
    this.userRole = userRole;
  }

  public Collection<UserRole> getUserRoleList() {
    return this.userRoleList;
  }

  public void setUserRoleList(Collection<UserRole> userRoleList) {
    this.userRoleList = userRoleList;
  }

  public UserRoleConnection getUserRoleConnection() {
    return this.userRoleConnection;
  }

  public void setUserRoleConnection(UserRoleConnection userRoleConnection) {
    this.userRoleConnection = userRoleConnection;
  }

  public RoleComposite getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(RoleComposite roleComposite) {
    this.roleComposite = roleComposite;
  }

  public Collection<RoleComposite> getRoleCompositeList() {
    return this.roleCompositeList;
  }

  public void setRoleCompositeList(Collection<RoleComposite> roleCompositeList) {
    this.roleCompositeList = roleCompositeList;
  }

  public RoleCompositeConnection getRoleCompositeConnection() {
    return this.roleCompositeConnection;
  }

  public void setRoleCompositeConnection(RoleCompositeConnection roleCompositeConnection) {
    this.roleCompositeConnection = roleCompositeConnection;
  }

  public GroupRole getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(GroupRole groupRole) {
    this.groupRole = groupRole;
  }

  public Collection<GroupRole> getGroupRoleList() {
    return this.groupRoleList;
  }

  public void setGroupRoleList(Collection<GroupRole> groupRoleList) {
    this.groupRoleList = groupRoleList;
  }

  public GroupRoleConnection getGroupRoleConnection() {
    return this.groupRoleConnection;
  }

  public void setGroupRoleConnection(GroupRoleConnection groupRoleConnection) {
    this.groupRoleConnection = groupRoleConnection;
  }
}
