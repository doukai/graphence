package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class RoleMutationTypeArguments implements MetaInput {
  private String id;

  private String name;

  private String description;

  private Collection<RoleMutationTypeArguments> users;

  private Collection<RoleMutationTypeArguments> groups;

  private Collection<RoleMutationTypeArguments> composites;

  private Collection<RoleMutationTypeArguments> permissions;

  private RoleMutationTypeArguments realm;

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

  private Collection<RoleMutationTypeArguments> userRole;

  private Collection<RoleMutationTypeArguments> groupRole;

  private Collection<RoleMutationTypeArguments> roleComposite;

  private Collection<RoleMutationTypeArguments> rolePermission;

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

  public Collection<RoleMutationTypeArguments> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<RoleMutationTypeArguments> users) {
    this.users = users;
  }

  public Collection<RoleMutationTypeArguments> getGroups() {
    return this.groups;
  }

  public void setGroups(Collection<RoleMutationTypeArguments> groups) {
    this.groups = groups;
  }

  public Collection<RoleMutationTypeArguments> getComposites() {
    return this.composites;
  }

  public void setComposites(Collection<RoleMutationTypeArguments> composites) {
    this.composites = composites;
  }

  public Collection<RoleMutationTypeArguments> getPermissions() {
    return this.permissions;
  }

  public void setPermissions(Collection<RoleMutationTypeArguments> permissions) {
    this.permissions = permissions;
  }

  public RoleMutationTypeArguments getRealm() {
    return this.realm;
  }

  public void setRealm(RoleMutationTypeArguments realm) {
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

  public Collection<RoleMutationTypeArguments> getUserRole() {
    return this.userRole;
  }

  public void setUserRole(Collection<RoleMutationTypeArguments> userRole) {
    this.userRole = userRole;
  }

  public Collection<RoleMutationTypeArguments> getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(Collection<RoleMutationTypeArguments> groupRole) {
    this.groupRole = groupRole;
  }

  public Collection<RoleMutationTypeArguments> getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(Collection<RoleMutationTypeArguments> roleComposite) {
    this.roleComposite = roleComposite;
  }

  public Collection<RoleMutationTypeArguments> getRolePermission() {
    return this.rolePermission;
  }

  public void setRolePermission(Collection<RoleMutationTypeArguments> rolePermission) {
    this.rolePermission = rolePermission;
  }

  public RoleExpression getWhere() {
    return this.where;
  }

  public void setWhere(RoleExpression where) {
    this.where = where;
  }
}
