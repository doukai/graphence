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
 * 用户 查询表达式
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户 查询表达式")
public @interface UserExpression1 {
  /**
   * id
   */
  @Description("id")
  StringExpression id() default @StringExpression;

  /**
   * 姓名
   */
  @Description("姓名")
  StringExpression name() default @StringExpression;

  /**
   * 描述
   */
  @Description("描述")
  StringExpression description() default @StringExpression;

  /**
   * 姓氏
   */
  @Description("姓氏")
  StringExpression lastName() default @StringExpression;

  /**
   * 账号
   */
  @Description("账号")
  StringExpression login() default @StringExpression;

  /**
   * 盐
   */
  @Description("盐")
  StringExpression salt() default @StringExpression;

  /**
   * 哈希
   */
  @Description("哈希")
  StringExpression hash() default @StringExpression;

  /**
   * 邮箱
   */
  @Description("邮箱")
  StringExpression email() default @StringExpression;

  /**
   * 手机号
   */
  @Description("手机号")
  StringExpression phones() default @StringExpression;

  /**
   * 禁用
   */
  @Description("禁用")
  BooleanExpression disable() default @BooleanExpression;

  /**
   * 组
   */
  @Description("组")
  GroupExpression2 groups() default @GroupExpression2;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression2 roles() default @RoleExpression2;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression2 realm() default @RealmExpression2;

  /**
   * 包含已移除
   */
  @Description("包含已移除")
  boolean includeDeprecated() default false;

  /**
   * 版本
   */
  @Description("版本")
  IntExpression version() default @IntExpression;

  /**
   * 域
   */
  @Description("域")
  IntExpression realmId() default @IntExpression;

  /**
   * 创建者
   */
  @Description("创建者")
  StringExpression createUserId() default @StringExpression;

  /**
   * 创建时间
   */
  @Description("创建时间")
  StringExpression createTime() default @StringExpression;

  /**
   * 更新者
   */
  @Description("更新者")
  StringExpression updateUserId() default @StringExpression;

  /**
   * 更新时间
   */
  @Description("更新时间")
  StringExpression updateTime() default @StringExpression;

  /**
   * 创建组
   */
  @Description("创建组")
  StringExpression createGroupId() default @StringExpression;

  /**
   * 所属类型
   */
  @Description("所属类型")
  StringExpression __typename() default @StringExpression;

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  UserPhonesRelationExpression2 userPhonesRelation() default @UserPhonesRelationExpression2;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationExpression2 groupUserRelation() default @GroupUserRelationExpression2;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationExpression2 roleUserRelation() default @RoleUserRelationExpression2;

  /**
   * 取非
   */
  @Description("取非")
  boolean not() default false;

  /**
   * 与/或
   */
  @Description("与/或")
  Conditional cond() default Conditional.AND;

  /**
   * 查询表达式组
   */
  @Description("查询表达式组")
  UserExpression2[] exs() default {};

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

  String $groups() default "";

  String $roles() default "";

  String $realm() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $userPhonesRelation() default "";

  String $groupUserRelation() default "";

  String $roleUserRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
