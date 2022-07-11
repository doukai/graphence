package null.dto.objectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import null.dto.interfaceType.Meta;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class RoleComposite implements Meta {
  @Id
  private String id;

  private Integer roleId;

  private Integer compositeId;

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

  private Integer roleIdSum;

  private Integer roleIdAvg;

  private Integer roleIdMax;

  private Integer roleIdMin;

  private Integer compositeIdCount;

  private Integer compositeIdSum;

  private Integer compositeIdAvg;

  private Integer compositeIdMax;

  private Integer compositeIdMin;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer realmIdCount;

  private String realmIdMax;

  private String realmIdMin;

  private Integer createUserIdCount;

  private String createUserIdMax;

  private String createUserIdMin;

  private Integer createTimeCount;

  private LocalDateTime createTimeMax;

  private LocalDateTime createTimeMin;

  private Integer updateUserIdCount;

  private String updateUserIdMax;

  private String updateUserIdMin;

  private Integer updateTimeCount;

  private LocalDateTime updateTimeMax;

  private LocalDateTime updateTimeMin;

  private Integer createGroupIdCount;

  private String createGroupIdMax;

  private String createGroupIdMin;

  private Integer __typenameCount;

  private String __typenameMax;

  private String __typenameMin;

  private Integer idMaxCount;

  @Id
  private String idMaxMax;

  @Id
  private String idMaxMin;

  private Integer idMinCount;

  @Id
  private String idMinMax;

  @Id
  private String idMinMin;

  private Integer roleIdCount;

  private Integer roleIdSum;

  private Integer roleIdAvg;

  private Integer roleIdMax;

  private Integer roleIdMin;

  private Integer compositeIdCount;

  private Integer compositeIdSum;

  private Integer compositeIdAvg;

  private Integer compositeIdMax;

  private Integer compositeIdMin;

  private Integer versionCount;

  private Integer versionSum;

  private Integer versionAvg;

  private Integer versionMax;

  private Integer versionMin;

  private Integer idCountCount;

  private Integer idCountSum;

  private Integer idCountAvg;

  private Integer idCountMax;

  private Integer idCountMin;

  private Integer roleIdCountCount;

  private Integer roleIdCountSum;

  private Integer roleIdCountAvg;

  private Integer roleIdCountMax;

  private Integer roleIdCountMin;

  private Integer roleIdSumCount;

  private Integer roleIdSumSum;

  private Integer roleIdSumAvg;

  private Integer roleIdSumMax;

  private Integer roleIdSumMin;

  private Integer roleIdAvgCount;

  private Integer roleIdAvgSum;

  private Integer roleIdAvgAvg;

  private Integer roleIdAvgMax;

  private Integer roleIdAvgMin;

  private Integer roleIdMaxCount;

  private Integer roleIdMaxSum;

  private Integer roleIdMaxAvg;

  private Integer roleIdMaxMax;

  private Integer roleIdMaxMin;

  private Integer roleIdMinCount;

  private Integer roleIdMinSum;

  private Integer roleIdMinAvg;

  private Integer roleIdMinMax;

  private Integer roleIdMinMin;

  private Integer compositeIdCountCount;

  private Integer compositeIdCountSum;

  private Integer compositeIdCountAvg;

  private Integer compositeIdCountMax;

  private Integer compositeIdCountMin;

  private Integer compositeIdSumCount;

  private Integer compositeIdSumSum;

  private Integer compositeIdSumAvg;

  private Integer compositeIdSumMax;

  private Integer compositeIdSumMin;

  private Integer compositeIdAvgCount;

  private Integer compositeIdAvgSum;

  private Integer compositeIdAvgAvg;

  private Integer compositeIdAvgMax;

  private Integer compositeIdAvgMin;

  private Integer compositeIdMaxCount;

  private Integer compositeIdMaxSum;

  private Integer compositeIdMaxAvg;

  private Integer compositeIdMaxMax;

  private Integer compositeIdMaxMin;

  private Integer compositeIdMinCount;

  private Integer compositeIdMinSum;

  private Integer compositeIdMinAvg;

  private Integer compositeIdMinMax;

  private Integer compositeIdMinMin;

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

  public Integer getCompositeId() {
    return this.compositeId;
  }

  public void setCompositeId(Integer compositeId) {
    this.compositeId = compositeId;
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

  public Integer getCompositeIdCount() {
    return this.compositeIdCount;
  }

  public void setCompositeIdCount(Integer compositeIdCount) {
    this.compositeIdCount = compositeIdCount;
  }

  public Integer getCompositeIdSum() {
    return this.compositeIdSum;
  }

  public void setCompositeIdSum(Integer compositeIdSum) {
    this.compositeIdSum = compositeIdSum;
  }

  public Integer getCompositeIdAvg() {
    return this.compositeIdAvg;
  }

  public void setCompositeIdAvg(Integer compositeIdAvg) {
    this.compositeIdAvg = compositeIdAvg;
  }

  public Integer getCompositeIdMax() {
    return this.compositeIdMax;
  }

  public void setCompositeIdMax(Integer compositeIdMax) {
    this.compositeIdMax = compositeIdMax;
  }

  public Integer getCompositeIdMin() {
    return this.compositeIdMin;
  }

  public void setCompositeIdMin(Integer compositeIdMin) {
    this.compositeIdMin = compositeIdMin;
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

  public Integer getRealmIdCount() {
    return this.realmIdCount;
  }

  public void setRealmIdCount(Integer realmIdCount) {
    this.realmIdCount = realmIdCount;
  }

  public String getRealmIdMax() {
    return this.realmIdMax;
  }

  public void setRealmIdMax(String realmIdMax) {
    this.realmIdMax = realmIdMax;
  }

  public String getRealmIdMin() {
    return this.realmIdMin;
  }

  public void setRealmIdMin(String realmIdMin) {
    this.realmIdMin = realmIdMin;
  }

  public Integer getCreateUserIdCount() {
    return this.createUserIdCount;
  }

  public void setCreateUserIdCount(Integer createUserIdCount) {
    this.createUserIdCount = createUserIdCount;
  }

  public String getCreateUserIdMax() {
    return this.createUserIdMax;
  }

  public void setCreateUserIdMax(String createUserIdMax) {
    this.createUserIdMax = createUserIdMax;
  }

  public String getCreateUserIdMin() {
    return this.createUserIdMin;
  }

  public void setCreateUserIdMin(String createUserIdMin) {
    this.createUserIdMin = createUserIdMin;
  }

  public Integer getCreateTimeCount() {
    return this.createTimeCount;
  }

  public void setCreateTimeCount(Integer createTimeCount) {
    this.createTimeCount = createTimeCount;
  }

  public LocalDateTime getCreateTimeMax() {
    return this.createTimeMax;
  }

  public void setCreateTimeMax(LocalDateTime createTimeMax) {
    this.createTimeMax = createTimeMax;
  }

  public LocalDateTime getCreateTimeMin() {
    return this.createTimeMin;
  }

  public void setCreateTimeMin(LocalDateTime createTimeMin) {
    this.createTimeMin = createTimeMin;
  }

  public Integer getUpdateUserIdCount() {
    return this.updateUserIdCount;
  }

  public void setUpdateUserIdCount(Integer updateUserIdCount) {
    this.updateUserIdCount = updateUserIdCount;
  }

  public String getUpdateUserIdMax() {
    return this.updateUserIdMax;
  }

  public void setUpdateUserIdMax(String updateUserIdMax) {
    this.updateUserIdMax = updateUserIdMax;
  }

  public String getUpdateUserIdMin() {
    return this.updateUserIdMin;
  }

  public void setUpdateUserIdMin(String updateUserIdMin) {
    this.updateUserIdMin = updateUserIdMin;
  }

  public Integer getUpdateTimeCount() {
    return this.updateTimeCount;
  }

  public void setUpdateTimeCount(Integer updateTimeCount) {
    this.updateTimeCount = updateTimeCount;
  }

  public LocalDateTime getUpdateTimeMax() {
    return this.updateTimeMax;
  }

  public void setUpdateTimeMax(LocalDateTime updateTimeMax) {
    this.updateTimeMax = updateTimeMax;
  }

  public LocalDateTime getUpdateTimeMin() {
    return this.updateTimeMin;
  }

  public void setUpdateTimeMin(LocalDateTime updateTimeMin) {
    this.updateTimeMin = updateTimeMin;
  }

  public Integer getCreateGroupIdCount() {
    return this.createGroupIdCount;
  }

  public void setCreateGroupIdCount(Integer createGroupIdCount) {
    this.createGroupIdCount = createGroupIdCount;
  }

  public String getCreateGroupIdMax() {
    return this.createGroupIdMax;
  }

  public void setCreateGroupIdMax(String createGroupIdMax) {
    this.createGroupIdMax = createGroupIdMax;
  }

  public String getCreateGroupIdMin() {
    return this.createGroupIdMin;
  }

  public void setCreateGroupIdMin(String createGroupIdMin) {
    this.createGroupIdMin = createGroupIdMin;
  }

  public Integer get__TypenameCount() {
    return this.__typenameCount;
  }

  public void set__TypenameCount(Integer __typenameCount) {
    this.__typenameCount = __typenameCount;
  }

  public String get__TypenameMax() {
    return this.__typenameMax;
  }

  public void set__TypenameMax(String __typenameMax) {
    this.__typenameMax = __typenameMax;
  }

  public String get__TypenameMin() {
    return this.__typenameMin;
  }

  public void set__TypenameMin(String __typenameMin) {
    this.__typenameMin = __typenameMin;
  }

  public Integer getIdMaxCount() {
    return this.idMaxCount;
  }

  public void setIdMaxCount(Integer idMaxCount) {
    this.idMaxCount = idMaxCount;
  }

  public String getIdMaxMax() {
    return this.idMaxMax;
  }

  public void setIdMaxMax(String idMaxMax) {
    this.idMaxMax = idMaxMax;
  }

  public String getIdMaxMin() {
    return this.idMaxMin;
  }

  public void setIdMaxMin(String idMaxMin) {
    this.idMaxMin = idMaxMin;
  }

  public Integer getIdMinCount() {
    return this.idMinCount;
  }

  public void setIdMinCount(Integer idMinCount) {
    this.idMinCount = idMinCount;
  }

  public String getIdMinMax() {
    return this.idMinMax;
  }

  public void setIdMinMax(String idMinMax) {
    this.idMinMax = idMinMax;
  }

  public String getIdMinMin() {
    return this.idMinMin;
  }

  public void setIdMinMin(String idMinMin) {
    this.idMinMin = idMinMin;
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

  public Integer getCompositeIdCount() {
    return this.compositeIdCount;
  }

  public void setCompositeIdCount(Integer compositeIdCount) {
    this.compositeIdCount = compositeIdCount;
  }

  public Integer getCompositeIdSum() {
    return this.compositeIdSum;
  }

  public void setCompositeIdSum(Integer compositeIdSum) {
    this.compositeIdSum = compositeIdSum;
  }

  public Integer getCompositeIdAvg() {
    return this.compositeIdAvg;
  }

  public void setCompositeIdAvg(Integer compositeIdAvg) {
    this.compositeIdAvg = compositeIdAvg;
  }

  public Integer getCompositeIdMax() {
    return this.compositeIdMax;
  }

  public void setCompositeIdMax(Integer compositeIdMax) {
    this.compositeIdMax = compositeIdMax;
  }

  public Integer getCompositeIdMin() {
    return this.compositeIdMin;
  }

  public void setCompositeIdMin(Integer compositeIdMin) {
    this.compositeIdMin = compositeIdMin;
  }

  public Integer getVersionCount() {
    return this.versionCount;
  }

  public void setVersionCount(Integer versionCount) {
    this.versionCount = versionCount;
  }

  public Integer getVersionSum() {
    return this.versionSum;
  }

  public void setVersionSum(Integer versionSum) {
    this.versionSum = versionSum;
  }

  public Integer getVersionAvg() {
    return this.versionAvg;
  }

  public void setVersionAvg(Integer versionAvg) {
    this.versionAvg = versionAvg;
  }

  public Integer getVersionMax() {
    return this.versionMax;
  }

  public void setVersionMax(Integer versionMax) {
    this.versionMax = versionMax;
  }

  public Integer getVersionMin() {
    return this.versionMin;
  }

  public void setVersionMin(Integer versionMin) {
    this.versionMin = versionMin;
  }

  public Integer getIdCountCount() {
    return this.idCountCount;
  }

  public void setIdCountCount(Integer idCountCount) {
    this.idCountCount = idCountCount;
  }

  public Integer getIdCountSum() {
    return this.idCountSum;
  }

  public void setIdCountSum(Integer idCountSum) {
    this.idCountSum = idCountSum;
  }

  public Integer getIdCountAvg() {
    return this.idCountAvg;
  }

  public void setIdCountAvg(Integer idCountAvg) {
    this.idCountAvg = idCountAvg;
  }

  public Integer getIdCountMax() {
    return this.idCountMax;
  }

  public void setIdCountMax(Integer idCountMax) {
    this.idCountMax = idCountMax;
  }

  public Integer getIdCountMin() {
    return this.idCountMin;
  }

  public void setIdCountMin(Integer idCountMin) {
    this.idCountMin = idCountMin;
  }

  public Integer getRoleIdCountCount() {
    return this.roleIdCountCount;
  }

  public void setRoleIdCountCount(Integer roleIdCountCount) {
    this.roleIdCountCount = roleIdCountCount;
  }

  public Integer getRoleIdCountSum() {
    return this.roleIdCountSum;
  }

  public void setRoleIdCountSum(Integer roleIdCountSum) {
    this.roleIdCountSum = roleIdCountSum;
  }

  public Integer getRoleIdCountAvg() {
    return this.roleIdCountAvg;
  }

  public void setRoleIdCountAvg(Integer roleIdCountAvg) {
    this.roleIdCountAvg = roleIdCountAvg;
  }

  public Integer getRoleIdCountMax() {
    return this.roleIdCountMax;
  }

  public void setRoleIdCountMax(Integer roleIdCountMax) {
    this.roleIdCountMax = roleIdCountMax;
  }

  public Integer getRoleIdCountMin() {
    return this.roleIdCountMin;
  }

  public void setRoleIdCountMin(Integer roleIdCountMin) {
    this.roleIdCountMin = roleIdCountMin;
  }

  public Integer getRoleIdSumCount() {
    return this.roleIdSumCount;
  }

  public void setRoleIdSumCount(Integer roleIdSumCount) {
    this.roleIdSumCount = roleIdSumCount;
  }

  public Integer getRoleIdSumSum() {
    return this.roleIdSumSum;
  }

  public void setRoleIdSumSum(Integer roleIdSumSum) {
    this.roleIdSumSum = roleIdSumSum;
  }

  public Integer getRoleIdSumAvg() {
    return this.roleIdSumAvg;
  }

  public void setRoleIdSumAvg(Integer roleIdSumAvg) {
    this.roleIdSumAvg = roleIdSumAvg;
  }

  public Integer getRoleIdSumMax() {
    return this.roleIdSumMax;
  }

  public void setRoleIdSumMax(Integer roleIdSumMax) {
    this.roleIdSumMax = roleIdSumMax;
  }

  public Integer getRoleIdSumMin() {
    return this.roleIdSumMin;
  }

  public void setRoleIdSumMin(Integer roleIdSumMin) {
    this.roleIdSumMin = roleIdSumMin;
  }

  public Integer getRoleIdAvgCount() {
    return this.roleIdAvgCount;
  }

  public void setRoleIdAvgCount(Integer roleIdAvgCount) {
    this.roleIdAvgCount = roleIdAvgCount;
  }

  public Integer getRoleIdAvgSum() {
    return this.roleIdAvgSum;
  }

  public void setRoleIdAvgSum(Integer roleIdAvgSum) {
    this.roleIdAvgSum = roleIdAvgSum;
  }

  public Integer getRoleIdAvgAvg() {
    return this.roleIdAvgAvg;
  }

  public void setRoleIdAvgAvg(Integer roleIdAvgAvg) {
    this.roleIdAvgAvg = roleIdAvgAvg;
  }

  public Integer getRoleIdAvgMax() {
    return this.roleIdAvgMax;
  }

  public void setRoleIdAvgMax(Integer roleIdAvgMax) {
    this.roleIdAvgMax = roleIdAvgMax;
  }

  public Integer getRoleIdAvgMin() {
    return this.roleIdAvgMin;
  }

  public void setRoleIdAvgMin(Integer roleIdAvgMin) {
    this.roleIdAvgMin = roleIdAvgMin;
  }

  public Integer getRoleIdMaxCount() {
    return this.roleIdMaxCount;
  }

  public void setRoleIdMaxCount(Integer roleIdMaxCount) {
    this.roleIdMaxCount = roleIdMaxCount;
  }

  public Integer getRoleIdMaxSum() {
    return this.roleIdMaxSum;
  }

  public void setRoleIdMaxSum(Integer roleIdMaxSum) {
    this.roleIdMaxSum = roleIdMaxSum;
  }

  public Integer getRoleIdMaxAvg() {
    return this.roleIdMaxAvg;
  }

  public void setRoleIdMaxAvg(Integer roleIdMaxAvg) {
    this.roleIdMaxAvg = roleIdMaxAvg;
  }

  public Integer getRoleIdMaxMax() {
    return this.roleIdMaxMax;
  }

  public void setRoleIdMaxMax(Integer roleIdMaxMax) {
    this.roleIdMaxMax = roleIdMaxMax;
  }

  public Integer getRoleIdMaxMin() {
    return this.roleIdMaxMin;
  }

  public void setRoleIdMaxMin(Integer roleIdMaxMin) {
    this.roleIdMaxMin = roleIdMaxMin;
  }

  public Integer getRoleIdMinCount() {
    return this.roleIdMinCount;
  }

  public void setRoleIdMinCount(Integer roleIdMinCount) {
    this.roleIdMinCount = roleIdMinCount;
  }

  public Integer getRoleIdMinSum() {
    return this.roleIdMinSum;
  }

  public void setRoleIdMinSum(Integer roleIdMinSum) {
    this.roleIdMinSum = roleIdMinSum;
  }

  public Integer getRoleIdMinAvg() {
    return this.roleIdMinAvg;
  }

  public void setRoleIdMinAvg(Integer roleIdMinAvg) {
    this.roleIdMinAvg = roleIdMinAvg;
  }

  public Integer getRoleIdMinMax() {
    return this.roleIdMinMax;
  }

  public void setRoleIdMinMax(Integer roleIdMinMax) {
    this.roleIdMinMax = roleIdMinMax;
  }

  public Integer getRoleIdMinMin() {
    return this.roleIdMinMin;
  }

  public void setRoleIdMinMin(Integer roleIdMinMin) {
    this.roleIdMinMin = roleIdMinMin;
  }

  public Integer getCompositeIdCountCount() {
    return this.compositeIdCountCount;
  }

  public void setCompositeIdCountCount(Integer compositeIdCountCount) {
    this.compositeIdCountCount = compositeIdCountCount;
  }

  public Integer getCompositeIdCountSum() {
    return this.compositeIdCountSum;
  }

  public void setCompositeIdCountSum(Integer compositeIdCountSum) {
    this.compositeIdCountSum = compositeIdCountSum;
  }

  public Integer getCompositeIdCountAvg() {
    return this.compositeIdCountAvg;
  }

  public void setCompositeIdCountAvg(Integer compositeIdCountAvg) {
    this.compositeIdCountAvg = compositeIdCountAvg;
  }

  public Integer getCompositeIdCountMax() {
    return this.compositeIdCountMax;
  }

  public void setCompositeIdCountMax(Integer compositeIdCountMax) {
    this.compositeIdCountMax = compositeIdCountMax;
  }

  public Integer getCompositeIdCountMin() {
    return this.compositeIdCountMin;
  }

  public void setCompositeIdCountMin(Integer compositeIdCountMin) {
    this.compositeIdCountMin = compositeIdCountMin;
  }

  public Integer getCompositeIdSumCount() {
    return this.compositeIdSumCount;
  }

  public void setCompositeIdSumCount(Integer compositeIdSumCount) {
    this.compositeIdSumCount = compositeIdSumCount;
  }

  public Integer getCompositeIdSumSum() {
    return this.compositeIdSumSum;
  }

  public void setCompositeIdSumSum(Integer compositeIdSumSum) {
    this.compositeIdSumSum = compositeIdSumSum;
  }

  public Integer getCompositeIdSumAvg() {
    return this.compositeIdSumAvg;
  }

  public void setCompositeIdSumAvg(Integer compositeIdSumAvg) {
    this.compositeIdSumAvg = compositeIdSumAvg;
  }

  public Integer getCompositeIdSumMax() {
    return this.compositeIdSumMax;
  }

  public void setCompositeIdSumMax(Integer compositeIdSumMax) {
    this.compositeIdSumMax = compositeIdSumMax;
  }

  public Integer getCompositeIdSumMin() {
    return this.compositeIdSumMin;
  }

  public void setCompositeIdSumMin(Integer compositeIdSumMin) {
    this.compositeIdSumMin = compositeIdSumMin;
  }

  public Integer getCompositeIdAvgCount() {
    return this.compositeIdAvgCount;
  }

  public void setCompositeIdAvgCount(Integer compositeIdAvgCount) {
    this.compositeIdAvgCount = compositeIdAvgCount;
  }

  public Integer getCompositeIdAvgSum() {
    return this.compositeIdAvgSum;
  }

  public void setCompositeIdAvgSum(Integer compositeIdAvgSum) {
    this.compositeIdAvgSum = compositeIdAvgSum;
  }

  public Integer getCompositeIdAvgAvg() {
    return this.compositeIdAvgAvg;
  }

  public void setCompositeIdAvgAvg(Integer compositeIdAvgAvg) {
    this.compositeIdAvgAvg = compositeIdAvgAvg;
  }

  public Integer getCompositeIdAvgMax() {
    return this.compositeIdAvgMax;
  }

  public void setCompositeIdAvgMax(Integer compositeIdAvgMax) {
    this.compositeIdAvgMax = compositeIdAvgMax;
  }

  public Integer getCompositeIdAvgMin() {
    return this.compositeIdAvgMin;
  }

  public void setCompositeIdAvgMin(Integer compositeIdAvgMin) {
    this.compositeIdAvgMin = compositeIdAvgMin;
  }

  public Integer getCompositeIdMaxCount() {
    return this.compositeIdMaxCount;
  }

  public void setCompositeIdMaxCount(Integer compositeIdMaxCount) {
    this.compositeIdMaxCount = compositeIdMaxCount;
  }

  public Integer getCompositeIdMaxSum() {
    return this.compositeIdMaxSum;
  }

  public void setCompositeIdMaxSum(Integer compositeIdMaxSum) {
    this.compositeIdMaxSum = compositeIdMaxSum;
  }

  public Integer getCompositeIdMaxAvg() {
    return this.compositeIdMaxAvg;
  }

  public void setCompositeIdMaxAvg(Integer compositeIdMaxAvg) {
    this.compositeIdMaxAvg = compositeIdMaxAvg;
  }

  public Integer getCompositeIdMaxMax() {
    return this.compositeIdMaxMax;
  }

  public void setCompositeIdMaxMax(Integer compositeIdMaxMax) {
    this.compositeIdMaxMax = compositeIdMaxMax;
  }

  public Integer getCompositeIdMaxMin() {
    return this.compositeIdMaxMin;
  }

  public void setCompositeIdMaxMin(Integer compositeIdMaxMin) {
    this.compositeIdMaxMin = compositeIdMaxMin;
  }

  public Integer getCompositeIdMinCount() {
    return this.compositeIdMinCount;
  }

  public void setCompositeIdMinCount(Integer compositeIdMinCount) {
    this.compositeIdMinCount = compositeIdMinCount;
  }

  public Integer getCompositeIdMinSum() {
    return this.compositeIdMinSum;
  }

  public void setCompositeIdMinSum(Integer compositeIdMinSum) {
    this.compositeIdMinSum = compositeIdMinSum;
  }

  public Integer getCompositeIdMinAvg() {
    return this.compositeIdMinAvg;
  }

  public void setCompositeIdMinAvg(Integer compositeIdMinAvg) {
    this.compositeIdMinAvg = compositeIdMinAvg;
  }

  public Integer getCompositeIdMinMax() {
    return this.compositeIdMinMax;
  }

  public void setCompositeIdMinMax(Integer compositeIdMinMax) {
    this.compositeIdMinMax = compositeIdMinMax;
  }

  public Integer getCompositeIdMinMin() {
    return this.compositeIdMinMin;
  }

  public void setCompositeIdMinMin(Integer compositeIdMinMin) {
    this.compositeIdMinMin = compositeIdMinMin;
  }
}
