package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.PermissionLevel;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionInput0 {
  String id() default "";

  String roleId() default "";

  String fieldId() default "";

  PermissionLevel level() default PermissionLevel.READ;

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

  String $roleId() default "";

  String $role() default "";

  String $fieldId() default "";

  String $field() default "";

  String $level() default "";

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

  RoleInput1 role() default @RoleInput1;

  __FieldInput1 field() default @__FieldInput1;

  RealmInput1 realm() default @RealmInput1;

  PermissionInput1[] list() default {};

  String $list() default "";
}
