package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Query_currentPermissionNameListByTypes_Arguments {
  private Collection<String> types;

  public Collection<String> getTypes() {
    return this.types;
  }

  public void setTypes(Collection<String> types) {
    this.types = types;
  }
}
