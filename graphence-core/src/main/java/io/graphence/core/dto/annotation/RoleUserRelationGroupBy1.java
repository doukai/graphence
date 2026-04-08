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
 * Group Input for Relationship Object between 用户 and 角色
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for Relationship Object between 用户 and 角色")
public @interface RoleUserRelationGroupBy1 {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 用户
   */
  @Description("用户")
  UserGroupBy2 user() default @UserGroupBy2;

  /**
   * 角色
   */
  @Description("角色")
  RoleGroupBy2 role() default @RoleGroupBy2;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  RoleUserRelationGroupBy2[] gbs() default {};

  String $by() default "";

  String $user() default "";

  String $role() default "";

  String $gbs() default "";
}
