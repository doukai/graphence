package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 用户 组 关系 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 组 关系 排序")
public class GroupUserRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 用户 引用
   */
  @Description("用户 引用")
  private Sort userRef;

  /**
   * 用户
   */
  @Description("用户")
  private UserOrderBy user;

  /**
   * 组 引用
   */
  @Description("组 引用")
  private Sort groupRef;

  /**
   * 组
   */
  @Description("组")
  private GroupOrderBy group;

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
   * 用户 组 关系 数量
   */
  @Description("用户 组 关系 数量")
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
   * 用户 引用 数量
   */
  @Description("用户 引用 数量")
  private Sort userRefCount;

  /**
   * 用户 引用 最大值
   */
  @Description("用户 引用 最大值")
  private Sort userRefMax;

  /**
   * 用户 引用 最小值
   */
  @Description("用户 引用 最小值")
  private Sort userRefMin;

  /**
   * 组 引用 数量
   */
  @Description("组 引用 数量")
  private Sort groupRefCount;

  /**
   * 组 引用 最大值
   */
  @Description("组 引用 最大值")
  private Sort groupRefMax;

  /**
   * 组 引用 最小值
   */
  @Description("组 引用 最小值")
  private Sort groupRefMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Sort userRef) {
    this.userRef = userRef;
  }

  public UserOrderBy getUser() {
    return this.user;
  }

  public void setUser(UserOrderBy user) {
    this.user = user;
  }

  public Sort getGroupRef() {
    return this.groupRef;
  }

  public void setGroupRef(Sort groupRef) {
    this.groupRef = groupRef;
  }

  public GroupOrderBy getGroup() {
    return this.group;
  }

  public void setGroup(GroupOrderBy group) {
    this.group = group;
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

  public Sort getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Sort userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Sort getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Sort userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Sort getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Sort userRefMin) {
    this.userRefMin = userRefMin;
  }

  public Sort getGroupRefCount() {
    return this.groupRefCount;
  }

  public void setGroupRefCount(Sort groupRefCount) {
    this.groupRefCount = groupRefCount;
  }

  public Sort getGroupRefMax() {
    return this.groupRefMax;
  }

  public void setGroupRefMax(Sort groupRefMax) {
    this.groupRefMax = groupRefMax;
  }

  public Sort getGroupRefMin() {
    return this.groupRefMin;
  }

  public void setGroupRefMin(Sort groupRefMin) {
    this.groupRefMin = groupRefMin;
  }
}
