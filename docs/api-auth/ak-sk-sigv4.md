# AK/SK SigV4 Client Signing

Graphence external API calls can use AK/SK authentication with an AWS SigV4-style
`Authorization` header.

## Required Headers

- `Authorization`: `AWS4-HMAC-SHA256 Credential=... SignedHeaders=... Signature=...`
- `Host`: request host, including port when present.
- `x-amz-date`: UTC timestamp formatted as `yyyyMMdd'T'HHmmss'Z'`.
- `x-ge-nonce`: unique random value per API key within the replay window.

`x-ge-nonce` must be included in `SignedHeaders`.

## Payload Rule

The first version always signs `UNSIGNED-PAYLOAD`.

If the client sends `x-amz-content-sha256`, its value must be exactly
`UNSIGNED-PAYLOAD`. JSON POST bodies, SSE requests, and multipart uploads all use
the same metadata-only signing rule; the request body is not included in the
signature yet.

## Credential Scope

Use the configured region and service:

```text
{yyyyMMdd}/{region}/{service}/aws4_request
```

The default values are:

```text
region=default
service=graphence
```

## Java Example

```java
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class GraphenceSigner {
  private static final String ALGORITHM = "AWS4-HMAC-SHA256";
  private static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
  private static final DateTimeFormatter AMZ_DATE =
      DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(ZoneOffset.UTC);

  public static HttpRequest.Builder sign(
      String method,
      URI uri,
      String accessKey,
      String secretKey,
      String region,
      String service,
      String nonce) {
    String amzDate = AMZ_DATE.format(Instant.now());
    String date = amzDate.substring(0, 8);
    String host = uri.getHost() + (uri.getPort() > 0 ? ":" + uri.getPort() : "");
    Map<String, String> headers = new TreeMap<>();
    headers.put("host", host);
    headers.put("x-amz-date", amzDate);
    headers.put("x-ge-nonce", nonce);
    headers.put("x-amz-content-sha256", UNSIGNED_PAYLOAD);

    String signedHeaders = String.join(";", headers.keySet());
    String canonicalHeaders =
        headers.entrySet().stream()
            .map(e -> e.getKey() + ":" + e.getValue().trim().replaceAll("\\s+", " ") + "\n")
            .collect(Collectors.joining());
    String canonicalRequest =
        String.join(
            "\n",
            method,
            canonicalUri(uri.getRawPath()),
            canonicalQuery(uri.getRawQuery()),
            canonicalHeaders,
            signedHeaders,
            UNSIGNED_PAYLOAD);
    String scope = String.join("/", date, region, service, "aws4_request");
    String stringToSign =
        String.join("\n", ALGORITHM, amzDate, scope, hex(sha256(canonicalRequest.getBytes(StandardCharsets.UTF_8))));
    String signature = hex(hmac(signingKey(secretKey, date, region, service), stringToSign));
    String authorization =
        ALGORITHM
            + " Credential="
            + accessKey
            + "/"
            + scope
            + ", SignedHeaders="
            + signedHeaders
            + ", Signature="
            + signature;

    return HttpRequest.newBuilder(uri)
        .header("x-amz-date", amzDate)
        .header("x-ge-nonce", nonce)
        .header("x-amz-content-sha256", UNSIGNED_PAYLOAD)
        .header("Authorization", authorization);
  }

  private static byte[] signingKey(String secret, String date, String region, String service) {
    byte[] dateKey = hmac(("AWS4" + secret).getBytes(StandardCharsets.UTF_8), date);
    byte[] regionKey = hmac(dateKey, region);
    byte[] serviceKey = hmac(regionKey, service);
    return hmac(serviceKey, "aws4_request");
  }

  private static String canonicalUri(String path) {
    if (path == null || path.isBlank()) return "/";
    return Arrays.stream(path.split("/", -1)).map(GraphenceSigner::encode).collect(Collectors.joining("/"));
  }

  private static String canonicalQuery(String query) {
    if (query == null || query.isBlank()) return "";
    return Arrays.stream(query.split("&"))
        .map(part -> part.split("=", 2))
        .map(parts -> Map.entry(decode(parts[0]), parts.length > 1 ? decode(parts[1]) : ""))
        .sorted(Comparator.comparing((Map.Entry<String, String> e) -> encode(e.getKey()))
            .thenComparing(e -> encode(e.getValue())))
        .map(e -> encode(e.getKey()) + "=" + encode(e.getValue()))
        .collect(Collectors.joining("&"));
  }

  private static byte[] hmac(byte[] key, String data) {
    try {
      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(new SecretKeySpec(key, "HmacSHA256"));
      return mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private static byte[] sha256(byte[] data) {
    try {
      return MessageDigest.getInstance("SHA-256").digest(data);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private static String encode(String value) {
    return URLEncoder.encode(Optional.ofNullable(value).orElse(""), StandardCharsets.UTF_8)
        .replace("+", "%20")
        .replace("%7E", "~");
  }

  private static String decode(String value) {
    return java.net.URLDecoder.decode(value, StandardCharsets.UTF_8);
  }

  private static String hex(byte[] bytes) {
    StringBuilder builder = new StringBuilder(bytes.length * 2);
    for (byte b : bytes) builder.append(String.format("%02x", b));
    return builder.toString();
  }
}
```

Usage:

```java
URI uri = URI.create("https://api.example.com/graphql?operationName=CurrentUser");
HttpRequest request =
    GraphenceSigner.sign("GET", uri, accessKey, secretKey, "default", "graphence", UUID.randomUUID().toString())
        .GET()
        .build();
```

## JavaScript Example

```js
import crypto from "node:crypto";

const ALGORITHM = "AWS4-HMAC-SHA256";
const UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";

function hmac(key, data) {
  return crypto.createHmac("sha256", key).update(data, "utf8").digest();
}

function sha256Hex(data) {
  return crypto.createHash("sha256").update(data, "utf8").digest("hex");
}

function hex(bytes) {
  return Buffer.from(bytes).toString("hex");
}

function encode(value = "") {
  return encodeURIComponent(value).replace(/[!'()*]/g, c => `%${c.charCodeAt(0).toString(16).toUpperCase()}`);
}

function amzDate(now = new Date()) {
  return now.toISOString().replace(/[:-]|\.\d{3}/g, "");
}

function canonicalQuery(url) {
  return [...url.searchParams.entries()]
    .sort(([ak, av], [bk, bv]) => encode(ak).localeCompare(encode(bk)) || encode(av).localeCompare(encode(bv)))
    .map(([key, value]) => `${encode(key)}=${encode(value)}`)
    .join("&");
}

function signingKey(secretKey, date, region, service) {
  const dateKey = hmac(Buffer.from(`AWS4${secretKey}`, "utf8"), date);
  const regionKey = hmac(dateKey, region);
  const serviceKey = hmac(regionKey, service);
  return hmac(serviceKey, "aws4_request");
}

export function signGraphenceRequest({
  method,
  url,
  accessKey,
  secretKey,
  region = "default",
  service = "graphence",
  nonce = crypto.randomUUID(),
}) {
  const parsed = new URL(url);
  const timestamp = amzDate();
  const date = timestamp.slice(0, 8);
  const headers = {
    host: parsed.host,
    "x-amz-date": timestamp,
    "x-ge-nonce": nonce,
    "x-amz-content-sha256": UNSIGNED_PAYLOAD,
  };
  const signedHeaders = Object.keys(headers).sort().join(";");
  const canonicalHeaders = Object.keys(headers)
    .sort()
    .map(key => `${key}:${headers[key].trim().replace(/\s+/g, " ")}\n`)
    .join("");
  const canonicalUri = parsed.pathname.split("/").map(encode).join("/") || "/";
  const canonicalRequest = [
    method.toUpperCase(),
    canonicalUri,
    canonicalQuery(parsed),
    canonicalHeaders,
    signedHeaders,
    UNSIGNED_PAYLOAD,
  ].join("\n");
  const scope = `${date}/${region}/${service}/aws4_request`;
  const stringToSign = [ALGORITHM, timestamp, scope, sha256Hex(canonicalRequest)].join("\n");
  const signature = hex(hmac(signingKey(secretKey, date, region, service), stringToSign));
  headers.authorization =
    `${ALGORITHM} Credential=${accessKey}/${scope}, SignedHeaders=${signedHeaders}, Signature=${signature}`;
  return headers;
}
```

Usage:

```js
const headers = signGraphenceRequest({
  method: "POST",
  url: "https://api.example.com/graphql",
  accessKey: process.env.GRAPHENCE_ACCESS_KEY,
  secretKey: process.env.GRAPHENCE_SECRET_KEY,
});

await fetch("https://api.example.com/graphql", {
  method: "POST",
  headers: {
    ...headers,
    "content-type": "application/json",
  },
  body: JSON.stringify({ query: "{ current { id name } }" }),
});
```

## curl Example

`curl` does not generate SigV4-compatible custom signatures by itself. Generate the
headers with the JavaScript helper above, then pass them to curl:

```bash
curl 'https://api.example.com/graphql?operationName=CurrentUser' \
  -H 'Authorization: AWS4-HMAC-SHA256 Credential=GEAK.../20260517/default/graphence/aws4_request, SignedHeaders=host;x-amz-content-sha256;x-amz-date;x-ge-nonce, Signature=...' \
  -H 'x-amz-date: 20260517T010203Z' \
  -H 'x-ge-nonce: 018f5c4c-0c1d-7b56-8fc5-ec92ce2d98f1' \
  -H 'x-amz-content-sha256: UNSIGNED-PAYLOAD'
```
