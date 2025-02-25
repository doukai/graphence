package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.GroupInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.structure.dto.interfaceType.NamedStruct;
import io.graphoenix.structure.dto.interfaceType.TreeStruct;
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
 * 组
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("组")
public class Group implements TreeStruct, NamedStruct, Meta {
  /**
   * ID
   */
  @Id
  @Description("ID")
  private String id;

  /**
   * 名称
   */
  @NonNull
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
  private Group parent;

  /**
   * 下级
   */
  @Description("下级")
  private Collection<Group> subGroups;

  /**
   * 用户
   */
  @Description("用户")
  private Collection<User> users;

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
  private String __typename = "Group";

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private Collection<GroupUserRelation> groupUserRelation;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  private Collection<GroupRoleRelation> groupRoleRelation;

  /**
   * 下级 统计字段
   */
  @Description("下级 统计字段")
  private Group subGroupsAggregate;

  /**
   * 下级 连接
   */
  @Description("下级 连接")
  private GroupConnection subGroupsConnection;

  /**
   * 用户 统计字段
   */
  @Description("用户 统计字段")
  private User usersAggregate;

  /**
   * 用户 连接
   */
  @Description("用户 连接")
  private UserConnection usersConnection;

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
   * 角色 组 关系 统计字段
   */
  @Description("角色 组 关系 统计字段")
  private GroupRoleRelation groupRoleRelationAggregate;

  /**
   * 角色 组 关系 连接
   */
  @Description("角色 组 关系 连接")
  private GroupRoleRelationConnection groupRoleRelationConnection;

  /**
   * 组 数量
   */
  @Description("组 数量")
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
   * 名称 数量
   */
  @Description("名称 数量")
  private Integer nameCount;

  /**
   * 名称 最大值
   */
  @Description("名称 最大值")
  private String nameMax;

  /**
   * 名称 最小值
   */
  @Description("名称 最小值")
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
   * 路径 数量
   */
  @Description("路径 数量")
  private Integer pathCount;

  /**
   * 路径 最大值
   */
  @Description("路径 最大值")
  private String pathMax;

  /**
   * 路径 最小值
   */
  @Description("路径 最小值")
  private String pathMin;

  /**
   * 上级ID 数量
   */
  @Description("上级ID 数量")
  private Integer parentIdCount;

  /**
   * 上级ID 最大值
   */
  @Description("上级ID 最大值")
  private String parentIdMax;

  /**
   * 上级ID 最小值
   */
  @Description("上级ID 最小值")
  private String parentIdMin;

  /**
   * 层级 数量
   */
  @Description("层级 数量")
  private Integer deepCount;

  /**
   * 层级 合计
   */
  @Description("层级 合计")
  private Integer deepSum;

  /**
   * 层级 平均值
   */
  @Description("层级 平均值")
  private Integer deepAvg;

  /**
   * 层级 最大值
   */
  @Description("层级 最大值")
  private Integer deepMax;

  /**
   * 层级 最小值
   */
  @Description("层级 最小值")
  private Integer deepMin;

  private Boolean syncGroupPolicy;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
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

  public Group getParent() {
    return this.parent;
  }

  public void setParent(Group parent) {
    this.parent = parent;
  }

  public Collection<Group> getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(Collection<Group> subGroups) {
    this.subGroups = subGroups;
  }

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
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

  public Collection<GroupUserRelation> getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(Collection<GroupUserRelation> groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public Collection<GroupRoleRelation> getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(Collection<GroupRoleRelation> groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public Group getSubGroupsAggregate() {
    return this.subGroupsAggregate;
  }

  public void setSubGroupsAggregate(Group subGroupsAggregate) {
    this.subGroupsAggregate = subGroupsAggregate;
  }

  public GroupConnection getSubGroupsConnection() {
    return this.subGroupsConnection;
  }

  public void setSubGroupsConnection(GroupConnection subGroupsConnection) {
    this.subGroupsConnection = subGroupsConnection;
  }

  public User getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(User usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public UserConnection getUsersConnection() {
    return this.usersConnection;
  }

  public void setUsersConnection(UserConnection usersConnection) {
    this.usersConnection = usersConnection;
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

  public GroupRoleRelation getGroupRoleRelationAggregate() {
    return this.groupRoleRelationAggregate;
  }

  public void setGroupRoleRelationAggregate(GroupRoleRelation groupRoleRelationAggregate) {
    this.groupRoleRelationAggregate = groupRoleRelationAggregate;
  }

  public GroupRoleRelationConnection getGroupRoleRelationConnection() {
    return this.groupRoleRelationConnection;
  }

  public void setGroupRoleRelationConnection(
      GroupRoleRelationConnection groupRoleRelationConnection) {
    this.groupRoleRelationConnection = groupRoleRelationConnection;
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

  public Integer getPathCount() {
    return this.pathCount;
  }

  public void setPathCount(Integer pathCount) {
    this.pathCount = pathCount;
  }

  public String getPathMax() {
    return this.pathMax;
  }

  public void setPathMax(String pathMax) {
    this.pathMax = pathMax;
  }

  public String getPathMin() {
    return this.pathMin;
  }

  public void setPathMin(String pathMin) {
    this.pathMin = pathMin;
  }

  public Integer getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Integer parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public String getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(String parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public String getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(String parentIdMin) {
    this.parentIdMin = parentIdMin;
  }

  public Integer getDeepCount() {
    return this.deepCount;
  }

  public void setDeepCount(Integer deepCount) {
    this.deepCount = deepCount;
  }

  public Integer getDeepSum() {
    return this.deepSum;
  }

  public void setDeepSum(Integer deepSum) {
    this.deepSum = deepSum;
  }

  public Integer getDeepAvg() {
    return this.deepAvg;
  }

  public void setDeepAvg(Integer deepAvg) {
    this.deepAvg = deepAvg;
  }

  public Integer getDeepMax() {
    return this.deepMax;
  }

  public void setDeepMax(Integer deepMax) {
    this.deepMax = deepMax;
  }

  public Integer getDeepMin() {
    return this.deepMin;
  }

  public void setDeepMin(Integer deepMin) {
    this.deepMin = deepMin;
  }

  public Boolean getSyncGroupPolicy() {
    return this.syncGroupPolicy;
  }

  public void setSyncGroupPolicy(Boolean syncGroupPolicy) {
    this.syncGroupPolicy = syncGroupPolicy;
  }

  public GroupInput toInput() {
    GroupInput input = new GroupInput();
    input.setId(this.getId());
    input.setName(this.getName());
    input.setDescription(this.getDescription());
    input.setPath(this.getPath());
    input.setDeep(this.getDeep());
    input.setParentId(this.getParentId());
    if(getParent() != null) {
      input.setParent(this.getParent().toInput());
    }
    if(getSubGroups() != null) {
      input.setSubGroups(this.getSubGroups().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getUsers() != null) {
      input.setUsers(this.getUsers().stream().map(item -> item.toInput()).collect(Collectors.toList()));
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
    if(getGroupUserRelation() != null) {
      input.setGroupUserRelation(this.getGroupUserRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getGroupRoleRelation() != null) {
      input.setGroupRoleRelation(this.getGroupRoleRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    return input;
  }
}
