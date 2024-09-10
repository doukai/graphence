package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Sort;
import io.graphoenix.file.dto.inputObjectType.FileOrderBy;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class UserOrderBy {
  private Sort id;

  private Sort name;

  private Sort description;

  private Sort lastName;

  private Sort login;

  private Sort salt;

  private Sort hash;

  private Sort email;

  private FileOrderBy files;

  private Sort phones;

  private Sort disable;

  private GroupOrderBy groups;

  private RoleOrderBy roles;

  private RealmOrderBy realm;

  private Sort isDeprecated;

  private Sort version;

  private Sort realmId;

  private Sort createUserId;

  private Sort createTime;

  private Sort updateUserId;

  private Sort updateTime;

  private Sort createGroupId;

  private Sort __typename;

  private FileUserRelationOrderBy fileUserRelation;

  private UserPhonesRelationOrderBy userPhonesRelation;

  private GroupUserRelationOrderBy groupUserRelation;

  private RoleUserRelationOrderBy roleUserRelation;

  private Sort idCount;

  private Sort idMax;

  private Sort idMin;

  private Sort nameCount;

  private Sort nameMax;

  private Sort nameMin;

  private Sort descriptionCount;

  private Sort descriptionMax;

  private Sort descriptionMin;

  private Sort lastNameCount;

  private Sort lastNameMax;

  private Sort lastNameMin;

  private Sort loginCount;

  private Sort loginMax;

  private Sort loginMin;

  private Sort saltCount;

  private Sort saltMax;

  private Sort saltMin;

  private Sort hashCount;

  private Sort hashMax;

  private Sort hashMin;

  private Sort emailCount;

  private Sort emailMax;

  private Sort emailMin;

  public Sort getId() {
    return this.id;
  }

  public void setId(Sort id) {
    this.id = id;
  }

  public Sort getName() {
    return this.name;
  }

  public void setName(Sort name) {
    this.name = name;
  }

  public Sort getDescription() {
    return this.description;
  }

  public void setDescription(Sort description) {
    this.description = description;
  }

  public Sort getLastName() {
    return this.lastName;
  }

  public void setLastName(Sort lastName) {
    this.lastName = lastName;
  }

  public Sort getLogin() {
    return this.login;
  }

  public void setLogin(Sort login) {
    this.login = login;
  }

  public Sort getSalt() {
    return this.salt;
  }

  public void setSalt(Sort salt) {
    this.salt = salt;
  }

  public Sort getHash() {
    return this.hash;
  }

  public void setHash(Sort hash) {
    this.hash = hash;
  }

  public Sort getEmail() {
    return this.email;
  }

  public void setEmail(Sort email) {
    this.email = email;
  }

  public FileOrderBy getFiles() {
    return this.files;
  }

  public void setFiles(FileOrderBy files) {
    this.files = files;
  }

  public Sort getPhones() {
    return this.phones;
  }

  public void setPhones(Sort phones) {
    this.phones = phones;
  }

  public Sort getDisable() {
    return this.disable;
  }

  public void setDisable(Sort disable) {
    this.disable = disable;
  }

  public GroupOrderBy getGroups() {
    return this.groups;
  }

  public void setGroups(GroupOrderBy groups) {
    this.groups = groups;
  }

  public RoleOrderBy getRoles() {
    return this.roles;
  }

  public void setRoles(RoleOrderBy roles) {
    this.roles = roles;
  }

  public RealmOrderBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmOrderBy realm) {
    this.realm = realm;
  }

  public Sort getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Sort isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Sort getVersion() {
    return this.version;
  }

  public void setVersion(Sort version) {
    this.version = version;
  }

  public Sort getRealmId() {
    return this.realmId;
  }

  public void setRealmId(Sort realmId) {
    this.realmId = realmId;
  }

  public Sort getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Sort createUserId) {
    this.createUserId = createUserId;
  }

  public Sort getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Sort createTime) {
    this.createTime = createTime;
  }

  public Sort getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(Sort updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Sort getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Sort updateTime) {
    this.updateTime = updateTime;
  }

  public Sort getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(Sort createGroupId) {
    this.createGroupId = createGroupId;
  }

  public Sort get__typename() {
    return this.__typename;
  }

  public void set__typename(Sort __typename) {
    this.__typename = __typename;
  }

  public FileUserRelationOrderBy getFileUserRelation() {
    return this.fileUserRelation;
  }

  public void setFileUserRelation(FileUserRelationOrderBy fileUserRelation) {
    this.fileUserRelation = fileUserRelation;
  }

  public UserPhonesRelationOrderBy getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  public void setUserPhonesRelation(UserPhonesRelationOrderBy userPhonesRelation) {
    this.userPhonesRelation = userPhonesRelation;
  }

  public GroupUserRelationOrderBy getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelationOrderBy groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public RoleUserRelationOrderBy getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(RoleUserRelationOrderBy roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public Sort getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Sort idCount) {
    this.idCount = idCount;
  }

  public Sort getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Sort idMax) {
    this.idMax = idMax;
  }

  public Sort getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Sort idMin) {
    this.idMin = idMin;
  }

  public Sort getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Sort nameCount) {
    this.nameCount = nameCount;
  }

  public Sort getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(Sort nameMax) {
    this.nameMax = nameMax;
  }

  public Sort getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(Sort nameMin) {
    this.nameMin = nameMin;
  }

  public Sort getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Sort descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public Sort getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(Sort descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public Sort getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(Sort descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Sort getLastNameCount() {
    return this.lastNameCount;
  }

  public void setLastNameCount(Sort lastNameCount) {
    this.lastNameCount = lastNameCount;
  }

  public Sort getLastNameMax() {
    return this.lastNameMax;
  }

  public void setLastNameMax(Sort lastNameMax) {
    this.lastNameMax = lastNameMax;
  }

  public Sort getLastNameMin() {
    return this.lastNameMin;
  }

  public void setLastNameMin(Sort lastNameMin) {
    this.lastNameMin = lastNameMin;
  }

  public Sort getLoginCount() {
    return this.loginCount;
  }

  public void setLoginCount(Sort loginCount) {
    this.loginCount = loginCount;
  }

  public Sort getLoginMax() {
    return this.loginMax;
  }

  public void setLoginMax(Sort loginMax) {
    this.loginMax = loginMax;
  }

  public Sort getLoginMin() {
    return this.loginMin;
  }

  public void setLoginMin(Sort loginMin) {
    this.loginMin = loginMin;
  }

  public Sort getSaltCount() {
    return this.saltCount;
  }

  public void setSaltCount(Sort saltCount) {
    this.saltCount = saltCount;
  }

  public Sort getSaltMax() {
    return this.saltMax;
  }

  public void setSaltMax(Sort saltMax) {
    this.saltMax = saltMax;
  }

  public Sort getSaltMin() {
    return this.saltMin;
  }

  public void setSaltMin(Sort saltMin) {
    this.saltMin = saltMin;
  }

  public Sort getHashCount() {
    return this.hashCount;
  }

  public void setHashCount(Sort hashCount) {
    this.hashCount = hashCount;
  }

  public Sort getHashMax() {
    return this.hashMax;
  }

  public void setHashMax(Sort hashMax) {
    this.hashMax = hashMax;
  }

  public Sort getHashMin() {
    return this.hashMin;
  }

  public void setHashMin(Sort hashMin) {
    this.hashMin = hashMin;
  }

  public Sort getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Sort emailCount) {
    this.emailCount = emailCount;
  }

  public Sort getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(Sort emailMax) {
    this.emailMax = emailMax;
  }

  public Sort getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(Sort emailMin) {
    this.emailMin = emailMin;
  }
}
