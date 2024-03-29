package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class PermissionTypeExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private PermissionType val;

  private Collection<PermissionType> in;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public PermissionType getVal() {
    return this.val;
  }

  public void setVal(PermissionType val) {
    this.val = val;
  }

  public Collection<PermissionType> getIn() {
    return this.in;
  }

  public void setIn(Collection<PermissionType> in) {
    this.in = in;
  }
}
