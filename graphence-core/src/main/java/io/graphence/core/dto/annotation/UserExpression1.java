package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.BooleanExpression2;
import io.graphoenix.core.dto.annotation.IntExpression2;
import io.graphoenix.core.dto.annotation.StringExpression2;
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
public @interface UserExpression1 {
  StringExpression2 id() default @StringExpression2;

  StringExpression2 name() default @StringExpression2;

  StringExpression2 description() default @StringExpression2;

  StringExpression2 lastName() default @StringExpression2;

  StringExpression2 login() default @StringExpression2;

  StringExpression2 salt() default @StringExpression2;

  StringExpression2 hash() default @StringExpression2;

  StringExpression2 email() default @StringExpression2;

  StringExpression2 phones() default @StringExpression2;

  BooleanExpression2 disable() default @BooleanExpression2;

  GroupExpression2 groups() default @GroupExpression2;

  RoleExpression2 roles() default @RoleExpression2;

  RealmExpression2 realm() default @RealmExpression2;

  boolean includeDeprecated() default false;

  IntExpression2 version() default @IntExpression2;

  IntExpression2 realmId() default @IntExpression2;

  StringExpression2 createUserId() default @StringExpression2;

  StringExpression2 createTime() default @StringExpression2;

  StringExpression2 updateUserId() default @StringExpression2;

  StringExpression2 updateTime() default @StringExpression2;

  StringExpression2 createGroupId() default @StringExpression2;

  StringExpression2 __typename() default @StringExpression2;

  UserPhonesRelationExpression2 userPhonesRelation() default @UserPhonesRelationExpression2;

  GroupUserRelationExpression2 groupUserRelation() default @GroupUserRelationExpression2;

  RoleUserRelationExpression2 roleUserRelation() default @RoleUserRelationExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  UserExpression2[] exs() default {};

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

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
