package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
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
public class MutationType implements Meta {
  private String login;

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

  private Menu menu;

  private Collection<Menu> menuList;

  private UserPhones userPhones;

  private Collection<UserPhones> userPhonesList;

  private UserGroup userGroup;

  private Collection<UserGroup> userGroupList;

  private UserRole userRole;

  private Collection<UserRole> userRoleList;

  private RoleComposite roleComposite;

  private Collection<RoleComposite> roleCompositeList;

  private RolePermission rolePermission;

  private Collection<RolePermission> rolePermissionList;

  private RoleMenu roleMenu;

  private Collection<RoleMenu> roleMenuList;

  private GroupRole groupRole;

  private Collection<GroupRole> groupRoleList;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
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

  public Menu getMenu() {
    return this.menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }

  public Collection<Menu> getMenuList() {
    return this.menuList;
  }

  public void setMenuList(Collection<Menu> menuList) {
    this.menuList = menuList;
  }

  public UserPhones getUserPhones() {
    return this.userPhones;
  }

  public void setUserPhones(UserPhones userPhones) {
    this.userPhones = userPhones;
  }

  public Collection<UserPhones> getUserPhonesList() {
    return this.userPhonesList;
  }

  public void setUserPhonesList(Collection<UserPhones> userPhonesList) {
    this.userPhonesList = userPhonesList;
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

  public RolePermission getRolePermission() {
    return this.rolePermission;
  }

  public void setRolePermission(RolePermission rolePermission) {
    this.rolePermission = rolePermission;
  }

  public Collection<RolePermission> getRolePermissionList() {
    return this.rolePermissionList;
  }

  public void setRolePermissionList(Collection<RolePermission> rolePermissionList) {
    this.rolePermissionList = rolePermissionList;
  }

  public RoleMenu getRoleMenu() {
    return this.roleMenu;
  }

  public void setRoleMenu(RoleMenu roleMenu) {
    this.roleMenu = roleMenu;
  }

  public Collection<RoleMenu> getRoleMenuList() {
    return this.roleMenuList;
  }

  public void setRoleMenuList(Collection<RoleMenu> roleMenuList) {
    this.roleMenuList = roleMenuList;
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
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
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
}
