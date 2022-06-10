package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Operator;
import io.graphoenix.graphence.dto.enumType.__DirectiveLocation;
import io.graphoenix.spi.annotation.TypeExpression;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeExpression
public @interface __DirectiveExpression2 {
  Operator opr() default Operator.EQ;

  String[] name() default {};

  int[] schemaId() default {};

  String[] description() default {};

  __DirectiveLocation[] locations() default {};

  boolean[] onOperation() default {};

  boolean[] onFragment() default {};

  boolean[] onField() default {};

  boolean[] isDeprecated() default {};

  int[] version() default {};

  String[] realmId() default {};

  String[] createUserId() default {};

  String[] createTime() default {};

  String[] updateUserId() default {};

  String[] updateTime() default {};

  String[] createGroupId() default {};

  String[] __typename() default {};

  String[] $name() default {};

  String[] $schemaId() default {};

  String[] $description() default {};

  String[] $locations() default {};

  String[] $onOperation() default {};

  String[] $onFragment() default {};

  String[] $onField() default {};

  String[] $isDeprecated() default {};

  String[] $version() default {};

  String[] $realmId() default {};

  String[] $createUserId() default {};

  String[] $createTime() default {};

  String[] $updateUserId() default {};

  String[] $updateTime() default {};

  String[] $createGroupId() default {};

  String[] $__typename() default {};
}
