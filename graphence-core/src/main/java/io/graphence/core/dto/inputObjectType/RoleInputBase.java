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
 * Mutation Input for 角色
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 角色")
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
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  Integer version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Integer realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  LocalDateTime createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  LocalDateTime updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename = "Role";

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  Collection<RoleUserRelationInput> roleUserRelation = null;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  Collection<GroupRoleRelationInput> groupRoleRelation = null;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  Collection<RoleCompositeRelationInput> roleCompositeRelation = null;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  Collection<RolePermissionRelationInput> rolePermissionRelation = null;

  /**
   * Where
   */
  @Description("Where")
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

  default Collection<RolePermissionRelationInput> getRolePermissionRelation() {
    return rolePermissionRelation;
  }

  void setRolePermissionRelation(Collection<RolePermissionRelationInput> rolePermissionRelation);

  default RoleExpression getWhere() {
    return where;
  }

  void setWhere(RoleExpression where);
}
