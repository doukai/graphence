package io.graphoenix.graphence.dto.inputObjectType;

import io.graphoenix.graphence.dto.enumType.Sort;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class RoleParentOrderBy {
  private Sort id;

  private Sort roleId;

  private Sort parentId;

  private Sort version;

  private Sort isDeprecated;

  private Sort __typename;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getRoleId() {
    return this.roleId;
  }

  public void setRoleId(Sort roleId) {
    this.roleId = roleId;
  }

  public Sort getParentId() {
    return this.parentId;
  }

  public void setParentId(Sort parentId) {
    this.parentId = parentId;
  }

  public Sort getVersion() {
    return this.version;
  }

  public void setVersion(Sort version) {
    this.version = version;
  }

  public Sort getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Sort isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Sort get__Typename() {
    return this.__typename;
  }

  public void set__Typename(Sort __typename) {
    this.__typename = __typename;
  }
}
