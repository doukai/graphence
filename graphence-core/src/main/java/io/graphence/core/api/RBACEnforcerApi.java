package io.graphence.core.api;

import io.graphence.core.casbin.adapter.Policy;
import io.graphence.core.casbin.adapter.RBACAdapter;
import io.graphence.core.casbin.adapter.RBACPolicyBuilder;
import io.graphence.core.repository.RBACPolicyRepository;
import io.graphence.core.dto.objectType.*;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.*;

@GraphQLApi
@ApplicationScoped
public class RBACEnforcerApi {

  private static final Logger logger = LoggerFactory.getLogger(RBACEnforcerApi.class);

  private final Enforcer enforcer;
  private final RBACAdapter rbacAdapter;
  private final RBACPolicyBuilder rbacPolicyBuilder;
  private final RBACPolicyRepository rbacPolicyRepository;

  @Inject
  public RBACEnforcerApi(
      Enforcer enforcer,
      RBACAdapter rbacAdapter,
      RBACPolicyBuilder rbacPolicyBuilder,
      RBACPolicyRepository rbacPolicyRepository) {
    this.enforcer = enforcer;
    this.rbacAdapter = rbacAdapter;
    this.rbacPolicyBuilder = rbacPolicyBuilder;
    this.rbacPolicyRepository = rbacPolicyRepository;
  }

  @Query
  public List<Policy> policyList() {
    return Stream.concat(
            enforcer.getPolicy().stream().map(p -> new Policy(P_TYPE, p)),
            enforcer.getGroupingPolicy().stream().map(g -> new Policy(G_TYPE, g)))
        .collect(Collectors.toList());
  }

  @Mutation
  public Mono<Boolean> syncModelPolicy() {
    return rbacPolicyRepository
        .queryRoleList()
        .flatMap(
            roles ->
                rbacPolicyRepository
                    .queryGroupList()
                    .map(
                        groups -> {
                          try {
                            enforcer.setAdapter(rbacAdapter.init(roles, groups));
                            enforcer.loadPolicy();
                            return true;
                          } catch (Exception e) {
                            logger.error(e.getMessage(), e);
                            return false;
                          }
                        }));
  }

  public Mono<Boolean> syncRolePolicy(@Source Role role) {
    return rbacPolicyRepository
        .queryRoleById(role.getId())
        .map(
            syncRole -> {
              String realm = realm(syncRole.getRealmId());
              enforcer.removeFilteredPolicy(
                  0, ROLE_PREFIX + syncRole.getId(), realm);

              addPoliciesIfPresent(rbacPolicyBuilder.buildRolePermissionRules(syncRole));

              enforcer.removeFilteredGroupingPolicy(0, "", ROLE_PREFIX + syncRole.getId(), realm);

              enforcer.removeFilteredGroupingPolicy(0, ROLE_PREFIX + syncRole.getId(), "", realm);

              addGroupingPoliciesIfPresent(rbacPolicyBuilder.buildRoleGroupingRules(syncRole));
              return true;
            })
        .onErrorReturn(false);
  }

  public Mono<Boolean> syncUserPolicy(@Source User user) {
    return rbacPolicyRepository
        .queryUserById(user.getId())
        .map(
            syncUser -> {
              String realm = realm(syncUser.getRealmId());
              enforcer.removeFilteredGroupingPolicy(
                  0, USER_PREFIX + syncUser.getId(), "", realm);
              addGroupingPoliciesIfPresent(rbacPolicyBuilder.buildUserGroupingRules(syncUser));
              return true;
            })
        .onErrorReturn(false);
  }

  public Mono<Boolean> syncGroupPolicy(@Source Group group) {
    return rbacPolicyRepository
        .queryGroupById(group.getId())
        .map(
            syncGroup -> {
              String realm = realm(syncGroup.getRealmId());
              enforcer.removeFilteredGroupingPolicy(
                  0, GROUP_PREFIX + syncGroup.getId(), "", realm);

              enforcer.removeFilteredGroupingPolicy(0, "", GROUP_PREFIX + syncGroup.getId(), realm);
              addGroupingPoliciesIfPresent(rbacPolicyBuilder.buildGroupGroupingRules(syncGroup));
              return true;
            })
        .onErrorReturn(false);
  }

  public Mono<Boolean> syncPermissionPolicy(@Source Permission permission) {
    return rbacPolicyRepository
        .queryPermissionByName(permission.getName())
        .map(
            syncPermission -> {
              enforcer.removeFilteredPolicy(
                  0,
                  "",
                  "",
                  syncPermission.getType() + SPACER + syncPermission.getField(),
                  syncPermission.getPermissionType().name());

              addPoliciesIfPresent(
                  rbacPolicyBuilder.buildPermissionRules(syncPermission));
              return true;
            })
        .onErrorReturn(false);
  }

  @Mutation
  public Mono<Boolean> syncPermissionRoleRelationPolicy(
      String roleId, List<String> permissionNameList, List<String> removedPermissionNameList) {
    return rbacPolicyRepository
        .queryRoleRealmById(roleId)
        .map(
            role -> {
              String realm = realm(role.getRealmId());
              for (String removedPermissionName :
                  Optional.ofNullable(removedPermissionNameList).orElse(Collections.emptyList())) {
                String[] permissionNamePart = splitPermissionName(removedPermissionName);
                if (permissionNamePart == null) {
                  logger.warn("ignore invalid removed permission name: {}", removedPermissionName);
                  continue;
                }
                enforcer.removeFilteredPolicy(
                    0,
                    ROLE_PREFIX + role.getId(),
                    realm,
                    permissionNamePart[0] + SPACER + permissionNamePart[1],
                    permissionNamePart[2]);
              }

              for (String permissionName :
                  Optional.ofNullable(permissionNameList).orElse(Collections.emptyList())) {
                String[] permissionNamePart = splitPermissionName(permissionName);
                if (permissionNamePart == null) {
                  logger.warn("ignore invalid permission name: {}", permissionName);
                  continue;
                }
                if (!enforcer.hasPolicy(
                    ROLE_PREFIX + role.getId(),
                    realm,
                    permissionNamePart[0] + SPACER + permissionNamePart[1],
                    permissionNamePart[2])) {
                  enforcer.addPolicy(
                      ROLE_PREFIX + role.getId(),
                      realm,
                      permissionNamePart[0] + SPACER + permissionNamePart[1],
                      permissionNamePart[2]);
                }
              }
              return true;
            })
        .onErrorReturn(false);
  }

  private void addPoliciesIfPresent(List<List<String>> policies) {
    if (!policies.isEmpty()) {
      enforcer.addPolicies(policies);
    }
  }

  private void addGroupingPoliciesIfPresent(List<List<String>> policies) {
    if (!policies.isEmpty()) {
      enforcer.addGroupingPolicies(policies);
    }
  }

  private String realm(Object realmId) {
    return Optional.ofNullable(realmId).map(String::valueOf).orElse(EMPTY);
  }

  private String[] splitPermissionName(String permissionName) {
    if (permissionName == null) {
      return null;
    }
    String[] parts = permissionName.split(SPACER, 3);
    return parts.length == 3 ? parts : null;
  }
}
