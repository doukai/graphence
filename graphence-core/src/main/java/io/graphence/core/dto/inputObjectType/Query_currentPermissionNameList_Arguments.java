package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class Query_currentPermissionNameList_Arguments {
  private Collection<String> types;

  public Collection<String> getTypes() {
    return this.types;
  }

  public void setTypes(Collection<String> types) {
    this.types = types;
  }
}
