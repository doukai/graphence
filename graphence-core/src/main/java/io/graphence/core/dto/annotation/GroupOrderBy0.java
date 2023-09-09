package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GroupOrderBy0 {
  Sort id() default Sort.ASC;

  Sort name() default Sort.ASC;

  Sort path() default Sort.ASC;

  Sort deep() default Sort.ASC;

  Sort isDeprecated() default Sort.ASC;

  Sort version() default Sort.ASC;

  Sort realmId() default Sort.ASC;

  Sort createUserId() default Sort.ASC;

  Sort createTime() default Sort.ASC;

  Sort updateUserId() default Sort.ASC;

  Sort updateTime() default Sort.ASC;

  Sort createGroupId() default Sort.ASC;

  Sort __typename() default Sort.ASC;

  Sort parentId() default Sort.ASC;

  GroupOrderBy1 parent() default @GroupOrderBy1;

  GroupOrderBy1 subGroups() default @GroupOrderBy1;

  UserOrderBy1 users() default @UserOrderBy1;

  RoleOrderBy1 roles() default @RoleOrderBy1;

  RealmOrderBy1 realm() default @RealmOrderBy1;

  UserGroupOrderBy1 userGroup() default @UserGroupOrderBy1;

  GroupRoleOrderBy1 groupRole() default @GroupRoleOrderBy1;
}
