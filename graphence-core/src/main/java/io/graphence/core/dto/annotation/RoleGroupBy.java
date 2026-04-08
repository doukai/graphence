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
public @interface RoleGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 用户
   */
  @Description("用户")
  UserGroupBy1 users() default @UserGroupBy1;

  /**
   * 组
   */
  @Description("组")
  GroupGroupBy1 groups() default @GroupGroupBy1;

  /**
   * 组合
   */
  @Description("组合")
  RoleGroupBy1 composites() default @RoleGroupBy1;

  /**
   * 权限
   */
  @Description("权限")
  PermissionGroupBy1 permissions() default @PermissionGroupBy1;

  /**
   * 租户
   */
  @Description("租户")
  RealmGroupBy1 realm() default @RealmGroupBy1;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationGroupBy1 roleUserRelation() default @RoleUserRelationGroupBy1;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationGroupBy1 groupRoleRelation() default @GroupRoleRelationGroupBy1;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  RoleCompositeRelationGroupBy1 roleCompositeRelation() default @RoleCompositeRelationGroupBy1;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationGroupBy1 rolePermissionRelation() default @RolePermissionRelationGroupBy1;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  RoleGroupBy1[] gbs() default {};

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
