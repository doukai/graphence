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
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class Menu implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  @NonNull
  private MenuType type;

  private String path;

  private String icon;

  private Menu folder;

  private String description;

  private Role role;

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

  private Integer pathCount;

  private String pathMax;

  private String pathMin;

  private Integer iconCount;

  private String iconMax;

  private String iconMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer parentId;

  private Integer parentIdCount;

  private Integer parentIdSum;

  private Integer parentIdAvg;

  private Integer parentIdMax;

  private Integer parentIdMin;

  private Integer roleId;

  private Integer roleIdCount;

  private Integer roleIdSum;

  private Integer roleIdAvg;

  private Integer roleIdMax;

  private Integer roleIdMin;

  private Integer realmIdCount;

  private Integer realmIdSum;

  private Integer realmIdAvg;

  private Integer realmIdMax;

  private Integer realmIdMin;

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

  public Menu getFolder() {
    return this.folder;
  }

  public void setFolder(Menu folder) {
    this.folder = folder;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
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

  public Integer getRoleId() {
    return this.roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public Integer getRoleIdCount() {
    return this.roleIdCount;
  }

  public void setRoleIdCount(Integer roleIdCount) {
    this.roleIdCount = roleIdCount;
  }

  public Integer getRoleIdSum() {
    return this.roleIdSum;
  }

  public void setRoleIdSum(Integer roleIdSum) {
    this.roleIdSum = roleIdSum;
  }

  public Integer getRoleIdAvg() {
    return this.roleIdAvg;
  }

  public void setRoleIdAvg(Integer roleIdAvg) {
    this.roleIdAvg = roleIdAvg;
  }

  public Integer getRoleIdMax() {
    return this.roleIdMax;
  }

  public void setRoleIdMax(Integer roleIdMax) {
    this.roleIdMax = roleIdMax;
  }

  public Integer getRoleIdMin() {
    return this.roleIdMin;
  }

  public void setRoleIdMin(Integer roleIdMin) {
    this.roleIdMin = roleIdMin;
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
}
