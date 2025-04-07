package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionType;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 用户 变更内容
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户 变更内容")
public @interface UserInput2 {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 姓名
   */
  @Description("姓名")
  String name() default "";

  /**
   * 描述
   */
  @Description("描述")
  String description() default "";

  /**
   * 姓氏
   */
  @Description("姓氏")
  String lastName() default "";

  /**
   * 账号
   */
  @Description("账号")
  String login() default "";

  /**
   * 盐
   */
  @Description("盐")
  String salt() default "";

  /**
   * 哈希
   */
  @Description("哈希")
  String hash() default "";

  /**
   * 邮箱
   */
  @Description("邮箱")
  String email() default "";

  /**
   * 手机号
   */
  @Description("手机号")
  String[] phones() default {};

  /**
   * 禁用
   */
  @Description("禁用")
  boolean disable() default false;

  /**
   * booleanList
   */
  @Description("booleanList")
  boolean[] booleanList() default {};

  /**
   * intList
   */
  @Description("intList")
  int[] intList() default {};

  /**
   * typeList
   */
  @Description("typeList")
  PermissionType[] typeList() default {};

  /**
   * 已移除
   */
  @Description("已移除")
  boolean isDeprecated() default false;

  /**
   * 版本
   */
  @Description("版本")
  int version() default 0;

  /**
   * 域
   */
  @Description("域")
  int realmId() default 0;

  /**
   * 创建者
   */
  @Description("创建者")
  String createUserId() default "";

  /**
   * 创建时间
   */
  @Description("创建时间")
  String createTime() default "";

  /**
   * 更新者
   */
  @Description("更新者")
  String updateUserId() default "";

  /**
   * 更新时间
   */
  @Description("更新时间")
  String updateTime() default "";

  /**
   * 创建组
   */
  @Description("创建组")
  String createGroupId() default "";

  /**
   * 所属类型
   */
  @Description("所属类型")
  String __typename() default "User";

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

  String $booleanList() default "";

  String $intList() default "";

  String $typeList() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";
}
