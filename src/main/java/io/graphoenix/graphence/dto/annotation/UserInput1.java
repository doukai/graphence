package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.spi.annotation.TypeInput;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeInput
public @interface UserInput1 {
  String id() default "";

  String name() default "";

  String login() default "";

  String password() default "";

  boolean disable() default false;

  int organizationId() default 0;

  String domainId() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createOrganizationId() default "";

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $login() default "";

  String $password() default "";

  String $disable() default "";

  String $organizationId() default "";

  String $organization() default "";

  String $roles() default "";

  String $domainId() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createOrganizationId() default "";

  String $__typename() default "";

  String $rolesAggregate() default "";

  String $rolesConnection() default "";

  OrganizationInput2 organization() default @OrganizationInput2;

  RoleInput2[] roles() default {};

  RoleInput2 rolesAggregate() default @RoleInput2;

  RoleConnectionInput2 rolesConnection() default @RoleConnectionInput2;
}
