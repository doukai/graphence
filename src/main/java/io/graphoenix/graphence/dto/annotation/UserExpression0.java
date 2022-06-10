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
public @interface UserExpression0 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] name() default {};

  String[] lastName() default {};

  String[] login() default {};

  String[] password() default {};

  String[] email() default {};

  boolean[] disable() default {};

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

  String[] $lastName() default {};

  String[] $login() default {};

  String[] $password() default {};

  String[] $email() default {};

  String[] $disable() default {};

  String[] $isDeprecated() default {};

  String[] $version() default {};

  String[] $realmId() default {};

  String[] $createUserId() default {};

  String[] $createTime() default {};

  String[] $updateUserId() default {};

  String[] $updateTime() default {};

  String[] $createGroupId() default {};

  String[] $__typename() default {};

  GroupExpressions1[] groups() default {};

  RoleExpressions1[] roles() default {};

  RealmExpressions1[] realm() default {};

  GroupExpressions1[] groupsAggregate() default {};

  RoleExpressions1[] rolesAggregate() default {};

  GroupConnectionExpressions1[] groupsConnection() default {};

  RoleConnectionExpressions1[] rolesConnection() default {};
}
