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
public @interface RoleInput {
  String id() default "";

  String name() default "";

  String description() default "";

  UserInput1[] users() default {};

  GroupInput1[] groups() default {};

  RoleInput1[] composites() default {};

  PermissionInput1[] permissions() default {};

  RealmInput1 realm() default @RealmInput1;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Role";

  RoleUserRelationInput1[] roleUserRelation() default {};

  GroupRoleRelationInput1[] groupRoleRelation() default {};

  RoleCompositeRelationInput1[] roleCompositeRelation() default {};

  PermissionRoleRelationInput1[] permissionRoleRelation() default {};

  RoleExpression1 where() default @RoleExpression1;

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

  String $roleUserRelation() default "";

  String $groupRoleRelation() default "";

  String $roleCompositeRelation() default "";

  String $permissionRoleRelation() default "";

  String $where() default "";
}
