package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
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
 * Mutation Input for Relationship Object between 用户 and 组
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Mutation Input for Relationship Object between 用户 and 组")
public class GroupUserRelationInput implements MetaInput {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private String userRef;

  /**
   * 用户
   */
  @Description("用户")
  private UserInput user;

  /**
   * 组 Reference
   */
  @Description("组 Reference")
  private String groupRef;

  /**
   * 组
   */
  @Description("组")
  private GroupInput group;

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
  @DefaultValue("GroupUserRelation")
  @Description("Type Name")
  private String __typename = "GroupUserRelation";

  /**
   * Input
   */
  @Description("Input")
  private GroupUserRelationInput input;

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<GroupUserRelationInput> list;

  /**
   * Where
   */
  @Description("Where")
  private GroupUserRelationExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  public String getUserRef() {
    return this.userRef;
  }

  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }

  public UserInput getUser() {
    return this.user;
  }

  public void setUser(UserInput user) {
    this.user = user;
  }

  public String getGroupRef() {
    return this.groupRef;
  }

  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  public GroupInput getGroup() {
    return this.group;
  }

  public void setGroup(GroupInput group) {
    this.group = group;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
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

  public GroupUserRelationInput getInput() {
    return this.input;
  }

  public void setInput(GroupUserRelationInput input) {
    this.input = input;
  }

  public Collection<GroupUserRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<GroupUserRelationInput> list) {
    this.list = list;
  }

  public GroupUserRelationExpression getWhere() {
    return this.where;
  }

  public void setWhere(GroupUserRelationExpression where) {
    this.where = where;
  }
}
