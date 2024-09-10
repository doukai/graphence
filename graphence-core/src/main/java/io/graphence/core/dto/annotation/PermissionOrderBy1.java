package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PermissionOrderBy1 {
  Sort name() default Sort.ASC;

  Sort description() default Sort.ASC;

  Sort field() default Sort.ASC;

  Sort type() default Sort.ASC;

  Sort permissionType() default Sort.ASC;

  RoleOrderBy2 roles() default @RoleOrderBy2;

  RealmOrderBy realm() default @RealmOrderBy;

  Sort isDeprecated() default Sort.ASC;

  Sort version() default Sort.ASC;

  Sort realmId() default Sort.ASC;

  Sort createUserId() default Sort.ASC;

  Sort createTime() default Sort.ASC;

  Sort updateUserId() default Sort.ASC;

  Sort updateTime() default Sort.ASC;

  Sort createGroupId() default Sort.ASC;

  Sort __typename() default Sort.ASC;

  PermissionRoleRelationOrderBy2 permissionRoleRelation() default @PermissionRoleRelationOrderBy2;

  Sort nameCount() default Sort.ASC;

  Sort nameMax() default Sort.ASC;

  Sort nameMin() default Sort.ASC;

  Sort descriptionCount() default Sort.ASC;

  Sort descriptionMax() default Sort.ASC;

  Sort descriptionMin() default Sort.ASC;

  Sort fieldCount() default Sort.ASC;

  Sort fieldMax() default Sort.ASC;

  Sort fieldMin() default Sort.ASC;

  Sort typeCount() default Sort.ASC;

  Sort typeMax() default Sort.ASC;

  Sort typeMin() default Sort.ASC;

  String $name() default "";

  String $description() default "";

  String $field() default "";

  String $type() default "";

  String $permissionType() default "";

  String $roles() default "";

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

  String $permissionRoleRelation() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";

  String $fieldCount() default "";

  String $fieldMax() default "";

  String $fieldMin() default "";

  String $typeCount() default "";

  String $typeMax() default "";

  String $typeMin() default "";
}
