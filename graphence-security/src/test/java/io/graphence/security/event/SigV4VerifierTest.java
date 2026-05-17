package io.graphence.security.event;

import io.graphence.core.config.ApiAuthConfig;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.ApiSecretCipher;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.netty.http.server.HttpServerRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SigV4VerifierTest {

  private static final String ACCESS_KEY = "GEAK_TEST_ACCESS_KEY";
  private static final String SECRET = "test-api-secret";
  private static final String ENCRYPTION_KEY =
      Base64.getEncoder().encodeToString("0123456789abcdef0123456789abcdef".getBytes(StandardCharsets.UTF_8));
  private static final DateTimeFormatter AMZ_DATE_FORMATTER =
      DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(ZoneOffset.UTC);

  private ApiAuthConfig config;
  private SigV4Verifier verifier;
  private ApiSecretCipher cipher;

  @BeforeEach
  void setUp() {
    config = new ApiAuthConfig();
    config.setEnabled(true);
    config.setTimestampSkewSeconds(300);
    config.setNonceTtlSeconds(300);
    config.setRegion("default");
    config.setService("graphence");
    config.setSecretEncryptionKey(ENCRYPTION_KEY);
    cipher = new ApiSecretCipher(config);
    verifier = new SigV4Verifier(config, cipher);
  }

  @Test
  void verifiesSignedGetRequestWithCanonicalQueryAndHeaders() {
    String amzDate = AMZ_DATE_FORMATTER.format(Instant.now());
    HttpHeaders headers =
        signedHeaders(
            HttpMethod.GET,
            "/graphql?b=two%20words&a=1&a=0",
            amzDate,
            "nonce-1",
            List.of("host", "x-amz-date", "x-ge-nonce"));

    SigV4Authentication authentication =
        verifier.verify(request(HttpMethod.GET, "/graphql?b=two%20words&a=1&a=0", headers), cipher.encrypt(SECRET));

    assertEquals(ACCESS_KEY, authentication.getAccessKey());
    assertEquals("nonce-1", authentication.getNonce());
  }

  @Test
  void rejectsWrongSignature() {
    String amzDate = AMZ_DATE_FORMATTER.format(Instant.now());
    HttpHeaders headers =
        signedHeaders(
            HttpMethod.GET,
            "/graphql",
            amzDate,
            "nonce-2",
            List.of("host", "x-amz-date", "x-ge-nonce"));
    headers.set("Authorization", headers.get("Authorization").replaceAll("Signature=[0-9a-f]+", "Signature=00"));

    assertThrows(
        AuthenticationException.class,
        () -> verifier.verify(request(HttpMethod.GET, "/graphql", headers), cipher.encrypt(SECRET)));
  }

  @Test
  void rejectsUnsignedNonceHeader() {
    String amzDate = AMZ_DATE_FORMATTER.format(Instant.now());
    HttpHeaders headers = signedHeaders(HttpMethod.GET, "/graphql", amzDate, "nonce-3", List.of("host", "x-amz-date"));

    assertThrows(
        AuthenticationException.class,
        () -> verifier.verify(request(HttpMethod.GET, "/graphql", headers), cipher.encrypt(SECRET)));
  }

  @Test
  void rejectsTimestampOutsideSkewWindow() {
    String amzDate = AMZ_DATE_FORMATTER.format(Instant.now().minusSeconds(301));
    HttpHeaders headers =
        signedHeaders(
            HttpMethod.GET,
            "/graphql",
            amzDate,
            "nonce-4",
            List.of("host", "x-amz-date", "x-ge-nonce"));

    assertThrows(
        AuthenticationException.class,
        () -> verifier.verify(request(HttpMethod.GET, "/graphql", headers), cipher.encrypt(SECRET)));
  }

  @Test
  void rejectsSignedPayloadHashUntilBodyVerificationIsSupported() {
    String amzDate = AMZ_DATE_FORMATTER.format(Instant.now());
    HttpHeaders headers =
        signedHeaders(
            HttpMethod.POST,
            "/graphql",
            amzDate,
            "nonce-5",
            List.of("host", "x-amz-date", "x-ge-nonce", "x-amz-content-sha256"));
    headers.set("x-amz-content-sha256", "e3b0c44298fc1c149afbf4c8996fb924");

    assertThrows(
        AuthenticationException.class,
        () -> verifier.verify(request(HttpMethod.POST, "/graphql", headers), cipher.encrypt(SECRET)));
  }

  @Test
  void verifiesJsonPostWithUnsignedPayload() {
    String amzDate = AMZ_DATE_FORMATTER.format(Instant.now());
    HttpHeaders headers =
        signedHeaders(
            HttpMethod.POST,
            "/graphql",
            amzDate,
            "nonce-6",
            List.of("host", "content-type", "x-amz-date", "x-ge-nonce", "x-amz-content-sha256"));

    SigV4Authentication authentication =
        verifier.verify(request(HttpMethod.POST, "/graphql", headers), cipher.encrypt(SECRET));

    assertEquals(ACCESS_KEY, authentication.getAccessKey());
  }

  private HttpHeaders signedHeaders(
      HttpMethod method, String uri, String amzDate, String nonce, List<String> signedHeaderNames) {
    HttpHeaders headers = new DefaultHttpHeaders();
    headers.set("Host", "example.graphence.local");
    headers.set("x-amz-date", amzDate);
    headers.set("x-ge-nonce", nonce);
    headers.set("content-type", "application/json; charset=utf-8");
    headers.set("x-amz-content-sha256", SigV4Verifier.UNSIGNED_PAYLOAD);
    String signedHeaders =
        signedHeaderNames.stream().map(name -> name.toLowerCase(Locale.ROOT)).sorted().collect(Collectors.joining(";"));
    String date = amzDate.substring(0, 8);
    String credentialScope = String.join("/", date, config.getRegion(), config.getService(), "aws4_request");
    String canonicalRequest = canonicalRequest(method, uri, headers, signedHeaders);
    String stringToSign =
        String.join(
            "\n",
            SigV4Verifier.ALGORITHM,
            amzDate,
            credentialScope,
            hex(sha256(canonicalRequest.getBytes(StandardCharsets.UTF_8))));
    String signature = hex(hmac(signingKey(SECRET, date), stringToSign));
    headers.set(
        "Authorization",
        SigV4Verifier.ALGORITHM
            + " Credential="
            + ACCESS_KEY
            + "/"
            + credentialScope
            + ", SignedHeaders="
            + signedHeaders
            + ", Signature="
            + signature);
    return headers;
  }

  private String canonicalRequest(HttpMethod method, String uri, HttpHeaders headers, String signedHeaders) {
    String path = uri.split("\\?", 2)[0];
    String query = uri.contains("?") ? uri.split("\\?", 2)[1] : "";
    String canonicalHeaders =
        Arrays.stream(signedHeaders.split(";"))
            .map(header -> header + ":" + headers.getAll(header).stream()
                .map(value -> value.trim().replaceAll("\\s+", " "))
                .collect(Collectors.joining(",")) + "\n")
            .collect(Collectors.joining());
    return String.join(
        "\n",
        method.name(),
        canonicalUri(path),
        canonicalQuery(query),
        canonicalHeaders,
        signedHeaders,
        SigV4Verifier.UNSIGNED_PAYLOAD);
  }

  private String canonicalUri(String path) {
    if (path == null || path.isBlank()) {
      return "/";
    }
    return Arrays.stream(path.split("/", -1)).map(this::encode).collect(Collectors.joining("/"));
  }

  private String canonicalQuery(String query) {
    if (query == null || query.isBlank()) {
      return "";
    }
    return Arrays.stream(query.split("&"))
        .map(part -> part.split("=", 2))
        .map(parts -> Map.entry(decode(parts[0]), parts.length > 1 ? decode(parts[1]) : ""))
        .sorted(
            Comparator.comparing((Map.Entry<String, String> entry) -> encode(entry.getKey()))
                .thenComparing(entry -> encode(entry.getValue())))
        .map(entry -> encode(entry.getKey()) + "=" + encode(entry.getValue()))
        .collect(Collectors.joining("&"));
  }

  private HttpServerRequest request(HttpMethod method, String uri, HttpHeaders headers) {
    return (HttpServerRequest)
        Proxy.newProxyInstance(
            HttpServerRequest.class.getClassLoader(),
            new Class[] {HttpServerRequest.class},
            (proxy, methodInvocation, args) -> {
              if ("method".equals(methodInvocation.getName())) {
                return method;
              }
              if ("uri".equals(methodInvocation.getName())) {
                return uri;
              }
              if ("requestHeaders".equals(methodInvocation.getName())) {
                return headers;
              }
              if ("toString".equals(methodInvocation.getName())) {
                return method + " " + uri;
              }
              throw new UnsupportedOperationException(methodInvocation.getName());
            });
  }

  private byte[] signingKey(String secret, String date) {
    byte[] dateKey = hmac(("AWS4" + secret).getBytes(StandardCharsets.UTF_8), date);
    byte[] regionKey = hmac(dateKey, config.getRegion());
    byte[] serviceKey = hmac(regionKey, config.getService());
    return hmac(serviceKey, "aws4_request");
  }

  private byte[] hmac(byte[] key, String data) {
    try {
      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(new SecretKeySpec(key, "HmacSHA256"));
      return mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private byte[] sha256(byte[] data) {
    try {
      return MessageDigest.getInstance("SHA-256").digest(data);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private String encode(String value) {
    return URLEncoder.encode(Optional.ofNullable(value).orElse(""), StandardCharsets.UTF_8)
        .replace("+", "%20")
        .replace("%7E", "~");
  }

  private String decode(String value) {
    return java.net.URLDecoder.decode(value, StandardCharsets.UTF_8);
  }

  private String hex(byte[] bytes) {
    StringBuilder stringBuilder = new StringBuilder(bytes.length * 2);
    for (byte b : bytes) {
      stringBuilder.append(String.format("%02x", b));
    }
    return stringBuilder.toString();
  }
}
