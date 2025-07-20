package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.BooleanExpression;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.graphoenix.structure.dto.inputObjectType.NamedStructExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 用户 查询表达式
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 查询表达式")
public interface UserExpressionBase extends NamedStructExpression, MetaExpression {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id = null;

  /**
   * 姓名
   */
  @Description("姓名")
  StringExpression name = null;

  /**
   * 描述
   */
  @Description("描述")
  StringExpression description = null;

  /**
   * 姓氏
   */
  @Description("姓氏")
  StringExpression lastName = null;

  /**
   * 账号
   */
  @Description("账号")
  StringExpression login = null;

  /**
   * 盐
   */
  @Description("盐")
  StringExpression salt = null;

  /**
   * 哈希
   */
  @Description("哈希")
  StringExpression hash = null;

  /**
   * 邮箱
   */
  @Description("邮箱")
  StringExpression email = null;

  /**
   * 手机号
   */
  @Description("手机号")
  StringExpression phones = null;

  /**
   * 禁用
   */
  @Description("禁用")
  BooleanExpression disable = null;

  /**
   * 组
   */
  @Description("组")
  GroupExpression groups = null;

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
   * 用户 手机号 关系
   */
  @Description("用户 手机号 关系")
  UserPhonesRelationExpression userPhonesRelation = null;

  /**
   * 用户 组 关系
   */
  @Description("用户 组 关系")
  GroupUserRelationExpression groupUserRelation = null;

  /**
   * 用户 角色 关系
   */
  @Description("用户 角色 关系")
  RoleUserRelationExpression roleUserRelation = null;

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
  Collection<UserExpression> exs = null;

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

  default StringExpression getLastName() {
    return lastName;
  }

  void setLastName(StringExpression lastName);

  default StringExpression getLogin() {
    return login;
  }

  void setLogin(StringExpression login);

  default StringExpression getSalt() {
    return salt;
  }

  void setSalt(StringExpression salt);

  default StringExpression getHash() {
    return hash;
  }

  void setHash(StringExpression hash);

  default StringExpression getEmail() {
    return email;
  }

  void setEmail(StringExpression email);

  default StringExpression getPhones() {
    return phones;
  }

  void setPhones(StringExpression phones);

  default BooleanExpression getDisable() {
    return disable;
  }

  void setDisable(BooleanExpression disable);

  default GroupExpression getGroups() {
    return groups;
  }

  void setGroups(GroupExpression groups);

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

  default UserPhonesRelationExpression getUserPhonesRelation() {
    return userPhonesRelation;
  }

  void setUserPhonesRelation(UserPhonesRelationExpression userPhonesRelation);

  default GroupUserRelationExpression getGroupUserRelation() {
    return groupUserRelation;
  }

  void setGroupUserRelation(GroupUserRelationExpression groupUserRelation);

  default RoleUserRelationExpression getRoleUserRelation() {
    return roleUserRelation;
  }

  void setRoleUserRelation(RoleUserRelationExpression roleUserRelation);

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<UserExpression> getExs() {
    return exs;
  }

  void setExs(Collection<UserExpression> exs);
}
