package io.graphence.core.dto;

import com.dslplatform.json.CompiledJson;
import io.graphence.core.dto.objectType.ApiKey;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Description("API Key Secret")
public class ApiKeySecret {

  @Description("API Key")
  private ApiKey apiKey;

  @Description("Access Key")
  private String accessKey;

  @Description("Secret")
  private String secret;

  public ApiKey getApiKey() {
    return apiKey;
  }

  public ApiKeySecret setApiKey(ApiKey apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public String getAccessKey() {
    return accessKey;
  }

  public ApiKeySecret setAccessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

  public String getSecret() {
    return secret;
  }

  public ApiKeySecret setSecret(String secret) {
    this.secret = secret;
    return this;
  }
}
