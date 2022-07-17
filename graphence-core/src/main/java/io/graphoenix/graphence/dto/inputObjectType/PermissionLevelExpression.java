package io.graphoenix.graphence.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.graphence.dto.enumType.Operator;
import io.graphoenix.graphence.dto.enumType.PermissionLevel;
import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class PermissionLevelExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private PermissionLevel val;

  private Collection<PermissionLevel> in;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public PermissionLevel getVal() {
    return this.val;
  }

  public void setVal(PermissionLevel val) {
    this.val = val;
  }

  public Collection<PermissionLevel> getIn() {
    return this.in;
  }

  public void setIn(Collection<PermissionLevel> in) {
    this.in = in;
  }
}
