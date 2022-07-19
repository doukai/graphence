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
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class QueryType implements Meta {
  private __Schema __schema;

  private Collection<__Schema> __schemaList;

  private __SchemaConnection __schemaConnection;

  private __Type __type;

  private Collection<__Type> __typeList;

  private __TypeConnection __typeConnection;

  private __TypeInterfaces __typeInterfaces;

  private Collection<__TypeInterfaces> __typeInterfacesList;

  private __TypeInterfacesConnection __typeInterfacesConnection;

  private __TypePossibleTypes __typePossibleTypes;

  private Collection<__TypePossibleTypes> __typePossibleTypesList;

  private __TypePossibleTypesConnection __typePossibleTypesConnection;

  private __Field __field;

  private Collection<__Field> __fieldList;

  private __FieldConnection __fieldConnection;

  private __InputValue __inputValue;

  private Collection<__InputValue> __inputValueList;

  private __InputValueConnection __inputValueConnection;

  private __EnumValue __enumValue;

  private Collection<__EnumValue> __enumValueList;

  private __EnumValueConnection __enumValueConnection;

  private __Directive __directive;

  private Collection<__Directive> __directiveList;

  private __DirectiveConnection __directiveConnection;

  private __DirectiveLocations __directiveLocations;

  private Collection<__DirectiveLocations> __directiveLocationsList;

  private __DirectiveLocationsConnection __directiveLocationsConnection;

  private User user;

  private Collection<User> userList;

  private UserConnection userConnection;

  private UserRole userRole;

  private Collection<UserRole> userRoleList;

  private UserRoleConnection userRoleConnection;

  private UserGroup userGroup;

  private Collection<UserGroup> userGroupList;

  private UserGroupConnection userGroupConnection;

  private Role role;

  private Collection<Role> roleList;

  private RoleConnection roleConnection;

  private RoleComposite roleComposite;

  private Collection<RoleComposite> roleCompositeList;

  private RoleCompositeConnection roleCompositeConnection;

  private Group group;

  private Collection<Group> groupList;

  private GroupConnection groupConnection;

  private GroupRole groupRole;

  private Collection<GroupRole> groupRoleList;

  private GroupRoleConnection groupRoleConnection;

  private Realm realm;

  private Collection<Realm> realmList;

  private RealmConnection realmConnection;

  private Permission permission;

  private Collection<Permission> permissionList;

  private PermissionConnection permissionConnection;

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

  public Collection<__Schema> get__SchemaList() {
    return this.__schemaList;
  }

  public void set__SchemaList(Collection<__Schema> __schemaList) {
    this.__schemaList = __schemaList;
  }

  public __SchemaConnection get__SchemaConnection() {
    return this.__schemaConnection;
  }

  public void set__SchemaConnection(__SchemaConnection __schemaConnection) {
    this.__schemaConnection = __schemaConnection;
  }

  public __Type get__Type() {
    return this.__type;
  }

  public void set__Type(__Type __type) {
    this.__type = __type;
  }

  public Collection<__Type> get__TypeList() {
    return this.__typeList;
  }

  public void set__TypeList(Collection<__Type> __typeList) {
    this.__typeList = __typeList;
  }

  public __TypeConnection get__TypeConnection() {
    return this.__typeConnection;
  }

  public void set__TypeConnection(__TypeConnection __typeConnection) {
    this.__typeConnection = __typeConnection;
  }

  public __TypeInterfaces get__TypeInterfaces() {
    return this.__typeInterfaces;
  }

  public void set__TypeInterfaces(__TypeInterfaces __typeInterfaces) {
    this.__typeInterfaces = __typeInterfaces;
  }

  public Collection<__TypeInterfaces> get__TypeInterfacesList() {
    return this.__typeInterfacesList;
  }

  public void set__TypeInterfacesList(Collection<__TypeInterfaces> __typeInterfacesList) {
    this.__typeInterfacesList = __typeInterfacesList;
  }

  public __TypeInterfacesConnection get__TypeInterfacesConnection() {
    return this.__typeInterfacesConnection;
  }

  public void set__TypeInterfacesConnection(__TypeInterfacesConnection __typeInterfacesConnection) {
    this.__typeInterfacesConnection = __typeInterfacesConnection;
  }

  public __TypePossibleTypes get__TypePossibleTypes() {
    return this.__typePossibleTypes;
  }

  public void set__TypePossibleTypes(__TypePossibleTypes __typePossibleTypes) {
    this.__typePossibleTypes = __typePossibleTypes;
  }

  public Collection<__TypePossibleTypes> get__TypePossibleTypesList() {
    return this.__typePossibleTypesList;
  }

  public void set__TypePossibleTypesList(Collection<__TypePossibleTypes> __typePossibleTypesList) {
    this.__typePossibleTypesList = __typePossibleTypesList;
  }

  public __TypePossibleTypesConnection get__TypePossibleTypesConnection() {
    return this.__typePossibleTypesConnection;
  }

  public void set__TypePossibleTypesConnection(
      __TypePossibleTypesConnection __typePossibleTypesConnection) {
    this.__typePossibleTypesConnection = __typePossibleTypesConnection;
  }

  public __Field get__Field() {
    return this.__field;
  }

  public void set__Field(__Field __field) {
    this.__field = __field;
  }

  public Collection<__Field> get__FieldList() {
    return this.__fieldList;
  }

  public void set__FieldList(Collection<__Field> __fieldList) {
    this.__fieldList = __fieldList;
  }

  public __FieldConnection get__FieldConnection() {
    return this.__fieldConnection;
  }

  public void set__FieldConnection(__FieldConnection __fieldConnection) {
    this.__fieldConnection = __fieldConnection;
  }

  public __InputValue get__InputValue() {
    return this.__inputValue;
  }

  public void set__InputValue(__InputValue __inputValue) {
    this.__inputValue = __inputValue;
  }

  public Collection<__InputValue> get__InputValueList() {
    return this.__inputValueList;
  }

  public void set__InputValueList(Collection<__InputValue> __inputValueList) {
    this.__inputValueList = __inputValueList;
  }

  public __InputValueConnection get__InputValueConnection() {
    return this.__inputValueConnection;
  }

  public void set__InputValueConnection(__InputValueConnection __inputValueConnection) {
    this.__inputValueConnection = __inputValueConnection;
  }

  public __EnumValue get__EnumValue() {
    return this.__enumValue;
  }

  public void set__EnumValue(__EnumValue __enumValue) {
    this.__enumValue = __enumValue;
  }

  public Collection<__EnumValue> get__EnumValueList() {
    return this.__enumValueList;
  }

  public void set__EnumValueList(Collection<__EnumValue> __enumValueList) {
    this.__enumValueList = __enumValueList;
  }

  public __EnumValueConnection get__EnumValueConnection() {
    return this.__enumValueConnection;
  }

  public void set__EnumValueConnection(__EnumValueConnection __enumValueConnection) {
    this.__enumValueConnection = __enumValueConnection;
  }

  public __Directive get__Directive() {
    return this.__directive;
  }

  public void set__Directive(__Directive __directive) {
    this.__directive = __directive;
  }

  public Collection<__Directive> get__DirectiveList() {
    return this.__directiveList;
  }

  public void set__DirectiveList(Collection<__Directive> __directiveList) {
    this.__directiveList = __directiveList;
  }

  public __DirectiveConnection get__DirectiveConnection() {
    return this.__directiveConnection;
  }

  public void set__DirectiveConnection(__DirectiveConnection __directiveConnection) {
    this.__directiveConnection = __directiveConnection;
  }

  public __DirectiveLocations get__DirectiveLocations() {
    return this.__directiveLocations;
  }

  public void set__DirectiveLocations(__DirectiveLocations __directiveLocations) {
    this.__directiveLocations = __directiveLocations;
  }

  public Collection<__DirectiveLocations> get__DirectiveLocationsList() {
    return this.__directiveLocationsList;
  }

  public void set__DirectiveLocationsList(
      Collection<__DirectiveLocations> __directiveLocationsList) {
    this.__directiveLocationsList = __directiveLocationsList;
  }

  public __DirectiveLocationsConnection get__DirectiveLocationsConnection() {
    return this.__directiveLocationsConnection;
  }

  public void set__DirectiveLocationsConnection(
      __DirectiveLocationsConnection __directiveLocationsConnection) {
    this.__directiveLocationsConnection = __directiveLocationsConnection;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Collection<User> getUserList() {
    return this.userList;
  }

  public void setUserList(Collection<User> userList) {
    this.userList = userList;
  }

  public UserConnection getUserConnection() {
    return this.userConnection;
  }

  public void setUserConnection(UserConnection userConnection) {
    this.userConnection = userConnection;
  }

  public UserRole getUserRole() {
    return this.userRole;
  }

  public void setUserRole(UserRole userRole) {
    this.userRole = userRole;
  }

  public Collection<UserRole> getUserRoleList() {
    return this.userRoleList;
  }

  public void setUserRoleList(Collection<UserRole> userRoleList) {
    this.userRoleList = userRoleList;
  }

  public UserRoleConnection getUserRoleConnection() {
    return this.userRoleConnection;
  }

  public void setUserRoleConnection(UserRoleConnection userRoleConnection) {
    this.userRoleConnection = userRoleConnection;
  }

  public UserGroup getUserGroup() {
    return this.userGroup;
  }

  public void setUserGroup(UserGroup userGroup) {
    this.userGroup = userGroup;
  }

  public Collection<UserGroup> getUserGroupList() {
    return this.userGroupList;
  }

  public void setUserGroupList(Collection<UserGroup> userGroupList) {
    this.userGroupList = userGroupList;
  }

  public UserGroupConnection getUserGroupConnection() {
    return this.userGroupConnection;
  }

  public void setUserGroupConnection(UserGroupConnection userGroupConnection) {
    this.userGroupConnection = userGroupConnection;
  }

  public Role getRole() {
    return this.role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Collection<Role> getRoleList() {
    return this.roleList;
  }

  public void setRoleList(Collection<Role> roleList) {
    this.roleList = roleList;
  }

  public RoleConnection getRoleConnection() {
    return this.roleConnection;
  }

  public void setRoleConnection(RoleConnection roleConnection) {
    this.roleConnection = roleConnection;
  }

  public RoleComposite getRoleComposite() {
    return this.roleComposite;
  }

  public void setRoleComposite(RoleComposite roleComposite) {
    this.roleComposite = roleComposite;
  }

  public Collection<RoleComposite> getRoleCompositeList() {
    return this.roleCompositeList;
  }

  public void setRoleCompositeList(Collection<RoleComposite> roleCompositeList) {
    this.roleCompositeList = roleCompositeList;
  }

  public RoleCompositeConnection getRoleCompositeConnection() {
    return this.roleCompositeConnection;
  }

  public void setRoleCompositeConnection(RoleCompositeConnection roleCompositeConnection) {
    this.roleCompositeConnection = roleCompositeConnection;
  }

  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Collection<Group> getGroupList() {
    return this.groupList;
  }

  public void setGroupList(Collection<Group> groupList) {
    this.groupList = groupList;
  }

  public GroupConnection getGroupConnection() {
    return this.groupConnection;
  }

  public void setGroupConnection(GroupConnection groupConnection) {
    this.groupConnection = groupConnection;
  }

  public GroupRole getGroupRole() {
    return this.groupRole;
  }

  public void setGroupRole(GroupRole groupRole) {
    this.groupRole = groupRole;
  }

  public Collection<GroupRole> getGroupRoleList() {
    return this.groupRoleList;
  }

  public void setGroupRoleList(Collection<GroupRole> groupRoleList) {
    this.groupRoleList = groupRoleList;
  }

  public GroupRoleConnection getGroupRoleConnection() {
    return this.groupRoleConnection;
  }

  public void setGroupRoleConnection(GroupRoleConnection groupRoleConnection) {
    this.groupRoleConnection = groupRoleConnection;
  }

  public Realm getRealm() {
    return this.realm;
  }

  public void setRealm(Realm realm) {
    this.realm = realm;
  }

  public Collection<Realm> getRealmList() {
    return this.realmList;
  }

  public void setRealmList(Collection<Realm> realmList) {
    this.realmList = realmList;
  }

  public RealmConnection getRealmConnection() {
    return this.realmConnection;
  }

  public void setRealmConnection(RealmConnection realmConnection) {
    this.realmConnection = realmConnection;
  }

  public Permission getPermission() {
    return this.permission;
  }

  public void setPermission(Permission permission) {
    this.permission = permission;
  }

  public Collection<Permission> getPermissionList() {
    return this.permissionList;
  }

  public void setPermissionList(Collection<Permission> permissionList) {
    this.permissionList = permissionList;
  }

  public PermissionConnection getPermissionConnection() {
    return this.permissionConnection;
  }

  public void setPermissionConnection(PermissionConnection permissionConnection) {
    this.permissionConnection = permissionConnection;
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
