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
 * Group Input for 用户
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Group Input for 用户")
public @interface UserGroupBy1 {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  String[] by() default {};

  /**
   * 组
   */
  @Description("组")
  GroupGroupBy2 groups() default @GroupGroupBy2;

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
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  UserPhonesRelationGroupBy2 userPhonesRelation() default @UserPhonesRelationGroupBy2;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  GroupUserRelationGroupBy2 groupUserRelation() default @GroupUserRelationGroupBy2;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationGroupBy2 roleUserRelation() default @RoleUserRelationGroupBy2;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  UserGroupBy2[] gbs() default {};

  String $by() default "";

  String $groups() default "";

  String $roles() default "";

  String $realm() default "";

  String $userPhonesRelation() default "";

  String $groupUserRelation() default "";

  String $roleUserRelation() default "";

  String $gbs() default "";
}
