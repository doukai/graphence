package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.UserIntListRelationInput;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

/**
 * 用户 intList 关系
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 intList 关系")
public class UserIntListRelation implements Meta {
  /**
   * ID
   */
  @Id
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
  private User user;

  /**
   * intList 引用
   */
  @Description("intList 引用")
  private Integer intListRef;

  /**
   * 已移除
   */
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
  @Description("所属类型")
  private String __typename = "UserIntListRelation";

  /**
   * 用户 intList 关系 数量
   */
  @Description("用户 intList 关系 数量")
  private Integer idCount;

  /**
   * ID 最大值
   */
  @Description("ID 最大值")
  private Integer idMax;

  /**
   * ID 最小值
   */
  @Description("ID 最小值")
  private Integer idMin;

  /**
   * 用户 引用 数量
   */
  @Description("用户 引用 数量")
  private Integer userRefCount;

  /**
   * 用户 引用 最大值
   */
  @Description("用户 引用 最大值")
  private String userRefMax;

  /**
   * 用户 引用 最小值
   */
  @Description("用户 引用 最小值")
  private String userRefMin;

  /**
   * intList 引用 数量
   */
  @Description("intList 引用 数量")
  private Integer intListRefCount;

  /**
   * intList 引用 合计
   */
  @Description("intList 引用 合计")
  private Integer intListRefSum;

  /**
   * intList 引用 平均值
   */
  @Description("intList 引用 平均值")
  private Integer intListRefAvg;

  /**
   * intList 引用 最大值
   */
  @Description("intList 引用 最大值")
  private Integer intListRefMax;

  /**
   * intList 引用 最小值
   */
  @Description("intList 引用 最小值")
  private Integer intListRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserRef() {
    return this.userRef;
  }

  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Integer getIntListRef() {
    return this.intListRef;
  }

  public void setIntListRef(Integer intListRef) {
    this.intListRef = intListRef;
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

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
    this.idMin = idMin;
  }

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public String getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(String userRefMax) {
    this.userRefMax = userRefMax;
  }

  public String getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(String userRefMin) {
    this.userRefMin = userRefMin;
  }

  public Integer getIntListRefCount() {
    return this.intListRefCount;
  }

  public void setIntListRefCount(Integer intListRefCount) {
    this.intListRefCount = intListRefCount;
  }

  public Integer getIntListRefSum() {
    return this.intListRefSum;
  }

  public void setIntListRefSum(Integer intListRefSum) {
    this.intListRefSum = intListRefSum;
  }

  public Integer getIntListRefAvg() {
    return this.intListRefAvg;
  }

  public void setIntListRefAvg(Integer intListRefAvg) {
    this.intListRefAvg = intListRefAvg;
  }

  public Integer getIntListRefMax() {
    return this.intListRefMax;
  }

  public void setIntListRefMax(Integer intListRefMax) {
    this.intListRefMax = intListRefMax;
  }

  public Integer getIntListRefMin() {
    return this.intListRefMin;
  }

  public void setIntListRefMin(Integer intListRefMin) {
    this.intListRefMin = intListRefMin;
  }

  public UserIntListRelationInput toInput() {
    UserIntListRelationInput input = new UserIntListRelationInput();
    input.setId(this.getId());
    input.setUserRef(this.getUserRef());
    if(getUser() != null) {
      input.setUser(this.getUser().toInput());
    }
    input.setIntListRef(this.getIntListRef());
    input.setIsDeprecated(this.getIsDeprecated());
    input.setVersion(this.getVersion());
    input.setRealmId(this.getRealmId());
    input.setCreateUserId(this.getCreateUserId());
    input.setCreateTime(this.getCreateTime());
    input.setUpdateUserId(this.getUpdateUserId());
    input.setUpdateTime(this.getUpdateTime());
    input.setCreateGroupId(this.getCreateGroupId());
    input.set__typename(this.get__typename());
    return input;
  }
}
