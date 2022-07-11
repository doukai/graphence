package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.Operator;
import null.dto.enumType.__DirectiveLocation;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __DirectiveLocationExpression {
  Operator opr() default Operator.EQ;

  __DirectiveLocation val() default __DirectiveLocation.ENUM_VALUE;

  __DirectiveLocation[] in() default {};

  String $val() default "";

  String $in() default "";
}
