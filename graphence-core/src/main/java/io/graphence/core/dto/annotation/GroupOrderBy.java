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
 * 组 排序
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("组 排序")
public @interface GroupOrderBy {
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
   * 路径
   */
  @Description("路径")
  Sort path() default Sort.ASC;

  /**
   * 层级
   */
  @Description("层级")
  Sort deep() default Sort.ASC;

  /**
   * 上级ID
   */
  @Description("上级ID")
  Sort parentId() default Sort.ASC;

  /**
   * 上级
   */
  @Description("上级")
  GroupOrderBy1 parent() default @GroupOrderBy1;

  /**
   * 下级
   */
  @Description("下级")
  GroupOrderBy1 subGroups() default @GroupOrderBy1;

  /**
   * 用户
   */
  @Description("用户")
  UserOrderBy1 users() default @UserOrderBy1;

  /**
   * 角色
   */
  @Description("角色")
  RoleOrderBy1 roles() default @RoleOrderBy1;

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
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationOrderBy1 groupUserRelation() default @GroupUserRelationOrderBy1;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationOrderBy1 groupRoleRelation() default @GroupRoleRelationOrderBy1;

  /**
   * 下级 统计字段
   */
  @Description("下级 统计字段")
  GroupOrderBy1 subGroupsAggregate() default @GroupOrderBy1;

  /**
   * 用户 统计字段
   */
  @Description("用户 统计字段")
  UserOrderBy1 usersAggregate() default @UserOrderBy1;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  RoleOrderBy1 rolesAggregate() default @RoleOrderBy1;

  /**
   * 用户 组 关系 统计字段
   */
  @Description("用户 组 关系 统计字段")
  GroupUserRelationOrderBy1 groupUserRelationAggregate() default @GroupUserRelationOrderBy1;

  /**
   * 角色 组 关系 统计字段
   */
  @Description("角色 组 关系 统计字段")
  GroupRoleRelationOrderBy1 groupRoleRelationAggregate() default @GroupRoleRelationOrderBy1;

  /**
   * 组 数量
   */
  @Description("组 数量")
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

  /**
   * 路径 数量
   */
  @Description("路径 数量")
  Sort pathCount() default Sort.ASC;

  /**
   * 路径 最大值
   */
  @Description("路径 最大值")
  Sort pathMax() default Sort.ASC;

  /**
   * 路径 最小值
   */
  @Description("路径 最小值")
  Sort pathMin() default Sort.ASC;

  /**
   * 上级ID 数量
   */
  @Description("上级ID 数量")
  Sort parentIdCount() default Sort.ASC;

  /**
   * 上级ID 最大值
   */
  @Description("上级ID 最大值")
  Sort parentIdMax() default Sort.ASC;

  /**
   * 上级ID 最小值
   */
  @Description("上级ID 最小值")
  Sort parentIdMin() default Sort.ASC;

  /**
   * 层级 数量
   */
  @Description("层级 数量")
  Sort deepCount() default Sort.ASC;

  /**
   * 层级 合计
   */
  @Description("层级 合计")
  Sort deepSum() default Sort.ASC;

  /**
   * 层级 平均值
   */
  @Description("层级 平均值")
  Sort deepAvg() default Sort.ASC;

  /**
   * 层级 最大值
   */
  @Description("层级 最大值")
  Sort deepMax() default Sort.ASC;

  /**
   * 层级 最小值
   */
  @Description("层级 最小值")
  Sort deepMin() default Sort.ASC;

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

  String $subGroupsAggregate() default "";

  String $usersAggregate() default "";

  String $rolesAggregate() default "";

  String $groupUserRelationAggregate() default "";

  String $groupRoleRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";

  String $pathCount() default "";

  String $pathMax() default "";

  String $pathMin() default "";

  String $parentIdCount() default "";

  String $parentIdMax() default "";

  String $parentIdMin() default "";

  String $deepCount() default "";

  String $deepSum() default "";

  String $deepAvg() default "";

  String $deepMax() default "";

  String $deepMin() default "";
}
