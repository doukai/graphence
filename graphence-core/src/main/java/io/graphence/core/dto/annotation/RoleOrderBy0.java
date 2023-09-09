package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface RoleOrderBy0 {
  Sort id() default Sort.ASC;

  Sort name() default Sort.ASC;

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

  UserOrderBy1 users() default @UserOrderBy1;

  RoleOrderBy1 composites() default @RoleOrderBy1;

  PermissionOrderBy1 permissions() default @PermissionOrderBy1;

  RealmOrderBy1 realm() default @RealmOrderBy1;

  UserRoleOrderBy1 userRole() default @UserRoleOrderBy1;

  RoleCompositeOrderBy1 roleComposite() default @RoleCompositeOrderBy1;

  RolePermissionOrderBy1 rolePermission() default @RolePermissionOrderBy1;
}
