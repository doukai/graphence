package null.dto.objectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import null.dto.interfaceType.Meta;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class __Schema implements Meta {
  @Id
  private String id;

  private String queryTypeName;

  private String mutationTypeName;

  private String subscriptionTypeName;

  @NonNull
  private Collection<__Type> types;

  @NonNull
  private __Type queryType;

  private __Type mutationType;

  private __Type subscriptionType;

  @NonNull
  private Collection<__Directive> directives;

  private Boolean isDeprecated;

  private Integer version;

  private String realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer queryTypeNameCount;

  private String queryTypeNameMax;

  private String queryTypeNameMin;

  private Integer mutationTypeNameCount;

  private String mutationTypeNameMax;

  private String mutationTypeNameMin;

  private Integer subscriptionTypeNameCount;

  private String subscriptionTypeNameMax;

  private String subscriptionTypeNameMin;

  private __Type typesAggregate;

  private __Directive directivesAggregate;

  private __TypeConnection typesConnection;

  private __DirectiveConnection directivesConnection;

  private String __typename;

  private Integer idCount;

  @Id
  private String idMax;

  @Id
  private String idMin;

  private Integer queryTypeNameCount;

  private String queryTypeNameMax;

  private String queryTypeNameMin;

  private Integer mutationTypeNameCount;

  private String mutationTypeNameMax;

  private String mutationTypeNameMin;

  private Integer subscriptionTypeNameCount;

  private String subscriptionTypeNameMax;

  private String subscriptionTypeNameMin;

  private Integer realmIdCount;

  private String realmIdMax;

  private String realmIdMin;

  private Integer createUserIdCount;

  private String createUserIdMax;

  private String createUserIdMin;

  private Integer createTimeCount;

  private LocalDateTime createTimeMax;

  private LocalDateTime createTimeMin;

  private Integer updateUserIdCount;

  private String updateUserIdMax;

  private String updateUserIdMin;

  private Integer updateTimeCount;

  private LocalDateTime updateTimeMax;

  private LocalDateTime updateTimeMin;

  private Integer createGroupIdCount;

  private String createGroupIdMax;

  private String createGroupIdMin;

  private Integer __typenameCount;

  private String __typenameMax;

  private String __typenameMin;

  private Integer idMaxCount;

  @Id
  private String idMaxMax;

  @Id
  private String idMaxMin;

  private Integer idMinCount;

  @Id
  private String idMinMax;

  @Id
  private String idMinMin;

  private Integer queryTypeNameMaxCount;

  private String queryTypeNameMaxMax;

  private String queryTypeNameMaxMin;

  private Integer queryTypeNameMinCount;

  private String queryTypeNameMinMax;

  private String queryTypeNameMinMin;

  private Integer mutationTypeNameMaxCount;

  private String mutationTypeNameMaxMax;

  private String mutationTypeNameMaxMin;

  private Integer mutationTypeNameMinCount;

  private String mutationTypeNameMinMax;

  private String mutationTypeNameMinMin;

  private Integer subscriptionTypeNameMaxCount;

  private String subscriptionTypeNameMaxMax;

  private String subscriptionTypeNameMaxMin;

  private Integer subscriptionTypeNameMinCount;

  private String subscriptionTypeNameMinMax;

  private String subscriptionTypeNameMinMin;

  private Integer versionCount;

  private Integer versionSum;

  private Integer versionAvg;

  private Integer versionMax;

  private Integer versionMin;

  private Integer idCountCount;

  private Integer idCountSum;

  private Integer idCountAvg;

  private Integer idCountMax;

  private Integer idCountMin;

  private Integer queryTypeNameCountCount;

  private Integer queryTypeNameCountSum;

  private Integer queryTypeNameCountAvg;

  private Integer queryTypeNameCountMax;

  private Integer queryTypeNameCountMin;

  private Integer mutationTypeNameCountCount;

  private Integer mutationTypeNameCountSum;

  private Integer mutationTypeNameCountAvg;

  private Integer mutationTypeNameCountMax;

  private Integer mutationTypeNameCountMin;

  private Integer subscriptionTypeNameCountCount;

  private Integer subscriptionTypeNameCountSum;

  private Integer subscriptionTypeNameCountAvg;

  private Integer subscriptionTypeNameCountMax;

  private Integer subscriptionTypeNameCountMin;

  private __Type typesAggregate;

  private __Directive directivesAggregate;

  private __TypeConnection typesConnection;

  private __DirectiveConnection directivesConnection;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getQueryTypeName() {
    return this.queryTypeName;
  }

  public void setQueryTypeName(String queryTypeName) {
    this.queryTypeName = queryTypeName;
  }

  public String getMutationTypeName() {
    return this.mutationTypeName;
  }

  public void setMutationTypeName(String mutationTypeName) {
    this.mutationTypeName = mutationTypeName;
  }

  public String getSubscriptionTypeName() {
    return this.subscriptionTypeName;
  }

  public void setSubscriptionTypeName(String subscriptionTypeName) {
    this.subscriptionTypeName = subscriptionTypeName;
  }

  public Collection<__Type> getTypes() {
    return this.types;
  }

  public void setTypes(Collection<__Type> types) {
    this.types = types;
  }

  public __Type getQueryType() {
    return this.queryType;
  }

  public void setQueryType(__Type queryType) {
    this.queryType = queryType;
  }

  public __Type getMutationType() {
    return this.mutationType;
  }

  public void setMutationType(__Type mutationType) {
    this.mutationType = mutationType;
  }

  public __Type getSubscriptionType() {
    return this.subscriptionType;
  }

  public void setSubscriptionType(__Type subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public Collection<__Directive> getDirectives() {
    return this.directives;
  }

  public void setDirectives(Collection<__Directive> directives) {
    this.directives = directives;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(String realmId) {
    this.realmId = realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public String getIdMax() {
    return this.idMax;
  }

  public void setIdMax(String idMax) {
    this.idMax = idMax;
  }

  public String getIdMin() {
    return this.idMin;
  }

  public void setIdMin(String idMin) {
    this.idMin = idMin;
  }

  public Integer getQueryTypeNameCount() {
    return this.queryTypeNameCount;
  }

  public void setQueryTypeNameCount(Integer queryTypeNameCount) {
    this.queryTypeNameCount = queryTypeNameCount;
  }

  public String getQueryTypeNameMax() {
    return this.queryTypeNameMax;
  }

  public void setQueryTypeNameMax(String queryTypeNameMax) {
    this.queryTypeNameMax = queryTypeNameMax;
  }

  public String getQueryTypeNameMin() {
    return this.queryTypeNameMin;
  }

  public void setQueryTypeNameMin(String queryTypeNameMin) {
    this.queryTypeNameMin = queryTypeNameMin;
  }

  public Integer getMutationTypeNameCount() {
    return this.mutationTypeNameCount;
  }

  public void setMutationTypeNameCount(Integer mutationTypeNameCount) {
    this.mutationTypeNameCount = mutationTypeNameCount;
  }

  public String getMutationTypeNameMax() {
    return this.mutationTypeNameMax;
  }

  public void setMutationTypeNameMax(String mutationTypeNameMax) {
    this.mutationTypeNameMax = mutationTypeNameMax;
  }

  public String getMutationTypeNameMin() {
    return this.mutationTypeNameMin;
  }

  public void setMutationTypeNameMin(String mutationTypeNameMin) {
    this.mutationTypeNameMin = mutationTypeNameMin;
  }

  public Integer getSubscriptionTypeNameCount() {
    return this.subscriptionTypeNameCount;
  }

  public void setSubscriptionTypeNameCount(Integer subscriptionTypeNameCount) {
    this.subscriptionTypeNameCount = subscriptionTypeNameCount;
  }

  public String getSubscriptionTypeNameMax() {
    return this.subscriptionTypeNameMax;
  }

  public void setSubscriptionTypeNameMax(String subscriptionTypeNameMax) {
    this.subscriptionTypeNameMax = subscriptionTypeNameMax;
  }

  public String getSubscriptionTypeNameMin() {
    return this.subscriptionTypeNameMin;
  }

  public void setSubscriptionTypeNameMin(String subscriptionTypeNameMin) {
    this.subscriptionTypeNameMin = subscriptionTypeNameMin;
  }

  public __Type getTypesAggregate() {
    return this.typesAggregate;
  }

  public void setTypesAggregate(__Type typesAggregate) {
    this.typesAggregate = typesAggregate;
  }

  public __Directive getDirectivesAggregate() {
    return this.directivesAggregate;
  }

  public void setDirectivesAggregate(__Directive directivesAggregate) {
    this.directivesAggregate = directivesAggregate;
  }

  public __TypeConnection getTypesConnection() {
    return this.typesConnection;
  }

  public void setTypesConnection(__TypeConnection typesConnection) {
    this.typesConnection = typesConnection;
  }

  public __DirectiveConnection getDirectivesConnection() {
    return this.directivesConnection;
  }

  public void setDirectivesConnection(__DirectiveConnection directivesConnection) {
    this.directivesConnection = directivesConnection;
  }

  public String get__Typename() {
    return this.__typename;
  }

  public void set__Typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public String getIdMax() {
    return this.idMax;
  }

  public void setIdMax(String idMax) {
    this.idMax = idMax;
  }

  public String getIdMin() {
    return this.idMin;
  }

  public void setIdMin(String idMin) {
    this.idMin = idMin;
  }

  public Integer getQueryTypeNameCount() {
    return this.queryTypeNameCount;
  }

  public void setQueryTypeNameCount(Integer queryTypeNameCount) {
    this.queryTypeNameCount = queryTypeNameCount;
  }

  public String getQueryTypeNameMax() {
    return this.queryTypeNameMax;
  }

  public void setQueryTypeNameMax(String queryTypeNameMax) {
    this.queryTypeNameMax = queryTypeNameMax;
  }

  public String getQueryTypeNameMin() {
    return this.queryTypeNameMin;
  }

  public void setQueryTypeNameMin(String queryTypeNameMin) {
    this.queryTypeNameMin = queryTypeNameMin;
  }

  public Integer getMutationTypeNameCount() {
    return this.mutationTypeNameCount;
  }

  public void setMutationTypeNameCount(Integer mutationTypeNameCount) {
    this.mutationTypeNameCount = mutationTypeNameCount;
  }

  public String getMutationTypeNameMax() {
    return this.mutationTypeNameMax;
  }

  public void setMutationTypeNameMax(String mutationTypeNameMax) {
    this.mutationTypeNameMax = mutationTypeNameMax;
  }

  public String getMutationTypeNameMin() {
    return this.mutationTypeNameMin;
  }

  public void setMutationTypeNameMin(String mutationTypeNameMin) {
    this.mutationTypeNameMin = mutationTypeNameMin;
  }

  public Integer getSubscriptionTypeNameCount() {
    return this.subscriptionTypeNameCount;
  }

  public void setSubscriptionTypeNameCount(Integer subscriptionTypeNameCount) {
    this.subscriptionTypeNameCount = subscriptionTypeNameCount;
  }

  public String getSubscriptionTypeNameMax() {
    return this.subscriptionTypeNameMax;
  }

  public void setSubscriptionTypeNameMax(String subscriptionTypeNameMax) {
    this.subscriptionTypeNameMax = subscriptionTypeNameMax;
  }

  public String getSubscriptionTypeNameMin() {
    return this.subscriptionTypeNameMin;
  }

  public void setSubscriptionTypeNameMin(String subscriptionTypeNameMin) {
    this.subscriptionTypeNameMin = subscriptionTypeNameMin;
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

  public Integer getIdMaxCount() {
    return this.idMaxCount;
  }

  public void setIdMaxCount(Integer idMaxCount) {
    this.idMaxCount = idMaxCount;
  }

  public String getIdMaxMax() {
    return this.idMaxMax;
  }

  public void setIdMaxMax(String idMaxMax) {
    this.idMaxMax = idMaxMax;
  }

  public String getIdMaxMin() {
    return this.idMaxMin;
  }

  public void setIdMaxMin(String idMaxMin) {
    this.idMaxMin = idMaxMin;
  }

  public Integer getIdMinCount() {
    return this.idMinCount;
  }

  public void setIdMinCount(Integer idMinCount) {
    this.idMinCount = idMinCount;
  }

  public String getIdMinMax() {
    return this.idMinMax;
  }

  public void setIdMinMax(String idMinMax) {
    this.idMinMax = idMinMax;
  }

  public String getIdMinMin() {
    return this.idMinMin;
  }

  public void setIdMinMin(String idMinMin) {
    this.idMinMin = idMinMin;
  }

  public Integer getQueryTypeNameMaxCount() {
    return this.queryTypeNameMaxCount;
  }

  public void setQueryTypeNameMaxCount(Integer queryTypeNameMaxCount) {
    this.queryTypeNameMaxCount = queryTypeNameMaxCount;
  }

  public String getQueryTypeNameMaxMax() {
    return this.queryTypeNameMaxMax;
  }

  public void setQueryTypeNameMaxMax(String queryTypeNameMaxMax) {
    this.queryTypeNameMaxMax = queryTypeNameMaxMax;
  }

  public String getQueryTypeNameMaxMin() {
    return this.queryTypeNameMaxMin;
  }

  public void setQueryTypeNameMaxMin(String queryTypeNameMaxMin) {
    this.queryTypeNameMaxMin = queryTypeNameMaxMin;
  }

  public Integer getQueryTypeNameMinCount() {
    return this.queryTypeNameMinCount;
  }

  public void setQueryTypeNameMinCount(Integer queryTypeNameMinCount) {
    this.queryTypeNameMinCount = queryTypeNameMinCount;
  }

  public String getQueryTypeNameMinMax() {
    return this.queryTypeNameMinMax;
  }

  public void setQueryTypeNameMinMax(String queryTypeNameMinMax) {
    this.queryTypeNameMinMax = queryTypeNameMinMax;
  }

  public String getQueryTypeNameMinMin() {
    return this.queryTypeNameMinMin;
  }

  public void setQueryTypeNameMinMin(String queryTypeNameMinMin) {
    this.queryTypeNameMinMin = queryTypeNameMinMin;
  }

  public Integer getMutationTypeNameMaxCount() {
    return this.mutationTypeNameMaxCount;
  }

  public void setMutationTypeNameMaxCount(Integer mutationTypeNameMaxCount) {
    this.mutationTypeNameMaxCount = mutationTypeNameMaxCount;
  }

  public String getMutationTypeNameMaxMax() {
    return this.mutationTypeNameMaxMax;
  }

  public void setMutationTypeNameMaxMax(String mutationTypeNameMaxMax) {
    this.mutationTypeNameMaxMax = mutationTypeNameMaxMax;
  }

  public String getMutationTypeNameMaxMin() {
    return this.mutationTypeNameMaxMin;
  }

  public void setMutationTypeNameMaxMin(String mutationTypeNameMaxMin) {
    this.mutationTypeNameMaxMin = mutationTypeNameMaxMin;
  }

  public Integer getMutationTypeNameMinCount() {
    return this.mutationTypeNameMinCount;
  }

  public void setMutationTypeNameMinCount(Integer mutationTypeNameMinCount) {
    this.mutationTypeNameMinCount = mutationTypeNameMinCount;
  }

  public String getMutationTypeNameMinMax() {
    return this.mutationTypeNameMinMax;
  }

  public void setMutationTypeNameMinMax(String mutationTypeNameMinMax) {
    this.mutationTypeNameMinMax = mutationTypeNameMinMax;
  }

  public String getMutationTypeNameMinMin() {
    return this.mutationTypeNameMinMin;
  }

  public void setMutationTypeNameMinMin(String mutationTypeNameMinMin) {
    this.mutationTypeNameMinMin = mutationTypeNameMinMin;
  }

  public Integer getSubscriptionTypeNameMaxCount() {
    return this.subscriptionTypeNameMaxCount;
  }

  public void setSubscriptionTypeNameMaxCount(Integer subscriptionTypeNameMaxCount) {
    this.subscriptionTypeNameMaxCount = subscriptionTypeNameMaxCount;
  }

  public String getSubscriptionTypeNameMaxMax() {
    return this.subscriptionTypeNameMaxMax;
  }

  public void setSubscriptionTypeNameMaxMax(String subscriptionTypeNameMaxMax) {
    this.subscriptionTypeNameMaxMax = subscriptionTypeNameMaxMax;
  }

  public String getSubscriptionTypeNameMaxMin() {
    return this.subscriptionTypeNameMaxMin;
  }

  public void setSubscriptionTypeNameMaxMin(String subscriptionTypeNameMaxMin) {
    this.subscriptionTypeNameMaxMin = subscriptionTypeNameMaxMin;
  }

  public Integer getSubscriptionTypeNameMinCount() {
    return this.subscriptionTypeNameMinCount;
  }

  public void setSubscriptionTypeNameMinCount(Integer subscriptionTypeNameMinCount) {
    this.subscriptionTypeNameMinCount = subscriptionTypeNameMinCount;
  }

  public String getSubscriptionTypeNameMinMax() {
    return this.subscriptionTypeNameMinMax;
  }

  public void setSubscriptionTypeNameMinMax(String subscriptionTypeNameMinMax) {
    this.subscriptionTypeNameMinMax = subscriptionTypeNameMinMax;
  }

  public String getSubscriptionTypeNameMinMin() {
    return this.subscriptionTypeNameMinMin;
  }

  public void setSubscriptionTypeNameMinMin(String subscriptionTypeNameMinMin) {
    this.subscriptionTypeNameMinMin = subscriptionTypeNameMinMin;
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

  public Integer getIdCountCount() {
    return this.idCountCount;
  }

  public void setIdCountCount(Integer idCountCount) {
    this.idCountCount = idCountCount;
  }

  public Integer getIdCountSum() {
    return this.idCountSum;
  }

  public void setIdCountSum(Integer idCountSum) {
    this.idCountSum = idCountSum;
  }

  public Integer getIdCountAvg() {
    return this.idCountAvg;
  }

  public void setIdCountAvg(Integer idCountAvg) {
    this.idCountAvg = idCountAvg;
  }

  public Integer getIdCountMax() {
    return this.idCountMax;
  }

  public void setIdCountMax(Integer idCountMax) {
    this.idCountMax = idCountMax;
  }

  public Integer getIdCountMin() {
    return this.idCountMin;
  }

  public void setIdCountMin(Integer idCountMin) {
    this.idCountMin = idCountMin;
  }

  public Integer getQueryTypeNameCountCount() {
    return this.queryTypeNameCountCount;
  }

  public void setQueryTypeNameCountCount(Integer queryTypeNameCountCount) {
    this.queryTypeNameCountCount = queryTypeNameCountCount;
  }

  public Integer getQueryTypeNameCountSum() {
    return this.queryTypeNameCountSum;
  }

  public void setQueryTypeNameCountSum(Integer queryTypeNameCountSum) {
    this.queryTypeNameCountSum = queryTypeNameCountSum;
  }

  public Integer getQueryTypeNameCountAvg() {
    return this.queryTypeNameCountAvg;
  }

  public void setQueryTypeNameCountAvg(Integer queryTypeNameCountAvg) {
    this.queryTypeNameCountAvg = queryTypeNameCountAvg;
  }

  public Integer getQueryTypeNameCountMax() {
    return this.queryTypeNameCountMax;
  }

  public void setQueryTypeNameCountMax(Integer queryTypeNameCountMax) {
    this.queryTypeNameCountMax = queryTypeNameCountMax;
  }

  public Integer getQueryTypeNameCountMin() {
    return this.queryTypeNameCountMin;
  }

  public void setQueryTypeNameCountMin(Integer queryTypeNameCountMin) {
    this.queryTypeNameCountMin = queryTypeNameCountMin;
  }

  public Integer getMutationTypeNameCountCount() {
    return this.mutationTypeNameCountCount;
  }

  public void setMutationTypeNameCountCount(Integer mutationTypeNameCountCount) {
    this.mutationTypeNameCountCount = mutationTypeNameCountCount;
  }

  public Integer getMutationTypeNameCountSum() {
    return this.mutationTypeNameCountSum;
  }

  public void setMutationTypeNameCountSum(Integer mutationTypeNameCountSum) {
    this.mutationTypeNameCountSum = mutationTypeNameCountSum;
  }

  public Integer getMutationTypeNameCountAvg() {
    return this.mutationTypeNameCountAvg;
  }

  public void setMutationTypeNameCountAvg(Integer mutationTypeNameCountAvg) {
    this.mutationTypeNameCountAvg = mutationTypeNameCountAvg;
  }

  public Integer getMutationTypeNameCountMax() {
    return this.mutationTypeNameCountMax;
  }

  public void setMutationTypeNameCountMax(Integer mutationTypeNameCountMax) {
    this.mutationTypeNameCountMax = mutationTypeNameCountMax;
  }

  public Integer getMutationTypeNameCountMin() {
    return this.mutationTypeNameCountMin;
  }

  public void setMutationTypeNameCountMin(Integer mutationTypeNameCountMin) {
    this.mutationTypeNameCountMin = mutationTypeNameCountMin;
  }

  public Integer getSubscriptionTypeNameCountCount() {
    return this.subscriptionTypeNameCountCount;
  }

  public void setSubscriptionTypeNameCountCount(Integer subscriptionTypeNameCountCount) {
    this.subscriptionTypeNameCountCount = subscriptionTypeNameCountCount;
  }

  public Integer getSubscriptionTypeNameCountSum() {
    return this.subscriptionTypeNameCountSum;
  }

  public void setSubscriptionTypeNameCountSum(Integer subscriptionTypeNameCountSum) {
    this.subscriptionTypeNameCountSum = subscriptionTypeNameCountSum;
  }

  public Integer getSubscriptionTypeNameCountAvg() {
    return this.subscriptionTypeNameCountAvg;
  }

  public void setSubscriptionTypeNameCountAvg(Integer subscriptionTypeNameCountAvg) {
    this.subscriptionTypeNameCountAvg = subscriptionTypeNameCountAvg;
  }

  public Integer getSubscriptionTypeNameCountMax() {
    return this.subscriptionTypeNameCountMax;
  }

  public void setSubscriptionTypeNameCountMax(Integer subscriptionTypeNameCountMax) {
    this.subscriptionTypeNameCountMax = subscriptionTypeNameCountMax;
  }

  public Integer getSubscriptionTypeNameCountMin() {
    return this.subscriptionTypeNameCountMin;
  }

  public void setSubscriptionTypeNameCountMin(Integer subscriptionTypeNameCountMin) {
    this.subscriptionTypeNameCountMin = subscriptionTypeNameCountMin;
  }

  public __Type getTypesAggregate() {
    return this.typesAggregate;
  }

  public void setTypesAggregate(__Type typesAggregate) {
    this.typesAggregate = typesAggregate;
  }

  public __Directive getDirectivesAggregate() {
    return this.directivesAggregate;
  }

  public void setDirectivesAggregate(__Directive directivesAggregate) {
    this.directivesAggregate = directivesAggregate;
  }

  public __TypeConnection getTypesConnection() {
    return this.typesConnection;
  }

  public void setTypesConnection(__TypeConnection typesConnection) {
    this.typesConnection = typesConnection;
  }

  public __DirectiveConnection getDirectivesConnection() {
    return this.directivesConnection;
  }

  public void setDirectivesConnection(__DirectiveConnection directivesConnection) {
    this.directivesConnection = directivesConnection;
  }
}
