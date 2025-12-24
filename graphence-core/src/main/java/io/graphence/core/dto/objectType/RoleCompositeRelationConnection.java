package io.graphence.core.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.objectType.PageInfo;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Connection Object for Relationship Object between 角色 and 角色
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Connection Object for Relationship Object between 角色 and 角色")
public class RoleCompositeRelationConnection {
  /**
   * Total
   */
  @Description("Total")
  private Integer totalCount;

  /**
   * Page Info
   */
  @Description("Page Info")
  private PageInfo pageInfo;

  /**
   * Edges
   */
  @Description("Edges")
  private Collection<RoleCompositeRelationEdge> edges;

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

  public Collection<RoleCompositeRelationEdge> getEdges() {
    return this.edges;
  }

  public void setEdges(Collection<RoleCompositeRelationEdge> edges) {
    this.edges = edges;
  }
}
