package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 权限
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 权限")
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
   * Is Deprecated
   */
  @Description("Is Deprecated")
  private Sort isDeprecated;

  /**
   * Version
   */
  @Description("Version")
  private Sort version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Sort realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private Sort createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private Sort createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private Sort updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private Sort updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private Sort createGroupId;

  /**
   * Type Name
   */
  @Description("Type Name")
  private Sort __typename;

  /**
   * Count of 权限
   */
  @Description("Count of 权限")
  private Sort idCount;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  private Sort idMax;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  private Sort idMin;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  private Sort nameCount;

  /**
   * Max of 名称
   */
  @Description("Max of 名称")
  private Sort nameMax;

  /**
   * Min of 名称
   */
  @Description("Min of 名称")
  private Sort nameMin;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Sort descriptionCount;

  /**
   * Max of 描述
   */
  @Description("Max of 描述")
  private Sort descriptionMax;

  /**
   * Min of 描述
   */
  @Description("Min of 描述")
  private Sort descriptionMin;

  /**
   * Count of 字段
   */
  @Description("Count of 字段")
  private Sort fieldCount;

  /**
   * Max of 字段
   */
  @Description("Max of 字段")
  private Sort fieldMax;

  /**
   * Min of 字段
   */
  @Description("Min of 字段")
  private Sort fieldMin;

  /**
   * Count of 实体
   */
  @Description("Count of 实体")
  private Sort typeCount;

  /**
   * Max of 实体
   */
  @Description("Max of 实体")
  private Sort typeMax;

  /**
   * Min of 实体
   */
  @Description("Min of 实体")
  private Sort typeMin;

  /**
   * Count of 权限类型
   */
  @Description("Count of 权限类型")
  private Sort permissionTypeCount;

  /**
   * Max of 权限类型
   */
  @Description("Max of 权限类型")
  private Sort permissionTypeMax;

  /**
   * Min of 权限类型
   */
  @Description("Min of 权限类型")
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
