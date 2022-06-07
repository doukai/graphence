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
public @interface RoleExpression1 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] name() default {};

  int[] version() default {};

  boolean[] isDeprecated() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $name() default {};

  String[] $version() default {};

  String[] $isDeprecated() default {};

  String[] $__typename() default {};

  UserExpressions2[] users() default {};

  PermissionExpressions2[] permissions() default {};

  UserExpressions2[] usersAggregate() default {};

  PermissionExpressions2[] permissionsAggregate() default {};

  UserConnectionExpressions2[] usersConnection() default {};

  PermissionConnectionExpressions2[] permissionsConnection() default {};
}
