package null.dto.inputObjectType;

import io.graphoenix.spi.annotation.Skip;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import null.dto.enumType.Operator;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Skip
public class IntExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private Integer val;

  private Collection<Integer> in;

  @DefaultValue("false")
  private Boolean skipNull;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public Integer getVal() {
    return this.val;
  }

  public void setVal(Integer val) {
    this.val = val;
  }

  public Collection<Integer> getIn() {
    return this.in;
  }

  public void setIn(Collection<Integer> in) {
    this.in = in;
  }

  public Boolean getSkipNull() {
    return this.skipNull;
  }

  public void setSkipNull(Boolean skipNull) {
    this.skipNull = skipNull;
  }
}