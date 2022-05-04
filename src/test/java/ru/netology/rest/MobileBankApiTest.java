package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTest {
    @Test
    void shouldReturnTestBody() {
// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/17)"))
        ;
    }
}
