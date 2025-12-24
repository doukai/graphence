package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.enumType.Conditional;
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
 * Query Expression Input for 角色
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query Expression Input for 角色")
public interface RoleExpressionBase extends NamedStructExpression, MetaExpression {
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
   * 用户
   */
  @Description("用户")
  UserExpression users = null;

  /**
   * 组
   */
  @Description("组")
  GroupExpression groups = null;

  /**
   * 组合
   */
  @Description("组合")
  RoleExpression composites = null;

  /**
   * 权限
   */
  @Description("权限")
  PermissionExpression permissions = null;

  /**
   * 租户
   */
  @Description("租户")
  RealmExpression realm = null;

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
   * Relationship Object between 用户 and 角色
   */
  @Description("Relationship Object between 用户 and 角色")
  RoleUserRelationExpression roleUserRelation = null;

  /**
   * Relationship Object between 角色 and 组
   */
  @Description("Relationship Object between 角色 and 组")
  GroupRoleRelationExpression groupRoleRelation = null;

  /**
   * Relationship Object between 角色 and 角色
   */
  @Description("Relationship Object between 角色 and 角色")
  RoleCompositeRelationExpression roleCompositeRelation = null;

  /**
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationExpression rolePermissionRelation = null;

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
  Collection<RoleExpression> exs = null;

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

  default UserExpression getUsers() {
    return users;
  }

  void setUsers(UserExpression users);

  default GroupExpression getGroups() {
    return groups;
  }

  void setGroups(GroupExpression groups);

  default RoleExpression getComposites() {
    return composites;
  }

  void setComposites(RoleExpression composites);

  default PermissionExpression getPermissions() {
    return permissions;
  }

  void setPermissions(PermissionExpression permissions);

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

  default RoleUserRelationExpression getRoleUserRelation() {
    return roleUserRelation;
  }

  void setRoleUserRelation(RoleUserRelationExpression roleUserRelation);

  default GroupRoleRelationExpression getGroupRoleRelation() {
    return groupRoleRelation;
  }

  void setGroupRoleRelation(GroupRoleRelationExpression groupRoleRelation);

  default RoleCompositeRelationExpression getRoleCompositeRelation() {
    return roleCompositeRelation;
  }

  void setRoleCompositeRelation(RoleCompositeRelationExpression roleCompositeRelation);

  default RolePermissionRelationExpression getRolePermissionRelation() {
    return rolePermissionRelation;
  }

  void setRolePermissionRelation(RolePermissionRelationExpression rolePermissionRelation);

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<RoleExpression> getExs() {
    return exs;
  }

  void setExs(Collection<RoleExpression> exs);
}
