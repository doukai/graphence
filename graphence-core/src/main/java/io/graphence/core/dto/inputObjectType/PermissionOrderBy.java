package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 权限 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限 排序")
public class PermissionOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 名称
   */
  @Description("名称")
  private Sort name;

  /**
   * 描述
   */
  @Description("描述")
  private Sort description;

  /**
   * 字段
   */
  @Description("字段")
  private Sort field;

  /**
   * 实体
   */
  @Description("实体")
  private Sort type;

  /**
   * 权限类型
   */
  @Description("权限类型")
  private Sort permissionType;

  /**
   * 角色
   */
  @Description("角色")
  private RoleOrderBy roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmOrderBy realm;

  /**
   * 已移除
   */
  @Description("已移除")
  private Sort isDeprecated;

  /**
   * 版本
   */
  @Description("版本")
  private Sort version;

  /**
   * 域
   */
  @Description("域")
  private Sort realmId;

  /**
   * 创建者
   */
  @Description("创建者")
  private Sort createUserId;

  /**
   * 创建时间
   */
  @Description("创建时间")
  private Sort createTime;

  /**
   * 更新者
   */
  @Description("更新者")
  private Sort updateUserId;

  /**
   * 更新时间
   */
  @Description("更新时间")
  private Sort updateTime;

  /**
   * 创建组
   */
  @Description("创建组")
  private Sort createGroupId;

  /**
   * 所属类型
   */
  @Description("所属类型")
  private Sort __typename;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private RolePermissionRelationOrderBy rolePermissionRelation;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  private RoleOrderBy rolesAggregate;

  /**
   * 角色 权限 关系 统计字段
   */
  @Description("角色 权限 关系 统计字段")
  private RolePermissionRelationOrderBy rolePermissionRelationAggregate;

  /**
   * 权限 数量
   */
  @Description("权限 数量")
  private Sort idCount;

  /**
   * ID 最大值
   */
  @Description("ID 最大值")
  private Sort idMax;

  /**
   * ID 最小值
   */
  @Description("ID 最小值")
  private Sort idMin;

  /**
   * 名称 数量
   */
  @Description("名称 数量")
  private Sort nameCount;

  /**
   * 名称 最大值
   */
  @Description("名称 最大值")
  private Sort nameMax;

  /**
   * 名称 最小值
   */
  @Description("名称 最小值")
  private Sort nameMin;

  /**
   * 描述 数量
   */
  @Description("描述 数量")
  private Sort descriptionCount;

  /**
   * 描述 最大值
   */
  @Description("描述 最大值")
  private Sort descriptionMax;

  /**
   * 描述 最小值
   */
  @Description("描述 最小值")
  private Sort descriptionMin;

  /**
   * 字段 数量
   */
  @Description("字段 数量")
  private Sort fieldCount;

  /**
   * 字段 最大值
   */
  @Description("字段 最大值")
  private Sort fieldMax;

  /**
   * 字段 最小值
   */
  @Description("字段 最小值")
  private Sort fieldMin;

  /**
   * 实体 数量
   */
  @Description("实体 数量")
  private Sort typeCount;

  /**
   * 实体 最大值
   */
  @Description("实体 最大值")
  private Sort typeMax;

  /**
   * 实体 最小值
   */
  @Description("实体 最小值")
  private Sort typeMin;

  /**
   * 权限类型 数量
   */
  @Description("权限类型 数量")
  private Sort permissionTypeCount;

  /**
   * 权限类型 最大值
   */
  @Description("权限类型 最大值")
  private Sort permissionTypeMax;

  /**
   * 权限类型 最小值
   */
  @Description("权限类型 最小值")
  private Sort permissionTypeMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getDescription() {
    return this.description;
  }

  public void setDescription(Sort description) {
    this.description = description;
  }

  public Sort getField() {
    return this.field;
  }

  public void setField(Sort field) {
    this.field = field;
  }

  public Sort getType() {
    return this.type;
  }

  public void setType(Sort type) {
    this.type = type;
  }

  public Sort getPermissionType() {
    return this.permissionType;
  }

  public void setPermissionType(Sort permissionType) {
    this.permissionType = permissionType;
  }

  public RoleOrderBy getRoles() {
    return this.roles;
  }

  public void setRoles(RoleOrderBy roles) {
    this.roles = roles;
  }

  public RealmOrderBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmOrderBy realm) {
    this.realm = realm;
  }

  public Sort getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Sort isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Sort getVersion() {
    return this.version;
  }

  public void setVersion(Sort version) {
    this.version = version;
  }

  public Sort getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Sort realmId) {
    this.realmId = realmId;
  }

  public Sort getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Sort createUserId) {
    this.createUserId = createUserId;
  }

  public Sort getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Sort createTime) {
    this.createTime = createTime;
  }

  public Sort getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(Sort updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Sort getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Sort updateTime) {
    this.updateTime = updateTime;
  }

  public Sort getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(Sort createGroupId) {
    this.createGroupId = createGroupId;
  }

  public Sort get__typename() {
    return this.__typename;
  }

  public void set__typename(Sort __typename) {
    this.__typename = __typename;
  }

  public RolePermissionRelationOrderBy getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(RolePermissionRelationOrderBy rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
  }

  public RoleOrderBy getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(RoleOrderBy rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public RolePermissionRelationOrderBy getRolePermissionRelationAggregate() {
    return this.rolePermissionRelationAggregate;
  }

  public void setRolePermissionRelationAggregate(
      RolePermissionRelationOrderBy rolePermissionRelationAggregate) {
    this.rolePermissionRelationAggregate = rolePermissionRelationAggregate;
  }

  public Sort getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Sort idCount) {
    this.idCount = idCount;
  }

  public Sort getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Sort idMax) {
    this.idMax = idMax;
  }

  public Sort getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Sort idMin) {
    this.idMin = idMin;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(Sort descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public Sort getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(Sort descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Sort getFieldCount() {
    return this.fieldCount;
  }

  public void setFieldCount(Sort fieldCount) {
    this.fieldCount = fieldCount;
  }

  public Sort getFieldMax() {
    return this.fieldMax;
  }

  public void setFieldMax(Sort fieldMax) {
    this.fieldMax = fieldMax;
  }

  public Sort getFieldMin() {
    return this.fieldMin;
  }

  public void setFieldMin(Sort fieldMin) {
    this.fieldMin = fieldMin;
  }

  public Sort getTypeCount() {
    return this.typeCount;
  }

  public void setTypeCount(Sort typeCount) {
    this.typeCount = typeCount;
  }

  public Sort getTypeMax() {
    return this.typeMax;
  }

  public void setTypeMax(Sort typeMax) {
    this.typeMax = typeMax;
  }

  public Sort getTypeMin() {
    return this.typeMin;
  }

  public void setTypeMin(Sort typeMin) {
    this.typeMin = typeMin;
  }

  public Sort getPermissionTypeCount() {
    return this.permissionTypeCount;
  }

  public void setPermissionTypeCount(Sort permissionTypeCount) {
    this.permissionTypeCount = permissionTypeCount;
  }

  public Sort getPermissionTypeMax() {
    return this.permissionTypeMax;
  }

  public void setPermissionTypeMax(Sort permissionTypeMax) {
    this.permissionTypeMax = permissionTypeMax;
  }

  public Sort getPermissionTypeMin() {
    return this.permissionTypeMin;
  }

  public void setPermissionTypeMin(Sort permissionTypeMin) {
    this.permissionTypeMin = permissionTypeMin;
  }
}
