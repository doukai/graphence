package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.DataPermissionLevel;
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
 * Query Expression Input for 数据权限等级
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Query Expression Input for 数据权限等级")
public @interface DataPermissionLevelExpression {
  /**
   * Operators
   */
  @Description("Operators")
  Operator opr() default Operator.EQ;

  /**
   * Value
   */
  @Description("Value")
  DataPermissionLevel val() default DataPermissionLevel.ALL;

  /**
   * Array
   */
  @Description("Array")
  DataPermissionLevel[] arr() default {};

  String $opr() default "";

  String $val() default "";

  String $arr() default "";
}
