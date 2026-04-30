package io.graphence.core.repository;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@GraphQLOperation
public interface RBACPolicyRepository {

  @Query(roleList = @RoleExpression())
  @SelectionSet(
      "{ id name users { id login } composites { id name } groups { id name } permissions { name type field permissionType } realmId }")
  Mono<Set<Role>> queryRoleList();

  @Query(groupList = @GroupExpression())
  @SelectionSet("{ id name users { id login } realmId }")
  Mono<Set<Group>> queryGroupList();

  @Query(role = @RoleExpression(id = @StringExpression($val = "id")))
  @SelectionSet(
      "{ id name users { id login } composites { id name } groups { id name } permissions { name type field permissionType } realmId }")
  Mono<Role> queryRoleById(String id);

  @Query(role = @RoleExpression(id = @StringExpression($val = "id")))
  @SelectionSet("{ id name realmId }")
  Mono<Role> queryRoleRealmById(String id);

  @Query(user = @UserExpression(id = @StringExpression($val = "id")))
  @SelectionSet("{ id login roles { id name } groups { id name } realmId }")
  Mono<User> queryUserById(String id);

  @Query(group = @GroupExpression(id = @StringExpression($val = "id")))
  @SelectionSet("{ id name users { id login } roles { id name } realmId }")
  Mono<Group> queryGroupById(String id);

  @Query(permission = @PermissionExpression(name = @StringExpression($val = "name")))
  @SelectionSet("{ name type field permissionType roles { id name realmId } }")
  Mono<Permission> queryPermissionByName(String name);

  @Query(
      permissionList =
          @PermissionExpression(
              roles = @RoleExpression1(id = @StringExpression($arr = "roleIdList")),
              groupBy = @PermissionGroupBy1(by = {"type"})))
  @SelectionSet("{ type }")
  Mono<List<Permission>> queryPermissionTypeList(Collection<String> roleIdList);

  @Query(
      permissionList =
          @PermissionExpression(
              roles = @RoleExpression1(id = @StringExpression($arr = "roleIdList")),
              type = @StringExpression($arr = "types")))
  @SelectionSet("{ name }")
  Mono<List<Permission>> queryPermissionNameListByTypes(
      Collection<String> roleIdList, Collection<String> types);
}
