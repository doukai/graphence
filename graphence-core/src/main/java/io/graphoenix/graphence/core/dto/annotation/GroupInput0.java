package io.graphoenix.graphence.core.dto.annotation;

import io.graphoenix.spi.annotation.Arguments;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Arguments
public @interface GroupInput0 {
  String id() default "";

  String name() default "";

  int parentId() default 0;

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

  String $parentId() default "";

  String $parent() default "";

  String $subGroups() default "";

  String $users() default "";

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

  String $subGroupsAggregate() default "";

  String $usersAggregate() default "";

  String $rolesAggregate() default "";

  String $subGroupsConnection() default "";

  String $usersConnection() default "";

  String $rolesConnection() default "";

  GroupInput1 parent() default @GroupInput1;

  GroupInput1[] subGroups() default {};

  UserInput1[] users() default {};

  RoleInput1[] roles() default {};

  RealmInput1 realm() default @RealmInput1;
}
