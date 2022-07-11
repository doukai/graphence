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
public class __DirectiveExpression {
  private StringExpression description;

  private __InputValueExpression args;

  private BooleanExpression onOperation;

  private __InputValueExpression args;

  private BooleanExpression onFragment;

  private IntExpression schemaId;

  private __DirectiveLocationExpression locations;

  private BooleanExpression onField;

  private BooleanExpression onOperation;

  private __DirectiveLocationExpression locations;

  private IntExpression schemaId;

  private StringExpression description;

  private StringExpression name;

  private BooleanExpression onFragment;

  private BooleanExpression onField;

  private StringExpression name;

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

  private Collection<__DirectiveExpression> exs;

  public StringExpression getDescription() {
    return this.description;
  }

  public void setDescription(StringExpression description) {
    this.description = description;
  }

  public __InputValueExpression getArgs() {
    return this.args;
  }

  public void setArgs(__InputValueExpression args) {
    this.args = args;
  }

  public BooleanExpression getOnOperation() {
    return this.onOperation;
  }

  public void setOnOperation(BooleanExpression onOperation) {
    this.onOperation = onOperation;
  }

  public __InputValueExpression getArgs() {
    return this.args;
  }

  public void setArgs(__InputValueExpression args) {
    this.args = args;
  }

  public BooleanExpression getOnFragment() {
    return this.onFragment;
  }

  public void setOnFragment(BooleanExpression onFragment) {
    this.onFragment = onFragment;
  }

  public IntExpression getSchemaId() {
    return this.schemaId;
  }

  public void setSchemaId(IntExpression schemaId) {
    this.schemaId = schemaId;
  }

  public __DirectiveLocationExpression getLocations() {
    return this.locations;
  }

  public void setLocations(__DirectiveLocationExpression locations) {
    this.locations = locations;
  }

  public BooleanExpression getOnField() {
    return this.onField;
  }

  public void setOnField(BooleanExpression onField) {
    this.onField = onField;
  }

  public BooleanExpression getOnOperation() {
    return this.onOperation;
  }

  public void setOnOperation(BooleanExpression onOperation) {
    this.onOperation = onOperation;
  }

  public __DirectiveLocationExpression getLocations() {
    return this.locations;
  }

  public void setLocations(__DirectiveLocationExpression locations) {
    this.locations = locations;
  }

  public IntExpression getSchemaId() {
    return this.schemaId;
  }

  public void setSchemaId(IntExpression schemaId) {
    this.schemaId = schemaId;
  }

  public StringExpression getDescription() {
    return this.description;
  }

  public void setDescription(StringExpression description) {
    this.description = description;
  }

  public StringExpression getName() {
    return this.name;
  }

  public void setName(StringExpression name) {
    this.name = name;
  }

  public BooleanExpression getOnFragment() {
    return this.onFragment;
  }

  public void setOnFragment(BooleanExpression onFragment) {
    this.onFragment = onFragment;
  }

  public BooleanExpression getOnField() {
    return this.onField;
  }

  public void setOnField(BooleanExpression onField) {
    this.onField = onField;
  }

  public StringExpression getName() {
    return this.name;
  }

  public void setName(StringExpression name) {
    this.name = name;
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

  public Collection<__DirectiveExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<__DirectiveExpression> exs) {
    this.exs = exs;
  }
}
