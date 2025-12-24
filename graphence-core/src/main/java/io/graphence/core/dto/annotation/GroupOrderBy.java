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
 * Order Input for 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 组")
public @interface GroupOrderBy {
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
   * 路径
   */
  @Description("路径")
  Sort path() default Sort.ASC;

  /**
   * 层级
   */
  @Description("层级")
  Sort deep() default Sort.ASC;

  /**
   * 上级ID
   */
  @Description("上级ID")
  Sort parentId() default Sort.ASC;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Sort isDeprecated() default Sort.ASC;

  /**
   * Version
   */
  @Description("Version")
  Sort version() default Sort.ASC;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Sort realmId() default Sort.ASC;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  Sort createUserId() default Sort.ASC;

  /**
   * Create Time
   */
  @Description("Create Time")
  Sort createTime() default Sort.ASC;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  Sort updateUserId() default Sort.ASC;

  /**
   * Update Time
   */
  @Description("Update Time")
  Sort updateTime() default Sort.ASC;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  Sort createGroupId() default Sort.ASC;

  /**
   * Type Name
   */
  @Description("Type Name")
  Sort __typename() default Sort.ASC;

  /**
   * Count of 组
   */
  @Description("Count of 组")
  Sort idCount() default Sort.ASC;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  Sort idMax() default Sort.ASC;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  Sort idMin() default Sort.ASC;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  Sort nameCount() default Sort.ASC;

  /**
   * Max of 名称
   */
  @Description("Max of 名称")
  Sort nameMax() default Sort.ASC;

  /**
   * Min of 名称
   */
  @Description("Min of 名称")
  Sort nameMin() default Sort.ASC;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  Sort descriptionCount() default Sort.ASC;

  /**
   * Max of 描述
   */
  @Description("Max of 描述")
  Sort descriptionMax() default Sort.ASC;

  /**
   * Min of 描述
   */
  @Description("Min of 描述")
  Sort descriptionMin() default Sort.ASC;

  /**
   * Count of 路径
   */
  @Description("Count of 路径")
  Sort pathCount() default Sort.ASC;

  /**
   * Max of 路径
   */
  @Description("Max of 路径")
  Sort pathMax() default Sort.ASC;

  /**
   * Min of 路径
   */
  @Description("Min of 路径")
  Sort pathMin() default Sort.ASC;

  /**
   * Count of 上级ID
   */
  @Description("Count of 上级ID")
  Sort parentIdCount() default Sort.ASC;

  /**
   * Max of 上级ID
   */
  @Description("Max of 上级ID")
  Sort parentIdMax() default Sort.ASC;

  /**
   * Min of 上级ID
   */
  @Description("Min of 上级ID")
  Sort parentIdMin() default Sort.ASC;

  /**
   * Count of 层级
   */
  @Description("Count of 层级")
  Sort deepCount() default Sort.ASC;

  /**
   * Sum of 层级
   */
  @Description("Sum of 层级")
  Sort deepSum() default Sort.ASC;

  /**
   * Avg of 层级
   */
  @Description("Avg of 层级")
  Sort deepAvg() default Sort.ASC;

  /**
   * Max of 层级
   */
  @Description("Max of 层级")
  Sort deepMax() default Sort.ASC;

  /**
   * Min of 层级
   */
  @Description("Min of 层级")
  Sort deepMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $path() default "";

  String $deep() default "";

  String $parentId() default "";

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

  String $pathCount() default "";

  String $pathMax() default "";

  String $pathMin() default "";

  String $parentIdCount() default "";

  String $parentIdMax() default "";

  String $parentIdMin() default "";

  String $deepCount() default "";

  String $deepSum() default "";

  String $deepAvg() default "";

  String $deepMax() default "";

  String $deepMin() default "";
}
