package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.spi.annotation.TypeInput;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeInput
public @interface __FieldInput0 {
  String id() default "";

  String name() default "";

  String typeName() default "";

  String ofTypeName() default "";

  String description() default "";

  String deprecationReason() default "";

  String from() default "";

  String to() default "";

  String withType() default "";

  String withFrom() default "";

  String withTo() default "";

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $typeName() default "";

  String $ofTypeName() default "";

  String $description() default "";

  String $args() default "";

  String $type() default "";

  String $deprecationReason() default "";

  String $from() default "";

  String $to() default "";

  String $withType() default "";

  String $withFrom() default "";

  String $withTo() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  String $argsAggregate() default "";

  String $argsConnection() default "";

  __InputValueInput1[] args() default {};

  __TypeInput1 type() default @__TypeInput1;

  __InputValueInput1 argsAggregate() default @__InputValueInput1;

  __InputValueConnectionInput1 argsConnection() default @__InputValueConnectionInput1;
}
