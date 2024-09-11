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
public @interface GroupOrderBy {
  Sort id() default Sort.ASC;

  Sort name() default Sort.ASC;

  Sort description() default Sort.ASC;

  Sort path() default Sort.ASC;

  Sort deep() default Sort.ASC;

  Sort parentId() default Sort.ASC;

  GroupOrderBy1 parent() default @GroupOrderBy1;

  GroupOrderBy1 subGroups() default @GroupOrderBy1;

  UserOrderBy1 users() default @UserOrderBy1;

  RoleOrderBy1 roles() default @RoleOrderBy1;

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

  GroupUserRelationOrderBy1 groupUserRelation() default @GroupUserRelationOrderBy1;

  GroupRoleRelationOrderBy1 groupRoleRelation() default @GroupRoleRelationOrderBy1;

  GroupOrderBy1 subGroupsAggregate() default @GroupOrderBy1;

  UserOrderBy1 usersAggregate() default @UserOrderBy1;

  RoleOrderBy1 rolesAggregate() default @RoleOrderBy1;

  GroupUserRelationOrderBy1 groupUserRelationAggregate() default @GroupUserRelationOrderBy1;

  GroupRoleRelationOrderBy1 groupRoleRelationAggregate() default @GroupRoleRelationOrderBy1;

  Sort idCount() default Sort.ASC;

  Sort idMax() default Sort.ASC;

  Sort idMin() default Sort.ASC;

  Sort nameCount() default Sort.ASC;

  Sort nameMax() default Sort.ASC;

  Sort nameMin() default Sort.ASC;

  Sort descriptionCount() default Sort.ASC;

  Sort descriptionMax() default Sort.ASC;

  Sort descriptionMin() default Sort.ASC;

  Sort pathCount() default Sort.ASC;

  Sort pathMax() default Sort.ASC;

  Sort pathMin() default Sort.ASC;

  Sort parentIdCount() default Sort.ASC;

  Sort parentIdMax() default Sort.ASC;

  Sort parentIdMin() default Sort.ASC;

  Sort deepCount() default Sort.ASC;

  Sort deepSum() default Sort.ASC;

  Sort deepAvg() default Sort.ASC;

  Sort deepMax() default Sort.ASC;

  Sort deepMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $path() default "";

  String $deep() default "";

  String $parentId() default "";

  String $parent() default "";

  String $subGroups() default "";

  String $users() default "";

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

  String $groupUserRelation() default "";

  String $groupRoleRelation() default "";

  String $subGroupsAggregate() default "";

  String $usersAggregate() default "";

  String $rolesAggregate() default "";

  String $groupUserRelationAggregate() default "";

  String $groupRoleRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";

  String $pathCount() default "";

  String $pathMax() default "";

  String $pathMin() default "";

  String $parentIdCount() default "";

  String $parentIdMax() default "";

  String $parentIdMin() default "";

  String $deepCount() default "";

  String $deepSum() default "";

  String $deepAvg() default "";

  String $deepMax() default "";

  String $deepMin() default "";
}
