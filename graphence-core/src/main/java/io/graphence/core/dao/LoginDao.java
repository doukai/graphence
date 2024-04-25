package io.graphence.core.dao;

import io.graphence.core.dto.annotation.Query;
import io.graphence.core.dto.annotation.UserQueryArguments;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface LoginDao {

    @Query(user = @UserQueryArguments(login = @StringExpression1($val = "login")))
    @SelectionSet("{ id name lastName login salt hash email disable groups { id name path deep roles { id name composites { id name composites { id name } } } } roles { id name composites { id name composites { id name } } } realmId }")
    Mono<User> getUserByLogin(String login);

    @Query(user = @UserQueryArguments(login = @StringExpression1($val = "login")))
    @SelectionSet("{ id }")
    Mono<User> getUserIdByLogin(String login);
}
