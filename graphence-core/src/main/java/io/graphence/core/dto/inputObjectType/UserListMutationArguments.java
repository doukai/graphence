package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.structure.dto.inputObjectType.NamedStructInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for 用户 List
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for 用户 List")
public class UserListMutationArguments implements NamedStructInput, MetaInput, UserInputBase {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 姓名
   */
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
  private Collection<GroupInput> groups;

  /**
   * 角色
   */
  @Description("角色")
  private Collection<RoleInput> roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmInput realm;

  /**
   * Is Deprecated
   */
  @DefaultValue("false")
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
  @DefaultValue("User")
  @Description("Type Name")
  private String __typename = "User";

  /**
   * Relationship Object between 用户 and 手机号
   */
  @Description("Relationship Object between 用户 and 手机号")
  private Collection<UserPhonesRelationInput> userPhonesRelation;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private Collection<GroupUserRelationInput> groupUserRelation;

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private Collection<RoleUserRelationInput> roleUserRelation;

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<UserInput> list;

  /**
   * Where
   */
  @Description("Where")
  private UserExpression where;

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

  @Override
  public String getLastName() {
    return this.lastName;
  }

  @Override
  public void setLastName(String lastName) {
    this.lastName = (String)lastName;
  }

  @Override
  public String getLogin() {
    return this.login;
  }

  @Override
  public void setLogin(String login) {
    this.login = (String)login;
  }

  @Override
  public String getSalt() {
    return this.salt;
  }

  @Override
  public void setSalt(String salt) {
    this.salt = (String)salt;
  }

  @Override
  public String getHash() {
    return this.hash;
  }

  @Override
  public void setHash(String hash) {
    this.hash = (String)hash;
  }

  @Override
  public String getEmail() {
    return this.email;
  }

  @Override
  public void setEmail(String email) {
    this.email = (String)email;
  }

  @Override
  public Collection<String> getPhones() {
    return this.phones;
  }

  @Override
  public void setPhones(Collection<String> phones) {
    this.phones = (Collection<String>)phones;
  }

  @Override
  public Boolean getDisable() {
    return this.disable;
  }

  @Override
  public void setDisable(Boolean disable) {
    this.disable = (Boolean)disable;
  }

  @Override
  public Collection<GroupInput> getGroups() {
    return this.groups;
  }

  @Override
  public void setGroups(Collection<GroupInput> groups) {
    this.groups = (Collection<GroupInput>)groups;
  }

  @Override
  public Collection<RoleInput> getRoles() {
    return this.roles;
  }

  @Override
  public void setRoles(Collection<RoleInput> roles) {
    this.roles = (Collection<RoleInput>)roles;
  }

  @Override
  public RealmInput getRealm() {
    return this.realm;
  }

  @Override
  public void setRealm(RealmInput realm) {
    this.realm = (RealmInput)realm;
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

  @Override
  public String get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(String __typename) {
    this.__typename = (String)__typename;
  }

  @Override
  public Collection<UserPhonesRelationInput> getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  @Override
  public void setUserPhonesRelation(Collection<UserPhonesRelationInput> userPhonesRelation) {
    this.userPhonesRelation = (Collection<UserPhonesRelationInput>)userPhonesRelation;
  }

  @Override
  public Collection<GroupUserRelationInput> getGroupUserRelation() {
    return this.groupUserRelation;
  }

  @Override
  public void setGroupUserRelation(Collection<GroupUserRelationInput> groupUserRelation) {
    this.groupUserRelation = (Collection<GroupUserRelationInput>)groupUserRelation;
  }

  @Override
  public Collection<RoleUserRelationInput> getRoleUserRelation() {
    return this.roleUserRelation;
  }

  @Override
  public void setRoleUserRelation(Collection<RoleUserRelationInput> roleUserRelation) {
    this.roleUserRelation = (Collection<RoleUserRelationInput>)roleUserRelation;
  }

  public Collection<UserInput> getList() {
    return this.list;
  }

  public void setList(Collection<UserInput> list) {
    this.list = list;
  }

  @Override
  public UserExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(UserExpression where) {
    this.where = (UserExpression)where;
  }
}
