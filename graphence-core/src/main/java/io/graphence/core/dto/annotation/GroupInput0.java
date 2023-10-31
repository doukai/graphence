package io.graphence.core.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GroupInput0 {
  String id() default "";

  String name() default "";

  String description() default "";

  String path() default "";

  int deep() default 0;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  int parentId() default 0;

  boolean syncGroupPolicy() default false;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $path() default "";

  String $deep() default "";

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

  String $subGroupsConnection() default "";

  String $usersAggregate() default "";

  String $usersConnection() default "";

  String $rolesAggregate() default "";

  String $rolesConnection() default "";

  String $parentId() default "";

  String $userGroup() default "";

  String $userGroupAggregate() default "";

  String $userGroupConnection() default "";

  String $groupRole() default "";

  String $groupRoleAggregate() default "";

  String $groupRoleConnection() default "";

  String $syncGroupPolicy() default "";

  GroupInput1 parent() default @GroupInput1;

  GroupInput1[] subGroups() default {};

  UserInput1[] users() default {};

  RoleInput1[] roles() default {};

  RealmInput1 realm() default @RealmInput1;

  UserGroupInput1[] userGroup() default {};

  GroupRoleInput1[] groupRole() default {};

  GroupInput1[] list() default {};

  String $list() default "";
}
