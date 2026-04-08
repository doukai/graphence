package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Order Input for 用户")
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
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  private UserPhonesRelationOrderBy userPhonesRelation;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private GroupUserRelationOrderBy groupUserRelation;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private RoleUserRelationOrderBy roleUserRelation;

  /**
   * Aggregate Field for 组
   */
  @Description("Aggregate Field for 组")
  private GroupOrderBy groupsAggregate;

  /**
   * Aggregate Field for 角色
   */
  @Description("Aggregate Field for 角色")
  private RoleOrderBy rolesAggregate;

  /**
   * Aggregate Field for Relationship Object between 用户 and 手机号
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 手机号")
  private UserPhonesRelationOrderBy userPhonesRelationAggregate;

  /**
   * Aggregate Field for Relationship Object between 用户 and 组
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 组")
  private GroupUserRelationOrderBy groupUserRelationAggregate;

  /**
   * Aggregate Field for Relationship Object between 用户 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 角色")
  private RoleUserRelationOrderBy roleUserRelationAggregate;

  /**
   * Count of 用户
   */
  @Description("Count of 用户")
  private Sort idCount;

  /**
   * Count of 姓名
   */
  @Description("Count of 姓名")
  private Sort nameCount;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Sort descriptionCount;

  /**
   * Count of 姓氏
   */
  @Description("Count of 姓氏")
  private Sort lastNameCount;

  /**
   * Count of 账号
   */
  @Description("Count of 账号")
  private Sort loginCount;

  /**
   * Count of 盐
   */
  @Description("Count of 盐")
  private Sort saltCount;

  /**
   * Count of 哈希
   */
  @Description("Count of 哈希")
  private Sort hashCount;

  /**
   * Count of 邮箱
   */
  @Description("Count of 邮箱")
  private Sort emailCount;

  /**
   * Count of 禁用
   */
  @Description("Count of 禁用")
  private Sort disableCount;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  private Sort createTimeYear;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  private Sort createTimeMonth;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  private Sort createTimeDay;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  private Sort createTimeWeek;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  private Sort createTimeQuarter;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  private Sort updateTimeYear;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  private Sort updateTimeMonth;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  private Sort updateTimeDay;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  private Sort updateTimeWeek;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  private Sort updateTimeQuarter;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<UserOrderBy> obs;

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

  public Sort getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Sort idCount) {
    this.idCount = idCount;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getLastNameCount() {
    return this.lastNameCount;
  }

  public void setLastNameCount(Sort lastNameCount) {
    this.lastNameCount = lastNameCount;
  }

  public Sort getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Sort loginCount) {
    this.loginCount = loginCount;
  }

  public Sort getSaltCount() {
    return this.saltCount;
  }

  public void setSaltCount(Sort saltCount) {
    this.saltCount = saltCount;
  }

  public Sort getHashCount() {
    return this.hashCount;
  }

  public void setHashCount(Sort hashCount) {
    this.hashCount = hashCount;
  }

  public Sort getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Sort emailCount) {
    this.emailCount = emailCount;
  }

  public Sort getDisableCount() {
    return this.disableCount;
  }

  public void setDisableCount(Sort disableCount) {
    this.disableCount = disableCount;
  }

  public Sort getCreateTimeYear() {
    return this.createTimeYear;
  }

  public void setCreateTimeYear(Sort createTimeYear) {
    this.createTimeYear = createTimeYear;
  }

  public Sort getCreateTimeMonth() {
    return this.createTimeMonth;
  }

  public void setCreateTimeMonth(Sort createTimeMonth) {
    this.createTimeMonth = createTimeMonth;
  }

  public Sort getCreateTimeDay() {
    return this.createTimeDay;
  }

  public void setCreateTimeDay(Sort createTimeDay) {
    this.createTimeDay = createTimeDay;
  }

  public Sort getCreateTimeWeek() {
    return this.createTimeWeek;
  }

  public void setCreateTimeWeek(Sort createTimeWeek) {
    this.createTimeWeek = createTimeWeek;
  }

  public Sort getCreateTimeQuarter() {
    return this.createTimeQuarter;
  }

  public void setCreateTimeQuarter(Sort createTimeQuarter) {
    this.createTimeQuarter = createTimeQuarter;
  }

  public Sort getUpdateTimeYear() {
    return this.updateTimeYear;
  }

  public void setUpdateTimeYear(Sort updateTimeYear) {
    this.updateTimeYear = updateTimeYear;
  }

  public Sort getUpdateTimeMonth() {
    return this.updateTimeMonth;
  }

  public void setUpdateTimeMonth(Sort updateTimeMonth) {
    this.updateTimeMonth = updateTimeMonth;
  }

  public Sort getUpdateTimeDay() {
    return this.updateTimeDay;
  }

  public void setUpdateTimeDay(Sort updateTimeDay) {
    this.updateTimeDay = updateTimeDay;
  }

  public Sort getUpdateTimeWeek() {
    return this.updateTimeWeek;
  }

  public void setUpdateTimeWeek(Sort updateTimeWeek) {
    this.updateTimeWeek = updateTimeWeek;
  }

  public Sort getUpdateTimeQuarter() {
    return this.updateTimeQuarter;
  }

  public void setUpdateTimeQuarter(Sort updateTimeQuarter) {
    this.updateTimeQuarter = updateTimeQuarter;
  }

  public Collection<UserOrderBy> getObs() {
    return this.obs;
  }

  public void setObs(Collection<UserOrderBy> obs) {
    this.obs = obs;
  }
}
