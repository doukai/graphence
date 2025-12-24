package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 用户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
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
   * Count of 用户
   */
  @Description("Count of 用户")
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
   * Count of 姓名
   */
  @Description("Count of 姓名")
  private Sort nameCount;

  /**
   * Max of 姓名
   */
  @Description("Max of 姓名")
  private Sort nameMax;

  /**
   * Min of 姓名
   */
  @Description("Min of 姓名")
  private Sort nameMin;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Sort descriptionCount;

  /**
   * Max of 描述
   */
  @Description("Max of 描述")
  private Sort descriptionMax;

  /**
   * Min of 描述
   */
  @Description("Min of 描述")
  private Sort descriptionMin;

  /**
   * Count of 姓氏
   */
  @Description("Count of 姓氏")
  private Sort lastNameCount;

  /**
   * Max of 姓氏
   */
  @Description("Max of 姓氏")
  private Sort lastNameMax;

  /**
   * Min of 姓氏
   */
  @Description("Min of 姓氏")
  private Sort lastNameMin;

  /**
   * Count of 账号
   */
  @Description("Count of 账号")
  private Sort loginCount;

  /**
   * Max of 账号
   */
  @Description("Max of 账号")
  private Sort loginMax;

  /**
   * Min of 账号
   */
  @Description("Min of 账号")
  private Sort loginMin;

  /**
   * Count of 盐
   */
  @Description("Count of 盐")
  private Sort saltCount;

  /**
   * Max of 盐
   */
  @Description("Max of 盐")
  private Sort saltMax;

  /**
   * Min of 盐
   */
  @Description("Min of 盐")
  private Sort saltMin;

  /**
   * Count of 哈希
   */
  @Description("Count of 哈希")
  private Sort hashCount;

  /**
   * Max of 哈希
   */
  @Description("Max of 哈希")
  private Sort hashMax;

  /**
   * Min of 哈希
   */
  @Description("Min of 哈希")
  private Sort hashMin;

  /**
   * Count of 邮箱
   */
  @Description("Count of 邮箱")
  private Sort emailCount;

  /**
   * Max of 邮箱
   */
  @Description("Max of 邮箱")
  private Sort emailMax;

  /**
   * Min of 邮箱
   */
  @Description("Min of 邮箱")
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
