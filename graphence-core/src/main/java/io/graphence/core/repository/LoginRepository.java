package io.graphence.core.repository;

import io.graphence.core.dto.annotation.Query;
import io.graphence.core.dto.annotation.UserExpression;
import io.graphence.core.dto.objectType.User;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

@GraphQLOperation
public interface LoginRepository {

  String USER_AUTH_SELECTION =
      "{\n"
          + "  id\n"
          + "  name\n"
          + "  lastName\n"
          + "  login\n"
          + "  salt\n"
          + "  hash\n"
          + "  email\n"
          + "  disable\n"
          + "  dataPermissionLevel\n"
          + "  groupId\n"
          + "  groups {\n"
          + "    id\n"
          + "    name\n"
          + "    roles {\n"
          + "      id\n"
          + "      name\n"
          + "      composites {\n"
          + "        id\n"
          + "        name\n"
          + "        composites {\n"
          + "          id\n"
          + "          name\n"
          + "        }\n"
          + "      }\n"
          + "    }\n"
          + "    subGroups {\n"
          + "      id\n"
          + "      name\n"
          + "      subGroups {\n"
          + "        id\n"
          + "        name\n"
          + "        subGroups {\n"
          + "          id\n"
          + "          name\n"
          + "          subGroups {\n"
          + "            id\n"
          + "            name\n"
          + "          }\n"
          + "        }\n"
          + "      }\n"
          + "    }\n"
          + "  }\n"
          + "  roles {\n"
          + "    id\n"
          + "    name\n"
          + "    composites {\n"
          + "      id\n"
          + "      name\n"
          + "      composites {\n"
          + "        id\n"
          + "        name\n"
          + "      }\n"
          + "    }\n"
          + "  }\n"
          + "  realmId\n"
          + "}\n";

  @Query(user = @UserExpression(login = @StringExpression($val = "login")))
  @SelectionSet(USER_AUTH_SELECTION)
  Mono<User> getUserByLogin(String login);

  @Query(user = @UserExpression(id = @StringExpression($val = "id")))
  @SelectionSet(USER_AUTH_SELECTION)
  Mono<User> getUserById(String id);
}
