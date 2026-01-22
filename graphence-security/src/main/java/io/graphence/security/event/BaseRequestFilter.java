package io.graphence.security.event;

import io.graphence.core.dto.Current;
import io.graphoenix.spi.graphql.operation.Operation;
import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

import java.util.Map;

import static io.graphence.core.constant.Constant.*;
import static io.graphoenix.http.server.context.RequestBeanScoped.REQUEST_ID;
import static io.graphoenix.http.server.handler.BaseHandler.*;

public abstract class BaseRequestFilter {

    protected HttpServerRequest getRequest(Map<String, Object> context) {
        return (HttpServerRequest) context.get(REQUEST);
    }

    protected HttpServerResponse getResponse(Map<String, Object> context) {
        return (HttpServerResponse) context.get(RESPONSE);
    }

    protected Operation getOperation(Map<String, Object> context) {
        return (Operation) context.get(OPERATION);
    }

    protected Current getCurrentUser(Map<String, Object> context) {
        return (Current) context.get(CURRENT_USER);
    }

    protected void setCurrentUser(Map<String, Object> context, Current current) {
        context.put(CURRENT_USER, current);
    }

    protected String getRequestId(Map<String, Object> context) {
        return (String) context.get(REQUEST_ID);
    }
}
