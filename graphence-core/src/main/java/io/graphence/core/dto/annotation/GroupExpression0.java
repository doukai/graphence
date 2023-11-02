package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Conditional;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GroupExpression0 {
  Conditional cond() default Conditional.AND;

  IDExpression id() default @IDExpression;

  StringExpression name() default @StringExpression;

  StringExpression description() default @StringExpression;

  StringExpression path() default @StringExpression;

  IntExpression deep() default @IntExpression;

  StringExpression parentId() default @StringExpression;

  BooleanExpression isDeprecated() default @BooleanExpression;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  BooleanExpression syncGroupPolicy() default @BooleanExpression;

  String[] groupBy() default {};

  GroupOrderBy0 orderBy() default @GroupOrderBy0;

  int first() default 0;

  String $first() default "";

  int last() default 0;

  String $last() default "";

  int offset() default 0;

  String $offset() default "";

  String after() default "";

  String before() default "";

  String $after() default "";

  String $before() default "";

  GroupExpression1 parent() default @GroupExpression1;

  GroupExpression1 subGroups() default @GroupExpression1;

  UserExpression1 users() default @UserExpression1;

  RoleExpression1 roles() default @RoleExpression1;

  RealmExpression1 realm() default @RealmExpression1;

  UserGroupExpression1 userGroup() default @UserGroupExpression1;

  GroupRoleExpression1 groupRole() default @GroupRoleExpression1;

  GroupExpression1[] exs() default {};
}
