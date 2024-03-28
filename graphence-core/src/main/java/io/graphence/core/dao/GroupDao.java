package io.graphence.core.dao;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import io.graphoenix.spi.graphql.common.ObjectValueWithVariable;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface GroupDao {

    @Query(group = @GroupQueryArguments(id = @StringExpression1($val = "id")))
    @SelectionSet("{ id path deep }")
    Mono<Group> getGroupById(String id);

    @Query(groupList = @GroupListQueryArguments(path = @StringExpression1(opr = Operator.LK, $val = "path")))
    Mono<List<Group>> getGroupListByPath(String path);

    @Mutation(groupList = @GroupListMutationArguments($list = "groupList"))
    @SelectionSet("{ id }")
    Mono<List<Group>> updateGroupList(List<ObjectValueWithVariable> groupList);
}
