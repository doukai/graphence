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
  private String __typename = "Group";

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private Collection<GroupUserRelation> groupUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private Collection<GroupRoleRelation> groupRoleRelation;

  /**
   * Aggregate Field for 下级
   */
  @Description("Aggregate Field for 下级")
  private Group subGroupsAggregate;

  /**
   * Connection Field for 下级
   */
  @Description("Connection Field for 下级")
  private GroupConnection subGroupsConnection;

  /**
   * Aggregate Field for 用户
   */
  @Description("Aggregate Field for 用户")
  private User usersAggregate;

  /**
   * Connection Field for 用户
   */
  @Description("Connection Field for 用户")
  private UserConnection usersConnection;

  /**
   * Aggregate Field for 角色
   */
  @Description("Aggregate Field for 角色")
  private Role rolesAggregate;

  /**
   * Connection Field for 角色
   */
  @Description("Connection Field for 角色")
  private RoleConnection rolesConnection;

  /**
   * Aggregate Field for Relationship Object between 用户 and 组
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 组")
  private GroupUserRelation groupUserRelationAggregate;

  /**
   * Connection Field for Relationship Object between 用户 and 组
   */
  @Description("Connection Field for Relationship Object between 用户 and 组")
  private GroupUserRelationConnection groupUserRelationConnection;

  /**
   * Aggregate Field for Relationship Object between 角色 and 组
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 组")
  private GroupRoleRelation groupRoleRelationAggregate;

  /**
   * Connection Field for Relationship Object between 角色 and 组
   */
  @Description("Connection Field for Relationship Object between 角色 and 组")
  private GroupRoleRelationConnection groupRoleRelationConnection;

  /**
   * Count of 组
   */
  @Description("Count of 组")
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
   * Count of 名称
   */
  @Description("Count of 名称")
  private Integer nameCount;

  /**
   * Max of 名称
   */
  @Description("Max of 名称")
  private String nameMax;

  /**
   * Min of 名称
   */
  @Description("Min of 名称")
  private String nameMin;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Integer descriptionCount;

  /**
   * Max of 描述
   */
  @Description("Max of 描述")
  private String descriptionMax;

  /**
   * Min of 描述
   */
  @Description("Min of 描述")
  private String descriptionMin;

  /**
   * Count of 路径
   */
  @Description("Count of 路径")
  private Integer pathCount;

  /**
   * Max of 路径
   */
  @Description("Max of 路径")
  private String pathMax;

  /**
   * Min of 路径
   */
  @Description("Min of 路径")
  private String pathMin;

  /**
   * Count of 上级ID
   */
  @Description("Count of 上级ID")
  private Integer parentIdCount;

  /**
   * Max of 上级ID
   */
  @Description("Max of 上级ID")
  private String parentIdMax;

  /**
   * Min of 上级ID
   */
  @Description("Min of 上级ID")
  private String parentIdMin;

  /**
   * Count of 层级
   */
  @Description("Count of 层级")
  private Integer deepCount;

  /**
   * Sum of 层级
   */
  @Description("Sum of 层级")
  private Integer deepSum;

  /**
   * Avg of 层级
   */
  @Description("Avg of 层级")
  private Integer deepAvg;

  /**
   * Max of 层级
   */
  @Description("Max of 层级")
  private Integer deepMax;

  /**
   * Min of 层级
   */
  @Description("Min of 层级")
  private Integer deepMin;

  private Boolean syncGroupPolicy;

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
