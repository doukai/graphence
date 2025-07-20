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
 * 角色 排序
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("角色 排序")
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
  RealmOrderBy realm() default @RealmOrderBy;

  /**
   * 已移除
   */
  @Description("已移除")
  Sort isDeprecated() default Sort.ASC;

  /**
   * 版本
   */
  @Description("版本")
  Sort version() default Sort.ASC;

  /**
   * 域
   */
  @Description("域")
  Sort realmId() default Sort.ASC;

  /**
   * 创建者
   */
  @Description("创建者")
  Sort createUserId() default Sort.ASC;

  /**
   * 创建时间
   */
  @Description("创建时间")
  Sort createTime() default Sort.ASC;

  /**
   * 更新者
   */
  @Description("更新者")
  Sort updateUserId() default Sort.ASC;

  /**
   * 更新时间
   */
  @Description("更新时间")
  Sort updateTime() default Sort.ASC;

  /**
   * 创建组
   */
  @Description("创建组")
  Sort createGroupId() default Sort.ASC;

  /**
   * 所属类型
   */
  @Description("所属类型")
  Sort __typename() default Sort.ASC;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationOrderBy2 roleUserRelation() default @RoleUserRelationOrderBy2;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationOrderBy2 groupRoleRelation() default @GroupRoleRelationOrderBy2;

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  RoleCompositeRelationOrderBy2 roleCompositeRelation() default @RoleCompositeRelationOrderBy2;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  RolePermissionRelationOrderBy2 rolePermissionRelation() default @RolePermissionRelationOrderBy2;

  /**
   * 用户 统计字段
   */
  @Description("用户 统计字段")
  UserOrderBy2 usersAggregate() default @UserOrderBy2;

  /**
   * 组 统计字段
   */
  @Description("组 统计字段")
  GroupOrderBy2 groupsAggregate() default @GroupOrderBy2;

  /**
   * 组合 统计字段
   */
  @Description("组合 统计字段")
  RoleOrderBy2 compositesAggregate() default @RoleOrderBy2;

  /**
   * 权限 统计字段
   */
  @Description("权限 统计字段")
  PermissionOrderBy2 permissionsAggregate() default @PermissionOrderBy2;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  RoleUserRelationOrderBy2 roleUserRelationAggregate() default @RoleUserRelationOrderBy2;

  /**
   * 角色 组 关系 统计字段
   */
  @Description("角色 组 关系 统计字段")
  GroupRoleRelationOrderBy2 groupRoleRelationAggregate() default @GroupRoleRelationOrderBy2;

  /**
   * 角色 角色 关系 统计字段
   */
  @Description("角色 角色 关系 统计字段")
  RoleCompositeRelationOrderBy2 roleCompositeRelationAggregate(
      ) default @RoleCompositeRelationOrderBy2;

  /**
   * 角色 权限 关系 统计字段
   */
  @Description("角色 权限 关系 统计字段")
  RolePermissionRelationOrderBy2 rolePermissionRelationAggregate(
      ) default @RolePermissionRelationOrderBy2;

  /**
   * 角色 数量
   */
  @Description("角色 数量")
  Sort idCount() default Sort.ASC;

  /**
   * ID 最大值
   */
  @Description("ID 最大值")
  Sort idMax() default Sort.ASC;

  /**
   * ID 最小值
   */
  @Description("ID 最小值")
  Sort idMin() default Sort.ASC;

  /**
   * 名称 数量
   */
  @Description("名称 数量")
  Sort nameCount() default Sort.ASC;

  /**
   * 名称 最大值
   */
  @Description("名称 最大值")
  Sort nameMax() default Sort.ASC;

  /**
   * 名称 最小值
   */
  @Description("名称 最小值")
  Sort nameMin() default Sort.ASC;

  /**
   * 描述 数量
   */
  @Description("描述 数量")
  Sort descriptionCount() default Sort.ASC;

  /**
   * 描述 最大值
   */
  @Description("描述 最大值")
  Sort descriptionMax() default Sort.ASC;

  /**
   * 描述 最小值
   */
  @Description("描述 最小值")
  Sort descriptionMin() default Sort.ASC;

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

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";
}
