package io.graphence.core.api;

import io.graphence.core.dao.RBACPolicyDao;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.dto.inputObjectType.*;
import io.graphence.core.dto.objectType.Permission;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.nozdormu.spi.async.Async;
import io.nozdormu.spi.async.Asyncable;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@GraphQLApi
@ApplicationScoped
public class CurrentApi implements Asyncable {

    private final Provider<Mono<CurrentUser>> currentUserMonoProvider;
    private final RBACPolicyDao rbacPolicyDao;

    @Inject
    public CurrentApi(Provider<Mono<CurrentUser>> currentUserMonoProvider, RBACPolicyDao rbacPolicyDao) {
        this.currentUserMonoProvider = currentUserMonoProvider;
        this.rbacPolicyDao = rbacPolicyDao;
    }

    @Query
    @PermitAll
    public Mono<CurrentUser> current() {
        return currentUserMonoProvider.get();
    }

    @Query
    @PermitAll
    public Mono<Set<String>> currentPermissionTypeList() {
        return currentUserMonoProvider.get()
                .flatMap(currentUser -> rbacPolicyDao.queryPermissionTypeList(currentUser.getRoles()))
                .map(permissionList ->
                        permissionList.stream()
                                .map(Permission::getType)
                                .collect(Collectors.toSet())
                );
    }

    @Query
    @PermitAll
    public Mono<Set<String>> currentPermissionNameListByTypes(Collection<String> types) {
        return currentUserMonoProvider.get()
                .flatMap(currentUser -> rbacPolicyDao.queryPermissionListByTypes(currentUser.getRoles(), types))
                .map(permissionList ->
                        permissionList.stream()
                                .map(Permission::getName)
                                .collect(Collectors.toSet())
                );
    }

    @Async(defaultIfEmpty = "metaInput")
    public MetaInput invokeMetaInput(@Source MetaInput metaInput) {
        CurrentUser currentUser = await(currentUserMonoProvider.get());
        if (!(metaInput instanceof RealmInput ||
                metaInput instanceof RealmMutationArguments ||
                metaInput instanceof RealmListMutationArguments ||
                metaInput instanceof PermissionInput ||
                metaInput instanceof PermissionMutationArguments ||
                metaInput instanceof PermissionListMutationArguments)
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

    @Async(defaultIfEmpty = "metaExpression")
    public MetaExpression invokeMetaExpression(@Source MetaExpression metaExpression) {
        CurrentUser currentUser = await(currentUserMonoProvider.get());
        if (!(metaExpression instanceof RealmExpression ||
                metaExpression instanceof RealmQueryArguments ||
                metaExpression instanceof RealmConnectionQueryArguments ||
                metaExpression instanceof RealmListQueryArguments ||
                metaExpression instanceof PermissionExpression ||
                metaExpression instanceof PermissionQueryArguments ||
                metaExpression instanceof PermissionConnectionQueryArguments ||
                metaExpression instanceof PermissionListQueryArguments)
        ) {
            if (currentUser.getRealmId() != null) {
                IntExpression intExpression = new IntExpression();
                intExpression.setVal(currentUser.getRealmId());
            }
        }
        return metaExpression;
    }
}
