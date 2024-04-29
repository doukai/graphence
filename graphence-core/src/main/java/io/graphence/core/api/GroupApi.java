package io.graphence.core.api;

import io.graphence.core.dao.GroupDao;
import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphence.core.dto.inputObjectType.GroupMutationArguments;
import io.graphence.core.dto.objectType.Group;
import io.graphoenix.spi.graphql.common.ObjectValueWithVariable;
import io.nozdormu.spi.async.Async;
import io.nozdormu.spi.async.Asyncable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

import java.util.List;
import java.util.stream.Collectors;

@GraphQLApi
@ApplicationScoped
public class GroupApi implements Asyncable {

    private final GroupDao groupDao;

    @Inject
    public GroupApi(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    @Async
    public GroupMutationArguments setPath(@Source GroupMutationArguments groupMutationArguments) {
        if (groupMutationArguments.getWhere() != null) {
            Group group = await(groupDao.getGroupById(groupMutationArguments.getWhere().getId().getVal()));
            if (groupMutationArguments.getParent() != null) {
                if (groupMutationArguments.getParent().getId() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupMutationArguments.getParent().getId()));
                    groupMutationArguments.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupMutationArguments.setDeep(parentGroup.getDeep() + 1);
                } else if (groupMutationArguments.getParent().getWhere().getId().getVal() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupMutationArguments.getParent().getWhere().getId().getVal()));
                    groupMutationArguments.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupMutationArguments.setDeep(parentGroup.getDeep() + 1);
                }
                if (!group.getPath().equals("/")) {
                    List<Group> groups = await(groupDao.getGroupListByPath(group.getPath() + "%"));
                    if (!groups.isEmpty()) {
                        List<ObjectValueWithVariable> orginalSubList = groups.stream()
                                .map(item ->
                                        ObjectValueWithVariable.of(
                                                "id", item.getId(),
                                                "name", item.getName(),
                                                "path", item.getPath().replaceFirst(group.getPath(), groupMutationArguments.getPath()),
                                                "deep", item.getDeep() - group.getDeep() + groupMutationArguments.getDeep()
                                        )
                                )
                                .collect(Collectors.toList());
                        await(groupDao.updateGroupList(orginalSubList));
                    }
                }
            }
            if (groupMutationArguments.getSubGroups() != null) {
                List<ObjectValueWithVariable> subList = groupMutationArguments.getSubGroups().stream()
                        .map(item -> {
                                    ObjectValueWithVariable objectValueWithVariable = ObjectValueWithVariable.of(
                                            "name", item.getName(),
                                            "path", item.getPath().replaceFirst(group.getPath(), groupMutationArguments.getPath()),
                                            "deep", item.getDeep() - group.getDeep() + groupMutationArguments.getDeep()
                                    );
                                    if (item.getId() != null) {
                                        objectValueWithVariable.put("id", item.getId());
                                    } else if (item.getWhere().getId().getVal() != null) {
                                        objectValueWithVariable.put("id", item.getWhere().getId().getVal());
                                    }
                                    return objectValueWithVariable;
                                }
                        )
                        .collect(Collectors.toList());
                await(groupDao.updateGroupList(subList));
            }
            return groupMutationArguments;
        } else {
            if (groupMutationArguments.getParent() != null) {
                if (groupMutationArguments.getParent().getId() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupMutationArguments.getParent().getId()));
                    groupMutationArguments.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupMutationArguments.setDeep(parentGroup.getDeep() + 1);
                } else if (groupMutationArguments.getParent().getWhere().getId().getVal() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupMutationArguments.getParent().getWhere().getId().getVal()));
                    groupMutationArguments.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupMutationArguments.setDeep(parentGroup.getDeep() + 1);
                }
            } else {
                if (groupMutationArguments.getId() == null) {
                    groupMutationArguments.setDeep(0);
                    groupMutationArguments.setPath("/");
                }
            }
        }
        return groupMutationArguments;
    }

    @Async
    public GroupInput setPath(@Source GroupInput groupInput) {
        if (groupInput.getWhere() != null) {
            Group group = await(groupDao.getGroupById(groupInput.getWhere().getId().getVal()));
            if (groupInput.getParent() != null) {
                if (groupInput.getParent().getId() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupInput.getParent().getId()));
                    groupInput.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupInput.setDeep(parentGroup.getDeep() + 1);
                } else if (groupInput.getParent().getWhere().getId().getVal() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupInput.getParent().getWhere().getId().getVal()));
                    groupInput.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupInput.setDeep(parentGroup.getDeep() + 1);
                }
                if (!group.getPath().equals("/")) {
                    List<Group> groups = await(groupDao.getGroupListByPath(group.getPath() + "%"));
                    if (!groups.isEmpty()) {
                        List<ObjectValueWithVariable> orginalSubList = groups.stream()
                                .map(item ->
                                        ObjectValueWithVariable.of(
                                                "id", item.getId(),
                                                "name", item.getName(),
                                                "path", item.getPath().replaceFirst(group.getPath(), groupInput.getPath()),
                                                "deep", item.getDeep() - group.getDeep() + groupInput.getDeep()
                                        )
                                )
                                .collect(Collectors.toList());
                        await(groupDao.updateGroupList(orginalSubList));
                    }
                }
            }
            if (groupInput.getSubGroups() != null) {
                List<ObjectValueWithVariable> subList = groupInput.getSubGroups().stream()
                        .map(item -> {
                                    ObjectValueWithVariable objectValueWithVariable = ObjectValueWithVariable.of(
                                            "name", item.getName(),
                                            "path", item.getPath().replaceFirst(group.getPath(), groupInput.getPath()),
                                            "deep", item.getDeep() - group.getDeep() + groupInput.getDeep()
                                    );
                                    if (item.getId() != null) {
                                        objectValueWithVariable.put("id", item.getId());
                                    } else if (item.getWhere().getId().getVal() != null) {
                                        objectValueWithVariable.put("id", item.getWhere().getId().getVal());
                                    }
                                    return objectValueWithVariable;
                                }
                        )
                        .collect(Collectors.toList());
                await(groupDao.updateGroupList(subList));
            }
            return groupInput;
        } else {
            if (groupInput.getParent() != null) {
                if (groupInput.getParent().getId() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupInput.getParent().getId()));
                    groupInput.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupInput.setDeep(parentGroup.getDeep() + 1);
                } else if (groupInput.getParent().getWhere().getId().getVal() != null) {
                    Group parentGroup = await(groupDao.getGroupById(groupInput.getParent().getWhere().getId().getVal()));
                    groupInput.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                    groupInput.setDeep(parentGroup.getDeep() + 1);
                }
            } else {
                if (groupInput.getId() == null) {
                    groupInput.setDeep(0);
                    groupInput.setPath("/");
                }
            }
        }
        return groupInput;
    }
}
