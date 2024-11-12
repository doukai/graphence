package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.objectType.PageInfo;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 租户 连接
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("租户 连接")
public class RealmConnection {
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
  private Collection<RealmEdge> edges;

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

  public Collection<RealmEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(Collection<RealmEdge> edges) {
    this.edges = edges;
  }
}
