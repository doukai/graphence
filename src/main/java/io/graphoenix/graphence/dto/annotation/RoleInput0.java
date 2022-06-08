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
public @interface RoleInput0 {
  String id() default "";

  String name() default "";

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $users() default "";

  String $permissions() default "";

  String $parents() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  String $usersAggregate() default "";

  String $permissionsAggregate() default "";

  String $parentsAggregate() default "";

  String $usersConnection() default "";

  String $permissionsConnection() default "";

  String $parentsConnection() default "";

  UserInput1[] users() default {};

  PermissionInput1[] permissions() default {};

  RoleInput1[] parents() default {};

  UserInput1 usersAggregate() default @UserInput1;

  PermissionInput1 permissionsAggregate() default @PermissionInput1;

  RoleInput1 parentsAggregate() default @RoleInput1;

  UserConnectionInput1 usersConnection() default @UserConnectionInput1;

  PermissionConnectionInput1 permissionsConnection() default @PermissionConnectionInput1;

  RoleConnectionInput1 parentsConnection() default @RoleConnectionInput1;
}
