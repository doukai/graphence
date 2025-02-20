package io.graphence.core.casbin.adapter;

import com.google.common.collect.Streams;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Role;
import jakarta.enterprise.context.ApplicationScoped;
import org.casbin.jcasbin.model.Model;
import org.casbin.jcasbin.persist.Adapter;
import org.casbin.jcasbin.persist.Helper;
import org.tinylog.Logger;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

@ApplicationScoped
public class RBACAdapter implements Adapter {

    public static final String SPACER = "::";

    public static final String USER_PREFIX = "U" + SPACER;

    public static final String ROLE_PREFIX = "R" + SPACER;

    public static final String GROUP_PREFIX = "G" + SPACER;

    public static final String P_TYPE = "p";

    public static final String G_TYPE = "g";

    public static final String EMPTY = "";

    private Set<Role> roles;

    private Set<Group> groups;

    public RBACAdapter init(Set<Role> roles, Set<Group> groups) {
        this.roles = roles;
        this.groups = groups;
        return this;
    }

    @Override
    public void loadPolicy(Model model) {
        try {
            Stream<Policy> permissionPolicyStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getPermissions())
                                    .flatMap(Collection::stream)
                                    .map(permission ->
                                            new Policy()
                                                    .setPolicy(P_TYPE)
                                                    .setV0(ROLE_PREFIX + role.getId())
                                                    .setV1(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                                    .setV2(permission.getType() + SPACER + permission.getField())
                                                    .setV3(permission.getPermissionType().name())
                                    )
                    );

            Stream<Policy> userPolicyStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getUsers())
                                    .flatMap(Collection::stream)
                                    .map(user ->
                                            new Policy()
                                                    .setPolicy(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + role.getId())
                                                    .setV2(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    )
                    );

            Stream<Policy> groupPolicyStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getGroups())
                                    .flatMap(Collection::stream)
                                    .map(group ->
                                            new Policy()
                                                    .setPolicy(G_TYPE)
                                                    .setV0(GROUP_PREFIX + group.getId())
                                                    .setV1(ROLE_PREFIX + role.getId())
                                                    .setV2(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    )
                    );

            Stream<Policy> roleCompositesPolicyStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getComposites())
                                    .flatMap(Collection::stream)
                                    .map(composite ->
                                            new Policy()
                                                    .setPolicy(G_TYPE)
                                                    .setV0(ROLE_PREFIX + role.getId())
                                                    .setV1(ROLE_PREFIX + composite.getId())
                                                    .setV2(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    )
                    );

            Stream<Policy> userGroupPolicyStream = groups.stream()
                    .flatMap(group ->
                            Stream.ofNullable(group.getUsers())
                                    .flatMap(Collection::stream)
                                    .map(user ->
                                            new Policy()
                                                    .setPolicy(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(GROUP_PREFIX + group.getId())
                                                    .setV2(Optional.ofNullable(group.getRealmId()).map(String::valueOf).orElse(EMPTY))
                                    )
                    );

            Streams.concat(permissionPolicyStream, userPolicyStream, groupPolicyStream, roleCompositesPolicyStream, userGroupPolicyStream)
                    .map(Policy::toString)
                    .distinct()
                    .forEach(line -> Helper.loadPolicyLine(line, model));
        } catch (Exception e) {
            Logger.error(e);
        }
    }

    @Override
    public void savePolicy(Model model) {

    }

    @Override
    public void addPolicy(String sec, String ptype, List<String> rule) {

    }

    @Override
    public void removePolicy(String sec, String ptype, List<String> rule) {

    }

    @Override
    public void removeFilteredPolicy(String sec, String ptype, int fieldIndex, String... fieldValues) {

    }
}
