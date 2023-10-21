package io.graphence.core.api;

import com.google.common.collect.Streams;
import io.graphence.core.casbin.RBACEnforcer;
import io.graphence.core.casbin.adapter.Policy;
import io.graphence.core.dao.RBACPolicyDao;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.G_TYPE;
import static io.graphence.core.casbin.adapter.RBACAdapter.P_TYPE;
import static io.graphence.core.casbin.adapter.RBACAdapter.ROLE_PREFIX;
import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.casbin.adapter.RBACAdapter.EMPTY;
import static io.graphence.core.casbin.adapter.RBACAdapter.USER_PREFIX;

@GraphQLApi
@ApplicationScoped
public class RBACEnforcerApi {

    private final RBACEnforcer rbacEnforcer;
    private final RBACPolicyDao rbacPolicyDao;

    @Inject
    public RBACEnforcerApi(RBACEnforcer rbacEnforcer, RBACPolicyDao rbacPolicyDao) {
        this.rbacEnforcer = rbacEnforcer;
        this.rbacPolicyDao = rbacPolicyDao;
    }

    @Query
    public List<Policy> policyList() {
        return Stream.concat(
                rbacEnforcer.getEnforcer().getPolicy().stream().map(p -> new Policy(P_TYPE, p)),
                rbacEnforcer.getEnforcer().getGroupingPolicy().stream().map(g -> new Policy(G_TYPE, g))
        ).collect(Collectors.toList());
    }

    public Mono<Boolean> syncRolePolicy(@Source Role role) {
        return rbacPolicyDao.queryRoleById(role.getId())
                .map(syncRole -> {
                            rbacEnforcer.getEnforcer()
                                    .removeFilteredPolicy(
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

                            rbacEnforcer.getEnforcer()
                                    .addPolicies(
                                            permissionPolicyStream
                                                    .map(Policy::toStringList)
                                                    .collect(Collectors.toList())
                                    );

                            rbacEnforcer.getEnforcer()
                                    .removeFilteredGroupingPolicy(
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
                                    .flatMap(group ->
                                            Stream.ofNullable(group.getUsers())
                                                    .flatMap(Collection::stream)
                                    )
                                    .map(user ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + syncRole.getId())
                                                    .setV2(Optional.ofNullable(syncRole.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            rbacEnforcer.getEnforcer()
                                    .removeFilteredGroupingPolicy(
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

                            rbacEnforcer.getEnforcer()
                                    .addGroupingPolicies(
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
                            rbacEnforcer.getEnforcer()
                                    .removeFilteredGroupingPolicy(
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

                            Stream<Policy> groupRolePolicyStream = Stream.ofNullable(syncUser.getGroups())
                                    .flatMap(Collection::stream)
                                    .flatMap(group ->
                                            Stream.ofNullable(group.getRoles())
                                                    .flatMap(Collection::stream)
                                    )
                                    .map(role ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + syncUser.getId())
                                                    .setV1(ROLE_PREFIX + role.getId())
                                                    .setV2(Optional.ofNullable(syncUser.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    );

                            rbacEnforcer.getEnforcer()
                                    .addGroupingPolicies(
                                            Streams.concat(rolePolicyStream, groupRolePolicyStream)
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
                            Stream.ofNullable(syncGroup.getUsers())
                                    .flatMap(Collection::stream)
                                    .forEach(syncUser -> {
                                                rbacEnforcer.getEnforcer()
                                                        .removeFilteredGroupingPolicy(
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

                                                Stream<Policy> groupRolePolicyStream = Stream.ofNullable(syncUser.getGroups())
                                                        .flatMap(Collection::stream)
                                                        .flatMap(userGroup ->
                                                                Stream.ofNullable(userGroup.getRoles())
                                                                        .flatMap(Collection::stream)
                                                        )
                                                        .map(role ->
                                                                new Policy()
                                                                        .setPtype(G_TYPE)
                                                                        .setV0(USER_PREFIX + syncUser.getId())
                                                                        .setV1(ROLE_PREFIX + role.getId())
                                                                        .setV2(Optional.ofNullable(syncUser.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                                        );

                                                rbacEnforcer.getEnforcer()
                                                        .addGroupingPolicies(
                                                                Streams.concat(rolePolicyStream, groupRolePolicyStream)
                                                                        .map(Policy::toStringList)
                                                                        .collect(Collectors.toList())
                                                        );
                                            }
                                    );
                            return true;
                        }
                )
                .onErrorReturn(false);
    }

    public Mono<Boolean> syncPermissionPolicy(@Source Permission permission) {
        return rbacPolicyDao.queryPermissionByName(permission.getName())
                .map(syncPermission -> {
                            rbacEnforcer.getEnforcer()
                                    .removeFilteredPolicy(
                                            0,
                                            "",
                                            "",
                                            syncPermission.getType() + SPACER + syncPermission.getField(),
                                            syncPermission.getPermissionType().name()
                                    );

                            rbacEnforcer.getEnforcer()
                                    .addPolicies(
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
}
