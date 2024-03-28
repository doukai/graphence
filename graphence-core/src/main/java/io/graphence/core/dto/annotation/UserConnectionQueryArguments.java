package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.BooleanExpression1;
import io.graphoenix.core.dto.annotation.IntExpression1;
import io.graphoenix.core.dto.annotation.StringExpression1;
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
public @interface UserConnectionQueryArguments {
  StringExpression1 id() default @StringExpression1;

  StringExpression1 name() default @StringExpression1;

  StringExpression1 description() default @StringExpression1;

  StringExpression1 lastName() default @StringExpression1;

  StringExpression1 login() default @StringExpression1;

  StringExpression1 salt() default @StringExpression1;

  StringExpression1 hash() default @StringExpression1;

  StringExpression1 email() default @StringExpression1;

  StringExpression1 phones() default @StringExpression1;

  BooleanExpression1 disable() default @BooleanExpression1;

  GroupExpression1 groups() default @GroupExpression1;

  RoleExpression1 roles() default @RoleExpression1;

  RealmExpression1 realm() default @RealmExpression1;

  boolean includeDeprecated() default false;

  IntExpression1 version() default @IntExpression1;

  IntExpression1 realmId() default @IntExpression1;

  StringExpression1 createUserId() default @StringExpression1;

  StringExpression1 createTime() default @StringExpression1;

  StringExpression1 updateUserId() default @StringExpression1;

  StringExpression1 updateTime() default @StringExpression1;

  StringExpression1 createGroupId() default @StringExpression1;

  StringExpression1 __typename() default @StringExpression1;

  UserPhonesRelationExpression1 userPhonesRelation() default @UserPhonesRelationExpression1;

  GroupUserRelationExpression1 groupUserRelation() default @GroupUserRelationExpression1;

  RoleUserRelationExpression1 roleUserRelation() default @RoleUserRelationExpression1;

  UserOrderBy1 orderBy() default @UserOrderBy1;

  String[] groupBy() default {};

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  UserExpression1[] exs() default {};

  int first() default 0;

  int last() default 0;

  int offset() default 0;

  String after() default "";

  String before() default "";

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $lastName() default "";

  String $login() default "";

  String $salt() default "";

  String $hash() default "";

  String $email() default "";

  String $phones() default "";

  String $disable() default "";

  String $groups() default "";

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

  String $userPhonesRelation() default "";

  String $groupUserRelation() default "";

  String $roleUserRelation() default "";

  String $orderBy() default "";

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";

  String $first() default "";

  String $last() default "";

  String $offset() default "";

  String $after() default "";

  String $before() default "";
}
