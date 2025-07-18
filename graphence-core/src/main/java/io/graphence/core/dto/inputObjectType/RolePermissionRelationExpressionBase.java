package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 角色 权限 关系 查询表达式
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 权限 关系 查询表达式")
public interface RolePermissionRelationExpressionBase extends MetaExpression {
  /**
   * id
   */
  @Description("id")
  StringExpression id = null;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  StringExpression roleRef = null;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression role = null;

  /**
   * 权限 引用
   */
  @Description("权限 引用")
  StringExpression permissionRef = null;

  /**
   * 权限
   */
  @Description("权限")
  PermissionExpression permission = null;

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
  Collection<RolePermissionRelationExpression> exs = null;

  default StringExpression getId() {
    return id;
  }

  void setId(StringExpression id);

  default StringExpression getRoleRef() {
    return roleRef;
  }

  void setRoleRef(StringExpression roleRef);

  default RoleExpression getRole() {
    return role;
  }

  void setRole(RoleExpression role);

  default StringExpression getPermissionRef() {
    return permissionRef;
  }

  void setPermissionRef(StringExpression permissionRef);

  default PermissionExpression getPermission() {
    return permission;
  }

  void setPermission(PermissionExpression permission);

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

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<RolePermissionRelationExpression> getExs() {
    return exs;
  }

  void setExs(Collection<RolePermissionRelationExpression> exs);
}
