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
   * 已移除
   */
  @Description("已移除")
  private Boolean isDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  private Integer version;

  /**
   * 域
   */
  @Description("域")
  private Integer realmId;

  /**
   * 创建者
   */
  @Description("创建者")
  private String createUserId;

  /**
   * 创建时间
   */
  @Description("创建时间")
  private LocalDateTime createTime;

  /**
   * 更新者
   */
  @Description("更新者")
  private String updateUserId;

  /**
   * 更新时间
   */
  @Description("更新时间")
  private LocalDateTime updateTime;

  /**
   * 创建组
   */
  @Description("创建组")
  private String createGroupId;

  /**
   * 所属类型
   */
  @Description("所属类型")
  private String __typename = "User";

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  private Collection<UserPhonesRelation> userPhonesRelation;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private Collection<GroupUserRelation> groupUserRelation;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private Collection<RoleUserRelation> roleUserRelation;

  /**
   * 组 统计字段
   */
  @Description("组 统计字段")
  private Group groupsAggregate;

  /**
   * 组 连接
   */
  @Description("组 连接")
  private GroupConnection groupsConnection;

  /**
   * 角色 统计字段
   */
  @Description("角色 统计字段")
  private Role rolesAggregate;

  /**
   * 角色 连接
   */
  @Description("角色 连接")
  private RoleConnection rolesConnection;

  /**
   * 用户 手机号 关系 统计字段
   */
  @Description("用户 手机号 关系 统计字段")
  private UserPhonesRelation userPhonesRelationAggregate;

  /**
   * 用户 手机号 关系 连接
   */
  @Description("用户 手机号 关系 连接")
  private UserPhonesRelationConnection userPhonesRelationConnection;

  /**
   * 用户 组 关系 统计字段
   */
  @Description("用户 组 关系 统计字段")
  private GroupUserRelation groupUserRelationAggregate;

  /**
   * 用户 组 关系 连接
   */
  @Description("用户 组 关系 连接")
  private GroupUserRelationConnection groupUserRelationConnection;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  private RoleUserRelation roleUserRelationAggregate;

  /**
   * 用户 角色 关系 连接
   */
  @Description("用户 角色 关系 连接")
  private RoleUserRelationConnection roleUserRelationConnection;

  /**
   * 用户 数量
   */
  @Description("用户 数量")
  private Integer idCount;

  /**
   * ID 最大值
   */
  @Description("ID 最大值")
  private Integer idMax;

  /**
   * ID 最小值
   */
  @Description("ID 最小值")
  private Integer idMin;

  /**
   * 姓名 数量
   */
  @Description("姓名 数量")
  private Integer nameCount;

  /**
   * 姓名 最大值
   */
  @Description("姓名 最大值")
  private String nameMax;

  /**
   * 姓名 最小值
   */
  @Description("姓名 最小值")
  private String nameMin;

  /**
   * 描述 数量
   */
  @Description("描述 数量")
  private Integer descriptionCount;

  /**
   * 描述 最大值
   */
  @Description("描述 最大值")
  private String descriptionMax;

  /**
   * 描述 最小值
   */
  @Description("描述 最小值")
  private String descriptionMin;

  /**
   * 姓氏 数量
   */
  @Description("姓氏 数量")
  private Integer lastNameCount;

  /**
   * 姓氏 最大值
   */
  @Description("姓氏 最大值")
  private String lastNameMax;

  /**
   * 姓氏 最小值
   */
  @Description("姓氏 最小值")
  private String lastNameMin;

  /**
   * 账号 数量
   */
  @Description("账号 数量")
  private Integer loginCount;

  /**
   * 账号 最大值
   */
  @Description("账号 最大值")
  private String loginMax;

  /**
   * 账号 最小值
   */
  @Description("账号 最小值")
  private String loginMin;

  /**
   * 盐 数量
   */
  @Description("盐 数量")
  private Integer saltCount;

  /**
   * 盐 最大值
   */
  @Description("盐 最大值")
  private String saltMax;

  /**
   * 盐 最小值
   */
  @Description("盐 最小值")
  private String saltMin;

  /**
   * 哈希 数量
   */
  @Description("哈希 数量")
  private Integer hashCount;

  /**
   * 哈希 最大值
   */
  @Description("哈希 最大值")
  private String hashMax;

  /**
   * 哈希 最小值
   */
  @Description("哈希 最小值")
  private String hashMin;

  /**
   * 邮箱 数量
   */
  @Description("邮箱 数量")
  private Integer emailCount;

  /**
   * 邮箱 最大值
   */
  @Description("邮箱 最大值")
  private String emailMax;

  /**
   * 邮箱 最小值
   */
  @Description("邮箱 最小值")
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
