package io.graphence.core.dto.annotation;

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
 * Query Expression Input for 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Query Expression Input for 组")
public @interface GroupExpression {
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
   * 路径
   */
  @Description("路径")
  StringExpression path() default @StringExpression;

  /**
   * 层级
   */
  @Description("层级")
  IntExpression deep() default @IntExpression;

  /**
   * 上级ID
   */
  @Description("上级ID")
  StringExpression parentId() default @StringExpression;

  /**
   * 上级
   */
  @Description("上级")
  GroupExpression1 parent() default @GroupExpression1;

  /**
   * 下级
   */
  @Description("下级")
  GroupExpression1 subGroups() default @GroupExpression1;

  /**
   * 用户
   */
  @Description("用户")
  UserExpression1 users() default @UserExpression1;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression1 roles() default @RoleExpression1;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression1 realm() default @RealmExpression1;

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
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationExpression1 groupUserRelation() default @GroupUserRelationExpression1;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationExpression1 groupRoleRelation() default @GroupRoleRelationExpression1;

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
  GroupExpression1[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $path() default "";

  String $deep() default "";

  String $parentId() default "";

  String $parent() default "";

  String $subGroups() default "";

  String $users() default "";

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

  String $groupUserRelation() default "";

  String $groupRoleRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
