package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.MenuType;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class MenuListMutationTypeArguments implements MetaInput {
  private String href;

  private String description;

  private MenuType type;

  private String path;

  private String icon;

  private MenuInput parent;

  private Collection<RoleInput> role;

  private RealmInput realm;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"Menu\"")
  private String __typename;

  private String parentHref;

  private Collection<RoleMenuInput> roleMenu;

  private Collection<MenuInput> list;

  private MenuExpression where;

  public String getHref() {
    return this.href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MenuType getType() {
    return this.type;
  }

  public void setType(MenuType type) {
    this.type = type;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getIcon() {
    return this.icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public MenuInput getParent() {
    return this.parent;
  }

  public void setParent(MenuInput parent) {
    this.parent = parent;
  }

  public Collection<RoleInput> getRole() {
    return this.role;
  }

  public void setRole(Collection<RoleInput> role) {
    this.role = role;
  }

  public RealmInput getRealm() {
    return this.realm;
  }

  public void setRealm(RealmInput realm) {
    this.realm = realm;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Integer realmId) {
    this.realmId = realmId;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public String getParentHref() {
    return this.parentHref;
  }

  public void setParentHref(String parentHref) {
    this.parentHref = parentHref;
  }

  public Collection<RoleMenuInput> getRoleMenu() {
    return this.roleMenu;
  }

  public void setRoleMenu(Collection<RoleMenuInput> roleMenu) {
    this.roleMenu = roleMenu;
  }

  public Collection<MenuInput> getList() {
    return this.list;
  }

  public void setList(Collection<MenuInput> list) {
    this.list = list;
  }

  public MenuExpression getWhere() {
    return this.where;
  }

  public void setWhere(MenuExpression where) {
    this.where = where;
  }
}
