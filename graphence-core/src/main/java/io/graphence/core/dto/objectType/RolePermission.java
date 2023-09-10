package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class RolePermission implements Meta {
  @Id
  private String id;

  private Integer roleId;

  private Role roleIdType;

  private String permissionName;

  private Permission permissionNameType;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer permissionNameCount;

  private String permissionNameMax;

  private String permissionNameMin;

  private Integer roleIdCount;

  private Integer roleIdSum;

  private Integer roleIdAvg;

  private Integer roleIdMax;

  private Integer roleIdMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getRoleId() {
    return this.roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Role getRoleIdType() {
    return this.roleIdType;
  }

  public void setRoleIdType(Role roleIdType) {
    this.roleIdType = roleIdType;
  }

  public String getPermissionName() {
    return this.permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }

  public Permission getPermissionNameType() {
    return this.permissionNameType;
  }

  public void setPermissionNameType(Permission permissionNameType) {
    this.permissionNameType = permissionNameType;
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
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
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

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
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

  public Integer getPermissionNameCount() {
    return this.permissionNameCount;
  }

  public void setPermissionNameCount(Integer permissionNameCount) {
    this.permissionNameCount = permissionNameCount;
  }

  public String getPermissionNameMax() {
    return this.permissionNameMax;
  }

  public void setPermissionNameMax(String permissionNameMax) {
    this.permissionNameMax = permissionNameMax;
  }

  public String getPermissionNameMin() {
    return this.permissionNameMin;
  }

  public void setPermissionNameMin(String permissionNameMin) {
    this.permissionNameMin = permissionNameMin;
  }

  public Integer getRoleIdCount() {
    return this.roleIdCount;
  }

  public void setRoleIdCount(Integer roleIdCount) {
    this.roleIdCount = roleIdCount;
  }

  public Integer getRoleIdSum() {
    return this.roleIdSum;
  }

  public void setRoleIdSum(Integer roleIdSum) {
    this.roleIdSum = roleIdSum;
  }

  public Integer getRoleIdAvg() {
    return this.roleIdAvg;
  }

  public void setRoleIdAvg(Integer roleIdAvg) {
    this.roleIdAvg = roleIdAvg;
  }

  public Integer getRoleIdMax() {
    return this.roleIdMax;
  }

  public void setRoleIdMax(Integer roleIdMax) {
    this.roleIdMax = roleIdMax;
  }

  public Integer getRoleIdMin() {
    return this.roleIdMin;
  }

  public void setRoleIdMin(Integer roleIdMin) {
    this.roleIdMin = roleIdMin;
  }
}
