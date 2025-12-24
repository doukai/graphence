package io.graphence.core.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation Input for 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Input for 用户")
public @interface UserInput1 {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 姓名
   */
  @Description("姓名")
  String name() default "";

  /**
   * 描述
   */
  @Description("描述")
  String description() default "";

  /**
   * 姓氏
   */
  @Description("姓氏")
  String lastName() default "";

  /**
   * 账号
   */
  @Description("账号")
  String login() default "";

  /**
   * 盐
   */
  @Description("盐")
  String salt() default "";

  /**
   * 哈希
   */
  @Description("哈希")
  String hash() default "";

  /**
   * 邮箱
   */
  @Description("邮箱")
  String email() default "";

  /**
   * 手机号
   */
  @Description("手机号")
  String[] phones() default {};

  /**
   * 禁用
   */
  @Description("禁用")
  boolean disable() default false;

  /**
   * 组
   */
  @Description("组")
  GroupInput2[] groups() default {};

  /**
   * 角色
   */
  @Description("角色")
  RoleInput2[] roles() default {};

  /**
   * 租户
   */
  @Description("租户")
  RealmInput2 realm() default @RealmInput2;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  boolean isDeprecated() default false;

  /**
   * Version
   */
  @Description("Version")
  int version() default 0;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  int realmId() default 0;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId() default "";

  /**
   * Create Time
   */
  @Description("Create Time")
  String createTime() default "";

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId() default "";

  /**
   * Update Time
   */
  @Description("Update Time")
  String updateTime() default "";

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId() default "";

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename() default "User";

  /**
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  UserPhonesRelationInput2[] userPhonesRelation() default {};

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationInput2[] groupUserRelation() default {};

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationInput2[] roleUserRelation() default {};

  /**
   * Where
   */
  @Description("Where")
  UserExpression2 where() default @UserExpression2;

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

  String $where() default "";
}
