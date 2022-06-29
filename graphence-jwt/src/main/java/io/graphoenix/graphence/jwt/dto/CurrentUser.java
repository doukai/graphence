package io.graphoenix.graphence.jwt.dto;

import java.util.Set;

public class CurrentUser {

    private String name;

    private String lastName;

    private String login;

    private String email;

    private Set<String> groups;

    private Set<String> roles;

    public String getName() {
        return name;
    }

    public CurrentUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CurrentUser setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public CurrentUser setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CurrentUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<String> getGroups() {
        return groups;
    }

    public CurrentUser setGroups(Set<String> groups) {
        this.groups = groups;
        return this;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public CurrentUser setRoles(Set<String> roles) {
        this.roles = roles;
        return this;
    }
}
