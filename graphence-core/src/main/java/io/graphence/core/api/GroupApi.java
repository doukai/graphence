package io.graphence.core.api;

import io.graphence.core.repository.GroupRepository;
import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphence.core.dto.inputObjectType.GroupMutationArguments;
import io.graphence.core.dto.objectType.Group;
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

    private final GroupRepository groupRepository;

    @Inject
    public GroupApi(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Async
    public GroupMutationArguments syncPathAndDeep(@Source GroupMutationArguments groupMutationArguments) {
        if (groupMutationArguments.getParent() != null) {
            if (groupMutationArguments.getParent().getId() != null || groupMutationArguments.getParent().getWhere() != null && groupMutationArguments.getParent().getWhere().getId().getVal() != null) {
                Group parentGroup = await(groupRepository.getGroupById(groupMutationArguments.getParent().getId() != null ? groupMutationArguments.getParent().getId() : groupMutationArguments.getParent().getWhere().getId().getVal()));
                groupMutationArguments.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                groupMutationArguments.setDeep(parentGroup.getDeep() + 1);
                if (groupMutationArguments.getId() != null || groupMutationArguments.getWhere() != null && groupMutationArguments.getWhere().getId().getVal() != null) {
                    Group group = await(groupRepository.getGroupById(groupMutationArguments.getId() != null ? groupMutationArguments.getId() : groupMutationArguments.getWhere().getId().getVal()));
                    List<Group> subGroups = await(groupRepository.getGroupListByPath(group.getPath() + group.getId() + "/%"));
                    if (!subGroups.isEmpty()) {
                        List<Group> updatedSubGroups = subGroups.stream()
                                .peek(subSubGroup -> {
                                            subSubGroup.setPath(subSubGroup.getPath().replaceFirst(group.getPath(), groupMutationArguments.getPath()));
                                            subSubGroup.setDeep(subSubGroup.getDeep() - group.getDeep() + groupMutationArguments.getDeep());
                                        }
                                )
                                .collect(Collectors.toList());
                        await(groupRepository.updateGroupList(updatedSubGroups));
                    }
                }
            }
        } else if (groupMutationArguments.getId() == null && groupMutationArguments.getWhere() == null) {
            groupMutationArguments.setDeep(0);
            groupMutationArguments.setPath("/");
        }

        if (groupMutationArguments.getSubGroups() != null) {
            if (groupMutationArguments.getId() != null || groupMutationArguments.getWhere() != null && groupMutationArguments.getWhere().getId().getVal() != null) {
                Group groupForSub = await(groupRepository.getGroupById(groupMutationArguments.getId() != null ? groupMutationArguments.getId() : groupMutationArguments.getWhere().getId().getVal()));
                List<Group> originalSubGroups = await(groupRepository.getGroupListByParentId(groupForSub.getId()));
                List<Group> removedSubGroups = originalSubGroups.stream()
                        .filter(subGroup ->
                                groupMutationArguments.getSubGroups().stream()
                                        .noneMatch(subGroupInput ->
                                                subGroupInput.getId() != null &&
                                                        subGroupInput.getId().equals(subGroup.getId()) ||
                                                        subGroupInput.getWhere() != null &&
                                                                subGroupInput.getWhere().getId().getVal().equals(subGroup.getId())
                                        )
                        )
                        .collect(Collectors.toList());
                if (!removedSubGroups.isEmpty()) {
                    for (Group removedSubGroup : removedSubGroups) {
                        List<Group> removedSubSubGroups = await(groupRepository.getGroupListByPath(removedSubGroup.getPath() + removedSubGroup.getId() + "/%"));
                        if (!removedSubSubGroups.isEmpty()) {
                            List<Group> updatedRemovedSubSubGroups = removedSubSubGroups.stream()
                                    .peek(subSubGroup -> {
                                                subSubGroup.setPath(subSubGroup.getPath().replaceFirst(removedSubGroup.getPath(), "/"));
                                                subSubGroup.setDeep(subSubGroup.getDeep() - removedSubGroup.getDeep());
                                            }
                                    )
                                    .collect(Collectors.toList());
                            await(groupRepository.updateGroupList(updatedRemovedSubSubGroups));
                        }
                    }
                    List<Group> updatedRemovedSubGroups = removedSubGroups.stream()
                            .peek(subGroup -> {
                                        subGroup.setDeep(0);
                                        subGroup.setPath("/");
                                    }
                            )
                            .collect(Collectors.toList());
                    await(groupRepository.updateGroupList(updatedRemovedSubGroups));
                }
                for (GroupInput subGroupInput : groupMutationArguments.getSubGroups()) {
                    subGroupInput.setPath(groupForSub.getPath() + groupForSub.getId() + "/");
                    subGroupInput.setDeep(groupForSub.getDeep() + 1);
                    if (subGroupInput.getId() != null || subGroupInput.getWhere() != null && subGroupInput.getWhere().getId().getVal() != null) {
                        Group subGroup = await(groupRepository.getGroupById(subGroupInput.getId() != null ? subGroupInput.getId() : subGroupInput.getWhere().getId().getVal()));
                        List<Group> subSubGroups = await(groupRepository.getGroupListByPath(subGroup.getPath() + subGroup.getId() + "/%"));
                        if (!subSubGroups.isEmpty()) {
                            List<Group> updatedSubSubList = subSubGroups.stream()
                                    .peek(subSubGroup -> {
                                                subSubGroup.setPath(subSubGroup.getPath().replaceFirst(subGroup.getPath(), subGroupInput.getPath()));
                                                subSubGroup.setDeep(subSubGroup.getDeep() - subGroup.getDeep() + subGroupInput.getDeep());
                                            }
                                    )
                                    .collect(Collectors.toList());
                            await(groupRepository.updateGroupList(updatedSubSubList));
                        }
                    }
                }
            }
        }
        return groupMutationArguments;
    }

    @Async
    public GroupInput syncPathAndDeep(@Source GroupInput groupInput) {
        if (groupInput.getParent() != null) {
            if (groupInput.getParent().getId() != null || groupInput.getParent().getWhere() != null && groupInput.getParent().getWhere().getId().getVal() != null) {
                Group parentGroup = await(groupRepository.getGroupById(groupInput.getParent().getId() != null ? groupInput.getParent().getId() : groupInput.getParent().getWhere().getId().getVal()));
                groupInput.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                groupInput.setDeep(parentGroup.getDeep() + 1);
                if (groupInput.getId() != null || groupInput.getWhere() != null && groupInput.getWhere().getId().getVal() != null) {
                    Group group = await(groupRepository.getGroupById(groupInput.getId() != null ? groupInput.getId() : groupInput.getWhere().getId().getVal()));
                    if (!group.getPath().equals("/")) {
                        List<Group> subGroups = await(groupRepository.getGroupListByPath(group.getPath() + group.getId() + "/%"));
                        if (!subGroups.isEmpty()) {
                            List<Group> updatedGroups = subGroups.stream()
                                    .peek(subSubGroup -> {
                                                subSubGroup.setPath(subSubGroup.getPath().replaceFirst(group.getPath(), groupInput.getPath()));
                                                subSubGroup.setDeep(subSubGroup.getDeep() - group.getDeep() + groupInput.getDeep());
                                            }
                                    )
                                    .collect(Collectors.toList());
                            await(groupRepository.updateGroupList(updatedGroups));
                        }
                    }
                }
            }
        } else if (groupInput.getId() == null && groupInput.getWhere() == null) {
            groupInput.setDeep(0);
            groupInput.setPath("/");
        }

        if (groupInput.getSubGroups() != null) {
            if (groupInput.getId() != null || groupInput.getWhere() != null && groupInput.getWhere().getId().getVal() != null) {
                Group groupForSub = await(groupRepository.getGroupById(groupInput.getId() != null ? groupInput.getId() : groupInput.getWhere().getId().getVal()));
                List<Group> originalSubGroups = await(groupRepository.getGroupListByParentId(groupForSub.getId()));
                List<Group> removedSubGroups = originalSubGroups.stream()
                        .filter(subGroup ->
                                groupInput.getSubGroups().stream()
                                        .noneMatch(subGroupInput ->
                                                subGroupInput.getId() != null &&
                                                        subGroupInput.getId().equals(subGroup.getId()) ||
                                                        subGroupInput.getWhere() != null &&
                                                                subGroupInput.getWhere().getId().getVal().equals(subGroup.getId())
                                        )
                        )
                        .collect(Collectors.toList());
                if (!removedSubGroups.isEmpty()) {
                    for (Group removedSubGroup : removedSubGroups) {
                        List<Group> removedSubSubGroups = await(groupRepository.getGroupListByPath(removedSubGroup.getPath() + removedSubGroup.getId() + "/%"));
                        if (!removedSubSubGroups.isEmpty()) {
                            List<Group> updatedRemovedSubSubGroups = removedSubSubGroups.stream()
                                    .peek(subSubGroup -> {
                                                subSubGroup.setPath(subSubGroup.getPath().replaceFirst(removedSubGroup.getPath(), "/"));
                                                subSubGroup.setDeep(subSubGroup.getDeep() - removedSubGroup.getDeep());
                                            }
                                    )
                                    .collect(Collectors.toList());
                            await(groupRepository.updateGroupList(updatedRemovedSubSubGroups));
                        }
                    }
                    List<Group> updatedRemovedSubGroups = removedSubGroups.stream()
                            .peek(subGroup -> {
                                        subGroup.setDeep(0);
                                        subGroup.setPath("/");
                                    }
                            )
                            .collect(Collectors.toList());
                    await(groupRepository.updateGroupList(updatedRemovedSubGroups));
                }
                for (GroupInput subGroupInput : groupInput.getSubGroups()) {
                    subGroupInput.setPath(groupForSub.getPath() + groupForSub.getId() + "/");
                    subGroupInput.setDeep(groupForSub.getDeep() + 1);
                    if (subGroupInput.getId() != null || subGroupInput.getWhere() != null && subGroupInput.getWhere().getId().getVal() != null) {
                        Group subGroup = await(groupRepository.getGroupById(subGroupInput.getId() != null ? subGroupInput.getId() : subGroupInput.getWhere().getId().getVal()));
                        List<Group> subSubGroups = await(groupRepository.getGroupListByPath(subGroup.getPath() + subGroup.getId() + "/%"));
                        if (!subSubGroups.isEmpty()) {
                            List<Group> updatedSubSubGroups = subSubGroups.stream()
                                    .peek(subSubGroup -> {
                                                subSubGroup.setPath(subSubGroup.getPath().replaceFirst(subGroup.getPath(), subGroupInput.getPath()));
                                                subSubGroup.setDeep(subSubGroup.getDeep() - subGroup.getDeep() + subGroupInput.getDeep());
                                            }
                                    )
                                    .collect(Collectors.toList());
                            await(groupRepository.updateGroupList(updatedSubSubGroups));
                        }
                    }
                }
            }
        }
        return groupInput;
    }
}
