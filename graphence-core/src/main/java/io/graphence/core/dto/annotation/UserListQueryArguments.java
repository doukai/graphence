package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.BooleanExpression;
import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.file.dto.annotation.FileExpression;
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
public @interface UserListQueryArguments {
  StringExpression id() default @StringExpression;

  StringExpression name() default @StringExpression;

  StringExpression description() default @StringExpression;

  StringExpression lastName() default @StringExpression;

  StringExpression login() default @StringExpression;

  StringExpression salt() default @StringExpression;

  StringExpression hash() default @StringExpression;

  StringExpression email() default @StringExpression;

  FileExpression avatar() default @FileExpression;

  StringExpression phones() default @StringExpression;

  BooleanExpression disable() default @BooleanExpression;

  GroupExpression groups() default @GroupExpression;

  RoleExpression roles() default @RoleExpression;

  RealmExpression realm() default @RealmExpression;

  boolean includeDeprecated() default false;

  IntExpression version() default @IntExpression;

  IntExpression realmId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  FileUserRelationExpression fileUserRelation() default @FileUserRelationExpression;

  UserPhonesRelationExpression userPhonesRelation() default @UserPhonesRelationExpression;

  GroupUserRelationExpression groupUserRelation() default @GroupUserRelationExpression;

  RoleUserRelationExpression roleUserRelation() default @RoleUserRelationExpression;

  UserOrderBy orderBy() default @UserOrderBy;

  String[] groupBy() default {};

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  UserExpression[] exs() default {};

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

  String $avatar() default "";

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

  String $fileUserRelation() default "";

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
