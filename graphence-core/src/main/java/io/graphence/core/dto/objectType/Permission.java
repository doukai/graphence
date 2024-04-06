package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

/**
 * 权限
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限")
public class Permission implements Meta {
  /**
   * 名称
   */
  @Id
  @NonNull
  @Description("名称")
  private String name;

  /**
   * 描述
   */
  @Description("描述")
  private String description;

  /**
   * 字段
   */
  @NonNull
  @Description("字段")
  private String field;

  /**
   * 实体
   */
  @NonNull
  @Description("实体")
  private String type;

  /**
   * 权限类型
   */
  @NonNull
  @Description("权限类型")
  private PermissionType permissionType;

  /**
   * 角色
   */
  @Description("角色")
  private Collection<Role> roles;

  /**
   * 租户
   */
  @Description("租户")
  private Realm realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Collection<PermissionRoleRelation> permissionRoleRelation;

  private Role rolesAggregate;

  private RoleConnection rolesConnection;

  private PermissionRoleRelation permissionRoleRelationAggregate;

  private PermissionRoleRelationConnection permissionRoleRelationConnection;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer fieldCount;

  private String fieldMax;

  private String fieldMin;

  private Integer typeCount;

  private String typeMax;

  private String typeMin;

  private Boolean syncPermissionPolicy;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getField() {
    return this.field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PermissionType getPermissionType() {
    return this.permissionType;
  }

  public void setPermissionType(PermissionType permissionType) {
    this.permissionType = permissionType;
  }

  public Collection<Role> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<Role> roles) {
    this.roles = roles;
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
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<PermissionRoleRelation> getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  public void setPermissionRoleRelation(Collection<PermissionRoleRelation> permissionRoleRelation) {
    this.permissionRoleRelation = permissionRoleRelation;
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

  public PermissionRoleRelation getPermissionRoleRelationAggregate() {
    return this.permissionRoleRelationAggregate;
  }

  public void setPermissionRoleRelationAggregate(
      PermissionRoleRelation permissionRoleRelationAggregate) {
    this.permissionRoleRelationAggregate = permissionRoleRelationAggregate;
  }

  public PermissionRoleRelationConnection getPermissionRoleRelationConnection() {
    return this.permissionRoleRelationConnection;
  }

  public void setPermissionRoleRelationConnection(
      PermissionRoleRelationConnection permissionRoleRelationConnection) {
    this.permissionRoleRelationConnection = permissionRoleRelationConnection;
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

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public String getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(String descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public String getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(String descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Integer getFieldCount() {
    return this.fieldCount;
  }

  public void setFieldCount(Integer fieldCount) {
    this.fieldCount = fieldCount;
  }

  public String getFieldMax() {
    return this.fieldMax;
  }

  public void setFieldMax(String fieldMax) {
    this.fieldMax = fieldMax;
  }

  public String getFieldMin() {
    return this.fieldMin;
  }

  public void setFieldMin(String fieldMin) {
    this.fieldMin = fieldMin;
  }

  public Integer getTypeCount() {
    return this.typeCount;
  }

  public void setTypeCount(Integer typeCount) {
    this.typeCount = typeCount;
  }

  public String getTypeMax() {
    return this.typeMax;
  }

  public void setTypeMax(String typeMax) {
    this.typeMax = typeMax;
  }

  public String getTypeMin() {
    return this.typeMin;
  }

  public void setTypeMin(String typeMin) {
    this.typeMin = typeMin;
  }

  public Boolean getSyncPermissionPolicy() {
    return this.syncPermissionPolicy;
  }

  public void setSyncPermissionPolicy(Boolean syncPermissionPolicy) {
    this.syncPermissionPolicy = syncPermissionPolicy;
  }
}
