package crud;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes Excluir Usuário")
public class DeleteUserTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    @DisplayName("Excluir usuário com sucesso")
    public void testDeleteUserSuccess() {
        // Enviar solicitação DELETE para excluir usuário e verificar a resposta
        Response response = RestAssured.given()
                .when()
                .delete("/users/4")
                .then()
                .statusCode(204)
                .extract()
                .response();
        int statusCode = response.getStatusCode();
        if (statusCode != 204) {
            Assertions.fail("Falha ao excluir o usuário. Status code: " + statusCode);
        }

        // Exibir mensagem de log
        System.out.println("Usuário excluído com sucesso!");
    }
}

