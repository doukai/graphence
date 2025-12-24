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
 * Order Input for 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 用户")
public @interface UserOrderBy {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 姓名
   */
  @Description("姓名")
  Sort name() default Sort.ASC;

  /**
   * 描述
   */
  @Description("描述")
  Sort description() default Sort.ASC;

  /**
   * 姓氏
   */
  @Description("姓氏")
  Sort lastName() default Sort.ASC;

  /**
   * 账号
   */
  @Description("账号")
  Sort login() default Sort.ASC;

  /**
   * 盐
   */
  @Description("盐")
  Sort salt() default Sort.ASC;

  /**
   * 哈希
   */
  @Description("哈希")
  Sort hash() default Sort.ASC;

  /**
   * 邮箱
   */
  @Description("邮箱")
  Sort email() default Sort.ASC;

  /**
   * 手机号
   */
  @Description("手机号")
  Sort phones() default Sort.ASC;

  /**
   * 禁用
   */
  @Description("禁用")
  Sort disable() default Sort.ASC;

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
   * Count of 用户
   */
  @Description("Count of 用户")
  Sort idCount() default Sort.ASC;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 姓名
   */
  @Description("Count of 姓名")
  Sort nameCount() default Sort.ASC;

  /**
   * Max of 姓名
   */
  @Description("Max of 姓名")
  Sort nameMax() default Sort.ASC;

  /**
   * Min of 姓名
   */
  @Description("Min of 姓名")
  Sort nameMin() default Sort.ASC;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  Sort descriptionCount() default Sort.ASC;

  /**
   * Max of 描述
   */
  @Description("Max of 描述")
  Sort descriptionMax() default Sort.ASC;

  /**
   * Min of 描述
   */
  @Description("Min of 描述")
  Sort descriptionMin() default Sort.ASC;

  /**
   * Count of 姓氏
   */
  @Description("Count of 姓氏")
  Sort lastNameCount() default Sort.ASC;

  /**
   * Max of 姓氏
   */
  @Description("Max of 姓氏")
  Sort lastNameMax() default Sort.ASC;

  /**
   * Min of 姓氏
   */
  @Description("Min of 姓氏")
  Sort lastNameMin() default Sort.ASC;

  /**
   * Count of 账号
   */
  @Description("Count of 账号")
  Sort loginCount() default Sort.ASC;

  /**
   * Max of 账号
   */
  @Description("Max of 账号")
  Sort loginMax() default Sort.ASC;

  /**
   * Min of 账号
   */
  @Description("Min of 账号")
  Sort loginMin() default Sort.ASC;

  /**
   * Count of 盐
   */
  @Description("Count of 盐")
  Sort saltCount() default Sort.ASC;

  /**
   * Max of 盐
   */
  @Description("Max of 盐")
  Sort saltMax() default Sort.ASC;

  /**
   * Min of 盐
   */
  @Description("Min of 盐")
  Sort saltMin() default Sort.ASC;

  /**
   * Count of 哈希
   */
  @Description("Count of 哈希")
  Sort hashCount() default Sort.ASC;

  /**
   * Max of 哈希
   */
  @Description("Max of 哈希")
  Sort hashMax() default Sort.ASC;

  /**
   * Min of 哈希
   */
  @Description("Min of 哈希")
  Sort hashMin() default Sort.ASC;

  /**
   * Count of 邮箱
   */
  @Description("Count of 邮箱")
  Sort emailCount() default Sort.ASC;

  /**
   * Max of 邮箱
   */
  @Description("Max of 邮箱")
  Sort emailMax() default Sort.ASC;

  /**
   * Min of 邮箱
   */
  @Description("Min of 邮箱")
  Sort emailMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $lastName() default "";

  String $login() default "";

  String $salt() default "";

  String $hash() default "";

  String $email() default "";

  String $phones() default "";

  String $disable() default "";

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

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";

  String $lastNameCount() default "";

  String $lastNameMax() default "";

  String $lastNameMin() default "";

  String $loginCount() default "";

  String $loginMax() default "";

  String $loginMin() default "";

  String $saltCount() default "";

  String $saltMax() default "";

  String $saltMin() default "";

  String $hashCount() default "";

  String $hashMax() default "";

  String $hashMin() default "";

  String $emailCount() default "";

  String $emailMax() default "";

  String $emailMin() default "";
}
