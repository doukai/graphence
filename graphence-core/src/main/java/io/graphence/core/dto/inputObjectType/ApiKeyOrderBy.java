package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for API Key
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Order Input for API Key")
public class ApiKeyOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 名称
   */
  @Description("名称")
  private Sort name;

  /**
   * 描述
   */
  @Description("描述")
  private Sort description;

  /**
   * Access Key
   */
  @Description("Access Key")
  private Sort accessKey;

  /**
   * Secret
   */
  @Description("Secret")
  private Sort secret;

  /**
   * 禁用
   */
  @Description("禁用")
  private Sort disable;

  /**
   * 过期时间
   */
  @Description("过期时间")
  private Sort expiresAt;

  /**
   * 最后使用时间
   */
  @Description("最后使用时间")
  private Sort lastUsedAt;

  /**
   * 用户ID
   */
  @Description("用户ID")
  private Sort userId;

  /**
   * 用户
   */
  @Description("用户")
  private UserOrderBy user;

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
   * Count of API Key
   */
  @Description("Count of API Key")
  private Sort idCount;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  private Sort nameCount;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Sort descriptionCount;

  /**
   * Count of Access Key
   */
  @Description("Count of Access Key")
  private Sort accessKeyCount;

  /**
   * Count of Secret
   */
  @Description("Count of Secret")
  private Sort secretCount;

  /**
   * Count of 禁用
   */
  @Description("Count of 禁用")
  private Sort disableCount;

  /**
   * Count of 过期时间
   */
  @Description("Count of 过期时间")
  private Sort expiresAtCount;

  /**
   * Count of 最后使用时间
   */
  @Description("Count of 最后使用时间")
  private Sort lastUsedAtCount;

  /**
   * Count of 用户ID
   */
  @Description("Count of 用户ID")
  private Sort userIdCount;

  /**
   * Max of 过期时间
   */
  @Description("Max of 过期时间")
  private Sort expiresAtMax;

  /**
   * Min of 过期时间
   */
  @Description("Min of 过期时间")
  private Sort expiresAtMin;

  /**
   * Max of 最后使用时间
   */
  @Description("Max of 最后使用时间")
  private Sort lastUsedAtMax;

  /**
   * Min of 最后使用时间
   */
  @Description("Min of 最后使用时间")
  private Sort lastUsedAtMin;

  /**
   * Year of 过期时间
   */
  @Description("Year of 过期时间")
  private Sort expiresAtYear;

  /**
   * Month of 过期时间
   */
  @Description("Month of 过期时间")
  private Sort expiresAtMonth;

  /**
   * Day of 过期时间
   */
  @Description("Day of 过期时间")
  private Sort expiresAtDay;

  /**
   * Week of 过期时间
   */
  @Description("Week of 过期时间")
  private Sort expiresAtWeek;

  /**
   * Quarter of 过期时间
   */
  @Description("Quarter of 过期时间")
  private Sort expiresAtQuarter;

  /**
   * Year of 最后使用时间
   */
  @Description("Year of 最后使用时间")
  private Sort lastUsedAtYear;

  /**
   * Month of 最后使用时间
   */
  @Description("Month of 最后使用时间")
  private Sort lastUsedAtMonth;

  /**
   * Day of 最后使用时间
   */
  @Description("Day of 最后使用时间")
  private Sort lastUsedAtDay;

  /**
   * Week of 最后使用时间
   */
  @Description("Week of 最后使用时间")
  private Sort lastUsedAtWeek;

  /**
   * Quarter of 最后使用时间
   */
  @Description("Quarter of 最后使用时间")
  private Sort lastUsedAtQuarter;

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
  private Collection<ApiKeyOrderBy> obs;

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

  public Sort getAccessKey() {
    return this.accessKey;
  }

  public void setAccessKey(Sort accessKey) {
    this.accessKey = accessKey;
  }

  public Sort getSecret() {
    return this.secret;
  }

  public void setSecret(Sort secret) {
    this.secret = secret;
  }

  public Sort getDisable() {
    return this.disable;
  }

  public void setDisable(Sort disable) {
    this.disable = disable;
  }

  public Sort getExpiresAt() {
    return this.expiresAt;
  }

  public void setExpiresAt(Sort expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Sort getLastUsedAt() {
    return this.lastUsedAt;
  }

  public void setLastUsedAt(Sort lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public Sort getUserId() {
    return this.userId;
  }

  public void setUserId(Sort userId) {
    this.userId = userId;
  }

  public UserOrderBy getUser() {
    return this.user;
  }

  public void setUser(UserOrderBy user) {
    this.user = user;
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

  public Sort getAccessKeyCount() {
    return this.accessKeyCount;
  }

  public void setAccessKeyCount(Sort accessKeyCount) {
    this.accessKeyCount = accessKeyCount;
  }

  public Sort getSecretCount() {
    return this.secretCount;
  }

  public void setSecretCount(Sort secretCount) {
    this.secretCount = secretCount;
  }

  public Sort getDisableCount() {
    return this.disableCount;
  }

  public void setDisableCount(Sort disableCount) {
    this.disableCount = disableCount;
  }

  public Sort getExpiresAtCount() {
    return this.expiresAtCount;
  }

  public void setExpiresAtCount(Sort expiresAtCount) {
    this.expiresAtCount = expiresAtCount;
  }

  public Sort getLastUsedAtCount() {
    return this.lastUsedAtCount;
  }

  public void setLastUsedAtCount(Sort lastUsedAtCount) {
    this.lastUsedAtCount = lastUsedAtCount;
  }

  public Sort getUserIdCount() {
    return this.userIdCount;
  }

  public void setUserIdCount(Sort userIdCount) {
    this.userIdCount = userIdCount;
  }

  public Sort getExpiresAtMax() {
    return this.expiresAtMax;
  }

  public void setExpiresAtMax(Sort expiresAtMax) {
    this.expiresAtMax = expiresAtMax;
  }

  public Sort getExpiresAtMin() {
    return this.expiresAtMin;
  }

  public void setExpiresAtMin(Sort expiresAtMin) {
    this.expiresAtMin = expiresAtMin;
  }

  public Sort getLastUsedAtMax() {
    return this.lastUsedAtMax;
  }

  public void setLastUsedAtMax(Sort lastUsedAtMax) {
    this.lastUsedAtMax = lastUsedAtMax;
  }

  public Sort getLastUsedAtMin() {
    return this.lastUsedAtMin;
  }

  public void setLastUsedAtMin(Sort lastUsedAtMin) {
    this.lastUsedAtMin = lastUsedAtMin;
  }

  public Sort getExpiresAtYear() {
    return this.expiresAtYear;
  }

  public void setExpiresAtYear(Sort expiresAtYear) {
    this.expiresAtYear = expiresAtYear;
  }

  public Sort getExpiresAtMonth() {
    return this.expiresAtMonth;
  }

  public void setExpiresAtMonth(Sort expiresAtMonth) {
    this.expiresAtMonth = expiresAtMonth;
  }

  public Sort getExpiresAtDay() {
    return this.expiresAtDay;
  }

  public void setExpiresAtDay(Sort expiresAtDay) {
    this.expiresAtDay = expiresAtDay;
  }

  public Sort getExpiresAtWeek() {
    return this.expiresAtWeek;
  }

  public void setExpiresAtWeek(Sort expiresAtWeek) {
    this.expiresAtWeek = expiresAtWeek;
  }

  public Sort getExpiresAtQuarter() {
    return this.expiresAtQuarter;
  }

  public void setExpiresAtQuarter(Sort expiresAtQuarter) {
    this.expiresAtQuarter = expiresAtQuarter;
  }

  public Sort getLastUsedAtYear() {
    return this.lastUsedAtYear;
  }

  public void setLastUsedAtYear(Sort lastUsedAtYear) {
    this.lastUsedAtYear = lastUsedAtYear;
  }

  public Sort getLastUsedAtMonth() {
    return this.lastUsedAtMonth;
  }

  public void setLastUsedAtMonth(Sort lastUsedAtMonth) {
    this.lastUsedAtMonth = lastUsedAtMonth;
  }

  public Sort getLastUsedAtDay() {
    return this.lastUsedAtDay;
  }

  public void setLastUsedAtDay(Sort lastUsedAtDay) {
    this.lastUsedAtDay = lastUsedAtDay;
  }

  public Sort getLastUsedAtWeek() {
    return this.lastUsedAtWeek;
  }

  public void setLastUsedAtWeek(Sort lastUsedAtWeek) {
    this.lastUsedAtWeek = lastUsedAtWeek;
  }

  public Sort getLastUsedAtQuarter() {
    return this.lastUsedAtQuarter;
  }

  public void setLastUsedAtQuarter(Sort lastUsedAtQuarter) {
    this.lastUsedAtQuarter = lastUsedAtQuarter;
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

  public Collection<ApiKeyOrderBy> getObs() {
    return this.obs;
  }

  public void setObs(Collection<ApiKeyOrderBy> obs) {
    this.obs = obs;
  }
}
