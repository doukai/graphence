package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import io.graphoenix.file.dto.annotation.FileOrderBy;
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
public @interface UserOrderBy {
  /**
   * ID
   */
  @Description("ID")
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
  GroupOrderBy1 groups() default @GroupOrderBy1;

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
   * file
   */
  @Description("file")
  FileOrderBy file() default @FileOrderBy;

  /**
   * files
   */
  @Description("files")
  FileOrderBy files() default @FileOrderBy;

  /**
   * booleanList
   */
  @Description("booleanList")
  Sort booleanList() default Sort.ASC;

  /**
   * intList
   */
  @Description("intList")
  Sort intList() default Sort.ASC;

  /**
   * typeList
   */
  @Description("typeList")
  Sort typeList() default Sort.ASC;

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
   * 用户 文件 关系
   */
  @Description("用户 文件 关系")
  FileUserRelationOrderBy1 fileUserRelation() default @FileUserRelationOrderBy1;

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  UserPhonesRelationOrderBy1 userPhonesRelation() default @UserPhonesRelationOrderBy1;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationOrderBy1 groupUserRelation() default @GroupUserRelationOrderBy1;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationOrderBy1 roleUserRelation() default @RoleUserRelationOrderBy1;

  /**
   * 用户 booleanList 关系
   */
  @Description("用户 booleanList 关系")
  UserBooleanListRelationOrderBy1 userBooleanListRelation(
      ) default @UserBooleanListRelationOrderBy1;

  /**
   * 用户 intList 关系
   */
  @Description("用户 intList 关系")
  UserIntListRelationOrderBy1 userIntListRelation() default @UserIntListRelationOrderBy1;

  /**
   * 用户 typeList 关系
   */
  @Description("用户 typeList 关系")
  UserTypeListRelationOrderBy1 userTypeListRelation() default @UserTypeListRelationOrderBy1;

  /**
   * 组 统计字段
   */
  @Description("组 统计字段")
  GroupOrderBy1 groupsAggregate() default @GroupOrderBy1;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  RoleOrderBy1 rolesAggregate() default @RoleOrderBy1;

  /**
   * 用户 手机号 关系 统计字段
   */
  @Description("用户 手机号 关系 统计字段")
  UserPhonesRelationOrderBy1 userPhonesRelationAggregate() default @UserPhonesRelationOrderBy1;

  /**
   * 用户 组 关系 统计字段
   */
  @Description("用户 组 关系 统计字段")
  GroupUserRelationOrderBy1 groupUserRelationAggregate() default @GroupUserRelationOrderBy1;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  RoleUserRelationOrderBy1 roleUserRelationAggregate() default @RoleUserRelationOrderBy1;

  /**
   * 用户 booleanList 关系 统计字段
   */
  @Description("用户 booleanList 关系 统计字段")
  UserBooleanListRelationOrderBy1 userBooleanListRelationAggregate(
      ) default @UserBooleanListRelationOrderBy1;

  /**
   * 用户 intList 关系 统计字段
   */
  @Description("用户 intList 关系 统计字段")
  UserIntListRelationOrderBy1 userIntListRelationAggregate() default @UserIntListRelationOrderBy1;

  /**
   * 用户 typeList 关系 统计字段
   */
  @Description("用户 typeList 关系 统计字段")
  UserTypeListRelationOrderBy1 userTypeListRelationAggregate(
      ) default @UserTypeListRelationOrderBy1;

  /**
   * 用户 数量
   */
  @Description("用户 数量")
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

  String $file() default "";

  String $files() default "";

  String $booleanList() default "";

  String $intList() default "";

  String $typeList() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $fileUserRelation() default "";

  String $userPhonesRelation() default "";

  String $groupUserRelation() default "";

  String $roleUserRelation() default "";

  String $userBooleanListRelation() default "";

  String $userIntListRelation() default "";

  String $userTypeListRelation() default "";

  String $groupsAggregate() default "";

  String $rolesAggregate() default "";

  String $userPhonesRelationAggregate() default "";

  String $groupUserRelationAggregate() default "";

  String $roleUserRelationAggregate() default "";

  String $userBooleanListRelationAggregate() default "";

  String $userIntListRelationAggregate() default "";

  String $userTypeListRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

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
