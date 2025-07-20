package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Conditional;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 角色 查询表达式
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("角色 查询表达式")
public @interface RoleExpression {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id() default @StringExpression;

  /**
   * 名称
   */
  @Description("名称")
  StringExpression name() default @StringExpression;

  /**
   * 描述
   */
  @Description("描述")
  StringExpression description() default @StringExpression;

  /**
   * 用户
   */
  @Description("用户")
  UserExpression1 users() default @UserExpression1;

  /**
   * 组
   */
  @Description("组")
  GroupExpression1 groups() default @GroupExpression1;

  /**
   * 组合
   */
  @Description("组合")
  RoleExpression1 composites() default @RoleExpression1;

  /**
   * 权限
   */
  @Description("权限")
  PermissionExpression1 permissions() default @PermissionExpression1;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression1 realm() default @RealmExpression1;

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
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationExpression1 roleUserRelation() default @RoleUserRelationExpression1;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationExpression1 groupRoleRelation() default @GroupRoleRelationExpression1;

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  RoleCompositeRelationExpression1 roleCompositeRelation(
      ) default @RoleCompositeRelationExpression1;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  RolePermissionRelationExpression1 rolePermissionRelation(
      ) default @RolePermissionRelationExpression1;

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
  RoleExpression1[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

  String $realm() default "";

  String $includeDeprecated() default "";

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

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
