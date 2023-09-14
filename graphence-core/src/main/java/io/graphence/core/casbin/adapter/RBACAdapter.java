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
            Stream<Rule> permissionRuleStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getPermissions())
                                    .flatMap(Collection::stream)
                                    .flatMap(permission -> {
                                                if (permission.getPermissionType().equals(WRITE)) {
                                                    return Stream.of(
                                                            new Rule()
                                                                    .setPtype(P_TYPE)
                                                                    .setV0(ROLE_PREFIX + role.getName())
                                                                    .setV1(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                                                    .setV2(permission.getType() + SPACER + permission.getField())
                                                                    .setV3(WRITE.name()),
                                                            new Rule()
                                                                    .setPtype(P_TYPE)
                                                                    .setV0(ROLE_PREFIX + role.getName())
                                                                    .setV1(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                                                    .setV2(permission.getType() + SPACER + permission.getField())
                                                                    .setV3(READ.name())
                                                    );
                                                } else if (permission.getPermissionType().equals(READ)) {
                                                    return Stream.of(
                                                            new Rule()
                                                                    .setPtype(P_TYPE)
                                                                    .setV0(ROLE_PREFIX + role.getName())
                                                                    .setV1(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                                                    .setV2(permission.getType() + SPACER + permission.getField())
                                                                    .setV3(READ.name())
                                                    );
                                                } else {
                                                    return Stream.empty();
                                                }
                                            }
                                    )
                    );

            Stream<Rule> userRuleStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getUsers())
                                    .flatMap(Collection::stream)
                                    .map(user ->
                                            new Rule()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + role.getName())
                                                    .setV2(Optional.ofNullable(user.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                    )
                    );


            Stream<Rule> groupUserRuleStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getGroups())
                                    .flatMap(Collection::stream)
                                    .flatMap(group ->
                                            Stream.ofNullable(group.getUsers())
                                                    .flatMap(Collection::stream)
                                    )
                                    .map(user ->
                                            new Rule()
                                                    .setPtype(G_TYPE)
                                                    .setV0(USER_PREFIX + user.getId())
                                                    .setV1(ROLE_PREFIX + role.getName())
                                                    .setV2(Optional.ofNullable(user.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                    )
                    );

            Stream<Rule> roleRuleStream = roles.stream()
                    .flatMap(role ->
                            Stream.ofNullable(role.getComposites())
                                    .flatMap(Collection::stream)
                                    .map(composite ->
                                            new Rule()
                                                    .setPtype(G_TYPE)
                                                    .setV0(ROLE_PREFIX + role.getName())
                                                    .setV1(ROLE_PREFIX + composite.getName())
                                                    .setV2(Optional.ofNullable(role.getRealmId()).map(String::valueOf).orElse(UNDEFINED))
                                    )
                    );

            Streams.concat(permissionRuleStream, userRuleStream, groupUserRuleStream, roleRuleStream).forEach(line -> loadPolicyLine(line, model));

        } catch (Exception e) {
            Logger.error(e);
        }
    }

    private static void loadPolicyLine(Rule line, Model model) {
        String lineText = line.getPtype();
        if (line.getV0() != null) {
            lineText += ", " + line.getV0();
        }
        if (line.getV1() != null) {
            lineText += ", " + line.getV1();
        }
        if (line.getV2() != null) {
            lineText += ", " + line.getV2();
        }
        if (line.getV3() != null) {
            lineText += ", " + line.getV3();
        }
        if (line.getV4() != null) {
            lineText += ", " + line.getV4();
        }
        if (line.getV5() != null) {
            lineText += ", " + line.getV5();
        }
        Helper.loadPolicyLine(lineText, model);
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
