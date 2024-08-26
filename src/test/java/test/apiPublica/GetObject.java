package test.apiPublica;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class GetObject {

    @Test
    public void testApiRequestAuthLevel() {

        File postBody = new File("src/main/resources/getObject.json");


        // Configurar la solicitud
        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects");

        // Realizar la solicitud GET para obtener todos los objetos
        Response response = request
                .when()
                .get();

        // Imprimir la respuesta
        response.prettyPrint();

        // Verificar el código de estado de la respuesta
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200, "Verificar que la respuesta tiene un código de estado 200");

        // Verificar que la respuesta contiene una lista de objetos
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0, "Verificar que la lista de objetos no está vacía");
    }
}