package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class UserPhonesRelationOrderBy {
  private Sort id;

  private Sort userRef;

  private UserOrderBy user;

  private Sort phonesRef;

  private Sort isDeprecated;

  private Sort version;

  private Sort realmId;

  private Sort createUserId;

  private Sort createTime;

  private Sort updateUserId;

  private Sort updateTime;

  private Sort createGroupId;

  private Sort __typename;

  private Sort idCount;

  private Sort idMax;

  private Sort idMin;

  private Sort userRefCount;

  private Sort userRefMax;

  private Sort userRefMin;

  private Sort phonesRefCount;

  private Sort phonesRefMax;

  private Sort phonesRefMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Sort userRef) {
    this.userRef = userRef;
  }

  public UserOrderBy getUser() {
    return this.user;
  }

  public void setUser(UserOrderBy user) {
    this.user = user;
  }

  public Sort getPhonesRef() {
    return this.phonesRef;
  }

  public void setPhonesRef(Sort phonesRef) {
    this.phonesRef = phonesRef;
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

  public Sort get__typename() {
    return this.__typename;
  }

  public void set__typename(Sort __typename) {
    this.__typename = __typename;
  }

  public Sort getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Sort idCount) {
    this.idCount = idCount;
  }

  public Sort getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Sort idMax) {
    this.idMax = idMax;
  }

  public Sort getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Sort idMin) {
    this.idMin = idMin;
  }

  public Sort getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Sort userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Sort getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Sort userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Sort getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Sort userRefMin) {
    this.userRefMin = userRefMin;
  }

  public Sort getPhonesRefCount() {
    return this.phonesRefCount;
  }

  public void setPhonesRefCount(Sort phonesRefCount) {
    this.phonesRefCount = phonesRefCount;
  }

  public Sort getPhonesRefMax() {
    return this.phonesRefMax;
  }

  public void setPhonesRefMax(Sort phonesRefMax) {
    this.phonesRefMax = phonesRefMax;
  }

  public Sort getPhonesRefMin() {
    return this.phonesRefMin;
  }

  public void setPhonesRefMin(Sort phonesRefMin) {
    this.phonesRefMin = phonesRefMin;
  }
}
