package br.com.msscsh.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PublicResourceTest {

    @Test
    public void testPublicEndpoint() {
        given()
          .when().get("/public")
          .then()
             .statusCode(200)
             .body(is("Hello from public"));
    }

}