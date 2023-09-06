package io.graphence.core.meta;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@ApplicationScoped
@GraphQLApi
public class UserInputInvoker {

    private final Provider<Mono<CurrentUser>> currentUserMonoProvider;

    @Inject
    public UserInputInvoker(Provider<Mono<CurrentUser>> currentUserMonoProvider) {
        this.currentUserMonoProvider = currentUserMonoProvider;
    }

    public Mono<MetaInput> invoke(@Source MetaInput metaInput) {
        return currentUserMonoProvider.get().map(currentUser -> {
                    if (currentUser.getRealmId() != null) {
                        metaInput.setRealmId(currentUser.getRealmId());
                    }
                    LocalDateTime now = LocalDateTime.now();
                    if (metaInput.getCreateUserId() == null) {
                        metaInput.setCreateUserId(currentUser.getId());
                        metaInput.setCreateTime(now);
                        metaInput.setVersion(0);
                    } else {
                        metaInput.setUpdateUserId(currentUser.getId());
                        metaInput.setUpdateTime(now);
                        metaInput.setVersion(metaInput.getVersion() + 1);
                    }
                    return metaInput;
                }
        );
    }

    public Mono<MetaExpression> invoke(@Source MetaExpression metaExpression) {
        return currentUserMonoProvider.get().map(currentUser -> {
                    if (currentUser.getRealmId() != null) {
                        IntExpression intExpression = new IntExpression();
                        intExpression.setVal(currentUser.getRealmId());
                    }
                    return metaExpression;
                }
        );
    }
}
