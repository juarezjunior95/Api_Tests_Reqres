package crud;

import Pojo.UserPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes Criar um novo Usuário")
public class CreateUserTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    @DisplayName("Criar usuário com sucesso")
    public void testCreateUserSuccess() {
        UserPojo userPojo = new UserPojo("Juarez", "Qa na Salsa Igaming");

        Response response = RestAssured.given()
                .contentType("application/json")
                .body(userPojo)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", Matchers.equalTo(userPojo.getName()))
                .body("job", Matchers.equalTo(userPojo.getJob()))
                .extract()
                .response();        // Verificar status code
        int statusCode = response.getStatusCode();
        if (statusCode != 201) {
            Assertions.fail("Status code diferente de 201. Status code atual: " + statusCode);
        }

        System.out.println("Usuário cadastrado com sucesso!");

        System.out.println(response.asString());
    }
}