package io.graphence.core.dto.enumType;

import io.graphoenix.spi.annotation.Ignore;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Enum;

/**
 * 权限类型
 */
@Enum
@Generated("io.graphoenix.java.generator.builder.TypeSpecBuilderProxy")
@Ignore
@Description("权限类型")
public enum PermissionType {
  READ,

  WRITE
}
