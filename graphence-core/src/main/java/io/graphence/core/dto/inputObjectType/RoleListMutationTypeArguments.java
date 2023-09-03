package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class RoleListMutationTypeArguments {
  private String id;

  private String name;

  private String description;

  private Collection<UserInput> users;

  private Collection<RoleInput> composites;

  private Collection<PermissionInput> permissions;

  private Collection<MenuInput> menus;

  private RealmInput realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"Role\"")
  private String __typename;

  private Collection<UserRoleInput> userRole;

  private Collection<RoleCompositeInput> roleComposite;

  private Collection<RolePermissionInput> rolePermission;

  private Collection<RoleMenuInput> roleMenu;

  private Collection<RoleInput> list;

  private RoleExpression where;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Collection<UserInput> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<UserInput> users) {
    this.users = users;
  }

  public Collection<RoleInput> getComposites() {
    return this.composites;
  }

  public void setComposites(Collection<RoleInput> composites) {
    this.composites = composites;
  }

  public Collection<PermissionInput> getPermissions() {
    return this.permissions;
  }

  public void setPermissions(Collection<PermissionInput> permissions) {
    this.permissions = permissions;
  }

  public Collection<MenuInput> getMenus() {
    return this.menus;
  }

  public void setMenus(Collection<MenuInput> menus) {
    this.menus = menus;
  }

  public RealmInput getRealm() {
    return this.realm;
  }

  public void setRealm(RealmInput realm) {
    this.realm = realm;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Integer realmId) {
    this.realmId = realmId;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<UserRoleInput> getUserRole() {
    return this.userRole;
  }

  public void setUserRole(Collection<UserRoleInput> userRole) {
    this.userRole = userRole;
  }

  public Collection<RoleCompositeInput> getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(Collection<RoleCompositeInput> roleComposite) {
    this.roleComposite = roleComposite;
  }

  public Collection<RolePermissionInput> getRolePermission() {
    return this.rolePermission;
  }

  public void setRolePermission(Collection<RolePermissionInput> rolePermission) {
    this.rolePermission = rolePermission;
  }

  public Collection<RoleMenuInput> getRoleMenu() {
    return this.roleMenu;
  }

  public void setRoleMenu(Collection<RoleMenuInput> roleMenu) {
    this.roleMenu = roleMenu;
  }

  public Collection<RoleInput> getList() {
    return this.list;
  }

  public void setList(Collection<RoleInput> list) {
    this.list = list;
  }

  public RoleExpression getWhere() {
    return this.where;
  }

  public void setWhere(RoleExpression where) {
    this.where = where;
  }
}
