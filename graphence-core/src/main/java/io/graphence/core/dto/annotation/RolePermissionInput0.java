package io.graphence.core.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface RolePermissionInput0 {
  String id() default "";

  int roleId() default 0;

  String permissionName() default "";

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

  String $roleId() default "";

  String $roleIdType() default "";

  String $permissionName() default "";

  String $permissionNameType() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  RoleInput1 roleIdType() default @RoleInput1;

  PermissionInput1 permissionNameType() default @PermissionInput1;

  RolePermissionInput1[] list() default {};

  String $list() default "";
}
