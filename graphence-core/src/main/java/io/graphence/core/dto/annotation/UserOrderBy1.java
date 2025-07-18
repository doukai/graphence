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
 * 用户 排序
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户 排序")
public @interface UserOrderBy1 {
  /**
   * id
   */
  @Description("id")
  Sort id() default Sort.ASC;

  /**
   * 姓名
   */
  @Description("姓名")
  Sort name() default Sort.ASC;

  /**
   * 描述
   */
  @Description("描述")
  Sort description() default Sort.ASC;

  /**
   * 姓氏
   */
  @Description("姓氏")
  Sort lastName() default Sort.ASC;

  /**
   * 账号
   */
  @Description("账号")
  Sort login() default Sort.ASC;

  /**
   * 盐
   */
  @Description("盐")
  Sort salt() default Sort.ASC;

  /**
   * 哈希
   */
  @Description("哈希")
  Sort hash() default Sort.ASC;

  /**
   * 邮箱
   */
  @Description("邮箱")
  Sort email() default Sort.ASC;

  /**
   * 手机号
   */
  @Description("手机号")
  Sort phones() default Sort.ASC;

  /**
   * 禁用
   */
  @Description("禁用")
  Sort disable() default Sort.ASC;

  /**
   * 组
   */
  @Description("组")
  GroupOrderBy2 groups() default @GroupOrderBy2;

  /**
   * 角色
   */
  @Description("角色")
  RoleOrderBy2 roles() default @RoleOrderBy2;

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
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  UserPhonesRelationOrderBy2 userPhonesRelation() default @UserPhonesRelationOrderBy2;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationOrderBy2 groupUserRelation() default @GroupUserRelationOrderBy2;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationOrderBy2 roleUserRelation() default @RoleUserRelationOrderBy2;

  /**
   * 组 统计字段
   */
  @Description("组 统计字段")
  GroupOrderBy2 groupsAggregate() default @GroupOrderBy2;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  RoleOrderBy2 rolesAggregate() default @RoleOrderBy2;

  /**
   * 用户 手机号 关系 统计字段
   */
  @Description("用户 手机号 关系 统计字段")
  UserPhonesRelationOrderBy2 userPhonesRelationAggregate() default @UserPhonesRelationOrderBy2;

  /**
   * 用户 组 关系 统计字段
   */
  @Description("用户 组 关系 统计字段")
  GroupUserRelationOrderBy2 groupUserRelationAggregate() default @GroupUserRelationOrderBy2;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  RoleUserRelationOrderBy2 roleUserRelationAggregate() default @RoleUserRelationOrderBy2;

  /**
   * 姓名 数量
   */
  @Description("姓名 数量")
  Sort nameCount() default Sort.ASC;

  /**
   * 姓名 最大值
   */
  @Description("姓名 最大值")
  Sort nameMax() default Sort.ASC;

  /**
   * 姓名 最小值
   */
  @Description("姓名 最小值")
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
   * 姓氏 数量
   */
  @Description("姓氏 数量")
  Sort lastNameCount() default Sort.ASC;

  /**
   * 姓氏 最大值
   */
  @Description("姓氏 最大值")
  Sort lastNameMax() default Sort.ASC;

  /**
   * 姓氏 最小值
   */
  @Description("姓氏 最小值")
  Sort lastNameMin() default Sort.ASC;

  /**
   * 账号 数量
   */
  @Description("账号 数量")
  Sort loginCount() default Sort.ASC;

  /**
   * 账号 最大值
   */
  @Description("账号 最大值")
  Sort loginMax() default Sort.ASC;

  /**
   * 账号 最小值
   */
  @Description("账号 最小值")
  Sort loginMin() default Sort.ASC;

  /**
   * 盐 数量
   */
  @Description("盐 数量")
  Sort saltCount() default Sort.ASC;

  /**
   * 盐 最大值
   */
  @Description("盐 最大值")
  Sort saltMax() default Sort.ASC;

  /**
   * 盐 最小值
   */
  @Description("盐 最小值")
  Sort saltMin() default Sort.ASC;

  /**
   * 哈希 数量
   */
  @Description("哈希 数量")
  Sort hashCount() default Sort.ASC;

  /**
   * 哈希 最大值
   */
  @Description("哈希 最大值")
  Sort hashMax() default Sort.ASC;

  /**
   * 哈希 最小值
   */
  @Description("哈希 最小值")
  Sort hashMin() default Sort.ASC;

  /**
   * 邮箱 数量
   */
  @Description("邮箱 数量")
  Sort emailCount() default Sort.ASC;

  /**
   * 邮箱 最大值
   */
  @Description("邮箱 最大值")
  Sort emailMax() default Sort.ASC;

  /**
   * 邮箱 最小值
   */
  @Description("邮箱 最小值")
  Sort emailMin() default Sort.ASC;

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

  String $groupsAggregate() default "";

  String $rolesAggregate() default "";

  String $userPhonesRelationAggregate() default "";

  String $groupUserRelationAggregate() default "";

  String $roleUserRelationAggregate() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";

  String $lastNameCount() default "";

  String $lastNameMax() default "";

  String $lastNameMin() default "";

  String $loginCount() default "";

  String $loginMax() default "";

  String $loginMin() default "";

  String $saltCount() default "";

  String $saltMax() default "";

  String $saltMin() default "";

  String $hashCount() default "";

  String $hashMax() default "";

  String $hashMin() default "";

  String $emailCount() default "";

  String $emailMax() default "";

  String $emailMin() default "";
}
