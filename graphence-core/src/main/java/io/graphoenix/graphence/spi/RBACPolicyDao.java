package io.graphoenix.graphence.spi;

import io.graphoenix.graphence.dto.objectType.Role;
import io.graphoenix.r2dbc.connector.dao.R2DBCOperationDAO;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

import java.util.Set;

@GraphQLOperation(operationDAO = R2DBCOperationDAO.class)
public interface RBACPolicyDao {

    @QueryOperation(value = "roleList", selectionSet = "{ id name users{ id login realmId } composites{ id name } permissions{ field{ name ofTypeName } level } realmId }")
    Mono<Set<Role>> queryRoleList() throws Exception;
}
