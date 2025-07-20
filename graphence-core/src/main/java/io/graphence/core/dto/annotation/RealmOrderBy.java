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
 * 租户 排序
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("租户 排序")
public @interface RealmOrderBy {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 名称
   */
  @Description("名称")
  Sort name() default Sort.ASC;

  /**
   * 描述
   */
  @Description("描述")
  Sort description() default Sort.ASC;

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
   * 租户 数量
   */
  @Description("租户 数量")
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
   * 名称 数量
   */
  @Description("名称 数量")
  Sort nameCount() default Sort.ASC;

  /**
   * 名称 最大值
   */
  @Description("名称 最大值")
  Sort nameMax() default Sort.ASC;

  /**
   * 名称 最小值
   */
  @Description("名称 最小值")
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

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";
}
