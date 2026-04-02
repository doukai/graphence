package io.graphence.core.casbin.adapter;

import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Role;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.model.Model;
import org.casbin.jcasbin.persist.Adapter;
import org.casbin.jcasbin.persist.Helper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@ApplicationScoped
public class RBACAdapter implements Adapter {

  private static final Logger logger = LoggerFactory.getLogger(RBACAdapter.class);

  public static final String SPACER = "::";

  public static final String USER_PREFIX = "U" + SPACER;

  public static final String ROLE_PREFIX = "R" + SPACER;

  public static final String GROUP_PREFIX = "G" + SPACER;

  public static final String P_TYPE = "p";

  public static final String G_TYPE = "g";

  public static final String EMPTY = "";

  private final RBACPolicyBuilder rbacPolicyBuilder;

  private Set<Role> roles;

  private Set<Group> groups;

  @Inject
  public RBACAdapter(RBACPolicyBuilder rbacPolicyBuilder) {
    this.rbacPolicyBuilder = rbacPolicyBuilder;
  }

  public RBACAdapter init(Set<Role> roles, Set<Group> groups) {
    this.roles = Optional.ofNullable(roles).orElseGet(Collections::emptySet);
    this.groups = Optional.ofNullable(groups).orElseGet(Collections::emptySet);
    return this;
  }

  @Override
  public void loadPolicy(Model model) {
    try {
      rbacPolicyBuilder
          .buildPolicies(roles, groups)
          .map(Policy::toString)
          .distinct()
          .forEach(line -> Helper.loadPolicyLine(line, model));
    } catch (Exception e) {
      logger.error("failed to load rbac policy", e);
      throw e;
    }
  }

  @Override
  public void savePolicy(Model model) {}

  @Override
  public void addPolicy(String sec, String ptype, List<String> rule) {}

  @Override
  public void removePolicy(String sec, String ptype, List<String> rule) {}

  @Override
  public void removeFilteredPolicy(
      String sec, String ptype, int fieldIndex, String... fieldValues) {}
}
