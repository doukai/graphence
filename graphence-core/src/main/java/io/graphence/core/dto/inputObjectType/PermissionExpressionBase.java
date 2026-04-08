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
 * Query Expression Input for 权限
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Query Expression Input for 权限")
public interface PermissionExpressionBase extends MetaExpression {
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
   * 字段
   */
  @Description("字段")
  StringExpression field = null;

  /**
   * 实体
   */
  @Description("实体")
  StringExpression type = null;

  /**
   * 权限类型
   */
  @Description("权限类型")
  PermissionTypeExpression permissionType = null;

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
   * Relationship Object between 角色 and 权限
   */
  @Description("Relationship Object between 角色 and 权限")
  RolePermissionRelationExpression rolePermissionRelation = null;

  /**
   * Year of Create Time
   */
  @Description("Year of Create Time")
  IntExpression createTimeYear = null;

  /**
   * Month of Create Time
   */
  @Description("Month of Create Time")
  IntExpression createTimeMonth = null;

  /**
   * Day of Create Time
   */
  @Description("Day of Create Time")
  IntExpression createTimeDay = null;

  /**
   * Week of Create Time
   */
  @Description("Week of Create Time")
  IntExpression createTimeWeek = null;

  /**
   * Quarter of Create Time
   */
  @Description("Quarter of Create Time")
  IntExpression createTimeQuarter = null;

  /**
   * Year of Update Time
   */
  @Description("Year of Update Time")
  IntExpression updateTimeYear = null;

  /**
   * Month of Update Time
   */
  @Description("Month of Update Time")
  IntExpression updateTimeMonth = null;

  /**
   * Day of Update Time
   */
  @Description("Day of Update Time")
  IntExpression updateTimeDay = null;

  /**
   * Week of Update Time
   */
  @Description("Week of Update Time")
  IntExpression updateTimeWeek = null;

  /**
   * Quarter of Update Time
   */
  @Description("Quarter of Update Time")
  IntExpression updateTimeQuarter = null;

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
  Collection<PermissionExpression> exs = null;

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

  default StringExpression getField() {
    return field;
  }

  void setField(StringExpression field);

  default StringExpression getType() {
    return type;
  }

  void setType(StringExpression type);

  default PermissionTypeExpression getPermissionType() {
    return permissionType;
  }

  void setPermissionType(PermissionTypeExpression permissionType);

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

  default RolePermissionRelationExpression getRolePermissionRelation() {
    return rolePermissionRelation;
  }

  void setRolePermissionRelation(RolePermissionRelationExpression rolePermissionRelation);

  default IntExpression getCreateTimeYear() {
    return createTimeYear;
  }

  void setCreateTimeYear(IntExpression createTimeYear);

  default IntExpression getCreateTimeMonth() {
    return createTimeMonth;
  }

  void setCreateTimeMonth(IntExpression createTimeMonth);

  default IntExpression getCreateTimeDay() {
    return createTimeDay;
  }

  void setCreateTimeDay(IntExpression createTimeDay);

  default IntExpression getCreateTimeWeek() {
    return createTimeWeek;
  }

  void setCreateTimeWeek(IntExpression createTimeWeek);

  default IntExpression getCreateTimeQuarter() {
    return createTimeQuarter;
  }

  void setCreateTimeQuarter(IntExpression createTimeQuarter);

  default IntExpression getUpdateTimeYear() {
    return updateTimeYear;
  }

  void setUpdateTimeYear(IntExpression updateTimeYear);

  default IntExpression getUpdateTimeMonth() {
    return updateTimeMonth;
  }

  void setUpdateTimeMonth(IntExpression updateTimeMonth);

  default IntExpression getUpdateTimeDay() {
    return updateTimeDay;
  }

  void setUpdateTimeDay(IntExpression updateTimeDay);

  default IntExpression getUpdateTimeWeek() {
    return updateTimeWeek;
  }

  void setUpdateTimeWeek(IntExpression updateTimeWeek);

  default IntExpression getUpdateTimeQuarter() {
    return updateTimeQuarter;
  }

  void setUpdateTimeQuarter(IntExpression updateTimeQuarter);

  default Boolean getNot() {
    return not;
  }

  void setNot(Boolean not);

  default Conditional getCond() {
    return cond;
  }

  void setCond(Conditional cond);

  default Collection<PermissionExpression> getExs() {
    return exs;
  }

  void setExs(Collection<PermissionExpression> exs);
}
