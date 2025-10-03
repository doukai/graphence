package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 组 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("组 排序")
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
   * 组 数量
   */
  @Description("组 数量")
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
   * 路径 数量
   */
  @Description("路径 数量")
  private Sort pathCount;

  /**
   * 路径 最大值
   */
  @Description("路径 最大值")
  private Sort pathMax;

  /**
   * 路径 最小值
   */
  @Description("路径 最小值")
  private Sort pathMin;

  /**
   * 上级ID 数量
   */
  @Description("上级ID 数量")
  private Sort parentIdCount;

  /**
   * 上级ID 最大值
   */
  @Description("上级ID 最大值")
  private Sort parentIdMax;

  /**
   * 上级ID 最小值
   */
  @Description("上级ID 最小值")
  private Sort parentIdMin;

  /**
   * 层级 数量
   */
  @Description("层级 数量")
  private Sort deepCount;

  /**
   * 层级 合计
   */
  @Description("层级 合计")
  private Sort deepSum;

  /**
   * 层级 平均值
   */
  @Description("层级 平均值")
  private Sort deepAvg;

  /**
   * 层级 最大值
   */
  @Description("层级 最大值")
  private Sort deepMax;

  /**
   * 层级 最小值
   */
  @Description("层级 最小值")
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
