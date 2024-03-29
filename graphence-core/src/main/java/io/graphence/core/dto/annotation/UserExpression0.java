package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Conditional;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface UserExpression0 {
  Conditional cond() default Conditional.AND;

  IDExpression id() default @IDExpression;

  StringExpression name() default @StringExpression;

  StringExpression description() default @StringExpression;

  StringExpression lastName() default @StringExpression;

  StringExpression login() default @StringExpression;

  StringExpression salt() default @StringExpression;

  StringExpression hash() default @StringExpression;

  StringExpression email() default @StringExpression;

  StringExpression phones() default @StringExpression;

  BooleanExpression disable() default @BooleanExpression;

  BooleanExpression isDeprecated() default @BooleanExpression;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  BooleanExpression syncUserPolicy() default @BooleanExpression;

  String[] groupBy() default {};

  UserOrderBy0 orderBy() default @UserOrderBy0;

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

  GroupExpression1 groups() default @GroupExpression1;

  RoleExpression1 roles() default @RoleExpression1;

  RealmExpression1 realm() default @RealmExpression1;

  UserPhonesExpression1 userPhones() default @UserPhonesExpression1;

  UserGroupExpression1 userGroup() default @UserGroupExpression1;

  UserRoleExpression1 userRole() default @UserRoleExpression1;

  UserExpression1[] exs() default {};
}
