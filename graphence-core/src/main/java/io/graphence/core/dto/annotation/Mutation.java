package io.graphence.core.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * Mutation
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation")
public @interface Mutation {
  UserMutationArguments user() default @UserMutationArguments;

  UserListMutationArguments userList() default @UserListMutationArguments;

  RoleMutationArguments role() default @RoleMutationArguments;

  RoleListMutationArguments roleList() default @RoleListMutationArguments;

  GroupMutationArguments group() default @GroupMutationArguments;

  GroupListMutationArguments groupList() default @GroupListMutationArguments;

  RealmMutationArguments realm() default @RealmMutationArguments;

  RealmListMutationArguments realmList() default @RealmListMutationArguments;

  PermissionMutationArguments permission() default @PermissionMutationArguments;

  PermissionListMutationArguments permissionList() default @PermissionListMutationArguments;

  UserPhonesRelationMutationArguments userPhonesRelation(
      ) default @UserPhonesRelationMutationArguments;

  UserPhonesRelationListMutationArguments userPhonesRelationList(
      ) default @UserPhonesRelationListMutationArguments;

  GroupUserRelationMutationArguments groupUserRelation(
      ) default @GroupUserRelationMutationArguments;

  GroupUserRelationListMutationArguments groupUserRelationList(
      ) default @GroupUserRelationListMutationArguments;

  RoleUserRelationMutationArguments roleUserRelation() default @RoleUserRelationMutationArguments;

  RoleUserRelationListMutationArguments roleUserRelationList(
      ) default @RoleUserRelationListMutationArguments;

  GroupRoleRelationMutationArguments groupRoleRelation(
      ) default @GroupRoleRelationMutationArguments;

  GroupRoleRelationListMutationArguments groupRoleRelationList(
      ) default @GroupRoleRelationListMutationArguments;

  RoleCompositeRelationMutationArguments roleCompositeRelation(
      ) default @RoleCompositeRelationMutationArguments;

  RoleCompositeRelationListMutationArguments roleCompositeRelationList(
      ) default @RoleCompositeRelationListMutationArguments;

  RolePermissionRelationMutationArguments rolePermissionRelation(
      ) default @RolePermissionRelationMutationArguments;

  RolePermissionRelationListMutationArguments rolePermissionRelationList(
      ) default @RolePermissionRelationListMutationArguments;
}
