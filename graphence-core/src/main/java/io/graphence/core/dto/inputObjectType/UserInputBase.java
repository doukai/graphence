package io.graphence.core.dto.inputObjectType;

import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.file.dto.inputObjectType.FileInput;
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
 * 用户 变更内容
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 变更内容")
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
   * file
   */
  @Description("file")
  FileInput file = null;

  /**
   * files
   */
  @Description("files")
  Collection<FileInput> files = null;

  /**
   * booleanList
   */
  @Description("booleanList")
  Collection<Boolean> booleanList = null;

  /**
   * intList
   */
  @Description("intList")
  Collection<Integer> intList = null;

  /**
   * typeList
   */
  @Description("typeList")
  Collection<PermissionType> typeList = null;

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
  String __typename = "User";

  /**
   * 用户 文件 关系
   */
  @Description("用户 文件 关系")
  Collection<FileUserRelationInput> fileUserRelation = null;

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  Collection<UserPhonesRelationInput> userPhonesRelation = null;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  Collection<GroupUserRelationInput> groupUserRelation = null;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  Collection<RoleUserRelationInput> roleUserRelation = null;

  /**
   * 用户 booleanList 关系
   */
  @Description("用户 booleanList 关系")
  Collection<UserBooleanListRelationInput> userBooleanListRelation = null;

  /**
   * 用户 intList 关系
   */
  @Description("用户 intList 关系")
  Collection<UserIntListRelationInput> userIntListRelation = null;

  /**
   * 用户 typeList 关系
   */
  @Description("用户 typeList 关系")
  Collection<UserTypeListRelationInput> userTypeListRelation = null;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
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

  default FileInput getFile() {
    return file;
  }

  void setFile(FileInput file);

  default Collection<FileInput> getFiles() {
    return files;
  }

  void setFiles(Collection<FileInput> files);

  default Collection<Boolean> getBooleanList() {
    return booleanList;
  }

  void setBooleanList(Collection<Boolean> booleanList);

  default Collection<Integer> getIntList() {
    return intList;
  }

  void setIntList(Collection<Integer> intList);

  default Collection<PermissionType> getTypeList() {
    return typeList;
  }

  void setTypeList(Collection<PermissionType> typeList);

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

  default Collection<FileUserRelationInput> getFileUserRelation() {
    return fileUserRelation;
  }

  void setFileUserRelation(Collection<FileUserRelationInput> fileUserRelation);

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

  default Collection<UserBooleanListRelationInput> getUserBooleanListRelation() {
    return userBooleanListRelation;
  }

  void setUserBooleanListRelation(Collection<UserBooleanListRelationInput> userBooleanListRelation);

  default Collection<UserIntListRelationInput> getUserIntListRelation() {
    return userIntListRelation;
  }

  void setUserIntListRelation(Collection<UserIntListRelationInput> userIntListRelation);

  default Collection<UserTypeListRelationInput> getUserTypeListRelation() {
    return userTypeListRelation;
  }

  void setUserTypeListRelation(Collection<UserTypeListRelationInput> userTypeListRelation);

  default UserExpression getWhere() {
    return where;
  }

  void setWhere(UserExpression where);
}
