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
public class User implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private String lastName;

  @NonNull
  private String login;

  @NonNull
  private String password;

  private String email;

  private Boolean disable;

  private Collection<Group> groups;

  private Collection<Role> roles;

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

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer lastNameCount;

  private String lastNameMax;

  private String lastNameMin;

  private Integer loginCount;

  private String loginMax;

  private String loginMin;

  private Integer passwordCount;

  private String passwordMax;

  private String passwordMin;

  private Integer emailCount;

  private String emailMax;

  private String emailMin;

  private Group groupsAggregate;

  private Role rolesAggregate;

  private GroupConnection groupsConnection;

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

  private Integer lastNameCount;

  private String lastNameMax;

  private String lastNameMin;

  private Integer loginCount;

  private String loginMax;

  private String loginMin;

  private Integer passwordCount;

  private String passwordMax;

  private String passwordMin;

  private Integer emailCount;

  private String emailMax;

  private String emailMin;

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

  private Integer nameMaxCount;

  private String nameMaxMax;

  private String nameMaxMin;

  private Integer nameMinCount;

  private String nameMinMax;

  private String nameMinMin;

  private Integer lastNameMaxCount;

  private String lastNameMaxMax;

  private String lastNameMaxMin;

  private Integer lastNameMinCount;

  private String lastNameMinMax;

  private String lastNameMinMin;

  private Integer loginMaxCount;

  private String loginMaxMax;

  private String loginMaxMin;

  private Integer loginMinCount;

  private String loginMinMax;

  private String loginMinMin;

  private Integer passwordMaxCount;

  private String passwordMaxMax;

  private String passwordMaxMin;

  private Integer passwordMinCount;

  private String passwordMinMax;

  private String passwordMinMin;

  private Integer emailMaxCount;

  private String emailMaxMax;

  private String emailMaxMin;

  private Integer emailMinCount;

  private String emailMinMax;

  private String emailMinMin;

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

  private Integer nameCountCount;

  private Integer nameCountSum;

  private Integer nameCountAvg;

  private Integer nameCountMax;

  private Integer nameCountMin;

  private Integer lastNameCountCount;

  private Integer lastNameCountSum;

  private Integer lastNameCountAvg;

  private Integer lastNameCountMax;

  private Integer lastNameCountMin;

  private Integer loginCountCount;

  private Integer loginCountSum;

  private Integer loginCountAvg;

  private Integer loginCountMax;

  private Integer loginCountMin;

  private Integer passwordCountCount;

  private Integer passwordCountSum;

  private Integer passwordCountAvg;

  private Integer passwordCountMax;

  private Integer passwordCountMin;

  private Integer emailCountCount;

  private Integer emailCountSum;

  private Integer emailCountAvg;

  private Integer emailCountMax;

  private Integer emailCountMin;

  private Group groupsAggregate;

  private Role rolesAggregate;

  private GroupConnection groupsConnection;

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

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getDisable() {
    return this.disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public Collection<Group> getGroups() {
    return this.groups;
  }

  public void setGroups(Collection<Group> groups) {
    this.groups = groups;
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

  public Integer getLastNameCount() {
    return this.lastNameCount;
  }

  public void setLastNameCount(Integer lastNameCount) {
    this.lastNameCount = lastNameCount;
  }

  public String getLastNameMax() {
    return this.lastNameMax;
  }

  public void setLastNameMax(String lastNameMax) {
    this.lastNameMax = lastNameMax;
  }

  public String getLastNameMin() {
    return this.lastNameMin;
  }

  public void setLastNameMin(String lastNameMin) {
    this.lastNameMin = lastNameMin;
  }

  public Integer getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }

  public String getLoginMax() {
    return this.loginMax;
  }

  public void setLoginMax(String loginMax) {
    this.loginMax = loginMax;
  }

  public String getLoginMin() {
    return this.loginMin;
  }

  public void setLoginMin(String loginMin) {
    this.loginMin = loginMin;
  }

  public Integer getPasswordCount() {
    return this.passwordCount;
  }

  public void setPasswordCount(Integer passwordCount) {
    this.passwordCount = passwordCount;
  }

  public String getPasswordMax() {
    return this.passwordMax;
  }

  public void setPasswordMax(String passwordMax) {
    this.passwordMax = passwordMax;
  }

  public String getPasswordMin() {
    return this.passwordMin;
  }

  public void setPasswordMin(String passwordMin) {
    this.passwordMin = passwordMin;
  }

  public Integer getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Integer emailCount) {
    this.emailCount = emailCount;
  }

  public String getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(String emailMax) {
    this.emailMax = emailMax;
  }

  public String getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(String emailMin) {
    this.emailMin = emailMin;
  }

  public Group getGroupsAggregate() {
    return this.groupsAggregate;
  }

  public void setGroupsAggregate(Group groupsAggregate) {
    this.groupsAggregate = groupsAggregate;
  }

  public Role getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(Role rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public GroupConnection getGroupsConnection() {
    return this.groupsConnection;
  }

  public void setGroupsConnection(GroupConnection groupsConnection) {
    this.groupsConnection = groupsConnection;
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

  public Integer getLastNameCount() {
    return this.lastNameCount;
  }

  public void setLastNameCount(Integer lastNameCount) {
    this.lastNameCount = lastNameCount;
  }

  public String getLastNameMax() {
    return this.lastNameMax;
  }

  public void setLastNameMax(String lastNameMax) {
    this.lastNameMax = lastNameMax;
  }

  public String getLastNameMin() {
    return this.lastNameMin;
  }

  public void setLastNameMin(String lastNameMin) {
    this.lastNameMin = lastNameMin;
  }

  public Integer getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }

  public String getLoginMax() {
    return this.loginMax;
  }

  public void setLoginMax(String loginMax) {
    this.loginMax = loginMax;
  }

  public String getLoginMin() {
    return this.loginMin;
  }

  public void setLoginMin(String loginMin) {
    this.loginMin = loginMin;
  }

  public Integer getPasswordCount() {
    return this.passwordCount;
  }

  public void setPasswordCount(Integer passwordCount) {
    this.passwordCount = passwordCount;
  }

  public String getPasswordMax() {
    return this.passwordMax;
  }

  public void setPasswordMax(String passwordMax) {
    this.passwordMax = passwordMax;
  }

  public String getPasswordMin() {
    return this.passwordMin;
  }

  public void setPasswordMin(String passwordMin) {
    this.passwordMin = passwordMin;
  }

  public Integer getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Integer emailCount) {
    this.emailCount = emailCount;
  }

  public String getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(String emailMax) {
    this.emailMax = emailMax;
  }

  public String getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(String emailMin) {
    this.emailMin = emailMin;
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

  public Integer getLastNameMaxCount() {
    return this.lastNameMaxCount;
  }

  public void setLastNameMaxCount(Integer lastNameMaxCount) {
    this.lastNameMaxCount = lastNameMaxCount;
  }

  public String getLastNameMaxMax() {
    return this.lastNameMaxMax;
  }

  public void setLastNameMaxMax(String lastNameMaxMax) {
    this.lastNameMaxMax = lastNameMaxMax;
  }

  public String getLastNameMaxMin() {
    return this.lastNameMaxMin;
  }

  public void setLastNameMaxMin(String lastNameMaxMin) {
    this.lastNameMaxMin = lastNameMaxMin;
  }

  public Integer getLastNameMinCount() {
    return this.lastNameMinCount;
  }

  public void setLastNameMinCount(Integer lastNameMinCount) {
    this.lastNameMinCount = lastNameMinCount;
  }

  public String getLastNameMinMax() {
    return this.lastNameMinMax;
  }

  public void setLastNameMinMax(String lastNameMinMax) {
    this.lastNameMinMax = lastNameMinMax;
  }

  public String getLastNameMinMin() {
    return this.lastNameMinMin;
  }

  public void setLastNameMinMin(String lastNameMinMin) {
    this.lastNameMinMin = lastNameMinMin;
  }

  public Integer getLoginMaxCount() {
    return this.loginMaxCount;
  }

  public void setLoginMaxCount(Integer loginMaxCount) {
    this.loginMaxCount = loginMaxCount;
  }

  public String getLoginMaxMax() {
    return this.loginMaxMax;
  }

  public void setLoginMaxMax(String loginMaxMax) {
    this.loginMaxMax = loginMaxMax;
  }

  public String getLoginMaxMin() {
    return this.loginMaxMin;
  }

  public void setLoginMaxMin(String loginMaxMin) {
    this.loginMaxMin = loginMaxMin;
  }

  public Integer getLoginMinCount() {
    return this.loginMinCount;
  }

  public void setLoginMinCount(Integer loginMinCount) {
    this.loginMinCount = loginMinCount;
  }

  public String getLoginMinMax() {
    return this.loginMinMax;
  }

  public void setLoginMinMax(String loginMinMax) {
    this.loginMinMax = loginMinMax;
  }

  public String getLoginMinMin() {
    return this.loginMinMin;
  }

  public void setLoginMinMin(String loginMinMin) {
    this.loginMinMin = loginMinMin;
  }

  public Integer getPasswordMaxCount() {
    return this.passwordMaxCount;
  }

  public void setPasswordMaxCount(Integer passwordMaxCount) {
    this.passwordMaxCount = passwordMaxCount;
  }

  public String getPasswordMaxMax() {
    return this.passwordMaxMax;
  }

  public void setPasswordMaxMax(String passwordMaxMax) {
    this.passwordMaxMax = passwordMaxMax;
  }

  public String getPasswordMaxMin() {
    return this.passwordMaxMin;
  }

  public void setPasswordMaxMin(String passwordMaxMin) {
    this.passwordMaxMin = passwordMaxMin;
  }

  public Integer getPasswordMinCount() {
    return this.passwordMinCount;
  }

  public void setPasswordMinCount(Integer passwordMinCount) {
    this.passwordMinCount = passwordMinCount;
  }

  public String getPasswordMinMax() {
    return this.passwordMinMax;
  }

  public void setPasswordMinMax(String passwordMinMax) {
    this.passwordMinMax = passwordMinMax;
  }

  public String getPasswordMinMin() {
    return this.passwordMinMin;
  }

  public void setPasswordMinMin(String passwordMinMin) {
    this.passwordMinMin = passwordMinMin;
  }

  public Integer getEmailMaxCount() {
    return this.emailMaxCount;
  }

  public void setEmailMaxCount(Integer emailMaxCount) {
    this.emailMaxCount = emailMaxCount;
  }

  public String getEmailMaxMax() {
    return this.emailMaxMax;
  }

  public void setEmailMaxMax(String emailMaxMax) {
    this.emailMaxMax = emailMaxMax;
  }

  public String getEmailMaxMin() {
    return this.emailMaxMin;
  }

  public void setEmailMaxMin(String emailMaxMin) {
    this.emailMaxMin = emailMaxMin;
  }

  public Integer getEmailMinCount() {
    return this.emailMinCount;
  }

  public void setEmailMinCount(Integer emailMinCount) {
    this.emailMinCount = emailMinCount;
  }

  public String getEmailMinMax() {
    return this.emailMinMax;
  }

  public void setEmailMinMax(String emailMinMax) {
    this.emailMinMax = emailMinMax;
  }

  public String getEmailMinMin() {
    return this.emailMinMin;
  }

  public void setEmailMinMin(String emailMinMin) {
    this.emailMinMin = emailMinMin;
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

  public Integer getLastNameCountCount() {
    return this.lastNameCountCount;
  }

  public void setLastNameCountCount(Integer lastNameCountCount) {
    this.lastNameCountCount = lastNameCountCount;
  }

  public Integer getLastNameCountSum() {
    return this.lastNameCountSum;
  }

  public void setLastNameCountSum(Integer lastNameCountSum) {
    this.lastNameCountSum = lastNameCountSum;
  }

  public Integer getLastNameCountAvg() {
    return this.lastNameCountAvg;
  }

  public void setLastNameCountAvg(Integer lastNameCountAvg) {
    this.lastNameCountAvg = lastNameCountAvg;
  }

  public Integer getLastNameCountMax() {
    return this.lastNameCountMax;
  }

  public void setLastNameCountMax(Integer lastNameCountMax) {
    this.lastNameCountMax = lastNameCountMax;
  }

  public Integer getLastNameCountMin() {
    return this.lastNameCountMin;
  }

  public void setLastNameCountMin(Integer lastNameCountMin) {
    this.lastNameCountMin = lastNameCountMin;
  }

  public Integer getLoginCountCount() {
    return this.loginCountCount;
  }

  public void setLoginCountCount(Integer loginCountCount) {
    this.loginCountCount = loginCountCount;
  }

  public Integer getLoginCountSum() {
    return this.loginCountSum;
  }

  public void setLoginCountSum(Integer loginCountSum) {
    this.loginCountSum = loginCountSum;
  }

  public Integer getLoginCountAvg() {
    return this.loginCountAvg;
  }

  public void setLoginCountAvg(Integer loginCountAvg) {
    this.loginCountAvg = loginCountAvg;
  }

  public Integer getLoginCountMax() {
    return this.loginCountMax;
  }

  public void setLoginCountMax(Integer loginCountMax) {
    this.loginCountMax = loginCountMax;
  }

  public Integer getLoginCountMin() {
    return this.loginCountMin;
  }

  public void setLoginCountMin(Integer loginCountMin) {
    this.loginCountMin = loginCountMin;
  }

  public Integer getPasswordCountCount() {
    return this.passwordCountCount;
  }

  public void setPasswordCountCount(Integer passwordCountCount) {
    this.passwordCountCount = passwordCountCount;
  }

  public Integer getPasswordCountSum() {
    return this.passwordCountSum;
  }

  public void setPasswordCountSum(Integer passwordCountSum) {
    this.passwordCountSum = passwordCountSum;
  }

  public Integer getPasswordCountAvg() {
    return this.passwordCountAvg;
  }

  public void setPasswordCountAvg(Integer passwordCountAvg) {
    this.passwordCountAvg = passwordCountAvg;
  }

  public Integer getPasswordCountMax() {
    return this.passwordCountMax;
  }

  public void setPasswordCountMax(Integer passwordCountMax) {
    this.passwordCountMax = passwordCountMax;
  }

  public Integer getPasswordCountMin() {
    return this.passwordCountMin;
  }

  public void setPasswordCountMin(Integer passwordCountMin) {
    this.passwordCountMin = passwordCountMin;
  }

  public Integer getEmailCountCount() {
    return this.emailCountCount;
  }

  public void setEmailCountCount(Integer emailCountCount) {
    this.emailCountCount = emailCountCount;
  }

  public Integer getEmailCountSum() {
    return this.emailCountSum;
  }

  public void setEmailCountSum(Integer emailCountSum) {
    this.emailCountSum = emailCountSum;
  }

  public Integer getEmailCountAvg() {
    return this.emailCountAvg;
  }

  public void setEmailCountAvg(Integer emailCountAvg) {
    this.emailCountAvg = emailCountAvg;
  }

  public Integer getEmailCountMax() {
    return this.emailCountMax;
  }

  public void setEmailCountMax(Integer emailCountMax) {
    this.emailCountMax = emailCountMax;
  }

  public Integer getEmailCountMin() {
    return this.emailCountMin;
  }

  public void setEmailCountMin(Integer emailCountMin) {
    this.emailCountMin = emailCountMin;
  }

  public Group getGroupsAggregate() {
    return this.groupsAggregate;
  }

  public void setGroupsAggregate(Group groupsAggregate) {
    this.groupsAggregate = groupsAggregate;
  }

  public Role getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(Role rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public GroupConnection getGroupsConnection() {
    return this.groupsConnection;
  }

  public void setGroupsConnection(GroupConnection groupsConnection) {
    this.groupsConnection = groupsConnection;
  }

  public RoleConnection getRolesConnection() {
    return this.rolesConnection;
  }

  public void setRolesConnection(RoleConnection rolesConnection) {
    this.rolesConnection = rolesConnection;
  }
}
