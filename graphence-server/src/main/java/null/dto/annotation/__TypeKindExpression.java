package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.Operator;
import null.dto.enumType.__TypeKind;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __TypeKindExpression {
  Operator opr() default Operator.EQ;

  __TypeKind val() default __TypeKind.LIST;

  __TypeKind[] in() default {};

  String $val() default "";

  String $in() default "";
}
