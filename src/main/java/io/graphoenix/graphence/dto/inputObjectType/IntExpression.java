package io.graphoenix.graphence.dto.inputObjectType;

import io.graphoenix.graphence.dto.enumType.Operator;
import io.graphoenix.spi.annotation.SchemaBean;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@Input
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@SchemaBean
public class IntExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private Integer val;

  private Collection<Integer> in;

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
}
