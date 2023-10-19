package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionOrderBy1 {
  Sort name() default Sort.ASC;

  Sort field() default Sort.ASC;

  Sort type() default Sort.ASC;

  Sort permissionType() default Sort.ASC;

  Sort description() default Sort.ASC;

  Sort isDeprecated() default Sort.ASC;

  Sort version() default Sort.ASC;

  Sort realmId() default Sort.ASC;

  Sort createUserId() default Sort.ASC;

  Sort createTime() default Sort.ASC;

  Sort updateUserId() default Sort.ASC;

  Sort updateTime() default Sort.ASC;

  Sort createGroupId() default Sort.ASC;

  Sort __typename() default Sort.ASC;

  Sort syncPermissionPolicy() default Sort.ASC;
}
