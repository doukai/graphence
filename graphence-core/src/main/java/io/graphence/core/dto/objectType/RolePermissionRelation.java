package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.RolePermissionRelationInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

/**
 * 角色 权限 关系
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 权限 关系")
public class RolePermissionRelation implements Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  private String roleRef;

  /**
   * 角色
   */
  @Description("角色")
  private Role role;

  /**
   * 权限 引用
   */
  @Description("权限 引用")
  private String permissionRef;

  /**
   * 权限
   */
  @Description("权限")
  private Permission permission;

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
  private String __typename = "RolePermissionRelation";

  /**
   * 角色 权限 关系 数量
   */
  @Description("角色 权限 关系 数量")
  private Integer idCount;

  /**
   * ID 最大值
   */
  @Description("ID 最大值")
  private Integer idMax;

  /**
   * ID 最小值
   */
  @Description("ID 最小值")
  private Integer idMin;

  /**
   * 角色 引用 数量
   */
  @Description("角色 引用 数量")
  private Integer roleRefCount;

  /**
   * 角色 引用 最大值
   */
  @Description("角色 引用 最大值")
  private String roleRefMax;

  /**
   * 角色 引用 最小值
   */
  @Description("角色 引用 最小值")
  private String roleRefMin;

  /**
   * 权限 引用 数量
   */
  @Description("权限 引用 数量")
  private Integer permissionRefCount;

  /**
   * 权限 引用 最大值
   */
  @Description("权限 引用 最大值")
  private String permissionRefMax;

  /**
   * 权限 引用 最小值
   */
  @Description("权限 引用 最小值")
  private String permissionRefMin;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  public String getRoleRef() {
    return this.roleRef;
  }

  public void setRoleRef(String roleRef) {
    this.roleRef = roleRef;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getPermissionRef() {
    return this.permissionRef;
  }

  public void setPermissionRef(String permissionRef) {
    this.permissionRef = permissionRef;
  }

  public Permission getPermission() {
    return this.permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
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

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
    this.idMin = idMin;
  }

  public Integer getRoleRefCount() {
    return this.roleRefCount;
  }

  public void setRoleRefCount(Integer roleRefCount) {
    this.roleRefCount = roleRefCount;
  }

  public String getRoleRefMax() {
    return this.roleRefMax;
  }

  public void setRoleRefMax(String roleRefMax) {
    this.roleRefMax = roleRefMax;
  }

  public String getRoleRefMin() {
    return this.roleRefMin;
  }

  public void setRoleRefMin(String roleRefMin) {
    this.roleRefMin = roleRefMin;
  }

  public Integer getPermissionRefCount() {
    return this.permissionRefCount;
  }

  public void setPermissionRefCount(Integer permissionRefCount) {
    this.permissionRefCount = permissionRefCount;
  }

  public String getPermissionRefMax() {
    return this.permissionRefMax;
  }

  public void setPermissionRefMax(String permissionRefMax) {
    this.permissionRefMax = permissionRefMax;
  }

  public String getPermissionRefMin() {
    return this.permissionRefMin;
  }

  public void setPermissionRefMin(String permissionRefMin) {
    this.permissionRefMin = permissionRefMin;
  }

  public RolePermissionRelationInput toInput() {
    RolePermissionRelationInput input = new RolePermissionRelationInput();
    input.setId(this.getId());
    input.setRoleRef(this.getRoleRef());
    if(getRole() != null) {
      input.setRole(this.getRole().toInput());
    }
    input.setPermissionRef(this.getPermissionRef());
    if(getPermission() != null) {
      input.setPermission(this.getPermission().toInput());
    }
    input.setIsDeprecated(this.getIsDeprecated());
    input.setVersion(this.getVersion());
    input.setRealmId(this.getRealmId());
    input.setCreateUserId(this.getCreateUserId());
    input.setCreateTime(this.getCreateTime());
    input.setUpdateUserId(this.getUpdateUserId());
    input.setUpdateTime(this.getUpdateTime());
    input.setCreateGroupId(this.getCreateGroupId());
    input.set__typename(this.get__typename());
    return input;
  }
}
