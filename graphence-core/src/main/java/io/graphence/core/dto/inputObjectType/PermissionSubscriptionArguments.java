package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 权限 订阅参数
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限 订阅参数")
public class PermissionSubscriptionArguments implements MetaExpression, PermissionExpressionBase {
  /**
   * id
   */
  @Description("id")
  private StringExpression id;

  /**
   * 名称
   */
  @Description("名称")
  private StringExpression name;

  /**
   * 描述
   */
  @Description("描述")
  private StringExpression description;

  /**
   * 字段
   */
  @Description("字段")
  private StringExpression field;

  /**
   * 实体
   */
  @Description("实体")
  private StringExpression type;

  /**
   * 权限类型
   */
  @Description("权限类型")
  private PermissionTypeExpression permissionType;

  /**
   * 角色
   */
  @Description("角色")
  private RoleExpression roles;

  /**
   * 租户
   */
  @Description("租户")
  private RealmExpression realm;

  /**
   * 包含已移除
   */
  @DefaultValue("false")
  @Description("包含已移除")
  private Boolean includeDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  private IntExpression version;

  /**
   * 域
   */
  @Description("域")
  private IntExpression realmId;

  /**
   * 创建者
   */
  @Description("创建者")
  private StringExpression createUserId;

  /**
   * 创建时间
   */
  @Description("创建时间")
  private StringExpression createTime;

  /**
   * 更新者
   */
  @Description("更新者")
  private StringExpression updateUserId;

  /**
   * 更新时间
   */
  @Description("更新时间")
  private StringExpression updateTime;

  /**
   * 创建组
   */
  @Description("创建组")
  private StringExpression createGroupId;

  /**
   * 所属类型
   */
  @Description("所属类型")
  private StringExpression __typename;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private RolePermissionRelationExpression rolePermissionRelation;

  /**
   * 分组
   */
  @Description("分组")
  private Collection<String> groupBy;

  /**
   * 取非
   */
  @DefaultValue("false")
  @Description("取非")
  private Boolean not = false;

  /**
   * 与/或
   */
  @DefaultValue("AND")
  @Description("与/或")
  private Conditional cond = Conditional.AND;

  /**
   * 查询表达式组
   */
  @Description("查询表达式组")
  private Collection<PermissionExpression> exs;

  @Override
  public StringExpression getId() {
    return this.id;
  }

  @Override
  public void setId(StringExpression id) {
    this.id = (StringExpression)id;
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
  public StringExpression getField() {
    return this.field;
  }

  @Override
  public void setField(StringExpression field) {
    this.field = (StringExpression)field;
  }

  @Override
  public StringExpression getType() {
    return this.type;
  }

  @Override
  public void setType(StringExpression type) {
    this.type = (StringExpression)type;
  }

  @Override
  public PermissionTypeExpression getPermissionType() {
    return this.permissionType;
  }

  @Override
  public void setPermissionType(PermissionTypeExpression permissionType) {
    this.permissionType = (PermissionTypeExpression)permissionType;
  }

  @Override
  public RoleExpression getRoles() {
    return this.roles;
  }

  @Override
  public void setRoles(RoleExpression roles) {
    this.roles = (RoleExpression)roles;
  }

  @Override
  public RealmExpression getRealm() {
    return this.realm;
  }

  @Override
  public void setRealm(RealmExpression realm) {
    this.realm = (RealmExpression)realm;
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

  @Override
  public StringExpression get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(StringExpression __typename) {
    this.__typename = (StringExpression)__typename;
  }

  @Override
  public RolePermissionRelationExpression getRolePermissionRelation() {
    return this.rolePermissionRelation;
  }

  @Override
  public void setRolePermissionRelation(RolePermissionRelationExpression rolePermissionRelation) {
    this.rolePermissionRelation = (RolePermissionRelationExpression)rolePermissionRelation;
  }

  public Collection<String> getGroupBy() {
    return this.groupBy;
  }

  public void setGroupBy(Collection<String> groupBy) {
    this.groupBy = groupBy;
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

  @Override
  public Collection<PermissionExpression> getExs() {
    return this.exs;
  }

  @Override
  public void setExs(Collection<PermissionExpression> exs) {
    this.exs = (Collection<PermissionExpression>)exs;
  }
}
