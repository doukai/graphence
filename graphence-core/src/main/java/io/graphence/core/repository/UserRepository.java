package io.graphence.core.repository;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.core.dto.annotation.StringExpression2;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface UserRepository {

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

    @Mutation(user = @UserMutationArguments($salt = "salt", $hash = "hash", where = @UserExpression1(id = @StringExpression2($val = "id"))))
    @SelectionSet("{ id }")
    Mono<User> resetPassword(String id, String salt, String hash);
}
