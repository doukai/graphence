package io.graphoenix.graphence.dto.objectType;

import io.graphoenix.graphence.dto.enumType.PermissionLevel;
import io.graphoenix.graphence.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class Permission implements Meta {
  @Id
  private String id;

  private String roleId;

  @NonNull
  private Role role;

  private String fieldId;

  @NonNull
  private __Field field;

  private PermissionLevel level;

  private Realm realm;

  private Boolean isDeprecated;

  private Integer version;

  private String realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer roleIdCount;

  private String roleIdMax;

  private String roleIdMin;

  private Integer fieldIdCount;

  private String fieldIdMax;

  private String fieldIdMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public __Field getField() {
    return this.field;
  }

  public void setField(__Field field) {
    this.field = field;
  }

  public PermissionLevel getLevel() {
    return this.level;
  }

  public void setLevel(PermissionLevel level) {
    this.level = level;
  }

  public Realm getRealm() {
    return this.realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
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
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
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
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
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

  public Integer getRoleIdCount() {
    return this.roleIdCount;
  }

  public void setRoleIdCount(Integer roleIdCount) {
    this.roleIdCount = roleIdCount;
  }

  public String getRoleIdMax() {
    return this.roleIdMax;
  }

  public void setRoleIdMax(String roleIdMax) {
    this.roleIdMax = roleIdMax;
  }

  public String getRoleIdMin() {
    return this.roleIdMin;
  }

  public void setRoleIdMin(String roleIdMin) {
    this.roleIdMin = roleIdMin;
  }

  public Integer getFieldIdCount() {
    return this.fieldIdCount;
  }

  public void setFieldIdCount(Integer fieldIdCount) {
    this.fieldIdCount = fieldIdCount;
  }

  public String getFieldIdMax() {
    return this.fieldIdMax;
  }

  public void setFieldIdMax(String fieldIdMax) {
    this.fieldIdMax = fieldIdMax;
  }

  public String getFieldIdMin() {
    return this.fieldIdMin;
  }

  public void setFieldIdMin(String fieldIdMin) {
    this.fieldIdMin = fieldIdMin;
  }
}
