package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.structure.dto.inputObjectType.NamedStructInput;
import io.graphoenix.structure.dto.inputObjectType.TreeStructInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for 组
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 组")
public interface GroupInputBase extends TreeStructInput, NamedStructInput, MetaInput {
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
   * 路径
   */
  @Description("路径")
  String path = null;

  /**
   * 层级
   */
  @Description("层级")
  Integer deep = null;

  /**
   * 上级ID
   */
  @Description("上级ID")
  String parentId = null;

  /**
   * 上级
   */
  @Description("上级")
  GroupInput parent = null;

  /**
   * 下级
   */
  @Description("下级")
  Collection<GroupInput> subGroups = null;

  /**
   * 用户
   */
  @Description("用户")
  Collection<UserInput> users = null;

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
  String __typename = "Group";

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  Collection<GroupUserRelationInput> groupUserRelation = null;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  Collection<GroupRoleRelationInput> groupRoleRelation = null;

  /**
   * Where
   */
  @Description("Where")
  GroupExpression where = null;

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

  default String getPath() {
    return path;
  }

  void setPath(String path);

  default Integer getDeep() {
    return deep;
  }

  void setDeep(Integer deep);

  default String getParentId() {
    return parentId;
  }

  void setParentId(String parentId);

  default GroupInput getParent() {
    return parent;
  }

  void setParent(GroupInput parent);

  default Collection<GroupInput> getSubGroups() {
    return subGroups;
  }

  void setSubGroups(Collection<GroupInput> subGroups);

  default Collection<UserInput> getUsers() {
    return users;
  }

  void setUsers(Collection<UserInput> users);

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

  default Collection<GroupUserRelationInput> getGroupUserRelation() {
    return groupUserRelation;
  }

  void setGroupUserRelation(Collection<GroupUserRelationInput> groupUserRelation);

  default Collection<GroupRoleRelationInput> getGroupRoleRelation() {
    return groupRoleRelation;
  }

  void setGroupRoleRelation(Collection<GroupRoleRelationInput> groupRoleRelation);

  default GroupExpression getWhere() {
    return where;
  }

  void setWhere(GroupExpression where);
}
