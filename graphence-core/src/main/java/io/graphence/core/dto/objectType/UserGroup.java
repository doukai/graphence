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
public class UserGroup implements Meta {
  @Id
  private String id;

  private Integer userId;

  private User from;

  private Integer groupId;

  private Group to;

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

  private Integer userIdCount;

  private Integer userIdSum;

  private Integer userIdAvg;

  private Integer userIdMax;

  private Integer userIdMin;

  private Integer groupIdCount;

  private Integer groupIdSum;

  private Integer groupIdAvg;

  private Integer groupIdMax;

  private Integer groupIdMin;

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

  public User getFrom() {
    return this.from;
  }

  public void setFrom(User from) {
    this.from = from;
  }

  public Integer getGroupId() {
    return this.groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public Group getTo() {
    return this.to;
  }

  public void setTo(Group to) {
    this.to = to;
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

  public Integer getGroupIdCount() {
    return this.groupIdCount;
  }

  public void setGroupIdCount(Integer groupIdCount) {
    this.groupIdCount = groupIdCount;
  }

  public Integer getGroupIdSum() {
    return this.groupIdSum;
  }

  public void setGroupIdSum(Integer groupIdSum) {
    this.groupIdSum = groupIdSum;
  }

  public Integer getGroupIdAvg() {
    return this.groupIdAvg;
  }

  public void setGroupIdAvg(Integer groupIdAvg) {
    this.groupIdAvg = groupIdAvg;
  }

  public Integer getGroupIdMax() {
    return this.groupIdMax;
  }

  public void setGroupIdMax(Integer groupIdMax) {
    this.groupIdMax = groupIdMax;
  }

  public Integer getGroupIdMin() {
    return this.groupIdMin;
  }

  public void setGroupIdMin(Integer groupIdMin) {
    this.groupIdMin = groupIdMin;
  }
}
