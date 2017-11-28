package com.rjtest.restservice;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

/**
 * Created by eshcherbanova on 11/22/17.
 */
public class DogsRestTest extends BaseTest {

    @Test
    public void basicPingTest() {
        given().when().get("/dogs").then().statusCode(200);
    }

    @Test
    public void verifyNameOfDog() {
        given().when().get("/dogs").then()
            .body(containsString("Labrador"));
    }

    @Test
    public void verifyNameStructured() {
        given().when().get("/dogs").then()
            .body("name",equalTo("Labrador"));
    }
}
