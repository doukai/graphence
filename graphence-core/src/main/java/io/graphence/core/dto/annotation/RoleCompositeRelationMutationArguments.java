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
public @interface RoleCompositeRelationMutationArguments {
  String id() default "";

  String roleRef() default "";

  RoleInput1 role() default @RoleInput1;

  String compositeRef() default "";

  RoleInput1 composite() default @RoleInput1;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "RoleCompositeRelation";

  RoleCompositeRelationInput1 input() default @RoleCompositeRelationInput1;

  RoleCompositeRelationExpression1 where() default @RoleCompositeRelationExpression1;

  String $id() default "";

  String $roleRef() default "";

  String $role() default "";

  String $compositeRef() default "";

  String $composite() default "";

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
