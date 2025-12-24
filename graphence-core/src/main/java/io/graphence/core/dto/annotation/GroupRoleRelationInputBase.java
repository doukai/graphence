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
 * Mutation Input for Relationship Object between 角色 and 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Input for Relationship Object between 角色 and 组")
public @interface GroupRoleRelationInputBase {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  String roleRef() default "";

  /**
   * 角色
   */
  @Description("角色")
  RoleInput1 role() default @RoleInput1;

  /**
   * 组 Reference
   */
  @Description("组 Reference")
  String groupRef() default "";

  /**
   * 组
   */
  @Description("组")
  GroupInput1 group() default @GroupInput1;

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
  String __typename() default "GroupRoleRelation";

  /**
   * Where
   */
  @Description("Where")
  GroupRoleRelationExpression1 where() default @GroupRoleRelationExpression1;

  String $id() default "";

  String $roleRef() default "";

  String $role() default "";

  String $groupRef() default "";

  String $group() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $where() default "";
}
