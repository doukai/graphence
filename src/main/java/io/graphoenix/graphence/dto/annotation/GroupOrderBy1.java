package io.graphoenix.graphence.dto.annotation;

import io.graphoenix.graphence.dto.enumType.Sort;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GroupOrderBy1 {
  Sort id() default Sort.ASC;

  Sort name() default Sort.ASC;

  Sort parentId() default Sort.ASC;

  Sort isDeprecated() default Sort.ASC;

  Sort version() default Sort.ASC;

  Sort realmId() default Sort.ASC;

  Sort createUserId() default Sort.ASC;

  Sort createTime() default Sort.ASC;

  Sort updateUserId() default Sort.ASC;

  Sort updateTime() default Sort.ASC;

  Sort createGroupId() default Sort.ASC;

  Sort __typename() default Sort.ASC;

  GroupOrderBy2 parent() default @GroupOrderBy2;

  GroupOrderBy2 subGroups() default @GroupOrderBy2;

  UserOrderBy2 users() default @UserOrderBy2;

  RoleOrderBy2 roles() default @RoleOrderBy2;

  RealmOrderBy2 realm() default @RealmOrderBy2;
}
