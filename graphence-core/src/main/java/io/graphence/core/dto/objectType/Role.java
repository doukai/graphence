package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.RoleInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.structure.dto.interfaceType.NamedStruct;
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
 * 角色
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色")
public class Role implements NamedStruct, Meta {
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
   * 用户
   */
  @Description("用户")
  private Collection<User> users;

  /**
   * 组
   */
  @Description("组")
  private Collection<Group> groups;

  /**
   * 组合
   */
  @Description("组合")
  private Collection<Role> composites;

  /**
   * 权限
   */
  @Description("权限")
  private Collection<Permission> permissions;

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
  private String __typename = "Role";

  /**
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  private Collection<RoleUserRelation> roleUserRelation;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  private Collection<GroupRoleRelation> groupRoleRelation;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  private Collection<RoleCompositeRelation> roleCompositeRelation;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  private Collection<RolePermissionRelation> rolePermissionRelation;

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
   * Aggregate Field for 组
   */
  @Description("Aggregate Field for 组")
  private Group groupsAggregate;

  /**
   * Connection Field for 组
   */
  @Description("Connection Field for 组")
  private GroupConnection groupsConnection;

  /**
   * Aggregate Field for 组合
   */
  @Description("Aggregate Field for 组合")
  private Role compositesAggregate;

  /**
   * Connection Field for 组合
   */
  @Description("Connection Field for 组合")
  private RoleConnection compositesConnection;

  /**
   * Aggregate Field for 权限
   */
  @Description("Aggregate Field for 权限")
  private Permission permissionsAggregate;

  /**
   * Connection Field for 权限
   */
  @Description("Connection Field for 权限")
  private PermissionConnection permissionsConnection;

  /**
   * Aggregate Field for Relationship Object between 用户 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 用户 and 角色")
  private RoleUserRelation roleUserRelationAggregate;

  /**
   * Connection Field for Relationship Object between 用户 and 角色
   */
  @Description("Connection Field for Relationship Object between 用户 and 角色")
  private RoleUserRelationConnection roleUserRelationConnection;

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
   * Aggregate Field for Relationship Object between 角色 and 角色
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 角色")
  private RoleCompositeRelation roleCompositeRelationAggregate;

  /**
   * Connection Field for Relationship Object between 角色 and 角色
   */
  @Description("Connection Field for Relationship Object between 角色 and 角色")
  private RoleCompositeRelationConnection roleCompositeRelationConnection;

  /**
   * Aggregate Field for Relationship Object between 角色 and 权限
   */
  @Description("Aggregate Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelation rolePermissionRelationAggregate;

  /**
   * Connection Field for Relationship Object between 角色 and 权限
   */
  @Description("Connection Field for Relationship Object between 角色 and 权限")
  private RolePermissionRelationConnection rolePermissionRelationConnection;

  /**
   * Count of 角色
   */
  @Description("Count of 角色")
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

  private Boolean syncRolePolicy;

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

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
  }

  public Collection<Group> getGroups() {
    return this.groups;
  }

  public void setGroups(Collection<Group> groups) {
    this.groups = groups;
  }

  public Collection<Role> getComposites() {
    return this.composites;
  }

  public void setComposites(Collection<Role> composites) {
    this.composites = composites;
  }

  public Collection<Permission> getPermissions() {
    return this.permissions;
  }

  public void setPermissions(Collection<Permission> permissions) {
    this.permissions = permissions;
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

  public Collection<RoleUserRelation> getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(Collection<RoleUserRelation> roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public Collection<GroupRoleRelation> getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(Collection<GroupRoleRelation> groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  public Collection<RoleCompositeRelation> getRoleCompositeRelation() {
    return this.roleCompositeRelation;
  }

  public void setRoleCompositeRelation(Collection<RoleCompositeRelation> roleCompositeRelation) {
    this.roleCompositeRelation = roleCompositeRelation;
  }

  public Collection<RolePermissionRelation> getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  public void setRolePermissionRelation(Collection<RolePermissionRelation> rolePermissionRelation) {
    this.rolePermissionRelation = rolePermissionRelation;
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

  public Group getGroupsAggregate() {
    return this.groupsAggregate;
  }

  public void setGroupsAggregate(Group groupsAggregate) {
    this.groupsAggregate = groupsAggregate;
  }

  public GroupConnection getGroupsConnection() {
    return this.groupsConnection;
  }

  public void setGroupsConnection(GroupConnection groupsConnection) {
    this.groupsConnection = groupsConnection;
  }

  public Role getCompositesAggregate() {
    return this.compositesAggregate;
  }

  public void setCompositesAggregate(Role compositesAggregate) {
    this.compositesAggregate = compositesAggregate;
  }

  public RoleConnection getCompositesConnection() {
    return this.compositesConnection;
  }

  public void setCompositesConnection(RoleConnection compositesConnection) {
    this.compositesConnection = compositesConnection;
  }

  public Permission getPermissionsAggregate() {
    return this.permissionsAggregate;
  }

  public void setPermissionsAggregate(Permission permissionsAggregate) {
    this.permissionsAggregate = permissionsAggregate;
  }

  public PermissionConnection getPermissionsConnection() {
    return this.permissionsConnection;
  }

  public void setPermissionsConnection(PermissionConnection permissionsConnection) {
    this.permissionsConnection = permissionsConnection;
  }

  public RoleUserRelation getRoleUserRelationAggregate() {
    return this.roleUserRelationAggregate;
  }

  public void setRoleUserRelationAggregate(RoleUserRelation roleUserRelationAggregate) {
    this.roleUserRelationAggregate = roleUserRelationAggregate;
  }

  public RoleUserRelationConnection getRoleUserRelationConnection() {
    return this.roleUserRelationConnection;
  }

  public void setRoleUserRelationConnection(RoleUserRelationConnection roleUserRelationConnection) {
    this.roleUserRelationConnection = roleUserRelationConnection;
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

  public RoleCompositeRelation getRoleCompositeRelationAggregate() {
    return this.roleCompositeRelationAggregate;
  }

  public void setRoleCompositeRelationAggregate(
      RoleCompositeRelation roleCompositeRelationAggregate) {
    this.roleCompositeRelationAggregate = roleCompositeRelationAggregate;
  }

  public RoleCompositeRelationConnection getRoleCompositeRelationConnection() {
    return this.roleCompositeRelationConnection;
  }

  public void setRoleCompositeRelationConnection(
      RoleCompositeRelationConnection roleCompositeRelationConnection) {
    this.roleCompositeRelationConnection = roleCompositeRelationConnection;
  }

  public RolePermissionRelation getRolePermissionRelationAggregate() {
    return this.rolePermissionRelationAggregate;
  }

  public void setRolePermissionRelationAggregate(
      RolePermissionRelation rolePermissionRelationAggregate) {
    this.rolePermissionRelationAggregate = rolePermissionRelationAggregate;
  }

  public RolePermissionRelationConnection getRolePermissionRelationConnection() {
    return this.rolePermissionRelationConnection;
  }

  public void setRolePermissionRelationConnection(
      RolePermissionRelationConnection rolePermissionRelationConnection) {
    this.rolePermissionRelationConnection = rolePermissionRelationConnection;
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

  public Boolean getSyncRolePolicy() {
    return this.syncRolePolicy;
  }

  public void setSyncRolePolicy(Boolean syncRolePolicy) {
    this.syncRolePolicy = syncRolePolicy;
  }

  public RoleInput toInput() {
    RoleInput input = new RoleInput();
    input.setId(this.getId());
    input.setName(this.getName());
    input.setDescription(this.getDescription());
    if(getUsers() != null) {
      input.setUsers(this.getUsers().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getGroups() != null) {
      input.setGroups(this.getGroups().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getComposites() != null) {
      input.setComposites(this.getComposites().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getPermissions() != null) {
      input.setPermissions(this.getPermissions().stream().map(item -> item.toInput()).collect(Collectors.toList()));
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
    if(getRoleUserRelation() != null) {
      input.setRoleUserRelation(this.getRoleUserRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getGroupRoleRelation() != null) {
      input.setGroupRoleRelation(this.getGroupRoleRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getRoleCompositeRelation() != null) {
      input.setRoleCompositeRelation(this.getRoleCompositeRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    if(getRolePermissionRelation() != null) {
      input.setRolePermissionRelation(this.getRolePermissionRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    return input;
  }
}
