package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.inputObjectType.UserPhonesRelationInput;
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
 * 用户 手机号 关系
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 手机号 关系")
public class UserPhonesRelation implements Meta {
  @Id
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
   * 手机号 引用
   */
  @Description("手机号 引用")
  private String phonesRef;

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
  private String __typename = "UserPhonesRelation";

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
   * 手机号 引用 数量
   */
  @Description("手机号 引用 数量")
  private Integer phonesRefCount;

  /**
   * 手机号 引用 最大值
   */
  @Description("手机号 引用 最大值")
  private String phonesRefMax;

  /**
   * 手机号 引用 最小值
   */
  @Description("手机号 引用 最小值")
  private String phonesRefMin;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
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

  public String getPhonesRef() {
    return this.phonesRef;
  }

  public void setPhonesRef(String phonesRef) {
    this.phonesRef = phonesRef;
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

  public Integer getPhonesRefCount() {
    return this.phonesRefCount;
  }

  public void setPhonesRefCount(Integer phonesRefCount) {
    this.phonesRefCount = phonesRefCount;
  }

  public String getPhonesRefMax() {
    return this.phonesRefMax;
  }

  public void setPhonesRefMax(String phonesRefMax) {
    this.phonesRefMax = phonesRefMax;
  }

  public String getPhonesRefMin() {
    return this.phonesRefMin;
  }

  public void setPhonesRefMin(String phonesRefMin) {
    this.phonesRefMin = phonesRefMin;
  }

  public UserPhonesRelationInput toInput() {
    UserPhonesRelationInput input = new UserPhonesRelationInput();
    input.setId(this.getId());
    input.setUserRef(this.getUserRef());
    if(getUser() != null) {
      input.setUser(this.getUser().toInput());
    }
    input.setPhonesRef(this.getPhonesRef());
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
