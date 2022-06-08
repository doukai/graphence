package io.graphoenix.graphence.dto.objectType;

import io.graphoenix.graphence.dto.interfaceType.Meta;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class Role implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private Collection<User> users;

  private Collection<Permission> permissions;

  private Collection<Role> parents;

  private Integer version;

  private Boolean isDeprecated;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private User usersAggregate;

  private Permission permissionsAggregate;

  private Role parentsAggregate;

  private UserConnection usersConnection;

  private PermissionConnection permissionsConnection;

  private RoleConnection parentsConnection;

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

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
  }

  public Collection<Permission> getPermissions() {
    return this.permissions;
  }

  public void setPermissions(Collection<Permission> permissions) {
    this.permissions = permissions;
  }

  public Collection<Role> getParents() {
    return this.parents;
  }

  public void setParents(Collection<Role> parents) {
    this.parents = parents;
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
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public String getIdMax() {
    return this.idMax;
  }

  public void setIdMax(String idMax) {
    this.idMax = idMax;
  }

  public String getIdMin() {
    return this.idMin;
  }

  public void setIdMin(String idMin) {
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

  public User getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(User usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public Permission getPermissionsAggregate() {
    return this.permissionsAggregate;
  }

  public void setPermissionsAggregate(Permission permissionsAggregate) {
    this.permissionsAggregate = permissionsAggregate;
  }

  public Role getParentsAggregate() {
    return this.parentsAggregate;
  }

  public void setParentsAggregate(Role parentsAggregate) {
    this.parentsAggregate = parentsAggregate;
  }

  public UserConnection getUsersConnection() {
    return this.usersConnection;
  }

  public void setUsersConnection(UserConnection usersConnection) {
    this.usersConnection = usersConnection;
  }

  public PermissionConnection getPermissionsConnection() {
    return this.permissionsConnection;
  }

  public void setPermissionsConnection(PermissionConnection permissionsConnection) {
    this.permissionsConnection = permissionsConnection;
  }

  public RoleConnection getParentsConnection() {
    return this.parentsConnection;
  }

  public void setParentsConnection(RoleConnection parentsConnection) {
    this.parentsConnection = parentsConnection;
  }
}
