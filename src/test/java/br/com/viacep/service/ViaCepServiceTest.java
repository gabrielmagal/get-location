package br.com.viacep.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class ViaCepServiceTest {

    @Test
    void getValidAddress() {
        given()
            .pathParam("cep", "25710110")
            .when()
            .get("/consulta/{cep}")
            .then()
            .statusCode(200);
    }

    @Test
    void getNotFoundAddress() {
        given()
                .pathParam("cep", "00000000")
                .when()
                .get("/consulta/{cep}")
                .then()
                .statusCode(200)
                .body(is("Não encontrado"));
    }

    @Test
    void getInvalidAddress() {
        given()
                .pathParam("cep", "0")
                .when()
                .get("/consulta/{cep}")
                .then()
                .statusCode(400);
    }

}
