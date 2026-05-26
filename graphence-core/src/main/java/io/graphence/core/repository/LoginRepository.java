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

  @Query(user = @UserExpression(login = @StringExpression($val = "login")))
  @SelectionSet(
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
          + "  group {\n"
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
          + "}\n")
  Mono<User> getUserByLogin(String login);
}
