package io.graphoenix.graphence;

import io.graphoenix.core.context.BeanContext;
import io.graphoenix.graphence.dto.objectType.Group;
import io.graphoenix.graphence.dto.objectType.Role;
import io.graphoenix.graphence.dto.objectType.User;
import io.graphoenix.graphence.spi.KeycloakDao;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.*;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.group.GroupLookupProvider;
import org.keycloak.storage.role.RoleLookupProvider;
import org.keycloak.storage.user.UserLookupProvider;

import java.util.Set;
import java.util.stream.Stream;

public class GraphenceUserStorageProvider implements UserStorageProvider,
        UserLookupProvider,
        RoleLookupProvider,
        GroupLookupProvider,
        CredentialInputValidator {

    private final KeycloakDao keycloakDao;

    public GraphenceUserStorageProvider() {
        this.keycloakDao = BeanContext.get(KeycloakDao.class);
    }

    @Override
    public boolean supportsCredentialType(String credentialType) {
        return true;
    }

    @Override
    public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType) {
        return true;
    }

    @Override
    public boolean isValid(RealmModel realm, UserModel user, CredentialInput credentialInput) {
        return true;
    }

    @Override
    public void close() {

    }

    @Override
    public GroupModel getGroupById(RealmModel realm, String id) {
        Group group = keycloakDao.getGroupById(realm.getId(), id);
        return group == null ? null : new GraphenceGroupModel(group);
    }

    @Override
    public Stream<GroupModel> searchForGroupByNameStream(RealmModel realm, String search, Integer firstResult, Integer maxResults) {
        Set<Group> groupList = keycloakDao.findGroupListByName(realm.getId(), search);
        if (groupList == null) {
            return null;
        }
        if (firstResult != null && maxResults != null) {
            return groupList.stream().skip(firstResult - 1).limit(maxResults).map(GraphenceGroupModel::new);
        } else if (firstResult != null) {
            return groupList.stream().skip(firstResult - 1).map(GraphenceGroupModel::new);
        } else {
            return groupList.stream().map(GraphenceGroupModel::new);
        }
    }

    @Override
    public RoleModel getRealmRole(RealmModel realm, String name) {
        Role role = keycloakDao.getRoleByName(realm.getId(), name);
        return role == null ? null : new GraphenceRoleModel(role);
    }

    @Override
    public RoleModel getRoleById(RealmModel realm, String id) {
        Role role = keycloakDao.getRoleById(realm.getId(), id);
        return role == null ? null : new GraphenceRoleModel(role);
    }

    @Override
    public Stream<RoleModel> searchForRolesStream(RealmModel realm, String search, Integer first, Integer max) {
        Set<Role> roleList = keycloakDao.getRoleListByName(realm.getId(), search);
        if (roleList == null) {
            return null;
        }
        if (first != null && max != null) {
            return roleList.stream().skip(first - 1).limit(max).map(GraphenceRoleModel::new);
        } else if (first != null) {
            return roleList.stream().skip(first - 1).map(GraphenceRoleModel::new);
        } else {
            return roleList.stream().map(GraphenceRoleModel::new);
        }
    }

    @Override
    public RoleModel getClientRole(ClientModel client, String name) {
        return null;
    }

    @Override
    public Stream<RoleModel> searchForClientRolesStream(ClientModel client, String search, Integer first, Integer max) {
        return null;
    }

    @Override
    public UserModel getUserById(String id, RealmModel realm) {
        User user = keycloakDao.getUserById(realm.getId(), id);
        return user == null ? null : new GraphenceUserModel(user);
    }

    @Override
    public UserModel getUserByUsername(String username, RealmModel realm) {
        User user = keycloakDao.getUserByLogin(realm.getId(), username);
        return user == null ? null : new GraphenceUserModel(user);
    }

    @Override
    public UserModel getUserByEmail(String email, RealmModel realm) {
        User user = keycloakDao.getUserByEmail(realm.getId(), email);
        return user == null ? null : new GraphenceUserModel(user);
    }
}
