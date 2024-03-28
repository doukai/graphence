package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.core.dto.annotation.StringExpression2;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@GraphQLOperation
public interface RBACPolicyDao {

    @Query(roleList = @RoleListQueryArguments())
    @SelectionSet("{ id name users { id login } composites { id name } permissions { name type field permissionType } realmId }")
    Mono<Set<Role>> queryRoleList();

    @Query(role = @RoleQueryArguments(id = @StringExpression1($val = "id")))
    @SelectionSet("{ id name users { id login } composites { id name } permissions { name type field permissionType } realmId }")
    Mono<Role> queryRoleById(String id);

    @Query(user = @UserQueryArguments(id = @StringExpression1($val = "id")))
    @SelectionSet("{ id login roles { id name } groups { roles { id name } } realmId }")
    Mono<User> queryUserById(String id);

    @Query(group = @GroupQueryArguments(id = @StringExpression1($val = "id")))
    @SelectionSet("{ id name users { id login roles { id name } groups { roles { id name } } } realmId }")
    Mono<Group> queryGroupById(String id);

    @Query(permission = @PermissionQueryArguments(name = @StringExpression1($val = "name")))
    @SelectionSet("{ name type field permissionType roles { id name realmId } }")
    Mono<Permission> queryPermissionByName(String name);


    @Query(permissionList = @PermissionListQueryArguments(
            roles = @RoleExpression1(
                    id = @StringExpression2($arr = "roleIdList")
            ),
            groupBy = {"type"}
    ))
    @SelectionSet("{ type }")
    Mono<List<Permission>> queryPermissionTypeList(Collection<String> roleIdList);

    @Query(permissionList = @PermissionListQueryArguments(
            roles = @RoleExpression1(
                    id = @StringExpression2($arr = "roleIdList")
            ),
            type = @StringExpression1($arr = "types")
    ))
    @SelectionSet("{ name }")
    Mono<List<Permission>> queryPermissionListByTypes(Collection<String> roleIdList, Collection<String> types);
}
