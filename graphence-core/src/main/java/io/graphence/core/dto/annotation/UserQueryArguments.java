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
 * Query Arguments for 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Query Arguments for 用户")
public @interface UserQueryArguments {
  /**
   * ID
   */
  @Description("ID")
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
  GroupExpression groups() default @GroupExpression;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression roles() default @RoleExpression;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression realm() default @RealmExpression;

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
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  UserPhonesRelationExpression userPhonesRelation() default @UserPhonesRelationExpression;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationExpression groupUserRelation() default @GroupUserRelationExpression;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationExpression roleUserRelation() default @RoleUserRelationExpression;

  /**
   * Group By
   */
  @Description("Group By")
  String[] groupBy() default {};

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
   * Expressions
   */
  @Description("Expressions")
  UserExpression[] exs() default {};

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

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
