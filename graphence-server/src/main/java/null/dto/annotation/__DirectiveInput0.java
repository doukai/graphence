package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.__DirectiveLocation;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __DirectiveInput0 {
  String description() default "";

  boolean onOperation() default false;

  boolean onFragment() default false;

  int schemaId() default 0;

  __DirectiveLocation[] locations() default {};

  boolean onField() default false;

  String name() default "";

  String createUserId() default "";

  String updateUserId() default "";

  String createTime() default "";

  boolean isDeprecated() default false;

  String updateTime() default "";

  String realmId() default "";

  int version() default 0;

  String createGroupId() default "";

  String __typename() default "";

  String $description() default "";

  String $args() default "";

  String $onOperation() default "";

  String $onFragment() default "";

  String $schemaId() default "";

  String $locations() default "";

  String $onField() default "";

  String $name() default "";

  String $createUserId() default "";

  String $updateUserId() default "";

  String $createTime() default "";

  String $isDeprecated() default "";

  String $updateTime() default "";

  String $realmId() default "";

  String $version() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $argsAggregate() default "";

  String $argsConnection() default "";
}
