package io.graphoenix.graphence.dto.inputObjectType;

import io.graphoenix.graphence.dto.enumType.Conditional;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class __FieldExpression {
  private IDExpression id;

  private StringExpression name;

  private StringExpression typeName;

  private StringExpression ofTypeName;

  private StringExpression description;

  private __InputValueExpression args;

  private __TypeExpression type;

  private StringExpression deprecationReason;

  private StringExpression from;

  private StringExpression to;

  private StringExpression withType;

  private StringExpression withFrom;

  private StringExpression withTo;

  private IntExpression version;

  @DefaultValue("false")
  private Boolean includeDeprecated;

  private StringExpression __typename;

  @DefaultValue("AND")
  private Conditional cond;

  private Collection<__FieldExpression> exs;

  public IDExpression getId() {
    return this.id;
  }

  public void setId(IDExpression id) {
    this.id = id;
  }

  public StringExpression getName() {
    return this.name;
  }

  public void setName(StringExpression name) {
    this.name = name;
  }

  public StringExpression getTypeName() {
    return this.typeName;
  }

  public void setTypeName(StringExpression typeName) {
    this.typeName = typeName;
  }

  public StringExpression getOfTypeName() {
    return this.ofTypeName;
  }

  public void setOfTypeName(StringExpression ofTypeName) {
    this.ofTypeName = ofTypeName;
  }

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

  public __TypeExpression getType() {
    return this.type;
  }

  public void setType(__TypeExpression type) {
    this.type = type;
  }

  public StringExpression getDeprecationReason() {
    return this.deprecationReason;
  }

  public void setDeprecationReason(StringExpression deprecationReason) {
    this.deprecationReason = deprecationReason;
  }

  public StringExpression getFrom() {
    return this.from;
  }

  public void setFrom(StringExpression from) {
    this.from = from;
  }

  public StringExpression getTo() {
    return this.to;
  }

  public void setTo(StringExpression to) {
    this.to = to;
  }

  public StringExpression getWithType() {
    return this.withType;
  }

  public void setWithType(StringExpression withType) {
    this.withType = withType;
  }

  public StringExpression getWithFrom() {
    return this.withFrom;
  }

  public void setWithFrom(StringExpression withFrom) {
    this.withFrom = withFrom;
  }

  public StringExpression getWithTo() {
    return this.withTo;
  }

  public void setWithTo(StringExpression withTo) {
    this.withTo = withTo;
  }

  public IntExpression getVersion() {
    return this.version;
  }

  public void setVersion(IntExpression version) {
    this.version = version;
  }

  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = includeDeprecated;
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

  public Collection<__FieldExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<__FieldExpression> exs) {
    this.exs = exs;
  }
}
