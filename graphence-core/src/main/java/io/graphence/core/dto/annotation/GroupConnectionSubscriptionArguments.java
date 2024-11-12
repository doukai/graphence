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
 * 组列表 订阅参数
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("组列表 订阅参数")
public @interface GroupConnectionSubscriptionArguments {
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
   * 路径
   */
  @Description("路径")
  StringExpression path() default @StringExpression;

  /**
   * 层级
   */
  @Description("层级")
  IntExpression deep() default @IntExpression;

  /**
   * 上级ID
   */
  @Description("上级ID")
  StringExpression parentId() default @StringExpression;

  /**
   * 上级
   */
  @Description("上级")
  GroupExpression parent() default @GroupExpression;

  /**
   * 下级
   */
  @Description("下级")
  GroupExpression subGroups() default @GroupExpression;

  /**
   * 用户
   */
  @Description("用户")
  UserExpression users() default @UserExpression;

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
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationExpression groupUserRelation() default @GroupUserRelationExpression;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationExpression groupRoleRelation() default @GroupRoleRelationExpression;

  /**
   * 排序
   */
  @Description("排序")
  GroupOrderBy orderBy() default @GroupOrderBy;

  /**
   * 排序
   */
  @Description("排序")
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
  GroupExpression[] exs() default {};

  /**
   * 前...条数
   */
  @Description("前...条数")
  int first() default 0;

  /**
   * 后...条数
   */
  @Description("后...条数")
  int last() default 0;

  /**
   * 偏移条数
   */
  @Description("偏移条数")
  int offset() default 0;

  /**
   * 取...之后
   */
  @Description("取...之后")
  String after() default "";

  /**
   * 取...之前
   */
  @Description("取...之前")
  String before() default "";

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

  String $includeDeprecated() default "";

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

  String $orderBy() default "";

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";

  String $first() default "";

  String $last() default "";

  String $offset() default "";

  String $after() default "";

  String $before() default "";
}
