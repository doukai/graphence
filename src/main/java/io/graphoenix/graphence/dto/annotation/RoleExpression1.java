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

  UserExpressions2[] users() default {};

  RoleExpressions2[] composites() default {};

  PermissionExpressions2[] permissions() default {};

  RealmExpressions2[] realm() default {};

  UserExpressions2[] usersAggregate() default {};

  RoleExpressions2[] compositesAggregate() default {};

  PermissionExpressions2[] permissionsAggregate() default {};

  UserConnectionExpressions2[] usersConnection() default {};

  RoleConnectionExpressions2[] compositesConnection() default {};

  PermissionConnectionExpressions2[] permissionsConnection() default {};
}
