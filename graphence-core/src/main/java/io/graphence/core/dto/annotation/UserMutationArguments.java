package io.graphence.core.dto.annotation;

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
public @interface UserMutationArguments {
  String id() default "";

  String name() default "";

  String description() default "";

  String lastName() default "";

  String login() default "";

  String salt() default "";

  String hash() default "";

  String email() default "";

  String[] phones() default {};

  boolean disable() default false;

  GroupInput[] groups() default {};

  RoleInput[] roles() default {};

  RealmInput realm() default @RealmInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "User";

  UserPhonesRelationInput[] userPhonesRelation() default {};

  GroupUserRelationInput[] groupUserRelation() default {};

  RoleUserRelationInput[] roleUserRelation() default {};

  UserInput input() default @UserInput;

  UserExpression where() default @UserExpression;

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

  String $isDeprecated() default "";

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

  String $input() default "";

  String $where() default "";
}
