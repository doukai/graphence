package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __InputValueInput0 {
  String typeName() default "";

  String name() default "";

  String description() default "";

  String directiveName() default "";

  String id() default "";

  int fieldId() default 0;

  String ofTypeName() default "";

  String defaultValue() default "";

  String createUserId() default "";

  String updateUserId() default "";

  String createTime() default "";

  boolean isDeprecated() default false;

  String updateTime() default "";

  String realmId() default "";

  int version() default 0;

  String createGroupId() default "";

  String __typename() default "";

  String $typeName() default "";

  String $name() default "";

  String $description() default "";

  String $type() default "";

  String $ofType() default "";

  String $directiveName() default "";

  String $id() default "";

  String $fieldId() default "";

  String $ofTypeName() default "";

  String $defaultValue() default "";

  String $createUserId() default "";

  String $updateUserId() default "";

  String $createTime() default "";

  String $isDeprecated() default "";

  String $updateTime() default "";

  String $realmId() default "";

  String $version() default "";

  String $createGroupId() default "";

  String $__typename() default "";
}
