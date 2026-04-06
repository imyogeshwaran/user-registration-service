package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controller.class)
@ContextConfiguration(classes = App.class) // This tells the test where the config is
public class AppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testInvalidInput() throws Exception {
        // This sends empty JSON to trigger a 400 Bad Request
        mockMvc.perform(post("/register")
                .contentType("application/json")
                .content("{}"))
                .andExpect(status().isBadRequest());
    }
}
