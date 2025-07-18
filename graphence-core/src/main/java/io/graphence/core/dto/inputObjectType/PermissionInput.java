package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
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
 * 权限 变更内容
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限 变更内容")
public class PermissionInput implements MetaInput, PermissionInputBase {
  /**
   * id
   */
  @Description("id")
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
   * 字段
   */
  @Description("字段")
  private String field;

  /**
   * 实体
   */
  @Description("实体")
  private String type;

  /**
   * 权限类型
   */
  @Description("权限类型")
  private PermissionType permissionType;

  /**
   * 角色
   */
  @Description("角色")
  private Collection<RoleInput> roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmInput realm;

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
  @DefaultValue("Permission")
  @Description("所属类型")
  private String __typename = "Permission";

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private Collection<RolePermissionRelationInput> rolePermissionRelation;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  private PermissionExpression where;

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
  public String getField() {
    return this.field;
  }

  @Override
  public void setField(String field) {
    this.field = (String)field;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public void setType(String type) {
    this.type = (String)type;
  }

  @Override
  public PermissionType getPermissionType() {
    return this.permissionType;
  }

  @Override
  public void setPermissionType(PermissionType permissionType) {
    this.permissionType = (PermissionType)permissionType;
  }

  @Override
  public Collection<RoleInput> getRoles() {
    return this.roles;
  }

  @Override
  public void setRoles(Collection<RoleInput> roles) {
    this.roles = (Collection<RoleInput>)roles;
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
  public Collection<RolePermissionRelationInput> getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  @Override
  public void setRolePermissionRelation(
      Collection<RolePermissionRelationInput> rolePermissionRelation) {
    this.rolePermissionRelation = (Collection<RolePermissionRelationInput>)rolePermissionRelation;
  }

  @Override
  public PermissionExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(PermissionExpression where) {
    this.where = (PermissionExpression)where;
  }
}
