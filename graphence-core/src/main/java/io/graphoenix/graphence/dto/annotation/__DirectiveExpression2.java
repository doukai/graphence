package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Conditional;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __DirectiveExpression2 {
  Conditional cond() default Conditional.AND;

  IDExpression name() default @IDExpression;

  IntExpression schemaId() default @IntExpression;

  StringExpression description() default @StringExpression;

  __DirectiveLocationExpression locations() default @__DirectiveLocationExpression;

  BooleanExpression onOperation() default @BooleanExpression;

  BooleanExpression onFragment() default @BooleanExpression;

  BooleanExpression onField() default @BooleanExpression;

  BooleanExpression isDeprecated() default @BooleanExpression;

  IntExpression version() default @IntExpression;

  StringExpression realmId() default @StringExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  String[] groupBy() default {};

  __DirectiveOrderBy2 orderBy() default @__DirectiveOrderBy2;

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
}
