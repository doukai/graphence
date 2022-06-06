package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.__TypeKind;
import io.graphoenix.spi.annotation.TypeInput;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@TypeInput
public @interface __TypeInput1 {
  String name() default "";

  int schemaId() default 0;

  __TypeKind kind() default __TypeKind.SCALAR;

  String description() default "";

  String ofTypeName() default "";

  int version() default 0;

  boolean isDeprecated() default false;

  String __typename() default "";

  String $name() default "";

  String $schemaId() default "";

  String $kind() default "";

  String $description() default "";

  String $fields() default "";

  String $interfaces() default "";

  String $possibleTypes() default "";

  String $enumValues() default "";

  String $inputFields() default "";

  String $ofTypeName() default "";

  String $ofType() default "";

  String $version() default "";

  String $isDeprecated() default "";

  String $__typename() default "";

  String $fieldsAggregate() default "";

  String $interfacesAggregate() default "";

  String $possibleTypesAggregate() default "";

  String $enumValuesAggregate() default "";

  String $inputFieldsAggregate() default "";

  String $fieldsConnection() default "";

  String $interfacesConnection() default "";

  String $possibleTypesConnection() default "";

  String $enumValuesConnection() default "";

  String $inputFieldsConnection() default "";

  __FieldInput2[] fields() default {};

  __TypeInput2[] interfaces() default {};

  __TypeInput2[] possibleTypes() default {};

  __EnumValueInput2[] enumValues() default {};

  __InputValueInput2[] inputFields() default {};

  __TypeInput2 ofType() default @__TypeInput2;

  __FieldInput2 fieldsAggregate() default @__FieldInput2;

  __TypeInput2 interfacesAggregate() default @__TypeInput2;

  __TypeInput2 possibleTypesAggregate() default @__TypeInput2;

  __EnumValueInput2 enumValuesAggregate() default @__EnumValueInput2;

  __InputValueInput2 inputFieldsAggregate() default @__InputValueInput2;

  __FieldConnectionInput2 fieldsConnection() default @__FieldConnectionInput2;

  __TypeConnectionInput2 interfacesConnection() default @__TypeConnectionInput2;

  __TypeConnectionInput2 possibleTypesConnection() default @__TypeConnectionInput2;

  __EnumValueConnectionInput2 enumValuesConnection() default @__EnumValueConnectionInput2;

  __InputValueConnectionInput2 inputFieldsConnection() default @__InputValueConnectionInput2;
}
