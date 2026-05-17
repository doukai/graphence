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
 * Group Input for API Key
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for API Key")
public @interface ApiKeyGroupBy {
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
   * 租户
   */
  @Description("租户")
  RealmGroupBy1 realm() default @RealmGroupBy1;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  ApiKeyGroupBy1[] gbs() default {};

  String $by() default "";

  String $user() default "";

  String $realm() default "";

  String $gbs() default "";
}
