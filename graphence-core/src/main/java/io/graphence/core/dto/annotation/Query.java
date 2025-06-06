package io.graphence.core.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 查询
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("查询")
public @interface Query {
  UserQueryArguments user() default @UserQueryArguments;

  UserListQueryArguments userList() default @UserListQueryArguments;

  UserConnectionQueryArguments userConnection() default @UserConnectionQueryArguments;

  RoleQueryArguments role() default @RoleQueryArguments;

  RoleListQueryArguments roleList() default @RoleListQueryArguments;

  RoleConnectionQueryArguments roleConnection() default @RoleConnectionQueryArguments;

  GroupQueryArguments group() default @GroupQueryArguments;

  GroupListQueryArguments groupList() default @GroupListQueryArguments;

  GroupConnectionQueryArguments groupConnection() default @GroupConnectionQueryArguments;

  RealmQueryArguments realm() default @RealmQueryArguments;

  RealmListQueryArguments realmList() default @RealmListQueryArguments;

  RealmConnectionQueryArguments realmConnection() default @RealmConnectionQueryArguments;

  PermissionQueryArguments permission() default @PermissionQueryArguments;

  PermissionListQueryArguments permissionList() default @PermissionListQueryArguments;

  PermissionConnectionQueryArguments permissionConnection(
      ) default @PermissionConnectionQueryArguments;

  UserPhonesRelationQueryArguments userPhonesRelation() default @UserPhonesRelationQueryArguments;

  UserPhonesRelationListQueryArguments userPhonesRelationList(
      ) default @UserPhonesRelationListQueryArguments;

  UserPhonesRelationConnectionQueryArguments userPhonesRelationConnection(
      ) default @UserPhonesRelationConnectionQueryArguments;

  GroupUserRelationQueryArguments groupUserRelation() default @GroupUserRelationQueryArguments;

  GroupUserRelationListQueryArguments groupUserRelationList(
      ) default @GroupUserRelationListQueryArguments;

  GroupUserRelationConnectionQueryArguments groupUserRelationConnection(
      ) default @GroupUserRelationConnectionQueryArguments;

  RoleUserRelationQueryArguments roleUserRelation() default @RoleUserRelationQueryArguments;

  RoleUserRelationListQueryArguments roleUserRelationList(
      ) default @RoleUserRelationListQueryArguments;

  RoleUserRelationConnectionQueryArguments roleUserRelationConnection(
      ) default @RoleUserRelationConnectionQueryArguments;

  GroupRoleRelationQueryArguments groupRoleRelation() default @GroupRoleRelationQueryArguments;

  GroupRoleRelationListQueryArguments groupRoleRelationList(
      ) default @GroupRoleRelationListQueryArguments;

  GroupRoleRelationConnectionQueryArguments groupRoleRelationConnection(
      ) default @GroupRoleRelationConnectionQueryArguments;

  RoleCompositeRelationQueryArguments roleCompositeRelation(
      ) default @RoleCompositeRelationQueryArguments;

  RoleCompositeRelationListQueryArguments roleCompositeRelationList(
      ) default @RoleCompositeRelationListQueryArguments;

  RoleCompositeRelationConnectionQueryArguments roleCompositeRelationConnection(
      ) default @RoleCompositeRelationConnectionQueryArguments;

  PermissionRoleRelationQueryArguments permissionRoleRelation(
      ) default @PermissionRoleRelationQueryArguments;

  PermissionRoleRelationListQueryArguments permissionRoleRelationList(
      ) default @PermissionRoleRelationListQueryArguments;

  PermissionRoleRelationConnectionQueryArguments permissionRoleRelationConnection(
      ) default @PermissionRoleRelationConnectionQueryArguments;
}
