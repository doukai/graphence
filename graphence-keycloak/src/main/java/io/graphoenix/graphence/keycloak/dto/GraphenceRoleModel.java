package io.graphoenix.graphence.keycloak.dto;

import io.graphoenix.graphence.core.dto.objectType.Role;
import org.keycloak.models.RoleContainerModel;
import org.keycloak.models.RoleModel;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GraphenceRoleModel implements RoleModel {

    private final Role role;

    public GraphenceRoleModel(Role role) {
        this.role = role;
    }

    public static Role toRole(RoleModel roleModel, String realmId) {
        Role role = new Role();
        role.setId(realmId);
        role.setId(roleModel.getId());
        role.setName(roleModel.getName());
        return role;
    }

    @Override
    public String getName() {
        return role.getName();
    }

    @Override
    public String getDescription() {
        return role.getDescription();
    }

    @Override
    public void setDescription(String description) {
        role.setDescription(description);
    }

    @Override
    public String getId() {
        return role.getId();
    }

    @Override
    public void setName(String name) {
        role.setName(name);
    }

    @Override
    public boolean isComposite() {
        return role.getComposites() != null && role.getComposites().size() > 0;
    }

    @Override
    public void addCompositeRole(RoleModel role) {
        if (this.role.getComposites() == null) {
            this.role.setComposites(new HashSet<>());
        }
        this.role.getComposites().add(toRole(role, this.role.getRealmId()));
    }

    @Override
    public void removeCompositeRole(RoleModel role) {
        if (this.role.getComposites() != null) {
            this.role.setComposites(this.role.getComposites().stream().filter(composite -> !composite.getId().equals(role.getId())).collect(Collectors.toSet()));
        }
    }

    @Override
    public Stream<RoleModel> getCompositesStream(String search, Integer first, Integer max) {
        if (first != null && max != null) {
            return role.getComposites().stream().filter(role -> role.getName().equals(search)).skip(first - 1).limit(max).map(GraphenceRoleModel::new);
        } else if (first != null) {
            return role.getComposites().stream().filter(role -> role.getName().equals(search)).skip(first - 1).map(GraphenceRoleModel::new);
        } else {
            return role.getComposites().stream().filter(role -> role.getName().equals(search)).map(GraphenceRoleModel::new);
        }
    }

    @Override
    public boolean isClientRole() {
        return false;
    }

    @Override
    public String getContainerId() {
        return null;
    }

    @Override
    public RoleContainerModel getContainer() {
        return null;
    }

    @Override
    public boolean hasRole(RoleModel role) {
        if (this.role.getComposites() == null) {
            return false;
        }
        return this.role.getComposites().stream().anyMatch(composite -> composite.getId().equals(role.getId()));
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
    public Stream<String> getAttributeStream(String name) {
        return null;
    }

    @Override
    public Map<String, List<String>> getAttributes() {
        return null;
    }
}
