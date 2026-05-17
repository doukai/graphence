package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.ApiKeyInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.structure.dto.interfaceType.NamedStruct;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

/**
 * API Key
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("API Key")
public class ApiKey implements NamedStruct, Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 名称
   */
  @NonNull
  @Description("名称")
  private String name;

  /**
   * 描述
   */
  @Description("描述")
  private String description;

  /**
   * Access Key
   */
  @NonNull
  @Description("Access Key")
  private String accessKey;

  /**
   * Secret
   */
  @NonNull
  @Description("Secret")
  private String secret;

  /**
   * 禁用
   */
  @Description("禁用")
  private Boolean disable;

  /**
   * 过期时间
   */
  @Description("过期时间")
  private LocalDateTime expiresAt;

  /**
   * 最后使用时间
   */
  @Description("最后使用时间")
  private LocalDateTime lastUsedAt;

  /**
   * 用户ID
   */
  @NonNull
  @Description("用户ID")
  private String userId;

  /**
   * 用户
   */
  @Description("用户")
  private User user;

  /**
   * 租户
   */
  @Description("租户")
  private Realm realm;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  private Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  private Integer version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Integer realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private String createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private LocalDateTime createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private String updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private LocalDateTime updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private String createGroupId;

  /**
   * Type Name
   */
  @Description("Type Name")
  private String __typename = "ApiKey";

  /**
   * Count of API Key
   */
  @Description("Count of API Key")
  private Integer idCount;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  private Integer nameCount;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Integer descriptionCount;

  /**
   * Count of Access Key
   */
  @Description("Count of Access Key")
  private Integer accessKeyCount;

  /**
   * Count of Secret
   */
  @Description("Count of Secret")
  private Integer secretCount;

  /**
   * Count of 禁用
   */
  @Description("Count of 禁用")
  private Integer disableCount;

  /**
   * Count of 过期时间
   */
  @Description("Count of 过期时间")
  private Integer expiresAtCount;

  /**
   * Count of 最后使用时间
   */
  @Description("Count of 最后使用时间")
  private Integer lastUsedAtCount;

  /**
   * Count of 用户ID
   */
  @Description("Count of 用户ID")
  private Integer userIdCount;

  /**
   * Max of 过期时间
   */
  @Description("Max of 过期时间")
  private LocalDateTime expiresAtMax;

  /**
   * Min of 过期时间
   */
  @Description("Min of 过期时间")
  private LocalDateTime expiresAtMin;

  /**
   * Max of 最后使用时间
   */
  @Description("Max of 最后使用时间")
  private LocalDateTime lastUsedAtMax;

  /**
   * Min of 最后使用时间
   */
  @Description("Min of 最后使用时间")
  private LocalDateTime lastUsedAtMin;

  /**
   * Year of 过期时间
   */
  @Description("Year of 过期时间")
  private Integer expiresAtYear;

  /**
   * Month of 过期时间
   */
  @Description("Month of 过期时间")
  private Integer expiresAtMonth;

  /**
   * Day of 过期时间
   */
  @Description("Day of 过期时间")
  private Integer expiresAtDay;

  /**
   * Week of 过期时间
   */
  @Description("Week of 过期时间")
  private Integer expiresAtWeek;

  /**
   * Quarter of 过期时间
   */
  @Description("Quarter of 过期时间")
  private Integer expiresAtQuarter;

  /**
   * Year of 最后使用时间
   */
  @Description("Year of 最后使用时间")
  private Integer lastUsedAtYear;

  /**
   * Month of 最后使用时间
   */
  @Description("Month of 最后使用时间")
  private Integer lastUsedAtMonth;

  /**
   * Day of 最后使用时间
   */
  @Description("Day of 最后使用时间")
  private Integer lastUsedAtDay;

  /**
   * Week of 最后使用时间
   */
  @Description("Week of 最后使用时间")
  private Integer lastUsedAtWeek;

  /**
   * Quarter of 最后使用时间
   */
  @Description("Quarter of 最后使用时间")
  private Integer lastUsedAtQuarter;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  private Integer createTimeYear;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  private Integer createTimeMonth;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  private Integer createTimeDay;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  private Integer createTimeWeek;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  private Integer createTimeQuarter;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  private Integer updateTimeYear;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  private Integer updateTimeMonth;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  private Integer updateTimeDay;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  private Integer updateTimeWeek;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  private Integer updateTimeQuarter;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = (String)name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(String description) {
    this.description = (String)description;
  }

  public String getAccessKey() {
    return this.accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public String getSecret() {
    return this.secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Boolean getDisable() {
    return this.disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public LocalDateTime getExpiresAt() {
    return this.expiresAt;
  }

  public void setExpiresAt(LocalDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public LocalDateTime getLastUsedAt() {
    return this.lastUsedAt;
  }

  public void setLastUsedAt(LocalDateTime lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Realm getRealm() {
    return this.realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Integer getAccessKeyCount() {
    return this.accessKeyCount;
  }

  public void setAccessKeyCount(Integer accessKeyCount) {
    this.accessKeyCount = accessKeyCount;
  }

  public Integer getSecretCount() {
    return this.secretCount;
  }

  public void setSecretCount(Integer secretCount) {
    this.secretCount = secretCount;
  }

  public Integer getDisableCount() {
    return this.disableCount;
  }

  public void setDisableCount(Integer disableCount) {
    this.disableCount = disableCount;
  }

  public Integer getExpiresAtCount() {
    return this.expiresAtCount;
  }

  public void setExpiresAtCount(Integer expiresAtCount) {
    this.expiresAtCount = expiresAtCount;
  }

  public Integer getLastUsedAtCount() {
    return this.lastUsedAtCount;
  }

  public void setLastUsedAtCount(Integer lastUsedAtCount) {
    this.lastUsedAtCount = lastUsedAtCount;
  }

  public Integer getUserIdCount() {
    return this.userIdCount;
  }

  public void setUserIdCount(Integer userIdCount) {
    this.userIdCount = userIdCount;
  }

  public LocalDateTime getExpiresAtMax() {
    return this.expiresAtMax;
  }

  public void setExpiresAtMax(LocalDateTime expiresAtMax) {
    this.expiresAtMax = expiresAtMax;
  }

  public LocalDateTime getExpiresAtMin() {
    return this.expiresAtMin;
  }

  public void setExpiresAtMin(LocalDateTime expiresAtMin) {
    this.expiresAtMin = expiresAtMin;
  }

  public LocalDateTime getLastUsedAtMax() {
    return this.lastUsedAtMax;
  }

  public void setLastUsedAtMax(LocalDateTime lastUsedAtMax) {
    this.lastUsedAtMax = lastUsedAtMax;
  }

  public LocalDateTime getLastUsedAtMin() {
    return this.lastUsedAtMin;
  }

  public void setLastUsedAtMin(LocalDateTime lastUsedAtMin) {
    this.lastUsedAtMin = lastUsedAtMin;
  }

  public Integer getExpiresAtYear() {
    return this.expiresAtYear;
  }

  public void setExpiresAtYear(Integer expiresAtYear) {
    this.expiresAtYear = expiresAtYear;
  }

  public Integer getExpiresAtMonth() {
    return this.expiresAtMonth;
  }

  public void setExpiresAtMonth(Integer expiresAtMonth) {
    this.expiresAtMonth = expiresAtMonth;
  }

  public Integer getExpiresAtDay() {
    return this.expiresAtDay;
  }

  public void setExpiresAtDay(Integer expiresAtDay) {
    this.expiresAtDay = expiresAtDay;
  }

  public Integer getExpiresAtWeek() {
    return this.expiresAtWeek;
  }

  public void setExpiresAtWeek(Integer expiresAtWeek) {
    this.expiresAtWeek = expiresAtWeek;
  }

  public Integer getExpiresAtQuarter() {
    return this.expiresAtQuarter;
  }

  public void setExpiresAtQuarter(Integer expiresAtQuarter) {
    this.expiresAtQuarter = expiresAtQuarter;
  }

  public Integer getLastUsedAtYear() {
    return this.lastUsedAtYear;
  }

  public void setLastUsedAtYear(Integer lastUsedAtYear) {
    this.lastUsedAtYear = lastUsedAtYear;
  }

  public Integer getLastUsedAtMonth() {
    return this.lastUsedAtMonth;
  }

  public void setLastUsedAtMonth(Integer lastUsedAtMonth) {
    this.lastUsedAtMonth = lastUsedAtMonth;
  }

  public Integer getLastUsedAtDay() {
    return this.lastUsedAtDay;
  }

  public void setLastUsedAtDay(Integer lastUsedAtDay) {
    this.lastUsedAtDay = lastUsedAtDay;
  }

  public Integer getLastUsedAtWeek() {
    return this.lastUsedAtWeek;
  }

  public void setLastUsedAtWeek(Integer lastUsedAtWeek) {
    this.lastUsedAtWeek = lastUsedAtWeek;
  }

  public Integer getLastUsedAtQuarter() {
    return this.lastUsedAtQuarter;
  }

  public void setLastUsedAtQuarter(Integer lastUsedAtQuarter) {
    this.lastUsedAtQuarter = lastUsedAtQuarter;
  }

  public Integer getCreateTimeYear() {
    return this.createTimeYear;
  }

  public void setCreateTimeYear(Integer createTimeYear) {
    this.createTimeYear = createTimeYear;
  }

  public Integer getCreateTimeMonth() {
    return this.createTimeMonth;
  }

  public void setCreateTimeMonth(Integer createTimeMonth) {
    this.createTimeMonth = createTimeMonth;
  }

  public Integer getCreateTimeDay() {
    return this.createTimeDay;
  }

  public void setCreateTimeDay(Integer createTimeDay) {
    this.createTimeDay = createTimeDay;
  }

  public Integer getCreateTimeWeek() {
    return this.createTimeWeek;
  }

  public void setCreateTimeWeek(Integer createTimeWeek) {
    this.createTimeWeek = createTimeWeek;
  }

  public Integer getCreateTimeQuarter() {
    return this.createTimeQuarter;
  }

  public void setCreateTimeQuarter(Integer createTimeQuarter) {
    this.createTimeQuarter = createTimeQuarter;
  }

  public Integer getUpdateTimeYear() {
    return this.updateTimeYear;
  }

  public void setUpdateTimeYear(Integer updateTimeYear) {
    this.updateTimeYear = updateTimeYear;
  }

  public Integer getUpdateTimeMonth() {
    return this.updateTimeMonth;
  }

  public void setUpdateTimeMonth(Integer updateTimeMonth) {
    this.updateTimeMonth = updateTimeMonth;
  }

  public Integer getUpdateTimeDay() {
    return this.updateTimeDay;
  }

  public void setUpdateTimeDay(Integer updateTimeDay) {
    this.updateTimeDay = updateTimeDay;
  }

  public Integer getUpdateTimeWeek() {
    return this.updateTimeWeek;
  }

  public void setUpdateTimeWeek(Integer updateTimeWeek) {
    this.updateTimeWeek = updateTimeWeek;
  }

  public Integer getUpdateTimeQuarter() {
    return this.updateTimeQuarter;
  }

  public void setUpdateTimeQuarter(Integer updateTimeQuarter) {
    this.updateTimeQuarter = updateTimeQuarter;
  }

  public ApiKeyInput toInput() {
    ApiKeyInput input = new ApiKeyInput();
    input.setId(this.getId());
    input.setName(this.getName());
    input.setDescription(this.getDescription());
    input.setAccessKey(this.getAccessKey());
    input.setSecret(this.getSecret());
    input.setDisable(this.getDisable());
    input.setExpiresAt(this.getExpiresAt());
    input.setLastUsedAt(this.getLastUsedAt());
    input.setUserId(this.getUserId());
    if(getUser() != null) {
      input.setUser(this.getUser().toInput());
    }
    if(getRealm() != null) {
      input.setRealm(this.getRealm().toInput());
    }
    input.setIsDeprecated(this.getIsDeprecated());
    input.setVersion(this.getVersion());
    input.setRealmId(this.getRealmId());
    input.setCreateUserId(this.getCreateUserId());
    input.setCreateTime(this.getCreateTime());
    input.setUpdateUserId(this.getUpdateUserId());
    input.setUpdateTime(this.getUpdateTime());
    input.setCreateGroupId(this.getCreateGroupId());
    input.set__typename(this.get__typename());
    return input;
  }
}
