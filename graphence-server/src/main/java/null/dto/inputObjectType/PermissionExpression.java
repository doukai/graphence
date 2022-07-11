package null.dto.inputObjectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import null.dto.enumType.Conditional;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class PermissionExpression {
  private StringExpression id;

  private StringExpression roleId;

  private RoleExpression role;

  private StringExpression fieldId;

  private __FieldExpression field;

  private PermissionLevelExpression level;

  private RealmExpression realm;

  private StringExpression createUserId;

  private StringExpression createUserId;

  private StringExpression updateUserId;

  private StringExpression createTime;

  @DefaultValue("false")
  private Boolean includeDeprecated;

  @DefaultValue("false")
  private Boolean includeDeprecated;

  private StringExpression updateTime;

  private StringExpression realmId;

  private StringExpression realmId;

  private StringExpression updateUserId;

  private IntExpression version;

  private StringExpression createGroupId;

  private StringExpression createTime;

  private StringExpression updateTime;

  private StringExpression createGroupId;

  private IntExpression version;

  private StringExpression __typename;

  private StringExpression __typename;

  @DefaultValue("AND")
  private Conditional cond;

  private Collection<PermissionExpression> exs;

  public StringExpression getId() {
    return this.id;
  }

  public void setId(StringExpression id) {
    this.id = id;
  }

  public StringExpression getRoleId() {
    return this.roleId;
  }

  public void setRoleId(StringExpression roleId) {
    this.roleId = roleId;
  }

  public RoleExpression getRole() {
    return this.role;
  }

  public void setRole(RoleExpression role) {
    this.role = role;
  }

  public StringExpression getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(StringExpression fieldId) {
    this.fieldId = fieldId;
  }

  public __FieldExpression getField() {
    return this.field;
  }

  public void setField(__FieldExpression field) {
    this.field = field;
  }

  public PermissionLevelExpression getLevel() {
    return this.level;
  }

  public void setLevel(PermissionLevelExpression level) {
    this.level = level;
  }

  public RealmExpression getRealm() {
    return this.realm;
  }

  public void setRealm(RealmExpression realm) {
    this.realm = realm;
  }

  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = createUserId;
  }

  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = createUserId;
  }

  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = updateUserId;
  }

  public StringExpression getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(StringExpression createTime) {
    this.createTime = createTime;
  }

  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = includeDeprecated;
  }

  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = includeDeprecated;
  }

  public StringExpression getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(StringExpression updateTime) {
    this.updateTime = updateTime;
  }

  public StringExpression getRealmId() {
    return this.realmId;
  }

  public void setRealmId(StringExpression realmId) {
    this.realmId = realmId;
  }

  public StringExpression getRealmId() {
    return this.realmId;
  }

  public void setRealmId(StringExpression realmId) {
    this.realmId = realmId;
  }

  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = updateUserId;
  }

  public IntExpression getVersion() {
    return this.version;
  }

  public void setVersion(IntExpression version) {
    this.version = version;
  }

  public StringExpression getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(StringExpression createGroupId) {
    this.createGroupId = createGroupId;
  }

  public StringExpression getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(StringExpression createTime) {
    this.createTime = createTime;
  }

  public StringExpression getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(StringExpression updateTime) {
    this.updateTime = updateTime;
  }

  public StringExpression getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(StringExpression createGroupId) {
    this.createGroupId = createGroupId;
  }

  public IntExpression getVersion() {
    return this.version;
  }

  public void setVersion(IntExpression version) {
    this.version = version;
  }

  public StringExpression get__Typename() {
    return this.__typename;
  }

  public void set__Typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public StringExpression get__Typename() {
    return this.__typename;
  }

  public void set__Typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public Conditional getCond() {
    return this.cond;
  }

  public void setCond(Conditional cond) {
    this.cond = cond;
  }

  public Collection<PermissionExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<PermissionExpression> exs) {
    this.exs = exs;
  }
}
