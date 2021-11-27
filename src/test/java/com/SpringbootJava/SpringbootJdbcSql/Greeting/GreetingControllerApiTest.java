package com.SpringbootJava.SpringbootJdbcSql.Greeting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class GreetingControllerApiTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void greetingWithName() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/?name=User");
        MvcResult result = mvc.perform(request).andReturn();
        System.out.println("result is:"+result.getResponse().getContentAsString().split("\"")[5]);
        assertEquals("Hello, User!", result.getResponse().getContentAsString().split("\"")[5]);

    }
    @Test
    void greeting() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        System.out.println("result is:"+result.getResponse().getContentAsString().split("\"")[5]);
        assertEquals("Hello, World!", result.getResponse().getContentAsString().split("\"")[5]);

    }
}