package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Order Input for 角色
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 角色")
public @interface RoleOrderBy1 {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 名称
   */
  @Description("名称")
  Sort name() default Sort.ASC;

  /**
   * 描述
   */
  @Description("描述")
  Sort description() default Sort.ASC;

  /**
   * 用户
   */
  @Description("用户")
  UserOrderBy2 users() default @UserOrderBy2;

  /**
   * 组
   */
  @Description("组")
  GroupOrderBy2 groups() default @GroupOrderBy2;

  /**
   * 组合
   */
  @Description("组合")
  RoleOrderBy2 composites() default @RoleOrderBy2;

  /**
   * 权限
   */
  @Description("权限")
  PermissionOrderBy2 permissions() default @PermissionOrderBy2;

  /**
   * 租户
   */
  @Description("租户")
  RealmOrderBy2 realm() default @RealmOrderBy2;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Sort isDeprecated() default Sort.ASC;

  /**
   * Version
   */
  @Description("Version")
  Sort version() default Sort.ASC;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Sort realmId() default Sort.ASC;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  Sort createUserId() default Sort.ASC;

  /**
   * Create Time
   */
  @Description("Create Time")
  Sort createTime() default Sort.ASC;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  Sort updateUserId() default Sort.ASC;

  /**
   * Update Time
   */
  @Description("Update Time")
  Sort updateTime() default Sort.ASC;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  Sort createGroupId() default Sort.ASC;

  /**
   * Type Name
   */
  @Description("Type Name")
  Sort __typename() default Sort.ASC;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationOrderBy2 roleUserRelation() default @RoleUserRelationOrderBy2;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationOrderBy2 groupRoleRelation() default @GroupRoleRelationOrderBy2;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  RoleCompositeRelationOrderBy2 roleCompositeRelation() default @RoleCompositeRelationOrderBy2;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationOrderBy2 rolePermissionRelation() default @RolePermissionRelationOrderBy2;

  /**
   * Aggregate Field for 用户
   */
  @Description("Aggregate Field for 用户")
  UserOrderBy2 usersAggregate() default @UserOrderBy2;

  /**
   * Aggregate Field for 组
   */
  @Description("Aggregate Field for 组")
  GroupOrderBy2 groupsAggregate() default @GroupOrderBy2;

  /**
   * Aggregate Field for 组合
   */
  @Description("Aggregate Field for 组合")
  RoleOrderBy2 compositesAggregate() default @RoleOrderBy2;

  /**
   * Aggregate Field for 权限
   */
  @Description("Aggregate Field for 权限")
  PermissionOrderBy2 permissionsAggregate() default @PermissionOrderBy2;

  /**
   * Aggregate Field for Relationship Object between 用户 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 角色")
  RoleUserRelationOrderBy2 roleUserRelationAggregate() default @RoleUserRelationOrderBy2;

  /**
   * Aggregate Field for Relationship Object between 角色 and 组
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 组")
  GroupRoleRelationOrderBy2 groupRoleRelationAggregate() default @GroupRoleRelationOrderBy2;

  /**
   * Aggregate Field for Relationship Object between 角色 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 角色")
  RoleCompositeRelationOrderBy2 roleCompositeRelationAggregate(
      ) default @RoleCompositeRelationOrderBy2;

  /**
   * Aggregate Field for Relationship Object between 角色 and 权限
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 权限")
  RolePermissionRelationOrderBy2 rolePermissionRelationAggregate(
      ) default @RolePermissionRelationOrderBy2;

  /**
   * Count of 角色
   */
  @Description("Count of 角色")
  Sort idCount() default Sort.ASC;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  Sort nameCount() default Sort.ASC;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  Sort descriptionCount() default Sort.ASC;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  Sort createTimeYear() default Sort.ASC;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  Sort createTimeMonth() default Sort.ASC;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  Sort createTimeDay() default Sort.ASC;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  Sort createTimeWeek() default Sort.ASC;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  Sort createTimeQuarter() default Sort.ASC;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  Sort updateTimeYear() default Sort.ASC;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  Sort updateTimeMonth() default Sort.ASC;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  Sort updateTimeDay() default Sort.ASC;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  Sort updateTimeWeek() default Sort.ASC;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  Sort updateTimeQuarter() default Sort.ASC;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  RoleOrderBy2[] obs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

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

  String $roleUserRelation() default "";

  String $groupRoleRelation() default "";

  String $roleCompositeRelation() default "";

  String $rolePermissionRelation() default "";

  String $usersAggregate() default "";

  String $groupsAggregate() default "";

  String $compositesAggregate() default "";

  String $permissionsAggregate() default "";

  String $roleUserRelationAggregate() default "";

  String $groupRoleRelationAggregate() default "";

  String $roleCompositeRelationAggregate() default "";

  String $rolePermissionRelationAggregate() default "";

  String $idCount() default "";

  String $nameCount() default "";

  String $descriptionCount() default "";

  String $createTimeYear() default "";

  String $createTimeMonth() default "";

  String $createTimeDay() default "";

  String $createTimeWeek() default "";

  String $createTimeQuarter() default "";

  String $updateTimeYear() default "";

  String $updateTimeMonth() default "";

  String $updateTimeDay() default "";

  String $updateTimeWeek() default "";

  String $updateTimeQuarter() default "";

  String $obs() default "";
}
