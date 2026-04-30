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
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("Subscription")
public @interface Subscription {
  UserExpression user() default @UserExpression;

  UserExpression userList() default @UserExpression;

  UserExpression userConnection() default @UserExpression;

  RoleExpression role() default @RoleExpression;

  RoleExpression roleList() default @RoleExpression;

  RoleExpression roleConnection() default @RoleExpression;

  GroupExpression group() default @GroupExpression;

  GroupExpression groupList() default @GroupExpression;

  GroupExpression groupConnection() default @GroupExpression;

  RealmExpression realm() default @RealmExpression;

  RealmExpression realmList() default @RealmExpression;

  RealmExpression realmConnection() default @RealmExpression;

  PermissionExpression permission() default @PermissionExpression;

  PermissionExpression permissionList() default @PermissionExpression;

  PermissionExpression permissionConnection() default @PermissionExpression;

  UserPhonesRelationExpression userPhonesRelation() default @UserPhonesRelationExpression;

  UserPhonesRelationExpression userPhonesRelationList() default @UserPhonesRelationExpression;

  UserPhonesRelationExpression userPhonesRelationConnection() default @UserPhonesRelationExpression;

  GroupUserRelationExpression groupUserRelation() default @GroupUserRelationExpression;

  GroupUserRelationExpression groupUserRelationList() default @GroupUserRelationExpression;

  GroupUserRelationExpression groupUserRelationConnection() default @GroupUserRelationExpression;

  RoleUserRelationExpression roleUserRelation() default @RoleUserRelationExpression;

  RoleUserRelationExpression roleUserRelationList() default @RoleUserRelationExpression;

  RoleUserRelationExpression roleUserRelationConnection() default @RoleUserRelationExpression;

  GroupRoleRelationExpression groupRoleRelation() default @GroupRoleRelationExpression;

  GroupRoleRelationExpression groupRoleRelationList() default @GroupRoleRelationExpression;

  GroupRoleRelationExpression groupRoleRelationConnection() default @GroupRoleRelationExpression;

  RoleCompositeRelationExpression roleCompositeRelation() default @RoleCompositeRelationExpression;

  RoleCompositeRelationExpression roleCompositeRelationList(
      ) default @RoleCompositeRelationExpression;

  RoleCompositeRelationExpression roleCompositeRelationConnection(
      ) default @RoleCompositeRelationExpression;

  RolePermissionRelationExpression rolePermissionRelation(
      ) default @RolePermissionRelationExpression;

  RolePermissionRelationExpression rolePermissionRelationList(
      ) default @RolePermissionRelationExpression;

  RolePermissionRelationExpression rolePermissionRelationConnection(
      ) default @RolePermissionRelationExpression;
}
