package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionLevel;
import io.graphence.core.dto.enumType.PermissionType;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionInput0 {
  String id() default "";

  String name() default "";

  String description() default "";

  PermissionType type() default PermissionType.READ;

  PermissionLevel level() default PermissionLevel.USER;

  boolean isDeprecated() default false;

  int version() default 0;

  String realmId() default "";

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  int roleId() default 0;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $type() default "";

  String $level() default "";

  String $role() default "";

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

  String $roleId() default "";
}
