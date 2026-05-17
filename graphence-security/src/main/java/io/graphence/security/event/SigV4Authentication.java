package io.graphence.security.event;

public class SigV4Authentication {

  private final String accessKey;
  private final String nonce;

  public SigV4Authentication(String accessKey, String nonce) {
    this.accessKey = accessKey;
    this.nonce = nonce;
  }

  public String getAccessKey() {
    return accessKey;
  }

  public String getNonce() {
    return nonce;
  }
}
