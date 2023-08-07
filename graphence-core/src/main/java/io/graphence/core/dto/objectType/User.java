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
import java.util.Collection;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class User implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private String lastName;

  @NonNull
  private String login;

  private String password;

  private String email;

  private Collection<String> phones;

  private Boolean disable;

  private Collection<Group> groups;

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

  private Integer idMax;

  private Integer idMin;

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

  private GroupConnection groupsConnection;

  private Role rolesAggregate;

  private RoleConnection rolesConnection;

  private Integer realmIdCount;

  private Integer realmIdSum;

  private Integer realmIdAvg;

  private Integer realmIdMax;

  private Integer realmIdMin;

  private Collection<UserPhones> userPhones;

  private UserPhones userPhonesAggregate;

  private UserPhonesConnection userPhonesConnection;

  private Collection<UserGroup> userGroup;

  private UserGroup userGroupAggregate;

  private UserGroupConnection userGroupConnection;

  private Collection<UserRole> userRole;

  private UserRole userRoleAggregate;

  private UserRoleConnection userRoleConnection;

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

  public Collection<String> getPhones() {
    return this.phones;
  }

  public void setPhones(Collection<String> phones) {
    this.phones = phones;
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

  public GroupConnection getGroupsConnection() {
    return this.groupsConnection;
  }

  public void setGroupsConnection(GroupConnection groupsConnection) {
    this.groupsConnection = groupsConnection;
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

  public Integer getRealmIdCount() {
    return this.realmIdCount;
  }

  public void setRealmIdCount(Integer realmIdCount) {
    this.realmIdCount = realmIdCount;
  }

  public Integer getRealmIdSum() {
    return this.realmIdSum;
  }

  public void setRealmIdSum(Integer realmIdSum) {
    this.realmIdSum = realmIdSum;
  }

  public Integer getRealmIdAvg() {
    return this.realmIdAvg;
  }

  public void setRealmIdAvg(Integer realmIdAvg) {
    this.realmIdAvg = realmIdAvg;
  }

  public Integer getRealmIdMax() {
    return this.realmIdMax;
  }

  public void setRealmIdMax(Integer realmIdMax) {
    this.realmIdMax = realmIdMax;
  }

  public Integer getRealmIdMin() {
    return this.realmIdMin;
  }

  public void setRealmIdMin(Integer realmIdMin) {
    this.realmIdMin = realmIdMin;
  }

  public Collection<UserPhones> getUserPhones() {
    return this.userPhones;
  }

  public void setUserPhones(Collection<UserPhones> userPhones) {
    this.userPhones = userPhones;
  }

  public UserPhones getUserPhonesAggregate() {
    return this.userPhonesAggregate;
  }

  public void setUserPhonesAggregate(UserPhones userPhonesAggregate) {
    this.userPhonesAggregate = userPhonesAggregate;
  }

  public UserPhonesConnection getUserPhonesConnection() {
    return this.userPhonesConnection;
  }

  public void setUserPhonesConnection(UserPhonesConnection userPhonesConnection) {
    this.userPhonesConnection = userPhonesConnection;
  }

  public Collection<UserGroup> getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(Collection<UserGroup> userGroup) {
    this.userGroup = userGroup;
  }

  public UserGroup getUserGroupAggregate() {
    return this.userGroupAggregate;
  }

  public void setUserGroupAggregate(UserGroup userGroupAggregate) {
    this.userGroupAggregate = userGroupAggregate;
  }

  public UserGroupConnection getUserGroupConnection() {
    return this.userGroupConnection;
  }

  public void setUserGroupConnection(UserGroupConnection userGroupConnection) {
    this.userGroupConnection = userGroupConnection;
  }

  public Collection<UserRole> getUserRole() {
    return this.userRole;
  }

  public void setUserRole(Collection<UserRole> userRole) {
    this.userRole = userRole;
  }

  public UserRole getUserRoleAggregate() {
    return this.userRoleAggregate;
  }

  public void setUserRoleAggregate(UserRole userRoleAggregate) {
    this.userRoleAggregate = userRoleAggregate;
  }

  public UserRoleConnection getUserRoleConnection() {
    return this.userRoleConnection;
  }

  public void setUserRoleConnection(UserRoleConnection userRoleConnection) {
    this.userRoleConnection = userRoleConnection;
  }
}
