package io.graphence.core.dto.enumType;

import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Enum;

/**
 * 权限类型
 */
@Enum
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("权限类型")
public enum PermissionType {
  /**
   * 读取
   */
  @Description("读取")
  READ,

  /**
   * 写入
   */
  @Description("写入")
  WRITE,

  /**
   * 全部
   */
  @Description("全部")
  ANY
}
