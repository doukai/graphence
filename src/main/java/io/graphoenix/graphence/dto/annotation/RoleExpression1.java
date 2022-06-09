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

  String[] domainId() default {};

  boolean[] isDeprecated() default {};

  int[] version() default {};

  String[] createUserId() default {};

  String[] createTime() default {};

  String[] updateUserId() default {};

  String[] updateTime() default {};

  String[] createOrganizationId() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $name() default {};

  String[] $domainId() default {};

  String[] $isDeprecated() default {};

  String[] $version() default {};

  String[] $createUserId() default {};

  String[] $createTime() default {};

  String[] $updateUserId() default {};

  String[] $updateTime() default {};

  String[] $createOrganizationId() default {};

  String[] $__typename() default {};

  UserExpressions2[] users() default {};

  PermissionExpressions2[] permissions() default {};

  RoleExpressions2[] parents() default {};

  UserExpressions2[] usersAggregate() default {};

  PermissionExpressions2[] permissionsAggregate() default {};

  RoleExpressions2[] parentsAggregate() default {};

  UserConnectionExpressions2[] usersConnection() default {};

  PermissionConnectionExpressions2[] permissionsConnection() default {};

  RoleConnectionExpressions2[] parentsConnection() default {};
}
