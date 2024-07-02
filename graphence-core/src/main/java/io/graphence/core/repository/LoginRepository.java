package io.graphence.core.repository;

import io.graphence.core.dto.annotation.Query;
import io.graphence.core.dto.annotation.UserQueryArguments;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface LoginRepository {

    @Query(user = @UserQueryArguments(login = @StringExpression($val = "login")))
    @SelectionSet("{ id name lastName login salt hash email disable groups { id name path deep roles { id name composites { id name composites { id name } } } } roles { id name composites { id name composites { id name } } } realmId }")
    Mono<User> getUserByLogin(String login);
}
