package io.graphoenix.graphence.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface UserInput1 {
  String id() default "";

  String name() default "";

  String lastName() default "";

  String login() default "";

  String password() default "";

  String email() default "";

  boolean disable() default false;

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

  String $lastName() default "";

  String $login() default "";

  String $password() default "";

  String $email() default "";

  String $disable() default "";

  String $groups() default "";

  String $roles() default "";

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

  String $groupsAggregate() default "";

  String $rolesAggregate() default "";

  String $groupsConnection() default "";

  String $rolesConnection() default "";

  GroupInput2[] groups() default {};

  RoleInput2[] roles() default {};

  RealmInput2 realm() default @RealmInput2;
}
