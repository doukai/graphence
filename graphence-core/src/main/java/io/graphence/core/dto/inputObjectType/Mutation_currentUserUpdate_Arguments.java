package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation_currentUserUpdate_Arguments {
  private UserInput userInput;

  public UserInput getUserInput() {
    return this.userInput;
  }

  public void setUserInput(UserInput userInput) {
    this.userInput = userInput;
  }
}
