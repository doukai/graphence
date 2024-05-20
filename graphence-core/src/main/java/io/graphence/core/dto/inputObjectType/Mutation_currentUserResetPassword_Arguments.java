package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation_currentUserResetPassword_Arguments {
  private String password;

  private String newPassword;

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNewPassword() {
    return this.newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }
}
