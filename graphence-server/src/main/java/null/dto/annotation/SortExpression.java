package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.Operator;
import null.dto.enumType.Sort;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface SortExpression {
  Operator opr() default Operator.EQ;

  Sort val() default Sort.DESC;

  Sort[] in() default {};

  String $val() default "";

  String $in() default "";
}
