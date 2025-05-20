package io.graphence.security.event;

import io.graphence.core.dto.Current;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.handler.DocumentManager;
import io.graphoenix.spi.graphql.Definition;
import io.graphoenix.spi.graphql.common.ValueWithVariable;
import io.graphoenix.spi.graphql.operation.Field;
import io.graphoenix.spi.graphql.operation.Operation;
import io.graphoenix.spi.graphql.type.FieldDefinition;
import io.graphoenix.spi.graphql.type.ObjectType;
import io.graphoenix.spi.handler.OperationBeforeHandler;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import jakarta.json.JsonValue;
import org.casbin.jcasbin.main.Enforcer;
import reactor.core.publisher.Mono;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.*;
import static io.graphence.core.dto.enumType.PermissionType.*;
import static io.graphoenix.core.handler.before.FragmentHandler.FRAGMENT_HANDLER_PRIORITY;
import static io.graphoenix.spi.constant.Hammurabi.*;

@ApplicationScoped
@Priority(RBACFilter.RBAC_FILTER_PRIORITY)
public class RBACFilter implements OperationBeforeHandler {

    public static final int RBAC_FILTER_PRIORITY = FRAGMENT_HANDLER_PRIORITY + 10;

    private final DocumentManager documentManager;
    private final Enforcer enforcer;
    private final Provider<Mono<Current>> currentUserMonoProvider;

    @Inject
    public RBACFilter(DocumentManager documentManager, Enforcer enforcer, Provider<Mono<Current>> currentUserMonoProvider) {
        this.documentManager = documentManager;
        this.enforcer = enforcer;
        this.currentUserMonoProvider = currentUserMonoProvider;
    }

    @Override
    public Mono<Operation> handle(Operation operation, Map<String, JsonValue> variables) {
        ObjectType operationType = documentManager.getOperationTypeOrError(operation);
        return currentUserMonoProvider.get()
                .map(currentUser ->
                        operation.setSelections(
                                operation.getFields().stream()
                                        .flatMap(field -> {
                                                    FieldDefinition fieldDefinition = operationType.getField(field.getName());
                                                    if (fieldDefinition.isInvokeField()) {
                                                        return enforceApi(currentUser, operationType, fieldDefinition, field, documentManager.isMutationOperationType(operation) ? WRITE : READ);
                                                    } else if (field.getFields() != null) {
                                                        return enforce(currentUser, operationType, fieldDefinition, field);
                                                    }
                                                    return Stream.of(field);
                                                }
                                        )
                                        .map(field -> {
                                                    if (documentManager.isMutationOperationType(operation) && field.getArguments() != null) {
                                                        return field.setArguments(enforce(currentUser, operationType.getField(field.getName()), field.getArguments().getArguments()));
                                                    }
                                                    return field;
                                                }
                                        )
                                        .collect(Collectors.toList())
                        )
                )
                .switchIfEmpty(
                        Mono.defer(() ->
                                Mono.just(
                                        operation.setSelections(
                                                operation.getFields().stream()
                                                        .filter(field -> {
                                                                    FieldDefinition fieldDefinition = operationType.getField(field.getName());
                                                                    return !fieldDefinition.isDenyAll() && fieldDefinition.isPermitAll();
                                                                }
                                                        )
                                                        .collect(Collectors.toList())
                                        )
                                )
                        )
                );
    }

    protected Stream<Field> enforceApi(Current current, ObjectType objectType, FieldDefinition fieldDefinition, Field field, PermissionType permissionType) {
        if (!fieldDefinition.isDenyAll() &&
                (fieldDefinition.isPermitAll() ||
                        enforcer.enforce(
                                USER_PREFIX + current.getId(),
                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                ANY.name() + SPACER + ANY.name(),
                                ANY.name()
                        ) ||
                        enforcer.enforce(
                                USER_PREFIX + current.getId(),
                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                ANY.name() + SPACER + ANY.name(),
                                permissionType.name()
                        ) ||
                        enforcer.enforce(
                                USER_PREFIX + current.getId(),
                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                objectType.getName() + SPACER + ANY.name(),
                                ANY.name()
                        ) ||
                        enforcer.enforce(
                                USER_PREFIX + current.getId(),
                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                objectType.getName() + SPACER + ANY.name(),
                                permissionType.name()
                        ) ||
                        enforcer.enforce(
                                USER_PREFIX + current.getId(),
                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                objectType.getName() + SPACER + fieldDefinition.getName(),
                                ANY.name()
                        ) ||
                        enforcer.enforce(
                                USER_PREFIX + current.getId(),
                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                objectType.getName() + SPACER + fieldDefinition.getName(),
                                permissionType.name()
                        )
                )
        ) {
            return Stream.of(field);
        }
        return Stream.empty();
    }

    protected Stream<Field> enforce(Current current, ObjectType objectType, FieldDefinition fieldDefinition, Field field) {
        Definition fieldTypeDefinition = documentManager.getFieldTypeDefinition(fieldDefinition);
        if (fieldDefinition.isConnectionField()) {
            if (documentManager.isOperationType(objectType) ||
                    !fieldDefinition.isDenyAll() &&
                            (fieldDefinition.isPermitAll() ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            ANY.name() + SPACER + ANY.name(),
                                            ANY.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            ANY.name() + SPACER + ANY.name(),
                                            WRITE.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            ANY.name() + SPACER + ANY.name(),
                                            READ.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + ANY.name(),
                                            ANY.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + ANY.name(),
                                            WRITE.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + ANY.name(),
                                            READ.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + fieldDefinition.getConnectionFieldOrError(),
                                            ANY.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + fieldDefinition.getConnectionFieldOrError(),
                                            WRITE.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + fieldDefinition.getConnectionFieldOrError(),
                                            READ.name()
                                    )
                            )
            ) {
                field.setSelections(
                        field.getFields().stream()
                                .flatMap(subField -> {
                                            if (subField.getName().equals(FIELD_EDGES_NAME) && subField.getField(FIELD_NODE_NAME) != null) {
                                                Field node = subField.getField(FIELD_NODE_NAME);
                                                FieldDefinition originalFieldDefinition = objectType.getField(fieldDefinition.getConnectionFieldOrError());
                                                Definition originalFieldTypeDefinition = documentManager.getFieldTypeDefinition(originalFieldDefinition);
                                                List<Field> fieldList = node.getFields().stream()
                                                        .flatMap(nodeSubField ->
                                                                enforce(current, originalFieldTypeDefinition.asObject(), originalFieldTypeDefinition.asObject().getField(nodeSubField.getName()), nodeSubField)
                                                        )
                                                        .collect(Collectors.toList());
                                                if (fieldList.isEmpty()) {
                                                    return Stream.empty();
                                                } else {
                                                    node.setSelections(fieldList);
                                                    return Stream.of(subField);
                                                }
                                            }
                                            return Stream.of(subField);
                                        }
                                )
                                .collect(Collectors.toList())
                );
                if (field.getField(FIELD_EDGES_NAME) != null) {
                    return Stream.of(field);
                } else {
                    return Stream.empty();
                }
            }
        } else if (fieldTypeDefinition.isObject()) {
            String fieldName;
            if (fieldDefinition.isAggregateField()) {
                fieldName = fieldDefinition.getName().substring(0, fieldDefinition.getName().lastIndexOf(SUFFIX_AGGREGATE));
            } else {
                fieldName = fieldDefinition.getName();
            }
            if (documentManager.isOperationType(objectType) ||
                    !fieldDefinition.isDenyAll() &&
                            (fieldDefinition.isPermitAll() ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            ANY.name() + SPACER + ANY.name(),
                                            ANY.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            ANY.name() + SPACER + ANY.name(),
                                            WRITE.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            ANY.name() + SPACER + ANY.name(),
                                            READ.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + ANY.name(),
                                            ANY.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + ANY.name(),
                                            WRITE.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + ANY.name(),
                                            READ.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + fieldName,
                                            ANY.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + fieldName,
                                            WRITE.name()
                                    ) ||
                                    enforcer.enforce(
                                            USER_PREFIX + current.getId(),
                                            Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                            objectType.getName() + SPACER + fieldName,
                                            READ.name()
                                    )
                            )
            ) {
                List<Field> fieldList = field.getFields().stream()
                        .flatMap(subField ->
                                enforce(current, fieldTypeDefinition.asObject(), fieldTypeDefinition.asObject().getField(subField.getName()), subField)
                        )
                        .collect(Collectors.toList());
                if (fieldList.isEmpty()) {
                    return Stream.empty();
                } else {
                    return Stream.of(field.setSelections(fieldList));
                }
            }
        } else {
            String fieldName;
            if (fieldDefinition.isFunctionField()) {
                fieldName = fieldDefinition.getFunctionFieldOrError();
            } else {
                fieldName = fieldDefinition.getName();
            }
            if (!fieldDefinition.isDenyAll() &&
                    (fieldDefinition.isPermitAll() ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    ANY.name() + SPACER + ANY.name(),
                                    ANY.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    ANY.name() + SPACER + ANY.name(),
                                    WRITE.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    ANY.name() + SPACER + ANY.name(),
                                    READ.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    objectType.getName() + SPACER + ANY.name(),
                                    ANY.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    objectType.getName() + SPACER + ANY.name(),
                                    WRITE.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    objectType.getName() + SPACER + ANY.name(),
                                    READ.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    objectType.getName() + SPACER + fieldName,
                                    ANY.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    objectType.getName() + SPACER + fieldName,
                                    WRITE.name()
                            ) ||
                            enforcer.enforce(
                                    USER_PREFIX + current.getId(),
                                    Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                    objectType.getName() + SPACER + fieldName,
                                    READ.name()
                            )
                    )
            ) {
                return Stream.of(field);
            }
        }
        return Stream.empty();
    }

    protected Map<String, ValueWithVariable> enforce(Current current, FieldDefinition fieldDefinition, Map<String, ValueWithVariable> arguments) {
        Definition fieldTypeDefinition = documentManager.getFieldTypeDefinition(fieldDefinition);
        if (fieldTypeDefinition.isObject() && !fieldTypeDefinition.asObject().isContainer()) {
            return Stream
                    .concat(
                            fieldTypeDefinition.asObject().getFields().stream()
                                    .flatMap(
                                            subFieldDefinition ->
                                                    fieldDefinition.getArgumentOrEmpty(subFieldDefinition.getName())
                                                            .flatMap(inputValue ->
                                                                    Optional.ofNullable(arguments.get(inputValue.getName()))
                                                                            .or(() -> Optional.ofNullable(inputValue.getDefaultValue()))
                                                                            .flatMap(valueWithVariable -> {
                                                                                        if (!subFieldDefinition.isDenyAll() &&
                                                                                                (subFieldDefinition.isPermitAll() ||
                                                                                                        enforcer.enforce(
                                                                                                                USER_PREFIX + current.getId(),
                                                                                                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                                                                                                ANY.name() + SPACER + ANY.name(),
                                                                                                                ANY.name()
                                                                                                        ) ||
                                                                                                        enforcer.enforce(
                                                                                                                USER_PREFIX + current.getId(),
                                                                                                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                                                                                                ANY.name() + SPACER + ANY.name(),
                                                                                                                WRITE.name()
                                                                                                        ) ||
                                                                                                        enforcer.enforce(
                                                                                                                USER_PREFIX + current.getId(),
                                                                                                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                                                                                                fieldTypeDefinition.getName() + SPACER + ANY.name(),
                                                                                                                ANY.name()
                                                                                                        ) ||
                                                                                                        enforcer.enforce(
                                                                                                                USER_PREFIX + current.getId(),
                                                                                                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                                                                                                fieldTypeDefinition.getName() + SPACER + ANY.name(),
                                                                                                                WRITE.name()
                                                                                                        ) ||
                                                                                                        enforcer.enforce(
                                                                                                                USER_PREFIX + current.getId(),
                                                                                                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                                                                                                fieldTypeDefinition.getName() + SPACER + inputValue.getName(),
                                                                                                                ANY.name()
                                                                                                        ) ||
                                                                                                        enforcer.enforce(
                                                                                                                USER_PREFIX + current.getId(),
                                                                                                                Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse(EMPTY),
                                                                                                                fieldTypeDefinition.getName() + SPACER + inputValue.getName(),
                                                                                                                WRITE.name()
                                                                                                        )
                                                                                                )
                                                                                        ) {
                                                                                            if (documentManager.getFieldTypeDefinition(subFieldDefinition).isObject() || !valueWithVariable.isNull()) {
                                                                                                if (subFieldDefinition.getType().hasList()) {
                                                                                                    return Optional.of(
                                                                                                            new AbstractMap.SimpleEntry<>(
                                                                                                                    inputValue.getName(),
                                                                                                                    ValueWithVariable.of(
                                                                                                                            valueWithVariable.asArray().getValueWithVariables().stream()
                                                                                                                                    .map(item -> enforce(current, subFieldDefinition, item.asObject().getObjectValueWithVariable()))
                                                                                                                                    .collect(Collectors.toList())
                                                                                                                    )
                                                                                                            )
                                                                                                    );
                                                                                                } else {
                                                                                                    return Optional.of(
                                                                                                            new AbstractMap.SimpleEntry<>(
                                                                                                                    inputValue.getName(),
                                                                                                                    ValueWithVariable.of(
                                                                                                                            enforce(current, subFieldDefinition, valueWithVariable.asObject().getObjectValueWithVariable())
                                                                                                                    )
                                                                                                            )
                                                                                                    );
                                                                                                }
                                                                                            } else {
                                                                                                return Optional.of(new AbstractMap.SimpleEntry<>(inputValue.getName(), valueWithVariable));
                                                                                            }
                                                                                        }
                                                                                        return Optional.empty();
                                                                                    }
                                                                            )
                                                            )
                                                            .stream()
                                    ),
                            fieldDefinition.getArgumentOrEmpty(INPUT_VALUE_LIST_NAME).stream()
                                    .flatMap(inputValue ->
                                            Optional.ofNullable(arguments.get(inputValue.getName()))
                                                    .or(() -> Optional.ofNullable(inputValue.getDefaultValue()))
                                                    .map(valueWithVariable -> {
                                                                if (!valueWithVariable.isNull()) {
                                                                    return new AbstractMap.SimpleEntry<>(
                                                                            inputValue.getName(),
                                                                            ValueWithVariable.of(
                                                                                    valueWithVariable.asArray().getValueWithVariables().stream()
                                                                                            .map(item -> enforce(current, fieldDefinition, item.asObject().getObjectValueWithVariable()))
                                                                                            .collect(Collectors.toList())
                                                                            )
                                                                    );
                                                                }
                                                                return new AbstractMap.SimpleEntry<>(inputValue.getName(), valueWithVariable);
                                                            }
                                                    )
                                                    .stream()
                                    )
                    )
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }
        return arguments;
    }
}
