package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class RoleExpression {
  private StringExpression id;

  private StringExpression name;

  private StringExpression description;

  private UserExpression users;

  private RoleExpression composites;

  private PermissionExpression permissions;

  private ApiExpression apis;

  private MenuExpression menus;

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

  private RoleCompositeExpression roleComposite;

  private RoleApiExpression roleApi;

  private RoleMenuExpression roleMenu;

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

  public ApiExpression getApis() {
    return this.apis;
  }

  public void setApis(ApiExpression apis) {
    this.apis = apis;
  }

  public MenuExpression getMenus() {
    return this.menus;
  }

  public void setMenus(MenuExpression menus) {
    this.menus = menus;
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

  public RoleCompositeExpression getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(RoleCompositeExpression roleComposite) {
    this.roleComposite = roleComposite;
  }

  public RoleApiExpression getRoleApi() {
    return this.roleApi;
  }

  public void setRoleApi(RoleApiExpression roleApi) {
    this.roleApi = roleApi;
  }

  public RoleMenuExpression getRoleMenu() {
    return this.roleMenu;
  }

  public void setRoleMenu(RoleMenuExpression roleMenu) {
    this.roleMenu = roleMenu;
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
