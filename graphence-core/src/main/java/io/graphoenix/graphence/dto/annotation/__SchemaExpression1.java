package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Conditional;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __SchemaExpression1 {
  Conditional cond() default Conditional.AND;

  IDExpression id() default @IDExpression;

  StringExpression queryTypeName() default @StringExpression;

  StringExpression mutationTypeName() default @StringExpression;

  StringExpression subscriptionTypeName() default @StringExpression;

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

  __SchemaOrderBy1 orderBy() default @__SchemaOrderBy1;

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

  __TypeExpression2 types() default @__TypeExpression2;

  __TypeExpression2 queryType() default @__TypeExpression2;

  __TypeExpression2 mutationType() default @__TypeExpression2;

  __TypeExpression2 subscriptionType() default @__TypeExpression2;

  __DirectiveExpression2 directives() default @__DirectiveExpression2;

  __SchemaExpression2[] exs() default {};
}
