package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.Operator;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface OperatorExpression {
  Operator opr() default Operator.EQ;

  Operator val() default Operator.GTE;

  Operator[] in() default {};

  String $val() default "";

  String $in() default "";
}
