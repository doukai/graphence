package io.graphence.core.dto.annotation;

import io.graphoenix.core.dto.enumType.Sort;
import io.graphoenix.file.dto.annotation.FileOrderBy;
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
public @interface UserOrderBy1 {
  Sort id() default Sort.ASC;

  Sort name() default Sort.ASC;

  Sort description() default Sort.ASC;

  Sort lastName() default Sort.ASC;

  Sort login() default Sort.ASC;

  Sort salt() default Sort.ASC;

  Sort hash() default Sort.ASC;

  Sort email() default Sort.ASC;

  FileOrderBy files() default @FileOrderBy;

  Sort phones() default Sort.ASC;

  Sort disable() default Sort.ASC;

  GroupOrderBy2 groups() default @GroupOrderBy2;

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

  FileUserRelationOrderBy2 fileUserRelation() default @FileUserRelationOrderBy2;

  UserPhonesRelationOrderBy2 userPhonesRelation() default @UserPhonesRelationOrderBy2;

  GroupUserRelationOrderBy2 groupUserRelation() default @GroupUserRelationOrderBy2;

  RoleUserRelationOrderBy2 roleUserRelation() default @RoleUserRelationOrderBy2;

  GroupOrderBy2 groupsAggregate() default @GroupOrderBy2;

  RoleOrderBy2 rolesAggregate() default @RoleOrderBy2;

  UserPhonesRelationOrderBy2 userPhonesRelationAggregate() default @UserPhonesRelationOrderBy2;

  GroupUserRelationOrderBy2 groupUserRelationAggregate() default @GroupUserRelationOrderBy2;

  RoleUserRelationOrderBy2 roleUserRelationAggregate() default @RoleUserRelationOrderBy2;

  Sort idCount() default Sort.ASC;

  Sort idMax() default Sort.ASC;

  Sort idMin() default Sort.ASC;

  Sort nameCount() default Sort.ASC;

  Sort nameMax() default Sort.ASC;

  Sort nameMin() default Sort.ASC;

  Sort descriptionCount() default Sort.ASC;

  Sort descriptionMax() default Sort.ASC;

  Sort descriptionMin() default Sort.ASC;

  Sort lastNameCount() default Sort.ASC;

  Sort lastNameMax() default Sort.ASC;

  Sort lastNameMin() default Sort.ASC;

  Sort loginCount() default Sort.ASC;

  Sort loginMax() default Sort.ASC;

  Sort loginMin() default Sort.ASC;

  Sort saltCount() default Sort.ASC;

  Sort saltMax() default Sort.ASC;

  Sort saltMin() default Sort.ASC;

  Sort hashCount() default Sort.ASC;

  Sort hashMax() default Sort.ASC;

  Sort hashMin() default Sort.ASC;

  Sort emailCount() default Sort.ASC;

  Sort emailMax() default Sort.ASC;

  Sort emailMin() default Sort.ASC;

  String $id() default "";

  String $name() default "";

  String $description() default "";

  String $lastName() default "";

  String $login() default "";

  String $salt() default "";

  String $hash() default "";

  String $email() default "";

  String $files() default "";

  String $phones() default "";

  String $disable() default "";

  String $groups() default "";

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

  String $fileUserRelation() default "";

  String $userPhonesRelation() default "";

  String $groupUserRelation() default "";

  String $roleUserRelation() default "";

  String $groupsAggregate() default "";

  String $rolesAggregate() default "";

  String $userPhonesRelationAggregate() default "";

  String $groupUserRelationAggregate() default "";

  String $roleUserRelationAggregate() default "";

  String $idCount() default "";

  String $idMax() default "";

  String $idMin() default "";

  String $nameCount() default "";

  String $nameMax() default "";

  String $nameMin() default "";

  String $descriptionCount() default "";

  String $descriptionMax() default "";

  String $descriptionMin() default "";

  String $lastNameCount() default "";

  String $lastNameMax() default "";

  String $lastNameMin() default "";

  String $loginCount() default "";

  String $loginMax() default "";

  String $loginMin() default "";

  String $saltCount() default "";

  String $saltMax() default "";

  String $saltMin() default "";

  String $hashCount() default "";

  String $hashMax() default "";

  String $hashMin() default "";

  String $emailCount() default "";

  String $emailMax() default "";

  String $emailMin() default "";
}
