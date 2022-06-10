package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Conditional;
import io.graphoenix.spi.annotation.TypeExpressions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeExpressions
public @interface UserGroupConnectionExpressions1 {
  Conditional cond() default Conditional.AND;

  UserGroupConnectionExpression1[] value() default {};
}
