package io.graphence.core.repository;

import io.graphence.core.dto.annotation.*;
import io.graphence.core.dto.objectType.Group;
import io.graphoenix.core.dto.annotation.StringExpression;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.GraphQLOperation;
import io.graphoenix.spi.annotation.SelectionSet;
import reactor.core.publisher.Mono;

import java.util.List;

@GraphQLOperation
public interface GroupRepository {

    @Query(group = @GroupQueryArguments(id = @StringExpression($val = "id")))
    @SelectionSet("{ id path deep }")
    Mono<Group> getGroupById(String id);

    @Query(groupList = @GroupListQueryArguments(parentId = @StringExpression($val = "parentId")))
    Mono<List<Group>> getGroupListByParentId(String parentId);

    @Query(groupList = @GroupListQueryArguments(path = @StringExpression(opr = Operator.LK, $val = "path")))
    Mono<List<Group>> getGroupListByPath(String path);

    @Mutation(groupList = @GroupListMutationArguments($list = "groupList"))
    @SelectionSet("{ id }")
    Mono<List<Group>> updateGroupList(List<Group> groupList);
}
