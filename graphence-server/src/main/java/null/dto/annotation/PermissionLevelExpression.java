package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.Operator;
import null.dto.enumType.PermissionLevel;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionLevelExpression {
  Operator opr() default Operator.EQ;

  PermissionLevel val() default PermissionLevel.READ;

  PermissionLevel[] in() default {};

  String $val() default "";

  String $in() default "";
}
