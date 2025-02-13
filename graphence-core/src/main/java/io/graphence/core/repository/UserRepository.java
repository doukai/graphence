package io.graphence.core.repository;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.dto.objectType.RoleUserRelation;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import io.nozdormu.spi.async.Async;
import reactor.core.publisher.Mono;

import java.util.Collection;

@GraphQLOperation
public interface UserRepository {

    @Query(user = @UserQueryArguments(login = @StringExpression($val = "login")))
    @SelectionSet("{ id }")
    Mono<User> getUserIdByLogin(String login);

    @Query(user = @UserQueryArguments(login = @StringExpression($val = "login")))
    Mono<User> getUserByLogin(String login);

    @Query(user = @UserQueryArguments(id = @StringExpression($val = "id")))
    Mono<User> getUserById(String id);

    @Mutation(user = @UserMutationArguments($input = "userInput"))
    @SelectionSet("{ id }")
    Mono<User> updateUser(UserInput userInput);

    @Mutation(user = @UserMutationArguments($phones = "phones", where = @UserExpression(id = @StringExpression($val = "id"))))
    @SelectionSet("{ id }")
    Mono<User> updateUserPhones(String id, Collection<String> phones);

    @Mutation(user = @UserMutationArguments($salt = "salt", $hash = "hash", where = @UserExpression(id = @StringExpression($val = "id"))))
    @SelectionSet("{ id }")
    Mono<User> resetPassword(String id, String salt, String hash);

    @Async
    @Query(user = @UserQueryArguments(login = @StringExpression($val = "login")))
    @SelectionSet("{ id }")
    User getByLogin(String login);

    @Async
    @Query(user = @UserQueryArguments(phones = @StringExpression($val = "phone")))
    @SelectionSet("{ id }")
    User getByPhone(String phone);

    @Async
    @Mutation(user = @UserMutationArguments($input = "input"))
    @SelectionSet("{ id }")
    User save(UserInput input);

    @Async
    @Mutation(roleUserRelation = @RoleUserRelationMutationArguments($userRef = "userId", $roleRef = "roleId"))
    @SelectionSet("{ id }")
    RoleUserRelation saveRoleUserRelation(String userId, String roleId);
}
