package io.graphence.core.service;

import io.graphence.core.dto.Current;
import io.graphence.core.dto.enumType.PermissionType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.casbin.jcasbin.main.Enforcer;

import java.util.Optional;

import static io.graphence.core.casbin.adapter.RBACAdapter.EMPTY;
import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.casbin.adapter.RBACAdapter.USER_PREFIX;
import static io.graphence.core.dto.enumType.PermissionType.ANY;

@ApplicationScoped
public class RBACPermissionService {

  private final Enforcer enforcer;

  @Inject
  public RBACPermissionService(Enforcer enforcer) {
    this.enforcer = enforcer;
  }

  public boolean hasPermission(
      Current current, String objectName, String fieldName, PermissionType... permissionTypes) {
    String subject = USER_PREFIX + current.getId();
    String realm = Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY);
    if (enforce(subject, realm, ANY.name(), ANY.name(), ANY)) {
      return true;
    }
    for (PermissionType permissionType : permissionTypes) {
      if (enforce(subject, realm, ANY.name(), ANY.name(), permissionType)) {
        return true;
      }
    }
    if (enforce(subject, realm, objectName, ANY.name(), ANY)) {
      return true;
    }
    for (PermissionType permissionType : permissionTypes) {
      if (enforce(subject, realm, objectName, ANY.name(), permissionType)) {
        return true;
      }
    }
    if (enforce(subject, realm, objectName, fieldName, ANY)) {
      return true;
    }
    for (PermissionType permissionType : permissionTypes) {
      if (enforce(subject, realm, objectName, fieldName, permissionType)) {
        return true;
      }
    }
    return false;
  }

  private boolean enforce(
      String subject, String realm, String objectName, String fieldName, PermissionType action) {
    return enforcer.enforce(subject, realm, objectName + SPACER + fieldName, action.name());
  }
}
