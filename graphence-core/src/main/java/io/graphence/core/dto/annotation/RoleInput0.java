package io.graphence.core.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface RoleInput0 {
  String id() default "";

  String name() default "";

  String description() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

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

  String $groups() default "";

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

  String $usersConnection() default "";

  String $groupsAggregate() default "";

  String $groupsConnection() default "";

  String $compositesAggregate() default "";

  String $compositesConnection() default "";

  String $permissionsAggregate() default "";

  String $permissionsConnection() default "";

  String $userRole() default "";

  String $userRoleAggregate() default "";

  String $userRoleConnection() default "";

  String $groupRole() default "";

  String $groupRoleAggregate() default "";

  String $groupRoleConnection() default "";

  String $roleComposite() default "";

  String $roleCompositeAggregate() default "";

  String $roleCompositeConnection() default "";

  String $rolePermission() default "";

  String $rolePermissionAggregate() default "";

  String $rolePermissionConnection() default "";

  UserInput1[] users() default {};

  GroupInput1[] groups() default {};

  RoleInput1[] composites() default {};

  PermissionInput1[] permissions() default {};

  RealmInput1 realm() default @RealmInput1;

  UserRoleInput1[] userRole() default {};

  GroupRoleInput1[] groupRole() default {};

  RoleCompositeInput1[] roleComposite() default {};

  RolePermissionInput1[] rolePermission() default {};

  RoleInput1[] list() default {};

  String $list() default "";
}
