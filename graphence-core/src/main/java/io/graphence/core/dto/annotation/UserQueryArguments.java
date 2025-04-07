package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.BooleanExpression;
import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.file.dto.annotation.FileExpression;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 用户 查询参数
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户 查询参数")
public @interface UserQueryArguments {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id() default @StringExpression;

  /**
   * 姓名
   */
  @Description("姓名")
  StringExpression name() default @StringExpression;

  /**
   * 描述
   */
  @Description("描述")
  StringExpression description() default @StringExpression;

  /**
   * 姓氏
   */
  @Description("姓氏")
  StringExpression lastName() default @StringExpression;

  /**
   * 账号
   */
  @Description("账号")
  StringExpression login() default @StringExpression;

  /**
   * 盐
   */
  @Description("盐")
  StringExpression salt() default @StringExpression;

  /**
   * 哈希
   */
  @Description("哈希")
  StringExpression hash() default @StringExpression;

  /**
   * 邮箱
   */
  @Description("邮箱")
  StringExpression email() default @StringExpression;

  /**
   * 手机号
   */
  @Description("手机号")
  StringExpression phones() default @StringExpression;

  /**
   * 禁用
   */
  @Description("禁用")
  BooleanExpression disable() default @BooleanExpression;

  /**
   * 组
   */
  @Description("组")
  GroupExpression groups() default @GroupExpression;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression roles() default @RoleExpression;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression realm() default @RealmExpression;

  /**
   * file
   */
  @Description("file")
  FileExpression file() default @FileExpression;

  /**
   * files
   */
  @Description("files")
  FileExpression files() default @FileExpression;

  /**
   * booleanList
   */
  @Description("booleanList")
  BooleanExpression booleanList() default @BooleanExpression;

  /**
   * intList
   */
  @Description("intList")
  IntExpression intList() default @IntExpression;

  /**
   * typeList
   */
  @Description("typeList")
  PermissionTypeExpression typeList() default @PermissionTypeExpression;

  /**
   * 包含已移除
   */
  @Description("包含已移除")
  boolean includeDeprecated() default false;

  /**
   * 版本
   */
  @Description("版本")
  IntExpression version() default @IntExpression;

  /**
   * 域
   */
  @Description("域")
  IntExpression realmId() default @IntExpression;

  /**
   * 创建者
   */
  @Description("创建者")
  StringExpression createUserId() default @StringExpression;

  /**
   * 创建时间
   */
  @Description("创建时间")
  StringExpression createTime() default @StringExpression;

  /**
   * 更新者
   */
  @Description("更新者")
  StringExpression updateUserId() default @StringExpression;

  /**
   * 更新时间
   */
  @Description("更新时间")
  StringExpression updateTime() default @StringExpression;

  /**
   * 创建组
   */
  @Description("创建组")
  StringExpression createGroupId() default @StringExpression;

  /**
   * 所属类型
   */
  @Description("所属类型")
  StringExpression __typename() default @StringExpression;

  /**
   * 用户 文件 关系
   */
  @Description("用户 文件 关系")
  FileUserRelationExpression fileUserRelation() default @FileUserRelationExpression;

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  UserPhonesRelationExpression userPhonesRelation() default @UserPhonesRelationExpression;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationExpression groupUserRelation() default @GroupUserRelationExpression;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationExpression roleUserRelation() default @RoleUserRelationExpression;

  /**
   * 用户 booleanList 关系
   */
  @Description("用户 booleanList 关系")
  UserBooleanListRelationExpression userBooleanListRelation(
      ) default @UserBooleanListRelationExpression;

  /**
   * 用户 intList 关系
   */
  @Description("用户 intList 关系")
  UserIntListRelationExpression userIntListRelation() default @UserIntListRelationExpression;

  /**
   * 用户 typeList 关系
   */
  @Description("用户 typeList 关系")
  UserTypeListRelationExpression userTypeListRelation() default @UserTypeListRelationExpression;

  /**
   * 分组
   */
  @Description("分组")
  String[] groupBy() default {};

  /**
   * 取非
   */
  @Description("取非")
  boolean not() default false;

  /**
   * 与/或
   */
  @Description("与/或")
  Conditional cond() default Conditional.AND;

  /**
   * 查询表达式组
   */
  @Description("查询表达式组")
  UserExpression[] exs() default {};

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

  String $includeDeprecated() default "";

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

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
