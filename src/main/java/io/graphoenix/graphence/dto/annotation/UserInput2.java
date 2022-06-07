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
public @interface UserInput2 {
  String id() default "";

  String name() default "";

  String login() default "";

  String password() default "";

  boolean disable() default false;

  int organizationId() default 0;

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $login() default "";

  String $password() default "";

  String $disable() default "";

  String $organizationId() default "";

  String $organization() default "";

  String $roles() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  String $rolesAggregate() default "";

  String $rolesConnection() default "";
}
