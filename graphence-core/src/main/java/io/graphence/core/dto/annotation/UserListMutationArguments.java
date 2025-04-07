package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.file.dto.annotation.FileInput;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 用户列表 变更参数 
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户列表 变更参数 ")
public @interface UserListMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 姓名
   */
  @Description("姓名")
  String name() default "";

  /**
   * 描述
   */
  @Description("描述")
  String description() default "";

  /**
   * 姓氏
   */
  @Description("姓氏")
  String lastName() default "";

  /**
   * 账号
   */
  @Description("账号")
  String login() default "";

  /**
   * 盐
   */
  @Description("盐")
  String salt() default "";

  /**
   * 哈希
   */
  @Description("哈希")
  String hash() default "";

  /**
   * 邮箱
   */
  @Description("邮箱")
  String email() default "";

  /**
   * 手机号
   */
  @Description("手机号")
  String[] phones() default {};

  /**
   * 禁用
   */
  @Description("禁用")
  boolean disable() default false;

  /**
   * 组
   */
  @Description("组")
  GroupInput[] groups() default {};

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
   * file
   */
  @Description("file")
  FileInput file() default @FileInput;

  /**
   * files
   */
  @Description("files")
  FileInput[] files() default {};

  /**
   * booleanList
   */
  @Description("booleanList")
  boolean[] booleanList() default {};

  /**
   * intList
   */
  @Description("intList")
  int[] intList() default {};

  /**
   * typeList
   */
  @Description("typeList")
  PermissionType[] typeList() default {};

  /**
   * 已移除
   */
  @Description("已移除")
  boolean isDeprecated() default false;

  /**
   * 版本
   */
  @Description("版本")
  int version() default 0;

  /**
   * 域
   */
  @Description("域")
  int realmId() default 0;

  /**
   * 创建者
   */
  @Description("创建者")
  String createUserId() default "";

  /**
   * 创建时间
   */
  @Description("创建时间")
  String createTime() default "";

  /**
   * 更新者
   */
  @Description("更新者")
  String updateUserId() default "";

  /**
   * 更新时间
   */
  @Description("更新时间")
  String updateTime() default "";

  /**
   * 创建组
   */
  @Description("创建组")
  String createGroupId() default "";

  /**
   * 所属类型
   */
  @Description("所属类型")
  String __typename() default "User";

  /**
   * 用户 文件 关系
   */
  @Description("用户 文件 关系")
  FileUserRelationInput[] fileUserRelation() default {};

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  UserPhonesRelationInput[] userPhonesRelation() default {};

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationInput[] groupUserRelation() default {};

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationInput[] roleUserRelation() default {};

  /**
   * 用户 booleanList 关系
   */
  @Description("用户 booleanList 关系")
  UserBooleanListRelationInput[] userBooleanListRelation() default {};

  /**
   * 用户 intList 关系
   */
  @Description("用户 intList 关系")
  UserIntListRelationInput[] userIntListRelation() default {};

  /**
   * 用户 typeList 关系
   */
  @Description("用户 typeList 关系")
  UserTypeListRelationInput[] userTypeListRelation() default {};

  /**
   * 变更内容列表
   */
  @Description("变更内容列表")
  UserInput[] list() default {};

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  UserExpression where() default @UserExpression;

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

  String $list() default "";

  String $where() default "";
}
