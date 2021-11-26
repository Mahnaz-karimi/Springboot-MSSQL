package com.SpringbootJava.SpringbootJdbcSql.Greeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest(GreetingController.class)
class GreetingControllerApiTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void greeting() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("");
        MvcResult result = mvc.perform(request).andReturn();
        System.out.println("resulllt is:"+result.getResponse().getContentAsString());
        assertEquals("Hello, World!", result.getResponse().getContentAsString());
    }
}