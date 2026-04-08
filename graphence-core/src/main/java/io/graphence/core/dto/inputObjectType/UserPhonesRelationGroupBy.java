package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for Relationship Object between 用户 and 手机号
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for Relationship Object between 用户 and 手机号")
public class UserPhonesRelationGroupBy {
  /**
   * Group By Field Names
   */
  @Description("Group By Field Names")
  private Collection<String> by;

  /**
   * 用户
   */
  @Description("用户")
  private UserGroupBy user;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<UserPhonesRelationGroupBy> gbs;

  public Collection<String> getBy() {
    return this.by;
  }

  public void setBy(Collection<String> by) {
    this.by = by;
  }

  public UserGroupBy getUser() {
    return this.user;
  }

  public void setUser(UserGroupBy user) {
    this.user = user;
  }

  public Collection<UserPhonesRelationGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<UserPhonesRelationGroupBy> gbs) {
    this.gbs = gbs;
  }
}
