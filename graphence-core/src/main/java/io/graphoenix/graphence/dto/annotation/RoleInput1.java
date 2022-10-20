package io.graphoenix.graphence.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface RoleInput1 {
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

  UserInput2[] users() default {};

  RoleInput2[] composites() default {};

  PermissionInput2[] permissions() default {};

  RealmInput2 realm() default @RealmInput2;

  RoleInput2[] list() default {};

  String $list() default "";
}
