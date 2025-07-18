package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.structure.dto.inputObjectType.NamedStructInput;
import io.graphoenix.structure.dto.inputObjectType.TreeStructInput;
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
 * 组 变更内容
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("组 变更内容")
public class GroupInput implements TreeStructInput, NamedStructInput, MetaInput, GroupInputBase {
  /**
   * id
   */
  @Description("id")
  private String id;

  /**
   * 名称
   */
  @Description("名称")
  private String name;

  /**
   * 描述
   */
  @Description("描述")
  private String description;

  /**
   * 路径
   */
  @Description("路径")
  private String path;

  /**
   * 层级
   */
  @Description("层级")
  private Integer deep;

  /**
   * 上级ID
   */
  @Description("上级ID")
  private String parentId;

  /**
   * 上级
   */
  @Description("上级")
  private GroupInput parent;

  /**
   * 下级
   */
  @Description("下级")
  private Collection<GroupInput> subGroups;

  /**
   * 用户
   */
  @Description("用户")
  private Collection<UserInput> users;

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
  @DefaultValue("Group")
  @Description("所属类型")
  private String __typename = "Group";

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private Collection<GroupUserRelationInput> groupUserRelation;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  private Collection<GroupRoleRelationInput> groupRoleRelation;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  private GroupExpression where;

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
  public String getPath() {
    return this.path;
  }

  @Override
  public void setPath(String path) {
    this.path = (String)path;
  }

  @Override
  public Integer getDeep() {
    return this.deep;
  }

  @Override
  public void setDeep(Integer deep) {
    this.deep = (Integer)deep;
  }

  @Override
  public String getParentId() {
    return this.parentId;
  }

  @Override
  public void setParentId(String parentId) {
    this.parentId = (String)parentId;
  }

  @Override
  public GroupInput getParent() {
    return this.parent;
  }

  @Override
  public void setParent(GroupInput parent) {
    this.parent = (GroupInput)parent;
  }

  @Override
  public Collection<GroupInput> getSubGroups() {
    return this.subGroups;
  }

  @Override
  public void setSubGroups(Collection<GroupInput> subGroups) {
    this.subGroups = (Collection<GroupInput>)subGroups;
  }

  @Override
  public Collection<UserInput> getUsers() {
    return this.users;
  }

  @Override
  public void setUsers(Collection<UserInput> users) {
    this.users = (Collection<UserInput>)users;
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
  public Collection<GroupUserRelationInput> getGroupUserRelation() {
    return this.groupUserRelation;
  }

  @Override
  public void setGroupUserRelation(Collection<GroupUserRelationInput> groupUserRelation) {
    this.groupUserRelation = (Collection<GroupUserRelationInput>)groupUserRelation;
  }

  @Override
  public Collection<GroupRoleRelationInput> getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  @Override
  public void setGroupRoleRelation(Collection<GroupRoleRelationInput> groupRoleRelation) {
    this.groupRoleRelation = (Collection<GroupRoleRelationInput>)groupRoleRelation;
  }

  @Override
  public GroupExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(GroupExpression where) {
    this.where = (GroupExpression)where;
  }
}
