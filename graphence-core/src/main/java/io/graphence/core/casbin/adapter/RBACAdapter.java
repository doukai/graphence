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
import java.util.Set;
import java.util.stream.Stream;

import static io.graphence.core.dto.enumType.PermissionLevel.READ;
import static io.graphence.core.dto.enumType.PermissionLevel.WRITE;


@ApplicationScoped
public class RBACAdapter implements Adapter {

    public static final String USER_PREFIX = "U::";

    public static final String ROLE_PREFIX = "R::";

    public static final String SPACER = "::";

    public static final String P_TYPE = "p";

    public static final String G_TYPE = "g";

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
                                    .flatMap(permission ->
                                            permission.getLevel().equals(WRITE) ?
                                                    Stream.of(
                                                            new Rule()
                                                                    .setPtype(P_TYPE)
                                                                    .setV0(ROLE_PREFIX.concat(role.getName()))
                                                                    .setV1(role.getRealmId())
                                                                    .setV2(permission.getField().getOfTypeName().concat(SPACER).concat(permission.getField().getName()))
                                                                    .setV3(READ.name()),
                                                            new Rule()
                                                                    .setPtype(P_TYPE)
                                                                    .setV0(ROLE_PREFIX.concat(role.getName()))
                                                                    .setV1(role.getRealmId())
                                                                    .setV2(permission.getField().getOfTypeName().concat(SPACER).concat(permission.getField().getName()))
                                                                    .setV3(WRITE.name())
                                                    ) :
                                                    Stream.of(
                                                            new Rule()
                                                                    .setPtype(P_TYPE)
                                                                    .setV0(ROLE_PREFIX.concat(role.getName()))
                                                                    .setV1(role.getRealmId())
                                                                    .setV2(permission.getField().getOfTypeName().concat(SPACER).concat(permission.getField().getName()))
                                                                    .setV3(READ.name())
                                                    )
                                    )
                    );

            Stream<Rule> userRuleStream = roles.stream()
                    .flatMap(role ->
                            role.getUsers() == null ?
                                    Stream.empty() :
                                    role.getUsers().stream()
                                            .map(user ->
                                                    new Rule()
                                                            .setPtype(G_TYPE)
                                                            .setV0(USER_PREFIX.concat(user.getLogin()))
                                                            .setV1(ROLE_PREFIX.concat(role.getName()))
                                                            .setV2(user.getRealmId())
                                            )
                    );

            Stream<Rule> roleRuleStream = roles.stream()
                    .flatMap(role ->
                            role.getComposites() == null ?
                                    Stream.empty() :
                                    role.getComposites().stream()
                                            .map(composite ->
                                                    new Rule()
                                                            .setPtype(G_TYPE)
                                                            .setV0(ROLE_PREFIX.concat(role.getName()))
                                                            .setV1(ROLE_PREFIX.concat(composite.getName()))
                                                            .setV2(role.getRealmId())
                                            )
                    );

            Streams.concat(permissionRuleStream, userRuleStream, roleRuleStream).forEach(line -> loadPolicyLine(line, model));

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
