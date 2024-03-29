package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Conditional;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface RoleExpression0 {
  Conditional cond() default Conditional.AND;

  IDExpression id() default @IDExpression;

  StringExpression name() default @StringExpression;

  StringExpression description() default @StringExpression;

  BooleanExpression isDeprecated() default @BooleanExpression;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  BooleanExpression syncRolePolicy() default @BooleanExpression;

  String[] groupBy() default {};

  RoleOrderBy0 orderBy() default @RoleOrderBy0;

  int first() default 0;

  String $first() default "";

  int last() default 0;

  String $last() default "";

  int offset() default 0;

  String $offset() default "";

  String after() default "";

  String before() default "";

  String $after() default "";

  String $before() default "";

  UserExpression1 users() default @UserExpression1;

  GroupExpression1 groups() default @GroupExpression1;

  RoleExpression1 composites() default @RoleExpression1;

  PermissionExpression1 permissions() default @PermissionExpression1;

  RealmExpression1 realm() default @RealmExpression1;

  UserRoleExpression1 userRole() default @UserRoleExpression1;

  GroupRoleExpression1 groupRole() default @GroupRoleExpression1;

  RoleCompositeExpression1 roleComposite() default @RoleCompositeExpression1;

  RolePermissionExpression1 rolePermission() default @RolePermissionExpression1;

  RoleExpression1[] exs() default {};
}
