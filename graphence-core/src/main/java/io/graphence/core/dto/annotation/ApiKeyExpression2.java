package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.BooleanExpression;
import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Query Expression Input for API Key
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Query Expression Input for API Key")
public @interface ApiKeyExpression2 {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id() default @StringExpression;

  /**
   * 名称
   */
  @Description("名称")
  StringExpression name() default @StringExpression;

  /**
   * 描述
   */
  @Description("描述")
  StringExpression description() default @StringExpression;

  /**
   * Access Key
   */
  @Description("Access Key")
  StringExpression accessKey() default @StringExpression;

  /**
   * Secret
   */
  @Description("Secret")
  StringExpression secret() default @StringExpression;

  /**
   * 禁用
   */
  @Description("禁用")
  BooleanExpression disable() default @BooleanExpression;

  /**
   * 过期时间
   */
  @Description("过期时间")
  StringExpression expiresAt() default @StringExpression;

  /**
   * 最后使用时间
   */
  @Description("最后使用时间")
  StringExpression lastUsedAt() default @StringExpression;

  /**
   * 用户ID
   */
  @Description("用户ID")
  StringExpression userId() default @StringExpression;

  /**
   * Include Deprecated
   */
  @Description("Include Deprecated")
  boolean includeDeprecated() default false;

  /**
   * Version
   */
  @Description("Version")
  IntExpression version() default @IntExpression;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  IntExpression realmId() default @IntExpression;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  StringExpression createUserId() default @StringExpression;

  /**
   * Create Time
   */
  @Description("Create Time")
  StringExpression createTime() default @StringExpression;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  StringExpression updateUserId() default @StringExpression;

  /**
   * Update Time
   */
  @Description("Update Time")
  StringExpression updateTime() default @StringExpression;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  StringExpression createGroupId() default @StringExpression;

  /**
   * Type Name
   */
  @Description("Type Name")
  StringExpression __typename() default @StringExpression;

  /**
   * Year of 过期时间
   */
  @Description("Year of 过期时间")
  IntExpression expiresAtYear() default @IntExpression;

  /**
   * Month of 过期时间
   */
  @Description("Month of 过期时间")
  IntExpression expiresAtMonth() default @IntExpression;

  /**
   * Day of 过期时间
   */
  @Description("Day of 过期时间")
  IntExpression expiresAtDay() default @IntExpression;

  /**
   * Week of 过期时间
   */
  @Description("Week of 过期时间")
  IntExpression expiresAtWeek() default @IntExpression;

  /**
   * Quarter of 过期时间
   */
  @Description("Quarter of 过期时间")
  IntExpression expiresAtQuarter() default @IntExpression;

  /**
   * Year of 最后使用时间
   */
  @Description("Year of 最后使用时间")
  IntExpression lastUsedAtYear() default @IntExpression;

  /**
   * Month of 最后使用时间
   */
  @Description("Month of 最后使用时间")
  IntExpression lastUsedAtMonth() default @IntExpression;

  /**
   * Day of 最后使用时间
   */
  @Description("Day of 最后使用时间")
  IntExpression lastUsedAtDay() default @IntExpression;

  /**
   * Week of 最后使用时间
   */
  @Description("Week of 最后使用时间")
  IntExpression lastUsedAtWeek() default @IntExpression;

  /**
   * Quarter of 最后使用时间
   */
  @Description("Quarter of 最后使用时间")
  IntExpression lastUsedAtQuarter() default @IntExpression;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  IntExpression createTimeYear() default @IntExpression;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  IntExpression createTimeMonth() default @IntExpression;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  IntExpression createTimeDay() default @IntExpression;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  IntExpression createTimeWeek() default @IntExpression;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  IntExpression createTimeQuarter() default @IntExpression;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  IntExpression updateTimeYear() default @IntExpression;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  IntExpression updateTimeMonth() default @IntExpression;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  IntExpression updateTimeDay() default @IntExpression;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  IntExpression updateTimeWeek() default @IntExpression;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  IntExpression updateTimeQuarter() default @IntExpression;

  /**
   * Not
   */
  @Description("Not")
  boolean not() default false;

  /**
   * Condition
   */
  @Description("Condition")
  Conditional cond() default Conditional.AND;

  /**
   * First
   */
  @Description("First")
  int first() default 0;

  /**
   * Last
   */
  @Description("Last")
  int last() default 0;

  /**
   * Offset
   */
  @Description("Offset")
  int offset() default 0;

  /**
   * After
   */
  @Description("After")
  String after() default "";

  /**
   * Before
   */
  @Description("Before")
  String before() default "";

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $accessKey() default "";

  String $secret() default "";

  String $disable() default "";

  String $expiresAt() default "";

  String $lastUsedAt() default "";

  String $userId() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $expiresAtYear() default "";

  String $expiresAtMonth() default "";

  String $expiresAtDay() default "";

  String $expiresAtWeek() default "";

  String $expiresAtQuarter() default "";

  String $lastUsedAtYear() default "";

  String $lastUsedAtMonth() default "";

  String $lastUsedAtDay() default "";

  String $lastUsedAtWeek() default "";

  String $lastUsedAtQuarter() default "";

  String $createTimeYear() default "";

  String $createTimeMonth() default "";

  String $createTimeDay() default "";

  String $createTimeWeek() default "";

  String $createTimeQuarter() default "";

  String $updateTimeYear() default "";

  String $updateTimeMonth() default "";

  String $updateTimeDay() default "";

  String $updateTimeWeek() default "";

  String $updateTimeQuarter() default "";

  String $not() default "";

  String $cond() default "";

  String $first() default "";

  String $last() default "";

  String $offset() default "";

  String $after() default "";

  String $before() default "";
}
