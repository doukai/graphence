package io.graphoenix.graphence.core.dto.inputObjectType;

import io.graphoenix.graphence.core.dto.enumType.Sort;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class UserOrderBy {
  private Sort id;

  private Sort name;

  private Sort lastName;

  private Sort login;

  private Sort password;

  private Sort email;

  private Sort disable;

  private Sort isDeprecated;

  private Sort version;

  private Sort realmId;

  private Sort createUserId;

  private Sort createTime;

  private Sort updateUserId;

  private Sort updateTime;

  private Sort createGroupId;

  private Sort __typename;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getLastName() {
    return this.lastName;
  }

  public void setLastName(Sort lastName) {
    this.lastName = lastName;
  }

  public Sort getLogin() {
    return this.login;
  }

  public void setLogin(Sort login) {
    this.login = login;
  }

  public Sort getPassword() {
    return this.password;
  }

  public void setPassword(Sort password) {
    this.password = password;
  }

  public Sort getEmail() {
    return this.email;
  }

  public void setEmail(Sort email) {
    this.email = email;
  }

  public Sort getDisable() {
    return this.disable;
  }

  public void setDisable(Sort disable) {
    this.disable = disable;
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

  public Sort getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Sort realmId) {
    this.realmId = realmId;
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

  public Sort getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(Sort createGroupId) {
    this.createGroupId = createGroupId;
  }

  public Sort get__Typename() {
    return this.__typename;
  }

  public void set__Typename(Sort __typename) {
    this.__typename = __typename;
  }
}
