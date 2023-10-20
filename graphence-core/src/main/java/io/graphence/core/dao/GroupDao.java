package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.core.operation.ObjectValueWithVariable;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.MutationOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface GroupDao {

    @QueryOperation(value = "group", selectionSet = "{ id path deep }")
    @GroupExpression0(id = @IDExpression($val = "id"))
    Mono<Group> getGroupById(String id);

    @QueryOperation(value = "groupList")
    @GroupExpression0(path = @StringExpression(opr = Operator.LK, $val = "path"))
    Mono<List<Group>> getGroupListByPath(String path);

    @MutationOperation(value = "groupList", selectionSet = "{ id }")
    @GroupInput0($list = "groupList")
    Mono<List<Group>> updateGroupList(List<ObjectValueWithVariable> groupList);
}
