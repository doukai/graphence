package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * 用户 组 关系列表 变更参数 
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 组 关系列表 变更参数 ")
public class GroupUserRelationListMutationArguments implements MetaInput, GroupUserRelationInputBase {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 用户 引用
   */
  @Description("用户 引用")
  private String userRef;

  /**
   * 用户
   */
  @Description("用户")
  private UserInput user;

  /**
   * 组 引用
   */
  @Description("组 引用")
  private String groupRef;

  /**
   * 组
   */
  @Description("组")
  private GroupInput group;

  /**
   * 已移除
   */
  @DefaultValue("false")
  @Description("已移除")
  private Boolean isDeprecated = false;

  /**
   * 版本
   */
  @Description("版本")
  private Integer version;

  /**
   * 域
   */
  @Description("域")
  private Integer realmId;

  /**
   * 创建者
   */
  @Description("创建者")
  private String createUserId;

  /**
   * 创建时间
   */
  @Description("创建时间")
  private LocalDateTime createTime;

  /**
   * 更新者
   */
  @Description("更新者")
  private String updateUserId;

  /**
   * 更新时间
   */
  @Description("更新时间")
  private LocalDateTime updateTime;

  /**
   * 创建组
   */
  @Description("创建组")
  private String createGroupId;

  /**
   * 所属类型
   */
  @DefaultValue("GroupUserRelation")
  @Description("所属类型")
  private String __typename = "GroupUserRelation";

  /**
   * 变更内容列表
   */
  @Description("变更内容列表")
  private Collection<GroupUserRelationInput> list;

  /**
   * 匹配条件
   */
  @Description("匹配条件")
  private GroupUserRelationExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getUserRef() {
    return this.userRef;
  }

  @Override
  public void setUserRef(String userRef) {
    this.userRef = (String)userRef;
  }

  @Override
  public UserInput getUser() {
    return this.user;
  }

  @Override
  public void setUser(UserInput user) {
    this.user = (UserInput)user;
  }

  @Override
  public String getGroupRef() {
    return this.groupRef;
  }

  @Override
  public void setGroupRef(String groupRef) {
    this.groupRef = (String)groupRef;
  }

  @Override
  public GroupInput getGroup() {
    return this.group;
  }

  @Override
  public void setGroup(GroupInput group) {
    this.group = (GroupInput)group;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  @Override
  public String get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(String __typename) {
    this.__typename = (String)__typename;
  }

  public Collection<GroupUserRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<GroupUserRelationInput> list) {
    this.list = list;
  }

  @Override
  public GroupUserRelationExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(GroupUserRelationExpression where) {
    this.where = (GroupUserRelationExpression)where;
  }
}
