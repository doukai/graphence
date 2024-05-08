package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface UserDao {

    @Mutation($user = @UserMutationArguments($us = "groupList"))
    @SelectionSet("{ id }")
    Mono<List<Group>> updateGroupList(List<Group> groupList);
}
