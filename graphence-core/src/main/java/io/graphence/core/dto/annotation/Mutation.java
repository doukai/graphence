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
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Mutation")
public @interface Mutation {
  UserInput user() default @UserInput;

  UserInput userList() default @UserInput;

  RoleInput role() default @RoleInput;

  RoleInput roleList() default @RoleInput;

  GroupInput group() default @GroupInput;

  GroupInput groupList() default @GroupInput;

  RealmInput realm() default @RealmInput;

  RealmInput realmList() default @RealmInput;

  PermissionInput permission() default @PermissionInput;

  PermissionInput permissionList() default @PermissionInput;

  UserPhonesRelationInput userPhonesRelation() default @UserPhonesRelationInput;

  UserPhonesRelationInput userPhonesRelationList() default @UserPhonesRelationInput;

  GroupUserRelationInput groupUserRelation() default @GroupUserRelationInput;

  GroupUserRelationInput groupUserRelationList() default @GroupUserRelationInput;

  RoleUserRelationInput roleUserRelation() default @RoleUserRelationInput;

  RoleUserRelationInput roleUserRelationList() default @RoleUserRelationInput;

  GroupRoleRelationInput groupRoleRelation() default @GroupRoleRelationInput;

  GroupRoleRelationInput groupRoleRelationList() default @GroupRoleRelationInput;

  RoleCompositeRelationInput roleCompositeRelation() default @RoleCompositeRelationInput;

  RoleCompositeRelationInput roleCompositeRelationList() default @RoleCompositeRelationInput;

  RolePermissionRelationInput rolePermissionRelation() default @RolePermissionRelationInput;

  RolePermissionRelationInput rolePermissionRelationList() default @RolePermissionRelationInput;
}
