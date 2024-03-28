package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionType;
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
public @interface PermissionMutationArguments {
  String name() default "";

  String description() default "";

  String field() default "";

  String type() default "";

  PermissionType permissionType() default PermissionType.READ;

  RoleInput1[] roles() default {};

  RealmInput1 realm() default @RealmInput1;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Permission";

  PermissionRoleRelationInput1[] permissionRoleRelation() default {};

  PermissionExpression1 where() default @PermissionExpression1;

  String $name() default "";

  String $description() default "";

  String $field() default "";

  String $type() default "";

  String $permissionType() default "";

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

  String $permissionRoleRelation() default "";

  String $where() default "";
}
