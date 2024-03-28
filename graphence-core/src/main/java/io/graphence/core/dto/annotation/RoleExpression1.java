package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression2;
import io.graphoenix.core.dto.annotation.StringExpression2;
import io.graphoenix.core.dto.enumType.Conditional;
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
public @interface RoleExpression1 {
  StringExpression2 id() default @StringExpression2;

  StringExpression2 name() default @StringExpression2;

  StringExpression2 description() default @StringExpression2;

  UserExpression2 users() default @UserExpression2;

  GroupExpression2 groups() default @GroupExpression2;

  RoleExpression2 composites() default @RoleExpression2;

  PermissionExpression2 permissions() default @PermissionExpression2;

  RealmExpression2 realm() default @RealmExpression2;

  boolean includeDeprecated() default false;

  IntExpression2 version() default @IntExpression2;

  IntExpression2 realmId() default @IntExpression2;

  StringExpression2 createUserId() default @StringExpression2;

  StringExpression2 createTime() default @StringExpression2;

  StringExpression2 updateUserId() default @StringExpression2;

  StringExpression2 updateTime() default @StringExpression2;

  StringExpression2 createGroupId() default @StringExpression2;

  StringExpression2 __typename() default @StringExpression2;

  RoleUserRelationExpression2 roleUserRelation() default @RoleUserRelationExpression2;

  GroupRoleRelationExpression2 groupRoleRelation() default @GroupRoleRelationExpression2;

  RoleRoleRelationExpression2 roleRoleRelation() default @RoleRoleRelationExpression2;

  PermissionRoleRelationExpression2 permissionRoleRelation(
      ) default @PermissionRoleRelationExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  RoleExpression2[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

  String $realm() default "";

  String $includeDeprecated() default "";

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

  String $roleRoleRelation() default "";

  String $permissionRoleRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
