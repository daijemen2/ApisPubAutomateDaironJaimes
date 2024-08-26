package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetWithUrlPrams {

    @Test
    public void testWithParams1() {

        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .formParam("id", "1")
                .formParam("id", "2");



        Response response = request
                .when()
                .get();
        response.prettyPrint();
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test
    public void testWithParams2() {

        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .formParam("id", 1,2);




        Response response = request
                .when()
                .get();
        response.prettyPrint();
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);

    }
}
