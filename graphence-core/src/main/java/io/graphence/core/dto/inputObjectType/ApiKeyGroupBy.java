package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Group Input for API Key
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
@Description("Group Input for API Key")
public class ApiKeyGroupBy {
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
   * 租户
   */
  @Description("租户")
  private RealmGroupBy realm;

  /**
   * OrderByes
   */
  @Description("OrderByes")
  private Collection<ApiKeyGroupBy> gbs;

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

  public RealmGroupBy getRealm() {
    return this.realm;
  }

  public void setRealm(RealmGroupBy realm) {
    this.realm = realm;
  }

  public Collection<ApiKeyGroupBy> getGbs() {
    return this.gbs;
  }

  public void setGbs(Collection<ApiKeyGroupBy> gbs) {
    this.gbs = gbs;
  }
}
