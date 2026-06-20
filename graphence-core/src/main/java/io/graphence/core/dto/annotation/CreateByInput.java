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
 * Mutation Input for 数据归属
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation Input for 数据归属")
public @interface CreateByInput {
  /**
   * 创建用户ID
   */
  @Description("创建用户ID")
  String createUserId() default "";

  /**
   * 创建组ID
   */
  @Description("创建组ID")
  String createGroupId() default "";

  /**
   * id
   */
  @Description("id")
  String id() default "";

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  boolean isDeprecated() default false;

  /**
   * Version
   */
  @Description("Version")
  int version() default 0;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  int realmId() default 0;

  /**
   * Create Time
   */
  @Description("Create Time")
  String createTime() default "";

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId() default "";

  /**
   * Update Time
   */
  @Description("Update Time")
  String updateTime() default "";

  String $createUserId() default "";

  String $createGroupId() default "";

  String $id() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";
}
