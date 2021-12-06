package test.extensionsTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class RestAssuredExtension implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println(".......!........!BeforeAllExtension.............!..........");

        RestAssured.baseURI = "https://generator.swagger.io/";
        RestAssured.basePath = "api/";
        RestAssured.given().contentType("ContentType.JSON");

    }
}
