package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.__TypeKind;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __TypeInput0 {
  String name() default "";

  String description() default "";

  int schemaId() default 0;

  __TypeKind kind() default __TypeKind.LIST;

  String ofTypeName() default "";

  String createUserId() default "";

  String updateUserId() default "";

  String createTime() default "";

  boolean isDeprecated() default false;

  String updateTime() default "";

  String realmId() default "";

  int version() default 0;

  String createGroupId() default "";

  String __typename() default "";

  String $name() default "";

  String $possibleTypes() default "";

  String $description() default "";

  String $enumValues() default "";

  String $ofType() default "";

  String $schemaId() default "";

  String $fields() default "";

  String $interfaces() default "";

  String $kind() default "";

  String $inputFields() default "";

  String $ofTypeName() default "";

  String $createUserId() default "";

  String $updateUserId() default "";

  String $createTime() default "";

  String $isDeprecated() default "";

  String $updateTime() default "";

  String $realmId() default "";

  String $version() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $possibleTypesAggregate() default "";

  String $enumValuesAggregate() default "";

  String $fieldsAggregate() default "";

  String $interfacesAggregate() default "";

  String $inputFieldsAggregate() default "";

  String $possibleTypesConnection() default "";

  String $enumValuesConnection() default "";

  String $fieldsConnection() default "";

  String $interfacesConnection() default "";

  String $inputFieldsConnection() default "";
}
