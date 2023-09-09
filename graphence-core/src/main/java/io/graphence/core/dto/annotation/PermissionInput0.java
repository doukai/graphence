package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionType;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionInput0 {
  String name() default "";

  String field() default "";

  String type() default "";

  PermissionType permissionType() default PermissionType.READ;

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

  String $name() default "";

  String $field() default "";

  String $type() default "";

  String $permissionType() default "";

  String $description() default "";

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

  String $rolesAggregate() default "";

  String $rolesConnection() default "";

  String $rolePermission() default "";

  String $rolePermissionAggregate() default "";

  String $rolePermissionConnection() default "";

  RoleInput1[] roles() default {};

  RealmInput1 realm() default @RealmInput1;

  RolePermissionInput1[] rolePermission() default {};

  PermissionInput1[] list() default {};

  String $list() default "";
}
