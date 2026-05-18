package com.example.demowithdocker;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHello() throws Exception {
        mockMvc.perform(get("/api/hello"))   // ✅ FIXED HERE
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from AI CI/CD Pipeline!"));
    }
}