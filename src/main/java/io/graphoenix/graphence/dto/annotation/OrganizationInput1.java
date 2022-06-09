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
public @interface OrganizationInput1 {
  String id() default "";

  String name() default "";

  int aboveId() default 0;

  String domainId() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createOrganizationId() default "";

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $aboveId() default "";

  String $above() default "";

  String $users() default "";

  String $domainId() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createOrganizationId() default "";

  String $__typename() default "";

  String $usersAggregate() default "";

  String $usersConnection() default "";

  OrganizationInput2 above() default @OrganizationInput2;

  UserInput2[] users() default {};

  UserInput2 usersAggregate() default @UserInput2;

  UserConnectionInput2 usersConnection() default @UserConnectionInput2;
}
