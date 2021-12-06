package utility.extensionsTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(RestAssuredExtension.class)
public class RestAssuredIntegrationTest {
    @Test
    void executesGetAsExternallyConfigured() {
        System.out.println(RestAssured.given().get("/gen/clients/android").then().log().ifStatusCodeIsEqualTo(200));;
    }
}
