package null.dto.objectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import null.dto.enumType.PermissionLevel;
import null.dto.interfaceType.Meta;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
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

  private String createUserId;

  private String createUserId;

  private String updateUserId;

  private LocalDateTime createTime;

  private Boolean isDeprecated;

  private Boolean isDeprecated;

  private LocalDateTime updateTime;

  private String realmId;

  private String realmId;

  private String updateUserId;

  private Integer version;

  private String createGroupId;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;

  private String createGroupId;

  private Integer version;

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

  private Integer createUserIdCount;

  private String createUserIdMax;

  private String createUserIdMin;

  private Integer createUserIdCount;

  private String createUserIdMax;

  private String createUserIdMin;

  private Integer updateUserIdCount;

  private String updateUserIdMax;

  private String updateUserIdMin;

  private Integer createTimeCount;

  private LocalDateTime createTimeMax;

  private LocalDateTime createTimeMin;

  private Integer updateTimeCount;

  private LocalDateTime updateTimeMax;

  private LocalDateTime updateTimeMin;

  private Integer realmIdCount;

  private String realmIdMax;

  private String realmIdMin;

  private Integer realmIdCount;

  private String realmIdMax;

  private String realmIdMin;

  private Integer updateUserIdCount;

  private String updateUserIdMax;

  private String updateUserIdMin;

  private Integer createGroupIdCount;

  private String createGroupIdMax;

  private String createGroupIdMin;

  private Integer createTimeCount;

  private LocalDateTime createTimeMax;

  private LocalDateTime createTimeMin;

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

  private Integer roleIdMaxCount;

  private String roleIdMaxMax;

  private String roleIdMaxMin;

  private Integer roleIdMinCount;

  private String roleIdMinMax;

  private String roleIdMinMin;

  private Integer fieldIdMaxCount;

  private String fieldIdMaxMax;

  private String fieldIdMaxMin;

  private Integer fieldIdMinCount;

  private String fieldIdMinMax;

  private String fieldIdMinMin;

  private Integer versionCount;

  private Integer versionSum;

  private Integer versionAvg;

  private Integer versionMax;

  private Integer versionMin;

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

  private Integer fieldIdCountCount;

  private Integer fieldIdCountSum;

  private Integer fieldIdCountAvg;

  private Integer fieldIdCountMax;

  private Integer fieldIdCountMin;

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
  @Override
  @Override
  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  @Override
  @Override
  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  @Override
  @Override
  @Override
  public void setVersion(Integer version) {
    this.version = version;
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

  public Integer getRoleIdMaxCount() {
    return this.roleIdMaxCount;
  }

  public void setRoleIdMaxCount(Integer roleIdMaxCount) {
    this.roleIdMaxCount = roleIdMaxCount;
  }

  public String getRoleIdMaxMax() {
    return this.roleIdMaxMax;
  }

  public void setRoleIdMaxMax(String roleIdMaxMax) {
    this.roleIdMaxMax = roleIdMaxMax;
  }

  public String getRoleIdMaxMin() {
    return this.roleIdMaxMin;
  }

  public void setRoleIdMaxMin(String roleIdMaxMin) {
    this.roleIdMaxMin = roleIdMaxMin;
  }

  public Integer getRoleIdMinCount() {
    return this.roleIdMinCount;
  }

  public void setRoleIdMinCount(Integer roleIdMinCount) {
    this.roleIdMinCount = roleIdMinCount;
  }

  public String getRoleIdMinMax() {
    return this.roleIdMinMax;
  }

  public void setRoleIdMinMax(String roleIdMinMax) {
    this.roleIdMinMax = roleIdMinMax;
  }

  public String getRoleIdMinMin() {
    return this.roleIdMinMin;
  }

  public void setRoleIdMinMin(String roleIdMinMin) {
    this.roleIdMinMin = roleIdMinMin;
  }

  public Integer getFieldIdMaxCount() {
    return this.fieldIdMaxCount;
  }

  public void setFieldIdMaxCount(Integer fieldIdMaxCount) {
    this.fieldIdMaxCount = fieldIdMaxCount;
  }

  public String getFieldIdMaxMax() {
    return this.fieldIdMaxMax;
  }

  public void setFieldIdMaxMax(String fieldIdMaxMax) {
    this.fieldIdMaxMax = fieldIdMaxMax;
  }

  public String getFieldIdMaxMin() {
    return this.fieldIdMaxMin;
  }

  public void setFieldIdMaxMin(String fieldIdMaxMin) {
    this.fieldIdMaxMin = fieldIdMaxMin;
  }

  public Integer getFieldIdMinCount() {
    return this.fieldIdMinCount;
  }

  public void setFieldIdMinCount(Integer fieldIdMinCount) {
    this.fieldIdMinCount = fieldIdMinCount;
  }

  public String getFieldIdMinMax() {
    return this.fieldIdMinMax;
  }

  public void setFieldIdMinMax(String fieldIdMinMax) {
    this.fieldIdMinMax = fieldIdMinMax;
  }

  public String getFieldIdMinMin() {
    return this.fieldIdMinMin;
  }

  public void setFieldIdMinMin(String fieldIdMinMin) {
    this.fieldIdMinMin = fieldIdMinMin;
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

  public Integer getFieldIdCountCount() {
    return this.fieldIdCountCount;
  }

  public void setFieldIdCountCount(Integer fieldIdCountCount) {
    this.fieldIdCountCount = fieldIdCountCount;
  }

  public Integer getFieldIdCountSum() {
    return this.fieldIdCountSum;
  }

  public void setFieldIdCountSum(Integer fieldIdCountSum) {
    this.fieldIdCountSum = fieldIdCountSum;
  }

  public Integer getFieldIdCountAvg() {
    return this.fieldIdCountAvg;
  }

  public void setFieldIdCountAvg(Integer fieldIdCountAvg) {
    this.fieldIdCountAvg = fieldIdCountAvg;
  }

  public Integer getFieldIdCountMax() {
    return this.fieldIdCountMax;
  }

  public void setFieldIdCountMax(Integer fieldIdCountMax) {
    this.fieldIdCountMax = fieldIdCountMax;
  }

  public Integer getFieldIdCountMin() {
    return this.fieldIdCountMin;
  }

  public void setFieldIdCountMin(Integer fieldIdCountMin) {
    this.fieldIdCountMin = fieldIdCountMin;
  }
}
