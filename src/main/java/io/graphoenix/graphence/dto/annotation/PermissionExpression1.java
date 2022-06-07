package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Operator;
import io.graphoenix.graphence.dto.enumType.PermissionLevel;
import io.graphoenix.spi.annotation.TypeExpression;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeExpression
public @interface PermissionExpression1 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] roleId() default {};

  String[] fieldId() default {};

  PermissionLevel[] level() default {};

  int[] version() default {};

  boolean[] isDeprecated() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $roleId() default {};

  String[] $fieldId() default {};

  String[] $level() default {};

  String[] $version() default {};

  String[] $isDeprecated() default {};

  String[] $__typename() default {};

  RoleExpressions2[] role() default {};

  __FieldExpressions2[] field() default {};
}
