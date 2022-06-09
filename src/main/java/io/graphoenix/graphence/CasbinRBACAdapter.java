package io.graphoenix.graphence;

import com.google.common.collect.Streams;
import io.graphoenix.graphence.dto.objectType.Role;
import io.graphoenix.graphence.spi.RBACPolicyDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.model.Model;
import org.casbin.jcasbin.persist.Adapter;
import org.casbin.jcasbin.persist.Helper;
import org.tinylog.Logger;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static io.graphoenix.graphence.dto.enumType.PermissionLevel.READ;
import static io.graphoenix.graphence.dto.enumType.PermissionLevel.WRITE;

@ApplicationScoped
public class CasbinRBACAdapter implements Adapter {

    private static final String USER_PREFIX = "U::";

    private static final String ROLE_PREFIX = "R::";

    private static final String SPACER = "::";

    private static final String P_TYPE = "p";

    private static final String G_TYPE = "g";

    private final RBACPolicyDao rbacPolicyDao;

    @Inject
    public CasbinRBACAdapter(RBACPolicyDao rbacPolicyDao) {
        this.rbacPolicyDao = rbacPolicyDao;
    }

    @Override
    public void loadPolicy(Model model) {
        try {
            Set<Role> roles = rbacPolicyDao.queryRoleList();

            Stream<CasbinRule> permissionRuleStream = roles.stream()
                    .flatMap(role ->
                            role.getPermissions() == null ?
                                    Stream.empty() :
                                    role.getPermissions().stream()
                                            .flatMap(permission ->
                                                    permission.getLevel().equals(WRITE) ?
                                                            Stream.of(
                                                                    new CasbinRule()
                                                                            .setPtype(P_TYPE)
                                                                            .setV0(role.getId())
                                                                            .setV1(permission.getDomainId())
                                                                            .setV2(permission.getField().getOfTypeName().concat(SPACER).concat(permission.getField().getName()))
                                                                            .setV3(READ.name()),
                                                                    new CasbinRule()
                                                                            .setPtype(P_TYPE)
                                                                            .setV0(role.getId())
                                                                            .setV1(permission.getDomainId())
                                                                            .setV2(permission.getField().getOfTypeName().concat(SPACER).concat(permission.getField().getName()))
                                                                            .setV3(WRITE.name())
                                                            ) :
                                                            Stream.of(
                                                                    new CasbinRule()
                                                                            .setPtype(P_TYPE)
                                                                            .setV0(role.getId())
                                                                            .setV1(permission.getDomainId())
                                                                            .setV2(permission.getField().getOfTypeName().concat(SPACER).concat(permission.getField().getName()))
                                                                            .setV3(READ.name())
                                                            )
                                            )
                    );


            Stream<CasbinRule> userRuleStream = roles.stream()
                    .flatMap(role ->
                            role.getUsers() == null ?
                                    Stream.empty() :
                                    role.getUsers().stream()
                                            .map(user ->
                                                    new CasbinRule()
                                                            .setPtype(G_TYPE)
                                                            .setV0(USER_PREFIX.concat(user.getId()))
                                                            .setV1(role.getId())
                                                            .setV2(user.getDomainId())
                                            )
                    );

            Stream<CasbinRule> roleRuleStream = roles.stream()
                    .flatMap(role ->
                            role.getParents() == null ?
                                    Stream.empty() :
                                    role.getParents().stream()
                                            .map(parent ->
                                                    new CasbinRule()
                                                            .setPtype(G_TYPE)
                                                            .setV0(ROLE_PREFIX.concat(role.getId()))
                                                            .setV1(parent.getId())
                                                            .setV2(role.getDomainId())
                                            )
                    );

            Streams.concat(permissionRuleStream, userRuleStream, roleRuleStream).forEach(line -> loadPolicyLine(line, model));

        } catch (Exception e) {
            Logger.error(e);
        }
    }

    private static void loadPolicyLine(CasbinRule line, Model model) {
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
