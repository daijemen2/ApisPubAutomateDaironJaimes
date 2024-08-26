package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import java.io.File;

import static io.restassured.RestAssured.given;

public class CreateObject {



    @Test
    public void testApiRequestAuthLevel() {

        File postBody = new File("src/main/resources/createObject.json");
        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .header("Content-Type","application/json")
                .body(postBody);

    Response response = request
            .when()
            .post();
    response.prettyPrint();
    int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);

    }
}

