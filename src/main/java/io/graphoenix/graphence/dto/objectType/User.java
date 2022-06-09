package io.graphoenix.graphence.dto.objectType;

import io.graphoenix.graphence.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class User implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  @NonNull
  private String login;

  @NonNull
  private String password;

  private Boolean disable;

  private Integer organizationId;

  private Organization organization;

  private Collection<Role> roles;

  private String domainId;

  private Boolean isDeprecated;

  private Integer version;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createOrganizationId;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer loginCount;

  private String loginMax;

  private String loginMin;

  private Integer passwordCount;

  private String passwordMax;

  private String passwordMin;

  private Integer organizationIdCount;

  private Integer organizationIdSum;

  private Integer organizationIdAvg;

  private Integer organizationIdMax;

  private Integer organizationIdMin;

  private Role rolesAggregate;

  private RoleConnection rolesConnection;

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

  public Organization getOrganization() {
    return this.organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public Collection<Role> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<Role> roles) {
    this.roles = roles;
  }

  @Override
  public String getDomainId() {
    return this.domainId;
  }

  @Override
  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String getCreateOrganizationId() {
    return this.createOrganizationId;
  }

  @Override
  public void setCreateOrganizationId(String createOrganizationId) {
    this.createOrganizationId = createOrganizationId;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public String getIdMax() {
    return this.idMax;
  }

  public void setIdMax(String idMax) {
    this.idMax = idMax;
  }

  public String getIdMin() {
    return this.idMin;
  }

  public void setIdMin(String idMin) {
    this.idMin = idMin;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }

  public String getLoginMax() {
    return this.loginMax;
  }

  public void setLoginMax(String loginMax) {
    this.loginMax = loginMax;
  }

  public String getLoginMin() {
    return this.loginMin;
  }

  public void setLoginMin(String loginMin) {
    this.loginMin = loginMin;
  }

  public Integer getPasswordCount() {
    return this.passwordCount;
  }

  public void setPasswordCount(Integer passwordCount) {
    this.passwordCount = passwordCount;
  }

  public String getPasswordMax() {
    return this.passwordMax;
  }

  public void setPasswordMax(String passwordMax) {
    this.passwordMax = passwordMax;
  }

  public String getPasswordMin() {
    return this.passwordMin;
  }

  public void setPasswordMin(String passwordMin) {
    this.passwordMin = passwordMin;
  }

  public Integer getOrganizationIdCount() {
    return this.organizationIdCount;
  }

  public void setOrganizationIdCount(Integer organizationIdCount) {
    this.organizationIdCount = organizationIdCount;
  }

  public Integer getOrganizationIdSum() {
    return this.organizationIdSum;
  }

  public void setOrganizationIdSum(Integer organizationIdSum) {
    this.organizationIdSum = organizationIdSum;
  }

  public Integer getOrganizationIdAvg() {
    return this.organizationIdAvg;
  }

  public void setOrganizationIdAvg(Integer organizationIdAvg) {
    this.organizationIdAvg = organizationIdAvg;
  }

  public Integer getOrganizationIdMax() {
    return this.organizationIdMax;
  }

  public void setOrganizationIdMax(Integer organizationIdMax) {
    this.organizationIdMax = organizationIdMax;
  }

  public Integer getOrganizationIdMin() {
    return this.organizationIdMin;
  }

  public void setOrganizationIdMin(Integer organizationIdMin) {
    this.organizationIdMin = organizationIdMin;
  }

  public Role getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(Role rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public RoleConnection getRolesConnection() {
    return this.rolesConnection;
  }

  public void setRolesConnection(RoleConnection rolesConnection) {
    this.rolesConnection = rolesConnection;
  }
}
