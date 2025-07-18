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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 组列表 订阅参数
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("组列表 订阅参数")
public class GroupListSubscriptionArguments implements TreeStructExpression, NamedStructExpression, MetaExpression, GroupExpressionBase {
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
   * 路径
   */
  @Description("路径")
  private StringExpression path;

  /**
   * 层级
   */
  @Description("层级")
  private IntExpression deep;

  /**
   * 上级ID
   */
  @Description("上级ID")
  private StringExpression parentId;

  /**
   * 上级
   */
  @Description("上级")
  private GroupExpression parent;

  /**
   * 下级
   */
  @Description("下级")
  private GroupExpression subGroups;

  /**
   * 用户
   */
  @Description("用户")
  private UserExpression users;

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
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private GroupUserRelationExpression groupUserRelation;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  private GroupRoleRelationExpression groupRoleRelation;

  /**
   * 排序
   */
  @Description("排序")
  private GroupOrderBy orderBy;

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
  private Collection<GroupExpression> exs;

  /**
   * 前...条数
   */
  @Description("前...条数")
  private Integer first;

  /**
   * 变更内容列表
   */
  @Description("变更内容列表")
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

  @Override
  public GroupExpression getParent() {
    return this.parent;
  }

  @Override
  public void setParent(GroupExpression parent) {
    this.parent = (GroupExpression)parent;
  }

  @Override
  public GroupExpression getSubGroups() {
    return this.subGroups;
  }

  @Override
  public void setSubGroups(GroupExpression subGroups) {
    this.subGroups = (GroupExpression)subGroups;
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
  public GroupUserRelationExpression getGroupUserRelation() {
    return this.groupUserRelation;
  }

  @Override
  public void setGroupUserRelation(GroupUserRelationExpression groupUserRelation) {
    this.groupUserRelation = (GroupUserRelationExpression)groupUserRelation;
  }

  @Override
  public GroupRoleRelationExpression getGroupRoleRelation() {
    return this.groupRoleRelation;
  }

  @Override
  public void setGroupRoleRelation(GroupRoleRelationExpression groupRoleRelation) {
    this.groupRoleRelation = (GroupRoleRelationExpression)groupRoleRelation;
  }

  public GroupOrderBy getOrderBy() {
    return this.orderBy;
  }

  public void setOrderBy(GroupOrderBy orderBy) {
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
  public Collection<GroupExpression> getExs() {
    return this.exs;
  }

  @Override
  public void setExs(Collection<GroupExpression> exs) {
    this.exs = (Collection<GroupExpression>)exs;
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
