package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.structure.dto.inputObjectType.NamedStructExpression;
import io.graphoenix.structure.dto.inputObjectType.TreeStructExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Override;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class GroupExpression implements TreeStructExpression, NamedStructExpression, MetaExpression {
  private StringExpression id;

  private StringExpression name;

  private StringExpression description;

  private StringExpression path;

  private IntExpression deep;

  private StringExpression parentId;

  private GroupExpression parent;

  private GroupExpression subGroups;

  private UserExpression users;

  private RoleExpression roles;

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

  private GroupUserRelationExpression groupUserRelation;

  private GroupRoleRelationExpression groupRoleRelation;

  @DefaultValue("false")
  private Boolean not;

  @DefaultValue("AND")
  private Conditional cond;

  private Collection<GroupExpression> exs;

  public StringExpression getId() {
    return this.id;
  }

  public void setId(StringExpression id) {
    this.id = id;
  }

  @Override
  public StringExpression getName() {
    return this.name;
  }

  @Override
  public void setName(StringExpression name) {
    this.name = (StringExpression)name;
  }

  @Override
  public StringExpression getDescription() {
    return this.description;
  }

  @Override
  public void setDescription(StringExpression description) {
    this.description = (StringExpression)description;
  }

  @Override
  public StringExpression getPath() {
    return this.path;
  }

  @Override
  public void setPath(StringExpression path) {
    this.path = (StringExpression)path;
  }

  @Override
  public IntExpression getDeep() {
    return this.deep;
  }

  @Override
  public void setDeep(IntExpression deep) {
    this.deep = (IntExpression)deep;
  }

  @Override
  public StringExpression getParentId() {
    return this.parentId;
  }

  @Override
  public void setParentId(StringExpression parentId) {
    this.parentId = (StringExpression)parentId;
  }

  public GroupExpression getParent() {
    return this.parent;
  }

  public void setParent(GroupExpression parent) {
    this.parent = parent;
  }

  public GroupExpression getSubGroups() {
    return this.subGroups;
  }

  public void setSubGroups(GroupExpression subGroups) {
    this.subGroups = subGroups;
  }

  public UserExpression getUsers() {
    return this.users;
  }

  public void setUsers(UserExpression users) {
    this.users = users;
  }

  public RoleExpression getRoles() {
    return this.roles;
  }

  public void setRoles(RoleExpression roles) {
    this.roles = roles;
  }

  public RealmExpression getRealm() {
    return this.realm;
  }

  public void setRealm(RealmExpression realm) {
    this.realm = realm;
  }

  @Override
  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  @Override
  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = (Boolean)includeDeprecated;
  }

  @Override
  public IntExpression getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(IntExpression version) {
    this.version = (IntExpression)version;
  }

  @Override
  public IntExpression getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(IntExpression realmId) {
    this.realmId = (IntExpression)realmId;
  }

  @Override
  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = (StringExpression)createUserId;
  }

  @Override
  public StringExpression getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(StringExpression createTime) {
    this.createTime = (StringExpression)createTime;
  }

  @Override
  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = (StringExpression)updateUserId;
  }

  @Override
  public StringExpression getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(StringExpression updateTime) {
    this.updateTime = (StringExpression)updateTime;
  }

  @Override
  public StringExpression getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(StringExpression createGroupId) {
    this.createGroupId = (StringExpression)createGroupId;
  }

  public StringExpression get__typename() {
    return this.__typename;
  }

  public void set__typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public GroupUserRelationExpression getGroupUserRelation() {
    return this.groupUserRelation;
  }

  public void setGroupUserRelation(GroupUserRelationExpression groupUserRelation) {
    this.groupUserRelation = groupUserRelation;
  }

  public GroupRoleRelationExpression getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  public void setGroupRoleRelation(GroupRoleRelationExpression groupRoleRelation) {
    this.groupRoleRelation = groupRoleRelation;
  }

  @Override
  public Boolean getNot() {
    return this.not;
  }

  @Override
  public void setNot(Boolean not) {
    this.not = (Boolean)not;
  }

  @Override
  public Conditional getCond() {
    return this.cond;
  }

  @Override
  public void setCond(Conditional cond) {
    this.cond = (Conditional)cond;
  }

  public Collection<GroupExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<GroupExpression> exs) {
    this.exs = exs;
  }
}
