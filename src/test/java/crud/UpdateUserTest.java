package crud;

import Pojo.UserPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes Atualizar Usuário")
public class UpdateUserTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    @DisplayName("Atualizar usuário com sucesso")
    public void testUpdateUserSuccess() {
        UserPojo userPojo = new UserPojo("Juarez atualizado", "Qa Analyst na Salsa Igaming");

        Response response = RestAssured.given()
                .contentType("application/json")
                .body(userPojo)
                .when()
                .put("/users/4")
                .then()
                .statusCode(200)
                .body("name", Matchers.equalTo(userPojo.getName()))
                .body("job", Matchers.equalTo(userPojo.getJob()))
                .extract()
                .response();

        System.out.println("Usuário atualizado com sucesso!");

        System.out.println(response.asString());
    }
}
