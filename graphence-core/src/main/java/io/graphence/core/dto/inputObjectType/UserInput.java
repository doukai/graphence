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
 * 用户 变更内容
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 变更内容")
public class UserInput implements NamedStructInput, MetaInput, UserInputBase {
  /**
   * id
   */
  @Description("id")
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
   * 已移除
   */
  @DefaultValue("false")
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
  @DefaultValue("User")
  @Description("所属类型")
  private String __typename = "User";

  /**
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  private Collection<UserPhonesRelationInput> userPhonesRelation;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private Collection<GroupUserRelationInput> groupUserRelation;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private Collection<RoleUserRelationInput> roleUserRelation;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
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

  @Override
  public UserExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(UserExpression where) {
    this.where = (UserExpression)where;
  }
}
