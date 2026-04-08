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
 * Group Input for 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for 组")
public @interface GroupGroupBy1 {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 上级
   */
  @Description("上级")
  GroupGroupBy2 parent() default @GroupGroupBy2;

  /**
   * 下级
   */
  @Description("下级")
  GroupGroupBy2 subGroups() default @GroupGroupBy2;

  /**
   * 用户
   */
  @Description("用户")
  UserGroupBy2 users() default @UserGroupBy2;

  /**
   * 角色
   */
  @Description("角色")
  RoleGroupBy2 roles() default @RoleGroupBy2;

  /**
   * 租户
   */
  @Description("租户")
  RealmGroupBy2 realm() default @RealmGroupBy2;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationGroupBy2 groupUserRelation() default @GroupUserRelationGroupBy2;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationGroupBy2 groupRoleRelation() default @GroupRoleRelationGroupBy2;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  GroupGroupBy2[] gbs() default {};

  String $by() default "";

  String $parent() default "";

  String $subGroups() default "";

  String $users() default "";

  String $roles() default "";

  String $realm() default "";

  String $groupUserRelation() default "";

  String $groupRoleRelation() default "";

  String $gbs() default "";
}
