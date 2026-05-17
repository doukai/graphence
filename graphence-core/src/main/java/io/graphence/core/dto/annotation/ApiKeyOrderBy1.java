package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Order Input for API Key
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for API Key")
public @interface ApiKeyOrderBy1 {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 名称
   */
  @Description("名称")
  Sort name() default Sort.ASC;

  /**
   * 描述
   */
  @Description("描述")
  Sort description() default Sort.ASC;

  /**
   * Access Key
   */
  @Description("Access Key")
  Sort accessKey() default Sort.ASC;

  /**
   * Secret
   */
  @Description("Secret")
  Sort secret() default Sort.ASC;

  /**
   * 禁用
   */
  @Description("禁用")
  Sort disable() default Sort.ASC;

  /**
   * 过期时间
   */
  @Description("过期时间")
  Sort expiresAt() default Sort.ASC;

  /**
   * 最后使用时间
   */
  @Description("最后使用时间")
  Sort lastUsedAt() default Sort.ASC;

  /**
   * 用户ID
   */
  @Description("用户ID")
  Sort userId() default Sort.ASC;

  /**
   * 用户
   */
  @Description("用户")
  UserOrderBy2 user() default @UserOrderBy2;

  /**
   * 租户
   */
  @Description("租户")
  RealmOrderBy2 realm() default @RealmOrderBy2;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Sort isDeprecated() default Sort.ASC;

  /**
   * Version
   */
  @Description("Version")
  Sort version() default Sort.ASC;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Sort realmId() default Sort.ASC;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  Sort createUserId() default Sort.ASC;

  /**
   * Create Time
   */
  @Description("Create Time")
  Sort createTime() default Sort.ASC;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  Sort updateUserId() default Sort.ASC;

  /**
   * Update Time
   */
  @Description("Update Time")
  Sort updateTime() default Sort.ASC;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  Sort createGroupId() default Sort.ASC;

  /**
   * Type Name
   */
  @Description("Type Name")
  Sort __typename() default Sort.ASC;

  /**
   * Count of API Key
   */
  @Description("Count of API Key")
  Sort idCount() default Sort.ASC;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  Sort nameCount() default Sort.ASC;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  Sort descriptionCount() default Sort.ASC;

  /**
   * Count of Access Key
   */
  @Description("Count of Access Key")
  Sort accessKeyCount() default Sort.ASC;

  /**
   * Count of Secret
   */
  @Description("Count of Secret")
  Sort secretCount() default Sort.ASC;

  /**
   * Count of 禁用
   */
  @Description("Count of 禁用")
  Sort disableCount() default Sort.ASC;

  /**
   * Count of 过期时间
   */
  @Description("Count of 过期时间")
  Sort expiresAtCount() default Sort.ASC;

  /**
   * Count of 最后使用时间
   */
  @Description("Count of 最后使用时间")
  Sort lastUsedAtCount() default Sort.ASC;

  /**
   * Count of 用户ID
   */
  @Description("Count of 用户ID")
  Sort userIdCount() default Sort.ASC;

  /**
   * Max of 过期时间
   */
  @Description("Max of 过期时间")
  Sort expiresAtMax() default Sort.ASC;

  /**
   * Min of 过期时间
   */
  @Description("Min of 过期时间")
  Sort expiresAtMin() default Sort.ASC;

  /**
   * Max of 最后使用时间
   */
  @Description("Max of 最后使用时间")
  Sort lastUsedAtMax() default Sort.ASC;

  /**
   * Min of 最后使用时间
   */
  @Description("Min of 最后使用时间")
  Sort lastUsedAtMin() default Sort.ASC;

  /**
   * Year of 过期时间
   */
  @Description("Year of 过期时间")
  Sort expiresAtYear() default Sort.ASC;

  /**
   * Month of 过期时间
   */
  @Description("Month of 过期时间")
  Sort expiresAtMonth() default Sort.ASC;

  /**
   * Day of 过期时间
   */
  @Description("Day of 过期时间")
  Sort expiresAtDay() default Sort.ASC;

  /**
   * Week of 过期时间
   */
  @Description("Week of 过期时间")
  Sort expiresAtWeek() default Sort.ASC;

  /**
   * Quarter of 过期时间
   */
  @Description("Quarter of 过期时间")
  Sort expiresAtQuarter() default Sort.ASC;

  /**
   * Year of 最后使用时间
   */
  @Description("Year of 最后使用时间")
  Sort lastUsedAtYear() default Sort.ASC;

  /**
   * Month of 最后使用时间
   */
  @Description("Month of 最后使用时间")
  Sort lastUsedAtMonth() default Sort.ASC;

  /**
   * Day of 最后使用时间
   */
  @Description("Day of 最后使用时间")
  Sort lastUsedAtDay() default Sort.ASC;

  /**
   * Week of 最后使用时间
   */
  @Description("Week of 最后使用时间")
  Sort lastUsedAtWeek() default Sort.ASC;

  /**
   * Quarter of 最后使用时间
   */
  @Description("Quarter of 最后使用时间")
  Sort lastUsedAtQuarter() default Sort.ASC;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  Sort createTimeYear() default Sort.ASC;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  Sort createTimeMonth() default Sort.ASC;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  Sort createTimeDay() default Sort.ASC;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  Sort createTimeWeek() default Sort.ASC;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  Sort createTimeQuarter() default Sort.ASC;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  Sort updateTimeYear() default Sort.ASC;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  Sort updateTimeMonth() default Sort.ASC;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  Sort updateTimeDay() default Sort.ASC;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  Sort updateTimeWeek() default Sort.ASC;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  Sort updateTimeQuarter() default Sort.ASC;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  ApiKeyOrderBy2[] obs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $accessKey() default "";

  String $secret() default "";

  String $disable() default "";

  String $expiresAt() default "";

  String $lastUsedAt() default "";

  String $userId() default "";

  String $user() default "";

  String $realm() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $idCount() default "";

  String $nameCount() default "";

  String $descriptionCount() default "";

  String $accessKeyCount() default "";

  String $secretCount() default "";

  String $disableCount() default "";

  String $expiresAtCount() default "";

  String $lastUsedAtCount() default "";

  String $userIdCount() default "";

  String $expiresAtMax() default "";

  String $expiresAtMin() default "";

  String $lastUsedAtMax() default "";

  String $lastUsedAtMin() default "";

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

  String $obs() default "";
}
