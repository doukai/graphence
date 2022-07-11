package null.dto.inputObjectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;
import org.eclipse.microprofile.graphql.NonNull;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class GroupInput {
  private String id;

  @NonNull
  private String name;

  private Integer parentId;

  private GroupInput parent;

  private Collection<GroupInput> subGroups;

  private Collection<UserInput> users;

  private Collection<RoleInput> roles;

  private RealmInput realm;

  private String createUserId;

  private String createUserId;

  private String updateUserId;

  private LocalDateTime createTime;

  private Boolean isDeprecated;

  private Boolean isDeprecated;

  private LocalDateTime updateTime;

  private String realmId;

  private String realmId;

  private String updateUserId;

  private Integer version;

  private String createGroupId;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;

  private String createGroupId;

  private Integer version;

  @DefaultValue("\"Group\"")
  @NonNull
  private String __typename;

  @DefaultValue("\"Group\"")
  @NonNull
  private String __typename;

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

  public Integer getParentId() {
    return this.parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public GroupInput getParent() {
    return this.parent;
  }

  public void setParent(GroupInput parent) {
    this.parent = parent;
  }

  public Collection<GroupInput> getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(Collection<GroupInput> subGroups) {
    this.subGroups = subGroups;
  }

  public Collection<UserInput> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<UserInput> users) {
    this.users = users;
  }

  public Collection<RoleInput> getRoles() {
    return this.roles;
  }

  public void setRoles(Collection<RoleInput> roles) {
    this.roles = roles;
  }

  public RealmInput getRealm() {
    return this.realm;
  }

  public void setRealm(RealmInput realm) {
    this.realm = realm;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getRealmId() {
    return this.realmId;
  }

  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  public String getRealmId() {
    return this.realmId;
  }

  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
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

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }
}
