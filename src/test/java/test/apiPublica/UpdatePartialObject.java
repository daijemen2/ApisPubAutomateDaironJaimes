package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class UpdatePartialObject {

    @Test
    public void testApiRequestAuthLevel() {

        File postBody = new File("src/main/resources/patchObject.json");
        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .header("Content-Type","application/json")
                .body(postBody);

        Response response = request
                .when()
                .put("/ff80818190966d7f0190a2d93f34200c");
        response.prettyPrint();
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);

    }
}
