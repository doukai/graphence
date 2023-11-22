package io.graphence.security.event;

import com.google.auto.service.AutoService;
import graphql.parser.antlr.GraphqlParser;
import io.graphence.core.dto.CurrentUser;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphence.core.error.AuthorizationException;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.error.GraphQLErrors;
import io.graphoenix.spi.antlr.IGraphQLDocumentManager;
import io.graphoenix.spi.handler.ScopeEvent;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.Initialized;
import jakarta.enterprise.context.RequestScoped;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.casbin.jcasbin.main.Enforcer;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static io.graphence.core.casbin.adapter.RBACAdapter.SPACER;
import static io.graphence.core.casbin.adapter.RBACAdapter.USER_PREFIX;
import static io.graphence.core.dto.enumType.PermissionType.READ;
import static io.graphence.core.dto.enumType.PermissionType.WRITE;
import static io.graphence.core.error.AuthorizationErrorType.UN_AUTHORIZATION_READ;
import static io.graphence.core.error.AuthorizationErrorType.UN_AUTHORIZATION_WRITE;
import static io.graphoenix.core.error.GraphQLErrorType.*;
import static io.graphoenix.core.utils.DocumentUtil.DOCUMENT_UTIL;
import static io.graphoenix.spi.constant.Hammurabi.*;

@Initialized(RequestScoped.class)
@Priority(1)
@AutoService(ScopeEvent.class)
public class RBACFilter extends BaseRequestFilter implements ScopeEvent {

    private final IGraphQLDocumentManager manager;
    private final Enforcer enforcer;

    public RBACFilter() {
        this.manager = BeanContext.get(IGraphQLDocumentManager.class);
        this.enforcer = BeanContext.get(Enforcer.class);
    }

    @Override
    public Mono<Void> fireAsync(Map<String, Object> context) {
        if (isPermitAll(context)) {
            return Mono.empty();
        }
        GraphqlParser.OperationDefinitionContext operationDefinitionContext = getOperationDefinitionContext(context);
        CurrentUser currentUser = getCurrentUser(context);
        GraphqlParser.OperationTypeContext operationTypeContext = operationDefinitionContext.operationType();
        if (operationTypeContext == null || operationTypeContext.QUERY() != null) {
            String typeName = manager.getQueryOperationTypeName().orElseThrow(() -> new GraphQLErrors(QUERY_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    if (manager.isInvokeField(fieldDefinitionContext)) {
                        enforceApi(currentUser, typeName, selectionContext, READ);
                    } else {
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                    }
                }
            }
        } else if (operationTypeContext.SUBSCRIPTION() != null) {
            String typeName = manager.getSubscriptionOperationTypeName().orElseThrow(() -> new GraphQLErrors(SUBSCRIBE_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    if (manager.isInvokeField(fieldDefinitionContext)) {
                        enforceApi(currentUser, typeName, selectionContext, READ);
                    } else {
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                    }
                }
            }
        } else if (operationTypeContext.MUTATION() != null) {
            String typeName = manager.getMutationOperationTypeName().orElseThrow(() -> new GraphQLErrors(MUTATION_TYPE_NOT_EXIST));
            for (GraphqlParser.SelectionContext selectionContext : operationDefinitionContext.selectionSet().selection()) {
                if (selectionContext.field().selectionSet() != null) {
                    GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                            .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));
                    if (manager.isInvokeField(fieldDefinitionContext)) {
                        enforceApi(currentUser, typeName, selectionContext, WRITE);
                    } else {
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                        enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().arguments());
                    }
                }
            }
        } else {
            throw new GraphQLErrors(UNSUPPORTED_OPERATION_TYPE);
        }
        return Mono.empty();
    }

    protected void enforceApi(CurrentUser currentUser, String operationTypeName, GraphqlParser.SelectionContext selectionContext, PermissionType permissionType) {
        if (!enforcer.enforce(
                USER_PREFIX + currentUser.getId(),
                currentUser.getRealmId(),
                operationTypeName + SPACER + selectionContext.field().name().getText(),
                permissionType.name()
        )
        ) {
            throw new AuthorizationException(UN_AUTHORIZATION_READ.bind(selectionContext.field().name().getText()));
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.SelectionSetContext selectionSetContext) {
        if (selectionSetContext != null) {
            if (typeName.endsWith(CONNECTION_SUFFIX)) {
                selectionSetContext.selection().stream()
                        .filter(selectionContext -> selectionContext.field().name().getText().equals("edges"))
                        .findFirst()
                        .flatMap(selectionContext ->
                                Stream.ofNullable(selectionContext.field().selectionSet())
                                        .flatMap(edgesSelectionSetContext -> edgesSelectionSetContext.selection().stream())
                                        .filter(edgesSelectionContext -> edgesSelectionContext.field().name().getText().equals("node"))
                                        .findFirst()
                        )
                        .ifPresent(selectionContext -> enforce(currentUser, typeName.substring(0, typeName.length() - CONNECTION_SUFFIX.length()), selectionContext.field().selectionSet()));
            } else {
                List<GraphqlParser.SelectionContext> selectionContexts = selectionSetContext.selection().stream().flatMap(selectionContext -> manager.fragmentUnzip(typeName, selectionContext)).collect(Collectors.toList());
                if (selectionContexts.size() > 0) {
                    ParseTree left = selectionSetContext.getChild(0);
                    ParseTree right = selectionSetContext.getChild(selectionSetContext.getChildCount() - 1);
                    IntStream.range(0, selectionSetContext.getChildCount()).forEach(index -> selectionSetContext.removeLastChild());
                    selectionSetContext.addChild((TerminalNode) left);
                    for (GraphqlParser.SelectionContext selectionContext : selectionContexts) {
                        GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, selectionContext.field().name().getText())
                                .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, selectionContext.field().name().getText())));

                        String fieldName;
                        if (manager.isFunctionField(fieldDefinitionContext)) {
                            fieldName = fieldDefinitionContext.directives().directive().stream()
                                    .filter(directiveContext -> directiveContext.name().getText().equals(FUNC_DIRECTIVE_NAME))
                                    .flatMap(directiveContext -> directiveContext.arguments().argument().stream()
                                            .filter(argumentContext -> argumentContext.name().getText().equals("field"))
                                            .filter(argumentContext -> argumentContext.valueWithVariable().StringValue() != null)
                                            .map(argumentContext -> DOCUMENT_UTIL.getStringValue(argumentContext.valueWithVariable().StringValue())))
                                    .findFirst()
                                    .orElse(null);
                        } else if (fieldDefinitionContext.name().getText().endsWith(AGGREGATE_SUFFIX)) {
                            fieldName = fieldDefinitionContext.name().getText().substring(0, fieldDefinitionContext.name().getText().lastIndexOf(AGGREGATE_SUFFIX));
                        } else if (fieldDefinitionContext.name().getText().endsWith(CONNECTION_SUFFIX)) {
                            fieldName = fieldDefinitionContext.name().getText().substring(0, fieldDefinitionContext.name().getText().lastIndexOf(CONNECTION_SUFFIX));
                        } else {
                            fieldName = selectionContext.field().name().getText();
                        }
                        if (enforcer.enforce(
                                USER_PREFIX + currentUser.getId(),
                                currentUser.getRealmId(),
                                typeName + SPACER + fieldName,
                                READ.name()
                        )
                        ) {
                            selectionSetContext.addChild(selectionContext);
                            enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), selectionContext.field().selectionSet());
                        }
                    }
                    selectionSetContext.addChild((TerminalNode) right);
                    if (selectionSetContext.selection().size() == 0) {
                        throw new AuthorizationException(UN_AUTHORIZATION_READ.bind(typeName));
                    }
                }
            }
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.ArgumentsContext argumentsContext) {
        if (argumentsContext != null) {
            List<GraphqlParser.ArgumentContext> argumentContextList = argumentsContext.argument();
            ParseTree left = argumentsContext.getChild(0);
            ParseTree right = argumentsContext.getChild(argumentsContext.getChildCount() - 1);
            IntStream.range(0, argumentsContext.getChildCount()).forEach(index -> argumentsContext.removeLastChild());
            if (argumentContextList.size() > 0) {
                argumentsContext.addChild((TerminalNode) left);
                for (GraphqlParser.ArgumentContext argumentContext : argumentContextList) {
                    if (Arrays.stream(EXCLUDE_INPUT).anyMatch(name -> name.equals(argumentContext.name().getText()))) {
                        argumentsContext.addChild(argumentContext);
                    } else {
                        if (enforcer.enforce(
                                USER_PREFIX + currentUser.getId(),
                                currentUser.getRealmId(),
                                typeName + SPACER + argumentContext.name().getText(),
                                WRITE.name()
                        )
                        ) {
                            argumentsContext.addChild(argumentContext);
                            GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, argumentContext.name().getText())
                                    .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, argumentContext.name().getText())));
                            enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), argumentContext.valueWithVariable().objectValueWithVariable());
                        }
                    }
                }
                argumentsContext.addChild((TerminalNode) right);
                if (argumentsContext.argument().size() == 0) {
                    throw new AuthorizationException(UN_AUTHORIZATION_WRITE.bind(typeName));
                }
            }
        }
    }

    protected void enforce(CurrentUser currentUser, String typeName, GraphqlParser.ObjectValueWithVariableContext objectValueWithVariableContext) {
        if (objectValueWithVariableContext != null) {
            List<GraphqlParser.ObjectFieldWithVariableContext> objectFieldWithVariableContextList = objectValueWithVariableContext.objectFieldWithVariable();
            ParseTree left = objectValueWithVariableContext.getChild(0);
            ParseTree right = objectValueWithVariableContext.getChild(objectValueWithVariableContext.getChildCount() - 1);
            IntStream.range(0, objectValueWithVariableContext.getChildCount()).forEach(index -> objectValueWithVariableContext.removeLastChild());
            if (objectFieldWithVariableContextList.size() > 0) {
                objectValueWithVariableContext.addChild((TerminalNode) left);
                for (GraphqlParser.ObjectFieldWithVariableContext objectFieldWithVariableContext : objectFieldWithVariableContextList) {
                    if (Arrays.stream(EXCLUDE_INPUT).anyMatch(name -> name.equals(objectFieldWithVariableContext.name().getText()))) {
                        objectValueWithVariableContext.addChild(objectFieldWithVariableContext);
                    } else {
                        if (enforcer.enforce(
                                USER_PREFIX + currentUser.getId(),
                                currentUser.getRealmId(),
                                typeName + SPACER + objectFieldWithVariableContext.name().getText(),
                                WRITE.name()
                        )
                        ) {
                            objectValueWithVariableContext.addChild(objectFieldWithVariableContext);
                            GraphqlParser.FieldDefinitionContext fieldDefinitionContext = manager.getField(typeName, objectFieldWithVariableContext.name().getText())
                                    .orElseThrow(() -> new GraphQLErrors(FIELD_NOT_EXIST.bind(typeName, objectFieldWithVariableContext.name().getText())));
                            enforce(currentUser, manager.getFieldTypeName(fieldDefinitionContext.type()), objectFieldWithVariableContext.valueWithVariable().objectValueWithVariable());
                        }
                    }
                }
                objectValueWithVariableContext.addChild((TerminalNode) right);
                if (objectValueWithVariableContext.objectFieldWithVariable().size() == 0) {
                    throw new AuthorizationException(UN_AUTHORIZATION_WRITE.bind(typeName));
                }
            }
        }
    }
}
