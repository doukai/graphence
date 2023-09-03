package io.graphence.core.dto.annotation;

import io.graphence.core.dto.enumType.MenuType;
import java.lang.String;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface MenuInput0 {
  String href() default "";

  String description() default "";

  MenuType type() default MenuType.MENU;

  String path() default "";

  String icon() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  String parentHref() default "";

  String $href() default "";

  String $description() default "";

  String $type() default "";

  String $path() default "";

  String $icon() default "";

  String $parent() default "";

  String $role() default "";

  String $realm() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $roleAggregate() default "";

  String $roleConnection() default "";

  String $parentHref() default "";

  String $roleMenu() default "";

  String $roleMenuAggregate() default "";

  String $roleMenuConnection() default "";
}
