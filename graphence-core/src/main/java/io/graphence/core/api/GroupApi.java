package io.graphence.core.api;

import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphence.core.dto.inputObjectType.GroupMutationArguments;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

@GraphQLApi
@ApplicationScoped
public class GroupApi {

    public GroupMutationArguments setPath(@Source GroupMutationArguments groupMutationArguments) {
        if (groupMutationArguments.getWhere() != null) {
            if (groupMutationArguments.getParent() != null) {
                groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getWhere().getId().getVal() + "/");
                groupMutationArguments.setDeep(groupMutationArguments.getParent().getDeep() + 1);
            } else {
                groupMutationArguments.setDeep(0);
                groupMutationArguments.setPath("/");
            }
        } else {
            if (groupMutationArguments.getParent() != null) {
                groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + groupMutationArguments.getId() + "/");
                groupMutationArguments.setDeep(groupMutationArguments.getParent().getDeep() + 1);
            } else {
                if (groupMutationArguments.getId() == null) {
                    groupMutationArguments.setDeep(0);
                    groupMutationArguments.setPath("/");
                }
            }
        }
        return groupMutationArguments;
    }

    public GroupInput setPath(@Source GroupInput groupInput) {
        if (groupInput.getWhere() != null) {
            if (groupInput.getParent() != null) {
                groupInput.setPath(groupInput.getParent().getPath() + groupInput.getWhere().getId().getVal() + "/");
                groupInput.setDeep(groupInput.getParent().getDeep() + 1);
            } else {
                groupInput.setDeep(0);
                groupInput.setPath("/");
            }
        } else {
            if (groupInput.getParent() != null) {
                groupInput.setPath(groupInput.getParent().getPath() + groupInput.getId() + "/");
                groupInput.setDeep(groupInput.getParent().getDeep() + 1);
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
