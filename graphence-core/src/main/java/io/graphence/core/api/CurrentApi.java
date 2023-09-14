package io.graphence.core.api;

import io.graphence.core.dao.RBACPolicyDao;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.dto.inputObjectType.*;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@GraphQLApi
@ApplicationScoped
public class CurrentApi {

    private final Provider<Mono<CurrentUser>> currentUserMonoProvider;
    private final RBACPolicyDao rbacPolicyDao;

    @Inject
    public CurrentApi(Provider<Mono<CurrentUser>> currentUserMonoProvider, RBACPolicyDao rbacPolicyDao) {
        this.currentUserMonoProvider = currentUserMonoProvider;
        this.rbacPolicyDao = rbacPolicyDao;
    }

    @Query
    public Mono<CurrentUser> current() {
        return currentUserMonoProvider.get();
    }

    @Query
    public Mono<Set<String>> currentPermissionList() {
        return currentUserMonoProvider.get()
                .flatMap(currentUser -> {
                            try {
                                return rbacPolicyDao.queryRolePermissionsList(currentUser.getId());
                            } catch (Exception exception) {
                                return Mono.error(exception);
                            }
                        }
                )
                .map(roles -> roles.stream().flatMap(this::getPermissions).map(Permission::getName).collect(Collectors.toSet()));
    }

    private Stream<Permission> getPermissions(Role nullableRole) {
        return Stream.ofNullable(nullableRole)
                .flatMap(role ->
                        Stream.concat(
                                role.getPermissions().stream(),
                                Stream.ofNullable(role.getComposites())
                                        .flatMap(Collection::stream)
                                        .flatMap(this::getPermissions)
                        )
                );
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
        return currentUserMonoProvider.get().map(currentUser -> {
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
        ).switchIfEmpty(Mono.just(metaInput));
    }

    public Mono<MetaExpression> invokeMetaExpression(@Source MetaExpression metaExpression) {
        return currentUserMonoProvider.get().map(currentUser -> {
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
        ).switchIfEmpty(Mono.just(metaExpression));
    }
}
