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
  String id() default "";

  String name() default "";

  MenuType type() default MenuType.FOLDER;

  String path() default "";

  String icon() default "";

  String description() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  String realmId() default "";

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "";

  int parentId() default 0;

  int roleId() default 0;

  String $id() default "";

  String $name() default "";

  String $type() default "";

  String $path() default "";

  String $icon() default "";

  String $folder() default "";

  String $description() default "";

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

  String $parentId() default "";

  String $roleId() default "";
}
