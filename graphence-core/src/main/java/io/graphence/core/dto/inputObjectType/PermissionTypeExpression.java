package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.PermissionType;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Query Expression Input for 权限类型
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query Expression Input for 权限类型")
public class PermissionTypeExpression {
  /**
   * Operators
   */
  @DefaultValue("EQ")
  @Description("Operators")
  private Operator opr = Operator.EQ;

  /**
   * Value
   */
  @Description("Value")
  private PermissionType val;

  /**
   * Array
   */
  @Description("Array")
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
