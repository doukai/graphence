package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.Ignore;
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
public class Group implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private Group parent;

  private Collection<Group> subGroups;

  private Collection<User> users;

  private Collection<Role> roles;

  private Realm realm;

  private Boolean isDeprecated;

  private Integer version;

  private String realmId;

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

  private String realmIdMax;

  private String realmIdMin;

  private Collection<UserGroup> userGroup;

  private UserGroup userGroupAggregate;

  private UserGroupConnection userGroupConnection;

  private Collection<GroupRole> groupRole;

  private GroupRole groupRoleAggregate;

  private GroupRoleConnection groupRoleConnection;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
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
    this.isDeprecated = isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
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

  public String getRealmIdMax() {
    return this.realmIdMax;
  }

  public void setRealmIdMax(String realmIdMax) {
    this.realmIdMax = realmIdMax;
  }

  public String getRealmIdMin() {
    return this.realmIdMin;
  }

  public void setRealmIdMin(String realmIdMin) {
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
}
