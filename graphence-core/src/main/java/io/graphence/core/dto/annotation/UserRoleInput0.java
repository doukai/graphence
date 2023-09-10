package io.graphence.core.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface UserRoleInput0 {
  String id() default "";

  int userId() default 0;

  int roleId() default 0;

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

  String $userId() default "";

  String $userIdType() default "";

  String $roleId() default "";

  String $roleIdType() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  UserInput1 userIdType() default @UserInput1;

  RoleInput1 roleIdType() default @RoleInput1;

  UserRoleInput1[] list() default {};

  String $list() default "";
}
