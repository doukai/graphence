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
public @interface __TypeConnectionExpression1 {
  Operator opr() default Operator.EQ;

  int[] totalCount() default {};

  String[] $totalCount() default {};

  PageInfoExpressions2[] pageInfo() default {};

  __TypeEdgeExpressions2[] edges() default {};
}
