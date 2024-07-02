package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
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
public @interface RoleListSubscriptionArguments {
  StringExpression id() default @StringExpression;

  StringExpression name() default @StringExpression;

  StringExpression description() default @StringExpression;

  UserExpression users() default @UserExpression;

  GroupExpression groups() default @GroupExpression;

  RoleExpression composites() default @RoleExpression;

  PermissionExpression permissions() default @PermissionExpression;

  RealmExpression realm() default @RealmExpression;

  boolean includeDeprecated() default false;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  RoleUserRelationExpression roleUserRelation() default @RoleUserRelationExpression;

  GroupRoleRelationExpression groupRoleRelation() default @GroupRoleRelationExpression;

  RoleCompositeRelationExpression roleCompositeRelation() default @RoleCompositeRelationExpression;

  PermissionRoleRelationExpression permissionRoleRelation(
      ) default @PermissionRoleRelationExpression;

  RoleOrderBy orderBy() default @RoleOrderBy;

  String[] groupBy() default {};

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  RoleExpression[] exs() default {};

  int first() default 0;

  int last() default 0;

  int offset() default 0;

  String after() default "";

  String before() default "";

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

  String $roleCompositeRelation() default "";

  String $permissionRoleRelation() default "";

  String $orderBy() default "";

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";

  String $first() default "";

  String $last() default "";

  String $offset() default "";

  String $after() default "";

  String $before() default "";
}
