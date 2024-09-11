package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class GroupOrderBy {
  private Sort id;

  private Sort name;

  private Sort description;

  private Sort path;

  private Sort deep;

  private Sort parentId;

  private GroupOrderBy parent;

  private GroupOrderBy subGroups;

  private UserOrderBy users;

  private RoleOrderBy roles;

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

  private GroupUserRelationOrderBy groupUserRelation;

  private GroupRoleRelationOrderBy groupRoleRelation;

  private GroupOrderBy subGroupsAggregate;

  private UserOrderBy usersAggregate;

  private RoleOrderBy rolesAggregate;

  private GroupUserRelationOrderBy groupUserRelationAggregate;

  private GroupRoleRelationOrderBy groupRoleRelationAggregate;

  private Sort idCount;

  private Sort idMax;

  private Sort idMin;

  private Sort nameCount;

  private Sort nameMax;

  private Sort nameMin;

  private Sort descriptionCount;

  private Sort descriptionMax;

  private Sort descriptionMin;

  private Sort pathCount;

  private Sort pathMax;

  private Sort pathMin;

  private Sort parentIdCount;

  private Sort parentIdMax;

  private Sort parentIdMin;

  private Sort deepCount;

  private Sort deepSum;

  private Sort deepAvg;

  private Sort deepMax;

  private Sort deepMin;

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

  public Sort getPathCount() {
    return this.pathCount;
  }

  public void setPathCount(Sort pathCount) {
    this.pathCount = pathCount;
  }

  public Sort getPathMax() {
    return this.pathMax;
  }

  public void setPathMax(Sort pathMax) {
    this.pathMax = pathMax;
  }

  public Sort getPathMin() {
    return this.pathMin;
  }

  public void setPathMin(Sort pathMin) {
    this.pathMin = pathMin;
  }

  public Sort getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Sort parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Sort getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(Sort parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public Sort getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(Sort parentIdMin) {
    this.parentIdMin = parentIdMin;
  }

  public Sort getDeepCount() {
    return this.deepCount;
  }

  public void setDeepCount(Sort deepCount) {
    this.deepCount = deepCount;
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
}
