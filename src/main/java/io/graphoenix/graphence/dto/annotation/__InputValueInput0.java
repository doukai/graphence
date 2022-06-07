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
public @interface __InputValueInput0 {
  String id() default "";

  String name() default "";

  String typeName() default "";

  String ofTypeName() default "";

  int fieldId() default 0;

  String directiveName() default "";

  String description() default "";

  String defaultValue() default "";

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $id() default "";

  String $name() default "";

  String $typeName() default "";

  String $ofTypeName() default "";

  String $fieldId() default "";

  String $directiveName() default "";

  String $description() default "";

  String $type() default "";

  String $defaultValue() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  __TypeInput1 type() default @__TypeInput1;
}
