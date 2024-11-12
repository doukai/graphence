package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.objectType.PageInfo;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 用户 手机号 关系 连接
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户 手机号 关系 连接")
public class UserPhonesRelationConnection {
  /**
   * 条数
   */
  @Description("条数")
  private Integer totalCount;

  /**
   * 分页信息
   */
  @Description("分页信息")
  private PageInfo pageInfo;

  /**
   * 边缘
   */
  @Description("边缘")
  private Collection<UserPhonesRelationEdge> edges;

  public Integer getTotalCount() {
    return this.totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public PageInfo getPageInfo() {
    return this.pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  public Collection<UserPhonesRelationEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(Collection<UserPhonesRelationEdge> edges) {
    this.edges = edges;
  }
}
