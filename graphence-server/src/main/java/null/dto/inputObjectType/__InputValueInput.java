package null.dto.inputObjectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;
import org.eclipse.microprofile.graphql.NonNull;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class __InputValueInput {
  private String typeName;

  private String name;

  private String description;

  @NonNull
  private __TypeInput type;

  private __TypeInput ofType;

  private String directiveName;

  private String description;

  private __TypeInput ofType;

  private String name;

  private String id;

  private Integer fieldId;

  private String typeName;

  private String ofTypeName;

  private String directiveName;

  private Integer fieldId;

  @NonNull
  private __TypeInput type;

  private String ofTypeName;

  private String defaultValue;

  private String defaultValue;

  private String id;

  private String createUserId;

  private String createUserId;

  private String updateUserId;

  private LocalDateTime createTime;

  private Boolean isDeprecated;

  private Boolean isDeprecated;

  private LocalDateTime updateTime;

  private String realmId;

  private String realmId;

  private String updateUserId;

  private Integer version;

  private String createGroupId;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;

  private String createGroupId;

  private Integer version;

  @DefaultValue("\"__InputValue\"")
  @NonNull
  private String __typename;

  @DefaultValue("\"__InputValue\"")
  @NonNull
  private String __typename;

  public String getTypeName() {
    return this.typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public __TypeInput getType() {
    return this.type;
  }

  public void setType(__TypeInput type) {
    this.type = type;
  }

  public __TypeInput getOfType() {
    return this.ofType;
  }

  public void setOfType(__TypeInput ofType) {
    this.ofType = ofType;
  }

  public String getDirectiveName() {
    return this.directiveName;
  }

  public void setDirectiveName(String directiveName) {
    this.directiveName = directiveName;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public __TypeInput getOfType() {
    return this.ofType;
  }

  public void setOfType(__TypeInput ofType) {
    this.ofType = ofType;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public String getTypeName() {
    return this.typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getOfTypeName() {
    return this.ofTypeName;
  }

  public void setOfTypeName(String ofTypeName) {
    this.ofTypeName = ofTypeName;
  }

  public String getDirectiveName() {
    return this.directiveName;
  }

  public void setDirectiveName(String directiveName) {
    this.directiveName = directiveName;
  }

  public Integer getFieldId() {
    return this.fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public __TypeInput getType() {
    return this.type;
  }

  public void setType(__TypeInput type) {
    this.type = type;
  }

  public String getOfTypeName() {
    return this.ofTypeName;
  }

  public void setOfTypeName(String ofTypeName) {
    this.ofTypeName = ofTypeName;
  }

  public String getDefaultValue() {
    return this.defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getDefaultValue() {
    return this.defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getRealmId() {
    return this.realmId;
  }

  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  public String getRealmId() {
    return this.realmId;
  }

  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  public String getUpdateUserId() {
    return this.updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getCreateGroupId() {
    return this.createGroupId;
  }

  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }
}
