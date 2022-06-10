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

  String description() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  String realmId() default "";

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $composites() default "";

  String $permissions() default "";

  String $realm() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $usersAggregate() default "";

  String $compositesAggregate() default "";

  String $permissionsAggregate() default "";

  String $usersConnection() default "";

  String $compositesConnection() default "";

  String $permissionsConnection() default "";

  UserInput1[] users() default {};

  RoleInput1[] composites() default {};

  PermissionInput1[] permissions() default {};

  RealmInput1 realm() default @RealmInput1;

  UserInput1 usersAggregate() default @UserInput1;

  RoleInput1 compositesAggregate() default @RoleInput1;

  PermissionInput1 permissionsAggregate() default @PermissionInput1;

  UserConnectionInput1 usersConnection() default @UserConnectionInput1;

  RoleConnectionInput1 compositesConnection() default @RoleConnectionInput1;

  PermissionConnectionInput1 permissionsConnection() default @PermissionConnectionInput1;
}
