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
public @interface UserExpression1 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] name() default {};

  String[] login() default {};

  String[] password() default {};

  boolean[] disable() default {};

  int[] organizationId() default {};

  int[] version() default {};

  boolean[] isDeprecated() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $name() default {};

  String[] $login() default {};

  String[] $password() default {};

  String[] $disable() default {};

  String[] $organizationId() default {};

  String[] $version() default {};

  String[] $isDeprecated() default {};

  String[] $__typename() default {};

  OrganizationExpressions2[] organization() default {};

  RoleExpressions2[] roles() default {};

  RoleExpressions2[] rolesAggregate() default {};

  RoleConnectionExpressions2[] rolesConnection() default {};
}
