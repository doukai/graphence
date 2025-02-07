package io.graphence.core.api;

import io.graphence.core.dto.inputObjectType.GroupInputBase;
import io.graphence.core.repository.GroupRepository;
import io.graphence.core.dto.inputObjectType.GroupInput;
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
    public GroupInputBase syncPathAndDeep(@Source GroupInputBase groupInputBase) {
        if (groupInputBase.getParent() != null) {
            if (groupInputBase.getParent().getId() != null || groupInputBase.getParent().getWhere() != null && groupInputBase.getParent().getWhere().getId().getVal() != null) {
                Group parentGroup = await(groupRepository.getGroupById(groupInputBase.getParent().getId() != null ? groupInputBase.getParent().getId() : groupInputBase.getParent().getWhere().getId().getVal()));
                groupInputBase.setPath(parentGroup.getPath() + parentGroup.getId() + "/");
                groupInputBase.setDeep(parentGroup.getDeep() + 1);
                if (groupInputBase.getId() != null || groupInputBase.getWhere() != null && groupInputBase.getWhere().getId().getVal() != null) {
                    Group group = await(groupRepository.getGroupById(groupInputBase.getId() != null ? groupInputBase.getId() : groupInputBase.getWhere().getId().getVal()));
                    if (!group.getPath().equals("/")) {
                        List<Group> subGroups = await(groupRepository.getGroupListByPath(group.getPath() + group.getId() + "/%"));
                        if (!subGroups.isEmpty()) {
                            List<Group> updatedGroups = subGroups.stream()
                                    .peek(subSubGroup -> {
                                                subSubGroup.setPath(subSubGroup.getPath().replaceFirst(group.getPath(), groupInputBase.getPath()));
                                                subSubGroup.setDeep(subSubGroup.getDeep() - group.getDeep() + groupInputBase.getDeep());
                                            }
                                    )
                                    .collect(Collectors.toList());
                            await(groupRepository.updateGroupList(updatedGroups));
                        }
                    }
                }
            }
        } else if (groupInputBase.getId() == null && groupInputBase.getWhere() == null) {
            groupInputBase.setDeep(0);
            groupInputBase.setPath("/");
        }

        if (groupInputBase.getSubGroups() != null) {
            if (groupInputBase.getId() != null || groupInputBase.getWhere() != null && groupInputBase.getWhere().getId().getVal() != null) {
                Group groupForSub = await(groupRepository.getGroupById(groupInputBase.getId() != null ? groupInputBase.getId() : groupInputBase.getWhere().getId().getVal()));
                List<Group> originalSubGroups = await(groupRepository.getGroupListByParentId(groupForSub.getId()));
                List<Group> removedSubGroups = originalSubGroups.stream()
                        .filter(subGroup ->
                                groupInputBase.getSubGroups().stream()
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
                for (GroupInput subGroupInput : groupInputBase.getSubGroups()) {
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
        return groupInputBase;
    }
}
