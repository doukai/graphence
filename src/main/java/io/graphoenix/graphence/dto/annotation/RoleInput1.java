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
public @interface RoleInput1 {
  String id() default "";

  String name() default "";

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

  String $users() default "";

  String $permissions() default "";

  String $parents() default "";

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

  String $permissionsAggregate() default "";

  String $parentsAggregate() default "";

  String $usersConnection() default "";

  String $permissionsConnection() default "";

  String $parentsConnection() default "";

  UserInput2[] users() default {};

  PermissionInput2[] permissions() default {};

  RoleInput2[] parents() default {};

  UserInput2 usersAggregate() default @UserInput2;

  PermissionInput2 permissionsAggregate() default @PermissionInput2;

  RoleInput2 parentsAggregate() default @RoleInput2;

  UserConnectionInput2 usersConnection() default @UserConnectionInput2;

  PermissionConnectionInput2 permissionsConnection() default @PermissionConnectionInput2;

  RoleConnectionInput2 parentsConnection() default @RoleConnectionInput2;
}
