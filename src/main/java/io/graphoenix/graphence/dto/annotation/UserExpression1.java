package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Conditional;
import io.graphoenix.spi.annotation.Arguments;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Arguments
public @interface UserExpression1 {
  Conditional cond() default Conditional.AND;

  IDExpression id() default @IDExpression;

  StringExpression name() default @StringExpression;

  StringExpression lastName() default @StringExpression;

  StringExpression login() default @StringExpression;

  StringExpression password() default @StringExpression;

  StringExpression email() default @StringExpression;

  boolean disable() default false;

  boolean isDeprecated() default false;

  IntExpression version() default @IntExpression;

  StringExpression realmId() default @StringExpression;

  StringExpression createUserId() default @StringExpression;

  TimestampExpression createTime() default @TimestampExpression;

  StringExpression updateUserId() default @StringExpression;

  TimestampExpression updateTime() default @TimestampExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  String[] groupBy() default {};

  UserOrderBy1 orderBy() default @UserOrderBy1;

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

  GroupExpression2 groups() default @GroupExpression2;

  RoleExpression2 roles() default @RoleExpression2;

  RealmExpression2 realm() default @RealmExpression2;

  UserExpression2[] exs() default {};
}
