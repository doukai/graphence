package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class GroupListMutationTypeArguments implements MetaInput {
  private String id;

  private String name;

  private String path;

  private Integer deep;

  private GroupMutationTypeArguments parent;

  private Collection<GroupMutationTypeArguments> subGroups;

  private Collection<GroupMutationTypeArguments> users;

  private Collection<GroupMutationTypeArguments> roles;

  private GroupMutationTypeArguments realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"Group\"")
  private String __typename;

  private Integer parentId;

  private Collection<GroupMutationTypeArguments> userGroup;

  private Collection<GroupMutationTypeArguments> groupRole;

  private Collection<GroupInput> list;

  private GroupExpression where;

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

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Integer getDeep() {
    return this.deep;
  }

  public void setDeep(Integer deep) {
    this.deep = deep;
  }

  public GroupMutationTypeArguments getParent() {
    return this.parent;
  }

  public void setParent(GroupMutationTypeArguments parent) {
    this.parent = parent;
  }

  public Collection<GroupMutationTypeArguments> getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(Collection<GroupMutationTypeArguments> subGroups) {
    this.subGroups = subGroups;
  }

  public Collection<GroupMutationTypeArguments> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<GroupMutationTypeArguments> users) {
    this.users = users;
  }

  public Collection<GroupMutationTypeArguments> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<GroupMutationTypeArguments> roles) {
    this.roles = roles;
  }

  public GroupMutationTypeArguments getRealm() {
    return this.realm;
  }

  public void setRealm(GroupMutationTypeArguments realm) {
    this.realm = realm;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Integer realmId) {
    this.realmId = realmId;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getParentId() {
    return this.parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Collection<GroupMutationTypeArguments> getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(Collection<GroupMutationTypeArguments> userGroup) {
    this.userGroup = userGroup;
  }

  public Collection<GroupMutationTypeArguments> getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(Collection<GroupMutationTypeArguments> groupRole) {
    this.groupRole = groupRole;
  }

  public Collection<GroupInput> getList() {
    return this.list;
  }

  public void setList(Collection<GroupInput> list) {
    this.list = list;
  }

  public GroupExpression getWhere() {
    return this.where;
  }

  public void setWhere(GroupExpression where) {
    this.where = where;
  }
}
