package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class MenuConnectionQueryTypeArguments implements MetaExpression {
  private StringExpression href;

  private StringExpression description;

  private MenuTypeExpression type;

  private StringExpression path;

  private StringExpression icon;

  private MenuExpression parent;

  private RoleExpression role;

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

  private StringExpression parentHref;

  private RoleMenuExpression roleMenu;

  private MenuOrderBy orderBy;

  private Collection<String> groupBy;

  @DefaultValue("AND")
  private Conditional cond;

  private Collection<MenuExpression> exs;

  private Integer first;

  private Integer last;

  private Integer offset;

  private String after;

  private String before;

  public StringExpression getHref() {
    return this.href;
  }

  public void setHref(StringExpression href) {
    this.href = href;
  }

  public StringExpression getDescription() {
    return this.description;
  }

  public void setDescription(StringExpression description) {
    this.description = description;
  }

  public MenuTypeExpression getType() {
    return this.type;
  }

  public void setType(MenuTypeExpression type) {
    this.type = type;
  }

  public StringExpression getPath() {
    return this.path;
  }

  public void setPath(StringExpression path) {
    this.path = path;
  }

  public StringExpression getIcon() {
    return this.icon;
  }

  public void setIcon(StringExpression icon) {
    this.icon = icon;
  }

  public MenuExpression getParent() {
    return this.parent;
  }

  public void setParent(MenuExpression parent) {
    this.parent = parent;
  }

  public RoleExpression getRole() {
    return this.role;
  }

  public void setRole(RoleExpression role) {
    this.role = role;
  }

  public RealmExpression getRealm() {
    return this.realm;
  }

  public void setRealm(RealmExpression realm) {
    this.realm = realm;
  }

  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = includeDeprecated;
  }

  public IntExpression getVersion() {
    return this.version;
  }

  public void setVersion(IntExpression version) {
    this.version = version;
  }

  public IntExpression getRealmId() {
    return this.realmId;
  }

  public void setRealmId(IntExpression realmId) {
    this.realmId = realmId;
  }

  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = createUserId;
  }

  public StringExpression getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(StringExpression createTime) {
    this.createTime = createTime;
  }

  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = updateUserId;
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

  public StringExpression get__typename() {
    return this.__typename;
  }

  public void set__typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public StringExpression getParentHref() {
    return this.parentHref;
  }

  public void setParentHref(StringExpression parentHref) {
    this.parentHref = parentHref;
  }

  public RoleMenuExpression getRoleMenu() {
    return this.roleMenu;
  }

  public void setRoleMenu(RoleMenuExpression roleMenu) {
    this.roleMenu = roleMenu;
  }

  public MenuOrderBy getOrderBy() {
    return this.orderBy;
  }

  public void setOrderBy(MenuOrderBy orderBy) {
    this.orderBy = orderBy;
  }

  public Collection<String> getGroupBy() {
    return this.groupBy;
  }

  public void setGroupBy(Collection<String> groupBy) {
    this.groupBy = groupBy;
  }

  public Conditional getCond() {
    return this.cond;
  }

  public void setCond(Conditional cond) {
    this.cond = cond;
  }

  public Collection<MenuExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<MenuExpression> exs) {
    this.exs = exs;
  }

  public Integer getFirst() {
    return this.first;
  }

  public void setFirst(Integer first) {
    this.first = first;
  }

  public Integer getLast() {
    return this.last;
  }

  public void setLast(Integer last) {
    this.last = last;
  }

  public Integer getOffset() {
    return this.offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public String getAfter() {
    return this.after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public String getBefore() {
    return this.before;
  }

  public void setBefore(String before) {
    this.before = before;
  }
}
