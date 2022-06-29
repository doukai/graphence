package io.graphoenix.graphence.jwt.filter;

import com.google.auto.service.AutoService;
import io.graphoenix.core.context.BeanContext;
import io.graphoenix.core.context.SessionCache;
import io.graphoenix.graphence.jwt.GraphenceJsonWebToken;
import io.graphoenix.graphence.jwt.dto.CurrentUser;
import io.graphoenix.graphence.jwt.error.AuthenticationException;
import io.graphoenix.graphence.jwt.utils.JWTUtil;
import io.graphoenix.spi.dto.GraphQLRequest;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import org.eclipse.microprofile.jwt.Claims;

import static io.graphoenix.core.context.SessionCache.SESSION_ID;
import static io.graphoenix.graphence.jwt.error.AuthenticationErrorType.UN_AUTHENTICATION;
import static io.graphoenix.spi.constant.Hammurabi.GRAPHQL_REQUEST_KEY;

@AutoService(ContainerRequestFilter.class)
public class JWTFilter implements ContainerRequestFilter {

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private final JWTUtil jwtUtil;

    public JWTFilter() {
        jwtUtil = BeanContext.get(JWTUtil.class);
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {

        GraphQLRequest graphQLRequest = (GraphQLRequest) requestContext.getProperty(GRAPHQL_REQUEST_KEY);

        String authorization = requestContext.getHeaderString(AUTHORIZATION_HEADER);
        if (authorization != null && authorization.startsWith("Bearer")) {
            String jws = authorization.substring(7);
            GraphenceJsonWebToken jsonWebToken = jwtUtil.parser(jws);
            CurrentUser currentUser = new CurrentUser()
                    .setLogin(jsonWebToken.getSubject())
                    .setName(jsonWebToken.getClaim(Claims.full_name))
                    .setLastName(jsonWebToken.getClaim(Claims.family_name))
                    .setEmail(jsonWebToken.getClaim(Claims.upn))
                    .setGroups(jsonWebToken.getGroups());

            requestContext.setProperty(SESSION_ID, jws);
            SessionCache.putIfAbsent(jws, CurrentUser.class, currentUser);
        }
        throw new AuthenticationException(UN_AUTHENTICATION);
    }
}
