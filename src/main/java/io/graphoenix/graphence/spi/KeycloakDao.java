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
    Group getGroupById(String realmId, String id) throws Exception;

    @QueryOperation("groupList")
    @GroupExpression0(realmId = @StringExpression($val = "realmId"))
    Set<Group> getGroupListByRealmId(String realmId) throws Exception;

    @QueryOperation("groupList")
    @GroupExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name")
    )
    Set<Group> searchGroupListByName(String realmId, String name) throws Exception;

    @QueryOperation("groupList")
    @GroupExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name"),
            $offset = "offset"
    )
    Set<Group> searchGroupListByName(String realmId, String name, int offset) throws Exception;

    @QueryOperation("groupList")
    @GroupExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name"),
            $offset = "offset",
            $first = "first"
    )
    Set<Group> searchGroupListByName(String realmId, String name, int offset, int first) throws Exception;

    @QueryOperation("role")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            id = @IDExpression($val = "id")
    )
    Role getRoleById(String realmId, String id) throws Exception;

    @QueryOperation("role")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression($val = "name")
    )
    Role getRoleByName(String realmId, String name) throws Exception;

    @QueryOperation("roleList")
    @RoleExpression0(realmId = @StringExpression($val = "realmId"))
    Set<Role> getRoleListByRealmId(String realmId) throws Exception;

    @QueryOperation("roleList")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name")
    )
    Set<Role> searchRoleListByName(String realmId, String name) throws Exception;

    @QueryOperation("roleList")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name"),
            $offset = "offset"
    )
    Set<Role> searchRoleListByName(String realmId, String name, int offset) throws Exception;

    @QueryOperation("roleList")
    @RoleExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name"),
            $offset = "offset",
            $first = "first"
    )
    Set<Role> searchRoleListByName(String realmId, String name, int offset, int first) throws Exception;

    @QueryOperation("user")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            id = @IDExpression($val = "id")
    )
    User getUserById(String realmId, String id) throws Exception;

    @QueryOperation("user")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            login = @StringExpression($val = "login")
    )
    User getUserByLogin(String realmId, String login) throws Exception;

    @QueryOperation("user")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            email = @StringExpression($val = "email")
    )
    User getUserByEmail(String realmId, String email) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(realmId = @StringExpression($val = "realmId"))
    Set<User> getUserListRealmId(String realmId) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            $offset = "offset"
    )
    Set<User> getUserListRealmId(String realmId, int offset) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            $offset = "offset",
            $first = "first"
    )
    Set<User> getUserListRealmId(String realmId, int offset, int first) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name")
    )
    Set<User> searchUserListByName(String realmId, String name) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name"),
            $offset = "offset"
    )
    Set<User> searchUserListByName(String realmId, String name, int offset) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression($val = "name", skipNull = true),
            lastName = @StringExpression($val = "lastName", skipNull = true),
            email = @StringExpression($val = "email", skipNull = true),
            login = @StringExpression($val = "login", skipNull = true),
            disable = @BooleanExpression($val = "disable", skipNull = true)
    )
    Set<User> searchUserList(String realmId, String name, String lastName, String email, String login, Boolean disable) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression($val = "name", skipNull = true),
            lastName = @StringExpression($val = "lastName", skipNull = true),
            email = @StringExpression($val = "email", skipNull = true),
            login = @StringExpression($val = "login", skipNull = true),
            disable = @BooleanExpression($val = "disable", skipNull = true),
            $offset = "offset"
    )
    Set<User> searchUserList(String realmId, String name, String lastName, String email, String login, Boolean disable, int offset) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression($val = "name", skipNull = true),
            lastName = @StringExpression($val = "lastName", skipNull = true),
            email = @StringExpression($val = "email", skipNull = true),
            login = @StringExpression($val = "login", skipNull = true),
            disable = @BooleanExpression($val = "disable", skipNull = true),
            $offset = "offset",
            $first = "first"
    )
    Set<User> searchUserList(String realmId, String name, String lastName, String email, String login, Boolean disable, int offset, int first) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            name = @StringExpression(opr = Operator.LK, $val = "name"),
            $offset = "offset",
            $first = "first"
    )
    Set<User> searchUserListByName(String realmId, String name, int offset, int first) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            groups = @GroupExpression1(
                    id = @IDExpression($val = "groupId")
            )
    )
    Set<User> getUserListByGroupId(String realmId, String groupId) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            groups = @GroupExpression1(
                    id = @IDExpression($val = "groupId")
            ),
            $offset = "offset"
    )
    Set<User> getUserListByGroupId(String realmId, String groupId, int offset) throws Exception;

    @QueryOperation("userList")
    @UserExpression0(
            realmId = @StringExpression($val = "realmId"),
            groups = @GroupExpression1(
                    id = @IDExpression($val = "groupId")
            ),
            $offset = "offset",
            $first = "first"
    )
    Set<User> getUserListByGroupId(String realmId, String groupId, int offset, int first) throws Exception;
}
