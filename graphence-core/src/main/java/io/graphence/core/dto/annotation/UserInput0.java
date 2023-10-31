package io.graphence.core.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface UserInput0 {
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

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  boolean syncUserPolicy() default false;

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

  String $groupsAggregate() default "";

  String $groupsConnection() default "";

  String $rolesAggregate() default "";

  String $rolesConnection() default "";

  String $userPhones() default "";

  String $userPhonesAggregate() default "";

  String $userPhonesConnection() default "";

  String $userGroup() default "";

  String $userGroupAggregate() default "";

  String $userGroupConnection() default "";

  String $userRole() default "";

  String $userRoleAggregate() default "";

  String $userRoleConnection() default "";

  String $syncUserPolicy() default "";

  GroupInput1[] groups() default {};

  RoleInput1[] roles() default {};

  RealmInput1 realm() default @RealmInput1;

  UserPhonesInput1[] userPhones() default {};

  UserGroupInput1[] userGroup() default {};

  UserRoleInput1[] userRole() default {};

  UserInput1[] list() default {};

  String $list() default "";
}
