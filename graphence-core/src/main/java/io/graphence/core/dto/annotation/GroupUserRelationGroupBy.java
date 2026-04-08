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
 * Group Input for Relationship Object between 用户 and 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for Relationship Object between 用户 and 组")
public @interface GroupUserRelationGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 用户
   */
  @Description("用户")
  UserGroupBy1 user() default @UserGroupBy1;

  /**
   * 组
   */
  @Description("组")
  GroupGroupBy1 group() default @GroupGroupBy1;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  GroupUserRelationGroupBy1[] gbs() default {};

  String $by() default "";

  String $user() default "";

  String $group() default "";

  String $gbs() default "";
}
