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
public class Organization implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private Integer aboveId;

  private Organization above;

  private Collection<User> users;

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

  private Integer aboveIdCount;

  private Integer aboveIdSum;

  private Integer aboveIdAvg;

  private Integer aboveIdMax;

  private Integer aboveIdMin;

  private User usersAggregate;

  private UserConnection usersConnection;

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

  public Integer getAboveId() {
    return this.aboveId;
  }

  public void setAboveId(Integer aboveId) {
    this.aboveId = aboveId;
  }

  public Organization getAbove() {
    return this.above;
  }

  public void setAbove(Organization above) {
    this.above = above;
  }

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
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

  public Integer getAboveIdCount() {
    return this.aboveIdCount;
  }

  public void setAboveIdCount(Integer aboveIdCount) {
    this.aboveIdCount = aboveIdCount;
  }

  public Integer getAboveIdSum() {
    return this.aboveIdSum;
  }

  public void setAboveIdSum(Integer aboveIdSum) {
    this.aboveIdSum = aboveIdSum;
  }

  public Integer getAboveIdAvg() {
    return this.aboveIdAvg;
  }

  public void setAboveIdAvg(Integer aboveIdAvg) {
    this.aboveIdAvg = aboveIdAvg;
  }

  public Integer getAboveIdMax() {
    return this.aboveIdMax;
  }

  public void setAboveIdMax(Integer aboveIdMax) {
    this.aboveIdMax = aboveIdMax;
  }

  public Integer getAboveIdMin() {
    return this.aboveIdMin;
  }

  public void setAboveIdMin(Integer aboveIdMin) {
    this.aboveIdMin = aboveIdMin;
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
}
