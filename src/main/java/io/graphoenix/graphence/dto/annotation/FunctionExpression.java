package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Function;
import io.graphoenix.graphence.dto.enumType.Operator;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface FunctionExpression {
  Operator opr() default Operator.EQ;

  Function val() default Function.COUNT;

  Function[] in() default {};

  String $val() default "";

  String $in() default "";
}
