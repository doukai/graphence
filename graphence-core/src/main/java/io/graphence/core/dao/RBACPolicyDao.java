package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Role;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

import java.util.Set;

@GraphQLOperation
public interface RBACPolicyDao {

    @QueryOperation(value = "roleList", selectionSet = "{ id name users { id login realmId } composites { id name } permissions { name type field permissionType } realmId }")
    Mono<Set<Role>> queryRoleList() throws Exception;

    @QueryOperation(value = "roleList", selectionSet = "{ permissions { name } composites { permissions { name } composites { permissions { name } } } }")
    @RoleExpression0(
            users = @UserExpression1(
                    id = @IDExpression($val = "userId")
            )
    )
    Mono<Set<Role>> queryRolePermissionsList(String userId) throws Exception;
}
