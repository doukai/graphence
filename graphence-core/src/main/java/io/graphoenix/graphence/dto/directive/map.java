package io.graphoenix.graphence.dto.directive;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD})
public @interface map {
  String from();

  boolean anchor();

  MapWith with();

  String to();
}
