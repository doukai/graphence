package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.BooleanExpression;
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
 * 用户列表 订阅参数
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户列表 订阅参数")
public class UserListSubscriptionArguments implements NamedStructExpression, MetaExpression, UserExpressionBase {
  /**
   * ID
   */
  @Description("ID")
  private StringExpression id;

  /**
   * 姓名
   */
  @Description("姓名")
  private StringExpression name;

  /**
   * 描述
   */
  @Description("描述")
  private StringExpression description;

  /**
   * 姓氏
   */
  @Description("姓氏")
  private StringExpression lastName;

  /**
   * 账号
   */
  @Description("账号")
  private StringExpression login;

  /**
   * 盐
   */
  @Description("盐")
  private StringExpression salt;

  /**
   * 哈希
   */
  @Description("哈希")
  private StringExpression hash;

  /**
   * 邮箱
   */
  @Description("邮箱")
  private StringExpression email;

  /**
   * 手机号
   */
  @Description("手机号")
  private StringExpression phones;

  /**
   * 禁用
   */
  @Description("禁用")
  private BooleanExpression disable;

  /**
   * 组
   */
  @Description("组")
  private GroupExpression groups;

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
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  private UserPhonesRelationExpression userPhonesRelation;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  private GroupUserRelationExpression groupUserRelation;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  private RoleUserRelationExpression roleUserRelation;

  /**
   * 排序
   */
  @Description("排序")
  private UserOrderBy orderBy;

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
  private Collection<UserExpression> exs;

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
  public StringExpression getLastName() {
    return this.lastName;
  }

  @Override
  public void setLastName(StringExpression lastName) {
    this.lastName = (StringExpression)lastName;
  }

  @Override
  public StringExpression getLogin() {
    return this.login;
  }

  @Override
  public void setLogin(StringExpression login) {
    this.login = (StringExpression)login;
  }

  @Override
  public StringExpression getSalt() {
    return this.salt;
  }

  @Override
  public void setSalt(StringExpression salt) {
    this.salt = (StringExpression)salt;
  }

  @Override
  public StringExpression getHash() {
    return this.hash;
  }

  @Override
  public void setHash(StringExpression hash) {
    this.hash = (StringExpression)hash;
  }

  @Override
  public StringExpression getEmail() {
    return this.email;
  }

  @Override
  public void setEmail(StringExpression email) {
    this.email = (StringExpression)email;
  }

  @Override
  public StringExpression getPhones() {
    return this.phones;
  }

  @Override
  public void setPhones(StringExpression phones) {
    this.phones = (StringExpression)phones;
  }

  @Override
  public BooleanExpression getDisable() {
    return this.disable;
  }

  @Override
  public void setDisable(BooleanExpression disable) {
    this.disable = (BooleanExpression)disable;
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
  public UserPhonesRelationExpression getUserPhonesRelation() {
    return this.userPhonesRelation;
  }

  @Override
  public void setUserPhonesRelation(UserPhonesRelationExpression userPhonesRelation) {
    this.userPhonesRelation = (UserPhonesRelationExpression)userPhonesRelation;
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
  public RoleUserRelationExpression getRoleUserRelation() {
    return this.roleUserRelation;
  }

  @Override
  public void setRoleUserRelation(RoleUserRelationExpression roleUserRelation) {
    this.roleUserRelation = (RoleUserRelationExpression)roleUserRelation;
  }

  public UserOrderBy getOrderBy() {
    return this.orderBy;
  }

  public void setOrderBy(UserOrderBy orderBy) {
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
  public Collection<UserExpression> getExs() {
    return this.exs;
  }

  @Override
  public void setExs(Collection<UserExpression> exs) {
    this.exs = (Collection<UserExpression>)exs;
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
