package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@GraphQLOperation
public interface RBACPolicyDao {

    @QueryOperation(value = "roleList", selectionSet = "{ id name users { id login } composites { id name } permissions { name type field permissionType } realmId }")
    Mono<Set<Role>> queryRoleList();

    @QueryOperation(value = "role", selectionSet = "{ id name users { id login } composites { id name } permissions { name type field permissionType } realmId }")
    @RoleExpression0(id = @IDExpression($val = "id"))
    Mono<Role> queryRoleById(String id);

    @QueryOperation(value = "user", selectionSet = "{ id login roles { id name } groups { roles { id name } } realmId }")
    @UserExpression0(id = @IDExpression($val = "id"))
    Mono<User> queryUserById(String id);

    @QueryOperation(value = "group", selectionSet = "{ id name users { id login roles { id name } groups { roles { id name } } } realmId }")
    @GroupExpression0(id = @IDExpression($val = "id"))
    Mono<Group> queryGroupById(String id);

    @QueryOperation(value = "permission", selectionSet = "{ name type field permissionType roles { id name realmId } }")
    @PermissionExpression0(name = @IDExpression($val = "name"))
    Mono<Permission> queryPermissionByName(String name);

    @QueryOperation(value = "permissionList", selectionSet = "{ type }")
    @PermissionExpression0(
            roles = @RoleExpression1(
                    id = @IDExpression($in = "roleIdList")
            ),
            groupBy = {"type"}
    )
    Mono<List<Permission>> queryPermissionTypeList(Collection<String> roleIdList);

    @QueryOperation(value = "permissionList", selectionSet = "{ name }")
    @PermissionExpression0(
            roles = @RoleExpression1(
                    id = @IDExpression($in = "roleIdList")
            ),
            type = @StringExpression($in = "types")
    )
    Mono<List<Permission>> queryPermissionListByTypes(Collection<String> roleIdList, Collection<String> types);
}
