package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 权限类型 查询表达式
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("权限类型 查询表达式")
public @interface PermissionTypeExpression {
  /**
   * 条件
   */
  @Description("条件")
  Operator opr() default Operator.EQ;

  /**
   * 值
   */
  @Description("值")
  PermissionType val() default PermissionType.READ;

  /**
   * 组
   */
  @Description("组")
  PermissionType[] arr() default {};

  String $opr() default "";

  String $val() default "";

  String $arr() default "";
}
