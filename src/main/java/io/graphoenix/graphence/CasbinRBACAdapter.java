package io.graphoenix.graphence;

import io.graphoenix.graphence.spi.RBACPolicyDao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.model.Model;
import org.casbin.jcasbin.persist.Adapter;
import org.casbin.jcasbin.persist.Helper;
import org.tinylog.Logger;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CasbinRBACAdapter implements Adapter {

    private static final String USER_PREFIX = "U::";

    private static final String ROLE_PREFIX = "R::";

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
            rbacPolicyDao.queryRoleList().stream()
                    .flatMap(role -> role.getPermissions().stream())
                    .map(permission ->
                            new CasbinRule()
                            .setPtype(P_TYPE)
                                    .setV0(permission.getRoleId())
                                    .setV1(permission.getRoleId())
                                    .setV2(permission.getRoleId())
                                    .setV3(permission.getRoleId())
                    )
                    .collect(Collectors.toSet());
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
