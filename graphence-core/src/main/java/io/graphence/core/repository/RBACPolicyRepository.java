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

    @Query(roleList = @RoleListQueryArguments())
    @SelectionSet("{ id name users { id login } composites { id name } groups { id name } permissions { name type field permissionType } realmId }")
    Mono<Set<Role>> queryRoleList();

    @Query(groupList = @GroupListQueryArguments())
    @SelectionSet("{ id name users { id login } realmId }")
    Mono<Set<Group>> queryGroupList();

    @Query(role = @RoleQueryArguments(id = @StringExpression($val = "id")))
    @SelectionSet("{ id name users { id login } composites { id name } groups { id name } permissions { name type field permissionType } realmId }")
    Mono<Role> queryRoleById(String id);

    @Query(role = @RoleQueryArguments(id = @StringExpression($val = "id")))
    @SelectionSet("{ id name realmId }")
    Mono<Role> queryRoleRealmById(String id);

    @Query(user = @UserQueryArguments(id = @StringExpression($val = "id")))
    @SelectionSet("{ id login roles { id name } groups { id name } realmId }")
    Mono<User> queryUserById(String id);

    @Query(group = @GroupQueryArguments(id = @StringExpression($val = "id")))
    @SelectionSet("{ id name users { id login } roles { id name } realmId }")
    Mono<Group> queryGroupById(String id);

    @Query(permission = @PermissionQueryArguments(name = @StringExpression($val = "name")))
    @SelectionSet("{ name type field permissionType roles { id name realmId } }")
    Mono<Permission> queryPermissionByName(String name);

    @Query(permissionList = @PermissionListQueryArguments(
            roles = @RoleExpression(
                    id = @StringExpression($arr = "roleIdList")
            ),
            groupBy = {"type"}
    ))
    @SelectionSet("{ type }")
    Mono<List<Permission>> queryPermissionTypeList(Collection<String> roleIdList);

    @Query(permissionList = @PermissionListQueryArguments(
            roles = @RoleExpression(
                    id = @StringExpression($arr = "roleIdList")
            ),
            type = @StringExpression($arr = "types")
    ))
    @SelectionSet("{ name }")
    Mono<List<Permission>> queryPermissionNameListByTypes(Collection<String> roleIdList, Collection<String> types);
}
