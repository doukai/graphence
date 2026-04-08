package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Order Input for 角色
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Order Input for 角色")
public class RoleOrderBy {
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
   * 用户
   */
  @Description("用户")
  private UserOrderBy users;

  /**
   * 组
   */
  @Description("组")
  private GroupOrderBy groups;

  /**
   * 组合
   */
  @Description("组合")
  private RoleOrderBy composites;

  /**
   * 权限
   */
  @Description("权限")
  private PermissionOrderBy permissions;

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
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private RoleUserRelationOrderBy roleUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private GroupRoleRelationOrderBy groupRoleRelation;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  private RoleCompositeRelationOrderBy roleCompositeRelation;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  private RolePermissionRelationOrderBy rolePermissionRelation;

  /**
   * Aggregate Field for 用户
   */
  @Description("Aggregate Field for 用户")
  private UserOrderBy usersAggregate;

  /**
   * Aggregate Field for 组
   */
  @Description("Aggregate Field for 组")
  private GroupOrderBy groupsAggregate;

  /**
   * Aggregate Field for 组合
   */
  @Description("Aggregate Field for 组合")
  private RoleOrderBy compositesAggregate;

  /**
   * Aggregate Field for 权限
   */
  @Description("Aggregate Field for 权限")
  private PermissionOrderBy permissionsAggregate;

  /**
   * Aggregate Field for Relationship Object between 用户 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 角色")
  private RoleUserRelationOrderBy roleUserRelationAggregate;

  /**
   * Aggregate Field for Relationship Object between 角色 and 组
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 组")
  private GroupRoleRelationOrderBy groupRoleRelationAggregate;

  /**
   * Aggregate Field for Relationship Object between 角色 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 角色")
  private RoleCompositeRelationOrderBy roleCompositeRelationAggregate;

  /**
   * Aggregate Field for Relationship Object between 角色 and 权限
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelationOrderBy rolePermissionRelationAggregate;

  /**
   * Count of 角色
   */
  @Description("Count of 角色")
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
  private Collection<RoleOrderBy> obs;

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

  public UserOrderBy getUsers() {
    return this.users;
  }

  public void setUsers(UserOrderBy users) {
    this.users = users;
  }

  public GroupOrderBy getGroups() {
    return this.groups;
  }

  public void setGroups(GroupOrderBy groups) {
    this.groups = groups;
  }

  public RoleOrderBy getComposites() {
    return this.composites;
  }

  public void setComposites(RoleOrderBy composites) {
    this.composites = composites;
  }

  public PermissionOrderBy getPermissions() {
    return this.permissions;
  }

  public void setPermissions(PermissionOrderBy permissions) {
    this.permissions = permissions;
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

  public RoleUserRelationOrderBy getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(RoleUserRelationOrderBy roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public GroupRoleRelationOrderBy getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(GroupRoleRelationOrderBy groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public RoleCompositeRelationOrderBy getRoleCompositeRelation() {
    return this.roleCompositeRelation;
  }

  public void setRoleCompositeRelation(RoleCompositeRelationOrderBy roleCompositeRelation) {
    this.roleCompositeRelation = roleCompositeRelation;
  }

  public RolePermissionRelationOrderBy getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(RolePermissionRelationOrderBy rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
  }

  public UserOrderBy getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(UserOrderBy usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public GroupOrderBy getGroupsAggregate() {
    return this.groupsAggregate;
  }

  public void setGroupsAggregate(GroupOrderBy groupsAggregate) {
    this.groupsAggregate = groupsAggregate;
  }

  public RoleOrderBy getCompositesAggregate() {
    return this.compositesAggregate;
  }

  public void setCompositesAggregate(RoleOrderBy compositesAggregate) {
    this.compositesAggregate = compositesAggregate;
  }

  public PermissionOrderBy getPermissionsAggregate() {
    return this.permissionsAggregate;
  }

  public void setPermissionsAggregate(PermissionOrderBy permissionsAggregate) {
    this.permissionsAggregate = permissionsAggregate;
  }

  public RoleUserRelationOrderBy getRoleUserRelationAggregate() {
    return this.roleUserRelationAggregate;
  }

  public void setRoleUserRelationAggregate(RoleUserRelationOrderBy roleUserRelationAggregate) {
    this.roleUserRelationAggregate = roleUserRelationAggregate;
  }

  public GroupRoleRelationOrderBy getGroupRoleRelationAggregate() {
    return this.groupRoleRelationAggregate;
  }

  public void setGroupRoleRelationAggregate(GroupRoleRelationOrderBy groupRoleRelationAggregate) {
    this.groupRoleRelationAggregate = groupRoleRelationAggregate;
  }

  public RoleCompositeRelationOrderBy getRoleCompositeRelationAggregate() {
    return this.roleCompositeRelationAggregate;
  }

  public void setRoleCompositeRelationAggregate(
      RoleCompositeRelationOrderBy roleCompositeRelationAggregate) {
    this.roleCompositeRelationAggregate = roleCompositeRelationAggregate;
  }

  public RolePermissionRelationOrderBy getRolePermissionRelationAggregate() {
    return this.rolePermissionRelationAggregate;
  }

  public void setRolePermissionRelationAggregate(
      RolePermissionRelationOrderBy rolePermissionRelationAggregate) {
    this.rolePermissionRelationAggregate = rolePermissionRelationAggregate;
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

  public Collection<RoleOrderBy> getObs() {
    return this.obs;
  }

  public void setObs(Collection<RoleOrderBy> obs) {
    this.obs = obs;
  }
}
