package io.graphence.core.dao;

import io.graphence.core.dto.annotation.Mutation;
import io.graphence.core.dto.annotation.Query;
import io.graphence.core.dto.annotation.UserMutationArguments;
import io.graphence.core.dto.annotation.UserQueryArguments;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface UserDao {

    @Query(user = @UserQueryArguments(login = @StringExpression1($val = "login")))
    Mono<User> getUserByLogin(String login);

    @Query(user = @UserQueryArguments(id = @StringExpression1($val = "id")))
    Mono<User> getUserById(String id);

    @Mutation(user = @UserMutationArguments($input = "user"))
    @SelectionSet("{ id }")
    Mono<User> updateUser(User user);

    @Mutation(user = @UserMutationArguments($input = "userInput"))
    @SelectionSet("{ id }")
    Mono<User> updateUser(UserInput userInput);
}
