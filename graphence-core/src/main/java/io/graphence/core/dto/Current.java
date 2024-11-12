package io.graphence.core.dto;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.objectType.Group;
import io.graphence.core.dto.objectType.Role;
import io.graphence.core.dto.objectType.User;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Type
@CompiledJson
@Description("Current")
public class Current {

    @Description("ID")
    private String id;

    @Description("姓名")
    private String name;

    @Description("姓氏")
    private String lastName;

    @Description("账号")
    private String login;

    @Description("租户ID")
    private Integer realmId;

    @Description("组")
    private List<String> groups;

    @Description("角色")
    private List<String> roles;

    public String getId() {
        return id;
    }

    public Current setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Current setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Current setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public Current setLogin(String login) {
        this.login = login;
        return this;
    }

    public Integer getRealmId() {
        return realmId;
    }

    public Current setRealmId(Integer realmId) {
        this.realmId = realmId;
        return this;
    }

    public List<String> getGroups() {
        return groups;
    }

    public Current setGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public List<String> getRoles() {
        return roles;
    }

    public Current setRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public static Current of(User user) {
        return new Current()
                .setId(user.getId())
                .setLogin(user.getLogin())
                .setRealmId(user.getRealmId())
                .setName(user.getName())
                .setLastName(user.getLastName())
                .setRoles(Stream.ofNullable(user.getRoles()).flatMap(Collection::stream).map(Role::getName).collect(Collectors.toList()))
                .setGroups(Stream.ofNullable(user.getGroups()).flatMap(Collection::stream).map(Group::getName).collect(Collectors.toList()));
    }
}
