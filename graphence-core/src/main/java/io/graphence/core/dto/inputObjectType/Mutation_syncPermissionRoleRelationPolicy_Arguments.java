package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation_syncPermissionRoleRelationPolicy_Arguments {
  private String roleId;

  private Collection<String> permissionNameList;

  private Collection<String> removedPermissionNameList;

  public String getRoleId() {
    return this.roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public Collection<String> getPermissionNameList() {
    return this.permissionNameList;
  }

  public void setPermissionNameList(Collection<String> permissionNameList) {
    this.permissionNameList = permissionNameList;
  }

  public Collection<String> getRemovedPermissionNameList() {
    return this.removedPermissionNameList;
  }

  public void setRemovedPermissionNameList(Collection<String> removedPermissionNameList) {
    this.removedPermissionNameList = removedPermissionNameList;
  }
}
