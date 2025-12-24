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
 * Mutation Arguments for 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Arguments for 组")
public @interface GroupMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 名称
   */
  @Description("名称")
  String name() default "";

  /**
   * 描述
   */
  @Description("描述")
  String description() default "";

  /**
   * 路径
   */
  @Description("路径")
  String path() default "";

  /**
   * 层级
   */
  @Description("层级")
  int deep() default 0;

  /**
   * 上级ID
   */
  @Description("上级ID")
  String parentId() default "";

  /**
   * 上级
   */
  @Description("上级")
  GroupInput parent() default @GroupInput;

  /**
   * 下级
   */
  @Description("下级")
  GroupInput[] subGroups() default {};

  /**
   * 用户
   */
  @Description("用户")
  UserInput[] users() default {};

  /**
   * 角色
   */
  @Description("角色")
  RoleInput[] roles() default {};

  /**
   * 租户
   */
  @Description("租户")
  RealmInput realm() default @RealmInput;

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
  String __typename() default "Group";

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationInput[] groupUserRelation() default {};

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationInput[] groupRoleRelation() default {};

  /**
   * Input
   */
  @Description("Input")
  GroupInput input() default @GroupInput;

  /**
   * Where
   */
  @Description("Where")
  GroupExpression where() default @GroupExpression;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $path() default "";

  String $deep() default "";

  String $parentId() default "";

  String $parent() default "";

  String $subGroups() default "";

  String $users() default "";

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

  String $groupUserRelation() default "";

  String $groupRoleRelation() default "";

  String $input() default "";

  String $where() default "";
}
