package io.graphence.core.api;

import io.graphence.core.dto.CurrentUser;
import io.graphence.core.dto.inputObjectType.PermissionConnectionQueryTypeArguments;
import io.graphence.core.dto.inputObjectType.PermissionExpression;
import io.graphence.core.dto.inputObjectType.PermissionInput;
import io.graphence.core.dto.inputObjectType.PermissionListMutationTypeArguments;
import io.graphence.core.dto.inputObjectType.PermissionListQueryTypeArguments;
import io.graphence.core.dto.inputObjectType.PermissionMutationTypeArguments;
import io.graphence.core.dto.inputObjectType.PermissionQueryTypeArguments;
import io.graphence.core.dto.inputObjectType.RealmConnectionQueryTypeArguments;
import io.graphence.core.dto.inputObjectType.RealmExpression;
import io.graphence.core.dto.inputObjectType.RealmInput;
import io.graphence.core.dto.inputObjectType.RealmListMutationTypeArguments;
import io.graphence.core.dto.inputObjectType.RealmListQueryTypeArguments;
import io.graphence.core.dto.inputObjectType.RealmMutationTypeArguments;
import io.graphence.core.dto.inputObjectType.RealmQueryTypeArguments;
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
        LocalDateTime now = LocalDateTime.now();
        if (metaInput.getCreateTime() == null) {
            metaInput.setCreateTime(now);
            metaInput.setVersion(0);
        } else {
            metaInput.setUpdateTime(now);
            metaInput.setVersion(metaInput.getVersion() + 1);
        }
        return currentUser.get().map(currentUser -> {
                    if (!(metaInput instanceof RealmInput ||
                            metaInput instanceof RealmMutationTypeArguments ||
                            metaInput instanceof RealmListMutationTypeArguments ||
                            metaInput instanceof PermissionInput ||
                            metaInput instanceof PermissionMutationTypeArguments ||
                            metaInput instanceof PermissionListMutationTypeArguments)
                    ) {
                        if (currentUser.getRealmId() != null) {
                            metaInput.setRealmId(currentUser.getRealmId());
                        }
                    }
                    if (metaInput.getCreateUserId() == null) {
                        metaInput.setCreateUserId(currentUser.getId());
                    } else {
                        metaInput.setUpdateUserId(currentUser.getId());
                    }
                    return metaInput;
                }
        ).switchIfEmpty(Mono.just(metaInput));
    }

    public Mono<MetaExpression> invokeMetaExpression(@Source MetaExpression metaExpression) {
        return currentUser.get().map(currentUser -> {
                    if (!(metaExpression instanceof RealmExpression ||
                            metaExpression instanceof RealmQueryTypeArguments ||
                            metaExpression instanceof RealmConnectionQueryTypeArguments ||
                            metaExpression instanceof RealmListQueryTypeArguments ||
                            metaExpression instanceof PermissionExpression ||
                            metaExpression instanceof PermissionQueryTypeArguments ||
                            metaExpression instanceof PermissionConnectionQueryTypeArguments ||
                            metaExpression instanceof PermissionListQueryTypeArguments)
                    ) {
                        if (currentUser.getRealmId() != null) {
                            IntExpression intExpression = new IntExpression();
                            intExpression.setVal(currentUser.getRealmId());
                        }
                    }
                    return metaExpression;
                }
        ).switchIfEmpty(Mono.just(metaExpression));
    }
}
