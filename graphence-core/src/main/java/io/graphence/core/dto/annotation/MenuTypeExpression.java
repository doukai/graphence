package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.MenuType;
import io.graphoenix.core.dto.enumType.Operator;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface MenuTypeExpression {
  Operator opr() default Operator.EQ;

  MenuType val() default MenuType.FOLDER;

  MenuType[] in() default {};

  String $val() default "";

  String $in() default "";
}
