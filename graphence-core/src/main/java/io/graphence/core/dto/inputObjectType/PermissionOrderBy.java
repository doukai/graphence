package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class PermissionOrderBy {
  private Sort name;

  private Sort description;

  private Sort field;

  private Sort type;

  private Sort permissionType;

  private RoleOrderBy roles;

  private RealmOrderBy realm;

  private Sort isDeprecated;

  private Sort version;

  private Sort realmId;

  private Sort createUserId;

  private Sort createTime;

  private Sort updateUserId;

  private Sort updateTime;

  private Sort createGroupId;

  private Sort __typename;

  private PermissionRoleRelationOrderBy permissionRoleRelation;

  private RoleOrderBy rolesAggregate;

  private PermissionRoleRelationOrderBy permissionRoleRelationAggregate;

  private Sort nameCount;

  private Sort nameMax;

  private Sort nameMin;

  private Sort descriptionCount;

  private Sort descriptionMax;

  private Sort descriptionMin;

  private Sort fieldCount;

  private Sort fieldMax;

  private Sort fieldMin;

  private Sort typeCount;

  private Sort typeMax;

  private Sort typeMin;

  private Sort permissionTypeCount;

  private Sort permissionTypeMax;

  private Sort permissionTypeMin;

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getDescription() {
    return this.description;
  }

  public void setDescription(Sort description) {
    this.description = description;
  }

  public Sort getField() {
    return this.field;
  }

  public void setField(Sort field) {
    this.field = field;
  }

  public Sort getType() {
    return this.type;
  }

  public void setType(Sort type) {
    this.type = type;
  }

  public Sort getPermissionType() {
    return this.permissionType;
  }

  public void setPermissionType(Sort permissionType) {
    this.permissionType = permissionType;
  }

  public RoleOrderBy getRoles() {
    return this.roles;
  }

  public void setRoles(RoleOrderBy roles) {
    this.roles = roles;
  }

  public RealmOrderBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmOrderBy realm) {
    this.realm = realm;
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

  public PermissionRoleRelationOrderBy getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  public void setPermissionRoleRelation(PermissionRoleRelationOrderBy permissionRoleRelation) {
    this.permissionRoleRelation = permissionRoleRelation;
  }

  public RoleOrderBy getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(RoleOrderBy rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public PermissionRoleRelationOrderBy getPermissionRoleRelationAggregate() {
    return this.permissionRoleRelationAggregate;
  }

  public void setPermissionRoleRelationAggregate(
      PermissionRoleRelationOrderBy permissionRoleRelationAggregate) {
    this.permissionRoleRelationAggregate = permissionRoleRelationAggregate;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(Sort descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public Sort getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(Sort descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Sort getFieldCount() {
    return this.fieldCount;
  }

  public void setFieldCount(Sort fieldCount) {
    this.fieldCount = fieldCount;
  }

  public Sort getFieldMax() {
    return this.fieldMax;
  }

  public void setFieldMax(Sort fieldMax) {
    this.fieldMax = fieldMax;
  }

  public Sort getFieldMin() {
    return this.fieldMin;
  }

  public void setFieldMin(Sort fieldMin) {
    this.fieldMin = fieldMin;
  }

  public Sort getTypeCount() {
    return this.typeCount;
  }

  public void setTypeCount(Sort typeCount) {
    this.typeCount = typeCount;
  }

  public Sort getTypeMax() {
    return this.typeMax;
  }

  public void setTypeMax(Sort typeMax) {
    this.typeMax = typeMax;
  }

  public Sort getTypeMin() {
    return this.typeMin;
  }

  public void setTypeMin(Sort typeMin) {
    this.typeMin = typeMin;
  }

  public Sort getPermissionTypeCount() {
    return this.permissionTypeCount;
  }

  public void setPermissionTypeCount(Sort permissionTypeCount) {
    this.permissionTypeCount = permissionTypeCount;
  }

  public Sort getPermissionTypeMax() {
    return this.permissionTypeMax;
  }

  public void setPermissionTypeMax(Sort permissionTypeMax) {
    this.permissionTypeMax = permissionTypeMax;
  }

  public Sort getPermissionTypeMin() {
    return this.permissionTypeMin;
  }

  public void setPermissionTypeMin(Sort permissionTypeMin) {
    this.permissionTypeMin = permissionTypeMin;
  }
}
