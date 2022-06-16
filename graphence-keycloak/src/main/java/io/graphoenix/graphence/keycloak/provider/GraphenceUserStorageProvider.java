package io.graphoenix.graphence.keycloak.provider;

import io.graphoenix.core.context.BeanContext;
import io.graphoenix.graphence.dto.objectType.Group;
import io.graphoenix.graphence.dto.objectType.Role;
import io.graphoenix.graphence.dto.objectType.User;
import io.graphoenix.graphence.keycloak.dto.GraphenceGroupModel;
import io.graphoenix.graphence.keycloak.dto.GraphenceRoleModel;
import io.graphoenix.graphence.keycloak.dto.GraphenceUserModel;
import io.graphoenix.graphence.keycloak.spi.KeycloakDao;
import io.graphoenix.r2dbc.connector.config.R2DBCConfig;
import io.graphoenix.r2dbc.connector.dao.R2DBCOperationDAOBuilder;
import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.*;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.group.GroupLookupProvider;
import org.keycloak.storage.role.RoleLookupProvider;
import org.keycloak.storage.user.UserLookupProvider;
import org.keycloak.storage.user.UserQueryProvider;
import org.keycloak.utils.StringUtil;
import org.tinylog.Logger;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.keycloak.models.UserModel.*;

public class GraphenceUserStorageProvider implements UserStorageProvider,
        UserLookupProvider,
        UserQueryProvider,
        RoleLookupProvider,
        GroupLookupProvider,
        CredentialInputValidator {

    private final KeycloakSession session;
    private final ComponentModel model;
    private final KeycloakDao keycloakDao;

    public GraphenceUserStorageProvider(KeycloakSession session, ComponentModel model) {
        this.session = session;
        this.model = model;
        Logger.info(model.getConfig());
        R2DBCOperationDAOBuilder r2DBCOperationDAOBuilder = BeanContext.get(R2DBCOperationDAOBuilder.class);
        R2DBCConfig r2DBCConfig = new R2DBCConfig();
        r2DBCConfig.setDatabase("dev");
        r2DBCConfig.setUser("root");
        r2DBCConfig.setPassword("root");
//        String driver = model.getConfig().getFirst("driver");
//        String protocol = model.getConfig().getFirst("protocol");
//        String database = model.getConfig().getFirst("database");
//        String host = model.getConfig().getFirst("host");
//        String port = model.getConfig().getFirst("port");
//        String user = model.getConfig().getFirst("user");
//        String password = model.getConfig().getFirst("password");
//        String usePool = model.getConfig().getFirst("usePool");
//        String poolMaxSize = model.getConfig().getFirst("poolMaxSize");
//        String poolMaxIdleTime = model.getConfig().getFirst("poolMaxIdleTime");
//        if (StringUtil.isNotBlank(driver)) {
//            r2DBCConfig.setDriver(driver);
//        }
//        if (StringUtil.isNotBlank(protocol)) {
//            r2DBCConfig.setProtocol(protocol);
//        }
//        if (StringUtil.isNotBlank(database)) {
//            r2DBCConfig.setDatabase(database);
//        }
//        if (StringUtil.isNotBlank(host)) {
//            r2DBCConfig.setHost(host);
//        }
//        if (StringUtil.isNotBlank(port)) {
//            r2DBCConfig.setPort(Integer.parseInt(port));
//        }
//        if (StringUtil.isNotBlank(user)) {
//            r2DBCConfig.setUser(user);
//        }
//        if (StringUtil.isNotBlank(password)) {
//            r2DBCConfig.setPassword(password);
//        }
//        if (StringUtil.isNotBlank(usePool)) {
//            r2DBCConfig.setUsePool(Boolean.parseBoolean(usePool));
//        }
//        if (StringUtil.isNotBlank(poolMaxSize)) {
//            r2DBCConfig.setPoolMaxSize(Integer.parseInt(poolMaxSize));
//        }
//        if (StringUtil.isNotBlank(poolMaxIdleTime)) {
//            r2DBCConfig.setPoolMaxIdleTime(Long.parseLong(poolMaxIdleTime));
//        }
        r2DBCOperationDAOBuilder.build(r2DBCConfig);
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
        try {
            Group group = keycloakDao.getGroupById(realm.getId(), id);
            return group == null ? null : new GraphenceGroupModel(group);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public Stream<GroupModel> searchForGroupByNameStream(RealmModel realm, String search, Integer firstResult, Integer maxResults) {
        try {
            Set<Group> groupSet;
            if (firstResult != null && maxResults != null) {
                groupSet = keycloakDao.searchGroupListByName(realm.getId(), search, firstResult - 1, maxResults);
            } else if (firstResult != null) {
                groupSet = keycloakDao.searchGroupListByName(realm.getId(), search, firstResult - 1);
            } else if (maxResults != null) {
                groupSet = keycloakDao.searchGroupListByName(realm.getId(), search, 0, maxResults);
            } else {
                groupSet = keycloakDao.searchGroupListByName(realm.getId(), search);
            }
            return groupSet == null ? null : groupSet.stream().map(GraphenceGroupModel::new);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public RoleModel getRealmRole(RealmModel realm, String name) {
        try {
            Role role = keycloakDao.getRoleByName(realm.getId(), name);
            return role == null ? null : new GraphenceRoleModel(role);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public RoleModel getRoleById(RealmModel realm, String id) {
        try {
            Role role = keycloakDao.getRoleById(realm.getId(), id);
            return role == null ? null : new GraphenceRoleModel(role);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public Stream<RoleModel> searchForRolesStream(RealmModel realm, String search, Integer first, Integer max) {
        try {
            Set<Role> roleSet;
            if (first != null && max != null) {
                roleSet = keycloakDao.searchRoleListByName(realm.getId(), search, first - 1, max);
            } else if (first != null) {
                roleSet = keycloakDao.searchRoleListByName(realm.getId(), search, first - 1);
            } else if (max != null) {
                roleSet = keycloakDao.searchRoleListByName(realm.getId(), search, 0, max);
            } else {
                roleSet = keycloakDao.searchRoleListByName(realm.getId(), search);
            }
            return roleSet == null ? null : roleSet.stream().map(GraphenceRoleModel::new);
        } catch (Exception e) {
            Logger.error(e);
            return null;
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
        try {
            User user = keycloakDao.getUserById(realm.getId(), id);
            return user == null ? null : new GraphenceUserModel(user);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public UserModel getUserByUsername(String username, RealmModel realm) {
        try {
            User user = keycloakDao.getUserByLogin(realm.getId(), username);
            return user == null ? null : new GraphenceUserModel(user);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public UserModel getUserByEmail(String email, RealmModel realm) {
        try {
            User user = keycloakDao.getUserByEmail(realm.getId(), email);
            return user == null ? null : new GraphenceUserModel(user);
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> getUsers(RealmModel realm) {
        try {
            Set<User> userList = keycloakDao.getUserListRealmId(realm.getId());
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> getUsers(RealmModel realm, int firstResult, int maxResults) {
        try {
            Set<User> userList = keycloakDao.getUserListRealmId(realm.getId(), firstResult - 1, maxResults);
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realm) {
        return null;
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realm, int firstResult, int maxResults) {
        try {
            Set<User> userList = keycloakDao.searchUserListByName(realm.getId(), search, firstResult - 1, maxResults);
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> params, RealmModel realm) {
        String name = params.get(FIRST_NAME) == null ? null : params.get(FIRST_NAME);
        String lastName = params.get(FIRST_NAME) == null ? null : params.get(LAST_NAME);
        String email = params.get(FIRST_NAME) == null ? null : params.get(EMAIL);
        String login = params.get(FIRST_NAME) == null ? null : params.get(USERNAME);
        Boolean disable = params.get(FIRST_NAME) == null ? null : !Boolean.parseBoolean(params.get(ENABLED));
        try {
            Set<User> userList = keycloakDao.searchUserList(realm.getId(), name, lastName, email, login, disable);
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> params, RealmModel realm, int firstResult, int maxResults) {
        String name = params.get(FIRST_NAME) == null ? null : params.get(FIRST_NAME);
        String lastName = params.get(FIRST_NAME) == null ? null : params.get(LAST_NAME);
        String email = params.get(FIRST_NAME) == null ? null : params.get(EMAIL);
        String login = params.get(FIRST_NAME) == null ? null : params.get(USERNAME);
        Boolean disable = params.get(FIRST_NAME) == null ? null : !Boolean.parseBoolean(params.get(ENABLED));
        try {
            Set<User> userList = keycloakDao.searchUserList(realm.getId(), name, lastName, email, login, disable, firstResult - 1, maxResults);
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> getGroupMembers(RealmModel realm, GroupModel group) {
        try {
            Set<User> userList = keycloakDao.getUserListByGroupId(realm.getId(), group.getId());
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> getGroupMembers(RealmModel realm, GroupModel group, int firstResult, int maxResults) {
        try {
            Set<User> userList = keycloakDao.getUserListByGroupId(realm.getId(), group.getId(), firstResult - 1, maxResults);
            return userList == null ? null : userList.stream().map(GraphenceUserModel::new).collect(Collectors.toList());
        } catch (Exception e) {
            Logger.error(e);
            return null;
        }
    }

    @Override
    public List<UserModel> searchForUserByUserAttribute(String attrName, String attrValue, RealmModel realm) {
        return null;
    }
}
