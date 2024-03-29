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

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionTypeExpression2 {
  Operator opr() default Operator.EQ;

  PermissionType val() default PermissionType.READ;

  PermissionType[] arr() default {};

  String $opr() default "";

  String $val() default "";

  String $arr() default "";
}
