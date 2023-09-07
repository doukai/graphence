package io.graphence.core.config;

import com.typesafe.config.Optional;
import org.eclipse.microprofile.config.inject.ConfigProperties;

@ConfigProperties(prefix = "security")
public class SecurityConfig {

    @Optional
    private String initialPassword;

    @Optional
    private Boolean buildPermission = false;

    @Optional
    private String rootUser;

    @Optional
    private String rootPassword;

    public String getInitialPassword() {
        return initialPassword;
    }

    public void setInitialPassword(String initialPassword) {
        this.initialPassword = initialPassword;
    }

    public Boolean getBuildPermission() {
        return buildPermission;
    }

    public void setBuildPermission(Boolean buildPermission) {
        this.buildPermission = buildPermission;
    }

    public String getRootUser() {
        return rootUser;
    }

    public void setRootUser(String rootUser) {
        this.rootUser = rootUser;
    }

    public String getRootPassword() {
        return rootPassword;
    }

    public void setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
    }
}
