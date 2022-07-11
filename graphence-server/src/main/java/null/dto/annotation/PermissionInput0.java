package null.dto.annotation;

import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import null.dto.enumType.PermissionLevel;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionInput0 {
  String id() default "";

  String roleId() default "";

  String fieldId() default "";

  PermissionLevel level() default PermissionLevel.READ;

  String createUserId() default "";

  String updateUserId() default "";

  String createTime() default "";

  boolean isDeprecated() default false;

  String updateTime() default "";

  String realmId() default "";

  int version() default 0;

  String createGroupId() default "";

  String __typename() default "";

  String $id() default "";

  String $roleId() default "";

  String $role() default "";

  String $fieldId() default "";

  String $field() default "";

  String $level() default "";

  String $realm() default "";

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
