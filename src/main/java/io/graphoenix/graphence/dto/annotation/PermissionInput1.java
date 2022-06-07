package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.PermissionLevel;
import io.graphoenix.spi.annotation.TypeInput;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeInput
public @interface PermissionInput1 {
  String id() default "";

  String roleId() default "";

  String fieldId() default "";

  PermissionLevel level() default PermissionLevel.READ;

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $id() default "";

  String $roleId() default "";

  String $role() default "";

  String $fieldId() default "";

  String $field() default "";

  String $level() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  RoleInput2 role() default @RoleInput2;

  __FieldInput2 field() default @__FieldInput2;
}
