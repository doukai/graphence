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
public @interface GroupGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 上级
   */
  @Description("上级")
  GroupGroupBy1 parent() default @GroupGroupBy1;

  /**
   * 下级
   */
  @Description("下级")
  GroupGroupBy1 subGroups() default @GroupGroupBy1;

  /**
   * 用户
   */
  @Description("用户")
  UserGroupBy1 users() default @UserGroupBy1;

  /**
   * 角色
   */
  @Description("角色")
  RoleGroupBy1 roles() default @RoleGroupBy1;

  /**
   * 租户
   */
  @Description("租户")
  RealmGroupBy1 realm() default @RealmGroupBy1;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationGroupBy1 groupUserRelation() default @GroupUserRelationGroupBy1;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationGroupBy1 groupRoleRelation() default @GroupRoleRelationGroupBy1;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  GroupGroupBy1[] gbs() default {};

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
