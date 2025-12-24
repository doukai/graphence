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
 * Query Expression Input for 角色
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Query Expression Input for 角色")
public @interface RoleExpressionBase1 {
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
   * 用户
   */
  @Description("用户")
  UserExpression2 users() default @UserExpression2;

  /**
   * 组
   */
  @Description("组")
  GroupExpression2 groups() default @GroupExpression2;

  /**
   * 组合
   */
  @Description("组合")
  RoleExpression2 composites() default @RoleExpression2;

  /**
   * 权限
   */
  @Description("权限")
  PermissionExpression2 permissions() default @PermissionExpression2;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression2 realm() default @RealmExpression2;

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
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationExpression2 roleUserRelation() default @RoleUserRelationExpression2;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationExpression2 groupRoleRelation() default @GroupRoleRelationExpression2;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  RoleCompositeRelationExpression2 roleCompositeRelation(
      ) default @RoleCompositeRelationExpression2;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationExpression2 rolePermissionRelation(
      ) default @RolePermissionRelationExpression2;

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
  RoleExpression2[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

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

  String $roleUserRelation() default "";

  String $groupRoleRelation() default "";

  String $roleCompositeRelation() default "";

  String $rolePermissionRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
