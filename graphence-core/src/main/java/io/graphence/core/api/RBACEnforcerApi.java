package io.graphence.core.api;

import com.google.common.collect.Streams;
import io.graphence.core.casbin.adapter.Policy;
import io.graphence.core.dao.RBACPolicyDao;
import io.graphence.core.dto.objectType.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.*;

@GraphQLApi
@ApplicationScoped
public class RBACEnforcerApi {

    private final Enforcer enforcer;
    private final RBACPolicyDao rbacPolicyDao;

    @Inject
    public RBACEnforcerApi(Enforcer enforcer, RBACPolicyDao rbacPolicyDao) {
        this.enforcer = enforcer;
        this.rbacPolicyDao = rbacPolicyDao;
    }

    @Query
    public List<Policy> policyList() {
        return Stream.concat(
                enforcer.getPolicy().stream().map(p -> new Policy(P_TYPE, p)),
                enforcer.getGroupingPolicy().stream().map(g -> new Policy(G_TYPE, g))
        ).collect(Collectors.toList());
    }

    public Mono<Boolean> syncRolePolicy(@Source Role role) {
        return rbacPolicyDao.queryRoleById(role.getId())
                .map(syncRole -> {
                            enforcer.removeFilteredPolicy(
                                    0,
                                    ROLE_PREFIX + syncRole.getId(),
                                    Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY)
                            );

                            Stream<Policy> permissionPolicyStream = Stream.ofNullable(syncRole.getPermissions())
                                    .flatMap(Collection::stream)
                                    .map(permission ->
                                            new Policy()
                                                    .setPtype(P_TYPE)
                                                    .setV0(ROLE_PREFIX + syncRole.getId())
                                                    .setV1(Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                                    .setV2(permission.getType() + SPACER + permission.getField())
                                                    .setV3(permission.getPermissionType().name())
                                    );

                            enforcer.addPolicies(
                                    permissionPolicyStream
                                            .map(Policy::toStringList)
                                            .collect(Collectors.toList())
                            );

                            enforcer.removeFilteredGroupingPolicy(
                                    0,
                                    "",
                                    ROLE_PREFIX + syncRole.getId(),
                                    Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY)
                            );

                            Stream<Policy> userPolicyStream = Stream.ofNullable(syncRole.getUsers())
                                    .flatMap(Collection::stream)
                                    .map(user ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + syncRole.getId())
                                                    .setV2(Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            Stream<Policy> groupUserPolicyStream = Stream.ofNullable(syncRole.getGroups())
                                    .flatMap(Collection::stream)
                                    .map(group ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(GROUP_PREFIX + group.getId())
                                                    .setV1(ROLE_PREFIX + syncRole.getId())
                                                    .setV2(Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            enforcer.removeFilteredGroupingPolicy(
                                    0,
                                    ROLE_PREFIX + syncRole.getId(),
                                    "",
                                    Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY)
                            );

                            Stream<Policy> roleCompositesPolicyStream = Stream.ofNullable(syncRole.getComposites())
                                    .flatMap(Collection::stream)
                                    .map(composite ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(ROLE_PREFIX + syncRole.getId())
                                                    .setV1(ROLE_PREFIX + composite.getId())
                                                    .setV2(Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            enforcer.addGroupingPolicies(
                                    Streams.concat(userPolicyStream, groupUserPolicyStream, roleCompositesPolicyStream)
                                            .map(Policy::toStringList)
                                            .collect(Collectors.toList())
                            );
                            return true;
                        }
                )
                .onErrorReturn(false);
    }

    public Mono<Boolean> syncUserPolicy(@Source User user) {
        return rbacPolicyDao.queryUserById(user.getId())
                .map(syncUser -> {
                            enforcer.removeFilteredGroupingPolicy(
                                    0,
                                    USER_PREFIX + syncUser.getId(),
                                    "",
                                    Optional.ofNullable(syncUser.getRealmId()).map(String::valueOf).orElse(EMPTY)
                            );

                            Stream<Policy> rolePolicyStream = Stream.ofNullable(syncUser.getRoles())
                                    .flatMap(Collection::stream)
                                    .map(role ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + syncUser.getId())
                                                    .setV1(ROLE_PREFIX + role.getId())
                                                    .setV2(Optional.ofNullable(syncUser.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            Stream<Policy> groupPolicyStream = Stream.ofNullable(syncUser.getGroups())
                                    .flatMap(Collection::stream)
                                    .map(group ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + syncUser.getId())
                                                    .setV1(GROUP_PREFIX + group.getId())
                                                    .setV2(Optional.ofNullable(syncUser.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            enforcer.addGroupingPolicies(
                                    Streams.concat(rolePolicyStream, groupPolicyStream)
                                            .map(Policy::toStringList)
                                            .collect(Collectors.toList())
                            );
                            return true;
                        }
                )
                .onErrorReturn(false);
    }

    public Mono<Boolean> syncGroupPolicy(@Source Group group) {
        return rbacPolicyDao.queryGroupById(group.getId())
                .map(syncGroup -> {
                            enforcer.removeFilteredGroupingPolicy(
                                    0,
                                    GROUP_PREFIX + syncGroup.getId(),
                                    "",
                                    Optional.ofNullable(syncGroup.getRealmId()).map(String::valueOf).orElse(EMPTY)
                            );

                            Stream<Policy> rolePolicyStream = Stream.ofNullable(syncGroup.getRoles())
                                    .flatMap(Collection::stream)
                                    .map(role ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(GROUP_PREFIX + syncGroup.getId())
                                                    .setV1(ROLE_PREFIX + role.getId())
                                                    .setV2(Optional.ofNullable(syncGroup.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            enforcer.removeFilteredGroupingPolicy(
                                    0,
                                    "",
                                    GROUP_PREFIX + syncGroup.getId(),
                                    Optional.ofNullable(syncGroup.getRealmId()).map(String::valueOf).orElse(EMPTY)
                            );

                            Stream<Policy> userPolicyStream = Stream.ofNullable(syncGroup.getUsers())
                                    .flatMap(Collection::stream)
                                    .map(user ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(GROUP_PREFIX + syncGroup.getId())
                                                    .setV2(Optional.ofNullable(syncGroup.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            enforcer.addGroupingPolicies(
                                    Streams.concat(rolePolicyStream, userPolicyStream)
                                            .map(Policy::toStringList)
                                            .collect(Collectors.toList())
                            );
                            return true;
                        }
                )
                .onErrorReturn(false);
    }

    public Mono<Boolean> syncPermissionPolicy(@Source Permission permission) {
        return rbacPolicyDao.queryPermissionByName(permission.getName())
                .map(syncPermission -> {
                            enforcer.removeFilteredPolicy(
                                    0,
                                    "",
                                    "",
                                    syncPermission.getType() + SPACER + syncPermission.getField(),
                                    syncPermission.getPermissionType().name()
                            );

                            enforcer.addPolicies(
                                    Stream.ofNullable(syncPermission.getRoles())
                                            .flatMap(Collection::stream)
                                            .map(role ->
                                                    new Policy()
                                                            .setPtype(P_TYPE)
                                                            .setV0(ROLE_PREFIX + role.getId())
                                                            .setV1(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                                            .setV2(syncPermission.getType() + SPACER + syncPermission.getField())
                                                            .setV3(syncPermission.getPermissionType().name())
                                            )
                                            .map(Policy::toStringList)
                                            .collect(Collectors.toList())
                            );
                            return true;
                        }
                )
                .onErrorReturn(false);
    }

    @Mutation
    public Mono<Boolean> syncPermissionRoleRelationPolicy(String roleId, List<String> permissionNameList, List<String> removedPermissionNameList) {
        return rbacPolicyDao.queryRoleRealmById(roleId)
                .map(role -> {
                            for (String removedPermissionName : removedPermissionNameList) {
                                String[] permissionNamePart = removedPermissionName.split(SPACER);
                                enforcer.removeFilteredPolicy(
                                        0,
                                        ROLE_PREFIX + role.getId(),
                                        Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                        permissionNamePart[0] + SPACER + permissionNamePart[1],
                                        permissionNamePart[2]
                                );
                            }

                            for (String permissionName : permissionNameList) {
                                String[] permissionNamePart = permissionName.split(SPACER);
                                if (!enforcer.hasPolicy(
                                        ROLE_PREFIX + role.getId(),
                                        Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                        permissionNamePart[0] + SPACER + permissionNamePart[1],
                                        permissionNamePart[2])
                                ) {
                                    enforcer.addPolicy(
                                            ROLE_PREFIX + role.getId(),
                                            Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            permissionNamePart[0] + SPACER + permissionNamePart[1],
                                            permissionNamePart[2]
                                    );
                                }
                            }
                            return true;
                        }
                )
                .onErrorReturn(false);
    }
}
