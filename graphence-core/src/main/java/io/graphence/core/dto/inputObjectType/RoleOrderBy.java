package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class RoleOrderBy {
  private Sort id;

  private Sort name;

  private Sort description;

  private UserOrderBy users;

  private GroupOrderBy groups;

  private RoleOrderBy composites;

  private PermissionOrderBy permissions;

  private RealmOrderBy realm;

  private Sort isDeprecated;

  private Sort version;

  private Sort realmId;

  private Sort createUserId;

  private Sort createTime;

  private Sort updateUserId;

  private Sort updateTime;

  private Sort createGroupId;

  private Sort __typename;

  private RoleUserRelationOrderBy roleUserRelation;

  private GroupRoleRelationOrderBy groupRoleRelation;

  private RoleCompositeRelationOrderBy roleCompositeRelation;

  private PermissionRoleRelationOrderBy permissionRoleRelation;

  private UserOrderBy usersAggregate;

  private GroupOrderBy groupsAggregate;

  private RoleOrderBy compositesAggregate;

  private PermissionOrderBy permissionsAggregate;

  private RoleUserRelationOrderBy roleUserRelationAggregate;

  private GroupRoleRelationOrderBy groupRoleRelationAggregate;

  private RoleCompositeRelationOrderBy roleCompositeRelationAggregate;

  private PermissionRoleRelationOrderBy permissionRoleRelationAggregate;

  private Sort idCount;

  private Sort idMax;

  private Sort idMin;

  private Sort nameCount;

  private Sort nameMax;

  private Sort nameMin;

  private Sort descriptionCount;

  private Sort descriptionMax;

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

  public PermissionRoleRelationOrderBy getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  public void setPermissionRoleRelation(PermissionRoleRelationOrderBy permissionRoleRelation) {
    this.permissionRoleRelation = permissionRoleRelation;
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

  public PermissionRoleRelationOrderBy getPermissionRoleRelationAggregate() {
    return this.permissionRoleRelationAggregate;
  }

  public void setPermissionRoleRelationAggregate(
      PermissionRoleRelationOrderBy permissionRoleRelationAggregate) {
    this.permissionRoleRelationAggregate = permissionRoleRelationAggregate;
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
