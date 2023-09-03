package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.MenuType;
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
public class Menu implements Meta {
  @Id
  @NonNull
  private String href;

  private String description;

  @NonNull
  private MenuType type;

  private String path;

  private String icon;

  private Menu parent;

  private Collection<Role> role;

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

  private Integer hrefCount;

  private String hrefMax;

  private String hrefMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer pathCount;

  private String pathMax;

  private String pathMin;

  private Integer iconCount;

  private String iconMax;

  private String iconMin;

  private Role roleAggregate;

  private RoleConnection roleConnection;

  private String parentHref;

  private Integer parentHrefCount;

  private String parentHrefMax;

  private String parentHrefMin;

  private Integer realmIdCount;

  private Integer realmIdSum;

  private Integer realmIdAvg;

  private Integer realmIdMax;

  private Integer realmIdMin;

  private Collection<RoleMenu> roleMenu;

  private RoleMenu roleMenuAggregate;

  private RoleMenuConnection roleMenuConnection;

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

  public Menu getParent() {
    return this.parent;
  }

  public void setParent(Menu parent) {
    this.parent = parent;
  }

  public Collection<Role> getRole() {
    return this.role;
  }

  public void setRole(Collection<Role> role) {
    this.role = role;
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

  public Integer getHrefCount() {
    return this.hrefCount;
  }

  public void setHrefCount(Integer hrefCount) {
    this.hrefCount = hrefCount;
  }

  public String getHrefMax() {
    return this.hrefMax;
  }

  public void setHrefMax(String hrefMax) {
    this.hrefMax = hrefMax;
  }

  public String getHrefMin() {
    return this.hrefMin;
  }

  public void setHrefMin(String hrefMin) {
    this.hrefMin = hrefMin;
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

  public Integer getIconCount() {
    return this.iconCount;
  }

  public void setIconCount(Integer iconCount) {
    this.iconCount = iconCount;
  }

  public String getIconMax() {
    return this.iconMax;
  }

  public void setIconMax(String iconMax) {
    this.iconMax = iconMax;
  }

  public String getIconMin() {
    return this.iconMin;
  }

  public void setIconMin(String iconMin) {
    this.iconMin = iconMin;
  }

  public Role getRoleAggregate() {
    return this.roleAggregate;
  }

  public void setRoleAggregate(Role roleAggregate) {
    this.roleAggregate = roleAggregate;
  }

  public RoleConnection getRoleConnection() {
    return this.roleConnection;
  }

  public void setRoleConnection(RoleConnection roleConnection) {
    this.roleConnection = roleConnection;
  }

  public String getParentHref() {
    return this.parentHref;
  }

  public void setParentHref(String parentHref) {
    this.parentHref = parentHref;
  }

  public Integer getParentHrefCount() {
    return this.parentHrefCount;
  }

  public void setParentHrefCount(Integer parentHrefCount) {
    this.parentHrefCount = parentHrefCount;
  }

  public String getParentHrefMax() {
    return this.parentHrefMax;
  }

  public void setParentHrefMax(String parentHrefMax) {
    this.parentHrefMax = parentHrefMax;
  }

  public String getParentHrefMin() {
    return this.parentHrefMin;
  }

  public void setParentHrefMin(String parentHrefMin) {
    this.parentHrefMin = parentHrefMin;
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

  public Collection<RoleMenu> getRoleMenu() {
    return this.roleMenu;
  }

  public void setRoleMenu(Collection<RoleMenu> roleMenu) {
    this.roleMenu = roleMenu;
  }

  public RoleMenu getRoleMenuAggregate() {
    return this.roleMenuAggregate;
  }

  public void setRoleMenuAggregate(RoleMenu roleMenuAggregate) {
    this.roleMenuAggregate = roleMenuAggregate;
  }

  public RoleMenuConnection getRoleMenuConnection() {
    return this.roleMenuConnection;
  }

  public void setRoleMenuConnection(RoleMenuConnection roleMenuConnection) {
    this.roleMenuConnection = roleMenuConnection;
  }
}
