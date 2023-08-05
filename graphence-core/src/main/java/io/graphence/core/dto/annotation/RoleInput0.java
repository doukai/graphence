package io.graphence.core.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface RoleInput0 {
  String id() default "";

  String name() default "";

  String description() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  String realmId() default "";

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $composites() default "";

  String $permissions() default "";

  String $apis() default "";

  String $menus() default "";

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

  String $usersAggregate() default "";

  String $usersConnection() default "";

  String $compositesAggregate() default "";

  String $compositesConnection() default "";

  String $permissionsAggregate() default "";

  String $permissionsConnection() default "";

  String $apisAggregate() default "";

  String $apisConnection() default "";

  String $menusAggregate() default "";

  String $menusConnection() default "";

  String $userRole() default "";

  String $userRoleAggregate() default "";

  String $userRoleConnection() default "";

  String $roleComposite() default "";

  String $roleCompositeAggregate() default "";

  String $roleCompositeConnection() default "";

  String $roleApi() default "";

  String $roleApiAggregate() default "";

  String $roleApiConnection() default "";

  String $roleMenu() default "";

  String $roleMenuAggregate() default "";

  String $roleMenuConnection() default "";
}
