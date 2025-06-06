package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.structure.dto.inputObjectType.NamedStructExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 角色列表 查询参数
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色列表 查询参数")
public class RoleListQueryArguments implements NamedStructExpression, MetaExpression, RoleExpressionBase {
  /**
   * ID
   */
  @Description("ID")
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
   * 用户
   */
  @Description("用户")
  private UserExpression users;

  /**
   * 组
   */
  @Description("组")
  private GroupExpression groups;

  /**
   * 组合
   */
  @Description("组合")
  private RoleExpression composites;

  /**
   * 权限
   */
  @Description("权限")
  private PermissionExpression permissions;

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
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private RoleUserRelationExpression roleUserRelation;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  private GroupRoleRelationExpression groupRoleRelation;

  /**
   * 角色 角色 关系
   */
  @Description("角色 角色 关系")
  private RoleCompositeRelationExpression roleCompositeRelation;

  /**
   * 角色 权限 关系
   */
  @Description("角色 权限 关系")
  private PermissionRoleRelationExpression permissionRoleRelation;

  /**
   * 排序
   */
  @Description("排序")
  private RoleOrderBy orderBy;

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
  private Collection<RoleExpression> exs;

  /**
   * 前...条数
   */
  @Description("前...条数")
  private Integer first;

  /**
   * 后...条数
   */
  @Description("后...条数")
  private Integer last;

  /**
   * 偏移条数
   */
  @Description("偏移条数")
  private Integer offset;

  /**
   * 取...之后
   */
  @Description("取...之后")
  private String after;

  /**
   * 取...之前
   */
  @Description("取...之前")
  private String before;

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
  public UserExpression getUsers() {
    return this.users;
  }

  @Override
  public void setUsers(UserExpression users) {
    this.users = (UserExpression)users;
  }

  @Override
  public GroupExpression getGroups() {
    return this.groups;
  }

  @Override
  public void setGroups(GroupExpression groups) {
    this.groups = (GroupExpression)groups;
  }

  @Override
  public RoleExpression getComposites() {
    return this.composites;
  }

  @Override
  public void setComposites(RoleExpression composites) {
    this.composites = (RoleExpression)composites;
  }

  @Override
  public PermissionExpression getPermissions() {
    return this.permissions;
  }

  @Override
  public void setPermissions(PermissionExpression permissions) {
    this.permissions = (PermissionExpression)permissions;
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
  public RoleUserRelationExpression getRoleUserRelation() {
    return this.roleUserRelation;
  }

  @Override
  public void setRoleUserRelation(RoleUserRelationExpression roleUserRelation) {
    this.roleUserRelation = (RoleUserRelationExpression)roleUserRelation;
  }

  @Override
  public GroupRoleRelationExpression getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  @Override
  public void setGroupRoleRelation(GroupRoleRelationExpression groupRoleRelation) {
    this.groupRoleRelation = (GroupRoleRelationExpression)groupRoleRelation;
  }

  @Override
  public RoleCompositeRelationExpression getRoleCompositeRelation() {
    return this.roleCompositeRelation;
  }

  @Override
  public void setRoleCompositeRelation(RoleCompositeRelationExpression roleCompositeRelation) {
    this.roleCompositeRelation = (RoleCompositeRelationExpression)roleCompositeRelation;
  }

  @Override
  public PermissionRoleRelationExpression getPermissionRoleRelation() {
    return this.permissionRoleRelation;
  }

  @Override
  public void setPermissionRoleRelation(PermissionRoleRelationExpression permissionRoleRelation) {
    this.permissionRoleRelation = (PermissionRoleRelationExpression)permissionRoleRelation;
  }

  public RoleOrderBy getOrderBy() {
    return this.orderBy;
  }

  public void setOrderBy(RoleOrderBy orderBy) {
    this.orderBy = orderBy;
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
  public Collection<RoleExpression> getExs() {
    return this.exs;
  }

  @Override
  public void setExs(Collection<RoleExpression> exs) {
    this.exs = (Collection<RoleExpression>)exs;
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
