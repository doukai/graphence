package io.graphoenix.graphence.dto.directive;

import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Name;

@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Validation {
  int minLength();

  int maxLength();

  String pattern();

  String format();

  String contentMediaType();

  String contentEncoding();

  float minimum();

  float exclusiveMinimum();

  float maximum();

  float exclusiveMaximum();

  float multipleOf();

  @Name("const")
  String _const();

  @Name("enum")
  String[] _enum();

  int minItems();

  int maxItems();

  boolean uniqueItems();
}
