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
 * 角色列表 变更参数 
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("角色列表 变更参数 ")
public @interface RoleListMutationArguments {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 名称
   */
  @Description("名称")
  String name() default "";

  /**
   * 描述
   */
  @Description("描述")
  String description() default "";

  /**
   * 用户
   */
  @Description("用户")
  UserInput[] users() default {};

  /**
   * 组
   */
  @Description("组")
  GroupInput[] groups() default {};

  /**
   * 组合
   */
  @Description("组合")
  RoleInput[] composites() default {};

  /**
   * 权限
   */
  @Description("权限")
  PermissionInput[] permissions() default {};

  /**
   * 租户
   */
  @Description("租户")
  RealmInput realm() default @RealmInput;

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
  String __typename() default "Role";

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationInput[] roleUserRelation() default {};

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationInput[] groupRoleRelation() default {};

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  RoleCompositeRelationInput[] roleCompositeRelation() default {};

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  PermissionRoleRelationInput[] permissionRoleRelation() default {};

  /**
   * 变更内容列表
   */
  @Description("变更内容列表")
  RoleInput[] list() default {};

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  RoleExpression where() default @RoleExpression;

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

  String $permissionRoleRelation() default "";

  String $list() default "";

  String $where() default "";
}
