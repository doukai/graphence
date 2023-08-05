package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.enumType.Operator;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionTypeExpression {
  Operator opr() default Operator.EQ;

  PermissionType val() default PermissionType.READ;

  PermissionType[] in() default {};

  String $val() default "";

  String $in() default "";
}
