package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.Ignore;
import io.graphoenix.structure.dto.interfaceType.NamedStruct;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class Group implements NamedStruct, Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private String description;

  private String path;

  private Integer deep;

  private Group parent;

  private Collection<Group> subGroups;

  private Collection<User> users;

  private Collection<Role> roles;

  private Realm realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer pathCount;

  private String pathMax;

  private String pathMin;

  private Integer deepCount;

  private Integer deepSum;

  private Integer deepAvg;

  private Integer deepMax;

  private Integer deepMin;

  private Group subGroupsAggregate;

  private GroupConnection subGroupsConnection;

  private User usersAggregate;

  private UserConnection usersConnection;

  private Role rolesAggregate;

  private RoleConnection rolesConnection;

  private Integer parentId;

  private Integer parentIdCount;

  private Integer parentIdSum;

  private Integer parentIdAvg;

  private Integer parentIdMax;

  private Integer parentIdMin;

  private Integer realmIdCount;

  private Integer realmIdSum;

  private Integer realmIdAvg;

  private Integer realmIdMax;

  private Integer realmIdMin;

  private Collection<UserGroup> userGroup;

  private UserGroup userGroupAggregate;

  private UserGroupConnection userGroupConnection;

  private Collection<GroupRole> groupRole;

  private GroupRole groupRoleAggregate;

  private GroupRoleConnection groupRoleConnection;

  private Boolean syncGroupPolicy;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

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
    this.name = name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
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

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = realmId;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
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

  public Integer getParentId() {
    return this.parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Integer getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Integer parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Integer getParentIdSum() {
    return this.parentIdSum;
  }

  public void setParentIdSum(Integer parentIdSum) {
    this.parentIdSum = parentIdSum;
  }

  public Integer getParentIdAvg() {
    return this.parentIdAvg;
  }

  public void setParentIdAvg(Integer parentIdAvg) {
    this.parentIdAvg = parentIdAvg;
  }

  public Integer getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(Integer parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public Integer getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(Integer parentIdMin) {
    this.parentIdMin = parentIdMin;
  }

  public Integer getRealmIdCount() {
    return this.realmIdCount;
  }

  public void setRealmIdCount(Integer realmIdCount) {
    this.realmIdCount = realmIdCount;
  }

  public Integer getRealmIdSum() {
    return this.realmIdSum;
  }

  public void setRealmIdSum(Integer realmIdSum) {
    this.realmIdSum = realmIdSum;
  }

  public Integer getRealmIdAvg() {
    return this.realmIdAvg;
  }

  public void setRealmIdAvg(Integer realmIdAvg) {
    this.realmIdAvg = realmIdAvg;
  }

  public Integer getRealmIdMax() {
    return this.realmIdMax;
  }

  public void setRealmIdMax(Integer realmIdMax) {
    this.realmIdMax = realmIdMax;
  }

  public Integer getRealmIdMin() {
    return this.realmIdMin;
  }

  public void setRealmIdMin(Integer realmIdMin) {
    this.realmIdMin = realmIdMin;
  }

  public Collection<UserGroup> getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(Collection<UserGroup> userGroup) {
    this.userGroup = userGroup;
  }

  public UserGroup getUserGroupAggregate() {
    return this.userGroupAggregate;
  }

  public void setUserGroupAggregate(UserGroup userGroupAggregate) {
    this.userGroupAggregate = userGroupAggregate;
  }

  public UserGroupConnection getUserGroupConnection() {
    return this.userGroupConnection;
  }

  public void setUserGroupConnection(UserGroupConnection userGroupConnection) {
    this.userGroupConnection = userGroupConnection;
  }

  public Collection<GroupRole> getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(Collection<GroupRole> groupRole) {
    this.groupRole = groupRole;
  }

  public GroupRole getGroupRoleAggregate() {
    return this.groupRoleAggregate;
  }

  public void setGroupRoleAggregate(GroupRole groupRoleAggregate) {
    this.groupRoleAggregate = groupRoleAggregate;
  }

  public GroupRoleConnection getGroupRoleConnection() {
    return this.groupRoleConnection;
  }

  public void setGroupRoleConnection(GroupRoleConnection groupRoleConnection) {
    this.groupRoleConnection = groupRoleConnection;
  }

  public Boolean getSyncGroupPolicy() {
    return this.syncGroupPolicy;
  }

  public void setSyncGroupPolicy(Boolean syncGroupPolicy) {
    this.syncGroupPolicy = syncGroupPolicy;
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
}
