package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.MenuType;
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
public class MenuTypeExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private MenuType val;

  private Collection<MenuType> in;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public MenuType getVal() {
    return this.val;
  }

  public void setVal(MenuType val) {
    this.val = val;
  }

  public Collection<MenuType> getIn() {
    return this.in;
  }

  public void setIn(Collection<MenuType> in) {
    this.in = in;
  }
}
