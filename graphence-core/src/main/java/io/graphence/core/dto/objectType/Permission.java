package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphence.core.dto.inputObjectType.PermissionInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.stream.Collectors;
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
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 名称
   */
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

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  private Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  private Integer version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Integer realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private String createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private LocalDateTime createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private String updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private LocalDateTime updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private String createGroupId;

  /**
   * Type Name
   */
  @Description("Type Name")
  private String __typename = "Permission";

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  private Collection<RolePermissionRelation> rolePermissionRelation;

  /**
   * Aggregate Field for 角色
   */
  @Description("Aggregate Field for 角色")
  private Role rolesAggregate;

  /**
   * Connection Field for 角色
   */
  @Description("Connection Field for 角色")
  private RoleConnection rolesConnection;

  /**
   * Aggregate Field for Relationship Object between 角色 and 权限
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelation rolePermissionRelationAggregate;

  /**
   * Connection Field for Relationship Object between 角色 and 权限
   */
  @Description("Connection Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelationConnection rolePermissionRelationConnection;

  /**
   * Count of 权限
   */
  @Description("Count of 权限")
  private Integer idCount;

  /**
   * Max of ID
   */
  @Description("Max of ID")
  private Integer idMax;

  /**
   * Min of ID
   */
  @Description("Min of ID")
  private Integer idMin;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  private Integer nameCount;

  /**
   * Max of 名称
   */
  @Description("Max of 名称")
  private String nameMax;

  /**
   * Min of 名称
   */
  @Description("Min of 名称")
  private String nameMin;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Integer descriptionCount;

  /**
   * Max of 描述
   */
  @Description("Max of 描述")
  private String descriptionMax;

  /**
   * Min of 描述
   */
  @Description("Min of 描述")
  private String descriptionMin;

  /**
   * Count of 字段
   */
  @Description("Count of 字段")
  private Integer fieldCount;

  /**
   * Max of 字段
   */
  @Description("Max of 字段")
  private String fieldMax;

  /**
   * Min of 字段
   */
  @Description("Min of 字段")
  private String fieldMin;

  /**
   * Count of 实体
   */
  @Description("Count of 实体")
  private Integer typeCount;

  /**
   * Max of 实体
   */
  @Description("Max of 实体")
  private String typeMax;

  /**
   * Min of 实体
   */
  @Description("Min of 实体")
  private String typeMin;

  /**
   * Count of 权限类型
   */
  @Description("Count of 权限类型")
  private Integer permissionTypeCount;

  /**
   * Max of 权限类型
   */
  @Description("Max of 权限类型")
  private PermissionType permissionTypeMax;

  /**
   * Min of 权限类型
   */
  @Description("Min of 权限类型")
  private PermissionType permissionTypeMin;

  private Boolean syncPermissionPolicy;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

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

  public Collection<RolePermissionRelation> getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(Collection<RolePermissionRelation> rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
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

  public RolePermissionRelation getRolePermissionRelationAggregate() {
    return this.rolePermissionRelationAggregate;
  }

  public void setRolePermissionRelationAggregate(
      RolePermissionRelation rolePermissionRelationAggregate) {
    this.rolePermissionRelationAggregate = rolePermissionRelationAggregate;
  }

  public RolePermissionRelationConnection getRolePermissionRelationConnection() {
    return this.rolePermissionRelationConnection;
  }

  public void setRolePermissionRelationConnection(
      RolePermissionRelationConnection rolePermissionRelationConnection) {
    this.rolePermissionRelationConnection = rolePermissionRelationConnection;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
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

  public Integer getPermissionTypeCount() {
    return this.permissionTypeCount;
  }

  public void setPermissionTypeCount(Integer permissionTypeCount) {
    this.permissionTypeCount = permissionTypeCount;
  }

  public PermissionType getPermissionTypeMax() {
    return this.permissionTypeMax;
  }

  public void setPermissionTypeMax(PermissionType permissionTypeMax) {
    this.permissionTypeMax = permissionTypeMax;
  }

  public PermissionType getPermissionTypeMin() {
    return this.permissionTypeMin;
  }

  public void setPermissionTypeMin(PermissionType permissionTypeMin) {
    this.permissionTypeMin = permissionTypeMin;
  }

  public Boolean getSyncPermissionPolicy() {
    return this.syncPermissionPolicy;
  }

  public void setSyncPermissionPolicy(Boolean syncPermissionPolicy) {
    this.syncPermissionPolicy = syncPermissionPolicy;
  }

  public PermissionInput toInput() {
    PermissionInput input = new PermissionInput();
    input.setId(this.getId());
    input.setName(this.getName());
    input.setDescription(this.getDescription());
    input.setField(this.getField());
    input.setType(this.getType());
    input.setPermissionType(this.getPermissionType());
    if(getRoles() != null) {
      input.setRoles(this.getRoles().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getRealm() != null) {
      input.setRealm(this.getRealm().toInput());
    }
    input.setIsDeprecated(this.getIsDeprecated());
    input.setVersion(this.getVersion());
    input.setRealmId(this.getRealmId());
    input.setCreateUserId(this.getCreateUserId());
    input.setCreateTime(this.getCreateTime());
    input.setUpdateUserId(this.getUpdateUserId());
    input.setUpdateTime(this.getUpdateTime());
    input.setCreateGroupId(this.getCreateGroupId());
    input.set__typename(this.get__typename());
    if(getRolePermissionRelation() != null) {
      input.setRolePermissionRelation(this.getRolePermissionRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    return input;
  }
}
