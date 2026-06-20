package io.graphence.core.dto.interfaceType;

import jakarta.annotation.Generated;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Interface;

/**
 * 数据归属
 */
@Interface
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("数据归属")
public interface CreateBy {
  /**
   * 创建用户ID
   */
  @Description("创建用户ID")
  String createUserId = null;

  /**
   * 创建组ID
   */
  @Description("创建组ID")
  String createGroupId = null;

  default String getCreateUserId() {
    return createUserId;
  }

  void setCreateUserId(String createUserId);

  default String getCreateGroupId() {
    return createGroupId;
  }

  void setCreateGroupId(String createGroupId);
}
