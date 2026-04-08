package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for 租户
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for 租户")
public class RealmGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<RealmGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public Collection<RealmGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<RealmGroupBy> gbs) {
    this.gbs = gbs;
  }
}
