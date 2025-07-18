package io.graphence.core.dto.inputObjectType;

import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 权限 变更内容
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限 变更内容")
public interface PermissionInputBase extends MetaInput {
  /**
   * id
   */
  @Description("id")
  String id = null;

  /**
   * 名称
   */
  @Description("名称")
  String name = null;

  /**
   * 描述
   */
  @Description("描述")
  String description = null;

  /**
   * 字段
   */
  @Description("字段")
  String field = null;

  /**
   * 实体
   */
  @Description("实体")
  String type = null;

  /**
   * 权限类型
   */
  @Description("权限类型")
  PermissionType permissionType = null;

  /**
   * 角色
   */
  @Description("角色")
  Collection<RoleInput> roles = null;

  /**
   * 租户
   */
  @Description("租户")
  RealmInput realm = null;

  /**
   * 已移除
   */
  @Description("已移除")
  Boolean isDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  Integer version = null;

  /**
   * 域
   */
  @Description("域")
  Integer realmId = null;

  /**
   * 创建者
   */
  @Description("创建者")
  String createUserId = null;

  /**
   * 创建时间
   */
  @Description("创建时间")
  LocalDateTime createTime = null;

  /**
   * 更新者
   */
  @Description("更新者")
  String updateUserId = null;

  /**
   * 更新时间
   */
  @Description("更新时间")
  LocalDateTime updateTime = null;

  /**
   * 创建组
   */
  @Description("创建组")
  String createGroupId = null;

  /**
   * 所属类型
   */
  @Description("所属类型")
  String __typename = "Permission";

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  Collection<RolePermissionRelationInput> rolePermissionRelation = null;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  PermissionExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getName() {
    return name;
  }

  void setName(String name);

  default String getDescription() {
    return description;
  }

  void setDescription(String description);

  default String getField() {
    return field;
  }

  void setField(String field);

  default String getType() {
    return type;
  }

  void setType(String type);

  default PermissionType getPermissionType() {
    return permissionType;
  }

  void setPermissionType(PermissionType permissionType);

  default Collection<RoleInput> getRoles() {
    return roles;
  }

  void setRoles(Collection<RoleInput> roles);

  default RealmInput getRealm() {
    return realm;
  }

  void setRealm(RealmInput realm);

  default Boolean getIsDeprecated() {
    return isDeprecated;
  }

  void setIsDeprecated(Boolean isDeprecated);

  default Integer getVersion() {
    return version;
  }

  void setVersion(Integer version);

  default Integer getRealmId() {
    return realmId;
  }

  void setRealmId(Integer realmId);

  default String getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(String createUserId);

  default LocalDateTime getCreateTime() {
    return createTime;
  }

  void setCreateTime(LocalDateTime createTime);

  default String getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(String updateUserId);

  default LocalDateTime getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(LocalDateTime updateTime);

  default String getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(String createGroupId);

  default String get__typename() {
    return __typename;
  }

  void set__typename(String __typename);

  default Collection<RolePermissionRelationInput> getRolePermissionRelation() {
    return rolePermissionRelation;
  }

  void setRolePermissionRelation(Collection<RolePermissionRelationInput> rolePermissionRelation);

  default PermissionExpression getWhere() {
    return where;
  }

  void setWhere(PermissionExpression where);
}
