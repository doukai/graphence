package io.graphence.core.dao;

import io.graphence.core.dto.annotation.StringExpression;
import io.graphence.core.dto.annotation.UserExpression0;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface LoginDao {

    @QueryOperation(value = "user", selectionSet = "{ id name lastName login salt hash email disable groups { name path deep } roles { name composites { name composites { name } } } realmId }")
    @UserExpression0(login = @StringExpression($val = "login"))
    Mono<User> getUserByLogin(String login) throws Exception;
}
