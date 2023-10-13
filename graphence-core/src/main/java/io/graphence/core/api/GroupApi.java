package io.graphence.core.api;

import io.graphence.core.dao.GroupDao;
import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphence.core.dto.inputObjectType.GroupMutationArguments;
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
                groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getParent().getId() + "/");
                groupMutationArguments.setDeep(groupMutationArguments.getParent().getDeep() + 1);
                try {
                    return groupDao.getGroupById(groupMutationArguments.getWhere().getId().getVal())
                            .flatMap(group -> {
                                        try {
                                            return groupDao.getGroupListByPath(group.getPath() + "%")
                                                    .filter(groups -> groups.size() > 0)
                                                    .flatMap(groups -> {
                                                                try {
                                                                    return groupDao.updateGroupList(
                                                                            groups.stream()
                                                                                    .peek(item -> {
                                                                                                int difference = group.getDeep() - groupMutationArguments.getDeep();
                                                                                                item.setPath(item.getPath().replaceFirst(group.getPath(), groupMutationArguments.getPath()));
                                                                                                item.setDeep(item.getDeep() - difference);
                                                                                            }
                                                                                    )
                                                                                    .collect(Collectors.toList())
                                                                    );
                                                                } catch (Exception e) {
                                                                    throw new RuntimeException(e);
                                                                }
                                                            }
                                                    );
                                        } catch (Exception e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                            )
                            .thenReturn(groupMutationArguments);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            if (groupMutationArguments.getParent() != null) {
                groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getParent().getId() + "/");
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
                groupInput.setPath(groupInput.getParent().getPath() + groupInput.getParent().getId() + "/");
                groupInput.setDeep(groupInput.getParent().getDeep() + 1);
                try {
                    return groupDao.getGroupById(groupInput.getWhere().getId().getVal())
                            .flatMap(group -> {
                                        try {
                                            return groupDao.getGroupListByPath(group.getPath() + "%")
                                                    .filter(groups -> groups.size() > 0)
                                                    .flatMap(groups -> {
                                                                try {
                                                                    return groupDao.updateGroupList(
                                                                            groups.stream()
                                                                                    .peek(item -> {
                                                                                                int difference = group.getDeep() - groupInput.getDeep();
                                                                                                item.setPath(item.getPath().replaceFirst(group.getPath(), groupInput.getPath()));
                                                                                                item.setDeep(item.getDeep() - difference);
                                                                                            }
                                                                                    )
                                                                                    .collect(Collectors.toList())
                                                                    );
                                                                } catch (Exception e) {
                                                                    throw new RuntimeException(e);
                                                                }
                                                            }
                                                    );
                                        } catch (Exception e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                            )
                            .thenReturn(groupInput);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            if (groupInput.getParent() != null) {
                groupInput.setPath(groupInput.getParent().getPath() + groupInput.getParent().getId() + "/");
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
