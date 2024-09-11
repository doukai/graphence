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
public @interface RoleOrderBy {
  Sort id() default Sort.ASC;

  Sort name() default Sort.ASC;

  Sort description() default Sort.ASC;

  UserOrderBy1 users() default @UserOrderBy1;

  GroupOrderBy1 groups() default @GroupOrderBy1;

  RoleOrderBy1 composites() default @RoleOrderBy1;

  PermissionOrderBy1 permissions() default @PermissionOrderBy1;

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

  RoleUserRelationOrderBy1 roleUserRelation() default @RoleUserRelationOrderBy1;

  GroupRoleRelationOrderBy1 groupRoleRelation() default @GroupRoleRelationOrderBy1;

  RoleCompositeRelationOrderBy1 roleCompositeRelation() default @RoleCompositeRelationOrderBy1;

  PermissionRoleRelationOrderBy1 permissionRoleRelation() default @PermissionRoleRelationOrderBy1;

  UserOrderBy1 usersAggregate() default @UserOrderBy1;

  GroupOrderBy1 groupsAggregate() default @GroupOrderBy1;

  RoleOrderBy1 compositesAggregate() default @RoleOrderBy1;

  PermissionOrderBy1 permissionsAggregate() default @PermissionOrderBy1;

  RoleUserRelationOrderBy1 roleUserRelationAggregate() default @RoleUserRelationOrderBy1;

  GroupRoleRelationOrderBy1 groupRoleRelationAggregate() default @GroupRoleRelationOrderBy1;

  RoleCompositeRelationOrderBy1 roleCompositeRelationAggregate(
      ) default @RoleCompositeRelationOrderBy1;

  PermissionRoleRelationOrderBy1 permissionRoleRelationAggregate(
      ) default @PermissionRoleRelationOrderBy1;

  Sort idCount() default Sort.ASC;

  Sort idMax() default Sort.ASC;

  Sort idMin() default Sort.ASC;

  Sort nameCount() default Sort.ASC;

  Sort nameMax() default Sort.ASC;

  Sort nameMin() default Sort.ASC;

  Sort descriptionCount() default Sort.ASC;

  Sort descriptionMax() default Sort.ASC;

  Sort descriptionMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $users() default "";

  String $groups() default "";

  String $composites() default "";

  String $permissions() default "";

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

  String $roleUserRelation() default "";

  String $groupRoleRelation() default "";

  String $roleCompositeRelation() default "";

  String $permissionRoleRelation() default "";

  String $usersAggregate() default "";

  String $groupsAggregate() default "";

  String $compositesAggregate() default "";

  String $permissionsAggregate() default "";

  String $roleUserRelationAggregate() default "";

  String $groupRoleRelationAggregate() default "";

  String $roleCompositeRelationAggregate() default "";

  String $permissionRoleRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";
}
