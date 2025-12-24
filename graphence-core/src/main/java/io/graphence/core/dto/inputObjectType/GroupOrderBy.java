package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 组
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for 组")
public class GroupOrderBy {
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
   * 路径
   */
  @Description("路径")
  private Sort path;

  /**
   * 层级
   */
  @Description("层级")
  private Sort deep;

  /**
   * 上级ID
   */
  @Description("上级ID")
  private Sort parentId;

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
   * Count of 组
   */
  @Description("Count of 组")
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
   * Count of 路径
   */
  @Description("Count of 路径")
  private Sort pathCount;

  /**
   * Max of 路径
   */
  @Description("Max of 路径")
  private Sort pathMax;

  /**
   * Min of 路径
   */
  @Description("Min of 路径")
  private Sort pathMin;

  /**
   * Count of 上级ID
   */
  @Description("Count of 上级ID")
  private Sort parentIdCount;

  /**
   * Max of 上级ID
   */
  @Description("Max of 上级ID")
  private Sort parentIdMax;

  /**
   * Min of 上级ID
   */
  @Description("Min of 上级ID")
  private Sort parentIdMin;

  /**
   * Count of 层级
   */
  @Description("Count of 层级")
  private Sort deepCount;

  /**
   * Sum of 层级
   */
  @Description("Sum of 层级")
  private Sort deepSum;

  /**
   * Avg of 层级
   */
  @Description("Avg of 层级")
  private Sort deepAvg;

  /**
   * Max of 层级
   */
  @Description("Max of 层级")
  private Sort deepMax;

  /**
   * Min of 层级
   */
  @Description("Min of 层级")
  private Sort deepMin;

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

  public Sort getPath() {
    return this.path;
  }

  public void setPath(Sort path) {
    this.path = path;
  }

  public Sort getDeep() {
    return this.deep;
  }

  public void setDeep(Sort deep) {
    this.deep = deep;
  }

  public Sort getParentId() {
    return this.parentId;
  }

  public void setParentId(Sort parentId) {
    this.parentId = parentId;
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

  public Sort getPathCount() {
    return this.pathCount;
  }

  public void setPathCount(Sort pathCount) {
    this.pathCount = pathCount;
  }

  public Sort getPathMax() {
    return this.pathMax;
  }

  public void setPathMax(Sort pathMax) {
    this.pathMax = pathMax;
  }

  public Sort getPathMin() {
    return this.pathMin;
  }

  public void setPathMin(Sort pathMin) {
    this.pathMin = pathMin;
  }

  public Sort getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Sort parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Sort getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(Sort parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public Sort getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(Sort parentIdMin) {
    this.parentIdMin = parentIdMin;
  }

  public Sort getDeepCount() {
    return this.deepCount;
  }

  public void setDeepCount(Sort deepCount) {
    this.deepCount = deepCount;
  }

  public Sort getDeepSum() {
    return this.deepSum;
  }

  public void setDeepSum(Sort deepSum) {
    this.deepSum = deepSum;
  }

  public Sort getDeepAvg() {
    return this.deepAvg;
  }

  public void setDeepAvg(Sort deepAvg) {
    this.deepAvg = deepAvg;
  }

  public Sort getDeepMax() {
    return this.deepMax;
  }

  public void setDeepMax(Sort deepMax) {
    this.deepMax = deepMax;
  }

  public Sort getDeepMin() {
    return this.deepMin;
  }

  public void setDeepMin(Sort deepMin) {
    this.deepMin = deepMin;
  }
}
