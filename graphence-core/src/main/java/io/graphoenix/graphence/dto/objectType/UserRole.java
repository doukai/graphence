package io.graphoenix.graphence.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.graphence.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.Skip;
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
@Skip
public class UserRole implements Meta {
  @Id
  private String id;

  private Integer userId;

  private Integer roleId;

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

  private Integer userIdCount;

  private Integer userIdSum;

  private Integer userIdAvg;

  private Integer userIdMax;

  private Integer userIdMin;

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

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getRoleId() {
    return this.roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
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

  public Integer getUserIdCount() {
    return this.userIdCount;
  }

  public void setUserIdCount(Integer userIdCount) {
    this.userIdCount = userIdCount;
  }

  public Integer getUserIdSum() {
    return this.userIdSum;
  }

  public void setUserIdSum(Integer userIdSum) {
    this.userIdSum = userIdSum;
  }

  public Integer getUserIdAvg() {
    return this.userIdAvg;
  }

  public void setUserIdAvg(Integer userIdAvg) {
    this.userIdAvg = userIdAvg;
  }

  public Integer getUserIdMax() {
    return this.userIdMax;
  }

  public void setUserIdMax(Integer userIdMax) {
    this.userIdMax = userIdMax;
  }

  public Integer getUserIdMin() {
    return this.userIdMin;
  }

  public void setUserIdMin(Integer userIdMin) {
    this.userIdMin = userIdMin;
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
