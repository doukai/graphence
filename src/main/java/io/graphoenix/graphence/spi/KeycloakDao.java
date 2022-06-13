package io.graphoenix.graphence.spi;

import io.graphoenix.graphence.dto.annotation.*;
import io.graphoenix.graphence.dto.enumType.Operator;
import io.graphoenix.graphence.dto.objectType.Group;
import io.graphoenix.graphence.dto.objectType.Role;
import io.graphoenix.graphence.dto.objectType.User;
import io.graphoenix.r2dbc.connector.dao.R2DBCOperationDAO;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.QueryOperation;

import java.util.Set;

@GraphQLOperation(operationDAO = R2DBCOperationDAO.class)
public interface KeycloakDao {

    @QueryOperation("group")
    @GroupExpression0(
            realmId = @StringExpression($val = "realmId"),
            id = @IDExpression($val = "id")
    )
    Group getGroupById(String realmId, String id);

    @QueryOperation("groupList")
    @GroupExpression0(realmId = @StringExpression($val = "realmId"))
    Set<Group> getGroupList(String realmId);

    @QueryOperation("groupList")
    @GroupExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name")
    )
    Set<Group> findGroupListByName(String realmId, String name);

    @QueryOperation("role")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            id = @IDExpression($val = "id")
    )
    Role getRoleById(String realmId, String id);

    @QueryOperation("role")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression($val = "name")
    )
    Role getRoleByName(String realmId, String name);

    @QueryOperation("roleList")
    @RoleExpression0(realmId = @StringExpression($val = "realmId"))
    Set<Role> getRoleList(String realmId);

    @QueryOperation("roleList")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name")
    )
    Set<Role> getRoleListByName(String realmId, String name);

    @QueryOperation("user")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            id = @IDExpression($val = "id")
    )
    User getUserById(String realmId, String id);

    @QueryOperation("user")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            login = @StringExpression($val = "login")
    )
    User getUserByLogin(String realmId, String login);

    @QueryOperation("user")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            email = @StringExpression($val = "email")
    )
    User getUserByEmail(String realmId, String email);

    @QueryOperation("userList")
    @UserExpression0(realmId = @StringExpression($val = "realmId"))
    Set<User> getUserList(String realmId);

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression($val = "name")
    )
    Set<User> findUserListByName(String realmId, String name);

    @QueryOperation("userList")
    @UserExpression0(
            groups = @GroupExpression1(
                    realmId = @StringExpression($val = "realmId"),
                    id = @IDExpression($val = "groupId")
            )
    )
    Set<User> findUserListByGroup(String realmId, String groupId);
}
