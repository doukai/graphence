package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface __FieldInput0 {
  String withTo() default "";

  String id() default "";

  String name() default "";

  String typeName() default "";

  String to() default "";

  String description() default "";

  String from() default "";

  String deprecationReason() default "";

  String withType() default "";

  String withFrom() default "";

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

  String $withTo() default "";

  String $id() default "";

  String $name() default "";

  String $typeName() default "";

  String $to() default "";

  String $description() default "";

  String $from() default "";

  String $ofType() default "";

  String $deprecationReason() default "";

  String $args() default "";

  String $withType() default "";

  String $type() default "";

  String $withFrom() default "";

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

  String $argsAggregate() default "";

  String $argsConnection() default "";
}
