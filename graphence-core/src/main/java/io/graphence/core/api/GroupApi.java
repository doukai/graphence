package io.graphence.core.api;

import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphence.core.dto.inputObjectType.GroupMutationTypeArguments;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

@GraphQLApi
@ApplicationScoped
public class GroupApi {

    public GroupMutationTypeArguments setPath(@Source GroupMutationTypeArguments groupMutationTypeArguments) {
        if (groupMutationTypeArguments.getParent() != null && groupMutationTypeArguments.getParent().getPath() != null) {
            groupMutationTypeArguments.setPath(groupMutationTypeArguments.getParent().getPath() + "/" + groupMutationTypeArguments.getId());
            groupMutationTypeArguments.setDeep(groupMutationTypeArguments.getDeep() + 1);
        } else {
            groupMutationTypeArguments.setDeep(0);
        }
        return groupMutationTypeArguments;
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
