
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class WWFrete extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://a.clarity.ms")
      .inferHtmlResources(AllowList(), DenyList())
      .acceptHeader("application/x-clarity-gzip")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "*/*");
    headers_0.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Windows");
    headers_0.put("sec-fetch-dest", "empty");
    headers_0.put("sec-fetch-mode", "cors");
    headers_0.put("sec-fetch-site", "same-origin");
    headers_0.put("x-requested-with", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("origin", "https://www.westwing.com.br");
    headers_1.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Windows");
    headers_1.put("sec-fetch-dest", "empty");
    headers_1.put("sec-fetch-mode", "cors");
    headers_1.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_2.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Windows");
    headers_2.put("sec-fetch-dest", "image");
    headers_2.put("sec-fetch-mode", "no-cors");
    headers_2.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("accept", "application/json, text/javascript, */*; q=0.01");
    headers_3.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Windows");
    headers_3.put("sec-fetch-dest", "empty");
    headers_3.put("sec-fetch-mode", "cors");
    headers_3.put("sec-fetch-site", "same-origin");
    headers_3.put("x-requested-with", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("Accept", "*/*");
    headers_9.put("Origin", "https://www.westwing.com.br");
    headers_9.put("Sec-Fetch-Dest", "empty");
    headers_9.put("Sec-Fetch-Mode", "cors");
    headers_9.put("Sec-Fetch-Site", "cross-site");
    headers_9.put("content-type", "text/plain");
    headers_9.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Windows");
    
    String uri2 = "https://bam-cell.nr-data.net";
    
    String uri3 = "https://www.facebook.com/tr";
    
    String uri4 = "https://www.westwing.com.br";

    ScenarioBuilder scn = scenario("WWFrete")
      .exec(
        http("request_0")
          .get(uri4 + "/cart/timer/")
          .headers(headers_0)
      )
      .pause(3)
      .exec(
        http("request_1")
          .post("/collect")
          .headers(headers_1)
          .body(RawFileBody("wwfrete/0001_request.bin"))
      )
      .pause(2)
      .exec(
        http("request_2")
          .get(uri3 + "/?id=281647856020305&ev=SubscribedButtonClick&dl=https%3A%2F%2Fwww.westwing.com.br%2Fdecoracao%2Ftapetes%2Ftapete-europa-chumbo-i-150x200cm%2F6516454%3Fc%3Desses-tapetes-tem-estilo%26sku%3DOA935WWFJO4MBR%26page%3Dpdp&rl=https%3A%2F%2Fwww.westwing.com.br%2Fesses-tapetes-tem-estilo%2F&if=false&ts=1654137407048&cd[buttonFeatures]=%7B%22classList%22%3A%22ui-btn%20ww-w-modal--shipping-info-delivery-period__button%22%2C%22destination%22%3A%22https%3A%2F%2Fwww.westwing.com.br%2Fdecoracao%2Ftapetes%2Ftapete-europa-chumbo-i-150x200cm%2F6516454%3Fc%3Desses-tapetes-tem-estilo%26sku%3DOA935WWFJO4MBR%26page%3Dpdp%22%2C%22id%22%3A%22postcodeButtonPDP%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22Calcular%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22button%22%2C%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D&cd[buttonText]=Calcular&cd[formFeatures]=%5B%7B%22id%22%3A%22%22%2C%22name%22%3A%22sku%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22hidden%22%7D%2C%7B%22id%22%3A%22cep-input%22%2C%22name%22%3A%22postcode%22%2C%22tag%22%3A%22input%22%2C%22placeholder%22%3A%22CEP%22%2C%22inputType%22%3A%22tel%22%7D%5D&cd[pageFeatures]=%7B%22title%22%3A%22%5Cn%20%20%20%20Tapete%20Europa%20Chumbo%20I%20-%20150X200cm%20%7C%20Westwing.com.br%22%7D&cd[parameters]=%5B%5D&sw=1280&sh=720&v=2.9.61&r=stable&ec=4&o=2110&fbp=fb.2.1654136041322.539823490&it=1654137383411&coo=false&es=automatic&tm=3&rqm=GET")
          .headers(headers_2)
          .resources(
            http("request_3")
              .get(uri4 + "/ajax/calculateProductDelivery/?sku=OA935WWFJO4MBR-1&postcode=07929-000")
              .headers(headers_3)
          )
      )
      .pause(5)
      .exec(
        http("request_4")
          .post("/collect")
          .headers(headers_1)
          .body(RawFileBody("wwfrete/0004_request.bin"))
      )
      .pause(13)
      .exec(
        http("request_5")
          .post("/collect")
          .headers(headers_1)
          .body(RawFileBody("wwfrete/0005_request.bin"))
      )
      .pause(2)
      .exec(
        http("request_6")
          .get(uri3 + "/?id=281647856020305&ev=SubscribedButtonClick&dl=https%3A%2F%2Fwww.westwing.com.br%2Fdecoracao%2Ftapetes%2Ftapete-europa-chumbo-i-150x200cm%2F6516454%3Fc%3Desses-tapetes-tem-estilo%26sku%3DOA935WWFJO4MBR%26page%3Dpdp&rl=https%3A%2F%2Fwww.westwing.com.br%2Fesses-tapetes-tem-estilo%2F&if=false&ts=1654137428632&cd[buttonFeatures]=%7B%22classList%22%3A%22ui-btn%20ww-w-modal--shipping-info-delivery-period__button%22%2C%22destination%22%3A%22https%3A%2F%2Fwww.westwing.com.br%2Fdecoracao%2Ftapetes%2Ftapete-europa-chumbo-i-150x200cm%2F6516454%3Fc%3Desses-tapetes-tem-estilo%26sku%3DOA935WWFJO4MBR%26page%3Dpdp%22%2C%22id%22%3A%22postcodeButtonPDP%22%2C%22imageUrl%22%3A%22%22%2C%22innerText%22%3A%22Calcular%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22button%22%2C%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D&cd[buttonText]=Calcular&cd[formFeatures]=%5B%7B%22id%22%3A%22%22%2C%22name%22%3A%22sku%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22hidden%22%7D%2C%7B%22id%22%3A%22cep-input%22%2C%22name%22%3A%22postcode%22%2C%22tag%22%3A%22input%22%2C%22placeholder%22%3A%22CEP%22%2C%22inputType%22%3A%22tel%22%7D%5D&cd[pageFeatures]=%7B%22title%22%3A%22%5Cn%20%20%20%20Tapete%20Europa%20Chumbo%20I%20-%20150X200cm%20%7C%20Westwing.com.br%22%7D&cd[parameters]=%5B%5D&sw=1280&sh=720&v=2.9.61&r=stable&ec=5&o=2110&fbp=fb.2.1654136041322.539823490&it=1654137383411&coo=false&es=automatic&tm=3&rqm=GET")
          .headers(headers_2)
          .resources(
            http("request_7")
              .get(uri4 + "/ajax/calculateProductDelivery/?sku=OA935WWFJO4MBR-1&postcode=70070-080")
              .headers(headers_3)
          )
      )
      .pause(7)
      .exec(
        http("request_8")
          .post("/collect")
          .headers(headers_1)
          .body(RawFileBody("wwfrete/0008_request.bin"))
      )
      .pause(8)
      .exec(
        http("request_9")
          .post(uri2 + "/events/1/57cc0f7484?a=70835513&v=1216.487a282&to=ZwEBMBdYWUsDUEUMXV5LIBEWTVhVTVBQEVNcCwRLAVxDWQtf&rst=62962&ck=1&ref=https://www.westwing.com.br/decoracao/tapetes/tapete-europa-chumbo-i-150x200cm/6516454")
          .headers(headers_9)
          .body(RawFileBody("wwfrete/0009_request.gif"))
          .resources(
            http("request_10")
              .post(uri2 + "/jserrors/1/57cc0f7484?a=70835513&v=1216.487a282&to=ZwEBMBdYWUsDUEUMXV5LIBEWTVhVTVBQEVNcCwRLAVxDWQtf&rst=62956&ck=1&ref=https://www.westwing.com.br/decoracao/tapetes/tapete-europa-chumbo-i-150x200cm/6516454")
              .headers(headers_9)
              .body(RawFileBody("wwfrete/0010_request.gif"))
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(50000))).protocols(httpProtocol);
  }
}
