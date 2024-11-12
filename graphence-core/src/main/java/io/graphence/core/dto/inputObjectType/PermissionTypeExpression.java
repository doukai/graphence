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
 * 权限类型 查询表达式
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限类型 查询表达式")
public class PermissionTypeExpression {
  /**
   * 条件
   */
  @DefaultValue("EQ")
  @Description("条件")
  private Operator opr = Operator.EQ;

  /**
   * 值
   */
  @Description("值")
  private PermissionType val;

  /**
   * 组
   */
  @Description("组")
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
