package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import io.graphoenix.file.dto.inputObjectType.FileOrderBy;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 用户 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 排序")
public class UserOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 姓名
   */
  @Description("姓名")
  private Sort name;

  /**
   * 描述
   */
  @Description("描述")
  private Sort description;

  /**
   * 姓氏
   */
  @Description("姓氏")
  private Sort lastName;

  /**
   * 账号
   */
  @Description("账号")
  private Sort login;

  /**
   * 盐
   */
  @Description("盐")
  private Sort salt;

  /**
   * 哈希
   */
  @Description("哈希")
  private Sort hash;

  /**
   * 邮箱
   */
  @Description("邮箱")
  private Sort email;

  /**
   * 手机号
   */
  @Description("手机号")
  private Sort phones;

  /**
   * 禁用
   */
  @Description("禁用")
  private Sort disable;

  /**
   * 组
   */
  @Description("组")
  private GroupOrderBy groups;

  /**
   * 角色
   */
  @Description("角色")
  private RoleOrderBy roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmOrderBy realm;

  /**
   * file
   */
  @Description("file")
  private FileOrderBy file;

  /**
   * files
   */
  @Description("files")
  private FileOrderBy files;

  /**
   * booleanList
   */
  @Description("booleanList")
  private Sort booleanList;

  /**
   * intList
   */
  @Description("intList")
  private Sort intList;

  /**
   * typeList
   */
  @Description("typeList")
  private Sort typeList;

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
   * 用户 文件 关系
   */
  @Description("用户 文件 关系")
  private FileUserRelationOrderBy fileUserRelation;

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  private UserPhonesRelationOrderBy userPhonesRelation;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private GroupUserRelationOrderBy groupUserRelation;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private RoleUserRelationOrderBy roleUserRelation;

  /**
   * 用户 booleanList 关系
   */
  @Description("用户 booleanList 关系")
  private UserBooleanListRelationOrderBy userBooleanListRelation;

  /**
   * 用户 intList 关系
   */
  @Description("用户 intList 关系")
  private UserIntListRelationOrderBy userIntListRelation;

  /**
   * 用户 typeList 关系
   */
  @Description("用户 typeList 关系")
  private UserTypeListRelationOrderBy userTypeListRelation;

  /**
   * 组 统计字段
   */
  @Description("组 统计字段")
  private GroupOrderBy groupsAggregate;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  private RoleOrderBy rolesAggregate;

  /**
   * 用户 手机号 关系 统计字段
   */
  @Description("用户 手机号 关系 统计字段")
  private UserPhonesRelationOrderBy userPhonesRelationAggregate;

  /**
   * 用户 组 关系 统计字段
   */
  @Description("用户 组 关系 统计字段")
  private GroupUserRelationOrderBy groupUserRelationAggregate;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  private RoleUserRelationOrderBy roleUserRelationAggregate;

  /**
   * 用户 booleanList 关系 统计字段
   */
  @Description("用户 booleanList 关系 统计字段")
  private UserBooleanListRelationOrderBy userBooleanListRelationAggregate;

  /**
   * 用户 intList 关系 统计字段
   */
  @Description("用户 intList 关系 统计字段")
  private UserIntListRelationOrderBy userIntListRelationAggregate;

  /**
   * 用户 typeList 关系 统计字段
   */
  @Description("用户 typeList 关系 统计字段")
  private UserTypeListRelationOrderBy userTypeListRelationAggregate;

  /**
   * 用户 数量
   */
  @Description("用户 数量")
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
   * 姓名 数量
   */
  @Description("姓名 数量")
  private Sort nameCount;

  /**
   * 姓名 最大值
   */
  @Description("姓名 最大值")
  private Sort nameMax;

  /**
   * 姓名 最小值
   */
  @Description("姓名 最小值")
  private Sort nameMin;

  /**
   * 描述 数量
   */
  @Description("描述 数量")
  private Sort descriptionCount;

  /**
   * 描述 最大值
   */
  @Description("描述 最大值")
  private Sort descriptionMax;

  /**
   * 描述 最小值
   */
  @Description("描述 最小值")
  private Sort descriptionMin;

  /**
   * 姓氏 数量
   */
  @Description("姓氏 数量")
  private Sort lastNameCount;

  /**
   * 姓氏 最大值
   */
  @Description("姓氏 最大值")
  private Sort lastNameMax;

  /**
   * 姓氏 最小值
   */
  @Description("姓氏 最小值")
  private Sort lastNameMin;

  /**
   * 账号 数量
   */
  @Description("账号 数量")
  private Sort loginCount;

  /**
   * 账号 最大值
   */
  @Description("账号 最大值")
  private Sort loginMax;

  /**
   * 账号 最小值
   */
  @Description("账号 最小值")
  private Sort loginMin;

  /**
   * 盐 数量
   */
  @Description("盐 数量")
  private Sort saltCount;

  /**
   * 盐 最大值
   */
  @Description("盐 最大值")
  private Sort saltMax;

  /**
   * 盐 最小值
   */
  @Description("盐 最小值")
  private Sort saltMin;

  /**
   * 哈希 数量
   */
  @Description("哈希 数量")
  private Sort hashCount;

  /**
   * 哈希 最大值
   */
  @Description("哈希 最大值")
  private Sort hashMax;

  /**
   * 哈希 最小值
   */
  @Description("哈希 最小值")
  private Sort hashMin;

  /**
   * 邮箱 数量
   */
  @Description("邮箱 数量")
  private Sort emailCount;

  /**
   * 邮箱 最大值
   */
  @Description("邮箱 最大值")
  private Sort emailMax;

  /**
   * 邮箱 最小值
   */
  @Description("邮箱 最小值")
  private Sort emailMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getDescription() {
    return this.description;
  }

  public void setDescription(Sort description) {
    this.description = description;
  }

  public Sort getLastName() {
    return this.lastName;
  }

  public void setLastName(Sort lastName) {
    this.lastName = lastName;
  }

  public Sort getLogin() {
    return this.login;
  }

  public void setLogin(Sort login) {
    this.login = login;
  }

  public Sort getSalt() {
    return this.salt;
  }

  public void setSalt(Sort salt) {
    this.salt = salt;
  }

  public Sort getHash() {
    return this.hash;
  }

  public void setHash(Sort hash) {
    this.hash = hash;
  }

  public Sort getEmail() {
    return this.email;
  }

  public void setEmail(Sort email) {
    this.email = email;
  }

  public Sort getPhones() {
    return this.phones;
  }

  public void setPhones(Sort phones) {
    this.phones = phones;
  }

  public Sort getDisable() {
    return this.disable;
  }

  public void setDisable(Sort disable) {
    this.disable = disable;
  }

  public GroupOrderBy getGroups() {
    return this.groups;
  }

  public void setGroups(GroupOrderBy groups) {
    this.groups = groups;
  }

  public RoleOrderBy getRoles() {
    return this.roles;
  }

  public void setRoles(RoleOrderBy roles) {
    this.roles = roles;
  }

  public RealmOrderBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmOrderBy realm) {
    this.realm = realm;
  }

  public FileOrderBy getFile() {
    return this.file;
  }

  public void setFile(FileOrderBy file) {
    this.file = file;
  }

  public FileOrderBy getFiles() {
    return this.files;
  }

  public void setFiles(FileOrderBy files) {
    this.files = files;
  }

  public Sort getBooleanList() {
    return this.booleanList;
  }

  public void setBooleanList(Sort booleanList) {
    this.booleanList = booleanList;
  }

  public Sort getIntList() {
    return this.intList;
  }

  public void setIntList(Sort intList) {
    this.intList = intList;
  }

  public Sort getTypeList() {
    return this.typeList;
  }

  public void setTypeList(Sort typeList) {
    this.typeList = typeList;
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

  public FileUserRelationOrderBy getFileUserRelation() {
    return this.fileUserRelation;
  }

  public void setFileUserRelation(FileUserRelationOrderBy fileUserRelation) {
    this.fileUserRelation = fileUserRelation;
  }

  public UserPhonesRelationOrderBy getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  public void setUserPhonesRelation(UserPhonesRelationOrderBy userPhonesRelation) {
    this.userPhonesRelation = userPhonesRelation;
  }

  public GroupUserRelationOrderBy getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelationOrderBy groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public RoleUserRelationOrderBy getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(RoleUserRelationOrderBy roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public UserBooleanListRelationOrderBy getUserBooleanListRelation() {
    return this.userBooleanListRelation;
  }

  public void setUserBooleanListRelation(UserBooleanListRelationOrderBy userBooleanListRelation) {
    this.userBooleanListRelation = userBooleanListRelation;
  }

  public UserIntListRelationOrderBy getUserIntListRelation() {
    return this.userIntListRelation;
  }

  public void setUserIntListRelation(UserIntListRelationOrderBy userIntListRelation) {
    this.userIntListRelation = userIntListRelation;
  }

  public UserTypeListRelationOrderBy getUserTypeListRelation() {
    return this.userTypeListRelation;
  }

  public void setUserTypeListRelation(UserTypeListRelationOrderBy userTypeListRelation) {
    this.userTypeListRelation = userTypeListRelation;
  }

  public GroupOrderBy getGroupsAggregate() {
    return this.groupsAggregate;
  }

  public void setGroupsAggregate(GroupOrderBy groupsAggregate) {
    this.groupsAggregate = groupsAggregate;
  }

  public RoleOrderBy getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(RoleOrderBy rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public UserPhonesRelationOrderBy getUserPhonesRelationAggregate() {
    return this.userPhonesRelationAggregate;
  }

  public void setUserPhonesRelationAggregate(
      UserPhonesRelationOrderBy userPhonesRelationAggregate) {
    this.userPhonesRelationAggregate = userPhonesRelationAggregate;
  }

  public GroupUserRelationOrderBy getGroupUserRelationAggregate() {
    return this.groupUserRelationAggregate;
  }

  public void setGroupUserRelationAggregate(GroupUserRelationOrderBy groupUserRelationAggregate) {
    this.groupUserRelationAggregate = groupUserRelationAggregate;
  }

  public RoleUserRelationOrderBy getRoleUserRelationAggregate() {
    return this.roleUserRelationAggregate;
  }

  public void setRoleUserRelationAggregate(RoleUserRelationOrderBy roleUserRelationAggregate) {
    this.roleUserRelationAggregate = roleUserRelationAggregate;
  }

  public UserBooleanListRelationOrderBy getUserBooleanListRelationAggregate() {
    return this.userBooleanListRelationAggregate;
  }

  public void setUserBooleanListRelationAggregate(
      UserBooleanListRelationOrderBy userBooleanListRelationAggregate) {
    this.userBooleanListRelationAggregate = userBooleanListRelationAggregate;
  }

  public UserIntListRelationOrderBy getUserIntListRelationAggregate() {
    return this.userIntListRelationAggregate;
  }

  public void setUserIntListRelationAggregate(
      UserIntListRelationOrderBy userIntListRelationAggregate) {
    this.userIntListRelationAggregate = userIntListRelationAggregate;
  }

  public UserTypeListRelationOrderBy getUserTypeListRelationAggregate() {
    return this.userTypeListRelationAggregate;
  }

  public void setUserTypeListRelationAggregate(
      UserTypeListRelationOrderBy userTypeListRelationAggregate) {
    this.userTypeListRelationAggregate = userTypeListRelationAggregate;
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

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(Sort descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public Sort getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(Sort descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Sort getLastNameCount() {
    return this.lastNameCount;
  }

  public void setLastNameCount(Sort lastNameCount) {
    this.lastNameCount = lastNameCount;
  }

  public Sort getLastNameMax() {
    return this.lastNameMax;
  }

  public void setLastNameMax(Sort lastNameMax) {
    this.lastNameMax = lastNameMax;
  }

  public Sort getLastNameMin() {
    return this.lastNameMin;
  }

  public void setLastNameMin(Sort lastNameMin) {
    this.lastNameMin = lastNameMin;
  }

  public Sort getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Sort loginCount) {
    this.loginCount = loginCount;
  }

  public Sort getLoginMax() {
    return this.loginMax;
  }

  public void setLoginMax(Sort loginMax) {
    this.loginMax = loginMax;
  }

  public Sort getLoginMin() {
    return this.loginMin;
  }

  public void setLoginMin(Sort loginMin) {
    this.loginMin = loginMin;
  }

  public Sort getSaltCount() {
    return this.saltCount;
  }

  public void setSaltCount(Sort saltCount) {
    this.saltCount = saltCount;
  }

  public Sort getSaltMax() {
    return this.saltMax;
  }

  public void setSaltMax(Sort saltMax) {
    this.saltMax = saltMax;
  }

  public Sort getSaltMin() {
    return this.saltMin;
  }

  public void setSaltMin(Sort saltMin) {
    this.saltMin = saltMin;
  }

  public Sort getHashCount() {
    return this.hashCount;
  }

  public void setHashCount(Sort hashCount) {
    this.hashCount = hashCount;
  }

  public Sort getHashMax() {
    return this.hashMax;
  }

  public void setHashMax(Sort hashMax) {
    this.hashMax = hashMax;
  }

  public Sort getHashMin() {
    return this.hashMin;
  }

  public void setHashMin(Sort hashMin) {
    this.hashMin = hashMin;
  }

  public Sort getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Sort emailCount) {
    this.emailCount = emailCount;
  }

  public Sort getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(Sort emailMax) {
    this.emailMax = emailMax;
  }

  public Sort getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(Sort emailMin) {
    this.emailMin = emailMin;
  }
}
