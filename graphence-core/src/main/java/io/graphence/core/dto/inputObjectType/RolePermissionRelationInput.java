package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
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
 * Mutation Input for Relationship Object between 角色 and 权限
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Mutation Input for Relationship Object between 角色 and 权限")
public class RolePermissionRelationInput implements MetaInput {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  private String roleRef;

  /**
   * 角色
   */
  @Description("角色")
  private RoleInput role;

  /**
   * 权限 Reference
   */
  @Description("权限 Reference")
  private String permissionRef;

  /**
   * 权限
   */
  @Description("权限")
  private PermissionInput permission;

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
  @DefaultValue("RolePermissionRelation")
  @Description("Type Name")
  private String __typename = "RolePermissionRelation";

  /**
   * Input
   */
  @Description("Input")
  private RolePermissionRelationInput input;

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<RolePermissionRelationInput> list;

  /**
   * Where
   */
  @Description("Where")
  private RolePermissionRelationExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  public String getRoleRef() {
    return this.roleRef;
  }

  public void setRoleRef(String roleRef) {
    this.roleRef = roleRef;
  }

  public RoleInput getRole() {
    return this.role;
  }

  public void setRole(RoleInput role) {
    this.role = role;
  }

  public String getPermissionRef() {
    return this.permissionRef;
  }

  public void setPermissionRef(String permissionRef) {
    this.permissionRef = permissionRef;
  }

  public PermissionInput getPermission() {
    return this.permission;
  }

  public void setPermission(PermissionInput permission) {
    this.permission = permission;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
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

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public RolePermissionRelationInput getInput() {
    return this.input;
  }

  public void setInput(RolePermissionRelationInput input) {
    this.input = input;
  }

  public Collection<RolePermissionRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<RolePermissionRelationInput> list) {
    this.list = list;
  }

  public RolePermissionRelationExpression getWhere() {
    return this.where;
  }

  public void setWhere(RolePermissionRelationExpression where) {
    this.where = where;
  }
}
