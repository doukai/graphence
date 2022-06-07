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
public @interface __InputValueExpression1 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] name() default {};

  String[] typeName() default {};

  String[] ofTypeName() default {};

  int[] fieldId() default {};

  String[] directiveName() default {};

  String[] description() default {};

  String[] defaultValue() default {};

  int[] version() default {};

  boolean[] isDeprecated() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $name() default {};

  String[] $typeName() default {};

  String[] $ofTypeName() default {};

  String[] $fieldId() default {};

  String[] $directiveName() default {};

  String[] $description() default {};

  String[] $defaultValue() default {};

  String[] $version() default {};

  String[] $isDeprecated() default {};

  String[] $__typename() default {};

  __TypeExpressions2[] ofType() default {};

  __TypeExpressions2[] type() default {};
}
