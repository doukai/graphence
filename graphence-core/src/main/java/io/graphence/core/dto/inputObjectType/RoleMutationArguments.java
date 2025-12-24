package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.structure.dto.inputObjectType.NamedStructInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for 角色
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for 角色")
public class RoleMutationArguments implements NamedStructInput, MetaInput, RoleInputBase {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 名称
   */
  @Description("名称")
  private String name;

  /**
   * 描述
   */
  @Description("描述")
  private String description;

  /**
   * 用户
   */
  @Description("用户")
  private Collection<UserInput> users;

  /**
   * 组
   */
  @Description("组")
  private Collection<GroupInput> groups;

  /**
   * 组合
   */
  @Description("组合")
  private Collection<RoleInput> composites;

  /**
   * 权限
   */
  @Description("权限")
  private Collection<PermissionInput> permissions;

  /**
   * 租户
   */
  @Description("租户")
  private RealmInput realm;

  /**
   * Is Deprecated
   */
  @DefaultValue("false")
  @Description("Is Deprecated")
  private Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  private Integer version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Integer realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private String createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private LocalDateTime createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private String updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private LocalDateTime updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private String createGroupId;

  /**
   * Type Name
   */
  @DefaultValue("Role")
  @Description("Type Name")
  private String __typename = "Role";

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private Collection<RoleUserRelationInput> roleUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private Collection<GroupRoleRelationInput> groupRoleRelation;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  private Collection<RoleCompositeRelationInput> roleCompositeRelation;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  private Collection<RolePermissionRelationInput> rolePermissionRelation;

  /**
   * Input
   */
  @Description("Input")
  private RoleInput input;

  /**
   * Where
   */
  @Description("Where")
  private RoleExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = (String)name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(String description) {
    this.description = (String)description;
  }

  @Override
  public Collection<UserInput> getUsers() {
    return this.users;
  }

  @Override
  public void setUsers(Collection<UserInput> users) {
    this.users = (Collection<UserInput>)users;
  }

  @Override
  public Collection<GroupInput> getGroups() {
    return this.groups;
  }

  @Override
  public void setGroups(Collection<GroupInput> groups) {
    this.groups = (Collection<GroupInput>)groups;
  }

  @Override
  public Collection<RoleInput> getComposites() {
    return this.composites;
  }

  @Override
  public void setComposites(Collection<RoleInput> composites) {
    this.composites = (Collection<RoleInput>)composites;
  }

  @Override
  public Collection<PermissionInput> getPermissions() {
    return this.permissions;
  }

  @Override
  public void setPermissions(Collection<PermissionInput> permissions) {
    this.permissions = (Collection<PermissionInput>)permissions;
  }

  @Override
  public RealmInput getRealm() {
    return this.realm;
  }

  @Override
  public void setRealm(RealmInput realm) {
    this.realm = (RealmInput)realm;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  @Override
  public String get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(String __typename) {
    this.__typename = (String)__typename;
  }

  @Override
  public Collection<RoleUserRelationInput> getRoleUserRelation() {
    return this.roleUserRelation;
  }

  @Override
  public void setRoleUserRelation(Collection<RoleUserRelationInput> roleUserRelation) {
    this.roleUserRelation = (Collection<RoleUserRelationInput>)roleUserRelation;
  }

  @Override
  public Collection<GroupRoleRelationInput> getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  @Override
  public void setGroupRoleRelation(Collection<GroupRoleRelationInput> groupRoleRelation) {
    this.groupRoleRelation = (Collection<GroupRoleRelationInput>)groupRoleRelation;
  }

  @Override
  public Collection<RoleCompositeRelationInput> getRoleCompositeRelation() {
    return this.roleCompositeRelation;
  }

  @Override
  public void setRoleCompositeRelation(
      Collection<RoleCompositeRelationInput> roleCompositeRelation) {
    this.roleCompositeRelation = (Collection<RoleCompositeRelationInput>)roleCompositeRelation;
  }

  @Override
  public Collection<RolePermissionRelationInput> getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  @Override
  public void setRolePermissionRelation(
      Collection<RolePermissionRelationInput> rolePermissionRelation) {
    this.rolePermissionRelation = (Collection<RolePermissionRelationInput>)rolePermissionRelation;
  }

  public RoleInput getInput() {
    return this.input;
  }

  public void setInput(RoleInput input) {
    this.input = input;
  }

  @Override
  public RoleExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(RoleExpression where) {
    this.where = (RoleExpression)where;
  }
}
