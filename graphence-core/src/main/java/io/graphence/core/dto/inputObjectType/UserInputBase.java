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
 * Mutation Input for 用户
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 用户")
public interface UserInputBase extends NamedStructInput, MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

  /**
   * 姓名
   */
  @Description("姓名")
  String name = null;

  /**
   * 描述
   */
  @Description("描述")
  String description = null;

  /**
   * 姓氏
   */
  @Description("姓氏")
  String lastName = null;

  /**
   * 账号
   */
  @Description("账号")
  String login = null;

  /**
   * 盐
   */
  @Description("盐")
  String salt = null;

  /**
   * 哈希
   */
  @Description("哈希")
  String hash = null;

  /**
   * 邮箱
   */
  @Description("邮箱")
  String email = null;

  /**
   * 手机号
   */
  @Description("手机号")
  Collection<String> phones = null;

  /**
   * 禁用
   */
  @Description("禁用")
  Boolean disable = null;

  /**
   * 组
   */
  @Description("组")
  Collection<GroupInput> groups = null;

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
  String __typename = "User";

  /**
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  Collection<UserPhonesRelationInput> userPhonesRelation = null;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  Collection<GroupUserRelationInput> groupUserRelation = null;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  Collection<RoleUserRelationInput> roleUserRelation = null;

  /**
   * Where
   */
  @Description("Where")
  UserExpression where = null;

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

  default String getLastName() {
    return lastName;
  }

  void setLastName(String lastName);

  default String getLogin() {
    return login;
  }

  void setLogin(String login);

  default String getSalt() {
    return salt;
  }

  void setSalt(String salt);

  default String getHash() {
    return hash;
  }

  void setHash(String hash);

  default String getEmail() {
    return email;
  }

  void setEmail(String email);

  default Collection<String> getPhones() {
    return phones;
  }

  void setPhones(Collection<String> phones);

  default Boolean getDisable() {
    return disable;
  }

  void setDisable(Boolean disable);

  default Collection<GroupInput> getGroups() {
    return groups;
  }

  void setGroups(Collection<GroupInput> groups);

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

  default Collection<UserPhonesRelationInput> getUserPhonesRelation() {
    return userPhonesRelation;
  }

  void setUserPhonesRelation(Collection<UserPhonesRelationInput> userPhonesRelation);

  default Collection<GroupUserRelationInput> getGroupUserRelation() {
    return groupUserRelation;
  }

  void setGroupUserRelation(Collection<GroupUserRelationInput> groupUserRelation);

  default Collection<RoleUserRelationInput> getRoleUserRelation() {
    return roleUserRelation;
  }

  void setRoleUserRelation(Collection<RoleUserRelationInput> roleUserRelation);

  default UserExpression getWhere() {
    return where;
  }

  void setWhere(UserExpression where);
}
