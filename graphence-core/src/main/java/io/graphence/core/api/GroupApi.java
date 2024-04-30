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
                        List<ObjectValueWithVariable> originalSubList = groups.stream()
                                .map(item ->
                                        ObjectValueWithVariable.of(
                                                "id", item.getId(),
                                                "name", item.getName(),
                                                "path", item.getPath().replaceFirst(group.getPath(), groupMutationArguments.getPath()),
                                                "deep", item.getDeep() - group.getDeep() + groupMutationArguments.getDeep()
                                        )
                                )
                                .collect(Collectors.toList());
                        await(groupDao.updateGroupList(originalSubList));
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
            return groupMutationArguments;
        }
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
                        List<ObjectValueWithVariable> originalSubList = groups.stream()
                                .map(item ->
                                        ObjectValueWithVariable.of(
                                                "id", item.getId(),
                                                "name", item.getName(),
                                                "path", item.getPath().replaceFirst(group.getPath(), groupInput.getPath()),
                                                "deep", item.getDeep() - group.getDeep() + groupInput.getDeep()
                                        )
                                )
                                .collect(Collectors.toList());
                        await(groupDao.updateGroupList(originalSubList));
                    }
                }
            }
            if (groupInput.getSubGroups() != null) {
                for (GroupInput subGroupInput : groupInput.getSubGroups()) {
                    if (subGroupInput.getId() != null) {
                        Group subGroup = await(groupDao.getGroupById(subGroupInput.getId()));
                        subGroupInput.setPath(group.getPath() + group.getId() + "/");
                        subGroupInput.setDeep(group.getDeep() + 1);
                        List<Group> subSubGroups = await(groupDao.getGroupListByPath(subGroup.getPath() + "%"));
                        if (!subSubGroups.isEmpty()) {
                            List<ObjectValueWithVariable> originalSubSubList = subSubGroups.stream()
                                    .map(item ->
                                            ObjectValueWithVariable.of(
                                                    "id", item.getId(),
                                                    "name", item.getName(),
                                                    "path", item.getPath().replaceFirst(subGroup.getPath(), subGroupInput.getPath()),
                                                    "deep", item.getDeep() - subGroup.getDeep() + subGroupInput.getDeep()
                                            )
                                    )
                                    .collect(Collectors.toList());
                            await(groupDao.updateGroupList(originalSubSubList));
                        }
                    } else if (subGroupInput.getWhere().getId().getVal() != null) {
                        Group subGroup = await(groupDao.getGroupById(subGroupInput.getWhere().getId().getVal()));
                        subGroupInput.setPath(group.getPath() + group.getId() + "/");
                        subGroupInput.setDeep(group.getDeep() + 1);
                        List<Group> subSubGroups = await(groupDao.getGroupListByPath(subGroup.getPath() + "%"));
                        if (!subSubGroups.isEmpty()) {
                            List<ObjectValueWithVariable> originalSubSubList = subSubGroups.stream()
                                    .map(item ->
                                            ObjectValueWithVariable.of(
                                                    "id", item.getId(),
                                                    "name", item.getName(),
                                                    "path", item.getPath().replaceFirst(subGroup.getPath(), subGroupInput.getPath()),
                                                    "deep", item.getDeep() - subGroup.getDeep() + subGroupInput.getDeep()
                                            )
                                    )
                                    .collect(Collectors.toList());
                            await(groupDao.updateGroupList(originalSubSubList));
                        }
                    }
                }
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
            return groupInput;
        }
    }
}
