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
 * 角色 组 关系 变更内容
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("角色 组 关系 变更内容")
public interface GroupRoleRelationInputBase extends MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

  /**
   * 角色 引用
   */
  @Description("角色 引用")
  String roleRef = null;

  /**
   * 角色
   */
  @Description("角色")
  RoleInput role = null;

  /**
   * 组 引用
   */
  @Description("组 引用")
  String groupRef = null;

  /**
   * 组
   */
  @Description("组")
  GroupInput group = null;

  /**
   * 已移除
   */
  @Description("已移除")
  Boolean isDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  Integer version = null;

  /**
   * 域
   */
  @Description("域")
  Integer realmId = null;

  /**
   * 创建者
   */
  @Description("创建者")
  String createUserId = null;

  /**
   * 创建时间
   */
  @Description("创建时间")
  LocalDateTime createTime = null;

  /**
   * 更新者
   */
  @Description("更新者")
  String updateUserId = null;

  /**
   * 更新时间
   */
  @Description("更新时间")
  LocalDateTime updateTime = null;

  /**
   * 创建组
   */
  @Description("创建组")
  String createGroupId = null;

  /**
   * 所属类型
   */
  @Description("所属类型")
  String __typename = "GroupRoleRelation";

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  GroupRoleRelationExpression where = null;

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

  default String getGroupRef() {
    return groupRef;
  }

  void setGroupRef(String groupRef);

  default GroupInput getGroup() {
    return group;
  }

  void setGroup(GroupInput group);

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

  default GroupRoleRelationExpression getWhere() {
    return where;
  }

  void setWhere(GroupRoleRelationExpression where);
}
