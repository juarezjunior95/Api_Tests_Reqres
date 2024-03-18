package crud;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes Criar um novo Usuário")
public class GetSingleUserTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    @DisplayName("Obter usuário por ID com sucesso")
    public void testGetUserByIdSuccess() {
        // Exibir mensagem de log
        System.out.println("Enviando solicitação GET para obter dados do usuário por ID...");

        Response response = RestAssured.given()
                .when()
                .get("/users/2")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("Usuário obtido com sucesso!");

        System.out.println(response.asString());

        Assertions.assertEquals(2, response.jsonPath().getInt("data.id"), "O ID do usuário obtido corresponde ao esperado");

        Assertions.assertEquals("janet.weaver@reqres.in", response.jsonPath().getString("data.email"), "O email do usuário obtido  corresponde ao esperado");
    }
}