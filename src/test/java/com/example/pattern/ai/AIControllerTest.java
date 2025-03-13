package com.example.pattern.ai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Integration tests for AIModelController using MockMvc.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class AIControllerTest {
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void testProcessAnomalyModel() throws Exception{
        // Test API call for processing an Anomaly model
        mockMvc.perform(post("/models/v1/analyze")
                .param("type", "ANOMALY"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true));
    }

    @Test
    void testProcessObjectModel() throws Exception{
        // Test API call for processing an Object Detection model
        mockMvc.perform(post("/models/v1/analyze")
                        .param("type", "OBJECT"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true));
    }

    @Test
    void testProcessInvalidModel() throws Exception {
        // Test API call with an invalid model type
        mockMvc.perform(post("/models/v1/analyze")
                        .param("type", "INVALID"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(false));
    }
}
