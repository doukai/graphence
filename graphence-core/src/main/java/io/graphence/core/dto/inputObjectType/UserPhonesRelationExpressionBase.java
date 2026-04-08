package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Query Expression Input for Relationship Object between 用户 and 手机号
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Query Expression Input for Relationship Object between 用户 and 手机号")
public interface UserPhonesRelationExpressionBase extends MetaExpression {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id = null;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  StringExpression userRef = null;

  /**
   * 用户
   */
  @Description("用户")
  UserExpression user = null;

  /**
   * 手机号 Reference
   */
  @Description("手机号 Reference")
  StringExpression phonesRef = null;

  /**
   * Include Deprecated
   */
  @Description("Include Deprecated")
  Boolean includeDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  IntExpression version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  IntExpression realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  StringExpression createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  StringExpression createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  StringExpression updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  StringExpression updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  StringExpression createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  StringExpression __typename = null;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  IntExpression createTimeYear = null;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  IntExpression createTimeMonth = null;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  IntExpression createTimeDay = null;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  IntExpression createTimeWeek = null;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  IntExpression createTimeQuarter = null;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  IntExpression updateTimeYear = null;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  IntExpression updateTimeMonth = null;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  IntExpression updateTimeDay = null;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  IntExpression updateTimeWeek = null;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  IntExpression updateTimeQuarter = null;

  /**
   * Not
   */
  @Description("Not")
  Boolean not = false;

  /**
   * Condition
   */
  @Description("Condition")
  Conditional cond = Conditional.AND;

  /**
   * Expressions
   */
  @Description("Expressions")
  Collection<UserPhonesRelationExpression> exs = null;

  default StringExpression getId() {
    return id;
  }

  void setId(StringExpression id);

  default StringExpression getUserRef() {
    return userRef;
  }

  void setUserRef(StringExpression userRef);

  default UserExpression getUser() {
    return user;
  }

  void setUser(UserExpression user);

  default StringExpression getPhonesRef() {
    return phonesRef;
  }

  void setPhonesRef(StringExpression phonesRef);

  default Boolean getIncludeDeprecated() {
    return includeDeprecated;
  }

  void setIncludeDeprecated(Boolean includeDeprecated);

  default IntExpression getVersion() {
    return version;
  }

  void setVersion(IntExpression version);

  default IntExpression getRealmId() {
    return realmId;
  }

  void setRealmId(IntExpression realmId);

  default StringExpression getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(StringExpression createUserId);

  default StringExpression getCreateTime() {
    return createTime;
  }

  void setCreateTime(StringExpression createTime);

  default StringExpression getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(StringExpression updateUserId);

  default StringExpression getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(StringExpression updateTime);

  default StringExpression getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(StringExpression createGroupId);

  default StringExpression get__typename() {
    return __typename;
  }

  void set__typename(StringExpression __typename);

  default IntExpression getCreateTimeYear() {
    return createTimeYear;
  }

  void setCreateTimeYear(IntExpression createTimeYear);

  default IntExpression getCreateTimeMonth() {
    return createTimeMonth;
  }

  void setCreateTimeMonth(IntExpression createTimeMonth);

  default IntExpression getCreateTimeDay() {
    return createTimeDay;
  }

  void setCreateTimeDay(IntExpression createTimeDay);

  default IntExpression getCreateTimeWeek() {
    return createTimeWeek;
  }

  void setCreateTimeWeek(IntExpression createTimeWeek);

  default IntExpression getCreateTimeQuarter() {
    return createTimeQuarter;
  }

  void setCreateTimeQuarter(IntExpression createTimeQuarter);

  default IntExpression getUpdateTimeYear() {
    return updateTimeYear;
  }

  void setUpdateTimeYear(IntExpression updateTimeYear);

  default IntExpression getUpdateTimeMonth() {
    return updateTimeMonth;
  }

  void setUpdateTimeMonth(IntExpression updateTimeMonth);

  default IntExpression getUpdateTimeDay() {
    return updateTimeDay;
  }

  void setUpdateTimeDay(IntExpression updateTimeDay);

  default IntExpression getUpdateTimeWeek() {
    return updateTimeWeek;
  }

  void setUpdateTimeWeek(IntExpression updateTimeWeek);

  default IntExpression getUpdateTimeQuarter() {
    return updateTimeQuarter;
  }

  void setUpdateTimeQuarter(IntExpression updateTimeQuarter);

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<UserPhonesRelationExpression> getExs() {
    return exs;
  }

  void setExs(Collection<UserPhonesRelationExpression> exs);
}
