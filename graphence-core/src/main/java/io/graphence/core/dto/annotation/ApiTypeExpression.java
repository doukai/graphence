package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.ApiType;
import io.graphoenix.core.dto.enumType.Operator;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface ApiTypeExpression {
  Operator opr() default Operator.EQ;

  ApiType val() default ApiType.QUERY;

  ApiType[] in() default {};

  String $val() default "";

  String $in() default "";
}
