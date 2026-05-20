package io.graphence.core.service;

import io.graphence.core.config.FileSignedUrlConfig;
import io.graphence.core.dto.Current;
import io.graphence.core.error.AuthenticationException;
import io.graphoenix.http.server.config.HttpServerConfig;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FileSignedUrlServiceTest {

  @Test
  void shouldVerifyCreatedSignedUrl() {
    TestFileSignedUrlService service = service(1_000L);
    Current current = new Current().setId("u1").setRealmId(2);

    URI uri = URI.create(service.create(current, "file-1", 60));

    assertEquals("/download/file-1", uri.getPath());
    Current verified =
        service.verify("GET", uri.getPath(), query(uri)).orElseThrow(AssertionError::new);
    assertEquals("u1", verified.getId());
    assertEquals(2, verified.getRealmId());
  }

  @Test
  void shouldRejectExpiredSignedUrl() {
    TestFileSignedUrlService service = service(1_000L);
    URI uri = URI.create(service.create(new Current().setId("u1"), "file-1", 60));

    service.setNow(1_061L);

    assertThrows(
        AuthenticationException.class, () -> service.verify("GET", uri.getPath(), query(uri)));
  }

  @Test
  void shouldRejectWrongMethod() {
    TestFileSignedUrlService service = service(1_000L);
    URI uri = URI.create(service.create(new Current().setId("u1"), "file-1", 60));

    assertThrows(
        AuthenticationException.class, () -> service.verify("POST", uri.getPath(), query(uri)));
  }

  @Test
  void shouldRejectTamperedPath() {
    TestFileSignedUrlService service = service(1_000L);
    URI uri = URI.create(service.create(new Current().setId("u1"), "file-1", 60));

    assertThrows(
        AuthenticationException.class, () -> service.verify("GET", "/download/file-2", query(uri)));
  }

  @Test
  void shouldRejectTamperedSubject() {
    TestFileSignedUrlService service = service(1_000L);
    URI uri = URI.create(service.create(new Current().setId("u1"), "file-1", 60));
    Map<String, String> query = query(uri);
    query.put(FileSignedUrlService.SUBJECT_PARAM, "u2");

    assertThrows(AuthenticationException.class, () -> service.verify("GET", uri.getPath(), query));
  }

  @Test
  void shouldClampTtlToMax() {
    TestFileSignedUrlService service = service(1_000L);

    URI uri = URI.create(service.create(new Current().setId("u1"), "file-1", 1_000));

    assertEquals("1300", query(uri).get(FileSignedUrlService.EXPIRES_PARAM));
  }

  @Test
  void shouldCreateLocalFileDownloadUrl() {
    TestFileSignedUrlService service = service(1_000L);

    URI uri = URI.create(service.createLocalFileDownloadUrl("file-1"));

    Current verified =
        service.verify("GET", uri.getPath(), query(uri)).orElseThrow(AssertionError::new);
    assertEquals(FileSignedUrlService.LOCAL_FILE_SIGNED_URL_SUBJECT, verified.getId());
    assertEquals("1300", query(uri).get(FileSignedUrlService.EXPIRES_PARAM));
  }

  @Test
  void shouldFallbackToLocalhostBaseUrlWithoutRequestScope() {
    TestFileSignedUrlService service = service(1_000L);
    service.config.setSignedUrlBaseUrl(null);

    URI uri = URI.create(service.createLocalFileDownloadUrl("file-1", 60));

    assertEquals("http", uri.getScheme());
    assertEquals("localhost", uri.getHost());
    assertEquals(8080, uri.getPort());
  }

  @Test
  void shouldCreateAndVerifyUrlWithoutConfiguredSecret() {
    TestFileSignedUrlService service = service(1_000L);
    service.config.setSignedUrlSecret(null);

    URI uri = URI.create(service.createLocalFileDownloadUrl("file-1", 60));

    Current verified =
        service.verify("GET", uri.getPath(), query(uri)).orElseThrow(AssertionError::new);
    assertEquals(FileSignedUrlService.LOCAL_FILE_SIGNED_URL_SUBJECT, verified.getId());
  }

  private TestFileSignedUrlService service(long now) {
    FileSignedUrlConfig config = new FileSignedUrlConfig();
    config.setSignedUrlBaseUrl("https://example.test");
    config.setSignedUrlDefaultTtlSeconds(300);
    config.setSignedUrlMaxTtlSeconds(300);
    return new TestFileSignedUrlService(config, new HttpServerConfig(), now);
  }

  private Map<String, String> query(URI uri) {
    return Arrays.stream(uri.getRawQuery().split("&"))
        .map(part -> part.split("=", 2))
        .collect(
            Collectors.toMap(
                parts -> decode(parts[0]), parts -> parts.length == 2 ? decode(parts[1]) : ""));
  }

  private String decode(String value) {
    return URLDecoder.decode(value, StandardCharsets.UTF_8);
  }

  private static class TestFileSignedUrlService extends FileSignedUrlService {

    private final FileSignedUrlConfig config;
    private long now;

    private TestFileSignedUrlService(
        FileSignedUrlConfig config, HttpServerConfig httpServerConfig, long now) {
      super(config, httpServerConfig, null);
      this.config = config;
      this.now = now;
    }

    private void setNow(long now) {
      this.now = now;
    }

    @Override
    protected long nowEpochSecond() {
      return now;
    }
  }
}
