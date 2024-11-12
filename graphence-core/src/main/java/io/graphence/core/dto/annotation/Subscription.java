package io.graphence.core.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Subscription
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Subscription")
public @interface Subscription {
  UserSubscriptionArguments user() default @UserSubscriptionArguments;

  UserListSubscriptionArguments userList() default @UserListSubscriptionArguments;

  UserConnectionSubscriptionArguments userConnection() default @UserConnectionSubscriptionArguments;

  RoleSubscriptionArguments role() default @RoleSubscriptionArguments;

  RoleListSubscriptionArguments roleList() default @RoleListSubscriptionArguments;

  RoleConnectionSubscriptionArguments roleConnection() default @RoleConnectionSubscriptionArguments;

  GroupSubscriptionArguments group() default @GroupSubscriptionArguments;

  GroupListSubscriptionArguments groupList() default @GroupListSubscriptionArguments;

  GroupConnectionSubscriptionArguments groupConnection(
      ) default @GroupConnectionSubscriptionArguments;

  RealmSubscriptionArguments realm() default @RealmSubscriptionArguments;

  RealmListSubscriptionArguments realmList() default @RealmListSubscriptionArguments;

  RealmConnectionSubscriptionArguments realmConnection(
      ) default @RealmConnectionSubscriptionArguments;

  PermissionSubscriptionArguments permission() default @PermissionSubscriptionArguments;

  PermissionListSubscriptionArguments permissionList() default @PermissionListSubscriptionArguments;

  PermissionConnectionSubscriptionArguments permissionConnection(
      ) default @PermissionConnectionSubscriptionArguments;

  UserPhonesRelationSubscriptionArguments userPhonesRelation(
      ) default @UserPhonesRelationSubscriptionArguments;

  UserPhonesRelationListSubscriptionArguments userPhonesRelationList(
      ) default @UserPhonesRelationListSubscriptionArguments;

  UserPhonesRelationConnectionSubscriptionArguments userPhonesRelationConnection(
      ) default @UserPhonesRelationConnectionSubscriptionArguments;

  GroupUserRelationSubscriptionArguments groupUserRelation(
      ) default @GroupUserRelationSubscriptionArguments;

  GroupUserRelationListSubscriptionArguments groupUserRelationList(
      ) default @GroupUserRelationListSubscriptionArguments;

  GroupUserRelationConnectionSubscriptionArguments groupUserRelationConnection(
      ) default @GroupUserRelationConnectionSubscriptionArguments;

  RoleUserRelationSubscriptionArguments roleUserRelation(
      ) default @RoleUserRelationSubscriptionArguments;

  RoleUserRelationListSubscriptionArguments roleUserRelationList(
      ) default @RoleUserRelationListSubscriptionArguments;

  RoleUserRelationConnectionSubscriptionArguments roleUserRelationConnection(
      ) default @RoleUserRelationConnectionSubscriptionArguments;

  GroupRoleRelationSubscriptionArguments groupRoleRelation(
      ) default @GroupRoleRelationSubscriptionArguments;

  GroupRoleRelationListSubscriptionArguments groupRoleRelationList(
      ) default @GroupRoleRelationListSubscriptionArguments;

  GroupRoleRelationConnectionSubscriptionArguments groupRoleRelationConnection(
      ) default @GroupRoleRelationConnectionSubscriptionArguments;

  RoleCompositeRelationSubscriptionArguments roleCompositeRelation(
      ) default @RoleCompositeRelationSubscriptionArguments;

  RoleCompositeRelationListSubscriptionArguments roleCompositeRelationList(
      ) default @RoleCompositeRelationListSubscriptionArguments;

  RoleCompositeRelationConnectionSubscriptionArguments roleCompositeRelationConnection(
      ) default @RoleCompositeRelationConnectionSubscriptionArguments;

  PermissionRoleRelationSubscriptionArguments permissionRoleRelation(
      ) default @PermissionRoleRelationSubscriptionArguments;

  PermissionRoleRelationListSubscriptionArguments permissionRoleRelationList(
      ) default @PermissionRoleRelationListSubscriptionArguments;

  PermissionRoleRelationConnectionSubscriptionArguments permissionRoleRelationConnection(
      ) default @PermissionRoleRelationConnectionSubscriptionArguments;

  FileUserRelationSubscriptionArguments fileUserRelation(
      ) default @FileUserRelationSubscriptionArguments;

  FileUserRelationListSubscriptionArguments fileUserRelationList(
      ) default @FileUserRelationListSubscriptionArguments;

  FileUserRelationConnectionSubscriptionArguments fileUserRelationConnection(
      ) default @FileUserRelationConnectionSubscriptionArguments;
}
