package null.dto.objectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import null.dto.enumType.__TypeKind;
import null.dto.interfaceType.Meta;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class __Type implements Meta {
  @Id
  @NonNull
  private String name;

  private Collection<__Type> possibleTypes;

  private String description;

  private Collection<__EnumValue> enumValues;

  private __Type ofType;

  @Id
  @NonNull
  private String name;

  private Integer schemaId;

  private Integer schemaId;

  private Collection<__Field> fields;

  private Collection<__Type> interfaces;

  private Collection<__Type> interfaces;

  @NonNull
  private __TypeKind kind;

  private String description;

  private Collection<__Type> possibleTypes;

  private __Type ofType;

  private Collection<__InputValue> inputFields;

  private Collection<__Field> fields;

  private Collection<__EnumValue> enumValues;

  @NonNull
  private __TypeKind kind;

  private Collection<__InputValue> inputFields;

  private String ofTypeName;

  private String ofTypeName;

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

  private String __typename;

  private Integer nameCount;

  @Id
  private String nameMax;

  @Id
  private String nameMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer nameCount;

  @Id
  private String nameMax;

  @Id
  private String nameMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer ofTypeNameCount;

  private String ofTypeNameMax;

  private String ofTypeNameMin;

  private Integer ofTypeNameCount;

  private String ofTypeNameMax;

  private String ofTypeNameMin;

  private Integer schemaIdCount;

  private Integer schemaIdSum;

  private Integer schemaIdAvg;

  private Integer schemaIdMax;

  private Integer schemaIdMin;

  private Integer schemaIdCount;

  private Integer schemaIdSum;

  private Integer schemaIdAvg;

  private Integer schemaIdMax;

  private Integer schemaIdMin;

  private __Type possibleTypesAggregate;

  private __EnumValue enumValuesAggregate;

  private __Field fieldsAggregate;

  private __Type interfacesAggregate;

  private __Type interfacesAggregate;

  private __Type possibleTypesAggregate;

  private __InputValue inputFieldsAggregate;

  private __Field fieldsAggregate;

  private __EnumValue enumValuesAggregate;

  private __InputValue inputFieldsAggregate;

  private __TypeConnection possibleTypesConnection;

  private __EnumValueConnection enumValuesConnection;

  private __FieldConnection fieldsConnection;

  private __TypeConnection interfacesConnection;

  private __TypeConnection interfacesConnection;

  private __TypeConnection possibleTypesConnection;

  private __InputValueConnection inputFieldsConnection;

  private __FieldConnection fieldsConnection;

  private __EnumValueConnection enumValuesConnection;

  private __InputValueConnection inputFieldsConnection;

  private String __typename;

  private Integer nameCount;

  @Id
  private String nameMax;

  @Id
  private String nameMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer nameCount;

  @Id
  private String nameMax;

  @Id
  private String nameMin;

  private Integer descriptionCount;

  private String descriptionMax;

  private String descriptionMin;

  private Integer ofTypeNameCount;

  private String ofTypeNameMax;

  private String ofTypeNameMin;

  private Integer ofTypeNameCount;

  private String ofTypeNameMax;

  private String ofTypeNameMin;

  private Integer createUserIdCount;

  private String createUserIdMax;

  private String createUserIdMin;

  private Integer createUserIdCount;

  private String createUserIdMax;

  private String createUserIdMin;

  private Integer updateUserIdCount;

  private String updateUserIdMax;

  private String updateUserIdMin;

  private Integer createTimeCount;

  private LocalDateTime createTimeMax;

  private LocalDateTime createTimeMin;

  private Integer updateTimeCount;

  private LocalDateTime updateTimeMax;

  private LocalDateTime updateTimeMin;

  private Integer realmIdCount;

  private String realmIdMax;

  private String realmIdMin;

  private Integer realmIdCount;

  private String realmIdMax;

  private String realmIdMin;

  private Integer updateUserIdCount;

  private String updateUserIdMax;

  private String updateUserIdMin;

  private Integer createGroupIdCount;

  private String createGroupIdMax;

  private String createGroupIdMin;

  private Integer createTimeCount;

  private LocalDateTime createTimeMax;

  private LocalDateTime createTimeMin;

  private Integer updateTimeCount;

  private LocalDateTime updateTimeMax;

  private LocalDateTime updateTimeMin;

  private Integer createGroupIdCount;

  private String createGroupIdMax;

  private String createGroupIdMin;

  private Integer __typenameCount;

  private String __typenameMax;

  private String __typenameMin;

  private Integer nameMaxCount;

  @Id
  private String nameMaxMax;

  @Id
  private String nameMaxMin;

  private Integer nameMinCount;

  @Id
  private String nameMinMax;

  @Id
  private String nameMinMin;

  private Integer descriptionMaxCount;

  private String descriptionMaxMax;

  private String descriptionMaxMin;

  private Integer descriptionMinCount;

  private String descriptionMinMax;

  private String descriptionMinMin;

  private Integer nameMaxCount;

  @Id
  private String nameMaxMax;

  @Id
  private String nameMaxMin;

  private Integer nameMinCount;

  @Id
  private String nameMinMax;

  @Id
  private String nameMinMin;

  private Integer descriptionMaxCount;

  private String descriptionMaxMax;

  private String descriptionMaxMin;

  private Integer descriptionMinCount;

  private String descriptionMinMax;

  private String descriptionMinMin;

  private Integer ofTypeNameMaxCount;

  private String ofTypeNameMaxMax;

  private String ofTypeNameMaxMin;

  private Integer ofTypeNameMinCount;

  private String ofTypeNameMinMax;

  private String ofTypeNameMinMin;

  private Integer ofTypeNameMaxCount;

  private String ofTypeNameMaxMax;

  private String ofTypeNameMaxMin;

  private Integer ofTypeNameMinCount;

  private String ofTypeNameMinMax;

  private String ofTypeNameMinMin;

  private Integer schemaIdCount;

  private Integer schemaIdSum;

  private Integer schemaIdAvg;

  private Integer schemaIdMax;

  private Integer schemaIdMin;

  private Integer schemaIdCount;

  private Integer schemaIdSum;

  private Integer schemaIdAvg;

  private Integer schemaIdMax;

  private Integer schemaIdMin;

  private Integer versionCount;

  private Integer versionSum;

  private Integer versionAvg;

  private Integer versionMax;

  private Integer versionMin;

  private Integer versionCount;

  private Integer versionSum;

  private Integer versionAvg;

  private Integer versionMax;

  private Integer versionMin;

  private Integer nameCountCount;

  private Integer nameCountSum;

  private Integer nameCountAvg;

  private Integer nameCountMax;

  private Integer nameCountMin;

  private Integer descriptionCountCount;

  private Integer descriptionCountSum;

  private Integer descriptionCountAvg;

  private Integer descriptionCountMax;

  private Integer descriptionCountMin;

  private Integer nameCountCount;

  private Integer nameCountSum;

  private Integer nameCountAvg;

  private Integer nameCountMax;

  private Integer nameCountMin;

  private Integer descriptionCountCount;

  private Integer descriptionCountSum;

  private Integer descriptionCountAvg;

  private Integer descriptionCountMax;

  private Integer descriptionCountMin;

  private Integer ofTypeNameCountCount;

  private Integer ofTypeNameCountSum;

  private Integer ofTypeNameCountAvg;

  private Integer ofTypeNameCountMax;

  private Integer ofTypeNameCountMin;

  private Integer ofTypeNameCountCount;

  private Integer ofTypeNameCountSum;

  private Integer ofTypeNameCountAvg;

  private Integer ofTypeNameCountMax;

  private Integer ofTypeNameCountMin;

  private Integer schemaIdCountCount;

  private Integer schemaIdCountSum;

  private Integer schemaIdCountAvg;

  private Integer schemaIdCountMax;

  private Integer schemaIdCountMin;

  private Integer schemaIdSumCount;

  private Integer schemaIdSumSum;

  private Integer schemaIdSumAvg;

  private Integer schemaIdSumMax;

  private Integer schemaIdSumMin;

  private Integer schemaIdAvgCount;

  private Integer schemaIdAvgSum;

  private Integer schemaIdAvgAvg;

  private Integer schemaIdAvgMax;

  private Integer schemaIdAvgMin;

  private Integer schemaIdMaxCount;

  private Integer schemaIdMaxSum;

  private Integer schemaIdMaxAvg;

  private Integer schemaIdMaxMax;

  private Integer schemaIdMaxMin;

  private Integer schemaIdMinCount;

  private Integer schemaIdMinSum;

  private Integer schemaIdMinAvg;

  private Integer schemaIdMinMax;

  private Integer schemaIdMinMin;

  private Integer schemaIdCountCount;

  private Integer schemaIdCountSum;

  private Integer schemaIdCountAvg;

  private Integer schemaIdCountMax;

  private Integer schemaIdCountMin;

  private Integer schemaIdSumCount;

  private Integer schemaIdSumSum;

  private Integer schemaIdSumAvg;

  private Integer schemaIdSumMax;

  private Integer schemaIdSumMin;

  private Integer schemaIdAvgCount;

  private Integer schemaIdAvgSum;

  private Integer schemaIdAvgAvg;

  private Integer schemaIdAvgMax;

  private Integer schemaIdAvgMin;

  private Integer schemaIdMaxCount;

  private Integer schemaIdMaxSum;

  private Integer schemaIdMaxAvg;

  private Integer schemaIdMaxMax;

  private Integer schemaIdMaxMin;

  private Integer schemaIdMinCount;

  private Integer schemaIdMinSum;

  private Integer schemaIdMinAvg;

  private Integer schemaIdMinMax;

  private Integer schemaIdMinMin;

  private __Type possibleTypesAggregate;

  private __EnumValue enumValuesAggregate;

  private __Field fieldsAggregate;

  private __Type interfacesAggregate;

  private __Type interfacesAggregate;

  private __Type possibleTypesAggregate;

  private __InputValue inputFieldsAggregate;

  private __Field fieldsAggregate;

  private __EnumValue enumValuesAggregate;

  private __InputValue inputFieldsAggregate;

  private __TypeConnection possibleTypesConnection;

  private __EnumValueConnection enumValuesConnection;

  private __FieldConnection fieldsConnection;

  private __TypeConnection interfacesConnection;

  private __TypeConnection interfacesConnection;

  private __TypeConnection possibleTypesConnection;

  private __InputValueConnection inputFieldsConnection;

  private __FieldConnection fieldsConnection;

  private __EnumValueConnection enumValuesConnection;

  private __InputValueConnection inputFieldsConnection;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Collection<__Type> getPossibleTypes() {
    return this.possibleTypes;
  }

  public void setPossibleTypes(Collection<__Type> possibleTypes) {
    this.possibleTypes = possibleTypes;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Collection<__EnumValue> getEnumValues() {
    return this.enumValues;
  }

  public void setEnumValues(Collection<__EnumValue> enumValues) {
    this.enumValues = enumValues;
  }

  public __Type getOfType() {
    return this.ofType;
  }

  public void setOfType(__Type ofType) {
    this.ofType = ofType;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getSchemaId() {
    return this.schemaId;
  }

  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }

  public Integer getSchemaId() {
    return this.schemaId;
  }

  public void setSchemaId(Integer schemaId) {
    this.schemaId = schemaId;
  }

  public Collection<__Field> getFields() {
    return this.fields;
  }

  public void setFields(Collection<__Field> fields) {
    this.fields = fields;
  }

  public Collection<__Type> getInterfaces() {
    return this.interfaces;
  }

  public void setInterfaces(Collection<__Type> interfaces) {
    this.interfaces = interfaces;
  }

  public Collection<__Type> getInterfaces() {
    return this.interfaces;
  }

  public void setInterfaces(Collection<__Type> interfaces) {
    this.interfaces = interfaces;
  }

  public __TypeKind getKind() {
    return this.kind;
  }

  public void setKind(__TypeKind kind) {
    this.kind = kind;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Collection<__Type> getPossibleTypes() {
    return this.possibleTypes;
  }

  public void setPossibleTypes(Collection<__Type> possibleTypes) {
    this.possibleTypes = possibleTypes;
  }

  public __Type getOfType() {
    return this.ofType;
  }

  public void setOfType(__Type ofType) {
    this.ofType = ofType;
  }

  public Collection<__InputValue> getInputFields() {
    return this.inputFields;
  }

  public void setInputFields(Collection<__InputValue> inputFields) {
    this.inputFields = inputFields;
  }

  public Collection<__Field> getFields() {
    return this.fields;
  }

  public void setFields(Collection<__Field> fields) {
    this.fields = fields;
  }

  public Collection<__EnumValue> getEnumValues() {
    return this.enumValues;
  }

  public void setEnumValues(Collection<__EnumValue> enumValues) {
    this.enumValues = enumValues;
  }

  public __TypeKind getKind() {
    return this.kind;
  }

  public void setKind(__TypeKind kind) {
    this.kind = kind;
  }

  public Collection<__InputValue> getInputFields() {
    return this.inputFields;
  }

  public void setInputFields(Collection<__InputValue> inputFields) {
    this.inputFields = inputFields;
  }

  public String getOfTypeName() {
    return this.ofTypeName;
  }

  public void setOfTypeName(String ofTypeName) {
    this.ofTypeName = ofTypeName;
  }

  public String getOfTypeName() {
    return this.ofTypeName;
  }

  public void setOfTypeName(String ofTypeName) {
    this.ofTypeName = ofTypeName;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  @Override
  @Override
  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  @Override
  @Override
  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  @Override
  @Override
  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  @Override
  @Override
  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  @Override
  @Override
  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  @Override
  @Override
  @Override
  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  @Override
  @Override
  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public String getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(String descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public String getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(String descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public String getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(String descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public String getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(String descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Integer getOfTypeNameCount() {
    return this.ofTypeNameCount;
  }

  public void setOfTypeNameCount(Integer ofTypeNameCount) {
    this.ofTypeNameCount = ofTypeNameCount;
  }

  public String getOfTypeNameMax() {
    return this.ofTypeNameMax;
  }

  public void setOfTypeNameMax(String ofTypeNameMax) {
    this.ofTypeNameMax = ofTypeNameMax;
  }

  public String getOfTypeNameMin() {
    return this.ofTypeNameMin;
  }

  public void setOfTypeNameMin(String ofTypeNameMin) {
    this.ofTypeNameMin = ofTypeNameMin;
  }

  public Integer getOfTypeNameCount() {
    return this.ofTypeNameCount;
  }

  public void setOfTypeNameCount(Integer ofTypeNameCount) {
    this.ofTypeNameCount = ofTypeNameCount;
  }

  public String getOfTypeNameMax() {
    return this.ofTypeNameMax;
  }

  public void setOfTypeNameMax(String ofTypeNameMax) {
    this.ofTypeNameMax = ofTypeNameMax;
  }

  public String getOfTypeNameMin() {
    return this.ofTypeNameMin;
  }

  public void setOfTypeNameMin(String ofTypeNameMin) {
    this.ofTypeNameMin = ofTypeNameMin;
  }

  public Integer getSchemaIdCount() {
    return this.schemaIdCount;
  }

  public void setSchemaIdCount(Integer schemaIdCount) {
    this.schemaIdCount = schemaIdCount;
  }

  public Integer getSchemaIdSum() {
    return this.schemaIdSum;
  }

  public void setSchemaIdSum(Integer schemaIdSum) {
    this.schemaIdSum = schemaIdSum;
  }

  public Integer getSchemaIdAvg() {
    return this.schemaIdAvg;
  }

  public void setSchemaIdAvg(Integer schemaIdAvg) {
    this.schemaIdAvg = schemaIdAvg;
  }

  public Integer getSchemaIdMax() {
    return this.schemaIdMax;
  }

  public void setSchemaIdMax(Integer schemaIdMax) {
    this.schemaIdMax = schemaIdMax;
  }

  public Integer getSchemaIdMin() {
    return this.schemaIdMin;
  }

  public void setSchemaIdMin(Integer schemaIdMin) {
    this.schemaIdMin = schemaIdMin;
  }

  public Integer getSchemaIdCount() {
    return this.schemaIdCount;
  }

  public void setSchemaIdCount(Integer schemaIdCount) {
    this.schemaIdCount = schemaIdCount;
  }

  public Integer getSchemaIdSum() {
    return this.schemaIdSum;
  }

  public void setSchemaIdSum(Integer schemaIdSum) {
    this.schemaIdSum = schemaIdSum;
  }

  public Integer getSchemaIdAvg() {
    return this.schemaIdAvg;
  }

  public void setSchemaIdAvg(Integer schemaIdAvg) {
    this.schemaIdAvg = schemaIdAvg;
  }

  public Integer getSchemaIdMax() {
    return this.schemaIdMax;
  }

  public void setSchemaIdMax(Integer schemaIdMax) {
    this.schemaIdMax = schemaIdMax;
  }

  public Integer getSchemaIdMin() {
    return this.schemaIdMin;
  }

  public void setSchemaIdMin(Integer schemaIdMin) {
    this.schemaIdMin = schemaIdMin;
  }

  public __Type getPossibleTypesAggregate() {
    return this.possibleTypesAggregate;
  }

  public void setPossibleTypesAggregate(__Type possibleTypesAggregate) {
    this.possibleTypesAggregate = possibleTypesAggregate;
  }

  public __EnumValue getEnumValuesAggregate() {
    return this.enumValuesAggregate;
  }

  public void setEnumValuesAggregate(__EnumValue enumValuesAggregate) {
    this.enumValuesAggregate = enumValuesAggregate;
  }

  public __Field getFieldsAggregate() {
    return this.fieldsAggregate;
  }

  public void setFieldsAggregate(__Field fieldsAggregate) {
    this.fieldsAggregate = fieldsAggregate;
  }

  public __Type getInterfacesAggregate() {
    return this.interfacesAggregate;
  }

  public void setInterfacesAggregate(__Type interfacesAggregate) {
    this.interfacesAggregate = interfacesAggregate;
  }

  public __Type getInterfacesAggregate() {
    return this.interfacesAggregate;
  }

  public void setInterfacesAggregate(__Type interfacesAggregate) {
    this.interfacesAggregate = interfacesAggregate;
  }

  public __Type getPossibleTypesAggregate() {
    return this.possibleTypesAggregate;
  }

  public void setPossibleTypesAggregate(__Type possibleTypesAggregate) {
    this.possibleTypesAggregate = possibleTypesAggregate;
  }

  public __InputValue getInputFieldsAggregate() {
    return this.inputFieldsAggregate;
  }

  public void setInputFieldsAggregate(__InputValue inputFieldsAggregate) {
    this.inputFieldsAggregate = inputFieldsAggregate;
  }

  public __Field getFieldsAggregate() {
    return this.fieldsAggregate;
  }

  public void setFieldsAggregate(__Field fieldsAggregate) {
    this.fieldsAggregate = fieldsAggregate;
  }

  public __EnumValue getEnumValuesAggregate() {
    return this.enumValuesAggregate;
  }

  public void setEnumValuesAggregate(__EnumValue enumValuesAggregate) {
    this.enumValuesAggregate = enumValuesAggregate;
  }

  public __InputValue getInputFieldsAggregate() {
    return this.inputFieldsAggregate;
  }

  public void setInputFieldsAggregate(__InputValue inputFieldsAggregate) {
    this.inputFieldsAggregate = inputFieldsAggregate;
  }

  public __TypeConnection getPossibleTypesConnection() {
    return this.possibleTypesConnection;
  }

  public void setPossibleTypesConnection(__TypeConnection possibleTypesConnection) {
    this.possibleTypesConnection = possibleTypesConnection;
  }

  public __EnumValueConnection getEnumValuesConnection() {
    return this.enumValuesConnection;
  }

  public void setEnumValuesConnection(__EnumValueConnection enumValuesConnection) {
    this.enumValuesConnection = enumValuesConnection;
  }

  public __FieldConnection getFieldsConnection() {
    return this.fieldsConnection;
  }

  public void setFieldsConnection(__FieldConnection fieldsConnection) {
    this.fieldsConnection = fieldsConnection;
  }

  public __TypeConnection getInterfacesConnection() {
    return this.interfacesConnection;
  }

  public void setInterfacesConnection(__TypeConnection interfacesConnection) {
    this.interfacesConnection = interfacesConnection;
  }

  public __TypeConnection getInterfacesConnection() {
    return this.interfacesConnection;
  }

  public void setInterfacesConnection(__TypeConnection interfacesConnection) {
    this.interfacesConnection = interfacesConnection;
  }

  public __TypeConnection getPossibleTypesConnection() {
    return this.possibleTypesConnection;
  }

  public void setPossibleTypesConnection(__TypeConnection possibleTypesConnection) {
    this.possibleTypesConnection = possibleTypesConnection;
  }

  public __InputValueConnection getInputFieldsConnection() {
    return this.inputFieldsConnection;
  }

  public void setInputFieldsConnection(__InputValueConnection inputFieldsConnection) {
    this.inputFieldsConnection = inputFieldsConnection;
  }

  public __FieldConnection getFieldsConnection() {
    return this.fieldsConnection;
  }

  public void setFieldsConnection(__FieldConnection fieldsConnection) {
    this.fieldsConnection = fieldsConnection;
  }

  public __EnumValueConnection getEnumValuesConnection() {
    return this.enumValuesConnection;
  }

  public void setEnumValuesConnection(__EnumValueConnection enumValuesConnection) {
    this.enumValuesConnection = enumValuesConnection;
  }

  public __InputValueConnection getInputFieldsConnection() {
    return this.inputFieldsConnection;
  }

  public void setInputFieldsConnection(__InputValueConnection inputFieldsConnection) {
    this.inputFieldsConnection = inputFieldsConnection;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public String getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(String descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public String getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(String descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getDescriptionCount() {
    return this.descriptionCount;
  }

  public void setDescriptionCount(Integer descriptionCount) {
    this.descriptionCount = descriptionCount;
  }

  public String getDescriptionMax() {
    return this.descriptionMax;
  }

  public void setDescriptionMax(String descriptionMax) {
    this.descriptionMax = descriptionMax;
  }

  public String getDescriptionMin() {
    return this.descriptionMin;
  }

  public void setDescriptionMin(String descriptionMin) {
    this.descriptionMin = descriptionMin;
  }

  public Integer getOfTypeNameCount() {
    return this.ofTypeNameCount;
  }

  public void setOfTypeNameCount(Integer ofTypeNameCount) {
    this.ofTypeNameCount = ofTypeNameCount;
  }

  public String getOfTypeNameMax() {
    return this.ofTypeNameMax;
  }

  public void setOfTypeNameMax(String ofTypeNameMax) {
    this.ofTypeNameMax = ofTypeNameMax;
  }

  public String getOfTypeNameMin() {
    return this.ofTypeNameMin;
  }

  public void setOfTypeNameMin(String ofTypeNameMin) {
    this.ofTypeNameMin = ofTypeNameMin;
  }

  public Integer getOfTypeNameCount() {
    return this.ofTypeNameCount;
  }

  public void setOfTypeNameCount(Integer ofTypeNameCount) {
    this.ofTypeNameCount = ofTypeNameCount;
  }

  public String getOfTypeNameMax() {
    return this.ofTypeNameMax;
  }

  public void setOfTypeNameMax(String ofTypeNameMax) {
    this.ofTypeNameMax = ofTypeNameMax;
  }

  public String getOfTypeNameMin() {
    return this.ofTypeNameMin;
  }

  public void setOfTypeNameMin(String ofTypeNameMin) {
    this.ofTypeNameMin = ofTypeNameMin;
  }

  public Integer getCreateUserIdCount() {
    return this.createUserIdCount;
  }

  public void setCreateUserIdCount(Integer createUserIdCount) {
    this.createUserIdCount = createUserIdCount;
  }

  public String getCreateUserIdMax() {
    return this.createUserIdMax;
  }

  public void setCreateUserIdMax(String createUserIdMax) {
    this.createUserIdMax = createUserIdMax;
  }

  public String getCreateUserIdMin() {
    return this.createUserIdMin;
  }

  public void setCreateUserIdMin(String createUserIdMin) {
    this.createUserIdMin = createUserIdMin;
  }

  public Integer getCreateUserIdCount() {
    return this.createUserIdCount;
  }

  public void setCreateUserIdCount(Integer createUserIdCount) {
    this.createUserIdCount = createUserIdCount;
  }

  public String getCreateUserIdMax() {
    return this.createUserIdMax;
  }

  public void setCreateUserIdMax(String createUserIdMax) {
    this.createUserIdMax = createUserIdMax;
  }

  public String getCreateUserIdMin() {
    return this.createUserIdMin;
  }

  public void setCreateUserIdMin(String createUserIdMin) {
    this.createUserIdMin = createUserIdMin;
  }

  public Integer getUpdateUserIdCount() {
    return this.updateUserIdCount;
  }

  public void setUpdateUserIdCount(Integer updateUserIdCount) {
    this.updateUserIdCount = updateUserIdCount;
  }

  public String getUpdateUserIdMax() {
    return this.updateUserIdMax;
  }

  public void setUpdateUserIdMax(String updateUserIdMax) {
    this.updateUserIdMax = updateUserIdMax;
  }

  public String getUpdateUserIdMin() {
    return this.updateUserIdMin;
  }

  public void setUpdateUserIdMin(String updateUserIdMin) {
    this.updateUserIdMin = updateUserIdMin;
  }

  public Integer getCreateTimeCount() {
    return this.createTimeCount;
  }

  public void setCreateTimeCount(Integer createTimeCount) {
    this.createTimeCount = createTimeCount;
  }

  public LocalDateTime getCreateTimeMax() {
    return this.createTimeMax;
  }

  public void setCreateTimeMax(LocalDateTime createTimeMax) {
    this.createTimeMax = createTimeMax;
  }

  public LocalDateTime getCreateTimeMin() {
    return this.createTimeMin;
  }

  public void setCreateTimeMin(LocalDateTime createTimeMin) {
    this.createTimeMin = createTimeMin;
  }

  public Integer getUpdateTimeCount() {
    return this.updateTimeCount;
  }

  public void setUpdateTimeCount(Integer updateTimeCount) {
    this.updateTimeCount = updateTimeCount;
  }

  public LocalDateTime getUpdateTimeMax() {
    return this.updateTimeMax;
  }

  public void setUpdateTimeMax(LocalDateTime updateTimeMax) {
    this.updateTimeMax = updateTimeMax;
  }

  public LocalDateTime getUpdateTimeMin() {
    return this.updateTimeMin;
  }

  public void setUpdateTimeMin(LocalDateTime updateTimeMin) {
    this.updateTimeMin = updateTimeMin;
  }

  public Integer getRealmIdCount() {
    return this.realmIdCount;
  }

  public void setRealmIdCount(Integer realmIdCount) {
    this.realmIdCount = realmIdCount;
  }

  public String getRealmIdMax() {
    return this.realmIdMax;
  }

  public void setRealmIdMax(String realmIdMax) {
    this.realmIdMax = realmIdMax;
  }

  public String getRealmIdMin() {
    return this.realmIdMin;
  }

  public void setRealmIdMin(String realmIdMin) {
    this.realmIdMin = realmIdMin;
  }

  public Integer getRealmIdCount() {
    return this.realmIdCount;
  }

  public void setRealmIdCount(Integer realmIdCount) {
    this.realmIdCount = realmIdCount;
  }

  public String getRealmIdMax() {
    return this.realmIdMax;
  }

  public void setRealmIdMax(String realmIdMax) {
    this.realmIdMax = realmIdMax;
  }

  public String getRealmIdMin() {
    return this.realmIdMin;
  }

  public void setRealmIdMin(String realmIdMin) {
    this.realmIdMin = realmIdMin;
  }

  public Integer getUpdateUserIdCount() {
    return this.updateUserIdCount;
  }

  public void setUpdateUserIdCount(Integer updateUserIdCount) {
    this.updateUserIdCount = updateUserIdCount;
  }

  public String getUpdateUserIdMax() {
    return this.updateUserIdMax;
  }

  public void setUpdateUserIdMax(String updateUserIdMax) {
    this.updateUserIdMax = updateUserIdMax;
  }

  public String getUpdateUserIdMin() {
    return this.updateUserIdMin;
  }

  public void setUpdateUserIdMin(String updateUserIdMin) {
    this.updateUserIdMin = updateUserIdMin;
  }

  public Integer getCreateGroupIdCount() {
    return this.createGroupIdCount;
  }

  public void setCreateGroupIdCount(Integer createGroupIdCount) {
    this.createGroupIdCount = createGroupIdCount;
  }

  public String getCreateGroupIdMax() {
    return this.createGroupIdMax;
  }

  public void setCreateGroupIdMax(String createGroupIdMax) {
    this.createGroupIdMax = createGroupIdMax;
  }

  public String getCreateGroupIdMin() {
    return this.createGroupIdMin;
  }

  public void setCreateGroupIdMin(String createGroupIdMin) {
    this.createGroupIdMin = createGroupIdMin;
  }

  public Integer getCreateTimeCount() {
    return this.createTimeCount;
  }

  public void setCreateTimeCount(Integer createTimeCount) {
    this.createTimeCount = createTimeCount;
  }

  public LocalDateTime getCreateTimeMax() {
    return this.createTimeMax;
  }

  public void setCreateTimeMax(LocalDateTime createTimeMax) {
    this.createTimeMax = createTimeMax;
  }

  public LocalDateTime getCreateTimeMin() {
    return this.createTimeMin;
  }

  public void setCreateTimeMin(LocalDateTime createTimeMin) {
    this.createTimeMin = createTimeMin;
  }

  public Integer getUpdateTimeCount() {
    return this.updateTimeCount;
  }

  public void setUpdateTimeCount(Integer updateTimeCount) {
    this.updateTimeCount = updateTimeCount;
  }

  public LocalDateTime getUpdateTimeMax() {
    return this.updateTimeMax;
  }

  public void setUpdateTimeMax(LocalDateTime updateTimeMax) {
    this.updateTimeMax = updateTimeMax;
  }

  public LocalDateTime getUpdateTimeMin() {
    return this.updateTimeMin;
  }

  public void setUpdateTimeMin(LocalDateTime updateTimeMin) {
    this.updateTimeMin = updateTimeMin;
  }

  public Integer getCreateGroupIdCount() {
    return this.createGroupIdCount;
  }

  public void setCreateGroupIdCount(Integer createGroupIdCount) {
    this.createGroupIdCount = createGroupIdCount;
  }

  public String getCreateGroupIdMax() {
    return this.createGroupIdMax;
  }

  public void setCreateGroupIdMax(String createGroupIdMax) {
    this.createGroupIdMax = createGroupIdMax;
  }

  public String getCreateGroupIdMin() {
    return this.createGroupIdMin;
  }

  public void setCreateGroupIdMin(String createGroupIdMin) {
    this.createGroupIdMin = createGroupIdMin;
  }

  public Integer get__TypenameCount() {
    return this.__typenameCount;
  }

  public void set__TypenameCount(Integer __typenameCount) {
    this.__typenameCount = __typenameCount;
  }

  public String get__TypenameMax() {
    return this.__typenameMax;
  }

  public void set__TypenameMax(String __typenameMax) {
    this.__typenameMax = __typenameMax;
  }

  public String get__TypenameMin() {
    return this.__typenameMin;
  }

  public void set__TypenameMin(String __typenameMin) {
    this.__typenameMin = __typenameMin;
  }

  public Integer getNameMaxCount() {
    return this.nameMaxCount;
  }

  public void setNameMaxCount(Integer nameMaxCount) {
    this.nameMaxCount = nameMaxCount;
  }

  public String getNameMaxMax() {
    return this.nameMaxMax;
  }

  public void setNameMaxMax(String nameMaxMax) {
    this.nameMaxMax = nameMaxMax;
  }

  public String getNameMaxMin() {
    return this.nameMaxMin;
  }

  public void setNameMaxMin(String nameMaxMin) {
    this.nameMaxMin = nameMaxMin;
  }

  public Integer getNameMinCount() {
    return this.nameMinCount;
  }

  public void setNameMinCount(Integer nameMinCount) {
    this.nameMinCount = nameMinCount;
  }

  public String getNameMinMax() {
    return this.nameMinMax;
  }

  public void setNameMinMax(String nameMinMax) {
    this.nameMinMax = nameMinMax;
  }

  public String getNameMinMin() {
    return this.nameMinMin;
  }

  public void setNameMinMin(String nameMinMin) {
    this.nameMinMin = nameMinMin;
  }

  public Integer getDescriptionMaxCount() {
    return this.descriptionMaxCount;
  }

  public void setDescriptionMaxCount(Integer descriptionMaxCount) {
    this.descriptionMaxCount = descriptionMaxCount;
  }

  public String getDescriptionMaxMax() {
    return this.descriptionMaxMax;
  }

  public void setDescriptionMaxMax(String descriptionMaxMax) {
    this.descriptionMaxMax = descriptionMaxMax;
  }

  public String getDescriptionMaxMin() {
    return this.descriptionMaxMin;
  }

  public void setDescriptionMaxMin(String descriptionMaxMin) {
    this.descriptionMaxMin = descriptionMaxMin;
  }

  public Integer getDescriptionMinCount() {
    return this.descriptionMinCount;
  }

  public void setDescriptionMinCount(Integer descriptionMinCount) {
    this.descriptionMinCount = descriptionMinCount;
  }

  public String getDescriptionMinMax() {
    return this.descriptionMinMax;
  }

  public void setDescriptionMinMax(String descriptionMinMax) {
    this.descriptionMinMax = descriptionMinMax;
  }

  public String getDescriptionMinMin() {
    return this.descriptionMinMin;
  }

  public void setDescriptionMinMin(String descriptionMinMin) {
    this.descriptionMinMin = descriptionMinMin;
  }

  public Integer getNameMaxCount() {
    return this.nameMaxCount;
  }

  public void setNameMaxCount(Integer nameMaxCount) {
    this.nameMaxCount = nameMaxCount;
  }

  public String getNameMaxMax() {
    return this.nameMaxMax;
  }

  public void setNameMaxMax(String nameMaxMax) {
    this.nameMaxMax = nameMaxMax;
  }

  public String getNameMaxMin() {
    return this.nameMaxMin;
  }

  public void setNameMaxMin(String nameMaxMin) {
    this.nameMaxMin = nameMaxMin;
  }

  public Integer getNameMinCount() {
    return this.nameMinCount;
  }

  public void setNameMinCount(Integer nameMinCount) {
    this.nameMinCount = nameMinCount;
  }

  public String getNameMinMax() {
    return this.nameMinMax;
  }

  public void setNameMinMax(String nameMinMax) {
    this.nameMinMax = nameMinMax;
  }

  public String getNameMinMin() {
    return this.nameMinMin;
  }

  public void setNameMinMin(String nameMinMin) {
    this.nameMinMin = nameMinMin;
  }

  public Integer getDescriptionMaxCount() {
    return this.descriptionMaxCount;
  }

  public void setDescriptionMaxCount(Integer descriptionMaxCount) {
    this.descriptionMaxCount = descriptionMaxCount;
  }

  public String getDescriptionMaxMax() {
    return this.descriptionMaxMax;
  }

  public void setDescriptionMaxMax(String descriptionMaxMax) {
    this.descriptionMaxMax = descriptionMaxMax;
  }

  public String getDescriptionMaxMin() {
    return this.descriptionMaxMin;
  }

  public void setDescriptionMaxMin(String descriptionMaxMin) {
    this.descriptionMaxMin = descriptionMaxMin;
  }

  public Integer getDescriptionMinCount() {
    return this.descriptionMinCount;
  }

  public void setDescriptionMinCount(Integer descriptionMinCount) {
    this.descriptionMinCount = descriptionMinCount;
  }

  public String getDescriptionMinMax() {
    return this.descriptionMinMax;
  }

  public void setDescriptionMinMax(String descriptionMinMax) {
    this.descriptionMinMax = descriptionMinMax;
  }

  public String getDescriptionMinMin() {
    return this.descriptionMinMin;
  }

  public void setDescriptionMinMin(String descriptionMinMin) {
    this.descriptionMinMin = descriptionMinMin;
  }

  public Integer getOfTypeNameMaxCount() {
    return this.ofTypeNameMaxCount;
  }

  public void setOfTypeNameMaxCount(Integer ofTypeNameMaxCount) {
    this.ofTypeNameMaxCount = ofTypeNameMaxCount;
  }

  public String getOfTypeNameMaxMax() {
    return this.ofTypeNameMaxMax;
  }

  public void setOfTypeNameMaxMax(String ofTypeNameMaxMax) {
    this.ofTypeNameMaxMax = ofTypeNameMaxMax;
  }

  public String getOfTypeNameMaxMin() {
    return this.ofTypeNameMaxMin;
  }

  public void setOfTypeNameMaxMin(String ofTypeNameMaxMin) {
    this.ofTypeNameMaxMin = ofTypeNameMaxMin;
  }

  public Integer getOfTypeNameMinCount() {
    return this.ofTypeNameMinCount;
  }

  public void setOfTypeNameMinCount(Integer ofTypeNameMinCount) {
    this.ofTypeNameMinCount = ofTypeNameMinCount;
  }

  public String getOfTypeNameMinMax() {
    return this.ofTypeNameMinMax;
  }

  public void setOfTypeNameMinMax(String ofTypeNameMinMax) {
    this.ofTypeNameMinMax = ofTypeNameMinMax;
  }

  public String getOfTypeNameMinMin() {
    return this.ofTypeNameMinMin;
  }

  public void setOfTypeNameMinMin(String ofTypeNameMinMin) {
    this.ofTypeNameMinMin = ofTypeNameMinMin;
  }

  public Integer getOfTypeNameMaxCount() {
    return this.ofTypeNameMaxCount;
  }

  public void setOfTypeNameMaxCount(Integer ofTypeNameMaxCount) {
    this.ofTypeNameMaxCount = ofTypeNameMaxCount;
  }

  public String getOfTypeNameMaxMax() {
    return this.ofTypeNameMaxMax;
  }

  public void setOfTypeNameMaxMax(String ofTypeNameMaxMax) {
    this.ofTypeNameMaxMax = ofTypeNameMaxMax;
  }

  public String getOfTypeNameMaxMin() {
    return this.ofTypeNameMaxMin;
  }

  public void setOfTypeNameMaxMin(String ofTypeNameMaxMin) {
    this.ofTypeNameMaxMin = ofTypeNameMaxMin;
  }

  public Integer getOfTypeNameMinCount() {
    return this.ofTypeNameMinCount;
  }

  public void setOfTypeNameMinCount(Integer ofTypeNameMinCount) {
    this.ofTypeNameMinCount = ofTypeNameMinCount;
  }

  public String getOfTypeNameMinMax() {
    return this.ofTypeNameMinMax;
  }

  public void setOfTypeNameMinMax(String ofTypeNameMinMax) {
    this.ofTypeNameMinMax = ofTypeNameMinMax;
  }

  public String getOfTypeNameMinMin() {
    return this.ofTypeNameMinMin;
  }

  public void setOfTypeNameMinMin(String ofTypeNameMinMin) {
    this.ofTypeNameMinMin = ofTypeNameMinMin;
  }

  public Integer getSchemaIdCount() {
    return this.schemaIdCount;
  }

  public void setSchemaIdCount(Integer schemaIdCount) {
    this.schemaIdCount = schemaIdCount;
  }

  public Integer getSchemaIdSum() {
    return this.schemaIdSum;
  }

  public void setSchemaIdSum(Integer schemaIdSum) {
    this.schemaIdSum = schemaIdSum;
  }

  public Integer getSchemaIdAvg() {
    return this.schemaIdAvg;
  }

  public void setSchemaIdAvg(Integer schemaIdAvg) {
    this.schemaIdAvg = schemaIdAvg;
  }

  public Integer getSchemaIdMax() {
    return this.schemaIdMax;
  }

  public void setSchemaIdMax(Integer schemaIdMax) {
    this.schemaIdMax = schemaIdMax;
  }

  public Integer getSchemaIdMin() {
    return this.schemaIdMin;
  }

  public void setSchemaIdMin(Integer schemaIdMin) {
    this.schemaIdMin = schemaIdMin;
  }

  public Integer getSchemaIdCount() {
    return this.schemaIdCount;
  }

  public void setSchemaIdCount(Integer schemaIdCount) {
    this.schemaIdCount = schemaIdCount;
  }

  public Integer getSchemaIdSum() {
    return this.schemaIdSum;
  }

  public void setSchemaIdSum(Integer schemaIdSum) {
    this.schemaIdSum = schemaIdSum;
  }

  public Integer getSchemaIdAvg() {
    return this.schemaIdAvg;
  }

  public void setSchemaIdAvg(Integer schemaIdAvg) {
    this.schemaIdAvg = schemaIdAvg;
  }

  public Integer getSchemaIdMax() {
    return this.schemaIdMax;
  }

  public void setSchemaIdMax(Integer schemaIdMax) {
    this.schemaIdMax = schemaIdMax;
  }

  public Integer getSchemaIdMin() {
    return this.schemaIdMin;
  }

  public void setSchemaIdMin(Integer schemaIdMin) {
    this.schemaIdMin = schemaIdMin;
  }

  public Integer getVersionCount() {
    return this.versionCount;
  }

  public void setVersionCount(Integer versionCount) {
    this.versionCount = versionCount;
  }

  public Integer getVersionSum() {
    return this.versionSum;
  }

  public void setVersionSum(Integer versionSum) {
    this.versionSum = versionSum;
  }

  public Integer getVersionAvg() {
    return this.versionAvg;
  }

  public void setVersionAvg(Integer versionAvg) {
    this.versionAvg = versionAvg;
  }

  public Integer getVersionMax() {
    return this.versionMax;
  }

  public void setVersionMax(Integer versionMax) {
    this.versionMax = versionMax;
  }

  public Integer getVersionMin() {
    return this.versionMin;
  }

  public void setVersionMin(Integer versionMin) {
    this.versionMin = versionMin;
  }

  public Integer getVersionCount() {
    return this.versionCount;
  }

  public void setVersionCount(Integer versionCount) {
    this.versionCount = versionCount;
  }

  public Integer getVersionSum() {
    return this.versionSum;
  }

  public void setVersionSum(Integer versionSum) {
    this.versionSum = versionSum;
  }

  public Integer getVersionAvg() {
    return this.versionAvg;
  }

  public void setVersionAvg(Integer versionAvg) {
    this.versionAvg = versionAvg;
  }

  public Integer getVersionMax() {
    return this.versionMax;
  }

  public void setVersionMax(Integer versionMax) {
    this.versionMax = versionMax;
  }

  public Integer getVersionMin() {
    return this.versionMin;
  }

  public void setVersionMin(Integer versionMin) {
    this.versionMin = versionMin;
  }

  public Integer getNameCountCount() {
    return this.nameCountCount;
  }

  public void setNameCountCount(Integer nameCountCount) {
    this.nameCountCount = nameCountCount;
  }

  public Integer getNameCountSum() {
    return this.nameCountSum;
  }

  public void setNameCountSum(Integer nameCountSum) {
    this.nameCountSum = nameCountSum;
  }

  public Integer getNameCountAvg() {
    return this.nameCountAvg;
  }

  public void setNameCountAvg(Integer nameCountAvg) {
    this.nameCountAvg = nameCountAvg;
  }

  public Integer getNameCountMax() {
    return this.nameCountMax;
  }

  public void setNameCountMax(Integer nameCountMax) {
    this.nameCountMax = nameCountMax;
  }

  public Integer getNameCountMin() {
    return this.nameCountMin;
  }

  public void setNameCountMin(Integer nameCountMin) {
    this.nameCountMin = nameCountMin;
  }

  public Integer getDescriptionCountCount() {
    return this.descriptionCountCount;
  }

  public void setDescriptionCountCount(Integer descriptionCountCount) {
    this.descriptionCountCount = descriptionCountCount;
  }

  public Integer getDescriptionCountSum() {
    return this.descriptionCountSum;
  }

  public void setDescriptionCountSum(Integer descriptionCountSum) {
    this.descriptionCountSum = descriptionCountSum;
  }

  public Integer getDescriptionCountAvg() {
    return this.descriptionCountAvg;
  }

  public void setDescriptionCountAvg(Integer descriptionCountAvg) {
    this.descriptionCountAvg = descriptionCountAvg;
  }

  public Integer getDescriptionCountMax() {
    return this.descriptionCountMax;
  }

  public void setDescriptionCountMax(Integer descriptionCountMax) {
    this.descriptionCountMax = descriptionCountMax;
  }

  public Integer getDescriptionCountMin() {
    return this.descriptionCountMin;
  }

  public void setDescriptionCountMin(Integer descriptionCountMin) {
    this.descriptionCountMin = descriptionCountMin;
  }

  public Integer getNameCountCount() {
    return this.nameCountCount;
  }

  public void setNameCountCount(Integer nameCountCount) {
    this.nameCountCount = nameCountCount;
  }

  public Integer getNameCountSum() {
    return this.nameCountSum;
  }

  public void setNameCountSum(Integer nameCountSum) {
    this.nameCountSum = nameCountSum;
  }

  public Integer getNameCountAvg() {
    return this.nameCountAvg;
  }

  public void setNameCountAvg(Integer nameCountAvg) {
    this.nameCountAvg = nameCountAvg;
  }

  public Integer getNameCountMax() {
    return this.nameCountMax;
  }

  public void setNameCountMax(Integer nameCountMax) {
    this.nameCountMax = nameCountMax;
  }

  public Integer getNameCountMin() {
    return this.nameCountMin;
  }

  public void setNameCountMin(Integer nameCountMin) {
    this.nameCountMin = nameCountMin;
  }

  public Integer getDescriptionCountCount() {
    return this.descriptionCountCount;
  }

  public void setDescriptionCountCount(Integer descriptionCountCount) {
    this.descriptionCountCount = descriptionCountCount;
  }

  public Integer getDescriptionCountSum() {
    return this.descriptionCountSum;
  }

  public void setDescriptionCountSum(Integer descriptionCountSum) {
    this.descriptionCountSum = descriptionCountSum;
  }

  public Integer getDescriptionCountAvg() {
    return this.descriptionCountAvg;
  }

  public void setDescriptionCountAvg(Integer descriptionCountAvg) {
    this.descriptionCountAvg = descriptionCountAvg;
  }

  public Integer getDescriptionCountMax() {
    return this.descriptionCountMax;
  }

  public void setDescriptionCountMax(Integer descriptionCountMax) {
    this.descriptionCountMax = descriptionCountMax;
  }

  public Integer getDescriptionCountMin() {
    return this.descriptionCountMin;
  }

  public void setDescriptionCountMin(Integer descriptionCountMin) {
    this.descriptionCountMin = descriptionCountMin;
  }

  public Integer getOfTypeNameCountCount() {
    return this.ofTypeNameCountCount;
  }

  public void setOfTypeNameCountCount(Integer ofTypeNameCountCount) {
    this.ofTypeNameCountCount = ofTypeNameCountCount;
  }

  public Integer getOfTypeNameCountSum() {
    return this.ofTypeNameCountSum;
  }

  public void setOfTypeNameCountSum(Integer ofTypeNameCountSum) {
    this.ofTypeNameCountSum = ofTypeNameCountSum;
  }

  public Integer getOfTypeNameCountAvg() {
    return this.ofTypeNameCountAvg;
  }

  public void setOfTypeNameCountAvg(Integer ofTypeNameCountAvg) {
    this.ofTypeNameCountAvg = ofTypeNameCountAvg;
  }

  public Integer getOfTypeNameCountMax() {
    return this.ofTypeNameCountMax;
  }

  public void setOfTypeNameCountMax(Integer ofTypeNameCountMax) {
    this.ofTypeNameCountMax = ofTypeNameCountMax;
  }

  public Integer getOfTypeNameCountMin() {
    return this.ofTypeNameCountMin;
  }

  public void setOfTypeNameCountMin(Integer ofTypeNameCountMin) {
    this.ofTypeNameCountMin = ofTypeNameCountMin;
  }

  public Integer getOfTypeNameCountCount() {
    return this.ofTypeNameCountCount;
  }

  public void setOfTypeNameCountCount(Integer ofTypeNameCountCount) {
    this.ofTypeNameCountCount = ofTypeNameCountCount;
  }

  public Integer getOfTypeNameCountSum() {
    return this.ofTypeNameCountSum;
  }

  public void setOfTypeNameCountSum(Integer ofTypeNameCountSum) {
    this.ofTypeNameCountSum = ofTypeNameCountSum;
  }

  public Integer getOfTypeNameCountAvg() {
    return this.ofTypeNameCountAvg;
  }

  public void setOfTypeNameCountAvg(Integer ofTypeNameCountAvg) {
    this.ofTypeNameCountAvg = ofTypeNameCountAvg;
  }

  public Integer getOfTypeNameCountMax() {
    return this.ofTypeNameCountMax;
  }

  public void setOfTypeNameCountMax(Integer ofTypeNameCountMax) {
    this.ofTypeNameCountMax = ofTypeNameCountMax;
  }

  public Integer getOfTypeNameCountMin() {
    return this.ofTypeNameCountMin;
  }

  public void setOfTypeNameCountMin(Integer ofTypeNameCountMin) {
    this.ofTypeNameCountMin = ofTypeNameCountMin;
  }

  public Integer getSchemaIdCountCount() {
    return this.schemaIdCountCount;
  }

  public void setSchemaIdCountCount(Integer schemaIdCountCount) {
    this.schemaIdCountCount = schemaIdCountCount;
  }

  public Integer getSchemaIdCountSum() {
    return this.schemaIdCountSum;
  }

  public void setSchemaIdCountSum(Integer schemaIdCountSum) {
    this.schemaIdCountSum = schemaIdCountSum;
  }

  public Integer getSchemaIdCountAvg() {
    return this.schemaIdCountAvg;
  }

  public void setSchemaIdCountAvg(Integer schemaIdCountAvg) {
    this.schemaIdCountAvg = schemaIdCountAvg;
  }

  public Integer getSchemaIdCountMax() {
    return this.schemaIdCountMax;
  }

  public void setSchemaIdCountMax(Integer schemaIdCountMax) {
    this.schemaIdCountMax = schemaIdCountMax;
  }

  public Integer getSchemaIdCountMin() {
    return this.schemaIdCountMin;
  }

  public void setSchemaIdCountMin(Integer schemaIdCountMin) {
    this.schemaIdCountMin = schemaIdCountMin;
  }

  public Integer getSchemaIdSumCount() {
    return this.schemaIdSumCount;
  }

  public void setSchemaIdSumCount(Integer schemaIdSumCount) {
    this.schemaIdSumCount = schemaIdSumCount;
  }

  public Integer getSchemaIdSumSum() {
    return this.schemaIdSumSum;
  }

  public void setSchemaIdSumSum(Integer schemaIdSumSum) {
    this.schemaIdSumSum = schemaIdSumSum;
  }

  public Integer getSchemaIdSumAvg() {
    return this.schemaIdSumAvg;
  }

  public void setSchemaIdSumAvg(Integer schemaIdSumAvg) {
    this.schemaIdSumAvg = schemaIdSumAvg;
  }

  public Integer getSchemaIdSumMax() {
    return this.schemaIdSumMax;
  }

  public void setSchemaIdSumMax(Integer schemaIdSumMax) {
    this.schemaIdSumMax = schemaIdSumMax;
  }

  public Integer getSchemaIdSumMin() {
    return this.schemaIdSumMin;
  }

  public void setSchemaIdSumMin(Integer schemaIdSumMin) {
    this.schemaIdSumMin = schemaIdSumMin;
  }

  public Integer getSchemaIdAvgCount() {
    return this.schemaIdAvgCount;
  }

  public void setSchemaIdAvgCount(Integer schemaIdAvgCount) {
    this.schemaIdAvgCount = schemaIdAvgCount;
  }

  public Integer getSchemaIdAvgSum() {
    return this.schemaIdAvgSum;
  }

  public void setSchemaIdAvgSum(Integer schemaIdAvgSum) {
    this.schemaIdAvgSum = schemaIdAvgSum;
  }

  public Integer getSchemaIdAvgAvg() {
    return this.schemaIdAvgAvg;
  }

  public void setSchemaIdAvgAvg(Integer schemaIdAvgAvg) {
    this.schemaIdAvgAvg = schemaIdAvgAvg;
  }

  public Integer getSchemaIdAvgMax() {
    return this.schemaIdAvgMax;
  }

  public void setSchemaIdAvgMax(Integer schemaIdAvgMax) {
    this.schemaIdAvgMax = schemaIdAvgMax;
  }

  public Integer getSchemaIdAvgMin() {
    return this.schemaIdAvgMin;
  }

  public void setSchemaIdAvgMin(Integer schemaIdAvgMin) {
    this.schemaIdAvgMin = schemaIdAvgMin;
  }

  public Integer getSchemaIdMaxCount() {
    return this.schemaIdMaxCount;
  }

  public void setSchemaIdMaxCount(Integer schemaIdMaxCount) {
    this.schemaIdMaxCount = schemaIdMaxCount;
  }

  public Integer getSchemaIdMaxSum() {
    return this.schemaIdMaxSum;
  }

  public void setSchemaIdMaxSum(Integer schemaIdMaxSum) {
    this.schemaIdMaxSum = schemaIdMaxSum;
  }

  public Integer getSchemaIdMaxAvg() {
    return this.schemaIdMaxAvg;
  }

  public void setSchemaIdMaxAvg(Integer schemaIdMaxAvg) {
    this.schemaIdMaxAvg = schemaIdMaxAvg;
  }

  public Integer getSchemaIdMaxMax() {
    return this.schemaIdMaxMax;
  }

  public void setSchemaIdMaxMax(Integer schemaIdMaxMax) {
    this.schemaIdMaxMax = schemaIdMaxMax;
  }

  public Integer getSchemaIdMaxMin() {
    return this.schemaIdMaxMin;
  }

  public void setSchemaIdMaxMin(Integer schemaIdMaxMin) {
    this.schemaIdMaxMin = schemaIdMaxMin;
  }

  public Integer getSchemaIdMinCount() {
    return this.schemaIdMinCount;
  }

  public void setSchemaIdMinCount(Integer schemaIdMinCount) {
    this.schemaIdMinCount = schemaIdMinCount;
  }

  public Integer getSchemaIdMinSum() {
    return this.schemaIdMinSum;
  }

  public void setSchemaIdMinSum(Integer schemaIdMinSum) {
    this.schemaIdMinSum = schemaIdMinSum;
  }

  public Integer getSchemaIdMinAvg() {
    return this.schemaIdMinAvg;
  }

  public void setSchemaIdMinAvg(Integer schemaIdMinAvg) {
    this.schemaIdMinAvg = schemaIdMinAvg;
  }

  public Integer getSchemaIdMinMax() {
    return this.schemaIdMinMax;
  }

  public void setSchemaIdMinMax(Integer schemaIdMinMax) {
    this.schemaIdMinMax = schemaIdMinMax;
  }

  public Integer getSchemaIdMinMin() {
    return this.schemaIdMinMin;
  }

  public void setSchemaIdMinMin(Integer schemaIdMinMin) {
    this.schemaIdMinMin = schemaIdMinMin;
  }

  public Integer getSchemaIdCountCount() {
    return this.schemaIdCountCount;
  }

  public void setSchemaIdCountCount(Integer schemaIdCountCount) {
    this.schemaIdCountCount = schemaIdCountCount;
  }

  public Integer getSchemaIdCountSum() {
    return this.schemaIdCountSum;
  }

  public void setSchemaIdCountSum(Integer schemaIdCountSum) {
    this.schemaIdCountSum = schemaIdCountSum;
  }

  public Integer getSchemaIdCountAvg() {
    return this.schemaIdCountAvg;
  }

  public void setSchemaIdCountAvg(Integer schemaIdCountAvg) {
    this.schemaIdCountAvg = schemaIdCountAvg;
  }

  public Integer getSchemaIdCountMax() {
    return this.schemaIdCountMax;
  }

  public void setSchemaIdCountMax(Integer schemaIdCountMax) {
    this.schemaIdCountMax = schemaIdCountMax;
  }

  public Integer getSchemaIdCountMin() {
    return this.schemaIdCountMin;
  }

  public void setSchemaIdCountMin(Integer schemaIdCountMin) {
    this.schemaIdCountMin = schemaIdCountMin;
  }

  public Integer getSchemaIdSumCount() {
    return this.schemaIdSumCount;
  }

  public void setSchemaIdSumCount(Integer schemaIdSumCount) {
    this.schemaIdSumCount = schemaIdSumCount;
  }

  public Integer getSchemaIdSumSum() {
    return this.schemaIdSumSum;
  }

  public void setSchemaIdSumSum(Integer schemaIdSumSum) {
    this.schemaIdSumSum = schemaIdSumSum;
  }

  public Integer getSchemaIdSumAvg() {
    return this.schemaIdSumAvg;
  }

  public void setSchemaIdSumAvg(Integer schemaIdSumAvg) {
    this.schemaIdSumAvg = schemaIdSumAvg;
  }

  public Integer getSchemaIdSumMax() {
    return this.schemaIdSumMax;
  }

  public void setSchemaIdSumMax(Integer schemaIdSumMax) {
    this.schemaIdSumMax = schemaIdSumMax;
  }

  public Integer getSchemaIdSumMin() {
    return this.schemaIdSumMin;
  }

  public void setSchemaIdSumMin(Integer schemaIdSumMin) {
    this.schemaIdSumMin = schemaIdSumMin;
  }

  public Integer getSchemaIdAvgCount() {
    return this.schemaIdAvgCount;
  }

  public void setSchemaIdAvgCount(Integer schemaIdAvgCount) {
    this.schemaIdAvgCount = schemaIdAvgCount;
  }

  public Integer getSchemaIdAvgSum() {
    return this.schemaIdAvgSum;
  }

  public void setSchemaIdAvgSum(Integer schemaIdAvgSum) {
    this.schemaIdAvgSum = schemaIdAvgSum;
  }

  public Integer getSchemaIdAvgAvg() {
    return this.schemaIdAvgAvg;
  }

  public void setSchemaIdAvgAvg(Integer schemaIdAvgAvg) {
    this.schemaIdAvgAvg = schemaIdAvgAvg;
  }

  public Integer getSchemaIdAvgMax() {
    return this.schemaIdAvgMax;
  }

  public void setSchemaIdAvgMax(Integer schemaIdAvgMax) {
    this.schemaIdAvgMax = schemaIdAvgMax;
  }

  public Integer getSchemaIdAvgMin() {
    return this.schemaIdAvgMin;
  }

  public void setSchemaIdAvgMin(Integer schemaIdAvgMin) {
    this.schemaIdAvgMin = schemaIdAvgMin;
  }

  public Integer getSchemaIdMaxCount() {
    return this.schemaIdMaxCount;
  }

  public void setSchemaIdMaxCount(Integer schemaIdMaxCount) {
    this.schemaIdMaxCount = schemaIdMaxCount;
  }

  public Integer getSchemaIdMaxSum() {
    return this.schemaIdMaxSum;
  }

  public void setSchemaIdMaxSum(Integer schemaIdMaxSum) {
    this.schemaIdMaxSum = schemaIdMaxSum;
  }

  public Integer getSchemaIdMaxAvg() {
    return this.schemaIdMaxAvg;
  }

  public void setSchemaIdMaxAvg(Integer schemaIdMaxAvg) {
    this.schemaIdMaxAvg = schemaIdMaxAvg;
  }

  public Integer getSchemaIdMaxMax() {
    return this.schemaIdMaxMax;
  }

  public void setSchemaIdMaxMax(Integer schemaIdMaxMax) {
    this.schemaIdMaxMax = schemaIdMaxMax;
  }

  public Integer getSchemaIdMaxMin() {
    return this.schemaIdMaxMin;
  }

  public void setSchemaIdMaxMin(Integer schemaIdMaxMin) {
    this.schemaIdMaxMin = schemaIdMaxMin;
  }

  public Integer getSchemaIdMinCount() {
    return this.schemaIdMinCount;
  }

  public void setSchemaIdMinCount(Integer schemaIdMinCount) {
    this.schemaIdMinCount = schemaIdMinCount;
  }

  public Integer getSchemaIdMinSum() {
    return this.schemaIdMinSum;
  }

  public void setSchemaIdMinSum(Integer schemaIdMinSum) {
    this.schemaIdMinSum = schemaIdMinSum;
  }

  public Integer getSchemaIdMinAvg() {
    return this.schemaIdMinAvg;
  }

  public void setSchemaIdMinAvg(Integer schemaIdMinAvg) {
    this.schemaIdMinAvg = schemaIdMinAvg;
  }

  public Integer getSchemaIdMinMax() {
    return this.schemaIdMinMax;
  }

  public void setSchemaIdMinMax(Integer schemaIdMinMax) {
    this.schemaIdMinMax = schemaIdMinMax;
  }

  public Integer getSchemaIdMinMin() {
    return this.schemaIdMinMin;
  }

  public void setSchemaIdMinMin(Integer schemaIdMinMin) {
    this.schemaIdMinMin = schemaIdMinMin;
  }

  public __Type getPossibleTypesAggregate() {
    return this.possibleTypesAggregate;
  }

  public void setPossibleTypesAggregate(__Type possibleTypesAggregate) {
    this.possibleTypesAggregate = possibleTypesAggregate;
  }

  public __EnumValue getEnumValuesAggregate() {
    return this.enumValuesAggregate;
  }

  public void setEnumValuesAggregate(__EnumValue enumValuesAggregate) {
    this.enumValuesAggregate = enumValuesAggregate;
  }

  public __Field getFieldsAggregate() {
    return this.fieldsAggregate;
  }

  public void setFieldsAggregate(__Field fieldsAggregate) {
    this.fieldsAggregate = fieldsAggregate;
  }

  public __Type getInterfacesAggregate() {
    return this.interfacesAggregate;
  }

  public void setInterfacesAggregate(__Type interfacesAggregate) {
    this.interfacesAggregate = interfacesAggregate;
  }

  public __Type getInterfacesAggregate() {
    return this.interfacesAggregate;
  }

  public void setInterfacesAggregate(__Type interfacesAggregate) {
    this.interfacesAggregate = interfacesAggregate;
  }

  public __Type getPossibleTypesAggregate() {
    return this.possibleTypesAggregate;
  }

  public void setPossibleTypesAggregate(__Type possibleTypesAggregate) {
    this.possibleTypesAggregate = possibleTypesAggregate;
  }

  public __InputValue getInputFieldsAggregate() {
    return this.inputFieldsAggregate;
  }

  public void setInputFieldsAggregate(__InputValue inputFieldsAggregate) {
    this.inputFieldsAggregate = inputFieldsAggregate;
  }

  public __Field getFieldsAggregate() {
    return this.fieldsAggregate;
  }

  public void setFieldsAggregate(__Field fieldsAggregate) {
    this.fieldsAggregate = fieldsAggregate;
  }

  public __EnumValue getEnumValuesAggregate() {
    return this.enumValuesAggregate;
  }

  public void setEnumValuesAggregate(__EnumValue enumValuesAggregate) {
    this.enumValuesAggregate = enumValuesAggregate;
  }

  public __InputValue getInputFieldsAggregate() {
    return this.inputFieldsAggregate;
  }

  public void setInputFieldsAggregate(__InputValue inputFieldsAggregate) {
    this.inputFieldsAggregate = inputFieldsAggregate;
  }

  public __TypeConnection getPossibleTypesConnection() {
    return this.possibleTypesConnection;
  }

  public void setPossibleTypesConnection(__TypeConnection possibleTypesConnection) {
    this.possibleTypesConnection = possibleTypesConnection;
  }

  public __EnumValueConnection getEnumValuesConnection() {
    return this.enumValuesConnection;
  }

  public void setEnumValuesConnection(__EnumValueConnection enumValuesConnection) {
    this.enumValuesConnection = enumValuesConnection;
  }

  public __FieldConnection getFieldsConnection() {
    return this.fieldsConnection;
  }

  public void setFieldsConnection(__FieldConnection fieldsConnection) {
    this.fieldsConnection = fieldsConnection;
  }

  public __TypeConnection getInterfacesConnection() {
    return this.interfacesConnection;
  }

  public void setInterfacesConnection(__TypeConnection interfacesConnection) {
    this.interfacesConnection = interfacesConnection;
  }

  public __TypeConnection getInterfacesConnection() {
    return this.interfacesConnection;
  }

  public void setInterfacesConnection(__TypeConnection interfacesConnection) {
    this.interfacesConnection = interfacesConnection;
  }

  public __TypeConnection getPossibleTypesConnection() {
    return this.possibleTypesConnection;
  }

  public void setPossibleTypesConnection(__TypeConnection possibleTypesConnection) {
    this.possibleTypesConnection = possibleTypesConnection;
  }

  public __InputValueConnection getInputFieldsConnection() {
    return this.inputFieldsConnection;
  }

  public void setInputFieldsConnection(__InputValueConnection inputFieldsConnection) {
    this.inputFieldsConnection = inputFieldsConnection;
  }

  public __FieldConnection getFieldsConnection() {
    return this.fieldsConnection;
  }

  public void setFieldsConnection(__FieldConnection fieldsConnection) {
    this.fieldsConnection = fieldsConnection;
  }

  public __EnumValueConnection getEnumValuesConnection() {
    return this.enumValuesConnection;
  }

  public void setEnumValuesConnection(__EnumValueConnection enumValuesConnection) {
    this.enumValuesConnection = enumValuesConnection;
  }

  public __InputValueConnection getInputFieldsConnection() {
    return this.inputFieldsConnection;
  }

  public void setInputFieldsConnection(__InputValueConnection inputFieldsConnection) {
    this.inputFieldsConnection = inputFieldsConnection;
  }
}
