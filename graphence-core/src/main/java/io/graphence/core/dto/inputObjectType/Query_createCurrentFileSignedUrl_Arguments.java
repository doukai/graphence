package io.graphence.core.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.lang.String;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder")
public class Query_createCurrentFileSignedUrl_Arguments {
  private String fileId;

  private Integer ttlSeconds;

  public String getFileId() {
    return this.fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public Integer getTtlSeconds() {
    return this.ttlSeconds;
  }

  public void setTtlSeconds(Integer ttlSeconds) {
    this.ttlSeconds = ttlSeconds;
  }
}
