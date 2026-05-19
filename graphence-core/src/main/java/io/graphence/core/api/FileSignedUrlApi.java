package io.graphence.core.api;

import io.graphence.core.dto.Current;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphence.core.error.AuthorizationException;
import io.graphence.core.service.FileSignedUrlService;
import io.graphence.core.service.RBACPermissionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Query;
import reactor.core.publisher.Mono;

import static io.graphence.core.error.AuthorizationErrorType.AUTHORIZATION_FAILED;

@GraphQLApi
@ApplicationScoped
public class FileSignedUrlApi {

  private final Provider<Mono<Current>> currentUserMonoProvider;
  private final RBACPermissionService rbacPermissionService;
  private final FileSignedUrlService fileSignedUrlService;

  @Inject
  public FileSignedUrlApi(
      Provider<Mono<Current>> currentUserMonoProvider,
      RBACPermissionService rbacPermissionService,
      FileSignedUrlService fileSignedUrlService) {
    this.currentUserMonoProvider = currentUserMonoProvider;
    this.rbacPermissionService = rbacPermissionService;
    this.fileSignedUrlService = fileSignedUrlService;
  }

  @Query
  @NonNull
  public Mono<String> createCurrentFileSignedUrl(@NonNull String fileId, Integer ttlSeconds) {
    return currentUserMonoProvider
        .get()
        .map(
            currentUser -> {
              if (!rbacPermissionService.hasPermission(
                  currentUser, "File", PermissionType.ANY.name(), PermissionType.READ)) {
                throw new AuthorizationException(AUTHORIZATION_FAILED);
              }
              return fileSignedUrlService.create(currentUser, fileId, ttlSeconds);
            });
  }
}
