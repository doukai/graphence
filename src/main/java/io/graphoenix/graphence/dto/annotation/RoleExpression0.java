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

  String[] description() default {};

  boolean[] isDeprecated() default {};

  int[] version() default {};

  String[] realmId() default {};

  String[] createUserId() default {};

  String[] createTime() default {};

  String[] updateUserId() default {};

  String[] updateTime() default {};

  String[] createGroupId() default {};

  String[] __typename() default {};

  String[] $id() default {};

  String[] $name() default {};

  String[] $description() default {};

  String[] $isDeprecated() default {};

  String[] $version() default {};

  String[] $realmId() default {};

  String[] $createUserId() default {};

  String[] $createTime() default {};

  String[] $updateUserId() default {};

  String[] $updateTime() default {};

  String[] $createGroupId() default {};

  String[] $__typename() default {};

  UserExpressions1[] users() default {};

  RoleExpressions1[] composites() default {};

  PermissionExpressions1[] permissions() default {};

  RealmExpressions1[] realm() default {};

  UserExpressions1[] usersAggregate() default {};

  RoleExpressions1[] compositesAggregate() default {};

  PermissionExpressions1[] permissionsAggregate() default {};

  UserConnectionExpressions1[] usersConnection() default {};

  RoleConnectionExpressions1[] compositesConnection() default {};

  PermissionConnectionExpressions1[] permissionsConnection() default {};
}
