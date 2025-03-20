package simulation;

import  java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class GoogleSimulation extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://gc.kis.v2.scr.kaspersky-labs.com")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*\\.svg", ".*detectportal\\.firefox\\.com.*"))
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("content-type", "application/json+protobuf"),
    Map.entry("origin", "chrome-untrusted://new-tab-page"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("sec-fetch-storage-access", "active"),
    Map.entry("x-client-data", "CIu2yQEIpbbJAQipncoBCMHhygEIlqHLAQiJo8sBCIWgzQEIuMjNAQjk484BCIXlzgEY4eLOAQ=="),
    Map.entry("x-goog-api-key", "AIzaSyCbsbvGCe7C9mCtdaTycZB2eUFuzsYKG_E"),
    Map.entry("x-goog-authuser", "0"),
    Map.entry("x-user-agent", "grpc-web-javascript/0.1")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("origin", "https://ogs.google.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("origin", "https://www.google.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("content-type", "text/plain;charset=UTF-8"),
    Map.entry("origin", "https://www.google.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_6 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("content-type", "application/json+protobuf"),
    Map.entry("origin", "https://www.google.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-site"),
    Map.entry("x-client-data", "CIu2yQEIpbbJAQipncoBCMHhygEIlqHLAQiJo8sBCIWgzQEIuMjNAQjn0M0BCL3VzgEIgdbOAQjA2M4BCOTjzgEIr+TOAQji5M4BCIXlzgEIjOXOAQjh5c4BGOHizgE="),
    Map.entry("x-goog-api-key", "AIzaSyCbsbvGCe7C9mCtdaTycZB2eUFuzsYKG_E"),
    Map.entry("x-goog-authuser", "0"),
    Map.entry("x-user-agent", "grpc-web-javascript/0.1")
  );
  
  private Map<CharSequence, String> headers_7 = Map.ofEntries(
    Map.entry("X-KL-kfa-Ajax-Request", "Ajax_Request"),
    Map.entry("downlink", "10"),
    Map.entry("rtt", "100"),
    Map.entry("sec-ch-prefers-color-scheme", "light"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-arch", "x86"),
    Map.entry("sec-ch-ua-bitness", "64"),
    Map.entry("sec-ch-ua-form-factors", "Desktop"),
    Map.entry("sec-ch-ua-full-version", "134.0.6998.36"),
    Map.entry("sec-ch-ua-full-version-list", "Chromium\";v=\"134.0.6998.36\", \"Not:A-Brand\";v=\"24.0.0.0\", \"Google Chrome\";v=\"134.0.6998.36"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-model", ""),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "10.0.0"),
    Map.entry("sec-ch-ua-wow64", "?0")
  );
  
  private Map<CharSequence, String> headers_9 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("downlink", "10"),
    Map.entry("priority", "u=1, i"),
    Map.entry("rtt", "100"),
    Map.entry("sec-ch-prefers-color-scheme", "light"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-arch", "x86"),
    Map.entry("sec-ch-ua-bitness", "64"),
    Map.entry("sec-ch-ua-form-factors", "Desktop"),
    Map.entry("sec-ch-ua-full-version", "134.0.6998.36"),
    Map.entry("sec-ch-ua-full-version-list", "Chromium\";v=\"134.0.6998.36\", \"Not:A-Brand\";v=\"24.0.0.0\", \"Google Chrome\";v=\"134.0.6998.36"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-model", ""),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "10.0.0"),
    Map.entry("sec-ch-ua-wow64", "?0"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("x-client-data", "CIu2yQEIpbbJAQipncoBCMHhygEIlqHLAQiJo8sBCIWgzQEIuMjNAQjn0M0BCL3VzgEIgdbOAQjA2M4BCOTjzgEIr+TOAQji5M4BCIXlzgEIjOXOAQjh5c4BGOHizgE="),
    Map.entry("x-kl-kfa-ajax-request", "Ajax_Request")
  );
  
  private Map<CharSequence, String> headers_13 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("downlink", "10"),
    Map.entry("priority", "u=1, i"),
    Map.entry("rtt", "100"),
    Map.entry("sec-ch-prefers-color-scheme", "light"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-arch", "x86"),
    Map.entry("sec-ch-ua-bitness", "64"),
    Map.entry("sec-ch-ua-form-factors", "Desktop"),
    Map.entry("sec-ch-ua-full-version", "134.0.6998.36"),
    Map.entry("sec-ch-ua-full-version-list", "Chromium\";v=\"134.0.6998.36\", \"Not:A-Brand\";v=\"24.0.0.0\", \"Google Chrome\";v=\"134.0.6998.36"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-model", ""),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-ch-ua-platform-version", "10.0.0"),
    Map.entry("sec-ch-ua-wow64", "?0"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("x-client-data", "CIu2yQEIpbbJAQipncoBCMHhygEIlqHLAQiJo8sBCIWgzQEIuMjNAQjn0M0BCL3VzgEIgdbOAQjA2M4BCOTjzgEIr+TOAQji5M4BCIXlzgEIjOXOAQjh5c4BGOHizgE="),
    Map.entry("x-dos-behavior", "Embed"),
    Map.entry("x-kl-kfa-ajax-request", "Ajax_Request")
  );
  
  private Map<CharSequence, String> headers_16 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("origin", "https://www.youtube.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_17 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("content-type", "text/plain;charset=UTF-8"),
    Map.entry("origin", "https://www.youtube.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site")
  );
  
  private Map<CharSequence, String> headers_18 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("content-type", "application/json+protobuf"),
    Map.entry("origin", "https://www.youtube.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("x-client-data", "CIu2yQEIpbbJAQipncoBCMHhygEIlqHLAQiJo8sBCIWgzQEIuMjNAQjn0M0BCL3VzgEIgdbOAQjA2M4BCOTjzgEIr+TOAQji5M4BCIXlzgEIjOXOAQjh5c4BGOHizgE="),
    Map.entry("x-goog-api-key", "AIzaSyDyT5W0Jh49F30Pqqtyfdf7pDLFKLJoAnw"),
    Map.entry("x-user-agent", "grpc-web-javascript/0.1")
  );
  
  private Map<CharSequence, String> headers_23 = Map.ofEntries(
    Map.entry("accept", "*/*"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7"),
    Map.entry("content-type", "application/json"),
    Map.entry("origin", "https://www.youtube.com"),
    Map.entry("priority", "u=1, i"),
    Map.entry("sec-ch-ua", "Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "Windows"),
    Map.entry("sec-fetch-dest", "empty"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "same-origin"),
    Map.entry("sec-fetch-storage-access", "active"),
    Map.entry("x-client-data", "CIu2yQEIpbbJAQipncoBCMHhygEIlqHLAQiJo8sBCIWgzQEIuMjNAQjn0M0BCL3VzgEIgdbOAQjA2M4BCOTjzgEIr+TOAQji5M4BCIXlzgEIjOXOAQjh5c4BGOHizgE="),
    Map.entry("x-goog-authuser", "0"),
    Map.entry("x-goog-event-time", "1741784828937"),
    Map.entry("x-goog-request-time", "1741785041844"),
    Map.entry("x-goog-visitor-id", "CgtScnNHanFRRGwxZyjRj8a-BjIKCgJSVRIEGgAgPQ%3D%3D"),
    Map.entry("x-kl-kfa-ajax-request", "Ajax_Request"),
    Map.entry("x-origin", "https://www.youtube.com"),
    Map.entry("x-youtube-ad-signals", "dt=1741785040438&flash=0&frm=2&u_tz=180&u_his=2&u_h=1024&u_w=1280&u_ah=984&u_aw=1280&u_cd=24&bc=31&bih=-12245933&biw=-12245933&brdim=0%2C0%2C0%2C0%2C1280%2C0%2C1280%2C984%2C0%2C0&vis=1&wgl=true&ca_type=image"),
    Map.entry("x-youtube-client-name", "56"),
    Map.entry("x-youtube-client-version", "1.20250309.00.00"),
    Map.entry("x-youtube-device", "cbr=Chrome&cbrver=134.0.0.0&ceng=WebKit&cengver=537.36&cos=Windows&cosver=10.0&cplatform=DESKTOP"),
    Map.entry("x-youtube-page-cl", "735211760"),
    Map.entry("x-youtube-page-label", "youtube.player.web_20250309_00_RC00"),
    Map.entry("x-youtube-time-zone", "Europe/Moscow"),
    Map.entry("x-youtube-utc-offset", "180")
  );
  
  private String uri1 = "https://www.youtube.com/youtubei/v1/log_event";
  
  private String uri3 = "https://www.google.com";
  
  private String uri4 = "https://ogads-pa.clients6.google.com/$rpc/google.internal.onegoogle.asyncdata.v1.AsyncDataService/GetAsyncData";
  
  private String uri5 = "https://jnn-pa.googleapis.com/$rpc/google.internal.waa.v1.Waa";

  private ScenarioBuilder scn = scenario("GoogleSimulation")
    .exec(
      http("request_0")
        .post(uri4)
        .headers(headers_0)
        .body(RawFileBody("googlesimulation/0000_request.dat")),
      pause(4),
      http("request_1")
        .get("/7D8B79A2-8974-4D7B-A76A-F4F29624C06BinrVNBXFcf6pUMrxJ9JttH6X8nXmmdeBcXACER4t_AxEs16JIAkE13OHuFjxfdXZKkpGIS8SbiYTNJbnJ1IiiA/init?data=eyJ1cmwiOiJodHRwczovL29ncy5nb29nbGUuY29tL3UvMC93aWRnZXQvYXBwP2VvbT0xJmF3d2Q9MSZlYXdzPTEmb3JpZ2luPWNocm9tZS11bnRydXN0ZWQlM0ElMkYlMkZuZXctdGFiLXBhZ2Umb3JpZ2luPWNocm9tZSUzQSUyRiUyRm5ldy10YWItcGFnZSZjbj1hcHAmcGlkPTEmc3BpZD0yNDMmaGw9cnUiLCJwbHVnaW5zIjoid3NtJndudCZ2cyZ3dCZ4aHJfY29udGVudCIsImRhdGEiOnsiZGF0YSI6W3sicGx1Z2luIjoid3NtIiwicGFyYW1ldGVycyI6IntcInJlZmVycmVyXCI6XCJcIixcInN0dWJJZFwiOlwiXCJ9In0seyJwbHVnaW4iOiJ3bnQiLCJwYXJhbWV0ZXJzIjoie1wicmVmZXJyZXJcIjpcIlwifSJ9LHsicGx1Z2luIjoieGhyX2NvbnRlbnQiLCJwYXJhbWV0ZXJzIjoie1wicmVmZXJyZXJcIjpcIlwifSJ9XX0sImlzVG9wTGV2ZWwiOmZhbHNlLCJwYWdlU3RhcnRUaW1lIjowLCJuYXZpZ2F0aW9uU3RhcnRUaW1lIjoxNzQxNzg1MDMzMjI4fQ%3D%3D&nocache=1b9a7&tm=2025-03-12T13%3A10%3A33.496Z")
        .headers(headers_1),
      pause(3),
      http("request_2")
        .get("/7D8B79A2-8974-4D7B-A76A-F4F29624C06BNK-D4Txf44jZCzIl6ZWSoFgsXEjQSPjtgx_IIukjFTBTZTijok5suw54EG76_MPq9i2X0Qm7DjKqUddJZAUO9A/init?data=eyJ1cmwiOiJodHRwczovL3d3dy5nb29nbGUuY29tL3NlYXJjaD9xPWRkZCZvcT0mZ3NfbGNycD1FZ1pqYUhKdmJXVXFDUWdBRUNNWUp4anFBaklKQ0FBUUl4Z25HT29DTWdrSUFSQWpHQ2NZNmdJeUNRZ0NFQ01ZSnhqcUFqSUpDQU1RSXhnbkdPb0NNZ2tJQkJBakdDY1k2Z0l5Q1FnRkVDTVlKeGpxQWpJSkNBWVFJeGduR09vQ01na0lCeEFqR0NjWTZnTFNBUWt4TmpNM2FqQnFNVFdvQWdpd0FnSHhCZGF3OFpvWm1ROTYmc291cmNlaWQ9Y2hyb21lJmllPVVURi04IiwicGx1Z2lucyI6IndzbSZ3bnQmdnMmd3QmeGhyX2NvbnRlbnQiLCJkYXRhIjp7ImRhdGEiOlt7InBsdWdpbiI6IndzbSIsInBhcmFtZXRlcnMiOiJ7XCJyZWZlcnJlclwiOlwiXCIsXCJzdHViSWRcIjpcIlwifSJ9LHsicGx1Z2luIjoid250IiwicGFyYW1ldGVycyI6IntcInJlZmVycmVyXCI6XCJcIn0ifSx7InBsdWdpbiI6Inhocl9jb250ZW50IiwicGFyYW1ldGVycyI6IntcInJlZmVycmVyXCI6XCJcIn0ifV19LCJpc1RvcExldmVsIjp0cnVlLCJwYWdlU3RhcnRUaW1lIjowLCJuYXZpZ2F0aW9uU3RhcnRUaW1lIjoxNzQxNzg1MDM2NTI0fQ%3D%3D&nocache=161bc&tm=2025-03-12T13%3A10%3A36.993Z")
        .headers(headers_2)
        .resources(
          http("request_3")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/to/wsm.sessionActivated?tm=2025-03-12T13%3A10%3A37.378Z")
            .headers(headers_3)
            .body(RawFileBody("googlesimulation/0003_request.txt")),
          http("request_4")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/to/xhr.ajaxRequestNotify?tm=2025-03-12T13%3A10%3A37.473Z")
            .headers(headers_3)
            .body(RawFileBody("googlesimulation/0004_request.txt")),
          http("request_5")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/to/wt.info?tm=2025-03-12T13%3A10%3A37.503Z")
            .headers(headers_3)
            .body(RawFileBody("googlesimulation/0005_request.txt")),
          http("request_6")
            .post(uri4)
            .headers(headers_6)
            .body(RawFileBody("googlesimulation/0006_request.dat")),
          http("request_7")
            .get(uri3 + "/xjs/_/js/md=2/k=xjs.s.ru.2gufTxx0io8.2018.O/am=AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIAAAAAAAAAAAAAIIACEAAEAAAAAAAAAAkACgAAAAAAAAAJAAAAAACAAAQAAUECAAAAAQAAAAAAJgAABEIWgIACAAAAAAAAAAAAAQAAAAhEBNjvPxwAAAAAAAAAAAAAAAAQgAQAAAAAAACACwAAAvAHIGQXEAAAAAAAAAAAAQAAAAAAAAEAAAAAAAEAAAAKAAAAAAAAAAAIAAAAAAAAQAAAAAAEAAAEAAAAAAAAAAAAAAAACAAAAAAAADQAoAAAAvgBAAAAAAA4AAAAgAAAAABwGDAAAgAAAAAAAJAHgMcDcEhBAQAAAAAAAAAAAAAAAAQgQTAH0i8IIAAAAAAAAAAAAAAAAAAAAKQImrjWAIA/rs=ACT90oFSNIy1f6ZqUIoKBQM4ZxHMv4PyuA")
            .headers(headers_7),
          http("request_8")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/to/wsm.onHashChange?tm=2025-03-12T13%3A10%3A38.031Z")
            .headers(headers_3)
            .body(RawFileBody("googlesimulation/0008_request.txt")),
          http("request_9")
            .get(uri3 + "/complete/search?q&cp=0&client=gws-wiz-serp&xssi=t&gs_pcrt=2&hl=ru&authuser=0&pq=ddd&psi=zofRZ_HuHo6owPAPi4aEgQI.1741785037927&dpr=1")
            .headers(headers_9),
          http("request_10")
            .get(uri3 + "/complete/search?q=ddd&cp=0&client=desktop-gws-wiz-on-focus-serp&xssi=t&gs_pcrt=3&hl=ru&authuser=0&pq=ddd&psi=zofRZ_HuHo6owPAPi4aEgQI.1741785037927&dpr=1&ofp=EAEyggEKHAoaZGRkINCw0YDRhdC40YLQtdC60YLRg9GA0LAKDgoMZGRkINC40LPRgNCwCggKBmRkZCBjIwoMCgpkZGQgZ29sYW5nCg0KC2RkZCBleGFtcGxlChAKDmRkZCDQutC90LjQs9CwCgkKB2RkZCBwaHAKDAoKZGRkINGN0YLQvhBHMlsKGAoW0KfRgtC-INGC0LDQutC-0LUgREREPwobChnQp9GC0L4g0YLQsNC60L7QtSDQlNCU0JQ_Ch8KHdCn0YLQviDRgtCw0LrQvtC1IFRERCDQuCBEREQ_EOQC")
            .headers(headers_9),
          http("request_11")
            .get(uri3 + "/xjs/_/ss/k=xjs.s.jNc8YxXRD6s.L.B1.O/am=AMIhQAgAAAAEAACAEAAqAAEAAAAAAAAAAAAAAAAAAAAAAABAAgAAAAIAAAACAAAAAgAAAIgAAAABQAIAAAAgOCEACjsAAAAAfACBOFUAAQAAAAAAAUACAAAAAAABAAEAJIAAAEAUAAAAAAIQQgAAEAAwAQAABQBAIAAAQBgYAIAGAAAAAAFAJwAQBAAgAMAAAOAACAASAAAAIAQWgAAAAEgAAAAAAAAAAQAAAAEAACQAD8EwAIIKAAM4AgAAAAARABBAAACAAIAQAAAEACgAAAQIAIAeABCADwAgCUQAgFAABiAAoBAAEAAAAgACAAAACQQAAAAgCQhwGDAAAgAAAAAAAIAEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgAAAAAAAAAAAAAAAAAAAAAAIA/d=0/br=1/rs=ACT90oG64wg7z9KuDjNp0qo_bVpgy69Dkw/m=sy1kh,syr9,syr8,syra,sy1kw,sy1kv,sy1ku,syl5,syl4,sykg,sy1kt,sy1kr,sy1kq,sy1kp,sy1kn,sy1km,sy1kl,sy1kk,sy1kj,sy1ki,L1AAkb,y05UD,PPhKqf,sy7ym,sy1xl,sy1wh,sy1vw,sy1eh,sy1w3,sy1w4,sy1bz,syr4,sy2m7,sy1vv,sy21o,sy21r,sy1hv,epYOx?xjs=s4")
            .headers(headers_7),
          http("request_12")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/to/xhr.ajaxRequestNotify?tm=2025-03-12T13%3A10%3A38.514Z")
            .headers(headers_3)
            .body(RawFileBody("googlesimulation/0012_request.txt")),
          http("request_13")
            .get(uri3 + "/async/bgasy?ei=zofRZ_HuHo6owPAPi4aEgQI&opi=89978449&yv=3&cs=0&async=_fmt:jspb")
            .headers(headers_13),
          http("request_14")
            .get(uri3 + "/async/vpkg?vet=10ahUKEwjxjfvzzoSMAxUOFBAIHQsDISAQj5gNCCs..i&ei=zofRZ_HuHo6owPAPi4aEgQI&opi=89978449&yv=3&cs=0&async=_basejs:%2Fxjs%2F_%2Fjs%2Fk%3Dxjs.s.ru.2gufTxx0io8.2018.O%2Fam%3DAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIAAAAAAAAAAAAAIIACEAAEAAAAAAAAAAgACgAAAAAAAAAJAAAAAACAAAQAAUECAAAAAQAAAAAAJgAABAIWgIACAAAAAAAAAAAAAQAAAAhEBNjvPxwAAAAAAAAAAAAAAAAQgAQAAAAAAACACwAAAvAHIGQXEAAAAAAAAAAAAQAAAAAAAAEAAAAAAAEAAAAKAAAAAAAAAAAIAAAAAAAAQAAAAAAEAAAEAAAAAAAAAAAAAAAACAAAAAAAADQAoAAAAvgBAAAAAAA4AAAAgAAAAABwGDAAAgAAAAAAAJAHgMcDcEhBAQAAAAAAAAAAAAAAAAQgQTAH0i8IIAAAAAAAAAAAAAAAAAAAAKQImrjWAIA%2Fdg%3D0%2Fbr%3D1%2Frs%3DACT90oFpiJGQkcF5DUKVRXSE5UQuhbfiaw,_basecss:%2Fxjs%2F_%2Fss%2Fk%3Dxjs.s.jNc8YxXRD6s.L.B1.O%2Fam%3DAMIhQAgAAAAEAACAEAAqAAEAAAAAAAAAAAAAAAAAAAAAAABAAgAAAAIAAAACAAAAAgAAAIgAAAABQAIAAAAgOCEACjsAAAAAfACBOFUAAQAAAAAAAUACAAAAAAABAAEAJIAAAEAUAAAAAAIQQgAAEAAwAQAABQBAIAAAQBgYAIAGAAAAAAFAJwAQBAAgAMAAAOAACAASAAAAIAQWgAAAAEgAAAAAAAAAAQAAAAEAACQAD8EwAIIKAAM4AgAAAAARABBAAACAAIAQAAAEACgAAAQIAIAeABCADwAgCUQAgFAABiAAoBAAEAAAAgACAAAACQQAAAAgCQhwGDAAAgAAAAAAAIAEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgAAAAAAAAAAAAAAAAAAAAAAIA%2Fbr%3D1%2Frs%3DACT90oG64wg7z9KuDjNp0qo_bVpgy69Dkw,_basecomb:%2Fxjs%2F_%2Fjs%2Fk%3Dxjs.s.ru.2gufTxx0io8.2018.O%2Fck%3Dxjs.s.jNc8YxXRD6s.L.B1.O%2Fam%3DAMIhQAgAAAAEAACAEAAqAAEAAAAAAAAAAAAAAAAAAAAAAABAAgAAAAIAAAACAAAAAgAAIIgCEAAFQAIAAAAgOCkACjsAAAAAfACJOFUAAQCAAAQAAUECAAAAAQABAAEAJoAABEIWgIACAAIQQgAAEAAwAQAABQhEJNjvfxwYAIAGAAAAAAFAJwAQhAQgAMAAAOCACwASAvAHIGQXkAAAAEgAAAAAAQAAAQAAAAEAACQAD8EwAIIKAAM4AgAAAAAZABBAAACAQIAQAAAEACgEAAQIAIAeABCADwAgCUQAgFAABjQAoBAAEvgBAgACAAA4CQQAgAAgCQhwGDAAAgAAAAAAAJAHgMcDcEhBAQAAAAAAAAAAAAAAAAQgQTAH0i8IIAAAAAAAAAAAAAAAAAAAAKQImrjWAIA%2Fd%3D1%2Fed%3D1%2Fdg%3D0%2Fbr%3D1%2Fujg%3D1%2Frs%3DACT90oHGB-SHCAj2jQC5Ov4ubxPo4ybymQ,_fmt:prog,_id:QPwIld")
            .headers(headers_13),
          http("request_15")
            .get("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/from?get&nocache=1b299&tm=2025-03-12T13%3A10%3A39.395Z")
            .headers(headers_2),
          http("request_16")
            .get("/7D8B79A2-8974-4D7B-A76A-F4F29624C06BZnWgRL7bKZhLZIYpbZMxtFBBMGNEw7j3ri8ovR1Nn82iA4ETPsp-7lEk3dL8FgC_2Px5nNT4rBz9ZO4QvTDXkg/init?data=eyJ1cmwiOiJodHRwczovL3d3dy55b3V0dWJlLmNvbS9lbWJlZC8%2FZW5hYmxlanNhcGk9MSZyZWw9MCZhdXRvcGxheT0wJnBsYXlzaW5saW5lPTEmZXhwZmxhZz1lbWJlZHNfZW5hYmxlX211dGVkX2F1dG9wbGF5JTNBdHJ1ZSZmcz0xIiwicGx1Z2lucyI6IndzbSZ3bnQmdnMmeGhyX2NvbnRlbnQiLCJkYXRhIjp7ImRhdGEiOlt7InBsdWdpbiI6IndzbSIsInBhcmFtZXRlcnMiOiJ7XCJyZWZlcnJlclwiOlwiaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS9zZWFyY2g%2FcT1kZGQmb3E9JmdzX2xjcnA9RWdaamFISnZiV1VxQ1FnQUVDTVlKeGpxQWpJSkNBQVFJeGduR09vQ01na0lBUkFqR0NjWTZnSXlDUWdDRUNNWUp4anFBaklKQ0FNUUl4Z25HT29DTWdrSUJCQWpHQ2NZNmdJeUNRZ0ZFQ01ZSnhqcUFqSUpDQVlRSXhnbkdPb0NNZ2tJQnhBakdDY1k2Z0xTQVFreE5qTTNhakJxTVRXb0FnaXdBZ0h4QmRhdzhab1ptUTk2JnNvdXJjZWlkPWNocm9tZSZpZT1VVEYtOFwiLFwic3R1YklkXCI6XCJcIn0ifSx7InBsdWdpbiI6IndudCIsInBhcmFtZXRlcnMiOiJ7XCJyZWZlcnJlclwiOlwiaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS9zZWFyY2g%2FcT1kZGQmb3E9JmdzX2xjcnA9RWdaamFISnZiV1VxQ1FnQUVDTVlKeGpxQWpJSkNBQVFJeGduR09vQ01na0lBUkFqR0NjWTZnSXlDUWdDRUNNWUp4anFBaklKQ0FNUUl4Z25HT29DTWdrSUJCQWpHQ2NZNmdJeUNRZ0ZFQ01ZSnhqcUFqSUpDQVlRSXhnbkdPb0NNZ2tJQnhBakdDY1k2Z0xTQVFreE5qTTNhakJxTVRXb0FnaXdBZ0h4QmRhdzhab1ptUTk2JnNvdXJjZWlkPWNocm9tZSZpZT1VVEYtOFwifSJ9LHsicGx1Z2luIjoieGhyX2NvbnRlbnQiLCJwYXJhbWV0ZXJzIjoie1wicmVmZXJyZXJcIjpcImh0dHBzOi8vd3d3Lmdvb2dsZS5jb20vc2VhcmNoP3E9ZGRkJm9xPSZnc19sY3JwPUVnWmphSEp2YldVcUNRZ0FFQ01ZSnhqcUFqSUpDQUFRSXhnbkdPb0NNZ2tJQVJBakdDY1k2Z0l5Q1FnQ0VDTVlKeGpxQWpJSkNBTVFJeGduR09vQ01na0lCQkFqR0NjWTZnSXlDUWdGRUNNWUp4anFBaklKQ0FZUUl4Z25HT29DTWdrSUJ4QWpHQ2NZNmdMU0FRa3hOak0zYWpCcU1UV29BZ2l3QWdIeEJkYXc4Wm9abVE5NiZzb3VyY2VpZD1jaHJvbWUmaWU9VVRGLThcIn0ifV19LCJpc1RvcExldmVsIjpmYWxzZSwicGFnZVN0YXJ0VGltZSI6MCwibmF2aWdhdGlvblN0YXJ0VGltZSI6MTc0MTc4NTAzOTc2NX0%3D&nocache=1599c&tm=2025-03-12T13%3A10%3A40.343Z")
            .headers(headers_16),
          http("request_17")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/36DD35A9-8A05-49C5-B3D8-8645FC952CC9/to/xhr.ajaxRequestNotify?tm=2025-03-12T13%3A10%3A40.733Z")
            .headers(headers_17)
            .body(RawFileBody("googlesimulation/0017_request.txt")),
          http("request_18")
            .post(uri5 + "/Create")
            .headers(headers_18)
            .body(RawFileBody("googlesimulation/0018_request.dat")),
          http("request_19")
            .get("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/from?get&nocache=18e4f&tm=2025-03-12T13%3A10%3A41.401Z")
            .headers(headers_2),
          http("request_20")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/36DD35A9-8A05-49C5-B3D8-8645FC952CC9/to/xhr.ajaxRequestNotify?tm=2025-03-12T13%3A10%3A41.693Z")
            .headers(headers_17)
            .body(RawFileBody("googlesimulation/0020_request.txt")),
          http("request_21")
            .post(uri5 + "/GenerateIT")
            .headers(headers_18)
            .body(RawFileBody("googlesimulation/0021_request.dat")),
          http("request_22")
            .post("/697D7D53-B60D-4EC4-9EC9-32FF354D8492/6483AEBF-92A9-4892-AF50-330C441B6989/to/wsm.sessionDeactivated?tm=2025-03-12T13%3A10%3A41.997Z")
            .headers(headers_3)
            .body(RawFileBody("googlesimulation/0022_request.txt")),
          http("request_23")
            .post(uri1 + "?alt=json")
            .headers(headers_23)
            .body(RawFileBody("googlesimulation/0023_request.json"))
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
