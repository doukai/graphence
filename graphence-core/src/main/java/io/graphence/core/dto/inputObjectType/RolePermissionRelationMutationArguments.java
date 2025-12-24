package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for Relationship Object between 角色 and 权限
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for Relationship Object between 角色 and 权限")
public class RolePermissionRelationMutationArguments implements MetaInput, RolePermissionRelationInputBase {
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

  @Override
  public String getRoleRef() {
    return this.roleRef;
  }

  @Override
  public void setRoleRef(String roleRef) {
    this.roleRef = (String)roleRef;
  }

  @Override
  public RoleInput getRole() {
    return this.role;
  }

  @Override
  public void setRole(RoleInput role) {
    this.role = (RoleInput)role;
  }

  @Override
  public String getPermissionRef() {
    return this.permissionRef;
  }

  @Override
  public void setPermissionRef(String permissionRef) {
    this.permissionRef = (String)permissionRef;
  }

  @Override
  public PermissionInput getPermission() {
    return this.permission;
  }

  @Override
  public void setPermission(PermissionInput permission) {
    this.permission = (PermissionInput)permission;
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

  public RolePermissionRelationInput getInput() {
    return this.input;
  }

  public void setInput(RolePermissionRelationInput input) {
    this.input = input;
  }

  @Override
  public RolePermissionRelationExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(RolePermissionRelationExpression where) {
    this.where = (RolePermissionRelationExpression)where;
  }
}
