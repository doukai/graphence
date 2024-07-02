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
public @interface RoleUserRelationMutationArguments {
  String id() default "";

  String userRef() default "";

  UserInput user() default @UserInput;

  String roleRef() default "";

  RoleInput role() default @RoleInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "RoleUserRelation";

  RoleUserRelationInput input() default @RoleUserRelationInput;

  RoleUserRelationExpression where() default @RoleUserRelationExpression;

  String $id() default "";

  String $userRef() default "";

  String $user() default "";

  String $roleRef() default "";

  String $role() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $input() default "";

  String $where() default "";
}
