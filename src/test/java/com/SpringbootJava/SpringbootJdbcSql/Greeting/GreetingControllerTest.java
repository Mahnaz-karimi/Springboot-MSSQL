package com.SpringbootJava.SpringbootJdbcSql.Greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    @Test
    void greeting() {
        GreetingController controller = new GreetingController(); // Arrange
        Greeting response = controller.greeting("World"); // Act
        assertEquals("Hello, World!" , response.getContent());

    }
}