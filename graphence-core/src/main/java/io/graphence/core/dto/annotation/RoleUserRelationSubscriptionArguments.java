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
 * 用户 角色 关系 订阅参数
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户 角色 关系 订阅参数")
public @interface RoleUserRelationSubscriptionArguments {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id() default @StringExpression;

  /**
   * 用户 引用
   */
  @Description("用户 引用")
  StringExpression userRef() default @StringExpression;

  /**
   * 用户
   */
  @Description("用户")
  UserExpression user() default @UserExpression;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  StringExpression roleRef() default @StringExpression;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression role() default @RoleExpression;

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
  RoleUserRelationExpression[] exs() default {};

  String $id() default "";

  String $userRef() default "";

  String $user() default "";

  String $roleRef() default "";

  String $role() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
