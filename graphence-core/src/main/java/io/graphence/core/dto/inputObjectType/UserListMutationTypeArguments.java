package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class UserListMutationTypeArguments implements MetaInput {
  private String id;

  private String name;

  private String lastName;

  private String login;

  private String salt;

  private String hash;

  private String email;

  private Collection<String> phones;

  private Boolean disable;

  private Collection<UserMutationTypeArguments> groups;

  private Collection<UserMutationTypeArguments> roles;

  private UserMutationTypeArguments realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"User\"")
  private String __typename;

  private Collection<UserMutationTypeArguments> userPhones;

  private Collection<UserMutationTypeArguments> userGroup;

  private Collection<UserMutationTypeArguments> userRole;

  private Collection<UserInput> list;

  private UserExpression where;

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

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSalt() {
    return this.salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Collection<String> getPhones() {
    return this.phones;
  }

  public void setPhones(Collection<String> phones) {
    this.phones = phones;
  }

  public Boolean getDisable() {
    return this.disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public Collection<UserMutationTypeArguments> getGroups() {
    return this.groups;
  }

  public void setGroups(Collection<UserMutationTypeArguments> groups) {
    this.groups = groups;
  }

  public Collection<UserMutationTypeArguments> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<UserMutationTypeArguments> roles) {
    this.roles = roles;
  }

  public UserMutationTypeArguments getRealm() {
    return this.realm;
  }

  public void setRealm(UserMutationTypeArguments realm) {
    this.realm = realm;
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

  public Integer getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Integer realmId) {
    this.realmId = realmId;
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

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<UserMutationTypeArguments> getUserPhones() {
    return this.userPhones;
  }

  public void setUserPhones(Collection<UserMutationTypeArguments> userPhones) {
    this.userPhones = userPhones;
  }

  public Collection<UserMutationTypeArguments> getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(Collection<UserMutationTypeArguments> userGroup) {
    this.userGroup = userGroup;
  }

  public Collection<UserMutationTypeArguments> getUserRole() {
    return this.userRole;
  }

  public void setUserRole(Collection<UserMutationTypeArguments> userRole) {
    this.userRole = userRole;
  }

  public Collection<UserInput> getList() {
    return this.list;
  }

  public void setList(Collection<UserInput> list) {
    this.list = list;
  }

  public UserExpression getWhere() {
    return this.where;
  }

  public void setWhere(UserExpression where) {
    this.where = where;
  }
}
