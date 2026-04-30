package io.graphence.core.repository;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.util.Collection;

@GraphQLOperation
public interface UserRepository {

  @Query(user = @UserExpression(login = @StringExpression($val = "login")))
  @SelectionSet("{ id }")
  Mono<User> getUserIdByLogin(String login);

  @Query(user = @UserExpression(login = @StringExpression($val = "login")))
  Mono<User> getUserByLogin(String login);

  @Query(user = @UserExpression(id = @StringExpression($val = "id")))
  Mono<User> getUserById(String id);

  @Mutation(user = @io.graphence.core.dto.annotation.UserInput($input = "userInput"))
  @SelectionSet("{ id }")
  Mono<User> updateUser(UserInput userInput);

  @Mutation(
      user =
          @io.graphence.core.dto.annotation.UserInput(
              $phones = "phones",
              where = @UserExpression1(id = @StringExpression($val = "id"))))
  @SelectionSet("{ id }")
  Mono<User> updateUserPhones(String id, Collection<String> phones);

  @Mutation(
      user =
          @io.graphence.core.dto.annotation.UserInput(
              $salt = "salt",
              $hash = "hash",
              where = @UserExpression1(id = @StringExpression($val = "id"))))
  @SelectionSet("{ id }")
  Mono<User> resetPassword(String id, String salt, String hash);
}
