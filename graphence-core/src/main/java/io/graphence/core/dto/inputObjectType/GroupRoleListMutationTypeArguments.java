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
public class GroupRoleListMutationTypeArguments implements MetaInput {
  private String id;

  private Integer roleId;

  private GroupRoleMutationTypeArguments roleIdType;

  private Integer groupId;

  private GroupRoleMutationTypeArguments groupIdType;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"GroupRole\"")
  private String __typename;

  private Collection<GroupRoleInput> list;

  private GroupRoleExpression where;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getRoleId() {
    return this.roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public GroupRoleMutationTypeArguments getRoleIdType() {
    return this.roleIdType;
  }

  public void setRoleIdType(GroupRoleMutationTypeArguments roleIdType) {
    this.roleIdType = roleIdType;
  }

  public Integer getGroupId() {
    return this.groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public GroupRoleMutationTypeArguments getGroupIdType() {
    return this.groupIdType;
  }

  public void setGroupIdType(GroupRoleMutationTypeArguments groupIdType) {
    this.groupIdType = groupIdType;
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

  public Collection<GroupRoleInput> getList() {
    return this.list;
  }

  public void setList(Collection<GroupRoleInput> list) {
    this.list = list;
  }

  public GroupRoleExpression getWhere() {
    return this.where;
  }

  public void setWhere(GroupRoleExpression where) {
    this.where = where;
  }
}
