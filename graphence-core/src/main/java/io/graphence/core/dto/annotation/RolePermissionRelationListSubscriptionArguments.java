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
 * Subscription Arguments for Relationship Object between 角色 and 权限 List
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Subscription Arguments for Relationship Object between 角色 and 权限 List")
public @interface RolePermissionRelationListSubscriptionArguments {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id() default @StringExpression;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  StringExpression roleRef() default @StringExpression;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression role() default @RoleExpression;

  /**
   * 权限 Reference
   */
  @Description("权限 Reference")
  StringExpression permissionRef() default @StringExpression;

  /**
   * 权限
   */
  @Description("权限")
  PermissionExpression permission() default @PermissionExpression;

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
   * Order By
   */
  @Description("Order By")
  RolePermissionRelationOrderBy orderBy() default @RolePermissionRelationOrderBy;

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
  RolePermissionRelationExpression[] exs() default {};

  /**
   * First
   */
  @Description("First")
  int first() default 0;

  /**
   * Input List
   */
  @Description("Input List")
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

  String $roleRef() default "";

  String $role() default "";

  String $permissionRef() default "";

  String $permission() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $orderBy() default "";

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";

  String $first() default "";

  String $last() default "";

  String $offset() default "";

  String $after() default "";

  String $before() default "";
}
