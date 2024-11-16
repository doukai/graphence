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
 * 组 变更参数
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("组 变更参数")
public @interface GroupMutationArguments {
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
   * 路径
   */
  @Description("路径")
  String path() default "";

  /**
   * 层级
   */
  @Description("层级")
  int deep() default 0;

  /**
   * 上级ID
   */
  @Description("上级ID")
  String parentId() default "";

  /**
   * 上级
   */
  @Description("上级")
  GroupInput parent() default @GroupInput;

  /**
   * 下级
   */
  @Description("下级")
  GroupInput[] subGroups() default {};

  /**
   * 用户
   */
  @Description("用户")
  UserInput[] users() default {};

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
  String __typename() default "\"Group\"";

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationInput[] groupUserRelation() default {};

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationInput[] groupRoleRelation() default {};

  /**
   * 变更内容
   */
  @Description("变更内容")
  GroupInput input() default @GroupInput;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  GroupExpression where() default @GroupExpression;

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

  String $input() default "";

  String $where() default "";
}
