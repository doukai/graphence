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
 * 角色 组 关系 排序
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("角色 组 关系 排序")
public @interface GroupRoleRelationOrderBy1 {
  /**
   * id
   */
  @Description("id")
  Sort id() default Sort.ASC;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  Sort roleRef() default Sort.ASC;

  /**
   * 角色
   */
  @Description("角色")
  RoleOrderBy2 role() default @RoleOrderBy2;

  /**
   * 组 引用
   */
  @Description("组 引用")
  Sort groupRef() default Sort.ASC;

  /**
   * 组
   */
  @Description("组")
  GroupOrderBy2 group() default @GroupOrderBy2;

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
   * 角色 引用 数量
   */
  @Description("角色 引用 数量")
  Sort roleRefCount() default Sort.ASC;

  /**
   * 角色 引用 最大值
   */
  @Description("角色 引用 最大值")
  Sort roleRefMax() default Sort.ASC;

  /**
   * 角色 引用 最小值
   */
  @Description("角色 引用 最小值")
  Sort roleRefMin() default Sort.ASC;

  /**
   * 组 引用 数量
   */
  @Description("组 引用 数量")
  Sort groupRefCount() default Sort.ASC;

  /**
   * 组 引用 最大值
   */
  @Description("组 引用 最大值")
  Sort groupRefMax() default Sort.ASC;

  /**
   * 组 引用 最小值
   */
  @Description("组 引用 最小值")
  Sort groupRefMin() default Sort.ASC;

  String $id() default "";

  String $roleRef() default "";

  String $role() default "";

  String $groupRef() default "";

  String $group() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $roleRefCount() default "";

  String $roleRefMax() default "";

  String $roleRefMin() default "";

  String $groupRefCount() default "";

  String $groupRefMax() default "";

  String $groupRefMin() default "";
}
