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
 * 角色 权限 关系 变更参数
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 权限 关系 变更参数")
public class RolePermissionRelationMutationArguments implements MetaInput, RolePermissionRelationInputBase {
  /**
   * id
   */
  @Description("id")
  private String id;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  private String roleRef;

  /**
   * 角色
   */
  @Description("角色")
  private RoleInput role;

  /**
   * 权限 引用
   */
  @Description("权限 引用")
  private String permissionRef;

  /**
   * 权限
   */
  @Description("权限")
  private PermissionInput permission;

  /**
   * 已移除
   */
  @DefaultValue("false")
  @Description("已移除")
  private Boolean isDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  private Integer version;

  /**
   * 域
   */
  @Description("域")
  private Integer realmId;

  /**
   * 创建者
   */
  @Description("创建者")
  private String createUserId;

  /**
   * 创建时间
   */
  @Description("创建时间")
  private LocalDateTime createTime;

  /**
   * 更新者
   */
  @Description("更新者")
  private String updateUserId;

  /**
   * 更新时间
   */
  @Description("更新时间")
  private LocalDateTime updateTime;

  /**
   * 创建组
   */
  @Description("创建组")
  private String createGroupId;

  /**
   * 所属类型
   */
  @DefaultValue("RolePermissionRelation")
  @Description("所属类型")
  private String __typename = "RolePermissionRelation";

  /**
   * 变更内容
   */
  @Description("变更内容")
  private RolePermissionRelationInput input;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
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
