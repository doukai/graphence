package io.graphence.core.service;

import io.graphence.core.config.FileSignedUrlConfig;
import io.graphence.core.dto.Current;
import io.graphence.core.error.AuthenticationException;
import io.graphoenix.http.server.config.HttpServerConfig;
import io.graphoenix.http.server.context.RequestBeanScoped;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import reactor.netty.http.server.HttpServerRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.Base64;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;
import static io.netty.handler.codec.http.HttpHeaderNames.HOST;

@ApplicationScoped
public class FileSignedUrlService {

  public static final String EXPIRES_PARAM = "ge_expires";
  public static final String SUBJECT_PARAM = "ge_subject";
  public static final String REALM_PARAM = "ge_realm";
  public static final String SIGNATURE_PARAM = "ge_signature";
  public static final String LOCAL_FILE_SIGNED_URL_SUBJECT = "local-file-signed-url";

  private static final String HMAC_SHA256 = "HmacSHA256";
  private static final String METHOD = "GET";
  private static final byte[] GENERATED_SECRET = generatedSecret();

  private final FileSignedUrlConfig config;
  private final HttpServerConfig httpServerConfig;
  private final RequestBeanScoped requestBeanScoped;

  @Inject
  public FileSignedUrlService(
      FileSignedUrlConfig config,
      HttpServerConfig httpServerConfig,
      RequestBeanScoped requestBeanScoped) {
    this.config = config;
    this.httpServerConfig = httpServerConfig;
    this.requestBeanScoped = requestBeanScoped;
  }

  public String create(Current current, String fileId, Integer ttlSeconds) {
    long expiresAt = nowEpochSecond() + ttl(ttlSeconds);
    String subject = current.getId();
    String realm = Optional.ofNullable(current.getRealmId()).map(String::valueOf).orElse("");
    String path = downloadPath(fileId);
    String signature = sign(METHOD, path, fileId, subject, realm, expiresAt);
    String query =
        Stream.of(
                Map.entry(EXPIRES_PARAM, String.valueOf(expiresAt)),
                Map.entry(SUBJECT_PARAM, subject),
                Map.entry(REALM_PARAM, realm),
                Map.entry(SIGNATURE_PARAM, signature))
            .map(entry -> encodeQuery(entry.getKey()) + "=" + encodeQuery(entry.getValue()))
            .collect(Collectors.joining("&"));
    return baseUrl() + path + "?" + query;
  }

  public String createLocalFileDownloadUrl(String fileId) {
    return createLocalFileDownloadUrl(fileId, null);
  }

  public String createLocalFileDownloadUrl(String fileId, Integer ttlSeconds) {
    return createFileDownloadUrl(fileId, LOCAL_FILE_SIGNED_URL_SUBJECT, null, ttlSeconds);
  }

  public String createFileDownloadUrl(
      String fileId, String subject, Integer realmId, Integer ttlSeconds) {
    Current current = new Current().setId(requiredSubject(subject)).setRealmId(realmId);
    return create(current, fileId, ttlSeconds);
  }

  public Optional<Current> verify(String method, String path, Map<String, String> parameters) {
    if (!parameters.containsKey(EXPIRES_PARAM)
        || !parameters.containsKey(SUBJECT_PARAM)
        || !parameters.containsKey(REALM_PARAM)
        || !parameters.containsKey(SIGNATURE_PARAM)) {
      return Optional.empty();
    }
    if (!METHOD.equals(method)
        || !path.startsWith(httpServerConfig.getDownloadContextPath() + "/")) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    long expiresAt;
    try {
      expiresAt = Long.parseLong(parameters.get(EXPIRES_PARAM));
    } catch (NumberFormatException e) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    if (expiresAt < nowEpochSecond()) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    String subject = required(parameters, SUBJECT_PARAM);
    String realm = Optional.ofNullable(parameters.get(REALM_PARAM)).orElse("");
    String fileId =
        URLDecoder.decode(
            path.substring((httpServerConfig.getDownloadContextPath() + "/").length()),
            StandardCharsets.UTF_8);
    String expected = sign(method, path, fileId, subject, realm, expiresAt);
    String actual = required(parameters, SIGNATURE_PARAM);
    if (!MessageDigest.isEqual(
        expected.getBytes(StandardCharsets.UTF_8), actual.getBytes(StandardCharsets.UTF_8))) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    Current current = new Current().setId(subject);
    if (!realm.isBlank()) {
      try {
        current.setRealmId(Integer.valueOf(realm));
      } catch (NumberFormatException e) {
        throw new AuthenticationException(AUTHENTICATION_FAILED);
      }
    }
    return Optional.of(current);
  }

  private int ttl(Integer ttlSeconds) {
    int defaultTtl = Optional.ofNullable(config.getSignedUrlDefaultTtlSeconds()).orElse(300);
    int maxTtl = Optional.ofNullable(config.getSignedUrlMaxTtlSeconds()).orElse(defaultTtl);
    int ttl = Optional.ofNullable(ttlSeconds).orElse(defaultTtl);
    if (ttl <= 0 || maxTtl <= 0) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    return Math.min(ttl, maxTtl);
  }

  private String baseUrl() {
    String configured = config.getSignedUrlBaseUrl();
    if (configured != null && !configured.isBlank()) {
      return stripTrailingSlash(configured);
    }
    if (requestBeanScoped != null) {
      String requestBaseUrl =
          requestBeanScoped
              .get(HttpServerRequest.class)
              .map(
                  request -> {
                    String proto =
                        Optional.ofNullable(request.requestHeaders().get("X-Forwarded-Proto"))
                            .orElseGet(request::scheme);
                    String host =
                        Optional.ofNullable(request.requestHeaders().get("X-Forwarded-Host"))
                            .orElseGet(() -> request.requestHeaders().get(HOST));
                    return proto + "://" + host;
                  })
              .block();
      if (requestBaseUrl != null && !requestBaseUrl.isBlank()) {
        return requestBaseUrl;
      }
    }
    return "http://localhost:" + Optional.ofNullable(httpServerConfig.getPort()).orElse(8080);
  }

  private String downloadPath(String fileId) {
    return httpServerConfig.getDownloadContextPath() + "/" + encodePathSegment(fileId);
  }

  private String sign(
      String method, String path, String fileId, String subject, String realm, long expiresAt) {
    String payload =
        String.join("\n", method, path, fileId, subject, realm, String.valueOf(expiresAt));
    try {
      Mac mac = Mac.getInstance(HMAC_SHA256);
      mac.init(new SecretKeySpec(secret(), HMAC_SHA256));
      return Base64.getUrlEncoder()
          .withoutPadding()
          .encodeToString(mac.doFinal(payload.getBytes(StandardCharsets.UTF_8)));
    } catch (Exception e) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
  }

  private byte[] secret() {
    String secret = config.getSignedUrlSecret();
    if (secret == null || secret.isBlank()) {
      return GENERATED_SECRET;
    }
    try {
      return Base64.getDecoder().decode(secret);
    } catch (IllegalArgumentException e) {
      return secret.getBytes(StandardCharsets.UTF_8);
    }
  }

  private String required(Map<String, String> parameters, String name) {
    return Optional.ofNullable(parameters.get(name))
        .filter(value -> !value.isBlank() || REALM_PARAM.equals(name))
        .orElseThrow(() -> new AuthenticationException(AUTHENTICATION_FAILED));
  }

  private String requiredSubject(String subject) {
    return Optional.ofNullable(subject)
        .filter(value -> !value.isBlank())
        .orElseThrow(() -> new AuthenticationException(AUTHENTICATION_FAILED));
  }

  private String stripTrailingSlash(String value) {
    return value.endsWith("/") ? value.substring(0, value.length() - 1) : value;
  }

  private String encodePathSegment(String value) {
    return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
  }

  private String encodeQuery(String value) {
    return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
  }

  protected long nowEpochSecond() {
    return Instant.now().getEpochSecond();
  }

  private static byte[] generatedSecret() {
    byte[] secret = new byte[32];
    new SecureRandom().nextBytes(secret);
    return secret;
  }
}
