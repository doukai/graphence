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
 * 角色 组 关系
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 组 关系")
public class GroupRoleRelation implements Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  private String roleRef;

  /**
   * 角色
   */
  @Description("角色")
  private Role role;

  /**
   * 组 引用
   */
  @Description("组 引用")
  private String groupRef;

  /**
   * 组
   */
  @Description("组")
  private Group group;

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
  private String __typename = "GroupRoleRelation";

  /**
   * 角色 组 关系 数量
   */
  @Description("角色 组 关系 数量")
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
   * 角色 引用 数量
   */
  @Description("角色 引用 数量")
  private Integer roleRefCount;

  /**
   * 角色 引用 最大值
   */
  @Description("角色 引用 最大值")
  private String roleRefMax;

  /**
   * 角色 引用 最小值
   */
  @Description("角色 引用 最小值")
  private String roleRefMin;

  /**
   * 组 引用 数量
   */
  @Description("组 引用 数量")
  private Integer groupRefCount;

  /**
   * 组 引用 最大值
   */
  @Description("组 引用 最大值")
  private String groupRefMax;

  /**
   * 组 引用 最小值
   */
  @Description("组 引用 最小值")
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
