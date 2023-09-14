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
        if (groupMutationArguments.getParent() != null && groupMutationArguments.getParent().getPath() != null) {
            groupMutationArguments.setPath(groupMutationArguments.getParent().getPath() + "/" + groupMutationArguments.getId());
            groupMutationArguments.setDeep(groupMutationArguments.getDeep() + 1);
        } else {
            groupMutationArguments.setDeep(0);
        }
        return groupMutationArguments;
    }

    public GroupInput setPath(@Source GroupInput groupInput) {
        if (groupInput.getParent() != null && groupInput.getParent().getPath() != null) {
            groupInput.setPath(groupInput.getParent().getPath() + "/" + groupInput.getId());
            groupInput.setDeep(groupInput.getDeep() + 1);
        } else {
            groupInput.setDeep(0);
        }
        return groupInput;
    }
}
