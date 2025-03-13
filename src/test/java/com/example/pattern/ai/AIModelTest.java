package com.example.pattern.ai;

import com.example.pattern.ai.model.AIModel;
import com.example.pattern.ai.model.AnomalyDetectModel;
import com.example.pattern.ai.model.ObjectDetectModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for AIModel implementations.
 */
public class AIModelTest {
    @Test
    void testAnomalyDetectModel() {
        AIModel model = new AnomalyDetectModel();
        assertTrue(model.analyze());
    }

    @Test
    void testObjectDetectModel() {
        AIModel model = new ObjectDetectModel();
        assertTrue(model.analyze());
    }
}
