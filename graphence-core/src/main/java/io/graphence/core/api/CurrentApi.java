package io.graphence.core.api;

import com.password4j.Hash;
import com.password4j.Password;
import io.graphence.core.repository.RBACPolicyRepository;
import io.graphence.core.repository.UserRepository;
import io.graphence.core.dto.Current;
import io.graphence.core.dto.inputObjectType.*;
import io.graphence.core.dto.objectType.Permission;
import io.graphence.core.dto.objectType.User;
import io.graphence.core.error.AuthenticationException;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.nozdormu.spi.async.Async;
import io.nozdormu.spi.async.Asyncable;
import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.graphql.*;
import reactor.core.publisher.Mono;

import java.util.Base64;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;

@GraphQLApi
@ApplicationScoped
public class CurrentApi implements Asyncable {

    private final Provider<Mono<Current>> currentMonoProvider;
    private final RBACPolicyRepository rbacPolicyRepository;
    private final UserRepository userRepository;

    @Inject
    public CurrentApi(Provider<Mono<Current>> currentMonoProvider, RBACPolicyRepository rbacPolicyRepository, UserRepository userRepository) {
        this.currentMonoProvider = currentMonoProvider;
        this.rbacPolicyRepository = rbacPolicyRepository;
        this.userRepository = userRepository;
    }

    @Query
    @PermitAll
    public Mono<Current> current() {
        return currentMonoProvider.get();
    }

    @Query
    @PermitAll
    public Mono<User> currentUser() {
        return currentMonoProvider.get()
                .flatMap(currentUser -> userRepository.getUserById(currentUser.getId()));
    }

    @Query
    @PermitAll
    public Mono<Set<String>> currentPermissionTypeList() {
        return currentMonoProvider.get()
                .flatMap(currentUser -> rbacPolicyRepository.queryPermissionTypeList(currentUser.getRoles()))
                .map(permissionList ->
                        permissionList.stream()
                                .map(Permission::getType)
                                .collect(Collectors.toSet())
                );
    }

    @Query
    @PermitAll
    public Mono<Set<String>> currentPermissionNameListByTypes(Collection<String> types) {
        return currentMonoProvider.get()
                .flatMap(currentUser -> rbacPolicyRepository.queryPermissionNameListByTypes(currentUser.getRoles(), types))
                .map(permissionList ->
                        permissionList.stream()
                                .map(Permission::getName)
                                .collect(Collectors.toSet())
                );
    }

    @Mutation
    @PermitAll
    public Mono<User> currentUserUpdate(@NonNull UserInput userInput) {
        return currentMonoProvider.get()
                .doOnSuccess(currentUser -> userInput.setId(currentUser.getId()))
                .flatMap(currentUser ->
                        userRepository.updateUser(userInput)
                                .flatMap(user ->
                                        userRepository.updateUserPhones(userInput.getId(), userInput.getPhones())
                                )
                );
    }

    @Mutation
    @PermitAll
    public Mono<User> currentUserResetPassword(@NonNull String password, @NonNull String newPassword) {
        return currentMonoProvider.get()
                .flatMap(currentUser -> userRepository.getUserById(currentUser.getId()))
                .flatMap(user -> {
                            if (Password.check(password, new String(Base64.getDecoder().decode(user.getHash()))).addSalt(Base64.getDecoder().decode(user.getSalt())).withBcrypt()) {
                                Hash hash = Password.hash(newPassword).withBcrypt();
                                return userRepository.resetPassword(user.getId(), Base64.getEncoder().encodeToString(hash.getSaltBytes()), Base64.getEncoder().encodeToString(hash.getResultAsBytes()));
                            } else {
                                return Mono.error(new AuthenticationException(AUTHENTICATION_FAILED));
                            }
                        }
                );
    }

    @Async(defaultIfEmpty = "metaInput")
    public MetaInput invokeMetaInput(@Source MetaInput metaInput) {
        Current current = await(currentMonoProvider.get());
        if (!(metaInput instanceof RealmInput ||
                metaInput instanceof RealmMutationArguments ||
                metaInput instanceof RealmListMutationArguments ||
                metaInput instanceof PermissionInput ||
                metaInput instanceof PermissionMutationArguments ||
                metaInput instanceof PermissionListMutationArguments)
        ) {
            if (current.getRealmId() != null) {
                metaInput.setRealmId(current.getRealmId());
            }
        }
        if (metaInput.getCreateUserId() == null) {
            metaInput.setCreateUserId(current.getId());
        } else {
            metaInput.setUpdateUserId(current.getId());
        }
        return metaInput;
    }

    @Async(defaultIfEmpty = "metaExpression")
    public MetaExpression invokeMetaExpression(@Source MetaExpression metaExpression) {
        Current current = await(currentMonoProvider.get());
        if (!(metaExpression instanceof RealmExpression ||
                metaExpression instanceof RealmQueryArguments ||
                metaExpression instanceof RealmConnectionQueryArguments ||
                metaExpression instanceof RealmListQueryArguments ||
                metaExpression instanceof PermissionExpression ||
                metaExpression instanceof PermissionQueryArguments ||
                metaExpression instanceof PermissionConnectionQueryArguments ||
                metaExpression instanceof PermissionListQueryArguments)
        ) {
            if (current.getRealmId() != null) {
                IntExpression intExpression = new IntExpression();
                intExpression.setVal(current.getRealmId());
            }
        }
        return metaExpression;
    }
}
