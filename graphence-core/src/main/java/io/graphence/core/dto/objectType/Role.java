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
  private String __typename = "Role";

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private Collection<RoleUserRelation> roleUserRelation;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  private Collection<GroupRoleRelation> groupRoleRelation;

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  private Collection<RoleCompositeRelation> roleCompositeRelation;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private Collection<PermissionRoleRelation> permissionRoleRelation;

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
   * 组 统计字段
   */
  @Description("组 统计字段")
  private Group groupsAggregate;

  /**
   * 组 连接
   */
  @Description("组 连接")
  private GroupConnection groupsConnection;

  /**
   * 组合 统计字段
   */
  @Description("组合 统计字段")
  private Role compositesAggregate;

  /**
   * 组合 连接
   */
  @Description("组合 连接")
  private RoleConnection compositesConnection;

  /**
   * 权限 统计字段
   */
  @Description("权限 统计字段")
  private Permission permissionsAggregate;

  /**
   * 权限 连接
   */
  @Description("权限 连接")
  private PermissionConnection permissionsConnection;

  /**
   * 用户 角色 关系 统计字段
   */
  @Description("用户 角色 关系 统计字段")
  private RoleUserRelation roleUserRelationAggregate;

  /**
   * 用户 角色 关系 连接
   */
  @Description("用户 角色 关系 连接")
  private RoleUserRelationConnection roleUserRelationConnection;

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
   * 角色 角色 关系 统计字段
   */
  @Description("角色 角色 关系 统计字段")
  private RoleCompositeRelation roleCompositeRelationAggregate;

  /**
   * 角色 角色 关系 连接
   */
  @Description("角色 角色 关系 连接")
  private RoleCompositeRelationConnection roleCompositeRelationConnection;

  /**
   * 角色 权限 关系 统计字段
   */
  @Description("角色 权限 关系 统计字段")
  private PermissionRoleRelation permissionRoleRelationAggregate;

  /**
   * 角色 权限 关系 连接
   */
  @Description("角色 权限 关系 连接")
  private PermissionRoleRelationConnection permissionRoleRelationConnection;

  /**
   * 角色 数量
   */
  @Description("角色 数量")
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

  private Boolean syncRolePolicy;

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

  public Collection<PermissionRoleRelation> getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  public void setPermissionRoleRelation(Collection<PermissionRoleRelation> permissionRoleRelation) {
    this.permissionRoleRelation = permissionRoleRelation;
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

  public PermissionRoleRelation getPermissionRoleRelationAggregate() {
    return this.permissionRoleRelationAggregate;
  }

  public void setPermissionRoleRelationAggregate(
      PermissionRoleRelation permissionRoleRelationAggregate) {
    this.permissionRoleRelationAggregate = permissionRoleRelationAggregate;
  }

  public PermissionRoleRelationConnection getPermissionRoleRelationConnection() {
    return this.permissionRoleRelationConnection;
  }

  public void setPermissionRoleRelationConnection(
      PermissionRoleRelationConnection permissionRoleRelationConnection) {
    this.permissionRoleRelationConnection = permissionRoleRelationConnection;
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
    if(getPermissionRoleRelation() != null) {
      input.setPermissionRoleRelation(this.getPermissionRoleRelation().stream().map(item -> item.toInput()).collect(Collectors.toList()));
    }
    return input;
  }
}
