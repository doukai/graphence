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
 * Order Input for Relationship Object between 角色 and 组
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Order Input for Relationship Object between 角色 and 组")
public @interface GroupRoleRelationOrderBy {
  /**
   * ID
   */
  @Description("ID")
  Sort id() default Sort.ASC;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  Sort roleRef() default Sort.ASC;

  /**
   * 组 Reference
   */
  @Description("组 Reference")
  Sort groupRef() default Sort.ASC;

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
   * Count of Relationship Object between 角色 and 组
   */
  @Description("Count of Relationship Object between 角色 and 组")
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
   * Count of 角色 Reference
   */
  @Description("Count of 角色 Reference")
  Sort roleRefCount() default Sort.ASC;

  /**
   * Max of 角色 Reference
   */
  @Description("Max of 角色 Reference")
  Sort roleRefMax() default Sort.ASC;

  /**
   * Min of 角色 Reference
   */
  @Description("Min of 角色 Reference")
  Sort roleRefMin() default Sort.ASC;

  /**
   * Count of 组 Reference
   */
  @Description("Count of 组 Reference")
  Sort groupRefCount() default Sort.ASC;

  /**
   * Max of 组 Reference
   */
  @Description("Max of 组 Reference")
  Sort groupRefMax() default Sort.ASC;

  /**
   * Min of 组 Reference
   */
  @Description("Min of 组 Reference")
  Sort groupRefMin() default Sort.ASC;

  String $id() default "";

  String $roleRef() default "";

  String $groupRef() default "";

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

  String $roleRefCount() default "";

  String $roleRefMax() default "";

  String $roleRefMin() default "";

  String $groupRefCount() default "";

  String $groupRefMax() default "";

  String $groupRefMin() default "";
}
