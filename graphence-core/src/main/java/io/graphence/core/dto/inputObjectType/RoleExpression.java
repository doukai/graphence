package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class RoleExpression implements MetaExpression {
  private StringExpression id;

  private StringExpression name;

  private StringExpression description;

  private UserExpression users;

  private GroupExpression groups;

  private RoleExpression composites;

  private PermissionExpression permissions;

  private RealmExpression realm;

  @DefaultValue("false")
  private Boolean includeDeprecated;

  private IntExpression version;

  private IntExpression realmId;

  private StringExpression createUserId;

  private StringExpression createTime;

  private StringExpression updateUserId;

  private StringExpression updateTime;

  private StringExpression createGroupId;

  private StringExpression __typename;

  private UserRoleExpression userRole;

  private GroupRoleExpression groupRole;

  private RoleCompositeExpression roleComposite;

  private RolePermissionExpression rolePermission;

  @DefaultValue("false")
  private Boolean not;

  @DefaultValue("AND")
  private Conditional cond;

  private Collection<RoleExpression> exs;

  public StringExpression getId() {
    return this.id;
  }

  public void setId(StringExpression id) {
    this.id = id;
  }

  public StringExpression getName() {
    return this.name;
  }

  public void setName(StringExpression name) {
    this.name = name;
  }

  public StringExpression getDescription() {
    return this.description;
  }

  public void setDescription(StringExpression description) {
    this.description = description;
  }

  public UserExpression getUsers() {
    return this.users;
  }

  public void setUsers(UserExpression users) {
    this.users = users;
  }

  public GroupExpression getGroups() {
    return this.groups;
  }

  public void setGroups(GroupExpression groups) {
    this.groups = groups;
  }

  public RoleExpression getComposites() {
    return this.composites;
  }

  public void setComposites(RoleExpression composites) {
    this.composites = composites;
  }

  public PermissionExpression getPermissions() {
    return this.permissions;
  }

  public void setPermissions(PermissionExpression permissions) {
    this.permissions = permissions;
  }

  public RealmExpression getRealm() {
    return this.realm;
  }

  public void setRealm(RealmExpression realm) {
    this.realm = realm;
  }

  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = includeDeprecated;
  }

  public IntExpression getVersion() {
    return this.version;
  }

  public void setVersion(IntExpression version) {
    this.version = version;
  }

  public IntExpression getRealmId() {
    return this.realmId;
  }

  public void setRealmId(IntExpression realmId) {
    this.realmId = realmId;
  }

  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = createUserId;
  }

  public StringExpression getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(StringExpression createTime) {
    this.createTime = createTime;
  }

  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = updateUserId;
  }

  public StringExpression getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(StringExpression updateTime) {
    this.updateTime = updateTime;
  }

  public StringExpression getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(StringExpression createGroupId) {
    this.createGroupId = createGroupId;
  }

  public StringExpression get__typename() {
    return this.__typename;
  }

  public void set__typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public UserRoleExpression getUserRole() {
    return this.userRole;
  }

  public void setUserRole(UserRoleExpression userRole) {
    this.userRole = userRole;
  }

  public GroupRoleExpression getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(GroupRoleExpression groupRole) {
    this.groupRole = groupRole;
  }

  public RoleCompositeExpression getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(RoleCompositeExpression roleComposite) {
    this.roleComposite = roleComposite;
  }

  public RolePermissionExpression getRolePermission() {
    return this.rolePermission;
  }

  public void setRolePermission(RolePermissionExpression rolePermission) {
    this.rolePermission = rolePermission;
  }

  public Boolean getNot() {
    return this.not;
  }

  public void setNot(Boolean not) {
    this.not = not;
  }

  public Conditional getCond() {
    return this.cond;
  }

  public void setCond(Conditional cond) {
    this.cond = cond;
  }

  public Collection<RoleExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<RoleExpression> exs) {
    this.exs = exs;
  }
}
