package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 角色 权限 关系 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 权限 关系 排序")
public class RolePermissionRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  private Sort roleRef;

  /**
   * 角色
   */
  @Description("角色")
  private RoleOrderBy role;

  /**
   * 权限 引用
   */
  @Description("权限 引用")
  private Sort permissionRef;

  /**
   * 权限
   */
  @Description("权限")
  private PermissionOrderBy permission;

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
   * 角色 权限 关系 数量
   */
  @Description("角色 权限 关系 数量")
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
   * 角色 引用 数量
   */
  @Description("角色 引用 数量")
  private Sort roleRefCount;

  /**
   * 角色 引用 最大值
   */
  @Description("角色 引用 最大值")
  private Sort roleRefMax;

  /**
   * 角色 引用 最小值
   */
  @Description("角色 引用 最小值")
  private Sort roleRefMin;

  /**
   * 权限 引用 数量
   */
  @Description("权限 引用 数量")
  private Sort permissionRefCount;

  /**
   * 权限 引用 最大值
   */
  @Description("权限 引用 最大值")
  private Sort permissionRefMax;

  /**
   * 权限 引用 最小值
   */
  @Description("权限 引用 最小值")
  private Sort permissionRefMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getRoleRef() {
    return this.roleRef;
  }

  public void setRoleRef(Sort roleRef) {
    this.roleRef = roleRef;
  }

  public RoleOrderBy getRole() {
    return this.role;
  }

  public void setRole(RoleOrderBy role) {
    this.role = role;
  }

  public Sort getPermissionRef() {
    return this.permissionRef;
  }

  public void setPermissionRef(Sort permissionRef) {
    this.permissionRef = permissionRef;
  }

  public PermissionOrderBy getPermission() {
    return this.permission;
  }

  public void setPermission(PermissionOrderBy permission) {
    this.permission = permission;
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

  public Sort getRoleRefCount() {
    return this.roleRefCount;
  }

  public void setRoleRefCount(Sort roleRefCount) {
    this.roleRefCount = roleRefCount;
  }

  public Sort getRoleRefMax() {
    return this.roleRefMax;
  }

  public void setRoleRefMax(Sort roleRefMax) {
    this.roleRefMax = roleRefMax;
  }

  public Sort getRoleRefMin() {
    return this.roleRefMin;
  }

  public void setRoleRefMin(Sort roleRefMin) {
    this.roleRefMin = roleRefMin;
  }

  public Sort getPermissionRefCount() {
    return this.permissionRefCount;
  }

  public void setPermissionRefCount(Sort permissionRefCount) {
    this.permissionRefCount = permissionRefCount;
  }

  public Sort getPermissionRefMax() {
    return this.permissionRefMax;
  }

  public void setPermissionRefMax(Sort permissionRefMax) {
    this.permissionRefMax = permissionRefMax;
  }

  public Sort getPermissionRefMin() {
    return this.permissionRefMin;
  }

  public void setPermissionRefMin(Sort permissionRefMin) {
    this.permissionRefMin = permissionRefMin;
  }
}
