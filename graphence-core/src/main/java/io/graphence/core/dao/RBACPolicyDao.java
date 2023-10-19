package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

import java.util.Set;

@GraphQLOperation
public interface RBACPolicyDao {

    @QueryOperation(value = "roleList", selectionSet = "{ id name users { id login realmId } composites { id name realmId } permissions { name type field permissionType } realmId }")
    Mono<Set<Role>> queryRoleList();

    @QueryOperation(value = "role", selectionSet = "{ id name users { id login realmId } composites { id name realmId } permissions { name type field permissionType realmId } realmId }")
    @RoleExpression0(id = @IDExpression($val = "id"))
    Mono<Role> queryRoleById(String id);

    @QueryOperation(value = "user", selectionSet = "{ id login roles { id name realmId } groups { roles { id name realmId } } realmId }")
    @UserExpression0(id = @IDExpression($val = "id"))
    Mono<User> queryUserById(String id);

    @QueryOperation(value = "group", selectionSet = "{ id name users { id login roles { id name realmId } groups { roles { id name realmId } } realmId } realmId }")
    @GroupExpression0(id = @IDExpression($val = "id"))
    Mono<Group> queryGroupById(String id);

    @QueryOperation(value = "permission", selectionSet = "{ name type field permissionType roles { id name realmId } realmId }")
    @PermissionExpression0(name = @IDExpression($val = "name"))
    Mono<Permission> queryPermissionByName(String name);

    @QueryOperation(value = "roleList", selectionSet = "{ permissions { name } composites { permissions { name } composites { permissions { name } } } }")
    @RoleExpression0(
            users = @UserExpression1(
                    id = @IDExpression($val = "userId")
            )
    )
    Mono<Set<Role>> queryRolePermissionsList(String userId);

    @QueryOperation(value = "groupList", selectionSet = "{ roles { permissions { name } composites { permissions { name } composites { permissions { name } } } } }")
    @GroupExpression0(
            users = @UserExpression1(
                    id = @IDExpression($val = "userId")
            )
    )
    Mono<Set<Group>> queryGroupPermissionsList(String userId);
}
