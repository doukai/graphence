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
public class Role implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private String description;

  private Collection<User> users;

  private Collection<Role> composites;

  private Collection<Permission> permissions;

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

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private User usersAggregate;

  private UserConnection usersConnection;

  private Role compositesAggregate;

  private RoleConnection compositesConnection;

  private Permission permissionsAggregate;

  private PermissionConnection permissionsConnection;

  private Integer realmIdCount;

  private Integer realmIdSum;

  private Integer realmIdAvg;

  private Integer realmIdMax;

  private Integer realmIdMin;

  private Collection<UserRole> userRole;

  private UserRole userRoleAggregate;

  private UserRoleConnection userRoleConnection;

  private Collection<RoleComposite> roleComposite;

  private RoleComposite roleCompositeAggregate;

  private RoleCompositeConnection roleCompositeConnection;

  private Collection<RolePermission> rolePermission;

  private RolePermission rolePermissionAggregate;

  private RolePermissionConnection rolePermissionConnection;

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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
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
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
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

  public Collection<UserRole> getUserRole() {
    return this.userRole;
  }

  public void setUserRole(Collection<UserRole> userRole) {
    this.userRole = userRole;
  }

  public UserRole getUserRoleAggregate() {
    return this.userRoleAggregate;
  }

  public void setUserRoleAggregate(UserRole userRoleAggregate) {
    this.userRoleAggregate = userRoleAggregate;
  }

  public UserRoleConnection getUserRoleConnection() {
    return this.userRoleConnection;
  }

  public void setUserRoleConnection(UserRoleConnection userRoleConnection) {
    this.userRoleConnection = userRoleConnection;
  }

  public Collection<RoleComposite> getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(Collection<RoleComposite> roleComposite) {
    this.roleComposite = roleComposite;
  }

  public RoleComposite getRoleCompositeAggregate() {
    return this.roleCompositeAggregate;
  }

  public void setRoleCompositeAggregate(RoleComposite roleCompositeAggregate) {
    this.roleCompositeAggregate = roleCompositeAggregate;
  }

  public RoleCompositeConnection getRoleCompositeConnection() {
    return this.roleCompositeConnection;
  }

  public void setRoleCompositeConnection(RoleCompositeConnection roleCompositeConnection) {
    this.roleCompositeConnection = roleCompositeConnection;
  }

  public Collection<RolePermission> getRolePermission() {
    return this.rolePermission;
  }

  public void setRolePermission(Collection<RolePermission> rolePermission) {
    this.rolePermission = rolePermission;
  }

  public RolePermission getRolePermissionAggregate() {
    return this.rolePermissionAggregate;
  }

  public void setRolePermissionAggregate(RolePermission rolePermissionAggregate) {
    this.rolePermissionAggregate = rolePermissionAggregate;
  }

  public RolePermissionConnection getRolePermissionConnection() {
    return this.rolePermissionConnection;
  }

  public void setRolePermissionConnection(RolePermissionConnection rolePermissionConnection) {
    this.rolePermissionConnection = rolePermissionConnection;
  }
}
