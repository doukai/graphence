package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Operator;
import io.graphoenix.spi.annotation.TypeExpression;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeExpression
public @interface __SchemaExpression1 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] queryTypeName() default {};

  String[] mutationTypeName() default {};

  String[] subscriptionTypeName() default {};

  int[] version() default {};

  boolean[] isDeprecated() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $queryTypeName() default {};

  String[] $mutationTypeName() default {};

  String[] $subscriptionTypeName() default {};

  String[] $version() default {};

  String[] $isDeprecated() default {};

  String[] $__typename() default {};

  __TypeExpressions2[] types() default {};

  __TypeExpressions2[] queryType() default {};

  __TypeExpressions2[] mutationType() default {};

  __TypeExpressions2[] subscriptionType() default {};

  __DirectiveExpressions2[] directives() default {};

  __TypeExpressions2[] typesAggregate() default {};

  __DirectiveExpressions2[] directivesAggregate() default {};

  __TypeConnectionExpressions2[] typesConnection() default {};

  __DirectiveConnectionExpressions2[] directivesConnection() default {};
}
