package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for Relationship Object between 角色 and 权限
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Order Input for Relationship Object between 角色 and 权限")
public class RolePermissionRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  private Sort roleRef;

  /**
   * 权限 Reference
   */
  @Description("权限 Reference")
  private Sort permissionRef;

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
   * Count of Relationship Object between 角色 and 权限
   */
  @Description("Count of Relationship Object between 角色 and 权限")
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
   * Count of 角色 Reference
   */
  @Description("Count of 角色 Reference")
  private Sort roleRefCount;

  /**
   * Max of 角色 Reference
   */
  @Description("Max of 角色 Reference")
  private Sort roleRefMax;

  /**
   * Min of 角色 Reference
   */
  @Description("Min of 角色 Reference")
  private Sort roleRefMin;

  /**
   * Count of 权限 Reference
   */
  @Description("Count of 权限 Reference")
  private Sort permissionRefCount;

  /**
   * Max of 权限 Reference
   */
  @Description("Max of 权限 Reference")
  private Sort permissionRefMax;

  /**
   * Min of 权限 Reference
   */
  @Description("Min of 权限 Reference")
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

  public Sort getPermissionRef() {
    return this.permissionRef;
  }

  public void setPermissionRef(Sort permissionRef) {
    this.permissionRef = permissionRef;
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
