package io.graphence.security.event;

import io.graphence.core.dto.CurrentUser;
import io.graphoenix.spi.graphql.operation.Operation;
import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

import java.util.Map;

import static io.graphence.core.constant.Constant.*;
import static io.graphoenix.http.server.context.RequestScopeInstanceFactory.REQUEST_ID;
import static io.graphoenix.http.server.context.SessionScopeInstanceFactory.SESSION_ID;
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

    protected CurrentUser getCurrentUser(Map<String, Object> context) {
        return (CurrentUser) context.get(CURRENT_USER);
    }

    protected void setCurrentUser(Map<String, Object> context, CurrentUser currentUser) {
        context.put(CURRENT_USER, currentUser);
    }

    protected String getRequestId(Map<String, Object> context) {
        return (String) context.get(REQUEST_ID);
    }

    protected String getSessionId(Map<String, Object> context) {
        return (String) context.get(SESSION_ID);
    }

    protected void setSessionId(Map<String, Object> context, String sessionId) {
        context.put(SESSION_ID, sessionId);
    }
}
