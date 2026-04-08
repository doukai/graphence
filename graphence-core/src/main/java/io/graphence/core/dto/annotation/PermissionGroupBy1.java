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
 * Group Input for 权限
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for 权限")
public @interface PermissionGroupBy1 {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 角色
   */
  @Description("角色")
  RoleGroupBy2 roles() default @RoleGroupBy2;

  /**
   * 租户
   */
  @Description("租户")
  RealmGroupBy2 realm() default @RealmGroupBy2;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationGroupBy2 rolePermissionRelation() default @RolePermissionRelationGroupBy2;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  PermissionGroupBy2[] gbs() default {};

  String $by() default "";

  String $roles() default "";

  String $realm() default "";

  String $rolePermissionRelation() default "";

  String $gbs() default "";
}
