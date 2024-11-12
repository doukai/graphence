package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

/**
 * 权限
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限")
public class Permission implements Meta {
  /**
   * 名称
   */
  @Id
  @NonNull
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
  @NonNull
  @Description("字段")
  private String field;

  /**
   * 实体
   */
  @NonNull
  @Description("实体")
  private String type;

  /**
   * 权限类型
   */
  @NonNull
  @Description("权限类型")
  private PermissionType permissionType;

  /**
   * 角色
   */
  @Description("角色")
  private Collection<Role> roles;

  /**
   * 租户
   */
  @Description("租户")
  private Realm realm;

  /**
   * 已移除
   */
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
  @Description("所属类型")
  private String __typename = "Permission";

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private Collection<PermissionRoleRelation> permissionRoleRelation;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  private Role rolesAggregate;

  /**
   * 角色 连接
   */
  @Description("角色 连接")
  private RoleConnection rolesConnection;

  /**
   * 角色 权限 关系 统计字段
   */
  @Description("角色 权限 关系 统计字段")
  private PermissionRoleRelation permissionRoleRelationAggregate;

  /**
   * 角色 权限 关系 连接
   */
  @Description("角色 权限 关系 连接")
  private PermissionRoleRelationConnection permissionRoleRelationConnection;

  /**
   * 权限 数量
   */
  @Description("权限 数量")
  private Integer nameCount;

  /**
   * 名称 最大值
   */
  @Description("名称 最大值")
  private String nameMax;

  /**
   * 名称 最小值
   */
  @Description("名称 最小值")
  private String nameMin;

  /**
   * 描述 数量
   */
  @Description("描述 数量")
  private Integer descriptionCount;

  /**
   * 描述 最大值
   */
  @Description("描述 最大值")
  private String descriptionMax;

  /**
   * 描述 最小值
   */
  @Description("描述 最小值")
  private String descriptionMin;

  /**
   * 字段 数量
   */
  @Description("字段 数量")
  private Integer fieldCount;

  /**
   * 字段 最大值
   */
  @Description("字段 最大值")
  private String fieldMax;

  /**
   * 字段 最小值
   */
  @Description("字段 最小值")
  private String fieldMin;

  /**
   * 实体 数量
   */
  @Description("实体 数量")
  private Integer typeCount;

  /**
   * 实体 最大值
   */
  @Description("实体 最大值")
  private String typeMax;

  /**
   * 实体 最小值
   */
  @Description("实体 最小值")
  private String typeMin;

  /**
   * 权限类型 数量
   */
  @Description("权限类型 数量")
  private Integer permissionTypeCount;

  /**
   * 权限类型 最大值
   */
  @Description("权限类型 最大值")
  private PermissionType permissionTypeMax;

  /**
   * 权限类型 最小值
   */
  @Description("权限类型 最小值")
  private PermissionType permissionTypeMin;

  private Boolean syncPermissionPolicy;

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

  public String getField() {
    return this.field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PermissionType getPermissionType() {
    return this.permissionType;
  }

  public void setPermissionType(PermissionType permissionType) {
    this.permissionType = permissionType;
  }

  public Collection<Role> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<Role> roles) {
    this.roles = roles;
  }

  public Realm getRealm() {
    return this.realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
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

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<PermissionRoleRelation> getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  public void setPermissionRoleRelation(Collection<PermissionRoleRelation> permissionRoleRelation) {
    this.permissionRoleRelation = permissionRoleRelation;
  }

  public Role getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(Role rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public RoleConnection getRolesConnection() {
    return this.rolesConnection;
  }

  public void setRolesConnection(RoleConnection rolesConnection) {
    this.rolesConnection = rolesConnection;
  }

  public PermissionRoleRelation getPermissionRoleRelationAggregate() {
    return this.permissionRoleRelationAggregate;
  }

  public void setPermissionRoleRelationAggregate(
      PermissionRoleRelation permissionRoleRelationAggregate) {
    this.permissionRoleRelationAggregate = permissionRoleRelationAggregate;
  }

  public PermissionRoleRelationConnection getPermissionRoleRelationConnection() {
    return this.permissionRoleRelationConnection;
  }

  public void setPermissionRoleRelationConnection(
      PermissionRoleRelationConnection permissionRoleRelationConnection) {
    this.permissionRoleRelationConnection = permissionRoleRelationConnection;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public String getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(String descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public String getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(String descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Integer getFieldCount() {
    return this.fieldCount;
  }

  public void setFieldCount(Integer fieldCount) {
    this.fieldCount = fieldCount;
  }

  public String getFieldMax() {
    return this.fieldMax;
  }

  public void setFieldMax(String fieldMax) {
    this.fieldMax = fieldMax;
  }

  public String getFieldMin() {
    return this.fieldMin;
  }

  public void setFieldMin(String fieldMin) {
    this.fieldMin = fieldMin;
  }

  public Integer getTypeCount() {
    return this.typeCount;
  }

  public void setTypeCount(Integer typeCount) {
    this.typeCount = typeCount;
  }

  public String getTypeMax() {
    return this.typeMax;
  }

  public void setTypeMax(String typeMax) {
    this.typeMax = typeMax;
  }

  public String getTypeMin() {
    return this.typeMin;
  }

  public void setTypeMin(String typeMin) {
    this.typeMin = typeMin;
  }

  public Integer getPermissionTypeCount() {
    return this.permissionTypeCount;
  }

  public void setPermissionTypeCount(Integer permissionTypeCount) {
    this.permissionTypeCount = permissionTypeCount;
  }

  public PermissionType getPermissionTypeMax() {
    return this.permissionTypeMax;
  }

  public void setPermissionTypeMax(PermissionType permissionTypeMax) {
    this.permissionTypeMax = permissionTypeMax;
  }

  public PermissionType getPermissionTypeMin() {
    return this.permissionTypeMin;
  }

  public void setPermissionTypeMin(PermissionType permissionTypeMin) {
    this.permissionTypeMin = permissionTypeMin;
  }

  public Boolean getSyncPermissionPolicy() {
    return this.syncPermissionPolicy;
  }

  public void setSyncPermissionPolicy(Boolean syncPermissionPolicy) {
    this.syncPermissionPolicy = syncPermissionPolicy;
  }
}
