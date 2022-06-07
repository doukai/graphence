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
public @interface PermissionConnectionInput1 {
  int totalCount() default 0;

  String $totalCount() default "";

  String $pageInfo() default "";

  String $edges() default "";

  PageInfoInput2 pageInfo() default @PageInfoInput2;

  PermissionEdgeInput2[] edges() default {};
}
