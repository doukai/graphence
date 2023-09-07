package io.graphence.core.api;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@GraphQLApi
@ApplicationScoped
public class CurrentApi {

    private final Provider<Mono<CurrentUser>> currentUser;

    @Inject
    public CurrentApi(Provider<Mono<CurrentUser>> currentUser) {
        this.currentUser = currentUser;
    }

    @Query
    @PermitAll
    public Mono<CurrentUser> current() {
        return currentUser.get();
    }

    public Mono<MetaInput> invokeMetaInput(@Source MetaInput metaInput) {
        return currentUser.get().map(currentUser -> {
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

    public Mono<MetaExpression> invokeMetaExpression(@Source MetaExpression metaExpression) {
        return currentUser.get().map(currentUser -> {
                    if (currentUser.getRealmId() != null) {
                        IntExpression intExpression = new IntExpression();
                        intExpression.setVal(currentUser.getRealmId());
                    }
                    return metaExpression;
                }
        );
    }
}
