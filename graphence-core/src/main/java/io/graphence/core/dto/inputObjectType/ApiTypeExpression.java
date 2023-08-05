package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.ApiType;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@CompiledJson
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
public class ApiTypeExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private ApiType val;

  private Collection<ApiType> in;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public ApiType getVal() {
    return this.val;
  }

  public void setVal(ApiType val) {
    this.val = val;
  }

  public Collection<ApiType> getIn() {
    return this.in;
  }

  public void setIn(Collection<ApiType> in) {
    this.in = in;
  }
}
