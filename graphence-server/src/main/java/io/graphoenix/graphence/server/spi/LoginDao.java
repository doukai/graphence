package io.graphoenix.graphence.server.spi;

import io.graphoenix.graphence.dto.annotation.StringExpression;
import io.graphoenix.graphence.dto.annotation.UserExpression0;
import io.graphoenix.graphence.dto.objectType.User;
import io.graphoenix.r2dbc.connector.dao.R2DBCOperationDAO;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;

@GraphQLOperation(operationDAO = R2DBCOperationDAO.class)
public interface LoginDao {

    @QueryOperation(value = "user", layers = 1)
    @UserExpression0(login = @StringExpression($val = "login"))
    User getUserByLogin(String login) throws Exception;
}
