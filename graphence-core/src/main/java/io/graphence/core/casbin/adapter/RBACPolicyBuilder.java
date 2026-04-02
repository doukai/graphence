package io.graphence.core.casbin.adapter;

import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.EMPTY;
import static io.graphence.core.casbin.adapter.RBACAdapter.GROUP_PREFIX;
import static io.graphence.core.casbin.adapter.RBACAdapter.G_TYPE;
import static io.graphence.core.casbin.adapter.RBACAdapter.P_TYPE;
import static io.graphence.core.casbin.adapter.RBACAdapter.ROLE_PREFIX;
import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.casbin.adapter.RBACAdapter.USER_PREFIX;

@ApplicationScoped
public class RBACPolicyBuilder {

  public Stream<Policy> buildPolicies(Set<Role> roles, Set<Group> groups) {
    return Stream.of(
            rolePermissionPolicies(roles),
            roleUserPolicies(roles),
            roleGroupPolicies(roles),
            roleCompositePolicies(roles),
            groupUserPolicies(groups))
        .flatMap(stream -> stream);
  }

  public List<List<String>> buildRolePermissionRules(Role role) {
    return Stream.ofNullable(role.getPermissions())
        .flatMap(Collection::stream)
        .map(permission -> rolePermissionPolicy(role, permission).toStringList())
        .collect(Collectors.toList());
  }

  public List<List<String>> buildRoleGroupingRules(Role role) {
    return Stream.concat(
            Stream.concat(
                Stream.ofNullable(role.getUsers())
                    .flatMap(Collection::stream)
                    .map(user -> userRolePolicy(user, role)),
                Stream.ofNullable(role.getGroups())
                    .flatMap(Collection::stream)
                    .map(group -> groupRolePolicy(group, role))),
            Stream.ofNullable(role.getComposites())
                .flatMap(Collection::stream)
                .map(composite -> roleCompositePolicy(role, composite)))
        .map(Policy::toStringList)
        .collect(Collectors.toList());
  }

  public List<List<String>> buildUserGroupingRules(User user) {
    String realm = realm(user.getRealmId());
    return Stream.concat(
            Stream.ofNullable(user.getRoles())
                .flatMap(Collection::stream)
                .map(role -> userRolePolicy(user, role, realm)),
            Stream.ofNullable(user.getGroups())
                .flatMap(Collection::stream)
                .map(group -> userGroupPolicy(user, group, realm)))
        .map(Policy::toStringList)
        .collect(Collectors.toList());
  }

  public List<List<String>> buildGroupGroupingRules(Group group) {
    String realm = realm(group.getRealmId());
    return Stream.concat(
            Stream.ofNullable(group.getRoles())
                .flatMap(Collection::stream)
                .map(role -> groupRolePolicy(group, role, realm)),
            Stream.ofNullable(group.getUsers())
                .flatMap(Collection::stream)
                .map(user -> userGroupPolicy(user, group, realm)))
        .map(Policy::toStringList)
        .collect(Collectors.toList());
  }

  public List<List<String>> buildPermissionRules(Permission permission) {
    return Stream.ofNullable(permission.getRoles())
        .flatMap(Collection::stream)
        .map(role -> rolePermissionPolicy(role, permission).toStringList())
        .collect(Collectors.toList());
  }

  private Stream<Policy> rolePermissionPolicies(Set<Role> roles) {
    return roles.stream()
        .flatMap(
            role ->
                Stream.ofNullable(role.getPermissions())
                    .flatMap(Collection::stream)
                    .map(permission -> rolePermissionPolicy(role, permission)));
  }

  private Stream<Policy> roleUserPolicies(Set<Role> roles) {
    return roles.stream()
        .flatMap(
            role ->
                Stream.ofNullable(role.getUsers())
                    .flatMap(Collection::stream)
                    .map(user -> userRolePolicy(user, role)));
  }

  private Stream<Policy> roleGroupPolicies(Set<Role> roles) {
    return roles.stream()
        .flatMap(
            role ->
                Stream.ofNullable(role.getGroups())
                    .flatMap(Collection::stream)
                    .map(group -> groupRolePolicy(group, role)));
  }

  private Stream<Policy> roleCompositePolicies(Set<Role> roles) {
    return roles.stream()
        .flatMap(
            role ->
                Stream.ofNullable(role.getComposites())
                    .flatMap(Collection::stream)
                    .map(composite -> roleCompositePolicy(role, composite)));
  }

  private Stream<Policy> groupUserPolicies(Set<Group> groups) {
    return groups.stream()
        .flatMap(
            group ->
                Stream.ofNullable(group.getUsers())
                    .flatMap(Collection::stream)
                    .map(user -> userGroupPolicy(user, group)));
  }

  private Policy rolePermissionPolicy(Role role, Permission permission) {
    return new Policy()
        .setPolicy(P_TYPE)
        .setV0(ROLE_PREFIX + role.getId())
        .setV1(realm(role.getRealmId()))
        .setV2(permission.getType() + SPACER + permission.getField())
        .setV3(permission.getPermissionType().name());
  }

  private Policy userRolePolicy(User user, Role role) {
    return userRolePolicy(user, role, realm(role.getRealmId()));
  }

  private Policy userRolePolicy(User user, Role role, String realm) {
    return new Policy()
        .setPolicy(G_TYPE)
        .setV0(USER_PREFIX + user.getId())
        .setV1(ROLE_PREFIX + role.getId())
        .setV2(realm);
  }

  private Policy groupRolePolicy(Group group, Role role) {
    return groupRolePolicy(group, role, realm(role.getRealmId()));
  }

  private Policy groupRolePolicy(Group group, Role role, String realm) {
    return new Policy()
        .setPolicy(G_TYPE)
        .setV0(GROUP_PREFIX + group.getId())
        .setV1(ROLE_PREFIX + role.getId())
        .setV2(realm);
  }

  private Policy roleCompositePolicy(Role role, Role composite) {
    return new Policy()
        .setPolicy(G_TYPE)
        .setV0(ROLE_PREFIX + role.getId())
        .setV1(ROLE_PREFIX + composite.getId())
        .setV2(realm(role.getRealmId()));
  }

  private Policy userGroupPolicy(User user, Group group) {
    return userGroupPolicy(user, group, realm(group.getRealmId()));
  }

  private Policy userGroupPolicy(User user, Group group, String realm) {
    return new Policy()
        .setPolicy(G_TYPE)
        .setV0(USER_PREFIX + user.getId())
        .setV1(GROUP_PREFIX + group.getId())
        .setV2(realm);
  }

  private String realm(Object realmId) {
    return Optional.ofNullable(realmId).map(String::valueOf).orElse(EMPTY);
  }
}
