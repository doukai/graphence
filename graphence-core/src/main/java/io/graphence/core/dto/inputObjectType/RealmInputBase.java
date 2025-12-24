package io.graphence.core.dto.inputObjectType;

import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.structure.dto.inputObjectType.NamedStructInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Input for 租户
 */
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Input for 租户")
public interface RealmInputBase extends NamedStructInput, MetaInput {
  /**
   * ID
   */
  @Description("ID")
  String id = null;

  /**
   * 名称
   */
  @Description("名称")
  String name = null;

  /**
   * 描述
   */
  @Description("描述")
  String description = null;

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
  String __typename = "Realm";

  /**
   * Where
   */
  @Description("Where")
  RealmExpression where = null;

  default String getId() {
    return id;
  }

  void setId(String id);

  default String getName() {
    return name;
  }

  void setName(String name);

  default String getDescription() {
    return description;
  }

  void setDescription(String description);

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

  default RealmExpression getWhere() {
    return where;
  }

  void setWhere(RealmExpression where);
}
