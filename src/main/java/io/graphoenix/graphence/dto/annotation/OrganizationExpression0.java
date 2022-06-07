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
public @interface OrganizationExpression0 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] name() default {};

  int[] aboveId() default {};

  int[] version() default {};

  boolean[] isDeprecated() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $name() default {};

  String[] $aboveId() default {};

  String[] $version() default {};

  String[] $isDeprecated() default {};

  String[] $__typename() default {};

  OrganizationExpressions1[] above() default {};

  UserExpressions1[] users() default {};

  UserExpressions1[] usersAggregate() default {};

  UserConnectionExpressions1[] usersConnection() default {};
}
