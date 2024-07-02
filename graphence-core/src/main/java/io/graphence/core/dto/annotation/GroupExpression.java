package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GroupExpression {
  StringExpression id() default @StringExpression;

  StringExpression name() default @StringExpression;

  StringExpression description() default @StringExpression;

  StringExpression path() default @StringExpression;

  IntExpression deep() default @IntExpression;

  StringExpression parentId() default @StringExpression;

  GroupExpression1 parent() default @GroupExpression1;

  GroupExpression1 subGroups() default @GroupExpression1;

  UserExpression1 users() default @UserExpression1;

  RoleExpression1 roles() default @RoleExpression1;

  RealmExpression1 realm() default @RealmExpression1;

  boolean includeDeprecated() default false;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  GroupUserRelationExpression1 groupUserRelation() default @GroupUserRelationExpression1;

  GroupRoleRelationExpression1 groupRoleRelation() default @GroupRoleRelationExpression1;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  GroupExpression1[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $path() default "";

  String $deep() default "";

  String $parentId() default "";

  String $parent() default "";

  String $subGroups() default "";

  String $users() default "";

  String $roles() default "";

  String $realm() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $groupUserRelation() default "";

  String $groupRoleRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
