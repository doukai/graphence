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
 * Group Input for Relationship Object between 角色 and 权限
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for Relationship Object between 角色 and 权限")
public @interface RolePermissionRelationGroupBy1 {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 角色
   */
  @Description("角色")
  RoleGroupBy2 role() default @RoleGroupBy2;

  /**
   * 权限
   */
  @Description("权限")
  PermissionGroupBy2 permission() default @PermissionGroupBy2;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  RolePermissionRelationGroupBy2[] gbs() default {};

  String $by() default "";

  String $role() default "";

  String $permission() default "";

  String $gbs() default "";
}
