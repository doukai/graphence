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
public @interface GroupInput1 {
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

  GroupInput2 parent() default @GroupInput2;

  GroupInput2[] subGroups() default {};

  UserInput2[] users() default {};

  RoleInput2[] roles() default {};

  RealmInput2 realm() default @RealmInput2;

  GroupInput2 subGroupsAggregate() default @GroupInput2;

  UserInput2 usersAggregate() default @UserInput2;

  RoleInput2 rolesAggregate() default @RoleInput2;

  GroupConnectionInput2 subGroupsConnection() default @GroupConnectionInput2;

  UserConnectionInput2 usersConnection() default @UserConnectionInput2;

  RoleConnectionInput2 rolesConnection() default @RoleConnectionInput2;
}
