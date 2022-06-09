package io.graphoenix.graphence.dto.inputObjectType;

import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;
import org.eclipse.microprofile.graphql.NonNull;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class UserInput {
  private String id;

  @NonNull
  private String name;

  @NonNull
  private String login;

  @NonNull
  private String password;

  private Boolean disable;

  private Integer organizationId;

  private OrganizationInput organization;

  private Collection<RoleInput> roles;

  private String domainId;

  private Boolean isDeprecated;

  private Integer version;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createOrganizationId;

  @DefaultValue("\"User\"")
  @NonNull
  private String __typename;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean getDisable() {
    return this.disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public Integer getOrganizationId() {
    return this.organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public OrganizationInput getOrganization() {
    return this.organization;
  }

  public void setOrganization(OrganizationInput organization) {
    this.organization = organization;
  }

  public Collection<RoleInput> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<RoleInput> roles) {
    this.roles = roles;
  }

  public String getDomainId() {
    return this.domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreateOrganizationId() {
    return this.createOrganizationId;
  }

  public void setCreateOrganizationId(String createOrganizationId) {
    this.createOrganizationId = createOrganizationId;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }
}
