package io.graphence.core.event;

import com.google.auto.service.AutoService;
import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.config.SecurityConfig;
import io.graphence.core.dto.inputObjectType.UserMutationArguments;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.operation.Arguments;
import io.graphoenix.core.operation.Field;
import io.graphoenix.core.operation.Operation;
import io.graphoenix.spi.handler.OperationHandler;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Initialized;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Map;

import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;

@Initialized(ApplicationScoped.class)
@Priority(3)
@AutoService(ScopeEvent.class)
public class RootUserBuildEvent implements ScopeEvent {

    private final OperationHandler operationHandler;
    private final SecurityConfig securityConfig;

    public RootUserBuildEvent() {
        this.operationHandler = BeanContext.get(OperationHandler.class);
        this.securityConfig = BeanContext.get(SecurityConfig.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (securityConfig.getRootUser() == null || securityConfig.getRootPassword() == null) {
            return Mono.empty();
        }
        LocalDateTime now = LocalDateTime.now();
        UserMutationArguments arguments = new UserMutationArguments();
        Hash hash = Password.hash(securityConfig.getRootPassword()).withBcrypt();
        arguments.setId("0");
        arguments.setName(securityConfig.getRootUser());
        arguments.setLogin(securityConfig.getRootUser());
        arguments.setSalt(Base64.getEncoder().encodeToString(hash.getSaltBytes()));
        arguments.setHash(Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
        arguments.setCreateTime(now);
        Operation operation = new Operation()
                .setOperationType("mutation")
                .addField(
                        new Field("user")
                                .setArguments(new Arguments(arguments))
                                .addField(new Field("id"))
                );
        return operationHandler.mutation(DOCUMENT_UTIL.graphqlToOperation(operation.toString())).then();
    }
}
