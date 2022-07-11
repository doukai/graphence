package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.Conditional;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GroupExpression0 {
  Conditional cond() default Conditional.AND;

  IDExpression id() default @IDExpression;

  StringExpression name() default @StringExpression;

  IntExpression parentId() default @IntExpression;

  StringExpression createUserId() default @StringExpression;

  StringExpression updateUserId() default @StringExpression;

  StringExpression createTime() default @StringExpression;

  BooleanExpression isDeprecated() default @BooleanExpression;

  StringExpression updateTime() default @StringExpression;

  StringExpression realmId() default @StringExpression;

  IntExpression version() default @IntExpression;

  StringExpression createGroupId() default @StringExpression;

  StringExpression __typename() default @StringExpression;

  String[] groupBy() default {};

  GroupOrderBy0 orderBy() default @GroupOrderBy0;

  int first() default 0;

  String $first() default "";

  int last() default 0;

  String $last() default "";

  int offset() default 0;

  String $offset() default "";

  String after() default "";

  String before() default "";

  String $after() default "";

  String $before() default "";
}
