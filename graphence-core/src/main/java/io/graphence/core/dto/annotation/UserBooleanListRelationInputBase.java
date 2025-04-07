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
 * 用户 booleanList 关系 变更内容
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("用户 booleanList 关系 变更内容")
public @interface UserBooleanListRelationInputBase {
  /**
   * ID
   */
  @Description("ID")
  String id() default "";

  /**
   * 用户 引用
   */
  @Description("用户 引用")
  String userRef() default "";

  /**
   * 用户
   */
  @Description("用户")
  UserInput1 user() default @UserInput1;

  /**
   * booleanList 引用
   */
  @Description("booleanList 引用")
  boolean booleanListRef() default false;

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
  String __typename() default "UserBooleanListRelation";

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  UserBooleanListRelationExpression1 where() default @UserBooleanListRelationExpression1;

  String $id() default "";

  String $userRef() default "";

  String $user() default "";

  String $booleanListRef() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $where() default "";
}
