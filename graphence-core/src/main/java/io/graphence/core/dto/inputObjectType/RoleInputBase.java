package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.structure.dto.inputObjectType.NamedStructInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 角色 变更内容
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 变更内容")
public interface RoleInputBase extends NamedStructInput, MetaInput {
  /**
   * ID
   */
  @Description("ID")
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
   * 用户
   */
  @Description("用户")
  Collection<UserInput> users = null;

  /**
   * 组
   */
  @Description("组")
  Collection<GroupInput> groups = null;

  /**
   * 组合
   */
  @Description("组合")
  Collection<RoleInput> composites = null;

  /**
   * 权限
   */
  @Description("权限")
  Collection<PermissionInput> permissions = null;

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
  String __typename = "Role";

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  Collection<RoleUserRelationInput> roleUserRelation = null;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  Collection<GroupRoleRelationInput> groupRoleRelation = null;

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  Collection<RoleCompositeRelationInput> roleCompositeRelation = null;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  Collection<PermissionRoleRelationInput> permissionRoleRelation = null;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  RoleExpression where = null;

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

  default Collection<UserInput> getUsers() {
    return users;
  }

  void setUsers(Collection<UserInput> users);

  default Collection<GroupInput> getGroups() {
    return groups;
  }

  void setGroups(Collection<GroupInput> groups);

  default Collection<RoleInput> getComposites() {
    return composites;
  }

  void setComposites(Collection<RoleInput> composites);

  default Collection<PermissionInput> getPermissions() {
    return permissions;
  }

  void setPermissions(Collection<PermissionInput> permissions);

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

  default Collection<RoleUserRelationInput> getRoleUserRelation() {
    return roleUserRelation;
  }

  void setRoleUserRelation(Collection<RoleUserRelationInput> roleUserRelation);

  default Collection<GroupRoleRelationInput> getGroupRoleRelation() {
    return groupRoleRelation;
  }

  void setGroupRoleRelation(Collection<GroupRoleRelationInput> groupRoleRelation);

  default Collection<RoleCompositeRelationInput> getRoleCompositeRelation() {
    return roleCompositeRelation;
  }

  void setRoleCompositeRelation(Collection<RoleCompositeRelationInput> roleCompositeRelation);

  default Collection<PermissionRoleRelationInput> getPermissionRoleRelation() {
    return permissionRoleRelation;
  }

  void setPermissionRoleRelation(Collection<PermissionRoleRelationInput> permissionRoleRelation);

  default RoleExpression getWhere() {
    return where;
  }

  void setWhere(RoleExpression where);
}
