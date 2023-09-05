package io.graphence.core.meta;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.core.error.GraphQLErrorType;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.core.handler.OperationInterceptor;
import io.graphoenix.core.operation.Operation;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.spi.JsonProvider;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.Objects;

@ApplicationScoped
public class UserInputInvoker implements OperationInterceptor {

    private final IGraphQLDocumentManager manager;
    private final JsonProvider jsonProvider;
    private final Provider<Mono<CurrentUser>> currentUserMonoProvider;

    @Inject
    public UserInputInvoker(IGraphQLDocumentManager manager, JsonProvider jsonProvider, Provider<Mono<CurrentUser>> currentUserMonoProvider) {
        this.manager = manager;
        this.jsonProvider = jsonProvider;
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

    @Override
    public Mono<Operation> invoke(Operation operation) {

        LocalDateTime now = LocalDateTime.now();

        return currentUserMonoProvider.get().map(currentUser -> {

                    if (operation.getName().equals("mutation")) {
                        String typeName = manager.getMutationOperationTypeName().orElseThrow(() -> new GraphQLErrors(GraphQLErrorType.MUTATION_TYPE_NOT_EXIST));
                        operation.getFields().stream()
                                .filter(field -> manager.isNotInvokeField(typeName, field.getName()))
                                .filter(field -> manager.isObject(manager.getFieldTypeName(manager.getField(typeName, field.getName()).orElseThrow().type())))
                                .forEach(field -> {
                                    JsonObjectBuilder argumentsBuilder = jsonProvider.createObjectBuilder(field.getArguments());
                                    argumentsBuilder.add("realmId",currentUser.getRealmId());
                                    if(field.getArguments().containsKey("createUserId")){

                                    }else {

                                        argumentsBuilder.add("createUserId",currentUser.getId())
                                                .add("createTime",now.toString());
                                    }


                                    field.setArguments(argumentsBuilder.build());

                                        }

                                )
                    } else {

                    }


                    return operation;
                }
        );
    }

    public JsonObject invokeField(JsonObject jsonObject) {


    }
}
