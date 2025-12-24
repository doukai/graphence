package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.GroupRoleRelationInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

/**
 * Relationship Object between 角色 and 组
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Relationship Object between 角色 and 组")
public class GroupRoleRelation implements Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  private String roleRef;

  /**
   * 角色
   */
  @Description("角色")
  private Role role;

  /**
   * 组 Reference
   */
  @Description("组 Reference")
  private String groupRef;

  /**
   * 组
   */
  @Description("组")
  private Group group;

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
  private String __typename = "GroupRoleRelation";

  /**
   * Count of Relationship Object between 角色 and 组
   */
  @Description("Count of Relationship Object between 角色 and 组")
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
   * Count of 角色 Reference
   */
  @Description("Count of 角色 Reference")
  private Integer roleRefCount;

  /**
   * Max of 角色 Reference
   */
  @Description("Max of 角色 Reference")
  private String roleRefMax;

  /**
   * Min of 角色 Reference
   */
  @Description("Min of 角色 Reference")
  private String roleRefMin;

  /**
   * Count of 组 Reference
   */
  @Description("Count of 组 Reference")
  private Integer groupRefCount;

  /**
   * Max of 组 Reference
   */
  @Description("Max of 组 Reference")
  private String groupRefMax;

  /**
   * Min of 组 Reference
   */
  @Description("Min of 组 Reference")
  private String groupRefMin;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  public String getRoleRef() {
    return this.roleRef;
  }

  public void setRoleRef(String roleRef) {
    this.roleRef = roleRef;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getGroupRef() {
    return this.groupRef;
  }

  public void setGroupRef(String groupRef) {
    this.groupRef = groupRef;
  }

  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
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

  public Integer getRoleRefCount() {
    return this.roleRefCount;
  }

  public void setRoleRefCount(Integer roleRefCount) {
    this.roleRefCount = roleRefCount;
  }

  public String getRoleRefMax() {
    return this.roleRefMax;
  }

  public void setRoleRefMax(String roleRefMax) {
    this.roleRefMax = roleRefMax;
  }

  public String getRoleRefMin() {
    return this.roleRefMin;
  }

  public void setRoleRefMin(String roleRefMin) {
    this.roleRefMin = roleRefMin;
  }

  public Integer getGroupRefCount() {
    return this.groupRefCount;
  }

  public void setGroupRefCount(Integer groupRefCount) {
    this.groupRefCount = groupRefCount;
  }

  public String getGroupRefMax() {
    return this.groupRefMax;
  }

  public void setGroupRefMax(String groupRefMax) {
    this.groupRefMax = groupRefMax;
  }

  public String getGroupRefMin() {
    return this.groupRefMin;
  }

  public void setGroupRefMin(String groupRefMin) {
    this.groupRefMin = groupRefMin;
  }

  public GroupRoleRelationInput toInput() {
    GroupRoleRelationInput input = new GroupRoleRelationInput();
    input.setId(this.getId());
    input.setRoleRef(this.getRoleRef());
    if(getRole() != null) {
      input.setRole(this.getRole().toInput());
    }
    input.setGroupRef(this.getGroupRef());
    if(getGroup() != null) {
      input.setGroup(this.getGroup().toInput());
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
    return input;
  }
}
