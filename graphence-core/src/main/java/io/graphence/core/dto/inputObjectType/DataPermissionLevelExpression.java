package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.enumType.DataPermissionLevel;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Query Expression Input for 数据权限等级
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Query Expression Input for 数据权限等级")
public class DataPermissionLevelExpression {
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
  private DataPermissionLevel val;

  /**
   * Array
   */
  @Description("Array")
  private Collection<DataPermissionLevel> arr;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public DataPermissionLevel getVal() {
    return this.val;
  }

  public void setVal(DataPermissionLevel val) {
    this.val = val;
  }

  public Collection<DataPermissionLevel> getArr() {
    return this.arr;
  }

  public void setArr(Collection<DataPermissionLevel> arr) {
    this.arr = arr;
  }
}
