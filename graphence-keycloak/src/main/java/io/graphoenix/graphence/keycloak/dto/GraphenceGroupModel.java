package io.graphoenix.graphence.keycloak.dto;

import io.graphoenix.graphence.core.dto.objectType.Group;
import org.keycloak.models.ClientModel;
import org.keycloak.models.GroupModel;
import org.keycloak.models.RoleModel;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GraphenceGroupModel implements GroupModel {

    private final Group group;

    public GraphenceGroupModel(Group group) {
        this.group = group;
    }

    public static Group toGroup(GroupModel groupModel, String realmId) {
        Group group = new Group();
        group.setRealmId(realmId);
        group.setId(groupModel.getId());
        group.setName(groupModel.getName());
        return group;
    }

    @Override
    public String getId() {
        return group.getId();
    }

    @Override
    public String getName() {
        return group.getName();
    }

    @Override
    public void setName(String name) {
        group.setName(name);
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
    public GroupModel getParent() {
        if (group.getParent() == null) {
            return null;
        }
        return new GraphenceGroupModel(group.getParent());
    }

    @Override
    public String getParentId() {
        return group.getParentId() + "";
    }

    @Override
    public Set<GroupModel> getSubGroups() {
        if (group.getSubGroups() == null) {
            return null;
        }
        return group.getSubGroups().stream().map(GraphenceGroupModel::new).collect(Collectors.toSet());
    }

    @Override
    public void setParent(GroupModel group) {
        this.group.setParent(toGroup(group, this.group.getRealmId()));
    }

    @Override
    public void addChild(GroupModel subGroup) {
        if (this.group.getSubGroups() == null) {
            this.group.setSubGroups(new HashSet<>());
        }
        this.group.getSubGroups().add(toGroup(subGroup, this.group.getRealmId()));
    }

    @Override
    public void removeChild(GroupModel subGroup) {
        if (this.group.getSubGroups() != null) {
            this.group.setSubGroups(this.group.getSubGroups().stream().filter(group -> !group.getId().equals(subGroup.getId())).collect(Collectors.toSet()));
        }
    }

    @Override
    public Set<RoleModel> getRealmRoleMappings() {
        if (this.group.getRoles() != null) {
            return null;
        }
        return group.getRoles().stream().map(GraphenceRoleModel::new).collect(Collectors.toSet());
    }

    @Override
    public Set<RoleModel> getClientRoleMappings(ClientModel app) {
        return null;
    }

    @Override
    public boolean hasRole(RoleModel role) {
        if (group.getRoles() == null) {
            return false;
        }
        return group.getRoles().stream().anyMatch(userRole -> userRole.getId().equals(role.getId()));
    }

    @Override
    public void grantRole(RoleModel role) {
        if (group.getRoles() == null) {
            group.setRoles(new HashSet<>());
        }
        group.getRoles().add(GraphenceRoleModel.toRole(role, group.getRealmId()));
    }

    @Override
    public Set<RoleModel> getRoleMappings() {
        if (group.getRoles() == null) {
            return null;
        }
        return group.getRoles().stream().filter(role -> role.getRealmId().equals(group.getRealmId())).map(GraphenceRoleModel::new).collect(Collectors.toSet());
    }

    @Override
    public void deleteRoleMapping(RoleModel role) {
        if (group.getRoles() != null) {
            group.setRoles(group.getRoles().stream().filter(userRole -> !userRole.getId().equals(role.getId())).collect(Collectors.toSet()));
        }
    }
}
