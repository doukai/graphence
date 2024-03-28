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
public @interface PermissionExpression1 {
  StringExpression2 name() default @StringExpression2;

  StringExpression2 description() default @StringExpression2;

  StringExpression2 field() default @StringExpression2;

  StringExpression2 type() default @StringExpression2;

  PermissionTypeExpression2 permissionType() default @PermissionTypeExpression2;

  RoleExpression2 roles() default @RoleExpression2;

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

  PermissionRoleRelationExpression2 permissionRoleRelation(
      ) default @PermissionRoleRelationExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  PermissionExpression2[] exs() default {};

  String $name() default "";

  String $description() default "";

  String $field() default "";

  String $type() default "";

  String $permissionType() default "";

  String $roles() default "";

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

  String $permissionRoleRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
