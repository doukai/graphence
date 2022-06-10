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
public @interface GroupExpression1 {
  Operator opr() default Operator.EQ;

  String[] id() default {};

  String[] name() default {};

  int[] parentId() default {};

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

  String[] $parentId() default {};

  String[] $isDeprecated() default {};

  String[] $version() default {};

  String[] $realmId() default {};

  String[] $createUserId() default {};

  String[] $createTime() default {};

  String[] $updateUserId() default {};

  String[] $updateTime() default {};

  String[] $createGroupId() default {};

  String[] $__typename() default {};

  GroupExpressions2[] parent() default {};

  GroupExpressions2[] subGroups() default {};

  UserExpressions2[] users() default {};

  RoleExpressions2[] roles() default {};

  RealmExpressions2[] realm() default {};

  GroupExpressions2[] subGroupsAggregate() default {};

  UserExpressions2[] usersAggregate() default {};

  RoleExpressions2[] rolesAggregate() default {};

  GroupConnectionExpressions2[] subGroupsConnection() default {};

  UserConnectionExpressions2[] usersConnection() default {};

  RoleConnectionExpressions2[] rolesConnection() default {};
}
