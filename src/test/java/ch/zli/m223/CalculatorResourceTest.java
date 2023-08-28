package ch.zli.m223;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {
    
    @Test
    public void testCalculatorEndpoint() {
        given()
        .when().get("/calculator/add/{summand1}/{summand2}", 2, 3)
        .then()
        .statusCode(200)
        .body(is("5"));
    }
}
