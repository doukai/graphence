package io.graphoenix.graphence.dto.inputObjectType;

import io.graphoenix.graphence.dto.enumType.Sort;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class PermissionOrderBy {
  private Sort id;

  private Sort roleId;

  private Sort fieldId;

  private Sort domainId;

  private Sort isDeprecated;

  private Sort version;

  private Sort createUserId;

  private Sort createTime;

  private Sort updateUserId;

  private Sort updateTime;

  private Sort createOrganizationId;

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

  public Sort getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(Sort fieldId) {
    this.fieldId = fieldId;
  }

  public Sort getDomainId() {
    return this.domainId;
  }

  public void setDomainId(Sort domainId) {
    this.domainId = domainId;
  }

  public Sort getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Sort isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Sort getVersion() {
    return this.version;
  }

  public void setVersion(Sort version) {
    this.version = version;
  }

  public Sort getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Sort createUserId) {
    this.createUserId = createUserId;
  }

  public Sort getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Sort createTime) {
    this.createTime = createTime;
  }

  public Sort getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(Sort updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Sort getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Sort updateTime) {
    this.updateTime = updateTime;
  }

  public Sort getCreateOrganizationId() {
    return this.createOrganizationId;
  }

  public void setCreateOrganizationId(Sort createOrganizationId) {
    this.createOrganizationId = createOrganizationId;
  }

  public Sort get__Typename() {
    return this.__typename;
  }

  public void set__Typename(Sort __typename) {
    this.__typename = __typename;
  }
}
