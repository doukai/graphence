package io.graphence.core.dto.enumType;

import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Enum;

/**
 * 数据权限等级
 */
@Enum
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("数据权限等级")
public enum DataPermissionLevel {
  /**
   * 全部
   */
  @Description("全部")
  ALL,

  /**
   * 同级
   */
  @Description("同级")
  SAME_LEVEL,

  /**
   * 同级与下级
   */
  @Description("同级与下级")
  SAME_AND_LOWER,

  /**
   * 仅下级
   */
  @Description("仅下级")
  LOWER_ONLY
}
