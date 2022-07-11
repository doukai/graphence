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
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class __TypePossibleTypes implements Meta {
  @Id
  private String id;

  @NonNull
  private String typeName;

  @NonNull
  private String possibleTypeName;

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

  private Integer typeNameCount;

  private String typeNameMax;

  private String typeNameMin;

  private Integer possibleTypeNameCount;

  private String possibleTypeNameMax;

  private String possibleTypeNameMin;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer typeNameCount;

  private String typeNameMax;

  private String typeNameMin;

  private Integer possibleTypeNameCount;

  private String possibleTypeNameMax;

  private String possibleTypeNameMin;

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

  private Integer typeNameMaxCount;

  private String typeNameMaxMax;

  private String typeNameMaxMin;

  private Integer typeNameMinCount;

  private String typeNameMinMax;

  private String typeNameMinMin;

  private Integer possibleTypeNameMaxCount;

  private String possibleTypeNameMaxMax;

  private String possibleTypeNameMaxMin;

  private Integer possibleTypeNameMinCount;

  private String possibleTypeNameMinMax;

  private String possibleTypeNameMinMin;

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

  private Integer typeNameCountCount;

  private Integer typeNameCountSum;

  private Integer typeNameCountAvg;

  private Integer typeNameCountMax;

  private Integer typeNameCountMin;

  private Integer possibleTypeNameCountCount;

  private Integer possibleTypeNameCountSum;

  private Integer possibleTypeNameCountAvg;

  private Integer possibleTypeNameCountMax;

  private Integer possibleTypeNameCountMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTypeName() {
    return this.typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getPossibleTypeName() {
    return this.possibleTypeName;
  }

  public void setPossibleTypeName(String possibleTypeName) {
    this.possibleTypeName = possibleTypeName;
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

  public Integer getTypeNameCount() {
    return this.typeNameCount;
  }

  public void setTypeNameCount(Integer typeNameCount) {
    this.typeNameCount = typeNameCount;
  }

  public String getTypeNameMax() {
    return this.typeNameMax;
  }

  public void setTypeNameMax(String typeNameMax) {
    this.typeNameMax = typeNameMax;
  }

  public String getTypeNameMin() {
    return this.typeNameMin;
  }

  public void setTypeNameMin(String typeNameMin) {
    this.typeNameMin = typeNameMin;
  }

  public Integer getPossibleTypeNameCount() {
    return this.possibleTypeNameCount;
  }

  public void setPossibleTypeNameCount(Integer possibleTypeNameCount) {
    this.possibleTypeNameCount = possibleTypeNameCount;
  }

  public String getPossibleTypeNameMax() {
    return this.possibleTypeNameMax;
  }

  public void setPossibleTypeNameMax(String possibleTypeNameMax) {
    this.possibleTypeNameMax = possibleTypeNameMax;
  }

  public String getPossibleTypeNameMin() {
    return this.possibleTypeNameMin;
  }

  public void setPossibleTypeNameMin(String possibleTypeNameMin) {
    this.possibleTypeNameMin = possibleTypeNameMin;
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

  public Integer getTypeNameCount() {
    return this.typeNameCount;
  }

  public void setTypeNameCount(Integer typeNameCount) {
    this.typeNameCount = typeNameCount;
  }

  public String getTypeNameMax() {
    return this.typeNameMax;
  }

  public void setTypeNameMax(String typeNameMax) {
    this.typeNameMax = typeNameMax;
  }

  public String getTypeNameMin() {
    return this.typeNameMin;
  }

  public void setTypeNameMin(String typeNameMin) {
    this.typeNameMin = typeNameMin;
  }

  public Integer getPossibleTypeNameCount() {
    return this.possibleTypeNameCount;
  }

  public void setPossibleTypeNameCount(Integer possibleTypeNameCount) {
    this.possibleTypeNameCount = possibleTypeNameCount;
  }

  public String getPossibleTypeNameMax() {
    return this.possibleTypeNameMax;
  }

  public void setPossibleTypeNameMax(String possibleTypeNameMax) {
    this.possibleTypeNameMax = possibleTypeNameMax;
  }

  public String getPossibleTypeNameMin() {
    return this.possibleTypeNameMin;
  }

  public void setPossibleTypeNameMin(String possibleTypeNameMin) {
    this.possibleTypeNameMin = possibleTypeNameMin;
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

  public Integer getTypeNameMaxCount() {
    return this.typeNameMaxCount;
  }

  public void setTypeNameMaxCount(Integer typeNameMaxCount) {
    this.typeNameMaxCount = typeNameMaxCount;
  }

  public String getTypeNameMaxMax() {
    return this.typeNameMaxMax;
  }

  public void setTypeNameMaxMax(String typeNameMaxMax) {
    this.typeNameMaxMax = typeNameMaxMax;
  }

  public String getTypeNameMaxMin() {
    return this.typeNameMaxMin;
  }

  public void setTypeNameMaxMin(String typeNameMaxMin) {
    this.typeNameMaxMin = typeNameMaxMin;
  }

  public Integer getTypeNameMinCount() {
    return this.typeNameMinCount;
  }

  public void setTypeNameMinCount(Integer typeNameMinCount) {
    this.typeNameMinCount = typeNameMinCount;
  }

  public String getTypeNameMinMax() {
    return this.typeNameMinMax;
  }

  public void setTypeNameMinMax(String typeNameMinMax) {
    this.typeNameMinMax = typeNameMinMax;
  }

  public String getTypeNameMinMin() {
    return this.typeNameMinMin;
  }

  public void setTypeNameMinMin(String typeNameMinMin) {
    this.typeNameMinMin = typeNameMinMin;
  }

  public Integer getPossibleTypeNameMaxCount() {
    return this.possibleTypeNameMaxCount;
  }

  public void setPossibleTypeNameMaxCount(Integer possibleTypeNameMaxCount) {
    this.possibleTypeNameMaxCount = possibleTypeNameMaxCount;
  }

  public String getPossibleTypeNameMaxMax() {
    return this.possibleTypeNameMaxMax;
  }

  public void setPossibleTypeNameMaxMax(String possibleTypeNameMaxMax) {
    this.possibleTypeNameMaxMax = possibleTypeNameMaxMax;
  }

  public String getPossibleTypeNameMaxMin() {
    return this.possibleTypeNameMaxMin;
  }

  public void setPossibleTypeNameMaxMin(String possibleTypeNameMaxMin) {
    this.possibleTypeNameMaxMin = possibleTypeNameMaxMin;
  }

  public Integer getPossibleTypeNameMinCount() {
    return this.possibleTypeNameMinCount;
  }

  public void setPossibleTypeNameMinCount(Integer possibleTypeNameMinCount) {
    this.possibleTypeNameMinCount = possibleTypeNameMinCount;
  }

  public String getPossibleTypeNameMinMax() {
    return this.possibleTypeNameMinMax;
  }

  public void setPossibleTypeNameMinMax(String possibleTypeNameMinMax) {
    this.possibleTypeNameMinMax = possibleTypeNameMinMax;
  }

  public String getPossibleTypeNameMinMin() {
    return this.possibleTypeNameMinMin;
  }

  public void setPossibleTypeNameMinMin(String possibleTypeNameMinMin) {
    this.possibleTypeNameMinMin = possibleTypeNameMinMin;
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

  public Integer getTypeNameCountCount() {
    return this.typeNameCountCount;
  }

  public void setTypeNameCountCount(Integer typeNameCountCount) {
    this.typeNameCountCount = typeNameCountCount;
  }

  public Integer getTypeNameCountSum() {
    return this.typeNameCountSum;
  }

  public void setTypeNameCountSum(Integer typeNameCountSum) {
    this.typeNameCountSum = typeNameCountSum;
  }

  public Integer getTypeNameCountAvg() {
    return this.typeNameCountAvg;
  }

  public void setTypeNameCountAvg(Integer typeNameCountAvg) {
    this.typeNameCountAvg = typeNameCountAvg;
  }

  public Integer getTypeNameCountMax() {
    return this.typeNameCountMax;
  }

  public void setTypeNameCountMax(Integer typeNameCountMax) {
    this.typeNameCountMax = typeNameCountMax;
  }

  public Integer getTypeNameCountMin() {
    return this.typeNameCountMin;
  }

  public void setTypeNameCountMin(Integer typeNameCountMin) {
    this.typeNameCountMin = typeNameCountMin;
  }

  public Integer getPossibleTypeNameCountCount() {
    return this.possibleTypeNameCountCount;
  }

  public void setPossibleTypeNameCountCount(Integer possibleTypeNameCountCount) {
    this.possibleTypeNameCountCount = possibleTypeNameCountCount;
  }

  public Integer getPossibleTypeNameCountSum() {
    return this.possibleTypeNameCountSum;
  }

  public void setPossibleTypeNameCountSum(Integer possibleTypeNameCountSum) {
    this.possibleTypeNameCountSum = possibleTypeNameCountSum;
  }

  public Integer getPossibleTypeNameCountAvg() {
    return this.possibleTypeNameCountAvg;
  }

  public void setPossibleTypeNameCountAvg(Integer possibleTypeNameCountAvg) {
    this.possibleTypeNameCountAvg = possibleTypeNameCountAvg;
  }

  public Integer getPossibleTypeNameCountMax() {
    return this.possibleTypeNameCountMax;
  }

  public void setPossibleTypeNameCountMax(Integer possibleTypeNameCountMax) {
    this.possibleTypeNameCountMax = possibleTypeNameCountMax;
  }

  public Integer getPossibleTypeNameCountMin() {
    return this.possibleTypeNameCountMin;
  }

  public void setPossibleTypeNameCountMin(Integer possibleTypeNameCountMin) {
    this.possibleTypeNameCountMin = possibleTypeNameCountMin;
  }
}
