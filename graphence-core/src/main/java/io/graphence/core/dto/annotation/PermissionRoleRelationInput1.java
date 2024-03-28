package io.graphence.core.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionRoleRelationInput1 {
  String id() default "";

  String roleRef() default "";

  RoleInput2 roleRefType() default @RoleInput2;

  String permissionRef() default "";

  PermissionInput2 permissionRefType() default @PermissionInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "PermissionRoleRelation";

  PermissionRoleRelationExpression2 where() default @PermissionRoleRelationExpression2;

  String $id() default "";

  String $roleRef() default "";

  String $roleRefType() default "";

  String $permissionRef() default "";

  String $permissionRefType() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $where() default "";
}
