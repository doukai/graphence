package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 角色 排序
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 排序")
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
   * 已移除
   */
  @Description("已移除")
  private Sort isDeprecated;

  /**
   * 版本
   */
  @Description("版本")
  private Sort version;

  /**
   * 域
   */
  @Description("域")
  private Sort realmId;

  /**
   * 创建者
   */
  @Description("创建者")
  private Sort createUserId;

  /**
   * 创建时间
   */
  @Description("创建时间")
  private Sort createTime;

  /**
   * 更新者
   */
  @Description("更新者")
  private Sort updateUserId;

  /**
   * 更新时间
   */
  @Description("更新时间")
  private Sort updateTime;

  /**
   * 创建组
   */
  @Description("创建组")
  private Sort createGroupId;

  /**
   * 所属类型
   */
  @Description("所属类型")
  private Sort __typename;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private RoleUserRelationOrderBy roleUserRelation;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  private GroupRoleRelationOrderBy groupRoleRelation;

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  private RoleCompositeRelationOrderBy roleCompositeRelation;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private RolePermissionRelationOrderBy rolePermissionRelation;

  /**
   * 用户 统计字段
   */
  @Description("用户 统计字段")
  private UserOrderBy usersAggregate;

  /**
   * 组 统计字段
   */
  @Description("组 统计字段")
  private GroupOrderBy groupsAggregate;

  /**
   * 组合 统计字段
   */
  @Description("组合 统计字段")
  private RoleOrderBy compositesAggregate;

  /**
   * 权限 统计字段
   */
  @Description("权限 统计字段")
  private PermissionOrderBy permissionsAggregate;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  private RoleUserRelationOrderBy roleUserRelationAggregate;

  /**
   * 角色 组 关系 统计字段
   */
  @Description("角色 组 关系 统计字段")
  private GroupRoleRelationOrderBy groupRoleRelationAggregate;

  /**
   * 角色 角色 关系 统计字段
   */
  @Description("角色 角色 关系 统计字段")
  private RoleCompositeRelationOrderBy roleCompositeRelationAggregate;

  /**
   * 角色 权限 关系 统计字段
   */
  @Description("角色 权限 关系 统计字段")
  private RolePermissionRelationOrderBy rolePermissionRelationAggregate;

  /**
   * 角色 数量
   */
  @Description("角色 数量")
  private Sort idCount;

  /**
   * ID 最大值
   */
  @Description("ID 最大值")
  private Sort idMax;

  /**
   * ID 最小值
   */
  @Description("ID 最小值")
  private Sort idMin;

  /**
   * 名称 数量
   */
  @Description("名称 数量")
  private Sort nameCount;

  /**
   * 名称 最大值
   */
  @Description("名称 最大值")
  private Sort nameMax;

  /**
   * 名称 最小值
   */
  @Description("名称 最小值")
  private Sort nameMin;

  /**
   * 描述 数量
   */
  @Description("描述 数量")
  private Sort descriptionCount;

  /**
   * 描述 最大值
   */
  @Description("描述 最大值")
  private Sort descriptionMax;

  /**
   * 描述 最小值
   */
  @Description("描述 最小值")
  private Sort descriptionMin;

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

  public Sort getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Sort idMax) {
    this.idMax = idMax;
  }

  public Sort getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Sort idMin) {
    this.idMin = idMin;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(Sort descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public Sort getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(Sort descriptionMin) {
    this.descriptionMin = descriptionMin;
  }
}
