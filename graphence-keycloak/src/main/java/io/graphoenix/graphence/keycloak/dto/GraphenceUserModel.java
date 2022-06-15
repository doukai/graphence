package io.graphoenix.graphence.keycloak.dto;

import io.graphoenix.graphence.dto.objectType.User;
import org.keycloak.models.ClientModel;
import org.keycloak.models.GroupModel;
import org.keycloak.models.RoleModel;
import org.keycloak.models.UserModel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class GraphenceUserModel implements UserModel {

    private final User user;

    public GraphenceUserModel(User user) {
        this.user = user;
    }

    public static User toUser(UserModel userModel, String realmId) {
        User user = new User();
        user.setRealmId(realmId);
        user.setId(userModel.getId());
        user.setLogin(userModel.getUsername());
        user.setEmail(userModel.getEmail());
        user.setDisable(!userModel.isEnabled());
        user.setName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        return user;
    }

    @Override
    public String getId() {
        return user.getId();
    }

    @Override
    public String getUsername() {
        return user.getLogin();
    }

    @Override
    public void setUsername(String username) {
        user.setLogin(username);
    }

    @Override
    public Long getCreatedTimestamp() {
        return user.getCreateTime().getLong(ChronoField.MICRO_OF_SECOND);
    }

    @Override
    public void setCreatedTimestamp(Long timestamp) {
        user.setCreateTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), TimeZone.getDefault().toZoneId()));
    }

    @Override
    public boolean isEnabled() {
        return !user.getDisable();
    }

    @Override
    public void setEnabled(boolean enabled) {
        user.setDisable(!enabled);
    }

    @Override
    public void setSingleAttribute(String name, String value) {

    }

    @Override
    public void setAttribute(String name, List<String> values) {

    }

    @Override
    public void removeAttribute(String name) {

    }

    @Override
    public String getFirstAttribute(String name) {
        return null;
    }

    @Override
    public List<String> getAttribute(String name) {
        return null;
    }

    @Override
    public Map<String, List<String>> getAttributes() {
        return null;
    }

    @Override
    public Set<String> getRequiredActions() {
        return null;
    }

    @Override
    public void addRequiredAction(String action) {

    }

    @Override
    public void removeRequiredAction(String action) {

    }

    @Override
    public String getFirstName() {
        return user.getName();
    }

    @Override
    public void setFirstName(String firstName) {
        user.setName(firstName);
    }

    @Override
    public String getLastName() {
        return user.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        user.setLastName(lastName);
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public void setEmail(String email) {
        user.setEmail(email);
    }

    @Override
    public boolean isEmailVerified() {
        return false;
    }

    @Override
    public void setEmailVerified(boolean verified) {

    }

    @Override
    public Set<GroupModel> getGroups() {
        if (user.getGroups() == null) {
            return null;
        }
        return user.getGroups().stream().map(GraphenceGroupModel::new).collect(Collectors.toSet());
    }

    @Override
    public void joinGroup(GroupModel group) {
        if (user.getGroups() == null) {
            user.setGroups(new HashSet<>());
        }
        user.getGroups().add(GraphenceGroupModel.toGroup(group, user.getRealmId()));
    }

    @Override
    public void leaveGroup(GroupModel group) {
        if (user.getGroups() != null) {
            user.setGroups(user.getGroups().stream().filter(userGroup -> !userGroup.getId().equals(group.getId())).collect(Collectors.toSet()));
        }
    }

    @Override
    public boolean isMemberOf(GroupModel group) {
        if (user.getGroups() == null) {
            return false;
        }
        return user.getGroups().stream().anyMatch(userGroup -> userGroup.getId().equals(group.getId()));
    }

    @Override
    public String getFederationLink() {
        return null;
    }

    @Override
    public void setFederationLink(String link) {

    }

    @Override
    public String getServiceAccountClientLink() {
        return null;
    }

    @Override
    public void setServiceAccountClientLink(String clientInternalId) {

    }

    @Override
    public Set<RoleModel> getRealmRoleMappings() {
        if (user.getRoles() == null) {
            return null;
        }
        return user.getRoles().stream().filter(role -> role.getRealmId().equals(user.getRealmId())).map(GraphenceRoleModel::new).collect(Collectors.toSet());
    }

    @Override
    public Set<RoleModel> getClientRoleMappings(ClientModel app) {
        return null;
    }

    @Override
    public boolean hasRole(RoleModel role) {
        if (user.getRoles() == null) {
            return false;
        }
        return user.getRoles().stream().anyMatch(userRole -> userRole.getId().equals(role.getId()));
    }

    @Override
    public void grantRole(RoleModel role) {
        if (user.getRoles() == null) {
            user.setRoles(new HashSet<>());
        }
        user.getRoles().add(GraphenceRoleModel.toRole(role, user.getRealmId()));
    }

    @Override
    public Set<RoleModel> getRoleMappings() {
        if (user.getRoles() == null) {
            return null;
        }
        return user.getRoles().stream().filter(role -> role.getRealmId().equals(user.getRealmId())).map(GraphenceRoleModel::new).collect(Collectors.toSet());
    }

    @Override
    public void deleteRoleMapping(RoleModel role) {
        if (user.getRoles() != null) {
            user.setRoles(user.getRoles().stream().filter(userRole -> !userRole.getId().equals(role.getId())).collect(Collectors.toSet()));
        }
    }
}
