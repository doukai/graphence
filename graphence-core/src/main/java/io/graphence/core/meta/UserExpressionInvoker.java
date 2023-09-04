package io.graphence.core.meta;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.handler.MetaExpressionInvoker;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import reactor.core.publisher.Mono;

import java.util.Objects;

@ApplicationScoped
public class UserExpressionInvoker implements MetaExpressionInvoker {

    private final Provider<Mono<CurrentUser>> currentUserMonoProvider;

    @Inject
    public UserExpressionInvoker(Provider<Mono<CurrentUser>> currentUserMonoProvider) {
        this.currentUserMonoProvider = currentUserMonoProvider;
    }

    @Override
    public Mono<MetaExpression> invoke(String typeName, MetaExpression metaExpression) {
        return currentUserMonoProvider.get().flatMap(currentUser -> {
                    if (currentUser.getRealmId() != null) {
                        MetaExpression newExpression = Objects.requireNonNullElseGet(metaExpression, MetaExpression::new);
                        IntExpression intExpression = new IntExpression();
                        intExpression.setVal(currentUser.getRealmId());
                        newExpression.setRealmId(intExpression);
                        return Mono.just(newExpression);
                    }
                    return Mono.justOrEmpty(metaExpression);
                }
        );
    }
}
