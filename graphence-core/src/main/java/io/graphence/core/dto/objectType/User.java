package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.UserInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.structure.dto.interfaceType.NamedStruct;
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
 * 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户")
public class User implements NamedStruct, Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 姓名
   */
  @NonNull
  @Description("姓名")
  private String name;

  /**
   * 描述
   */
  @Description("描述")
  private String description;

  /**
   * 姓氏
   */
  @Description("姓氏")
  private String lastName;

  /**
   * 账号
   */
  @NonNull
  @Description("账号")
  private String login;

  /**
   * 盐
   */
  @Description("盐")
  private String salt;

  /**
   * 哈希
   */
  @Description("哈希")
  private String hash;

  /**
   * 邮箱
   */
  @Description("邮箱")
  private String email;

  /**
   * 手机号
   */
  @Description("手机号")
  private Collection<String> phones;

  /**
   * 禁用
   */
  @Description("禁用")
  private Boolean disable;

  /**
   * 组
   */
  @Description("组")
  private Collection<Group> groups;

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
  private String __typename = "User";

  /**
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  private Collection<UserPhonesRelation> userPhonesRelation;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private Collection<GroupUserRelation> groupUserRelation;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private Collection<RoleUserRelation> roleUserRelation;

  /**
   * Aggregate Field for 组
   */
  @Description("Aggregate Field for 组")
  private Group groupsAggregate;

  /**
   * Connection Field for 组
   */
  @Description("Connection Field for 组")
  private GroupConnection groupsConnection;

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
   * Aggregate Field for Relationship Object between 用户 and 手机号
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 手机号")
  private UserPhonesRelation userPhonesRelationAggregate;

  /**
   * Connection Field for Relationship Object between 用户 and 手机号
   */
  @Description("Connection Field for Relationship Object between 用户 and 手机号")
  private UserPhonesRelationConnection userPhonesRelationConnection;

  /**
   * Aggregate Field for Relationship Object between 用户 and 组
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 组")
  private GroupUserRelation groupUserRelationAggregate;

  /**
   * Connection Field for Relationship Object between 用户 and 组
   */
  @Description("Connection Field for Relationship Object between 用户 and 组")
  private GroupUserRelationConnection groupUserRelationConnection;

  /**
   * Aggregate Field for Relationship Object between 用户 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 角色")
  private RoleUserRelation roleUserRelationAggregate;

  /**
   * Connection Field for Relationship Object between 用户 and 角色
   */
  @Description("Connection Field for Relationship Object between 用户 and 角色")
  private RoleUserRelationConnection roleUserRelationConnection;

  /**
   * Count of 用户
   */
  @Description("Count of 用户")
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
   * Count of 姓名
   */
  @Description("Count of 姓名")
  private Integer nameCount;

  /**
   * Max of 姓名
   */
  @Description("Max of 姓名")
  private String nameMax;

  /**
   * Min of 姓名
   */
  @Description("Min of 姓名")
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
   * Count of 姓氏
   */
  @Description("Count of 姓氏")
  private Integer lastNameCount;

  /**
   * Max of 姓氏
   */
  @Description("Max of 姓氏")
  private String lastNameMax;

  /**
   * Min of 姓氏
   */
  @Description("Min of 姓氏")
  private String lastNameMin;

  /**
   * Count of 账号
   */
  @Description("Count of 账号")
  private Integer loginCount;

  /**
   * Max of 账号
   */
  @Description("Max of 账号")
  private String loginMax;

  /**
   * Min of 账号
   */
  @Description("Min of 账号")
  private String loginMin;

  /**
   * Count of 盐
   */
  @Description("Count of 盐")
  private Integer saltCount;

  /**
   * Max of 盐
   */
  @Description("Max of 盐")
  private String saltMax;

  /**
   * Min of 盐
   */
  @Description("Min of 盐")
  private String saltMin;

  /**
   * Count of 哈希
   */
  @Description("Count of 哈希")
  private Integer hashCount;

  /**
   * Max of 哈希
   */
  @Description("Max of 哈希")
  private String hashMax;

  /**
   * Min of 哈希
   */
  @Description("Min of 哈希")
  private String hashMin;

  /**
   * Count of 邮箱
   */
  @Description("Count of 邮箱")
  private Integer emailCount;

  /**
   * Max of 邮箱
   */
  @Description("Max of 邮箱")
  private String emailMax;

  /**
   * Min of 邮箱
   */
  @Description("Min of 邮箱")
  private String emailMin;

  private Boolean syncUserPolicy;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = (String)name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(String description) {
    this.description = (String)description;
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

  public String getSalt() {
    return this.salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
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

  public Collection<UserPhonesRelation> getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  public void setUserPhonesRelation(Collection<UserPhonesRelation> userPhonesRelation) {
    this.userPhonesRelation = userPhonesRelation;
  }

  public Collection<GroupUserRelation> getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(Collection<GroupUserRelation> groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public Collection<RoleUserRelation> getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(Collection<RoleUserRelation> roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
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

  public UserPhonesRelation getUserPhonesRelationAggregate() {
    return this.userPhonesRelationAggregate;
  }

  public void setUserPhonesRelationAggregate(UserPhonesRelation userPhonesRelationAggregate) {
    this.userPhonesRelationAggregate = userPhonesRelationAggregate;
  }

  public UserPhonesRelationConnection getUserPhonesRelationConnection() {
    return this.userPhonesRelationConnection;
  }

  public void setUserPhonesRelationConnection(
      UserPhonesRelationConnection userPhonesRelationConnection) {
    this.userPhonesRelationConnection = userPhonesRelationConnection;
  }

  public GroupUserRelation getGroupUserRelationAggregate() {
    return this.groupUserRelationAggregate;
  }

  public void setGroupUserRelationAggregate(GroupUserRelation groupUserRelationAggregate) {
    this.groupUserRelationAggregate = groupUserRelationAggregate;
  }

  public GroupUserRelationConnection getGroupUserRelationConnection() {
    return this.groupUserRelationConnection;
  }

  public void setGroupUserRelationConnection(
      GroupUserRelationConnection groupUserRelationConnection) {
    this.groupUserRelationConnection = groupUserRelationConnection;
  }

  public RoleUserRelation getRoleUserRelationAggregate() {
    return this.roleUserRelationAggregate;
  }

  public void setRoleUserRelationAggregate(RoleUserRelation roleUserRelationAggregate) {
    this.roleUserRelationAggregate = roleUserRelationAggregate;
  }

  public RoleUserRelationConnection getRoleUserRelationConnection() {
    return this.roleUserRelationConnection;
  }

  public void setRoleUserRelationConnection(RoleUserRelationConnection roleUserRelationConnection) {
    this.roleUserRelationConnection = roleUserRelationConnection;
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

  public Integer getSaltCount() {
    return this.saltCount;
  }

  public void setSaltCount(Integer saltCount) {
    this.saltCount = saltCount;
  }

  public String getSaltMax() {
    return this.saltMax;
  }

  public void setSaltMax(String saltMax) {
    this.saltMax = saltMax;
  }

  public String getSaltMin() {
    return this.saltMin;
  }

  public void setSaltMin(String saltMin) {
    this.saltMin = saltMin;
  }

  public Integer getHashCount() {
    return this.hashCount;
  }

  public void setHashCount(Integer hashCount) {
    this.hashCount = hashCount;
  }

  public String getHashMax() {
    return this.hashMax;
  }

  public void setHashMax(String hashMax) {
    this.hashMax = hashMax;
  }

  public String getHashMin() {
    return this.hashMin;
  }

  public void setHashMin(String hashMin) {
    this.hashMin = hashMin;
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

  public Boolean getSyncUserPolicy() {
    return this.syncUserPolicy;
  }

  public void setSyncUserPolicy(Boolean syncUserPolicy) {
    this.syncUserPolicy = syncUserPolicy;
  }

  public UserInput toInput() {
    UserInput input = new UserInput();
    input.setId(this.getId());
    input.setName(this.getName());
    input.setDescription(this.getDescription());
    input.setLastName(this.getLastName());
    input.setLogin(this.getLogin());
    input.setSalt(this.getSalt());
    input.setHash(this.getHash());
    input.setEmail(this.getEmail());
    input.setPhones(this.getPhones());
    input.setDisable(this.getDisable());
    if(getGroups() != null) {
      input.setGroups(this.getGroups().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
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
    if(getUserPhonesRelation() != null) {
      input.setUserPhonesRelation(this.getUserPhonesRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getGroupUserRelation() != null) {
      input.setGroupUserRelation(this.getGroupUserRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getRoleUserRelation() != null) {
      input.setRoleUserRelation(this.getRoleUserRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    return input;
  }
}
