package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionLevel;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class PermissionListMutationTypeArguments {
  private String name;

  private String fieldName;

  private String typeName;

  private String description;

  private PermissionType type;

  private PermissionLevel level;

  private Collection<RoleInput> role;

  private RealmInput realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"Permission\"")
  private String __typename;

  private Collection<RolePermissionInput> rolePermission;

  private Collection<PermissionInput> list;

  private PermissionExpression where;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getTypeName() {
    return this.typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionType getType() {
    return this.type;
  }

  public void setType(PermissionType type) {
    this.type = type;
  }

  public PermissionLevel getLevel() {
    return this.level;
  }

  public void setLevel(PermissionLevel level) {
    this.level = level;
  }

  public Collection<RoleInput> getRole() {
    return this.role;
  }

  public void setRole(Collection<RoleInput> role) {
    this.role = role;
  }

  public RealmInput getRealm() {
    return this.realm;
  }

  public void setRealm(RealmInput realm) {
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

  public Collection<RolePermissionInput> getRolePermission() {
    return this.rolePermission;
  }

  public void setRolePermission(Collection<RolePermissionInput> rolePermission) {
    this.rolePermission = rolePermission;
  }

  public Collection<PermissionInput> getList() {
    return this.list;
  }

  public void setList(Collection<PermissionInput> list) {
    this.list = list;
  }

  public PermissionExpression getWhere() {
    return this.where;
  }

  public void setWhere(PermissionExpression where) {
    this.where = where;
  }
}
