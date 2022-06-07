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
public @interface __FieldConnectionInput0 {
  int totalCount() default 0;

  String $totalCount() default "";

  String $pageInfo() default "";

  String $edges() default "";

  PageInfoInput1 pageInfo() default @PageInfoInput1;

  __FieldEdgeInput1[] edges() default {};
}
