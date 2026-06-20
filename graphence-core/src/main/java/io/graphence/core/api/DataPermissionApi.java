package io.graphence.core.api;

import io.graphence.core.dto.Current;
import io.graphence.core.dto.enumType.DataPermissionLevel;
import io.graphence.core.dto.inputObjectType.*;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import io.nozdormu.spi.async.Async;
import io.nozdormu.spi.async.Asyncable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;
import reactor.core.publisher.Mono;

@GraphQLApi
@ApplicationScoped
public class DataPermissionApi implements Asyncable {

  private final Provider<Mono<Current>> currentMonoProvider;

  @Inject
  public DataPermissionApi(Provider<Mono<Current>> currentMonoProvider) {
    this.currentMonoProvider = currentMonoProvider;
  }

  @Async(defaultIfEmpty = "createByExpression")
  public CreateByExpression createByExpression(@Source CreateByExpression createByExpression) {
    Current current = await(currentMonoProvider.get());
    if (current.getDataPermissionLevel() != null) {
      if (current.getDataPermissionLevel().equals(DataPermissionLevel.SELF_ONLY.ordinal())) {
        StringExpression stringExpression = new StringExpression();
        stringExpression.setOpr(Operator.EQ);
        stringExpression.setVal(current.getId());
        createByExpression.setCreateUserId(stringExpression);
      } else if (!current.getDataPermissionLevel().equals(DataPermissionLevel.ALL.ordinal())) {
        StringExpression stringExpression = new StringExpression();
        stringExpression.setOpr(Operator.IN);
        stringExpression.setArr(current.getGroups());
        createByExpression.setCreateGroupId(stringExpression);
      }
    }
    return createByExpression;
  }
}
