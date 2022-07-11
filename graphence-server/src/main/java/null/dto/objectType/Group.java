package null.dto.objectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import null.dto.interfaceType.Meta;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class Group implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private Integer parentId;

  private Group parent;

  private Collection<Group> subGroups;

  private Collection<User> users;

  private Collection<Role> roles;

  private Realm realm;

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

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer parentIdCount;

  private Integer parentIdSum;

  private Integer parentIdAvg;

  private Integer parentIdMax;

  private Integer parentIdMin;

  private Group subGroupsAggregate;

  private User usersAggregate;

  private Role rolesAggregate;

  private GroupConnection subGroupsConnection;

  private UserConnection usersConnection;

  private RoleConnection rolesConnection;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

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

  private Integer nameMaxCount;

  private String nameMaxMax;

  private String nameMaxMin;

  private Integer nameMinCount;

  private String nameMinMax;

  private String nameMinMin;

  private Integer parentIdCount;

  private Integer parentIdSum;

  private Integer parentIdAvg;

  private Integer parentIdMax;

  private Integer parentIdMin;

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

  private Integer nameCountCount;

  private Integer nameCountSum;

  private Integer nameCountAvg;

  private Integer nameCountMax;

  private Integer nameCountMin;

  private Integer parentIdCountCount;

  private Integer parentIdCountSum;

  private Integer parentIdCountAvg;

  private Integer parentIdCountMax;

  private Integer parentIdCountMin;

  private Integer parentIdSumCount;

  private Integer parentIdSumSum;

  private Integer parentIdSumAvg;

  private Integer parentIdSumMax;

  private Integer parentIdSumMin;

  private Integer parentIdAvgCount;

  private Integer parentIdAvgSum;

  private Integer parentIdAvgAvg;

  private Integer parentIdAvgMax;

  private Integer parentIdAvgMin;

  private Integer parentIdMaxCount;

  private Integer parentIdMaxSum;

  private Integer parentIdMaxAvg;

  private Integer parentIdMaxMax;

  private Integer parentIdMaxMin;

  private Integer parentIdMinCount;

  private Integer parentIdMinSum;

  private Integer parentIdMinAvg;

  private Integer parentIdMinMax;

  private Integer parentIdMinMin;

  private Group subGroupsAggregate;

  private User usersAggregate;

  private Role rolesAggregate;

  private GroupConnection subGroupsConnection;

  private UserConnection usersConnection;

  private RoleConnection rolesConnection;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getParentId() {
    return this.parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Group getParent() {
    return this.parent;
  }

  public void setParent(Group parent) {
    this.parent = parent;
  }

  public Collection<Group> getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(Collection<Group> subGroups) {
    this.subGroups = subGroups;
  }

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
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

  public Integer getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Integer parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Integer getParentIdSum() {
    return this.parentIdSum;
  }

  public void setParentIdSum(Integer parentIdSum) {
    this.parentIdSum = parentIdSum;
  }

  public Integer getParentIdAvg() {
    return this.parentIdAvg;
  }

  public void setParentIdAvg(Integer parentIdAvg) {
    this.parentIdAvg = parentIdAvg;
  }

  public Integer getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(Integer parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public Integer getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(Integer parentIdMin) {
    this.parentIdMin = parentIdMin;
  }

  public Group getSubGroupsAggregate() {
    return this.subGroupsAggregate;
  }

  public void setSubGroupsAggregate(Group subGroupsAggregate) {
    this.subGroupsAggregate = subGroupsAggregate;
  }

  public User getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(User usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public Role getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(Role rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public GroupConnection getSubGroupsConnection() {
    return this.subGroupsConnection;
  }

  public void setSubGroupsConnection(GroupConnection subGroupsConnection) {
    this.subGroupsConnection = subGroupsConnection;
  }

  public UserConnection getUsersConnection() {
    return this.usersConnection;
  }

  public void setUsersConnection(UserConnection usersConnection) {
    this.usersConnection = usersConnection;
  }

  public RoleConnection getRolesConnection() {
    return this.rolesConnection;
  }

  public void setRolesConnection(RoleConnection rolesConnection) {
    this.rolesConnection = rolesConnection;
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

  public Integer getNameMaxCount() {
    return this.nameMaxCount;
  }

  public void setNameMaxCount(Integer nameMaxCount) {
    this.nameMaxCount = nameMaxCount;
  }

  public String getNameMaxMax() {
    return this.nameMaxMax;
  }

  public void setNameMaxMax(String nameMaxMax) {
    this.nameMaxMax = nameMaxMax;
  }

  public String getNameMaxMin() {
    return this.nameMaxMin;
  }

  public void setNameMaxMin(String nameMaxMin) {
    this.nameMaxMin = nameMaxMin;
  }

  public Integer getNameMinCount() {
    return this.nameMinCount;
  }

  public void setNameMinCount(Integer nameMinCount) {
    this.nameMinCount = nameMinCount;
  }

  public String getNameMinMax() {
    return this.nameMinMax;
  }

  public void setNameMinMax(String nameMinMax) {
    this.nameMinMax = nameMinMax;
  }

  public String getNameMinMin() {
    return this.nameMinMin;
  }

  public void setNameMinMin(String nameMinMin) {
    this.nameMinMin = nameMinMin;
  }

  public Integer getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Integer parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Integer getParentIdSum() {
    return this.parentIdSum;
  }

  public void setParentIdSum(Integer parentIdSum) {
    this.parentIdSum = parentIdSum;
  }

  public Integer getParentIdAvg() {
    return this.parentIdAvg;
  }

  public void setParentIdAvg(Integer parentIdAvg) {
    this.parentIdAvg = parentIdAvg;
  }

  public Integer getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(Integer parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public Integer getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(Integer parentIdMin) {
    this.parentIdMin = parentIdMin;
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

  public Integer getNameCountCount() {
    return this.nameCountCount;
  }

  public void setNameCountCount(Integer nameCountCount) {
    this.nameCountCount = nameCountCount;
  }

  public Integer getNameCountSum() {
    return this.nameCountSum;
  }

  public void setNameCountSum(Integer nameCountSum) {
    this.nameCountSum = nameCountSum;
  }

  public Integer getNameCountAvg() {
    return this.nameCountAvg;
  }

  public void setNameCountAvg(Integer nameCountAvg) {
    this.nameCountAvg = nameCountAvg;
  }

  public Integer getNameCountMax() {
    return this.nameCountMax;
  }

  public void setNameCountMax(Integer nameCountMax) {
    this.nameCountMax = nameCountMax;
  }

  public Integer getNameCountMin() {
    return this.nameCountMin;
  }

  public void setNameCountMin(Integer nameCountMin) {
    this.nameCountMin = nameCountMin;
  }

  public Integer getParentIdCountCount() {
    return this.parentIdCountCount;
  }

  public void setParentIdCountCount(Integer parentIdCountCount) {
    this.parentIdCountCount = parentIdCountCount;
  }

  public Integer getParentIdCountSum() {
    return this.parentIdCountSum;
  }

  public void setParentIdCountSum(Integer parentIdCountSum) {
    this.parentIdCountSum = parentIdCountSum;
  }

  public Integer getParentIdCountAvg() {
    return this.parentIdCountAvg;
  }

  public void setParentIdCountAvg(Integer parentIdCountAvg) {
    this.parentIdCountAvg = parentIdCountAvg;
  }

  public Integer getParentIdCountMax() {
    return this.parentIdCountMax;
  }

  public void setParentIdCountMax(Integer parentIdCountMax) {
    this.parentIdCountMax = parentIdCountMax;
  }

  public Integer getParentIdCountMin() {
    return this.parentIdCountMin;
  }

  public void setParentIdCountMin(Integer parentIdCountMin) {
    this.parentIdCountMin = parentIdCountMin;
  }

  public Integer getParentIdSumCount() {
    return this.parentIdSumCount;
  }

  public void setParentIdSumCount(Integer parentIdSumCount) {
    this.parentIdSumCount = parentIdSumCount;
  }

  public Integer getParentIdSumSum() {
    return this.parentIdSumSum;
  }

  public void setParentIdSumSum(Integer parentIdSumSum) {
    this.parentIdSumSum = parentIdSumSum;
  }

  public Integer getParentIdSumAvg() {
    return this.parentIdSumAvg;
  }

  public void setParentIdSumAvg(Integer parentIdSumAvg) {
    this.parentIdSumAvg = parentIdSumAvg;
  }

  public Integer getParentIdSumMax() {
    return this.parentIdSumMax;
  }

  public void setParentIdSumMax(Integer parentIdSumMax) {
    this.parentIdSumMax = parentIdSumMax;
  }

  public Integer getParentIdSumMin() {
    return this.parentIdSumMin;
  }

  public void setParentIdSumMin(Integer parentIdSumMin) {
    this.parentIdSumMin = parentIdSumMin;
  }

  public Integer getParentIdAvgCount() {
    return this.parentIdAvgCount;
  }

  public void setParentIdAvgCount(Integer parentIdAvgCount) {
    this.parentIdAvgCount = parentIdAvgCount;
  }

  public Integer getParentIdAvgSum() {
    return this.parentIdAvgSum;
  }

  public void setParentIdAvgSum(Integer parentIdAvgSum) {
    this.parentIdAvgSum = parentIdAvgSum;
  }

  public Integer getParentIdAvgAvg() {
    return this.parentIdAvgAvg;
  }

  public void setParentIdAvgAvg(Integer parentIdAvgAvg) {
    this.parentIdAvgAvg = parentIdAvgAvg;
  }

  public Integer getParentIdAvgMax() {
    return this.parentIdAvgMax;
  }

  public void setParentIdAvgMax(Integer parentIdAvgMax) {
    this.parentIdAvgMax = parentIdAvgMax;
  }

  public Integer getParentIdAvgMin() {
    return this.parentIdAvgMin;
  }

  public void setParentIdAvgMin(Integer parentIdAvgMin) {
    this.parentIdAvgMin = parentIdAvgMin;
  }

  public Integer getParentIdMaxCount() {
    return this.parentIdMaxCount;
  }

  public void setParentIdMaxCount(Integer parentIdMaxCount) {
    this.parentIdMaxCount = parentIdMaxCount;
  }

  public Integer getParentIdMaxSum() {
    return this.parentIdMaxSum;
  }

  public void setParentIdMaxSum(Integer parentIdMaxSum) {
    this.parentIdMaxSum = parentIdMaxSum;
  }

  public Integer getParentIdMaxAvg() {
    return this.parentIdMaxAvg;
  }

  public void setParentIdMaxAvg(Integer parentIdMaxAvg) {
    this.parentIdMaxAvg = parentIdMaxAvg;
  }

  public Integer getParentIdMaxMax() {
    return this.parentIdMaxMax;
  }

  public void setParentIdMaxMax(Integer parentIdMaxMax) {
    this.parentIdMaxMax = parentIdMaxMax;
  }

  public Integer getParentIdMaxMin() {
    return this.parentIdMaxMin;
  }

  public void setParentIdMaxMin(Integer parentIdMaxMin) {
    this.parentIdMaxMin = parentIdMaxMin;
  }

  public Integer getParentIdMinCount() {
    return this.parentIdMinCount;
  }

  public void setParentIdMinCount(Integer parentIdMinCount) {
    this.parentIdMinCount = parentIdMinCount;
  }

  public Integer getParentIdMinSum() {
    return this.parentIdMinSum;
  }

  public void setParentIdMinSum(Integer parentIdMinSum) {
    this.parentIdMinSum = parentIdMinSum;
  }

  public Integer getParentIdMinAvg() {
    return this.parentIdMinAvg;
  }

  public void setParentIdMinAvg(Integer parentIdMinAvg) {
    this.parentIdMinAvg = parentIdMinAvg;
  }

  public Integer getParentIdMinMax() {
    return this.parentIdMinMax;
  }

  public void setParentIdMinMax(Integer parentIdMinMax) {
    this.parentIdMinMax = parentIdMinMax;
  }

  public Integer getParentIdMinMin() {
    return this.parentIdMinMin;
  }

  public void setParentIdMinMin(Integer parentIdMinMin) {
    this.parentIdMinMin = parentIdMinMin;
  }

  public Group getSubGroupsAggregate() {
    return this.subGroupsAggregate;
  }

  public void setSubGroupsAggregate(Group subGroupsAggregate) {
    this.subGroupsAggregate = subGroupsAggregate;
  }

  public User getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(User usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public Role getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(Role rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public GroupConnection getSubGroupsConnection() {
    return this.subGroupsConnection;
  }

  public void setSubGroupsConnection(GroupConnection subGroupsConnection) {
    this.subGroupsConnection = subGroupsConnection;
  }

  public UserConnection getUsersConnection() {
    return this.usersConnection;
  }

  public void setUsersConnection(UserConnection usersConnection) {
    this.usersConnection = usersConnection;
  }

  public RoleConnection getRolesConnection() {
    return this.rolesConnection;
  }

  public void setRolesConnection(RoleConnection rolesConnection) {
    this.rolesConnection = rolesConnection;
  }
}
