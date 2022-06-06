package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.spi.annotation.TypeInput;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeInput
public @interface OrganizationInput0 {
  String id() default "";

  String name() default "";

  int aboveId() default 0;

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $aboveId() default "";

  String $above() default "";

  String $users() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  String $usersAggregate() default "";

  String $usersConnection() default "";

  OrganizationInput1 above() default @OrganizationInput1;

  UserInput1[] users() default {};

  UserInput1 usersAggregate() default @UserInput1;

  UserConnectionInput1 usersConnection() default @UserConnectionInput1;
}
