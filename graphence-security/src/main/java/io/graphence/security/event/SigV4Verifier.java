package io.graphence.security.event;

import io.graphence.core.config.ApiAuthConfig;
import io.graphence.core.error.AuthenticationException;
import io.graphence.core.utils.ApiSecretCipher;
import io.netty.handler.codec.http.QueryStringDecoder;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import reactor.netty.http.server.HttpServerRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static io.graphence.core.error.AuthenticationErrorType.AUTHENTICATION_FAILED;

@ApplicationScoped
public class SigV4Verifier {

  public static final String ALGORITHM = "AWS4-HMAC-SHA256";
  public static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
  private static final String TERMINATOR = "aws4_request";
  private static final String HMAC_SHA256 = "HmacSHA256";
  private static final DateTimeFormatter AMZ_DATE_FORMATTER =
      DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(ZoneOffset.UTC);

  private final ApiAuthConfig config;
  private final ApiSecretCipher apiSecretCipher;

  @Inject
  public SigV4Verifier(ApiAuthConfig config, ApiSecretCipher apiSecretCipher) {
    this.config = config;
    this.apiSecretCipher = apiSecretCipher;
  }

  public SigV4Authentication verify(HttpServerRequest request, String encryptedSecret) {
    String authorization = request.requestHeaders().get("Authorization");
    Map<String, String> authorizationParts = parseAuthorization(authorization);
    String credential = required(authorizationParts, "Credential");
    String signedHeadersValue = required(authorizationParts, "SignedHeaders");
    String signature = required(authorizationParts, "Signature");

    String[] credentialParts = credential.split("/");
    if (credentialParts.length != 5
        || !config.getRegion().equals(credentialParts[2])
        || !config.getService().equals(credentialParts[3])
        || !TERMINATOR.equals(credentialParts[4])) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }

    String accessKey = credentialParts[0];
    String date = credentialParts[1];
    String amzDate = requiredHeader(request, "x-amz-date");
    validateTimestamp(amzDate);

    String nonce = requiredHeader(request, "x-ge-nonce");
    String contentSha256 = request.requestHeaders().get("x-amz-content-sha256");
    if (contentSha256 != null && !UNSIGNED_PAYLOAD.equals(contentSha256)) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }

    List<String> signedHeaders =
        Arrays.stream(signedHeadersValue.split(";"))
            .map(header -> header.toLowerCase(Locale.ROOT).trim())
            .filter(header -> !header.isEmpty())
            .sorted()
            .collect(Collectors.toList());
    if (!signedHeaders.contains("host")
        || !signedHeaders.contains("x-amz-date")
        || !signedHeaders.contains("x-ge-nonce")) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }

    String canonicalRequest = canonicalRequest(request, signedHeaders);
    String credentialScope =
        String.join("/", date, config.getRegion(), config.getService(), TERMINATOR);
    String stringToSign =
        String.join(
            "\n",
            ALGORITHM,
            amzDate,
            credentialScope,
            hex(sha256(canonicalRequest.getBytes(StandardCharsets.UTF_8))));
    String expected =
        hex(hmac(signingKey(apiSecretCipher.decrypt(encryptedSecret), date), stringToSign));
    if (!MessageDigest.isEqual(
        expected.getBytes(StandardCharsets.UTF_8), signature.getBytes(StandardCharsets.UTF_8))) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    return new SigV4Authentication(accessKey, nonce);
  }

  private Map<String, String> parseAuthorization(String authorization) {
    if (authorization == null || !authorization.startsWith(ALGORITHM + " ")) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    return Arrays.stream(authorization.substring(ALGORITHM.length() + 1).split(","))
        .map(String::trim)
        .map(part -> part.split("=", 2))
        .filter(parts -> parts.length == 2)
        .collect(Collectors.toMap(parts -> parts[0], parts -> parts[1], (x, y) -> y, LinkedHashMap::new));
  }

  private String canonicalRequest(HttpServerRequest request, List<String> signedHeaders) {
    QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
    String canonicalHeaders =
        signedHeaders.stream()
            .map(header -> header + ":" + canonicalHeaderValue(request, header) + "\n")
            .collect(Collectors.joining());
    return String.join(
        "\n",
        request.method().name(),
        canonicalUri(decoder.path()),
        canonicalQuery(decoder),
        canonicalHeaders,
        String.join(";", signedHeaders),
        UNSIGNED_PAYLOAD);
  }

  private String canonicalUri(String path) {
    if (path == null || path.isBlank()) {
      return "/";
    }
    return Arrays.stream(path.split("/", -1)).map(this::encode).collect(Collectors.joining("/"));
  }

  private String canonicalQuery(QueryStringDecoder decoder) {
    return decoder.parameters().entrySet().stream()
        .flatMap(entry -> entry.getValue().stream().map(value -> Map.entry(entry.getKey(), value)))
        .sorted(
            Comparator.comparing((Map.Entry<String, String> entry) -> encode(entry.getKey()))
                .thenComparing(entry -> encode(entry.getValue())))
        .map(entry -> encode(entry.getKey()) + "=" + encode(entry.getValue()))
        .collect(Collectors.joining("&"));
  }

  private String canonicalHeaderValue(HttpServerRequest request, String header) {
    List<String> values = request.requestHeaders().getAll(header);
    if (values == null || values.isEmpty() || values.stream().allMatch(Objects::isNull)) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
    return values.stream()
        .filter(Objects::nonNull)
        .map(value -> value.trim().replaceAll("\\s+", " "))
        .collect(Collectors.joining(","));
  }

  private String requiredHeader(HttpServerRequest request, String header) {
    return Optional.ofNullable(request.requestHeaders().get(header))
        .filter(value -> !value.isBlank())
        .orElseThrow(() -> new AuthenticationException(AUTHENTICATION_FAILED));
  }

  private String required(Map<String, String> map, String key) {
    return Optional.ofNullable(map.get(key))
        .filter(value -> !value.isBlank())
        .orElseThrow(() -> new AuthenticationException(AUTHENTICATION_FAILED));
  }

  private void validateTimestamp(String amzDate) {
    try {
      Instant requestTime = AMZ_DATE_FORMATTER.parse(amzDate, Instant::from);
      long skew = Math.abs(Duration.between(requestTime, Instant.now()).getSeconds());
      if (skew > config.getTimestampSkewSeconds()) {
        throw new AuthenticationException(AUTHENTICATION_FAILED);
      }
    } catch (DateTimeParseException e) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
  }

  private byte[] signingKey(String secret, String date) {
    byte[] dateKey = hmac(("AWS4" + secret).getBytes(StandardCharsets.UTF_8), date);
    byte[] regionKey = hmac(dateKey, config.getRegion());
    byte[] serviceKey = hmac(regionKey, config.getService());
    return hmac(serviceKey, TERMINATOR);
  }

  private byte[] hmac(byte[] key, String data) {
    try {
      Mac mac = Mac.getInstance(HMAC_SHA256);
      mac.init(new SecretKeySpec(key, HMAC_SHA256));
      return mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
    } catch (Exception e) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
  }

  private byte[] sha256(byte[] data) {
    try {
      return MessageDigest.getInstance("SHA-256").digest(data);
    } catch (Exception e) {
      throw new AuthenticationException(AUTHENTICATION_FAILED);
    }
  }

  private String encode(String value) {
    return URLEncoder.encode(Optional.ofNullable(value).orElse(""), StandardCharsets.UTF_8)
        .replace("+", "%20")
        .replace("%7E", "~");
  }

  private String hex(byte[] bytes) {
    StringBuilder stringBuilder = new StringBuilder(bytes.length * 2);
    for (byte b : bytes) {
      stringBuilder.append(String.format("%02x", b));
    }
    return stringBuilder.toString();
  }
}
