package io.graphence.core.dao;

import io.graphence.core.dto.annotation.GroupExpression0;
import io.graphence.core.dto.annotation.GroupInput0;
import io.graphence.core.dto.annotation.IDExpression;
import io.graphence.core.dto.annotation.IntExpression;
import io.graphence.core.dto.objectType.Group;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.MutationOperation;
import io.graphoenix.spi.annotation.QueryOperation;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface GroupDao {

    @QueryOperation(value = "group", selectionSet = "{ id path deep }")
    @GroupExpression0(id = @IDExpression($val = "id"))
    Mono<Group> getGroupById(String id) throws Exception;

    @QueryOperation(value = "groupList", selectionSet = "{ id path deep }")
    @GroupExpression0(parentId = @IntExpression(opr = Operator.LK, $val = "path"))
    Mono<List<Group>> getGroupListByPath(String path) throws Exception;

    @MutationOperation(value = "groupList", selectionSet = "{ id }")
    @GroupInput0($list = "groupList")
    Mono<List<Group>> updateGroupList(List<Group> groupList) throws Exception;
}
