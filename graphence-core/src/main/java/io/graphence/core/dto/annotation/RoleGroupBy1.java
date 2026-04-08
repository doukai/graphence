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
 * Group Input for 角色
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for 角色")
public @interface RoleGroupBy1 {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 用户
   */
  @Description("用户")
  UserGroupBy2 users() default @UserGroupBy2;

  /**
   * 组
   */
  @Description("组")
  GroupGroupBy2 groups() default @GroupGroupBy2;

  /**
   * 组合
   */
  @Description("组合")
  RoleGroupBy2 composites() default @RoleGroupBy2;

  /**
   * 权限
   */
  @Description("权限")
  PermissionGroupBy2 permissions() default @PermissionGroupBy2;

  /**
   * 租户
   */
  @Description("租户")
  RealmGroupBy2 realm() default @RealmGroupBy2;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationGroupBy2 roleUserRelation() default @RoleUserRelationGroupBy2;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationGroupBy2 groupRoleRelation() default @GroupRoleRelationGroupBy2;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  RoleCompositeRelationGroupBy2 roleCompositeRelation() default @RoleCompositeRelationGroupBy2;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationGroupBy2 rolePermissionRelation() default @RolePermissionRelationGroupBy2;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  RoleGroupBy2[] gbs() default {};

  String $by() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

  String $realm() default "";

  String $roleUserRelation() default "";

  String $groupRoleRelation() default "";

  String $roleCompositeRelation() default "";

  String $rolePermissionRelation() default "";

  String $gbs() default "";
}
