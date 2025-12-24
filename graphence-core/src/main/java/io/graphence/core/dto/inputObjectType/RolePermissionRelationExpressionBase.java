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
 * Query Expression Input for Relationship Object between 角色 and 权限
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query Expression Input for Relationship Object between 角色 and 权限")
public interface RolePermissionRelationExpressionBase extends MetaExpression {
  /**
   * ID
   */
  @Description("ID")
  StringExpression id = null;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  StringExpression roleRef = null;

  /**
   * 角色
   */
  @Description("角色")
  RoleExpression role = null;

  /**
   * 权限 Reference
   */
  @Description("权限 Reference")
  StringExpression permissionRef = null;

  /**
   * 权限
   */
  @Description("权限")
  PermissionExpression permission = null;

  /**
   * Include Deprecated
   */
  @Description("Include Deprecated")
  Boolean includeDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  IntExpression version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  IntExpression realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  StringExpression createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  StringExpression createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  StringExpression updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  StringExpression updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  StringExpression createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  StringExpression __typename = null;

  /**
   * Not
   */
  @Description("Not")
  Boolean not = false;

  /**
   * Condition
   */
  @Description("Condition")
  Conditional cond = Conditional.AND;

  /**
   * Expressions
   */
  @Description("Expressions")
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
