package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.FilterLevel;
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
public class FilterLevelExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private FilterLevel val;

  private Collection<FilterLevel> in;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public FilterLevel getVal() {
    return this.val;
  }

  public void setVal(FilterLevel val) {
    this.val = val;
  }

  public Collection<FilterLevel> getIn() {
    return this.in;
  }

  public void setIn(Collection<FilterLevel> in) {
    this.in = in;
  }
}
