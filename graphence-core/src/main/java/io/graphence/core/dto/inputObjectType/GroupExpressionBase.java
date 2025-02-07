package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.structure.dto.inputObjectType.NamedStructExpression;
import io.graphoenix.structure.dto.inputObjectType.TreeStructExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 组 查询表达式
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("组 查询表达式")
public interface GroupExpressionBase extends TreeStructExpression, NamedStructExpression, MetaExpression {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id = null;

  /**
   * 名称
   */
  @Description("名称")
  StringExpression name = null;

  /**
   * 描述
   */
  @Description("描述")
  StringExpression description = null;

  /**
   * 路径
   */
  @Description("路径")
  StringExpression path = null;

  /**
   * 层级
   */
  @Description("层级")
  IntExpression deep = null;

  /**
   * 上级ID
   */
  @Description("上级ID")
  StringExpression parentId = null;

  /**
   * 上级
   */
  @Description("上级")
  GroupExpression parent = null;

  /**
   * 下级
   */
  @Description("下级")
  GroupExpression subGroups = null;

  /**
   * 用户
   */
  @Description("用户")
  UserExpression users = null;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression roles = null;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression realm = null;

  /**
   * 包含已移除
   */
  @Description("包含已移除")
  Boolean includeDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  IntExpression version = null;

  /**
   * 域
   */
  @Description("域")
  IntExpression realmId = null;

  /**
   * 创建者
   */
  @Description("创建者")
  StringExpression createUserId = null;

  /**
   * 创建时间
   */
  @Description("创建时间")
  StringExpression createTime = null;

  /**
   * 更新者
   */
  @Description("更新者")
  StringExpression updateUserId = null;

  /**
   * 更新时间
   */
  @Description("更新时间")
  StringExpression updateTime = null;

  /**
   * 创建组
   */
  @Description("创建组")
  StringExpression createGroupId = null;

  /**
   * 所属类型
   */
  @Description("所属类型")
  StringExpression __typename = null;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationExpression groupUserRelation = null;

  /**
   * 角色 组 关系
   */
  @Description("角色 组 关系")
  GroupRoleRelationExpression groupRoleRelation = null;

  /**
   * 取非
   */
  @Description("取非")
  Boolean not = false;

  /**
   * 与/或
   */
  @Description("与/或")
  Conditional cond = Conditional.AND;

  /**
   * 查询表达式组
   */
  @Description("查询表达式组")
  Collection<GroupExpression> exs = null;

  default StringExpression getId() {
    return id;
  }

  void setId(StringExpression id);

  default StringExpression getName() {
    return name;
  }

  void setName(StringExpression name);

  default StringExpression getDescription() {
    return description;
  }

  void setDescription(StringExpression description);

  default StringExpression getPath() {
    return path;
  }

  void setPath(StringExpression path);

  default IntExpression getDeep() {
    return deep;
  }

  void setDeep(IntExpression deep);

  default StringExpression getParentId() {
    return parentId;
  }

  void setParentId(StringExpression parentId);

  default GroupExpression getParent() {
    return parent;
  }

  void setParent(GroupExpression parent);

  default GroupExpression getSubGroups() {
    return subGroups;
  }

  void setSubGroups(GroupExpression subGroups);

  default UserExpression getUsers() {
    return users;
  }

  void setUsers(UserExpression users);

  default RoleExpression getRoles() {
    return roles;
  }

  void setRoles(RoleExpression roles);

  default RealmExpression getRealm() {
    return realm;
  }

  void setRealm(RealmExpression realm);

  default Boolean getIncludeDeprecated() {
    return includeDeprecated;
  }

  void setIncludeDeprecated(Boolean includeDeprecated);

  default IntExpression getVersion() {
    return version;
  }

  void setVersion(IntExpression version);

  default IntExpression getRealmId() {
    return realmId;
  }

  void setRealmId(IntExpression realmId);

  default StringExpression getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(StringExpression createUserId);

  default StringExpression getCreateTime() {
    return createTime;
  }

  void setCreateTime(StringExpression createTime);

  default StringExpression getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(StringExpression updateUserId);

  default StringExpression getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(StringExpression updateTime);

  default StringExpression getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(StringExpression createGroupId);

  default StringExpression get__typename() {
    return __typename;
  }

  void set__typename(StringExpression __typename);

  default GroupUserRelationExpression getGroupUserRelation() {
    return groupUserRelation;
  }

  void setGroupUserRelation(GroupUserRelationExpression groupUserRelation);

  default GroupRoleRelationExpression getGroupRoleRelation() {
    return groupRoleRelation;
  }

  void setGroupRoleRelation(GroupRoleRelationExpression groupRoleRelation);

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<GroupExpression> getExs() {
    return exs;
  }

  void setExs(Collection<GroupExpression> exs);
}
