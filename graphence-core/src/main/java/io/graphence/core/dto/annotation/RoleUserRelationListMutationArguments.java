package io.graphence.core.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation Arguments for Relationship Object between 用户 and 角色 List
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Arguments for Relationship Object between 用户 and 角色 List")
public @interface RoleUserRelationListMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  String userRef() default "";

  /**
   * 用户
   */
  @Description("用户")
  UserInput user() default @UserInput;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  String roleRef() default "";

  /**
   * 角色
   */
  @Description("角色")
  RoleInput role() default @RoleInput;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  boolean isDeprecated() default false;

  /**
   * Version
   */
  @Description("Version")
  int version() default 0;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  int realmId() default 0;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId() default "";

  /**
   * Create Time
   */
  @Description("Create Time")
  String createTime() default "";

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId() default "";

  /**
   * Update Time
   */
  @Description("Update Time")
  String updateTime() default "";

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId() default "";

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename() default "RoleUserRelation";

  /**
   * Input List
   */
  @Description("Input List")
  RoleUserRelationInput[] list() default {};

  /**
   * Where
   */
  @Description("Where")
  RoleUserRelationExpression where() default @RoleUserRelationExpression;

  String $id() default "";

  String $userRef() default "";

  String $user() default "";

  String $roleRef() default "";

  String $role() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $list() default "";

  String $where() default "";
}
