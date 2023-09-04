package io.graphence.core.meta;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.core.handler.MetaInputInvoker;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Objects;

@ApplicationScoped
public class UserInputInvoker implements MetaInputInvoker {

    private final Provider<Mono<CurrentUser>> currentUserMonoProvider;

    @Inject
    public UserInputInvoker(Provider<Mono<CurrentUser>> currentUserMonoProvider) {
        this.currentUserMonoProvider = currentUserMonoProvider;
    }

    @Override
    public Mono<MetaInput> invoke(String typeName, MetaInput metaInput) {
        return currentUserMonoProvider.get().map(currentUser -> {
                    MetaInput newInput = Objects.requireNonNullElseGet(metaInput, MetaInput::new);
                    if (currentUser.getRealmId() != null) {
                        newInput.setRealmId(currentUser.getRealmId());
                    }
                    LocalDateTime now = LocalDateTime.now();
                    if (newInput.getCreateUserId() == null) {
                        newInput.setCreateUserId(currentUser.getId());
                        newInput.setCreateTime(now);
                    } else {
                        newInput.setUpdateUserId(currentUser.getId());
                        newInput.setUpdateTime(now);
                    }
                    newInput.setVersion(newInput.getVersion() == null ? 0 : newInput.getVersion() + 1);
                    return newInput;
                }
        );
    }
}
