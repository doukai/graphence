package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for Relationship Object between 角色 and 角色
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for Relationship Object between 角色 and 角色")
public interface RoleCompositeRelationInputBase extends MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  String roleRef = null;

  /**
   * 角色
   */
  @Description("角色")
  RoleInput role = null;

  /**
   * 角色 Reference
   */
  @Description("角色 Reference")
  String compositeRef = null;

  /**
   * 角色
   */
  @Description("角色")
  RoleInput composite = null;

  /**
   * Is Deprecated
   */
  @Description("Is Deprecated")
  Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  Integer version = null;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  Integer realmId = null;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  String createUserId = null;

  /**
   * Create Time
   */
  @Description("Create Time")
  LocalDateTime createTime = null;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  String updateUserId = null;

  /**
   * Update Time
   */
  @Description("Update Time")
  LocalDateTime updateTime = null;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  String createGroupId = null;

  /**
   * Type Name
   */
  @Description("Type Name")
  String __typename = "RoleCompositeRelation";

  /**
   * Where
   */
  @Description("Where")
  RoleCompositeRelationExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getRoleRef() {
    return roleRef;
  }

  void setRoleRef(String roleRef);

  default RoleInput getRole() {
    return role;
  }

  void setRole(RoleInput role);

  default String getCompositeRef() {
    return compositeRef;
  }

  void setCompositeRef(String compositeRef);

  default RoleInput getComposite() {
    return composite;
  }

  void setComposite(RoleInput composite);

  default Boolean getIsDeprecated() {
    return isDeprecated;
  }

  void setIsDeprecated(Boolean isDeprecated);

  default Integer getVersion() {
    return version;
  }

  void setVersion(Integer version);

  default Integer getRealmId() {
    return realmId;
  }

  void setRealmId(Integer realmId);

  default String getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(String createUserId);

  default LocalDateTime getCreateTime() {
    return createTime;
  }

  void setCreateTime(LocalDateTime createTime);

  default String getUpdateUserId() {
    return updateUserId;
  }

  void setUpdateUserId(String updateUserId);

  default LocalDateTime getUpdateTime() {
    return updateTime;
  }

  void setUpdateTime(LocalDateTime updateTime);

  default String getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(String createGroupId);

  default String get__typename() {
    return __typename;
  }

  void set__typename(String __typename);

  default RoleCompositeRelationExpression getWhere() {
    return where;
  }

  void setWhere(RoleCompositeRelationExpression where);
}
