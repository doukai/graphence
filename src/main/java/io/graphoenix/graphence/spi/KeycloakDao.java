package io.graphoenix.graphence.spi;

import io.graphoenix.graphence.dto.annotation.GroupExpression0;
import io.graphoenix.graphence.dto.annotation.GroupExpression1;
import io.graphoenix.graphence.dto.annotation.GroupExpressions0;
import io.graphoenix.graphence.dto.annotation.GroupExpressions1;
import io.graphoenix.graphence.dto.annotation.RoleExpression0;
import io.graphoenix.graphence.dto.annotation.RoleExpressions0;
import io.graphoenix.graphence.dto.annotation.UserExpression0;
import io.graphoenix.graphence.dto.annotation.UserExpressions0;
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
    @GroupExpressions0({
            @GroupExpression0($realmId = "realmId"),
            @GroupExpression0($id = "id")
    })
    Group getGroupById(String realmId, String id);

    @QueryOperation("groupList")
    @GroupExpression0(realmId = "realmId")
    Set<Group> getGroupList(String realmId);

    @QueryOperation("groupList")
    @GroupExpressions0({
            @GroupExpression0(realmId = "realmId"),
            @GroupExpression0(opr = Operator.LK, $name = "name")
    })
    Set<Group> findGroupListByName(String realmId, String name);

    @QueryOperation("role")
    @RoleExpressions0({
            @RoleExpression0($realmId = "realmId"),
            @RoleExpression0($id = "id")
    })
    Role getRoleById(String realmId, String id);

    @QueryOperation("role")
    @RoleExpressions0({
            @RoleExpression0($realmId = "realmId"),
            @RoleExpression0($name = "name")
    })
    Role getRoleByName(String realmId, String name);

    @QueryOperation("roleList")
    @RoleExpression0(realmId = "realmId")
    Set<Role> getRoleList(String realmId);

    @QueryOperation("roleList")
    @RoleExpressions0({
            @RoleExpression0(realmId = "realmId"),
            @RoleExpression0(opr = Operator.LK, $name = "name")
    })
    Set<Role> getRoleListByName(String realmId, String name);

    @QueryOperation("user")
    @UserExpressions0({
            @UserExpression0($realmId = "realmId"),
            @UserExpression0($id = "id")
    })
    User getUserById(String realmId, String id);

    @QueryOperation("user")
    @UserExpressions0({
            @UserExpression0($realmId = "realmId"),
            @UserExpression0($login = "login")
    })
    User getUserByLogin(String realmId, String login);

    @QueryOperation("user")
    @UserExpressions0({
            @UserExpression0($realmId = "realmId"),
            @UserExpression0($email = "email")
    })
    User getUserByEmail(String realmId, String email);

    @QueryOperation("userList")
    @UserExpression0(realmId = "realmId")
    Set<User> getUserList(String realmId);

    @QueryOperation("userList")
    @UserExpressions0({
            @UserExpression0(realmId = "realmId"),
            @UserExpression0(opr = Operator.LK, $name = "name")
    })
    Set<User> findUserListByName(String realmId, String name);

    @QueryOperation("userList")
    @UserExpressions0({
            @UserExpression0(
                    groups = @GroupExpressions1({
                            @GroupExpression1(realmId = "realmId"),
                            @GroupExpression1(id = "groupId"),
                    })
            )
    })
    Set<User> findUserListByGroup(String realmId, String groupId);
}
