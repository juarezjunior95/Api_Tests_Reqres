package crud;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes Registrar um novo Usuário")
public class RegisterUserSucessfulTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    @DisplayName("Obter dados do usuário")
    public void testGetUser() {
        Response response = RestAssured.given()
                .when()
                .get("/users/4");

        if (response.statusCode() == 200) {
            System.out.println(response.getBody().asString());
        } else {
            Assertions.fail("Usuário não encontrado.");
        }
    }
}