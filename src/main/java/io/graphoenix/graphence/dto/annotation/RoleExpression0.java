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
public @interface RoleExpression0 {
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

  UserExpressions1[] users() default {};

  PermissionExpressions1[] permissions() default {};

  RoleExpressions1[] parents() default {};

  UserExpressions1[] usersAggregate() default {};

  PermissionExpressions1[] permissionsAggregate() default {};

  RoleExpressions1[] parentsAggregate() default {};

  UserConnectionExpressions1[] usersConnection() default {};

  PermissionConnectionExpressions1[] permissionsConnection() default {};

  RoleConnectionExpressions1[] parentsConnection() default {};
}
