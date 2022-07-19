package io.graphoenix.graphence.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.graphence.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class MutationType implements Meta {
  private __Schema __schema;

  private __Type __type;

  private __TypeInterfaces __typeInterfaces;

  private __TypePossibleTypes __typePossibleTypes;

  private __Field __field;

  private __InputValue __inputValue;

  private __EnumValue __enumValue;

  private __Directive __directive;

  private __DirectiveLocations __directiveLocations;

  private User user;

  private UserRole userRole;

  private UserGroup userGroup;

  private Role role;

  private RoleComposite roleComposite;

  private Group group;

  private GroupRole groupRole;

  private Realm realm;

  private Permission permission;

  private Boolean isDeprecated;

  private Integer version;

  private String realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  public __Schema get__Schema() {
    return this.__schema;
  }

  public void set__Schema(__Schema __schema) {
    this.__schema = __schema;
  }

  public __Type get__Type() {
    return this.__type;
  }

  public void set__Type(__Type __type) {
    this.__type = __type;
  }

  public __TypeInterfaces get__TypeInterfaces() {
    return this.__typeInterfaces;
  }

  public void set__TypeInterfaces(__TypeInterfaces __typeInterfaces) {
    this.__typeInterfaces = __typeInterfaces;
  }

  public __TypePossibleTypes get__TypePossibleTypes() {
    return this.__typePossibleTypes;
  }

  public void set__TypePossibleTypes(__TypePossibleTypes __typePossibleTypes) {
    this.__typePossibleTypes = __typePossibleTypes;
  }

  public __Field get__Field() {
    return this.__field;
  }

  public void set__Field(__Field __field) {
    this.__field = __field;
  }

  public __InputValue get__InputValue() {
    return this.__inputValue;
  }

  public void set__InputValue(__InputValue __inputValue) {
    this.__inputValue = __inputValue;
  }

  public __EnumValue get__EnumValue() {
    return this.__enumValue;
  }

  public void set__EnumValue(__EnumValue __enumValue) {
    this.__enumValue = __enumValue;
  }

  public __Directive get__Directive() {
    return this.__directive;
  }

  public void set__Directive(__Directive __directive) {
    this.__directive = __directive;
  }

  public __DirectiveLocations get__DirectiveLocations() {
    return this.__directiveLocations;
  }

  public void set__DirectiveLocations(__DirectiveLocations __directiveLocations) {
    this.__directiveLocations = __directiveLocations;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserRole getUserRole() {
    return this.userRole;
  }

  public void setUserRole(UserRole userRole) {
    this.userRole = userRole;
  }

  public UserGroup getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(UserGroup userGroup) {
    this.userGroup = userGroup;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public RoleComposite getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(RoleComposite roleComposite) {
    this.roleComposite = roleComposite;
  }

  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public GroupRole getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(GroupRole groupRole) {
    this.groupRole = groupRole;
  }

  public Realm getRealm() {
    return this.realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
  }

  public Permission getPermission() {
    return this.permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
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
}
