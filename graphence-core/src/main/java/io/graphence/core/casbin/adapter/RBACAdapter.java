package io.graphence.core.casbin.adapter;

import com.google.common.collect.Streams;
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

import static io.graphence.core.dto.enumType.PermissionType.READ;
import static io.graphence.core.dto.enumType.PermissionType.WRITE;

@ApplicationScoped
public class RBACAdapter implements Adapter {

    public static final String USER_PREFIX = "U::";

    public static final String ROLE_PREFIX = "R::";

    public static final String SPACER = "::";

    public static final String P_TYPE = "p";

    public static final String G_TYPE = "g";

    public static final String UNDEFINED = "undefined";

    private Set<Role> roles;

    public RBACAdapter setRoles(Set<Role> roles) {
        this.roles = roles;
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
                                                    .setPtype(P_TYPE)
                                                    .setV0(ROLE_PREFIX + role.getName())
                                                    .setV1(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
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
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + role.getName())
                                                    .setV2(Optional.ofNullable(user.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                    )
                    );

            Stream<Policy> groupUserPolicyStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getGroups())
                                    .flatMap(Collection::stream)
                                    .flatMap(group ->
                                            Stream.ofNullable(group.getUsers())
                                                    .flatMap(Collection::stream)
                                    )
                                    .map(user ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + role.getName())
                                                    .setV2(Optional.ofNullable(user.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                    )
                    );

            Stream<Policy> roleCompositesPolicyStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getComposites())
                                    .flatMap(Collection::stream)
                                    .map(composite ->
                                            new Policy()
                                                    .setPtype(G_TYPE)
                                                    .setV0(ROLE_PREFIX + role.getName())
                                                    .setV1(ROLE_PREFIX + composite.getName())
                                                    .setV2(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                    )
                    );

            Streams.concat(permissionPolicyStream, userPolicyStream, groupUserPolicyStream, roleCompositesPolicyStream)
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
