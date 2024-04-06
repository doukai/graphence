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
public @interface RoleInput1 {
  String id() default "";

  String name() default "";

  String description() default "";

  UserInput2[] users() default {};

  GroupInput2[] groups() default {};

  RoleInput2[] composites() default {};

  PermissionInput2[] permissions() default {};

  RealmInput2 realm() default @RealmInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Role";

  RoleUserRelationInput2[] roleUserRelation() default {};

  GroupRoleRelationInput2[] groupRoleRelation() default {};

  RoleCompositeRelationInput2[] roleCompositeRelation() default {};

  PermissionRoleRelationInput2[] permissionRoleRelation() default {};

  RoleExpression2 where() default @RoleExpression2;

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
