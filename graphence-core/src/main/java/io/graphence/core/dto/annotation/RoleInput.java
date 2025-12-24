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
 * Mutation Input for 角色
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Input for 角色")
public @interface RoleInput {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 名称
   */
  @Description("名称")
  String name() default "";

  /**
   * 描述
   */
  @Description("描述")
  String description() default "";

  /**
   * 用户
   */
  @Description("用户")
  UserInput1[] users() default {};

  /**
   * 组
   */
  @Description("组")
  GroupInput1[] groups() default {};

  /**
   * 组合
   */
  @Description("组合")
  RoleInput1[] composites() default {};

  /**
   * 权限
   */
  @Description("权限")
  PermissionInput1[] permissions() default {};

  /**
   * 租户
   */
  @Description("租户")
  RealmInput1 realm() default @RealmInput1;

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
  String __typename() default "Role";

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationInput1[] roleUserRelation() default {};

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationInput1[] groupRoleRelation() default {};

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  RoleCompositeRelationInput1[] roleCompositeRelation() default {};

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationInput1[] rolePermissionRelation() default {};

  /**
   * Where
   */
  @Description("Where")
  RoleExpression1 where() default @RoleExpression1;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

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

  String $roleUserRelation() default "";

  String $groupRoleRelation() default "";

  String $roleCompositeRelation() default "";

  String $rolePermissionRelation() default "";

  String $where() default "";
}
