package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 租户 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("租户 排序")
public class RealmOrderBy {
  /**
   * id
   */
  @Description("id")
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
}
