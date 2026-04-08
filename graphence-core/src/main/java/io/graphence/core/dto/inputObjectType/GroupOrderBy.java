package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 组
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Order Input for 组")
public class GroupOrderBy {
  /**
   * ID
   */
  @Description("ID")
  private Sort id;

  /**
   * 名称
   */
  @Description("名称")
  private Sort name;

  /**
   * 描述
   */
  @Description("描述")
  private Sort description;

  /**
   * 路径
   */
  @Description("路径")
  private Sort path;

  /**
   * 层级
   */
  @Description("层级")
  private Sort deep;

  /**
   * 上级ID
   */
  @Description("上级ID")
  private Sort parentId;

  /**
   * 上级
   */
  @Description("上级")
  private GroupOrderBy parent;

  /**
   * 下级
   */
  @Description("下级")
  private GroupOrderBy subGroups;

  /**
   * 用户
   */
  @Description("用户")
  private UserOrderBy users;

  /**
   * 角色
   */
  @Description("角色")
  private RoleOrderBy roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmOrderBy realm;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  private Sort isDeprecated;

  /**
   * Version
   */
  @Description("Version")
  private Sort version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Sort realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private Sort createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private Sort createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private Sort updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private Sort updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private Sort createGroupId;

  /**
   * Type Name
   */
  @Description("Type Name")
  private Sort __typename;

  /**
   * Relationship Object between 用户 and 组
   */
  @Description("Relationship Object between 用户 and 组")
  private GroupUserRelationOrderBy groupUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private GroupRoleRelationOrderBy groupRoleRelation;

  /**
   * Aggregate Field for 下级
   */
  @Description("Aggregate Field for 下级")
  private GroupOrderBy subGroupsAggregate;

  /**
   * Aggregate Field for 用户
   */
  @Description("Aggregate Field for 用户")
  private UserOrderBy usersAggregate;

  /**
   * Aggregate Field for 角色
   */
  @Description("Aggregate Field for 角色")
  private RoleOrderBy rolesAggregate;

  /**
   * Aggregate Field for Relationship Object between 用户 and 组
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 组")
  private GroupUserRelationOrderBy groupUserRelationAggregate;

  /**
   * Aggregate Field for Relationship Object between 角色 and 组
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 组")
  private GroupRoleRelationOrderBy groupRoleRelationAggregate;

  /**
   * Count of 组
   */
  @Description("Count of 组")
  private Sort idCount;

  /**
   * Count of 名称
   */
  @Description("Count of 名称")
  private Sort nameCount;

  /**
   * Count of 描述
   */
  @Description("Count of 描述")
  private Sort descriptionCount;

  /**
   * Count of 路径
   */
  @Description("Count of 路径")
  private Sort pathCount;

  /**
   * Count of 层级
   */
  @Description("Count of 层级")
  private Sort deepCount;

  /**
   * Count of 上级ID
   */
  @Description("Count of 上级ID")
  private Sort parentIdCount;

  /**
   * Max of 层级
   */
  @Description("Max of 层级")
  private Sort deepMax;

  /**
   * Min of 层级
   */
  @Description("Min of 层级")
  private Sort deepMin;

  /**
   * Sum of 层级
   */
  @Description("Sum of 层级")
  private Sort deepSum;

  /**
   * Avg of 层级
   */
  @Description("Avg of 层级")
  private Sort deepAvg;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  private Sort createTimeYear;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  private Sort createTimeMonth;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  private Sort createTimeDay;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  private Sort createTimeWeek;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  private Sort createTimeQuarter;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  private Sort updateTimeYear;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  private Sort updateTimeMonth;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  private Sort updateTimeDay;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  private Sort updateTimeWeek;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  private Sort updateTimeQuarter;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<GroupOrderBy> obs;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getDescription() {
    return this.description;
  }

  public void setDescription(Sort description) {
    this.description = description;
  }

  public Sort getPath() {
    return this.path;
  }

  public void setPath(Sort path) {
    this.path = path;
  }

  public Sort getDeep() {
    return this.deep;
  }

  public void setDeep(Sort deep) {
    this.deep = deep;
  }

  public Sort getParentId() {
    return this.parentId;
  }

  public void setParentId(Sort parentId) {
    this.parentId = parentId;
  }

  public GroupOrderBy getParent() {
    return this.parent;
  }

  public void setParent(GroupOrderBy parent) {
    this.parent = parent;
  }

  public GroupOrderBy getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(GroupOrderBy subGroups) {
    this.subGroups = subGroups;
  }

  public UserOrderBy getUsers() {
    return this.users;
  }

  public void setUsers(UserOrderBy users) {
    this.users = users;
  }

  public RoleOrderBy getRoles() {
    return this.roles;
  }

  public void setRoles(RoleOrderBy roles) {
    this.roles = roles;
  }

  public RealmOrderBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmOrderBy realm) {
    this.realm = realm;
  }

  public Sort getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Sort isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Sort getVersion() {
    return this.version;
  }

  public void setVersion(Sort version) {
    this.version = version;
  }

  public Sort getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Sort realmId) {
    this.realmId = realmId;
  }

  public Sort getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Sort createUserId) {
    this.createUserId = createUserId;
  }

  public Sort getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Sort createTime) {
    this.createTime = createTime;
  }

  public Sort getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(Sort updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Sort getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Sort updateTime) {
    this.updateTime = updateTime;
  }

  public Sort getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(Sort createGroupId) {
    this.createGroupId = createGroupId;
  }

  public Sort get__typename() {
    return this.__typename;
  }

  public void set__typename(Sort __typename) {
    this.__typename = __typename;
  }

  public GroupUserRelationOrderBy getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelationOrderBy groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public GroupRoleRelationOrderBy getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(GroupRoleRelationOrderBy groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public GroupOrderBy getSubGroupsAggregate() {
    return this.subGroupsAggregate;
  }

  public void setSubGroupsAggregate(GroupOrderBy subGroupsAggregate) {
    this.subGroupsAggregate = subGroupsAggregate;
  }

  public UserOrderBy getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(UserOrderBy usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public RoleOrderBy getRolesAggregate() {
    return this.rolesAggregate;
  }

  public void setRolesAggregate(RoleOrderBy rolesAggregate) {
    this.rolesAggregate = rolesAggregate;
  }

  public GroupUserRelationOrderBy getGroupUserRelationAggregate() {
    return this.groupUserRelationAggregate;
  }

  public void setGroupUserRelationAggregate(GroupUserRelationOrderBy groupUserRelationAggregate) {
    this.groupUserRelationAggregate = groupUserRelationAggregate;
  }

  public GroupRoleRelationOrderBy getGroupRoleRelationAggregate() {
    return this.groupRoleRelationAggregate;
  }

  public void setGroupRoleRelationAggregate(GroupRoleRelationOrderBy groupRoleRelationAggregate) {
    this.groupRoleRelationAggregate = groupRoleRelationAggregate;
  }

  public Sort getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Sort idCount) {
    this.idCount = idCount;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getPathCount() {
    return this.pathCount;
  }

  public void setPathCount(Sort pathCount) {
    this.pathCount = pathCount;
  }

  public Sort getDeepCount() {
    return this.deepCount;
  }

  public void setDeepCount(Sort deepCount) {
    this.deepCount = deepCount;
  }

  public Sort getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Sort parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Sort getDeepMax() {
    return this.deepMax;
  }

  public void setDeepMax(Sort deepMax) {
    this.deepMax = deepMax;
  }

  public Sort getDeepMin() {
    return this.deepMin;
  }

  public void setDeepMin(Sort deepMin) {
    this.deepMin = deepMin;
  }

  public Sort getDeepSum() {
    return this.deepSum;
  }

  public void setDeepSum(Sort deepSum) {
    this.deepSum = deepSum;
  }

  public Sort getDeepAvg() {
    return this.deepAvg;
  }

  public void setDeepAvg(Sort deepAvg) {
    this.deepAvg = deepAvg;
  }

  public Sort getCreateTimeYear() {
    return this.createTimeYear;
  }

  public void setCreateTimeYear(Sort createTimeYear) {
    this.createTimeYear = createTimeYear;
  }

  public Sort getCreateTimeMonth() {
    return this.createTimeMonth;
  }

  public void setCreateTimeMonth(Sort createTimeMonth) {
    this.createTimeMonth = createTimeMonth;
  }

  public Sort getCreateTimeDay() {
    return this.createTimeDay;
  }

  public void setCreateTimeDay(Sort createTimeDay) {
    this.createTimeDay = createTimeDay;
  }

  public Sort getCreateTimeWeek() {
    return this.createTimeWeek;
  }

  public void setCreateTimeWeek(Sort createTimeWeek) {
    this.createTimeWeek = createTimeWeek;
  }

  public Sort getCreateTimeQuarter() {
    return this.createTimeQuarter;
  }

  public void setCreateTimeQuarter(Sort createTimeQuarter) {
    this.createTimeQuarter = createTimeQuarter;
  }

  public Sort getUpdateTimeYear() {
    return this.updateTimeYear;
  }

  public void setUpdateTimeYear(Sort updateTimeYear) {
    this.updateTimeYear = updateTimeYear;
  }

  public Sort getUpdateTimeMonth() {
    return this.updateTimeMonth;
  }

  public void setUpdateTimeMonth(Sort updateTimeMonth) {
    this.updateTimeMonth = updateTimeMonth;
  }

  public Sort getUpdateTimeDay() {
    return this.updateTimeDay;
  }

  public void setUpdateTimeDay(Sort updateTimeDay) {
    this.updateTimeDay = updateTimeDay;
  }

  public Sort getUpdateTimeWeek() {
    return this.updateTimeWeek;
  }

  public void setUpdateTimeWeek(Sort updateTimeWeek) {
    this.updateTimeWeek = updateTimeWeek;
  }

  public Sort getUpdateTimeQuarter() {
    return this.updateTimeQuarter;
  }

  public void setUpdateTimeQuarter(Sort updateTimeQuarter) {
    this.updateTimeQuarter = updateTimeQuarter;
  }

  public Collection<GroupOrderBy> getObs() {
    return this.obs;
  }

  public void setObs(Collection<GroupOrderBy> obs) {
    this.obs = obs;
  }
}
