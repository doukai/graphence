package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.BooleanExpression;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.structure.dto.inputObjectType.NamedStructExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Query Expression Input for API Key
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Query Expression Input for API Key")
public class ApiKeyExpression implements NamedStructExpression, MetaExpression {
  /**
   * ID
   */
  @Description("ID")
  private StringExpression id;

  /**
   * 名称
   */
  @Description("名称")
  private StringExpression name;

  /**
   * 描述
   */
  @Description("描述")
  private StringExpression description;

  /**
   * Access Key
   */
  @Description("Access Key")
  private StringExpression accessKey;

  /**
   * Secret
   */
  @Description("Secret")
  private StringExpression secret;

  /**
   * 禁用
   */
  @Description("禁用")
  private BooleanExpression disable;

  /**
   * 过期时间
   */
  @Description("过期时间")
  private StringExpression expiresAt;

  /**
   * 最后使用时间
   */
  @Description("最后使用时间")
  private StringExpression lastUsedAt;

  /**
   * 用户ID
   */
  @Description("用户ID")
  private StringExpression userId;

  /**
   * 用户
   */
  @Description("用户")
  private UserExpression user;

  /**
   * 租户
   */
  @Description("租户")
  private RealmExpression realm;

  /**
   * Include Deprecated
   */
  @DefaultValue("false")
  @Description("Include Deprecated")
  private Boolean includeDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  private IntExpression version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private IntExpression realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private StringExpression createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private StringExpression createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private StringExpression updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private StringExpression updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private StringExpression createGroupId;

  /**
   * Type Name
   */
  @Description("Type Name")
  private StringExpression __typename;

  /**
   * Year of 过期时间
   */
  @Description("Year of 过期时间")
  private IntExpression expiresAtYear;

  /**
   * Month of 过期时间
   */
  @Description("Month of 过期时间")
  private IntExpression expiresAtMonth;

  /**
   * Day of 过期时间
   */
  @Description("Day of 过期时间")
  private IntExpression expiresAtDay;

  /**
   * Week of 过期时间
   */
  @Description("Week of 过期时间")
  private IntExpression expiresAtWeek;

  /**
   * Quarter of 过期时间
   */
  @Description("Quarter of 过期时间")
  private IntExpression expiresAtQuarter;

  /**
   * Year of 最后使用时间
   */
  @Description("Year of 最后使用时间")
  private IntExpression lastUsedAtYear;

  /**
   * Month of 最后使用时间
   */
  @Description("Month of 最后使用时间")
  private IntExpression lastUsedAtMonth;

  /**
   * Day of 最后使用时间
   */
  @Description("Day of 最后使用时间")
  private IntExpression lastUsedAtDay;

  /**
   * Week of 最后使用时间
   */
  @Description("Week of 最后使用时间")
  private IntExpression lastUsedAtWeek;

  /**
   * Quarter of 最后使用时间
   */
  @Description("Quarter of 最后使用时间")
  private IntExpression lastUsedAtQuarter;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  private IntExpression createTimeYear;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  private IntExpression createTimeMonth;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  private IntExpression createTimeDay;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  private IntExpression createTimeWeek;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  private IntExpression createTimeQuarter;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  private IntExpression updateTimeYear;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  private IntExpression updateTimeMonth;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  private IntExpression updateTimeDay;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  private IntExpression updateTimeWeek;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  private IntExpression updateTimeQuarter;

  /**
   * Not
   */
  @DefaultValue("false")
  @Description("Not")
  private Boolean not = false;

  /**
   * Condition
   */
  @DefaultValue("AND")
  @Description("Condition")
  private Conditional cond = Conditional.AND;

  /**
   * Expressions
   */
  @Description("Expressions")
  private Collection<ApiKeyExpression> exs;

  /**
   * Order By
   */
  @Description("Order By")
  private ApiKeyOrderBy orderBy;

  /**
   * Group By
   */
  @Description("Group By")
  private ApiKeyGroupBy groupBy;

  /**
   * First
   */
  @Description("First")
  private Integer first;

  /**
   * Last
   */
  @Description("Last")
  private Integer last;

  /**
   * Offset
   */
  @Description("Offset")
  private Integer offset;

  /**
   * After
   */
  @Description("After")
  private String after;

  /**
   * Before
   */
  @Description("Before")
  private String before;

  @Override
  public StringExpression getId() {
    return this.id;
  }

  @Override
  public void setId(StringExpression id) {
    this.id = (StringExpression)id;
  }

  @Override
  public StringExpression getName() {
    return this.name;
  }

  @Override
  public void setName(StringExpression name) {
    this.name = (StringExpression)name;
  }

  @Override
  public StringExpression getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(StringExpression description) {
    this.description = (StringExpression)description;
  }

  public StringExpression getAccessKey() {
    return this.accessKey;
  }

  public void setAccessKey(StringExpression accessKey) {
    this.accessKey = accessKey;
  }

  public StringExpression getSecret() {
    return this.secret;
  }

  public void setSecret(StringExpression secret) {
    this.secret = secret;
  }

  public BooleanExpression getDisable() {
    return this.disable;
  }

  public void setDisable(BooleanExpression disable) {
    this.disable = disable;
  }

  public StringExpression getExpiresAt() {
    return this.expiresAt;
  }

  public void setExpiresAt(StringExpression expiresAt) {
    this.expiresAt = expiresAt;
  }

  public StringExpression getLastUsedAt() {
    return this.lastUsedAt;
  }

  public void setLastUsedAt(StringExpression lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public StringExpression getUserId() {
    return this.userId;
  }

  public void setUserId(StringExpression userId) {
    this.userId = userId;
  }

  public UserExpression getUser() {
    return this.user;
  }

  public void setUser(UserExpression user) {
    this.user = user;
  }

  public RealmExpression getRealm() {
    return this.realm;
  }

  public void setRealm(RealmExpression realm) {
    this.realm = realm;
  }

  @Override
  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  @Override
  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = (Boolean)includeDeprecated;
  }

  @Override
  public IntExpression getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(IntExpression version) {
    this.version = (IntExpression)version;
  }

  @Override
  public IntExpression getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(IntExpression realmId) {
    this.realmId = (IntExpression)realmId;
  }

  @Override
  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = (StringExpression)createUserId;
  }

  @Override
  public StringExpression getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(StringExpression createTime) {
    this.createTime = (StringExpression)createTime;
  }

  @Override
  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = (StringExpression)updateUserId;
  }

  @Override
  public StringExpression getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(StringExpression updateTime) {
    this.updateTime = (StringExpression)updateTime;
  }

  @Override
  public StringExpression getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(StringExpression createGroupId) {
    this.createGroupId = (StringExpression)createGroupId;
  }

  public StringExpression get__typename() {
    return this.__typename;
  }

  public void set__typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public IntExpression getExpiresAtYear() {
    return this.expiresAtYear;
  }

  public void setExpiresAtYear(IntExpression expiresAtYear) {
    this.expiresAtYear = expiresAtYear;
  }

  public IntExpression getExpiresAtMonth() {
    return this.expiresAtMonth;
  }

  public void setExpiresAtMonth(IntExpression expiresAtMonth) {
    this.expiresAtMonth = expiresAtMonth;
  }

  public IntExpression getExpiresAtDay() {
    return this.expiresAtDay;
  }

  public void setExpiresAtDay(IntExpression expiresAtDay) {
    this.expiresAtDay = expiresAtDay;
  }

  public IntExpression getExpiresAtWeek() {
    return this.expiresAtWeek;
  }

  public void setExpiresAtWeek(IntExpression expiresAtWeek) {
    this.expiresAtWeek = expiresAtWeek;
  }

  public IntExpression getExpiresAtQuarter() {
    return this.expiresAtQuarter;
  }

  public void setExpiresAtQuarter(IntExpression expiresAtQuarter) {
    this.expiresAtQuarter = expiresAtQuarter;
  }

  public IntExpression getLastUsedAtYear() {
    return this.lastUsedAtYear;
  }

  public void setLastUsedAtYear(IntExpression lastUsedAtYear) {
    this.lastUsedAtYear = lastUsedAtYear;
  }

  public IntExpression getLastUsedAtMonth() {
    return this.lastUsedAtMonth;
  }

  public void setLastUsedAtMonth(IntExpression lastUsedAtMonth) {
    this.lastUsedAtMonth = lastUsedAtMonth;
  }

  public IntExpression getLastUsedAtDay() {
    return this.lastUsedAtDay;
  }

  public void setLastUsedAtDay(IntExpression lastUsedAtDay) {
    this.lastUsedAtDay = lastUsedAtDay;
  }

  public IntExpression getLastUsedAtWeek() {
    return this.lastUsedAtWeek;
  }

  public void setLastUsedAtWeek(IntExpression lastUsedAtWeek) {
    this.lastUsedAtWeek = lastUsedAtWeek;
  }

  public IntExpression getLastUsedAtQuarter() {
    return this.lastUsedAtQuarter;
  }

  public void setLastUsedAtQuarter(IntExpression lastUsedAtQuarter) {
    this.lastUsedAtQuarter = lastUsedAtQuarter;
  }

  public IntExpression getCreateTimeYear() {
    return this.createTimeYear;
  }

  public void setCreateTimeYear(IntExpression createTimeYear) {
    this.createTimeYear = createTimeYear;
  }

  public IntExpression getCreateTimeMonth() {
    return this.createTimeMonth;
  }

  public void setCreateTimeMonth(IntExpression createTimeMonth) {
    this.createTimeMonth = createTimeMonth;
  }

  public IntExpression getCreateTimeDay() {
    return this.createTimeDay;
  }

  public void setCreateTimeDay(IntExpression createTimeDay) {
    this.createTimeDay = createTimeDay;
  }

  public IntExpression getCreateTimeWeek() {
    return this.createTimeWeek;
  }

  public void setCreateTimeWeek(IntExpression createTimeWeek) {
    this.createTimeWeek = createTimeWeek;
  }

  public IntExpression getCreateTimeQuarter() {
    return this.createTimeQuarter;
  }

  public void setCreateTimeQuarter(IntExpression createTimeQuarter) {
    this.createTimeQuarter = createTimeQuarter;
  }

  public IntExpression getUpdateTimeYear() {
    return this.updateTimeYear;
  }

  public void setUpdateTimeYear(IntExpression updateTimeYear) {
    this.updateTimeYear = updateTimeYear;
  }

  public IntExpression getUpdateTimeMonth() {
    return this.updateTimeMonth;
  }

  public void setUpdateTimeMonth(IntExpression updateTimeMonth) {
    this.updateTimeMonth = updateTimeMonth;
  }

  public IntExpression getUpdateTimeDay() {
    return this.updateTimeDay;
  }

  public void setUpdateTimeDay(IntExpression updateTimeDay) {
    this.updateTimeDay = updateTimeDay;
  }

  public IntExpression getUpdateTimeWeek() {
    return this.updateTimeWeek;
  }

  public void setUpdateTimeWeek(IntExpression updateTimeWeek) {
    this.updateTimeWeek = updateTimeWeek;
  }

  public IntExpression getUpdateTimeQuarter() {
    return this.updateTimeQuarter;
  }

  public void setUpdateTimeQuarter(IntExpression updateTimeQuarter) {
    this.updateTimeQuarter = updateTimeQuarter;
  }

  @Override
  public Boolean getNot() {
    return this.not;
  }

  @Override
  public void setNot(Boolean not) {
    this.not = (Boolean)not;
  }

  @Override
  public Conditional getCond() {
    return this.cond;
  }

  @Override
  public void setCond(Conditional cond) {
    this.cond = (Conditional)cond;
  }

  public Collection<ApiKeyExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<ApiKeyExpression> exs) {
    this.exs = exs;
  }

  public ApiKeyOrderBy getOrderBy() {
    return this.orderBy;
  }

  public void setOrderBy(ApiKeyOrderBy orderBy) {
    this.orderBy = orderBy;
  }

  public ApiKeyGroupBy getGroupBy() {
    return this.groupBy;
  }

  public void setGroupBy(ApiKeyGroupBy groupBy) {
    this.groupBy = groupBy;
  }

  public Integer getFirst() {
    return this.first;
  }

  public void setFirst(Integer first) {
    this.first = first;
  }

  public Integer getLast() {
    return this.last;
  }

  public void setLast(Integer last) {
    this.last = last;
  }

  public Integer getOffset() {
    return this.offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public String getAfter() {
    return this.after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public String getBefore() {
    return this.before;
  }

  public void setBefore(String before) {
    this.before = before;
  }
}
