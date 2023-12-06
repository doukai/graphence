package io.graphence.core.api;

import io.graphence.core.dao.GroupDao;
import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphence.core.dto.inputObjectType.GroupMutationArguments;
import io.graphoenix.core.operation.ObjectValueWithVariable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@GraphQLApi
@ApplicationScoped
public class GroupApi {

    private final GroupDao groupDao;

    @Inject
    public GroupApi(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    public Mono<GroupMutationArguments> setPath(@Source GroupMutationArguments groupMutationArguments) {
        if (groupMutationArguments.getWhere() != null) {
            if (groupMutationArguments.getParent() != null) {
                if (groupMutationArguments.getParent().getId() != null) {
                    groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getParent().getId() + "/");
                } else if (groupMutationArguments.getParent().getWhere().getId().getVal() != null) {
                    groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getParent().getWhere().getId().getVal() + "/");
                }
                groupMutationArguments.setDeep(groupMutationArguments.getParent().getDeep() + 1);
                return groupDao.getGroupById(groupMutationArguments.getWhere().getId().getVal())
                        .filter(group -> !group.getPath().equals("/"))
                        .flatMap(group ->
                                groupDao.getGroupListByPath(group.getPath() + "%")
                                        .filter(groups -> groups.size() > 0)
                                        .flatMap(groups ->
                                                groupDao.updateGroupList(
                                                        groups.stream()
                                                                .map(item ->
                                                                        ObjectValueWithVariable.of(
                                                                                "id", item.getId(),
                                                                                "name", item.getName(),
                                                                                "path", item.getPath().replaceFirst(group.getPath(), groupMutationArguments.getPath()),
                                                                                "deep", item.getDeep() - group.getDeep() + groupMutationArguments.getDeep()
                                                                        )
                                                                )
                                                                .collect(Collectors.toList())
                                                )
                                        )
                        )
                        .thenReturn(groupMutationArguments);
            }
        } else {
            if (groupMutationArguments.getParent() != null) {
                if (groupMutationArguments.getParent().getId() != null) {
                    groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getParent().getId() + "/");
                } else if (groupMutationArguments.getParent().getWhere().getId().getVal() != null) {
                    groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getParent().getWhere().getId().getVal() + "/");
                }
                groupMutationArguments.setDeep(groupMutationArguments.getParent().getDeep() + 1);
            } else {
                if (groupMutationArguments.getId() == null) {
                    groupMutationArguments.setDeep(0);
                    groupMutationArguments.setPath("/");
                }
            }
        }
        return Mono.just(groupMutationArguments);
    }

    public Mono<GroupInput> setPath(@Source GroupInput groupInput) {
        if (groupInput.getWhere() != null) {
            if (groupInput.getParent() != null) {
                if (groupInput.getParent().getId() != null) {
                    groupInput.setPath(groupInput.getParent().getPath() + groupInput.getParent().getId() + "/");
                } else if (groupInput.getParent().getWhere().getId().getVal() != null) {
                    groupInput.setPath(groupInput.getParent().getPath() + groupInput.getParent().getWhere().getId().getVal() + "/");
                }
                groupInput.setDeep(groupInput.getParent().getDeep() + 1);
                return groupDao.getGroupById(groupInput.getWhere().getId().getVal())
                        .filter(group -> !group.getPath().equals("/"))
                        .flatMap(group ->
                                groupDao.getGroupListByPath(group.getPath() + "%")
                                        .filter(groups -> groups.size() > 0)
                                        .flatMap(groups ->
                                                groupDao.updateGroupList(
                                                        groups.stream()
                                                                .map(item ->
                                                                        ObjectValueWithVariable.of(
                                                                                "id", item.getId(),
                                                                                "name", item.getName(),
                                                                                "path", item.getPath().replaceFirst(group.getPath(), groupInput.getPath()),
                                                                                "deep", item.getDeep() - group.getDeep() + groupInput.getDeep()
                                                                        )
                                                                )
                                                                .collect(Collectors.toList())
                                                )
                                        )
                        )
                        .thenReturn(groupInput);
            }
        } else {
            if (groupInput.getParent() != null) {
                if (groupInput.getParent().getId() != null) {
                    groupInput.setPath(groupInput.getParent().getPath() + groupInput.getParent().getId() + "/");
                } else if (groupInput.getParent().getWhere().getId().getVal() != null) {
                    groupInput.setPath(groupInput.getParent().getPath() + groupInput.getParent().getWhere().getId().getVal() + "/");
                }
                groupInput.setDeep(groupInput.getParent().getDeep() + 1);
            } else {
                if (groupInput.getId() == null) {
                    groupInput.setDeep(0);
                    groupInput.setPath("/");
                }
            }
        }
        return Mono.just(groupInput);
    }
}
