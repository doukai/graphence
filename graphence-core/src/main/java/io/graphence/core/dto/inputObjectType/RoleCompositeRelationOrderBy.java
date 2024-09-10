package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class RoleCompositeRelationOrderBy {
  private Sort id;

  private Sort roleRef;

  private RoleOrderBy role;

  private Sort compositeRef;

  private RoleOrderBy composite;

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

  private Sort roleRefCount;

  private Sort roleRefMax;

  private Sort roleRefMin;

  private Sort compositeRefCount;

  private Sort compositeRefMax;

  private Sort compositeRefMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getRoleRef() {
    return this.roleRef;
  }

  public void setRoleRef(Sort roleRef) {
    this.roleRef = roleRef;
  }

  public RoleOrderBy getRole() {
    return this.role;
  }

  public void setRole(RoleOrderBy role) {
    this.role = role;
  }

  public Sort getCompositeRef() {
    return this.compositeRef;
  }

  public void setCompositeRef(Sort compositeRef) {
    this.compositeRef = compositeRef;
  }

  public RoleOrderBy getComposite() {
    return this.composite;
  }

  public void setComposite(RoleOrderBy composite) {
    this.composite = composite;
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

  public Sort getRoleRefCount() {
    return this.roleRefCount;
  }

  public void setRoleRefCount(Sort roleRefCount) {
    this.roleRefCount = roleRefCount;
  }

  public Sort getRoleRefMax() {
    return this.roleRefMax;
  }

  public void setRoleRefMax(Sort roleRefMax) {
    this.roleRefMax = roleRefMax;
  }

  public Sort getRoleRefMin() {
    return this.roleRefMin;
  }

  public void setRoleRefMin(Sort roleRefMin) {
    this.roleRefMin = roleRefMin;
  }

  public Sort getCompositeRefCount() {
    return this.compositeRefCount;
  }

  public void setCompositeRefCount(Sort compositeRefCount) {
    this.compositeRefCount = compositeRefCount;
  }

  public Sort getCompositeRefMax() {
    return this.compositeRefMax;
  }

  public void setCompositeRefMax(Sort compositeRefMax) {
    this.compositeRefMax = compositeRefMax;
  }

  public Sort getCompositeRefMin() {
    return this.compositeRefMin;
  }

  public void setCompositeRefMin(Sort compositeRefMin) {
    this.compositeRefMin = compositeRefMin;
  }
}
