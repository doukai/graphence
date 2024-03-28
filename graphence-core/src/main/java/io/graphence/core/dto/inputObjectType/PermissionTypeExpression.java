package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class PermissionTypeExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private PermissionType val;

  private Collection<PermissionType> arr;

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

  public Collection<PermissionType> getArr() {
    return this.arr;
  }

  public void setArr(Collection<PermissionType> arr) {
    this.arr = arr;
  }
}
