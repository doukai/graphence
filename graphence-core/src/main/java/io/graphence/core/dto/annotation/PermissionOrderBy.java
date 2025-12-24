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
 * Order Input for 权限
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for 权限")
public @interface PermissionOrderBy {
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
   * 字段
   */
  @Description("字段")
  Sort field() default Sort.ASC;

  /**
   * 实体
   */
  @Description("实体")
  Sort type() default Sort.ASC;

  /**
   * 权限类型
   */
  @Description("权限类型")
  Sort permissionType() default Sort.ASC;

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
   * Count of 权限
   */
  @Description("Count of 权限")
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
   * Count of 字段
   */
  @Description("Count of 字段")
  Sort fieldCount() default Sort.ASC;

  /**
   * Max of 字段
   */
  @Description("Max of 字段")
  Sort fieldMax() default Sort.ASC;

  /**
   * Min of 字段
   */
  @Description("Min of 字段")
  Sort fieldMin() default Sort.ASC;

  /**
   * Count of 实体
   */
  @Description("Count of 实体")
  Sort typeCount() default Sort.ASC;

  /**
   * Max of 实体
   */
  @Description("Max of 实体")
  Sort typeMax() default Sort.ASC;

  /**
   * Min of 实体
   */
  @Description("Min of 实体")
  Sort typeMin() default Sort.ASC;

  /**
   * Count of 权限类型
   */
  @Description("Count of 权限类型")
  Sort permissionTypeCount() default Sort.ASC;

  /**
   * Max of 权限类型
   */
  @Description("Max of 权限类型")
  Sort permissionTypeMax() default Sort.ASC;

  /**
   * Min of 权限类型
   */
  @Description("Min of 权限类型")
  Sort permissionTypeMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $field() default "";

  String $type() default "";

  String $permissionType() default "";

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

  String $fieldCount() default "";

  String $fieldMax() default "";

  String $fieldMin() default "";

  String $typeCount() default "";

  String $typeMax() default "";

  String $typeMin() default "";

  String $permissionTypeCount() default "";

  String $permissionTypeMax() default "";

  String $permissionTypeMin() default "";
}
